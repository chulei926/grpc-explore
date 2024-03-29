// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: huawei-telemetry.proto

package com.leichu.grpc.server.hw.help;

/**
 * Protobuf type {@code TelemetryThreshold}
 */
public  final class TelemetryThreshold extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TelemetryThreshold)
    TelemetryThresholdOrBuilder {
  // Use TelemetryThreshold.newBuilder() to construct.
  private TelemetryThreshold(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetryThreshold() {
    thresholdValue_ = 0;
    thresholdOpType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TelemetryThreshold(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            thresholdValue_ = input.readUInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            thresholdOpType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetryThreshold_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetryThreshold_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leichu.grpc.server.hw.help.TelemetryThreshold.class, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder.class);
  }

  /**
   * Protobuf enum {@code TelemetryThreshold.ThresholdOpType}
   */
  public enum ThresholdOpType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *上送数据的实际值等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_EQ = 0;</code>
     */
    ThresholdOpType_EQ(0),
    /**
     * <pre>
     *上送数据的实际值大于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_GT = 1;</code>
     */
    ThresholdOpType_GT(1),
    /**
     * <pre>
     *上送数据的实际值大于等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_GE = 2;</code>
     */
    ThresholdOpType_GE(2),
    /**
     * <pre>
     *上送数据的实际值小于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_LT = 3;</code>
     */
    ThresholdOpType_LT(3),
    /**
     * <pre>
     *上送数据的实际值小于等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_LE = 4;</code>
     */
    ThresholdOpType_LE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *上送数据的实际值等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_EQ = 0;</code>
     */
    public static final int ThresholdOpType_EQ_VALUE = 0;
    /**
     * <pre>
     *上送数据的实际值大于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_GT = 1;</code>
     */
    public static final int ThresholdOpType_GT_VALUE = 1;
    /**
     * <pre>
     *上送数据的实际值大于等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_GE = 2;</code>
     */
    public static final int ThresholdOpType_GE_VALUE = 2;
    /**
     * <pre>
     *上送数据的实际值小于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_LT = 3;</code>
     */
    public static final int ThresholdOpType_LT_VALUE = 3;
    /**
     * <pre>
     *上送数据的实际值小于等于配置数据阈值。
     * </pre>
     *
     * <code>ThresholdOpType_LE = 4;</code>
     */
    public static final int ThresholdOpType_LE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ThresholdOpType valueOf(int value) {
      return forNumber(value);
    }

    public static ThresholdOpType forNumber(int value) {
      switch (value) {
        case 0: return ThresholdOpType_EQ;
        case 1: return ThresholdOpType_GT;
        case 2: return ThresholdOpType_GE;
        case 3: return ThresholdOpType_LT;
        case 4: return ThresholdOpType_LE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ThresholdOpType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ThresholdOpType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ThresholdOpType>() {
            public ThresholdOpType findValueByNumber(int number) {
              return ThresholdOpType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.leichu.grpc.server.hw.help.TelemetryThreshold.getDescriptor().getEnumTypes().get(0);
    }

    private static final ThresholdOpType[] VALUES = values();

    public static ThresholdOpType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ThresholdOpType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TelemetryThreshold.ThresholdOpType)
  }

  public static final int THRESHOLDVALUE_FIELD_NUMBER = 1;
  private int thresholdValue_;
  /**
   * <pre>
   *配置下发的阈值。
   * </pre>
   *
   * <code>optional uint32 thresholdValue = 1;</code>
   */
  public int getThresholdValue() {
    return thresholdValue_;
  }

  public static final int THRESHOLDOPTYPE_FIELD_NUMBER = 2;
  private int thresholdOpType_;
  /**
   * <pre>
   *表示设备上的阈值条件。
   * </pre>
   *
   * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
   */
  public int getThresholdOpTypeValue() {
    return thresholdOpType_;
  }
  /**
   * <pre>
   *表示设备上的阈值条件。
   * </pre>
   *
   * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
   */
  public com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType getThresholdOpType() {
    com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType result = com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.valueOf(thresholdOpType_);
    return result == null ? com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (thresholdValue_ != 0) {
      output.writeUInt32(1, thresholdValue_);
    }
    if (thresholdOpType_ != com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.ThresholdOpType_EQ.getNumber()) {
      output.writeEnum(2, thresholdOpType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (thresholdValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, thresholdValue_);
    }
    if (thresholdOpType_ != com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.ThresholdOpType_EQ.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, thresholdOpType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.leichu.grpc.server.hw.help.TelemetryThreshold)) {
      return super.equals(obj);
    }
    com.leichu.grpc.server.hw.help.TelemetryThreshold other = (com.leichu.grpc.server.hw.help.TelemetryThreshold) obj;

    boolean result = true;
    result = result && (getThresholdValue()
        == other.getThresholdValue());
    result = result && thresholdOpType_ == other.thresholdOpType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + THRESHOLDVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getThresholdValue();
    hash = (37 * hash) + THRESHOLDOPTYPE_FIELD_NUMBER;
    hash = (53 * hash) + thresholdOpType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetryThreshold parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.leichu.grpc.server.hw.help.TelemetryThreshold prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TelemetryThreshold}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TelemetryThreshold)
      com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetryThreshold_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetryThreshold_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leichu.grpc.server.hw.help.TelemetryThreshold.class, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder.class);
    }

    // Construct using com.leichu.grpc.server.hw.help.TelemetryThreshold.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      thresholdValue_ = 0;

      thresholdOpType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetryThreshold_descriptor;
    }

    public com.leichu.grpc.server.hw.help.TelemetryThreshold getDefaultInstanceForType() {
      return com.leichu.grpc.server.hw.help.TelemetryThreshold.getDefaultInstance();
    }

    public com.leichu.grpc.server.hw.help.TelemetryThreshold build() {
      com.leichu.grpc.server.hw.help.TelemetryThreshold result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.leichu.grpc.server.hw.help.TelemetryThreshold buildPartial() {
      com.leichu.grpc.server.hw.help.TelemetryThreshold result = new com.leichu.grpc.server.hw.help.TelemetryThreshold(this);
      result.thresholdValue_ = thresholdValue_;
      result.thresholdOpType_ = thresholdOpType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.leichu.grpc.server.hw.help.TelemetryThreshold) {
        return mergeFrom((com.leichu.grpc.server.hw.help.TelemetryThreshold)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leichu.grpc.server.hw.help.TelemetryThreshold other) {
      if (other == com.leichu.grpc.server.hw.help.TelemetryThreshold.getDefaultInstance()) return this;
      if (other.getThresholdValue() != 0) {
        setThresholdValue(other.getThresholdValue());
      }
      if (other.thresholdOpType_ != 0) {
        setThresholdOpTypeValue(other.getThresholdOpTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.leichu.grpc.server.hw.help.TelemetryThreshold parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.leichu.grpc.server.hw.help.TelemetryThreshold) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int thresholdValue_ ;
    /**
     * <pre>
     *配置下发的阈值。
     * </pre>
     *
     * <code>optional uint32 thresholdValue = 1;</code>
     */
    public int getThresholdValue() {
      return thresholdValue_;
    }
    /**
     * <pre>
     *配置下发的阈值。
     * </pre>
     *
     * <code>optional uint32 thresholdValue = 1;</code>
     */
    public Builder setThresholdValue(int value) {
      
      thresholdValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *配置下发的阈值。
     * </pre>
     *
     * <code>optional uint32 thresholdValue = 1;</code>
     */
    public Builder clearThresholdValue() {
      
      thresholdValue_ = 0;
      onChanged();
      return this;
    }

    private int thresholdOpType_ = 0;
    /**
     * <pre>
     *表示设备上的阈值条件。
     * </pre>
     *
     * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
     */
    public int getThresholdOpTypeValue() {
      return thresholdOpType_;
    }
    /**
     * <pre>
     *表示设备上的阈值条件。
     * </pre>
     *
     * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
     */
    public Builder setThresholdOpTypeValue(int value) {
      thresholdOpType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示设备上的阈值条件。
     * </pre>
     *
     * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType getThresholdOpType() {
      com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType result = com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.valueOf(thresholdOpType_);
      return result == null ? com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *表示设备上的阈值条件。
     * </pre>
     *
     * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
     */
    public Builder setThresholdOpType(com.leichu.grpc.server.hw.help.TelemetryThreshold.ThresholdOpType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      thresholdOpType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *表示设备上的阈值条件。
     * </pre>
     *
     * <code>optional .TelemetryThreshold.ThresholdOpType thresholdOpType = 2;</code>
     */
    public Builder clearThresholdOpType() {
      
      thresholdOpType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:TelemetryThreshold)
  }

  // @@protoc_insertion_point(class_scope:TelemetryThreshold)
  private static final com.leichu.grpc.server.hw.help.TelemetryThreshold DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leichu.grpc.server.hw.help.TelemetryThreshold();
  }

  public static com.leichu.grpc.server.hw.help.TelemetryThreshold getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetryThreshold>
      PARSER = new com.google.protobuf.AbstractParser<TelemetryThreshold>() {
    public TelemetryThreshold parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TelemetryThreshold(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TelemetryThreshold> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetryThreshold> getParserForType() {
    return PARSER;
  }

  public com.leichu.grpc.server.hw.help.TelemetryThreshold getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

