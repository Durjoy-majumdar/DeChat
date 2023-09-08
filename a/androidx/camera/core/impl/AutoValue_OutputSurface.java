package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

final class AutoValue_OutputSurface extends OutputSurface {
    private final int imageFormat;
    private final Size size;
    private final Surface surface;

    public AutoValue_OutputSurface(Surface surface2, Size size2, int i) {
        if (surface2 != null) {
            this.surface = surface2;
            if (size2 != null) {
                this.size = size2;
                this.imageFormat = i;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.surface.equals(outputSurface.getSurface()) && this.size.equals(outputSurface.getSize()) && this.imageFormat == outputSurface.getImageFormat();
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public Size getSize() {
        return this.size;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.surface + ", size=" + this.size + ", imageFormat=" + this.imageFormat + "}";
    }
}
