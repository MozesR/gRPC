// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.abn_amro.grpc;

/**
 * Protobuf type {@code com.abn_amro.grpc.PersonRequest}
 */
public  final class PersonRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.abn_amro.grpc.PersonRequest)
    PersonRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonRequest.newBuilder() to construct.
  private PersonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonRequest() {
    name_ = "";
    email_ = "";
    age_ = 0L;
    sports_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    role_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 24: {

            age_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              sports_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            sports_.add(s);
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              scores_ = com.google.protobuf.MapField.newMapField(
                  ScoresDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000010;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            scores__ = input.readMessage(
                ScoresDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            scores_.getMutableMap().put(
                scores__.getKey(), scores__.getValue());
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            role_ = rawValue;
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        sports_ = sports_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 5:
        return internalGetScores();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.abn_amro.grpc.PersonRequest.class, com.abn_amro.grpc.PersonRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 2;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private long age_;
  /**
   * <code>int64 age = 3;</code>
   */
  public long getAge() {
    return age_;
  }

  public static final int SPORTS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList sports_;
  /**
   * <code>repeated string sports = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getSportsList() {
    return sports_;
  }
  /**
   * <code>repeated string sports = 4;</code>
   */
  public int getSportsCount() {
    return sports_.size();
  }
  /**
   * <code>repeated string sports = 4;</code>
   */
  public java.lang.String getSports(int index) {
    return sports_.get(index);
  }
  /**
   * <code>repeated string sports = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSportsBytes(int index) {
    return sports_.getByteString(index);
  }

  public static final int SCORES_FIELD_NUMBER = 5;
  private static final class ScoresDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_ScoresEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> scores_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetScores() {
    if (scores_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ScoresDefaultEntryHolder.defaultEntry);
    }
    return scores_;
  }

  public int getScoresCount() {
    return internalGetScores().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; scores = 5;</code>
   */

  public boolean containsScores(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetScores().getMap().containsKey(key);
  }
  /**
   * Use {@link #getScoresMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getScores() {
    return getScoresMap();
  }
  /**
   * <code>map&lt;string, string&gt; scores = 5;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getScoresMap() {
    return internalGetScores().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; scores = 5;</code>
   */

  public java.lang.String getScoresOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetScores().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; scores = 5;</code>
   */

  public java.lang.String getScoresOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetScores().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ROLE_FIELD_NUMBER = 6;
  private int role_;
  /**
   * <code>.com.abn_amro.grpc.Role role = 6;</code>
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.com.abn_amro.grpc.Role role = 6;</code>
   */
  public com.abn_amro.grpc.Role getRole() {
    com.abn_amro.grpc.Role result = com.abn_amro.grpc.Role.valueOf(role_);
    return result == null ? com.abn_amro.grpc.Role.UNRECOGNIZED : result;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (age_ != 0L) {
      output.writeInt64(3, age_);
    }
    for (int i = 0; i < sports_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sports_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetScores(),
        ScoresDefaultEntryHolder.defaultEntry,
        5);
    if (role_ != com.abn_amro.grpc.Role.SCRUMMASTER.getNumber()) {
      output.writeEnum(6, role_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (age_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, age_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sports_.size(); i++) {
        dataSize += computeStringSizeNoTag(sports_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSportsList().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetScores().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      scores__ = ScoresDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, scores__);
    }
    if (role_ != com.abn_amro.grpc.Role.SCRUMMASTER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, role_);
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
    if (!(obj instanceof com.abn_amro.grpc.PersonRequest)) {
      return super.equals(obj);
    }
    com.abn_amro.grpc.PersonRequest other = (com.abn_amro.grpc.PersonRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && (getAge()
        == other.getAge());
    result = result && getSportsList()
        .equals(other.getSportsList());
    result = result && internalGetScores().equals(
        other.internalGetScores());
    result = result && role_ == other.role_;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAge());
    if (getSportsCount() > 0) {
      hash = (37 * hash) + SPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getSportsList().hashCode();
    }
    if (!internalGetScores().getMap().isEmpty()) {
      hash = (37 * hash) + SCORES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetScores().hashCode();
    }
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.abn_amro.grpc.PersonRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.abn_amro.grpc.PersonRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.abn_amro.grpc.PersonRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.abn_amro.grpc.PersonRequest parseFrom(
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
  public static Builder newBuilder(com.abn_amro.grpc.PersonRequest prototype) {
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
   * Protobuf type {@code com.abn_amro.grpc.PersonRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.abn_amro.grpc.PersonRequest)
      com.abn_amro.grpc.PersonRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetScores();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetMutableScores();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.abn_amro.grpc.PersonRequest.class, com.abn_amro.grpc.PersonRequest.Builder.class);
    }

    // Construct using com.abn_amro.grpc.PersonRequest.newBuilder()
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
      name_ = "";

      email_ = "";

      age_ = 0L;

      sports_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      internalGetMutableScores().clear();
      role_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.abn_amro.grpc.PersonProto.internal_static_com_abn_amro_grpc_PersonRequest_descriptor;
    }

    public com.abn_amro.grpc.PersonRequest getDefaultInstanceForType() {
      return com.abn_amro.grpc.PersonRequest.getDefaultInstance();
    }

    public com.abn_amro.grpc.PersonRequest build() {
      com.abn_amro.grpc.PersonRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.abn_amro.grpc.PersonRequest buildPartial() {
      com.abn_amro.grpc.PersonRequest result = new com.abn_amro.grpc.PersonRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.email_ = email_;
      result.age_ = age_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        sports_ = sports_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.sports_ = sports_;
      result.scores_ = internalGetScores();
      result.scores_.makeImmutable();
      result.role_ = role_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.abn_amro.grpc.PersonRequest) {
        return mergeFrom((com.abn_amro.grpc.PersonRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.abn_amro.grpc.PersonRequest other) {
      if (other == com.abn_amro.grpc.PersonRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (other.getAge() != 0L) {
        setAge(other.getAge());
      }
      if (!other.sports_.isEmpty()) {
        if (sports_.isEmpty()) {
          sports_ = other.sports_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureSportsIsMutable();
          sports_.addAll(other.sports_);
        }
        onChanged();
      }
      internalGetMutableScores().mergeFrom(
          other.internalGetScores());
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.abn_amro.grpc.PersonRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.abn_amro.grpc.PersonRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 2;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private long age_ ;
    /**
     * <code>int64 age = 3;</code>
     */
    public long getAge() {
      return age_;
    }
    /**
     * <code>int64 age = 3;</code>
     */
    public Builder setAge(long value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 age = 3;</code>
     */
    public Builder clearAge() {
      
      age_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList sports_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSportsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        sports_ = new com.google.protobuf.LazyStringArrayList(sports_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSportsList() {
      return sports_.getUnmodifiableView();
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public int getSportsCount() {
      return sports_.size();
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public java.lang.String getSports(int index) {
      return sports_.get(index);
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSportsBytes(int index) {
      return sports_.getByteString(index);
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public Builder setSports(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSportsIsMutable();
      sports_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public Builder addSports(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSportsIsMutable();
      sports_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public Builder addAllSports(
        java.lang.Iterable<java.lang.String> values) {
      ensureSportsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sports_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public Builder clearSports() {
      sports_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sports = 4;</code>
     */
    public Builder addSportsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSportsIsMutable();
      sports_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> scores_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetScores() {
      if (scores_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScoresDefaultEntryHolder.defaultEntry);
      }
      return scores_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableScores() {
      onChanged();;
      if (scores_ == null) {
        scores_ = com.google.protobuf.MapField.newMapField(
            ScoresDefaultEntryHolder.defaultEntry);
      }
      if (!scores_.isMutable()) {
        scores_ = scores_.copy();
      }
      return scores_;
    }

    public int getScoresCount() {
      return internalGetScores().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public boolean containsScores(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetScores().getMap().containsKey(key);
    }
    /**
     * Use {@link #getScoresMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getScores() {
      return getScoresMap();
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getScoresMap() {
      return internalGetScores().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public java.lang.String getScoresOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetScores().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public java.lang.String getScoresOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetScores().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearScores() {
      internalGetMutableScores().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public Builder removeScores(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableScores().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableScores() {
      return internalGetMutableScores().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */
    public Builder putScores(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableScores().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; scores = 5;</code>
     */

    public Builder putAllScores(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableScores().getMutableMap()
          .putAll(values);
      return this;
    }

    private int role_ = 0;
    /**
     * <code>.com.abn_amro.grpc.Role role = 6;</code>
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.com.abn_amro.grpc.Role role = 6;</code>
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.abn_amro.grpc.Role role = 6;</code>
     */
    public com.abn_amro.grpc.Role getRole() {
      com.abn_amro.grpc.Role result = com.abn_amro.grpc.Role.valueOf(role_);
      return result == null ? com.abn_amro.grpc.Role.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.abn_amro.grpc.Role role = 6;</code>
     */
    public Builder setRole(com.abn_amro.grpc.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.abn_amro.grpc.Role role = 6;</code>
     */
    public Builder clearRole() {
      
      role_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.abn_amro.grpc.PersonRequest)
  }

  // @@protoc_insertion_point(class_scope:com.abn_amro.grpc.PersonRequest)
  private static final com.abn_amro.grpc.PersonRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.abn_amro.grpc.PersonRequest();
  }

  public static com.abn_amro.grpc.PersonRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonRequest>
      PARSER = new com.google.protobuf.AbstractParser<PersonRequest>() {
    public PersonRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PersonRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonRequest> getParserForType() {
    return PARSER;
  }

  public com.abn_amro.grpc.PersonRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

