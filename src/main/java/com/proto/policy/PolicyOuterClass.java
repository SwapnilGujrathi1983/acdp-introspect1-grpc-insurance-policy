// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy.proto

package com.proto.policy;

public final class PolicyOuterClass {
  private PolicyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_introspect_swapnil_insurance_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_introspect_swapnil_insurance_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_introspect_swapnil_insurance_PolicyId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_introspect_swapnil_insurance_PolicyId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014policy.proto\022\034introspect.swapnil.insur" +
      "ance\"T\n\006Policy\022\n\n\002id\030\001 \001(\005\022\014\n\004type\030\002 \001(\t" +
      "\022\016\n\006status\030\003 \001(\t\022\020\n\010custName\030\004 \001(\t\022\016\n\006cu" +
      "stId\030\005 \001(\005\"\026\n\010PolicyId\022\n\n\002id\030\001 \001(\0052\260\002\n\rP" +
      "olicyService\022\\\n\014UpdatePolicy\022$.introspec" +
      "t.swapnil.insurance.Policy\032$.introspect." +
      "swapnil.insurance.Policy\"\000\022^\n\014DeletePoli" +
      "cy\022&.introspect.swapnil.insurance.Policy" +
      "Id\032$.introspect.swapnil.insurance.Policy" +
      "\"\000\022a\n\013GetPolicies\022&.introspect.swapnil.i" +
      "nsurance.PolicyId\032$.introspect.swapnil.i" +
      "nsurance.Policy\"\000(\0010\001B\024\n\020com.proto.polic" +
      "yP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_introspect_swapnil_insurance_Policy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_introspect_swapnil_insurance_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_introspect_swapnil_insurance_Policy_descriptor,
        new java.lang.String[] { "Id", "Type", "Status", "CustName", "CustId", });
    internal_static_introspect_swapnil_insurance_PolicyId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_introspect_swapnil_insurance_PolicyId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_introspect_swapnil_insurance_PolicyId_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
