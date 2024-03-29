// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: huawei-telemetry.proto

package com.leichu.grpc.server.hw.help;

public interface PathElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PathElem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *数据树节点名称。
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *数据树节点名称。
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *数据树节点的key字段名称和取值映射表。
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  int getKeyCount();
  /**
   * <pre>
   *数据树节点的key字段名称和取值映射表。
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  boolean containsKey(
      java.lang.String key);
  /**
   * Use {@link #getKeyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getKey();
  /**
   * <pre>
   *数据树节点的key字段名称和取值映射表。
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getKeyMap();
  /**
   * <pre>
   *数据树节点的key字段名称和取值映射表。
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */

  java.lang.String getKeyOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   *数据树节点的key字段名称和取值映射表。
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */

  java.lang.String getKeyOrThrow(
      java.lang.String key);
}
