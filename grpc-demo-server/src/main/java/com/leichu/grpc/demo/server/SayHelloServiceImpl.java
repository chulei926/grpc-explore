package com.leichu.grpc.demo.server;

import com.leichu.grpc.demo.help.HelloReply;
import com.leichu.grpc.demo.help.HelloRequest;
import com.leichu.grpc.demo.help.SayHelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SayHelloServiceImpl extends SayHelloServiceGrpc.SayHelloServiceImplBase {

	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		HelloReply build = HelloReply.newBuilder().
				setMessage("Server Reply: Hello " + request.getName())
				.build();
		responseObserver.onNext(build);
		responseObserver.onCompleted();
	}
}
