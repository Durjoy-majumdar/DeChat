package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

final class AutoValue_SurfaceConfig extends SurfaceConfig {
    private final SurfaceConfig.ConfigSize configSize;
    private final SurfaceConfig.ConfigType configType;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        if (configType2 != null) {
            this.configType = configType2;
            if (configSize2 != null) {
                this.configSize = configSize2;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize());
    }

    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    public SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    public int hashCode() {
        return ((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.configType + ", configSize=" + this.configSize + "}";
    }
}
