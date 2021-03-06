// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Characters to skip when doing deidentification of a value. These will be left
 * alone and skipped.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.CharsToIgnore}
 */
public final class CharsToIgnore extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.CharsToIgnore)
    CharsToIgnoreOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CharsToIgnore.newBuilder() to construct.
  private CharsToIgnore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CharsToIgnore() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CharsToIgnore(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              charactersCase_ = 1;
              characters_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();
              charactersCase_ = 2;
              characters_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CharsToIgnore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CharsToIgnore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.CharsToIgnore.class,
            com.google.privacy.dlp.v2.CharsToIgnore.Builder.class);
  }

  /** Protobuf enum {@code google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore} */
  public enum CommonCharsToIgnore implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>COMMON_CHARS_TO_IGNORE_UNSPECIFIED = 0;</code> */
    COMMON_CHARS_TO_IGNORE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * 0-9
     * </pre>
     *
     * <code>NUMERIC = 1;</code>
     */
    NUMERIC(1),
    /**
     *
     *
     * <pre>
     * A-Z
     * </pre>
     *
     * <code>ALPHA_UPPER_CASE = 2;</code>
     */
    ALPHA_UPPER_CASE(2),
    /**
     *
     *
     * <pre>
     * a-z
     * </pre>
     *
     * <code>ALPHA_LOWER_CASE = 3;</code>
     */
    ALPHA_LOWER_CASE(3),
    /**
     *
     *
     * <pre>
     * US Punctuation, one of !"#$%&amp;'()*+,-./:;&lt;=&gt;?&#64;[&#92;]^_`{|}~
     * </pre>
     *
     * <code>PUNCTUATION = 4;</code>
     */
    PUNCTUATION(4),
    /**
     *
     *
     * <pre>
     * Whitespace character, one of [ &#92;t&#92;n&#92;x0B&#92;f&#92;r]
     * </pre>
     *
     * <code>WHITESPACE = 5;</code>
     */
    WHITESPACE(5),
    UNRECOGNIZED(-1),
    ;

    /** <code>COMMON_CHARS_TO_IGNORE_UNSPECIFIED = 0;</code> */
    public static final int COMMON_CHARS_TO_IGNORE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * 0-9
     * </pre>
     *
     * <code>NUMERIC = 1;</code>
     */
    public static final int NUMERIC_VALUE = 1;
    /**
     *
     *
     * <pre>
     * A-Z
     * </pre>
     *
     * <code>ALPHA_UPPER_CASE = 2;</code>
     */
    public static final int ALPHA_UPPER_CASE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * a-z
     * </pre>
     *
     * <code>ALPHA_LOWER_CASE = 3;</code>
     */
    public static final int ALPHA_LOWER_CASE_VALUE = 3;
    /**
     *
     *
     * <pre>
     * US Punctuation, one of !"#$%&amp;'()*+,-./:;&lt;=&gt;?&#64;[&#92;]^_`{|}~
     * </pre>
     *
     * <code>PUNCTUATION = 4;</code>
     */
    public static final int PUNCTUATION_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Whitespace character, one of [ &#92;t&#92;n&#92;x0B&#92;f&#92;r]
     * </pre>
     *
     * <code>WHITESPACE = 5;</code>
     */
    public static final int WHITESPACE_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static CommonCharsToIgnore valueOf(int value) {
      return forNumber(value);
    }

    public static CommonCharsToIgnore forNumber(int value) {
      switch (value) {
        case 0:
          return COMMON_CHARS_TO_IGNORE_UNSPECIFIED;
        case 1:
          return NUMERIC;
        case 2:
          return ALPHA_UPPER_CASE;
        case 3:
          return ALPHA_LOWER_CASE;
        case 4:
          return PUNCTUATION;
        case 5:
          return WHITESPACE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CommonCharsToIgnore>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CommonCharsToIgnore>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CommonCharsToIgnore>() {
              public CommonCharsToIgnore findValueByNumber(int number) {
                return CommonCharsToIgnore.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.privacy.dlp.v2.CharsToIgnore.getDescriptor().getEnumTypes().get(0);
    }

    private static final CommonCharsToIgnore[] VALUES = values();

    public static CommonCharsToIgnore valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CommonCharsToIgnore(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore)
  }

  private int charactersCase_ = 0;
  private java.lang.Object characters_;

  public enum CharactersCase implements com.google.protobuf.Internal.EnumLite {
    CHARACTERS_TO_SKIP(1),
    COMMON_CHARACTERS_TO_IGNORE(2),
    CHARACTERS_NOT_SET(0);
    private final int value;

    private CharactersCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static CharactersCase valueOf(int value) {
      return forNumber(value);
    }

    public static CharactersCase forNumber(int value) {
      switch (value) {
        case 1:
          return CHARACTERS_TO_SKIP;
        case 2:
          return COMMON_CHARACTERS_TO_IGNORE;
        case 0:
          return CHARACTERS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public CharactersCase getCharactersCase() {
    return CharactersCase.forNumber(charactersCase_);
  }

  public static final int CHARACTERS_TO_SKIP_FIELD_NUMBER = 1;
  /** <code>string characters_to_skip = 1;</code> */
  public java.lang.String getCharactersToSkip() {
    java.lang.Object ref = "";
    if (charactersCase_ == 1) {
      ref = characters_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (charactersCase_ == 1) {
        characters_ = s;
      }
      return s;
    }
  }
  /** <code>string characters_to_skip = 1;</code> */
  public com.google.protobuf.ByteString getCharactersToSkipBytes() {
    java.lang.Object ref = "";
    if (charactersCase_ == 1) {
      ref = characters_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (charactersCase_ == 1) {
        characters_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMON_CHARACTERS_TO_IGNORE_FIELD_NUMBER = 2;
  /**
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
   * </code>
   */
  public int getCommonCharactersToIgnoreValue() {
    if (charactersCase_ == 2) {
      return (java.lang.Integer) characters_;
    }
    return 0;
  }
  /**
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
   * </code>
   */
  public com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore getCommonCharactersToIgnore() {
    if (charactersCase_ == 2) {
      @SuppressWarnings("deprecation")
      com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore result =
          com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore.valueOf(
              (java.lang.Integer) characters_);
      return result == null
          ? com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore.UNRECOGNIZED
          : result;
    }
    return com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore
        .COMMON_CHARS_TO_IGNORE_UNSPECIFIED;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (charactersCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, characters_);
    }
    if (charactersCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) characters_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (charactersCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, characters_);
    }
    if (charactersCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(
              2, ((java.lang.Integer) characters_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2.CharsToIgnore)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.CharsToIgnore other = (com.google.privacy.dlp.v2.CharsToIgnore) obj;

    boolean result = true;
    result = result && getCharactersCase().equals(other.getCharactersCase());
    if (!result) return false;
    switch (charactersCase_) {
      case 1:
        result = result && getCharactersToSkip().equals(other.getCharactersToSkip());
        break;
      case 2:
        result =
            result
                && getCommonCharactersToIgnoreValue() == other.getCommonCharactersToIgnoreValue();
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (charactersCase_) {
      case 1:
        hash = (37 * hash) + CHARACTERS_TO_SKIP_FIELD_NUMBER;
        hash = (53 * hash) + getCharactersToSkip().hashCode();
        break;
      case 2:
        hash = (37 * hash) + COMMON_CHARACTERS_TO_IGNORE_FIELD_NUMBER;
        hash = (53 * hash) + getCommonCharactersToIgnoreValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.privacy.dlp.v2.CharsToIgnore prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Characters to skip when doing deidentification of a value. These will be left
   * alone and skipped.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.CharsToIgnore}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.CharsToIgnore)
      com.google.privacy.dlp.v2.CharsToIgnoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CharsToIgnore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CharsToIgnore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.CharsToIgnore.class,
              com.google.privacy.dlp.v2.CharsToIgnore.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.CharsToIgnore.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      charactersCase_ = 0;
      characters_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CharsToIgnore_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CharsToIgnore getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.CharsToIgnore.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CharsToIgnore build() {
      com.google.privacy.dlp.v2.CharsToIgnore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CharsToIgnore buildPartial() {
      com.google.privacy.dlp.v2.CharsToIgnore result =
          new com.google.privacy.dlp.v2.CharsToIgnore(this);
      if (charactersCase_ == 1) {
        result.characters_ = characters_;
      }
      if (charactersCase_ == 2) {
        result.characters_ = characters_;
      }
      result.charactersCase_ = charactersCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.CharsToIgnore) {
        return mergeFrom((com.google.privacy.dlp.v2.CharsToIgnore) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.CharsToIgnore other) {
      if (other == com.google.privacy.dlp.v2.CharsToIgnore.getDefaultInstance()) return this;
      switch (other.getCharactersCase()) {
        case CHARACTERS_TO_SKIP:
          {
            charactersCase_ = 1;
            characters_ = other.characters_;
            onChanged();
            break;
          }
        case COMMON_CHARACTERS_TO_IGNORE:
          {
            setCommonCharactersToIgnoreValue(other.getCommonCharactersToIgnoreValue());
            break;
          }
        case CHARACTERS_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.CharsToIgnore parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.CharsToIgnore) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int charactersCase_ = 0;
    private java.lang.Object characters_;

    public CharactersCase getCharactersCase() {
      return CharactersCase.forNumber(charactersCase_);
    }

    public Builder clearCharacters() {
      charactersCase_ = 0;
      characters_ = null;
      onChanged();
      return this;
    }

    /** <code>string characters_to_skip = 1;</code> */
    public java.lang.String getCharactersToSkip() {
      java.lang.Object ref = "";
      if (charactersCase_ == 1) {
        ref = characters_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (charactersCase_ == 1) {
          characters_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /** <code>string characters_to_skip = 1;</code> */
    public com.google.protobuf.ByteString getCharactersToSkipBytes() {
      java.lang.Object ref = "";
      if (charactersCase_ == 1) {
        ref = characters_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (charactersCase_ == 1) {
          characters_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /** <code>string characters_to_skip = 1;</code> */
    public Builder setCharactersToSkip(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      charactersCase_ = 1;
      characters_ = value;
      onChanged();
      return this;
    }
    /** <code>string characters_to_skip = 1;</code> */
    public Builder clearCharactersToSkip() {
      if (charactersCase_ == 1) {
        charactersCase_ = 0;
        characters_ = null;
        onChanged();
      }
      return this;
    }
    /** <code>string characters_to_skip = 1;</code> */
    public Builder setCharactersToSkipBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      charactersCase_ = 1;
      characters_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>
     * .google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
     * </code>
     */
    public int getCommonCharactersToIgnoreValue() {
      if (charactersCase_ == 2) {
        return ((java.lang.Integer) characters_).intValue();
      }
      return 0;
    }
    /**
     * <code>
     * .google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
     * </code>
     */
    public Builder setCommonCharactersToIgnoreValue(int value) {
      charactersCase_ = 2;
      characters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>
     * .google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
     * </code>
     */
    public com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore
        getCommonCharactersToIgnore() {
      if (charactersCase_ == 2) {
        @SuppressWarnings("deprecation")
        com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore result =
            com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore.valueOf(
                (java.lang.Integer) characters_);
        return result == null
            ? com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore.UNRECOGNIZED
            : result;
      }
      return com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore
          .COMMON_CHARS_TO_IGNORE_UNSPECIFIED;
    }
    /**
     * <code>
     * .google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
     * </code>
     */
    public Builder setCommonCharactersToIgnore(
        com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore value) {
      if (value == null) {
        throw new NullPointerException();
      }
      charactersCase_ = 2;
      characters_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>
     * .google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;
     * </code>
     */
    public Builder clearCommonCharactersToIgnore() {
      if (charactersCase_ == 2) {
        charactersCase_ = 0;
        characters_ = null;
        onChanged();
      }
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.CharsToIgnore)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.CharsToIgnore)
  private static final com.google.privacy.dlp.v2.CharsToIgnore DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.CharsToIgnore();
  }

  public static com.google.privacy.dlp.v2.CharsToIgnore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CharsToIgnore> PARSER =
      new com.google.protobuf.AbstractParser<CharsToIgnore>() {
        @java.lang.Override
        public CharsToIgnore parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CharsToIgnore(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CharsToIgnore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CharsToIgnore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.CharsToIgnore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
