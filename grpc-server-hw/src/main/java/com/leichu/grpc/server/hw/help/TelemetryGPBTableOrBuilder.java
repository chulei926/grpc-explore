// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: huawei-telemetry.proto

package com.leichu.grpc.server.hw.help;

public interface TelemetryGPBTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TelemetryGPBTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *数组定义，标识数据是TelemetryRowGPB结构的重复。
   * </pre>
   *
   * <code>repeated .TelemetryRowGPB row = 1;</code>
   */
  java.util.List<com.leichu.grpc.server.hw.help.TelemetryRowGPB> 
      getRowList();
  /**
   * <pre>
   *数组定义，标识数据是TelemetryRowGPB结构的重复。
   * </pre>
   *
   * <code>repeated .TelemetryRowGPB row = 1;</code>
   */
  com.leichu.grpc.server.hw.help.TelemetryRowGPB getRow(int index);
  /**
   * <pre>
   *数组定义，标识数据是TelemetryRowGPB结构的重复。
   * </pre>
   *
   * <code>repeated .TelemetryRowGPB row = 1;</code>
   */
  int getRowCount();
  /**
   * <pre>
   *数组定义，标识数据是TelemetryRowGPB结构的重复。
   * </pre>
   *
   * <code>repeated .TelemetryRowGPB row = 1;</code>
   */
  java.util.List<? extends com.leichu.grpc.server.hw.help.TelemetryRowGPBOrBuilder> 
      getRowOrBuilderList();
  /**
   * <pre>
   *数组定义，标识数据是TelemetryRowGPB结构的重复。
   * </pre>
   *
   * <code>repeated .TelemetryRowGPB row = 1;</code>
   */
  com.leichu.grpc.server.hw.help.TelemetryRowGPBOrBuilder getRowOrBuilder(
      int index);

  /**
   * <pre>
   *删除数据路径。
   * </pre>
   *
   * <code>repeated .DataPath delete = 2;</code>
   */
  java.util.List<com.leichu.grpc.server.hw.help.DataPath> 
      getDeleteList();
  /**
   * <pre>
   *删除数据路径。
   * </pre>
   *
   * <code>repeated .DataPath delete = 2;</code>
   */
  com.leichu.grpc.server.hw.help.DataPath getDelete(int index);
  /**
   * <pre>
   *删除数据路径。
   * </pre>
   *
   * <code>repeated .DataPath delete = 2;</code>
   */
  int getDeleteCount();
  /**
   * <pre>
   *删除数据路径。
   * </pre>
   *
   * <code>repeated .DataPath delete = 2;</code>
   */
  java.util.List<? extends com.leichu.grpc.server.hw.help.DataPathOrBuilder> 
      getDeleteOrBuilderList();
  /**
   * <pre>
   *删除数据路径。
   * </pre>
   *
   * <code>repeated .DataPath delete = 2;</code>
   */
  com.leichu.grpc.server.hw.help.DataPathOrBuilder getDeleteOrBuilder(
      int index);

  /**
   * <pre>
   *数据源描述。用于可靠性要求较高的OnChange+业务。
   * </pre>
   *
   * <code>optional .Generator generator = 3;</code>
   */
  boolean hasGenerator();
  /**
   * <pre>
   *数据源描述。用于可靠性要求较高的OnChange+业务。
   * </pre>
   *
   * <code>optional .Generator generator = 3;</code>
   */
  com.leichu.grpc.server.hw.help.Generator getGenerator();
  /**
   * <pre>
   *数据源描述。用于可靠性要求较高的OnChange+业务。
   * </pre>
   *
   * <code>optional .Generator generator = 3;</code>
   */
  com.leichu.grpc.server.hw.help.GeneratorOrBuilder getGeneratorOrBuilder();
}
