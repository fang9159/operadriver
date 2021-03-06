// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: http_logger.proto

package com.opera.core.systems.scope.protos;

public final class HttpLoggerProtos {
  private HttpLoggerProtos() {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public static final class Header extends com.google.protobuf.GeneratedMessage {
    // Use Header.newBuilder() to construct.
    private Header() {
      initFields();
    }

    private Header(boolean noInit) {
    }

    private static final Header defaultInstance;

    public static Header getDefaultInstance() {
      return defaultInstance;
    }

    public Header getDefaultInstanceForType() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.opera.core.systems.scope.protos.HttpLoggerProtos.internal_static_scope_Header_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.opera.core.systems.scope.protos.HttpLoggerProtos.internal_static_scope_Header_fieldAccessorTable;
    }

    // required uint32 requestID = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestID;
    private int requestID_ = 0;

    public boolean hasRequestID() {
      return hasRequestID;
    }

    public int getRequestID() {
      return requestID_;
    }

    // required uint32 windowID = 2;
    public static final int WINDOWID_FIELD_NUMBER = 2;
    private boolean hasWindowID;
    private int windowID_ = 0;

    public boolean hasWindowID() {
      return hasWindowID;
    }

    public int getWindowID() {
      return windowID_;
    }

    // required string time = 3;
    public static final int TIME_FIELD_NUMBER = 3;
    private boolean hasTime;
    private java.lang.String time_ = "";

    public boolean hasTime() {
      return hasTime;
    }

    public java.lang.String getTime() {
      return time_;
    }

    // required string header = 4;
    public static final int HEADER_FIELD_NUMBER = 4;
    private boolean hasHeader;
    private java.lang.String header_ = "";

    public boolean hasHeader() {
      return hasHeader;
    }

    public java.lang.String getHeader() {
      return header_;
    }

    private void initFields() {
    }

    public final boolean isInitialized() {
      if (!hasRequestID) return false;
      if (!hasWindowID) return false;
      if (!hasTime) return false;
      if (!hasHeader) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
      getSerializedSize();
      if (hasRequestID()) {
        output.writeUInt32(1, getRequestID());
      }
      if (hasWindowID()) {
        output.writeUInt32(2, getWindowID());
      }
      if (hasTime()) {
        output.writeString(3, getTime());
      }
      if (hasHeader()) {
        output.writeString(4, getHeader());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasRequestID()) {
        size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1,
            getRequestID());
      }
      if (hasWindowID()) {
        size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2,
            getWindowID());
      }
      if (hasTime()) {
        size += com.google.protobuf.CodedOutputStream.computeStringSize(3,
            getTime());
      }
      if (hasHeader()) {
        size += com.google.protobuf.CodedOutputStream.computeStringSize(4,
            getHeader());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }

    public static com.opera.core.systems.scope.protos.HttpLoggerProtos.Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.opera.core.systems.scope.protos.HttpLoggerProtos.Header prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.opera.core.systems.scope.protos.HttpLoggerProtos.Header result;

      // Construct using
      // com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.newBuilder()
      private Builder() {
      }

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.opera.core.systems.scope.protos.HttpLoggerProtos.Header();
        return builder;
      }

      protected com.opera.core.systems.scope.protos.HttpLoggerProtos.Header internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException("Cannot call clear() after build().");
        }
        result = new com.opera.core.systems.scope.protos.HttpLoggerProtos.Header();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.getDescriptor();
      }

      public com.opera.core.systems.scope.protos.HttpLoggerProtos.Header getDefaultInstanceForType() {
        return com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }

      public com.opera.core.systems.scope.protos.HttpLoggerProtos.Header build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.opera.core.systems.scope.protos.HttpLoggerProtos.Header buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.opera.core.systems.scope.protos.HttpLoggerProtos.Header buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
              "build() has already been called on this Builder.");
        }
        com.opera.core.systems.scope.protos.HttpLoggerProtos.Header returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.opera.core.systems.scope.protos.HttpLoggerProtos.Header) {
          return mergeFrom((com.opera.core.systems.scope.protos.HttpLoggerProtos.Header) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          com.opera.core.systems.scope.protos.HttpLoggerProtos.Header other) {
        if (other == com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.getDefaultInstance()) return this;
        if (other.hasRequestID()) {
          setRequestID(other.getRequestID());
        }
        if (other.hasWindowID()) {
          setWindowID(other.getWindowID());
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (other.hasHeader()) {
          setHeader(other.getHeader());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder(this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              return this;
            }
            break;
          }
          case 8: {
            setRequestID(input.readUInt32());
            break;
          }
          case 16: {
            setWindowID(input.readUInt32());
            break;
          }
          case 26: {
            setTime(input.readString());
            break;
          }
          case 34: {
            setHeader(input.readString());
            break;
          }
          }
        }
      }

      // required uint32 requestID = 1;
      public boolean hasRequestID() {
        return result.hasRequestID();
      }

      public int getRequestID() {
        return result.getRequestID();
      }

      public Builder setRequestID(int value) {
        result.hasRequestID = true;
        result.requestID_ = value;
        return this;
      }

      public Builder clearRequestID() {
        result.hasRequestID = false;
        result.requestID_ = 0;
        return this;
      }

      // required uint32 windowID = 2;
      public boolean hasWindowID() {
        return result.hasWindowID();
      }

      public int getWindowID() {
        return result.getWindowID();
      }

      public Builder setWindowID(int value) {
        result.hasWindowID = true;
        result.windowID_ = value;
        return this;
      }

      public Builder clearWindowID() {
        result.hasWindowID = false;
        result.windowID_ = 0;
        return this;
      }

      // required string time = 3;
      public boolean hasTime() {
        return result.hasTime();
      }

      public java.lang.String getTime() {
        return result.getTime();
      }

      public Builder setTime(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasTime = true;
        result.time_ = value;
        return this;
      }

      public Builder clearTime() {
        result.hasTime = false;
        result.time_ = getDefaultInstance().getTime();
        return this;
      }

      // required string header = 4;
      public boolean hasHeader() {
        return result.hasHeader();
      }

      public java.lang.String getHeader() {
        return result.getHeader();
      }

      public Builder setHeader(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasHeader = true;
        result.header_ = value;
        return this;
      }

      public Builder clearHeader() {
        result.hasHeader = false;
        result.header_ = getDefaultInstance().getHeader();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:scope.Header)
    }

    static {
      defaultInstance = new Header(true);
      com.opera.core.systems.scope.protos.HttpLoggerProtos.internalForceInit();
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:scope.Header)
  }

  private static com.google.protobuf.Descriptors.Descriptor internal_static_scope_Header_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_scope_Header_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = { "\n\021http_logger.proto\022\005scope\"K\n\006Header\022\021\n\t"
        + "requestID\030\001 \002(\r\022\020\n\010windowID\030\002 \002(\r\022\014\n\004tim"
        + "e\030\003 \002(\t\022\016\n\006header\030\004 \002(\tB9\n#com.opera.cor"
        + "e.systems.scope.protosB\020HttpLoggerProtos" + "H\001" };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(
          com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_scope_Header_descriptor = getDescriptor().getMessageTypes().get(
            0);
        internal_static_scope_Header_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_scope_Header_descriptor,
            new java.lang.String[] { "RequestID", "WindowID", "Time", "Header", },
            com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.class,
            com.opera.core.systems.scope.protos.HttpLoggerProtos.Header.Builder.class);
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
  }

  public static void internalForceInit() {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
