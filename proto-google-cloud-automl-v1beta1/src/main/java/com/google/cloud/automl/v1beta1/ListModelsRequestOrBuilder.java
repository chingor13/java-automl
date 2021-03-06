// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListModelsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the project, from which to list the models.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the project, from which to list the models.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `model_metadata` - for existence of the case (e.g.
   *             video_classification_model_metadata:*).
   *   * `dataset_id` - for = or !=. Some examples of using the filter are:
   *   * `image_classification_model_metadata:*` --&gt; The model has
   *                                        image_classification_model_metadata.
   *   * `dataset_id=5` --&gt; The model was created from a dataset with ID 5.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `model_metadata` - for existence of the case (e.g.
   *             video_classification_model_metadata:*).
   *   * `dataset_id` - for = or !=. Some examples of using the filter are:
   *   * `image_classification_model_metadata:*` --&gt; The model has
   *                                        image_classification_model_metadata.
   *   * `dataset_id=5` --&gt; The model was created from a dataset with ID 5.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Requested page size.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.automl.v1beta1.ListModelsResponse.next_page_token] of the previous
   * [AutoMl.ListModels][google.cloud.automl.v1beta1.AutoMl.ListModels] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return
   * Typically obtained via
   * [ListModelsResponse.next_page_token][google.cloud.automl.v1beta1.ListModelsResponse.next_page_token] of the previous
   * [AutoMl.ListModels][google.cloud.automl.v1beta1.AutoMl.ListModels] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
