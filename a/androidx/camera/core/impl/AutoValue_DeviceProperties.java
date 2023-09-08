package androidx.camera.core.impl;

final class AutoValue_DeviceProperties extends DeviceProperties {
    private final String manufacturer;
    private final String model;
    private final int sdkVersion;

    public AutoValue_DeviceProperties(String str, String str2, int i) {
        if (str != null) {
            this.manufacturer = str;
            if (str2 != null) {
                this.model = str2;
                this.sdkVersion = i;
                return;
            }
            throw new NullPointerException("Null model");
        }
        throw new NullPointerException("Null manufacturer");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceProperties)) {
            return false;
        }
        DeviceProperties deviceProperties = (DeviceProperties) obj;
        return this.manufacturer.equals(deviceProperties.manufacturer()) && this.model.equals(deviceProperties.model()) && this.sdkVersion == deviceProperties.sdkVersion();
    }

    public int hashCode() {
        return ((((this.manufacturer.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.sdkVersion;
    }

    public String manufacturer() {
        return this.manufacturer;
    }

    public String model() {
        return this.model;
    }

    public int sdkVersion() {
        return this.sdkVersion;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.manufacturer + ", model=" + this.model + ", sdkVersion=" + this.sdkVersion + "}";
    }
}
