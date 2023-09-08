package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;

final class AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig extends Camera2OutputConfigBuilder.ImageReaderConfig {
    private final int imageFormat;
    private final int maxImages;
    private final Size size;

    public AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig(Size size2, int i, int i2) {
        if (size2 != null) {
            this.size = size2;
            this.imageFormat = i;
            this.maxImages = i2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2OutputConfigBuilder.ImageReaderConfig)) {
            return false;
        }
        Camera2OutputConfigBuilder.ImageReaderConfig imageReaderConfig = (Camera2OutputConfigBuilder.ImageReaderConfig) obj;
        return this.size.equals(imageReaderConfig.getSize()) && this.imageFormat == imageReaderConfig.getImageFormat() && this.maxImages == imageReaderConfig.getMaxImages();
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getMaxImages() {
        return this.maxImages;
    }

    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        return ((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        return "ImageReaderConfig{size=" + this.size + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }
}
