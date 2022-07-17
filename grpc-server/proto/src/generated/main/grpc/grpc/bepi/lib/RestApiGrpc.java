package grpc.bepi.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Rest와 같은 방식으로 요청할 수 있도록 proto파일을 정의함.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: idl.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RestApiGrpc {

  private RestApiGrpc() {}

  public static final String SERVICE_NAME = "RestApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.bepi.lib.Empty,
      grpc.bepi.lib.GResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = grpc.bepi.lib.Empty.class,
      responseType = grpc.bepi.lib.GResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.bepi.lib.Empty,
      grpc.bepi.lib.GResponse> getPingMethod() {
    io.grpc.MethodDescriptor<grpc.bepi.lib.Empty, grpc.bepi.lib.GResponse> getPingMethod;
    if ((getPingMethod = RestApiGrpc.getPingMethod) == null) {
      synchronized (RestApiGrpc.class) {
        if ((getPingMethod = RestApiGrpc.getPingMethod) == null) {
          RestApiGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<grpc.bepi.lib.Empty, grpc.bepi.lib.GResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestApiMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = grpc.bepi.lib.GRequest.class,
      responseType = grpc.bepi.lib.GResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getGetMethod() {
    io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse> getGetMethod;
    if ((getGetMethod = RestApiGrpc.getGetMethod) == null) {
      synchronized (RestApiGrpc.class) {
        if ((getGetMethod = RestApiGrpc.getGetMethod) == null) {
          RestApiGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestApiMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "post",
      requestType = grpc.bepi.lib.GRequest.class,
      responseType = grpc.bepi.lib.GResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getPostMethod() {
    io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse> getPostMethod;
    if ((getPostMethod = RestApiGrpc.getPostMethod) == null) {
      synchronized (RestApiGrpc.class) {
        if ((getPostMethod = RestApiGrpc.getPostMethod) == null) {
          RestApiGrpc.getPostMethod = getPostMethod =
              io.grpc.MethodDescriptor.<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestApiMethodDescriptorSupplier("post"))
              .build();
        }
      }
    }
    return getPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = grpc.bepi.lib.GRequest.class,
      responseType = grpc.bepi.lib.GResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getPutMethod() {
    io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse> getPutMethod;
    if ((getPutMethod = RestApiGrpc.getPutMethod) == null) {
      synchronized (RestApiGrpc.class) {
        if ((getPutMethod = RestApiGrpc.getPutMethod) == null) {
          RestApiGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestApiMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = grpc.bepi.lib.GRequest.class,
      responseType = grpc.bepi.lib.GResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest,
      grpc.bepi.lib.GResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse> getDeleteMethod;
    if ((getDeleteMethod = RestApiGrpc.getDeleteMethod) == null) {
      synchronized (RestApiGrpc.class) {
        if ((getDeleteMethod = RestApiGrpc.getDeleteMethod) == null) {
          RestApiGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<grpc.bepi.lib.GRequest, grpc.bepi.lib.GResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bepi.lib.GResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestApiMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RestApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestApiStub>() {
        @java.lang.Override
        public RestApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestApiStub(channel, callOptions);
        }
      };
    return RestApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RestApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestApiBlockingStub>() {
        @java.lang.Override
        public RestApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestApiBlockingStub(channel, callOptions);
        }
      };
    return RestApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RestApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestApiFutureStub>() {
        @java.lang.Override
        public RestApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestApiFutureStub(channel, callOptions);
        }
      };
    return RestApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Rest와 같은 방식으로 요청할 수 있도록 proto파일을 정의함.
   * </pre>
   */
  public static abstract class RestApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(grpc.bepi.lib.Empty request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void get(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void post(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     */
    public void put(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void delete(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.bepi.lib.Empty,
                grpc.bepi.lib.GResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.bepi.lib.GRequest,
                grpc.bepi.lib.GResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.bepi.lib.GRequest,
                grpc.bepi.lib.GResponse>(
                  this, METHODID_POST)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.bepi.lib.GRequest,
                grpc.bepi.lib.GResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.bepi.lib.GRequest,
                grpc.bepi.lib.GResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Rest와 같은 방식으로 요청할 수 있도록 proto파일을 정의함.
   * </pre>
   */
  public static final class RestApiStub extends io.grpc.stub.AbstractAsyncStub<RestApiStub> {
    private RestApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestApiStub(channel, callOptions);
    }

    /**
     */
    public void ping(grpc.bepi.lib.Empty request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void post(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(grpc.bepi.lib.GRequest request,
        io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Rest와 같은 방식으로 요청할 수 있도록 proto파일을 정의함.
   * </pre>
   */
  public static final class RestApiBlockingStub extends io.grpc.stub.AbstractBlockingStub<RestApiBlockingStub> {
    private RestApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.bepi.lib.GResponse ping(grpc.bepi.lib.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.bepi.lib.GResponse get(grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.bepi.lib.GResponse post(grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.bepi.lib.GResponse put(grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.bepi.lib.GResponse delete(grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Rest와 같은 방식으로 요청할 수 있도록 proto파일을 정의함.
   * </pre>
   */
  public static final class RestApiFutureStub extends io.grpc.stub.AbstractFutureStub<RestApiFutureStub> {
    private RestApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.bepi.lib.GResponse> ping(
        grpc.bepi.lib.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.bepi.lib.GResponse> get(
        grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.bepi.lib.GResponse> post(
        grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.bepi.lib.GResponse> put(
        grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.bepi.lib.GResponse> delete(
        grpc.bepi.lib.GRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_POST = 2;
  private static final int METHODID_PUT = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RestApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RestApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((grpc.bepi.lib.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((grpc.bepi.lib.GRequest) request,
              (io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse>) responseObserver);
          break;
        case METHODID_POST:
          serviceImpl.post((grpc.bepi.lib.GRequest) request,
              (io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((grpc.bepi.lib.GRequest) request,
              (io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((grpc.bepi.lib.GRequest) request,
              (io.grpc.stub.StreamObserver<grpc.bepi.lib.GResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RestApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RestApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.bepi.lib.GrpcRestApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RestApi");
    }
  }

  private static final class RestApiFileDescriptorSupplier
      extends RestApiBaseDescriptorSupplier {
    RestApiFileDescriptorSupplier() {}
  }

  private static final class RestApiMethodDescriptorSupplier
      extends RestApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RestApiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RestApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RestApiFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetMethod())
              .addMethod(getPostMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
