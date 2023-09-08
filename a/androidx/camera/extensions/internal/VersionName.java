package androidx.camera.extensions.internal;

public class VersionName {
    private static final VersionName CURRENT = new VersionName("1.1.0");
    private final Version mVersion;

    public VersionName(String str) {
        this.mVersion = Version.parse(str);
    }

    public static VersionName getCurrentVersion() {
        return CURRENT;
    }

    public Version getVersion() {
        return this.mVersion;
    }

    public String toVersionString() {
        return this.mVersion.toString();
    }

    public VersionName(int i, int i2, int i3, String str) {
        this.mVersion = Version.create(i, i2, i3, str);
    }
}
