// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: huawei-telemetry.proto

package com.leichu.grpc.server.hw.help;

/**
 * Protobuf type {@code TelemetrySelfDefineThresTable}
 */
public  final class TelemetrySelfDefineThresTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TelemetrySelfDefineThresTable)
    TelemetrySelfDefineThresTableOrBuilder {
  // Use TelemetrySelfDefineThresTable.newBuilder() to construct.
  private TelemetrySelfDefineThresTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetrySelfDefineThresTable() {
    row_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TelemetrySelfDefineThresTable(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              row_ = new java.util.ArrayList<com.leichu.grpc.server.hw.help.TelemetryThreshold>();
              mutable_bitField0_ |= 0x00000001;
            }
            row_.add(
                input.readMessage(com.leichu.grpc.server.hw.help.TelemetryThreshold.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        row_ = java.util.Collections.unmodifiableList(row_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetrySelfDefineThresTable_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetrySelfDefineThresTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.class, com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.Builder.class);
  }

  public static final int ROW_FIELD_NUMBER = 1;
  private java.util.List<com.leichu.grpc.server.hw.help.TelemetryThreshold> row_;
  /**
   * <pre>
   *包含多个阈值条件。
   * </pre>
   *
   * <code>repeated .TelemetryThreshold row = 1;</code>
   */
  public java.util.List<com.leichu.grpc.server.hw.help.TelemetryThreshold> getRowList() {
    return row_;
  }
  /**
   * <pre>
   *包含多个阈值条件。
   * </pre>
   *
   * <code>repeated .TelemetryThreshold row = 1;</code>
   */
  public java.util.List<? extends com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder> 
      getRowOrBuilderList() {
    return row_;
  }
  /**
   * <pre>
   *包含多个阈值条件。
   * </pre>
   *
   * <code>repeated .TelemetryThreshold row = 1;</code>
   */
  public int getRowCount() {
    return row_.size();
  }
  /**
   * <pre>
   *包含多个阈值条件。
   * </pre>
   *
   * <code>repeated .TelemetryThreshold row = 1;</code>
   */
  public com.leichu.grpc.server.hw.help.TelemetryThreshold getRow(int index) {
    return row_.get(index);
  }
  /**
   * <pre>
   *包含多个阈值条件。
   * </pre>
   *
   * <code>repeated .TelemetryThreshold row = 1;</code>
   */
  public com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder getRowOrBuilder(
      int index) {
    return row_.get(index);
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
    for (int i = 0; i < row_.size(); i++) {
      output.writeMessage(1, row_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < row_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, row_.get(i));
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
    if (!(obj instanceof com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable)) {
      return super.equals(obj);
    }
    com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable other = (com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable) obj;

    boolean result = true;
    result = result && getRowList()
        .equals(other.getRowList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getRowCount() > 0) {
      hash = (37 * hash) + ROW_FIELD_NUMBER;
      hash = (53 * hash) + getRowList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parseFrom(
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
  public static Builder newBuilder(com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable prototype) {
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
   * Protobuf type {@code TelemetrySelfDefineThresTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TelemetrySelfDefineThresTable)
      com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetrySelfDefineThresTable_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetrySelfDefineThresTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.class, com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.Builder.class);
    }

    // Construct using com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.newBuilder()
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
        getRowFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (rowBuilder_ == null) {
        row_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rowBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leichu.grpc.server.hw.help.HuaweiTelemetry.internal_static_TelemetrySelfDefineThresTable_descriptor;
    }

    public com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable getDefaultInstanceForType() {
      return com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.getDefaultInstance();
    }

    public com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable build() {
      com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable buildPartial() {
      com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable result = new com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable(this);
      int from_bitField0_ = bitField0_;
      if (rowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          row_ = java.util.Collections.unmodifiableList(row_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.row_ = row_;
      } else {
        result.row_ = rowBuilder_.build();
      }
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
      if (other instanceof com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable) {
        return mergeFrom((com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable other) {
      if (other == com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable.getDefaultInstance()) return this;
      if (rowBuilder_ == null) {
        if (!other.row_.isEmpty()) {
          if (row_.isEmpty()) {
            row_ = other.row_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowIsMutable();
            row_.addAll(other.row_);
          }
          onChanged();
        }
      } else {
        if (!other.row_.isEmpty()) {
          if (rowBuilder_.isEmpty()) {
            rowBuilder_.dispose();
            rowBuilder_ = null;
            row_ = other.row_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRowFieldBuilder() : null;
          } else {
            rowBuilder_.addAllMessages(other.row_);
          }
        }
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
      com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.leichu.grpc.server.hw.help.TelemetryThreshold> row_ =
      java.util.Collections.emptyList();
    private void ensureRowIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        row_ = new java.util.ArrayList<com.leichu.grpc.server.hw.help.TelemetryThreshold>(row_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.leichu.grpc.server.hw.help.TelemetryThreshold, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder, com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder> rowBuilder_;

    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public java.util.List<com.leichu.grpc.server.hw.help.TelemetryThreshold> getRowList() {
      if (rowBuilder_ == null) {
        return java.util.Collections.unmodifiableList(row_);
      } else {
        return rowBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public int getRowCount() {
      if (rowBuilder_ == null) {
        return row_.size();
      } else {
        return rowBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThreshold getRow(int index) {
      if (rowBuilder_ == null) {
        return row_.get(index);
      } else {
        return rowBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder setRow(
        int index, com.leichu.grpc.server.hw.help.TelemetryThreshold value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.set(index, value);
        onChanged();
      } else {
        rowBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder setRow(
        int index, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder addRow(com.leichu.grpc.server.hw.help.TelemetryThreshold value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.add(value);
        onChanged();
      } else {
        rowBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder addRow(
        int index, com.leichu.grpc.server.hw.help.TelemetryThreshold value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.add(index, value);
        onChanged();
      } else {
        rowBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder addRow(
        com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.add(builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder addRow(
        int index, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder addAllRow(
        java.lang.Iterable<? extends com.leichu.grpc.server.hw.help.TelemetryThreshold> values) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, row_);
        onChanged();
      } else {
        rowBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder clearRow() {
      if (rowBuilder_ == null) {
        row_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public Builder removeRow(int index) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.remove(index);
        onChanged();
      } else {
        rowBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder getRowBuilder(
        int index) {
      return getRowFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder getRowOrBuilder(
        int index) {
      if (rowBuilder_ == null) {
        return row_.get(index);  } else {
        return rowBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public java.util.List<? extends com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder> 
         getRowOrBuilderList() {
      if (rowBuilder_ != null) {
        return rowBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(row_);
      }
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder addRowBuilder() {
      return getRowFieldBuilder().addBuilder(
          com.leichu.grpc.server.hw.help.TelemetryThreshold.getDefaultInstance());
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder addRowBuilder(
        int index) {
      return getRowFieldBuilder().addBuilder(
          index, com.leichu.grpc.server.hw.help.TelemetryThreshold.getDefaultInstance());
    }
    /**
     * <pre>
     *包含多个阈值条件。
     * </pre>
     *
     * <code>repeated .TelemetryThreshold row = 1;</code>
     */
    public java.util.List<com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder> 
         getRowBuilderList() {
      return getRowFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.leichu.grpc.server.hw.help.TelemetryThreshold, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder, com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder> 
        getRowFieldBuilder() {
      if (rowBuilder_ == null) {
        rowBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.leichu.grpc.server.hw.help.TelemetryThreshold, com.leichu.grpc.server.hw.help.TelemetryThreshold.Builder, com.leichu.grpc.server.hw.help.TelemetryThresholdOrBuilder>(
                row_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        row_ = null;
      }
      return rowBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:TelemetrySelfDefineThresTable)
  }

  // @@protoc_insertion_point(class_scope:TelemetrySelfDefineThresTable)
  private static final com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable();
  }

  public static com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetrySelfDefineThresTable>
      PARSER = new com.google.protobuf.AbstractParser<TelemetrySelfDefineThresTable>() {
    public TelemetrySelfDefineThresTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TelemetrySelfDefineThresTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TelemetrySelfDefineThresTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetrySelfDefineThresTable> getParserForType() {
    return PARSER;
  }

  public com.leichu.grpc.server.hw.help.TelemetrySelfDefineThresTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

