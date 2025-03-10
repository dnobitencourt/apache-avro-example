/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.avro.example.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -237844598962488365L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.avro.example.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"User ID\"},{\"name\":\"login\",\"type\":\"string\",\"doc\":\"User login\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"site\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"two_factor_authentication\",\"type\":\"boolean\"},{\"name\":\"public_repos\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** User ID */
  @Deprecated public long id;
  /** User login */
  @Deprecated public java.lang.CharSequence login;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public java.lang.CharSequence site;
  @Deprecated public boolean two_factor_authentication;
  @Deprecated public int public_repos;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param id User ID
   * @param login User login
   * @param url The new value for url
   * @param site The new value for site
   * @param two_factor_authentication The new value for two_factor_authentication
   * @param public_repos The new value for public_repos
   */
  public User(java.lang.Long id, java.lang.CharSequence login, java.lang.CharSequence url, java.lang.CharSequence site, java.lang.Boolean two_factor_authentication, java.lang.Integer public_repos) {
    this.id = id;
    this.login = login;
    this.url = url;
    this.site = site;
    this.two_factor_authentication = two_factor_authentication;
    this.public_repos = public_repos;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return login;
    case 2: return url;
    case 3: return site;
    case 4: return two_factor_authentication;
    case 5: return public_repos;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: login = (java.lang.CharSequence)value$; break;
    case 2: url = (java.lang.CharSequence)value$; break;
    case 3: site = (java.lang.CharSequence)value$; break;
    case 4: two_factor_authentication = (java.lang.Boolean)value$; break;
    case 5: public_repos = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return User ID
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * User ID
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'login' field.
   * @return User login
   */
  public java.lang.CharSequence getLogin() {
    return login;
  }

  /**
   * Sets the value of the 'login' field.
   * User login
   * @param value the value to set.
   */
  public void setLogin(java.lang.CharSequence value) {
    this.login = value;
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'site' field.
   * @return The value of the 'site' field.
   */
  public java.lang.CharSequence getSite() {
    return site;
  }

  /**
   * Sets the value of the 'site' field.
   * @param value the value to set.
   */
  public void setSite(java.lang.CharSequence value) {
    this.site = value;
  }

  /**
   * Gets the value of the 'two_factor_authentication' field.
   * @return The value of the 'two_factor_authentication' field.
   */
  public java.lang.Boolean getTwoFactorAuthentication() {
    return two_factor_authentication;
  }

  /**
   * Sets the value of the 'two_factor_authentication' field.
   * @param value the value to set.
   */
  public void setTwoFactorAuthentication(java.lang.Boolean value) {
    this.two_factor_authentication = value;
  }

  /**
   * Gets the value of the 'public_repos' field.
   * @return The value of the 'public_repos' field.
   */
  public java.lang.Integer getPublicRepos() {
    return public_repos;
  }

  /**
   * Sets the value of the 'public_repos' field.
   * @param value the value to set.
   */
  public void setPublicRepos(java.lang.Integer value) {
    this.public_repos = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static org.avro.example.generated.User.Builder newBuilder() {
    return new org.avro.example.generated.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static org.avro.example.generated.User.Builder newBuilder(org.avro.example.generated.User.Builder other) {
    return new org.avro.example.generated.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static org.avro.example.generated.User.Builder newBuilder(org.avro.example.generated.User other) {
    return new org.avro.example.generated.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    /** User ID */
    private long id;
    /** User login */
    private java.lang.CharSequence login;
    private java.lang.CharSequence url;
    private java.lang.CharSequence site;
    private boolean two_factor_authentication;
    private int public_repos;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.avro.example.generated.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.login)) {
        this.login = data().deepCopy(fields()[1].schema(), other.login);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.site)) {
        this.site = data().deepCopy(fields()[3].schema(), other.site);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.two_factor_authentication)) {
        this.two_factor_authentication = data().deepCopy(fields()[4].schema(), other.two_factor_authentication);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.public_repos)) {
        this.public_repos = data().deepCopy(fields()[5].schema(), other.public_repos);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(org.avro.example.generated.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.login)) {
        this.login = data().deepCopy(fields()[1].schema(), other.login);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.site)) {
        this.site = data().deepCopy(fields()[3].schema(), other.site);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.two_factor_authentication)) {
        this.two_factor_authentication = data().deepCopy(fields()[4].schema(), other.two_factor_authentication);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.public_repos)) {
        this.public_repos = data().deepCopy(fields()[5].schema(), other.public_repos);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * User ID
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * User ID
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * User ID
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * User ID
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'login' field.
      * User login
      * @return The value.
      */
    public java.lang.CharSequence getLogin() {
      return login;
    }

    /**
      * Sets the value of the 'login' field.
      * User login
      * @param value The value of 'login'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setLogin(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.login = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'login' field has been set.
      * User login
      * @return True if the 'login' field has been set, false otherwise.
      */
    public boolean hasLogin() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'login' field.
      * User login
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearLogin() {
      login = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.CharSequence getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.url = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'site' field.
      * @return The value.
      */
    public java.lang.CharSequence getSite() {
      return site;
    }

    /**
      * Sets the value of the 'site' field.
      * @param value The value of 'site'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setSite(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.site = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'site' field has been set.
      * @return True if the 'site' field has been set, false otherwise.
      */
    public boolean hasSite() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'site' field.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearSite() {
      site = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'two_factor_authentication' field.
      * @return The value.
      */
    public java.lang.Boolean getTwoFactorAuthentication() {
      return two_factor_authentication;
    }

    /**
      * Sets the value of the 'two_factor_authentication' field.
      * @param value The value of 'two_factor_authentication'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setTwoFactorAuthentication(boolean value) {
      validate(fields()[4], value);
      this.two_factor_authentication = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'two_factor_authentication' field has been set.
      * @return True if the 'two_factor_authentication' field has been set, false otherwise.
      */
    public boolean hasTwoFactorAuthentication() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'two_factor_authentication' field.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearTwoFactorAuthentication() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'public_repos' field.
      * @return The value.
      */
    public java.lang.Integer getPublicRepos() {
      return public_repos;
    }

    /**
      * Sets the value of the 'public_repos' field.
      * @param value The value of 'public_repos'.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder setPublicRepos(int value) {
      validate(fields()[5], value);
      this.public_repos = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'public_repos' field has been set.
      * @return True if the 'public_repos' field has been set, false otherwise.
      */
    public boolean hasPublicRepos() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'public_repos' field.
      * @return This builder.
      */
    public org.avro.example.generated.User.Builder clearPublicRepos() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.login = fieldSetFlags()[1] ? this.login : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.url = fieldSetFlags()[2] ? this.url : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.site = fieldSetFlags()[3] ? this.site : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.two_factor_authentication = fieldSetFlags()[4] ? this.two_factor_authentication : (java.lang.Boolean) defaultValue(fields()[4]);
        record.public_repos = fieldSetFlags()[5] ? this.public_repos : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
