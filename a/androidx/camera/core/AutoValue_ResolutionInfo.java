package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

final class AutoValue_ResolutionInfo extends ResolutionInfo {
    private final Rect cropRect;
    private final Size resolution;
    private final int rotationDegrees;

    public AutoValue_ResolutionInfo(Size size, Rect rect, int i) {
        if (size != null) {
            this.resolution = size;
            if (rect != null) {
                this.cropRect = rect;
                this.rotationDegrees = i;
                return;
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null resolution");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolutionInfo)) {
            return false;
        }
        ResolutionInfo resolutionInfo = (ResolutionInfo) obj;
        return this.resolution.equals(resolutionInfo.getResolution()) && this.cropRect.equals(resolutionInfo.getCropRect()) && this.rotationDegrees == resolutionInfo.getRotationDegrees();
    }

    public Rect getCropRect() {
        return this.cropRect;
    }

    public Size getResolution() {
        return this.resolution;
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees;
    }

    public String toString() {
        return "ResolutionInfo{resolution=" + this.resolution + ", cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + "}";
    }
}
