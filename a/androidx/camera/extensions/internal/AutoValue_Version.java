package androidx.camera.extensions.internal;

final class AutoValue_Version extends Version {
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public AutoValue_Version(int i, int i2, int i3, String str) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (str != null) {
            this.description = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    public String getDescription() {
        return this.description;
    }

    public int getMajor() {
        return this.major;
    }

    public int getMinor() {
        return this.minor;
    }

    public int getPatch() {
        return this.patch;
    }
}
