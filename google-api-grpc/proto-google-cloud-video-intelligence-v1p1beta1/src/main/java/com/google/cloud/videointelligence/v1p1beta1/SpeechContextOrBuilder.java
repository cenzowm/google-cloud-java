// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface SpeechContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.util.List<java.lang.String> getPhrasesList();
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  int getPhrasesCount();
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.lang.String getPhrases(int index);
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  com.google.protobuf.ByteString getPhrasesBytes(int index);
}
