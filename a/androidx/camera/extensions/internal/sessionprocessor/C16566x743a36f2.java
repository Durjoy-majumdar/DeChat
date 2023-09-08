package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig */
final class C16566x743a36f2 extends Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig {
    private final int imageFormat;
    private final int maxImages;

    public C16566x743a36f2(int i, int i2) {
        this.imageFormat = i;
        this.maxImages = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig)) {
            return false;
        }
        Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig multiResolutionImageReaderConfig = (Camera2OutputConfigBuilder.MultiResolutionImageReaderConfig) obj;
        return this.imageFormat == multiResolutionImageReaderConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderConfig.getMaxImages();
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getMaxImages() {
        return this.maxImages;
    }

    public int hashCode() {
        return ((this.imageFormat ^ 1000003) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }
}
