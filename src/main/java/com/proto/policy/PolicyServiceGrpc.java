package com.proto.policy;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: policy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "introspect.swapnil.insurance.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.policy.Policy,
      com.proto.policy.Policy> getUpdatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePolicy",
      requestType = com.proto.policy.Policy.class,
      responseType = com.proto.policy.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.policy.Policy,
      com.proto.policy.Policy> getUpdatePolicyMethod() {
    io.grpc.MethodDescriptor<com.proto.policy.Policy, com.proto.policy.Policy> getUpdatePolicyMethod;
    if ((getUpdatePolicyMethod = PolicyServiceGrpc.getUpdatePolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getUpdatePolicyMethod = PolicyServiceGrpc.getUpdatePolicyMethod) == null) {
          PolicyServiceGrpc.getUpdatePolicyMethod = getUpdatePolicyMethod =
              io.grpc.MethodDescriptor.<com.proto.policy.Policy, com.proto.policy.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("UpdatePolicy"))
              .build();
        }
      }
    }
    return getUpdatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.policy.PolicyId,
      com.proto.policy.Policy> getDeletePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicy",
      requestType = com.proto.policy.PolicyId.class,
      responseType = com.proto.policy.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.policy.PolicyId,
      com.proto.policy.Policy> getDeletePolicyMethod() {
    io.grpc.MethodDescriptor<com.proto.policy.PolicyId, com.proto.policy.Policy> getDeletePolicyMethod;
    if ((getDeletePolicyMethod = PolicyServiceGrpc.getDeletePolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getDeletePolicyMethod = PolicyServiceGrpc.getDeletePolicyMethod) == null) {
          PolicyServiceGrpc.getDeletePolicyMethod = getDeletePolicyMethod =
              io.grpc.MethodDescriptor.<com.proto.policy.PolicyId, com.proto.policy.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.PolicyId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("DeletePolicy"))
              .build();
        }
      }
    }
    return getDeletePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.policy.PolicyId,
      com.proto.policy.Policy> getGetPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicies",
      requestType = com.proto.policy.PolicyId.class,
      responseType = com.proto.policy.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.policy.PolicyId,
      com.proto.policy.Policy> getGetPoliciesMethod() {
    io.grpc.MethodDescriptor<com.proto.policy.PolicyId, com.proto.policy.Policy> getGetPoliciesMethod;
    if ((getGetPoliciesMethod = PolicyServiceGrpc.getGetPoliciesMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetPoliciesMethod = PolicyServiceGrpc.getGetPoliciesMethod) == null) {
          PolicyServiceGrpc.getGetPoliciesMethod = getGetPoliciesMethod =
              io.grpc.MethodDescriptor.<com.proto.policy.PolicyId, com.proto.policy.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.PolicyId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.policy.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("GetPolicies"))
              .build();
        }
      }
    }
    return getGetPoliciesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub>() {
//        @java.lang.Override
        public PolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceStub(channel, callOptions);
        }
      };
    return PolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub>() {
//        @java.lang.Override
        public PolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return PolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub>() {
//        @java.lang.Override
        public PolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceFutureStub(channel, callOptions);
        }
      };
    return PolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary call.
     * Updates a Policy based on incoming request
     * and returns the updated Policy.
     * </pre>
     */
    public void updatePolicy(com.proto.policy.Policy request,
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary call.
     * Deletes a Policy based on incoming PolicyId.
     * </pre>
     */
    public void deletePolicy(com.proto.policy.PolicyId request,
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi-Directional call.
     * Returns Policies based on the incoming PolicyIds.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.policy.PolicyId> getPolicies(
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetPoliciesMethod(), responseObserver);
    }

//    @java.lang.Override 
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdatePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.policy.Policy,
                com.proto.policy.Policy>(
                  this, METHODID_UPDATE_POLICY)))
          .addMethod(
            getDeletePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.policy.PolicyId,
                com.proto.policy.Policy>(
                  this, METHODID_DELETE_POLICY)))
          .addMethod(
            getGetPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.policy.PolicyId,
                com.proto.policy.Policy>(
                  this, METHODID_GET_POLICIES)))
          .build();
    }
  }

  /**
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<PolicyServiceStub> {
    private PolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call.
     * Updates a Policy based on incoming request
     * and returns the updated Policy.
     * </pre>
     */
    public void updatePolicy(com.proto.policy.Policy request,
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary call.
     * Deletes a Policy based on incoming PolicyId.
     * </pre>
     */
    public void deletePolicy(com.proto.policy.PolicyId request,
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bi-Directional call.
     * Returns Policies based on the incoming PolicyIds.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.policy.PolicyId> getPolicies(
        io.grpc.stub.StreamObserver<com.proto.policy.Policy> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetPoliciesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call.
     * Updates a Policy based on incoming request
     * and returns the updated Policy.
     * </pre>
     */
    public com.proto.policy.Policy updatePolicy(com.proto.policy.Policy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary call.
     * Deletes a Policy based on incoming PolicyId.
     * </pre>
     */
    public com.proto.policy.Policy deletePolicy(com.proto.policy.PolicyId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call.
     * Updates a Policy based on incoming request
     * and returns the updated Policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.policy.Policy> updatePolicy(
        com.proto.policy.Policy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary call.
     * Deletes a Policy based on incoming PolicyId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.policy.Policy> deletePolicy(
        com.proto.policy.PolicyId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_POLICY = 0;
  private static final int METHODID_DELETE_POLICY = 1;
  private static final int METHODID_GET_POLICIES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

//    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_POLICY:
          serviceImpl.updatePolicy((com.proto.policy.Policy) request,
              (io.grpc.stub.StreamObserver<com.proto.policy.Policy>) responseObserver);
          break;
        case METHODID_DELETE_POLICY:
          serviceImpl.deletePolicy((com.proto.policy.PolicyId) request,
              (io.grpc.stub.StreamObserver<com.proto.policy.Policy>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

//    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POLICIES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getPolicies(
              (io.grpc.stub.StreamObserver<com.proto.policy.Policy>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

//    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.policy.PolicyOuterClass.getDescriptor();
    }

//    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

//    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getUpdatePolicyMethod())
              .addMethod(getDeletePolicyMethod())
              .addMethod(getGetPoliciesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
