package com.google.cloud.storage.contrib.nio;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.auto.value.AutoValue;

import java.util.Map;

/**
 * Configuration for a {@link CloudStorageFileSystem} instance.
 */
@AutoValue
public abstract class CloudStorageConfiguration {

  /**
   * Returns path of the current working directory. This defaults to the root directory.
   */
  public abstract String workingDirectory();

  /**
   * Returns {@code true} if we <i>shouldn't</i> throw an exception when encountering object names
   * containing superfluous slashes, e.g. {@code a//b}.
   */
  public abstract boolean permitEmptyPathComponents();

  /**
   * Returns {@code true} if '/' prefix on absolute object names should be removed before I/O.
   *
   * <p>If you disable this feature, please take into consideration that all paths created from a
   * URI will have the leading slash.
   */
  public abstract boolean stripPrefixSlash();

  /** Return {@code true} if paths with a trailing slash should be treated as fake directories. */
  public abstract boolean usePseudoDirectories();

  /** Returns the block size (in bytes) used when talking to the GCS HTTP server. */
  public abstract int blockSize();

  /**
   * Creates a new builder, initialized with the following settings:
   *
   * <ul>
   * <li>Performing I/O on paths with extra slashes, e.g. {@code a//b} will throw an error.
   * <li>The prefix slash on absolute paths will be removed when converting to an object name.
   * <li>Pseudo-directories are enabled, so any path with a trailing slash is a fake directory.
   * </ul>
   */
  public static Builder builder() {
    return new Builder();
  }

  /** Builder for {@link CloudStorageConfiguration}.
   */
  public static final class Builder {

    private String workingDirectory = UnixPath.ROOT;
    private boolean permitEmptyPathComponents = false;
    private boolean stripPrefixSlash = true;
    private boolean usePseudoDirectories = true;
    private int blockSize = CloudStorageFileSystem.BLOCK_SIZE_DEFAULT;

    /**
     * Changes the current working directory for a new filesystem. This cannot be changed once it's
     * been set. You'll need to simply create another filesystem object.
     *
     * @throws IllegalArgumentException if {@code path} is not absolute.
     */
    public Builder workingDirectory(String path) {
      checkArgument(UnixPath.getPath(false, path).isAbsolute(), "not absolute: %s", path);
      workingDirectory = path;
      return this;
    }

    /**
     * Configures whether or not we should throw an exception when encountering object names
     * containing superfluous slashes, e.g. {@code a//b}
     */
    public Builder permitEmptyPathComponents(boolean value) {
      permitEmptyPathComponents = value;
      return this;
    }

    /**
     * Configures if the '/' prefix on absolute object names should be removed before I/O.
     *
     * <p>If you disable this feature, please take into consideration that all paths created from a
     * URI will have the leading slash.
     */
    public Builder stripPrefixSlash(boolean value) {
      stripPrefixSlash = value;
      return this;
    }

    /** Configures if paths with a trailing slash should be treated as fake directories.
     */
    public Builder usePseudoDirectories(boolean value) {
      usePseudoDirectories = value;
      return this;
    }

    /**
     * Sets the block size in bytes that should be used for each HTTP request to the API.
     *
     * <p>The default is {@value CloudStorageFileSystem#BLOCK_SIZE_DEFAULT}.
     */
    public Builder blockSize(int value) {
      blockSize = value;
      return this;
    }

    /** Creates a new instance, but does not destroy the builder.
     */
    public CloudStorageConfiguration build() {
      return new AutoValue_CloudStorageConfiguration(
          workingDirectory,
          permitEmptyPathComponents,
          stripPrefixSlash,
          usePseudoDirectories,
          blockSize);
    }

    Builder() {}
  }

  public static final CloudStorageConfiguration DEFAULT = builder().build();

  static CloudStorageConfiguration fromMap(Map<String, ?> env) {
    Builder builder = builder();
    for (Map.Entry<String, ?> entry : env.entrySet()) {
      switch (entry.getKey()) {
        case "workingDirectory":
          builder.workingDirectory((String) entry.getValue());
          break;
        case "permitEmptyPathComponents":
          builder.permitEmptyPathComponents((Boolean) entry.getValue());
          break;
        case "stripPrefixSlash":
          builder.stripPrefixSlash((Boolean) entry.getValue());
          break;
        case "usePseudoDirectories":
          builder.usePseudoDirectories((Boolean) entry.getValue());
          break;
        case "blockSize":
          builder.blockSize((Integer) entry.getValue());
          break;
        default:
          throw new IllegalArgumentException(entry.getKey());
      }
    }
    return builder.build();
  }

  CloudStorageConfiguration() {}
}
