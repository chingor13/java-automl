/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/dataset.proto

package com.google.cloud.automl.v1;

public final class DatasetOuterClass {
  private DatasetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/automl/v1/dataset.proto\022\026"
          + "google.cloud.automl.v1\032(google/cloud/aut"
          + "oml/v1/translation.proto\032\037google/protobu"
          + "f/timestamp.proto\032\034google/api/annotation"
          + "s.proto\"\364\002\n\007Dataset\022Z\n\034translation_datas"
          + "et_metadata\030\027 \001(\01322.google.cloud.automl."
          + "v1.TranslationDatasetMetadataH\000\022\014\n\004name\030"
          + "\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013descripti"
          + "on\030\003 \001(\t\022\025\n\rexample_count\030\025 \001(\005\022/\n\013creat"
          + "e_time\030\016 \001(\0132\032.google.protobuf.Timestamp"
          + "\022\014\n\004etag\030\021 \001(\t\022;\n\006labels\030\' \003(\0132+.google."
          + "cloud.automl.v1.Dataset.LabelsEntry\032-\n\013L"
          + "abelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001B\022\n\020dataset_metadataB\252\001\n\032com.google.cl"
          + "oud.automl.v1P\001Z<google.golang.org/genpr"
          + "oto/googleapis/cloud/automl/v1;automl\252\002\026"
          + "Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\Au"
          + "toML\\V1\352\002\031Google::Cloud::AutoML::V1b\006pro"
          + "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Dataset_descriptor,
            new java.lang.String[] {
              "TranslationDatasetMetadata",
              "Name",
              "DisplayName",
              "Description",
              "ExampleCount",
              "CreateTime",
              "Etag",
              "Labels",
              "DatasetMetadata",
            });
    internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor =
        internal_static_google_cloud_automl_v1_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}