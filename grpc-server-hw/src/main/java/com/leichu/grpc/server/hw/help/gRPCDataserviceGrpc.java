package com.leichu.grpc.server.hw.help;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *服务名称为gRPCDataservice。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: huawei-grpc-dialout.proto")
public final class gRPCDataserviceGrpc {

  private gRPCDataserviceGrpc() {}

  public static final String SERVICE_NAME = "gRPCDataservice";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.leichu.grpc.server.hw.help.serviceArgs,
      com.leichu.grpc.server.hw.help.serviceArgs> METHOD_DATA_PUBLISH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "gRPCDataservice", "dataPublish"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.leichu.grpc.server.hw.help.serviceArgs.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.leichu.grpc.server.hw.help.serviceArgs.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gRPCDataserviceStub newStub(io.grpc.Channel channel) {
    return new gRPCDataserviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gRPCDataserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gRPCDataserviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static gRPCDataserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gRPCDataserviceFutureStub(channel);
  }

  /**
   * <pre>
   *服务名称为gRPCDataservice。
   * </pre>
   */
  public static abstract class gRPCDataserviceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.leichu.grpc.server.hw.help.serviceArgs> dataPublish(
        io.grpc.stub.StreamObserver<com.leichu.grpc.server.hw.help.serviceArgs> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_DATA_PUBLISH, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DATA_PUBLISH,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.leichu.grpc.server.hw.help.serviceArgs,
                com.leichu.grpc.server.hw.help.serviceArgs>(
                  this, METHODID_DATA_PUBLISH)))
          .build();
    }
  }

  /**
   * <pre>
   *服务名称为gRPCDataservice。
   * </pre>
   */
  public static final class gRPCDataserviceStub extends io.grpc.stub.AbstractStub<gRPCDataserviceStub> {
    private gRPCDataserviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCDataserviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCDataserviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCDataserviceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.leichu.grpc.server.hw.help.serviceArgs> dataPublish(
        io.grpc.stub.StreamObserver<com.leichu.grpc.server.hw.help.serviceArgs> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_DATA_PUBLISH, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *服务名称为gRPCDataservice。
   * </pre>
   */
  public static final class gRPCDataserviceBlockingStub extends io.grpc.stub.AbstractStub<gRPCDataserviceBlockingStub> {
    private gRPCDataserviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCDataserviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCDataserviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCDataserviceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *服务名称为gRPCDataservice。
   * </pre>
   */
  public static final class gRPCDataserviceFutureStub extends io.grpc.stub.AbstractStub<gRPCDataserviceFutureStub> {
    private gRPCDataserviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCDataserviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCDataserviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCDataserviceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DATA_PUBLISH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gRPCDataserviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gRPCDataserviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DATA_PUBLISH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dataPublish(
              (io.grpc.stub.StreamObserver<com.leichu.grpc.server.hw.help.serviceArgs>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class gRPCDataserviceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.leichu.grpc.server.hw.help.HuaweiGrpcDialout.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (gRPCDataserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gRPCDataserviceDescriptorSupplier())
              .addMethod(METHOD_DATA_PUBLISH)
              .build();
        }
      }
    }
    return result;
  }
}
