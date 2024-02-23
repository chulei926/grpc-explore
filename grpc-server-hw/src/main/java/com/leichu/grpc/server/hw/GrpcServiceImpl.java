package com.leichu.grpc.server.hw;

import com.google.protobuf.ByteString;
import com.leichu.grpc.server.hw.help.Telemetry;
import com.leichu.grpc.server.hw.help.gRPCDataserviceGrpc;
import com.leichu.grpc.server.hw.help.serviceArgs;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class GrpcServiceImpl extends gRPCDataserviceGrpc.gRPCDataserviceImplBase {

	private static final Logger logger = LoggerFactory.getLogger(GrpcServiceImpl.class);

	@Override
	public StreamObserver<serviceArgs> dataPublish(StreamObserver<serviceArgs> responseObserver) {
		return new StreamObserver<serviceArgs>() {
			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}

			@Override
			public void onError(Throwable arg0) {
				logger.error("dataPublish cancelled :" + arg0 + "; message:" + arg0.getMessage());
			}

			@Override
			public void onNext(serviceArgs serArgs) {
				//在onNext方法中，进行解码操作；具体解码通过TelemetryData类实现。
				try {
					ByteString byteString = serArgs.getData();
					Telemetry telemetry = Telemetry.parseFrom(byteString.toByteArray());
					logger.info("Telemetry:{}", telemetry);
				} catch (Exception e) {
					logger.error("dataPublish onNext error!", e);
				}
			}
		};
	}
}
