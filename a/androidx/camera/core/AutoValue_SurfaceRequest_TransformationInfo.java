package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;

final class AutoValue_SurfaceRequest_TransformationInfo extends SurfaceRequest.TransformationInfo {
    private final Rect cropRect;
    private final int rotationDegrees;
    private final int targetRotation;

    public AutoValue_SurfaceRequest_TransformationInfo(Rect rect, int i, int i2) {
        if (rect != null) {
            this.cropRect = rect;
            this.rotationDegrees = i;
            this.targetRotation = i2;
            return;
        }
        throw new NullPointerException("Null cropRect");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.TransformationInfo)) {
            return false;
        }
        SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
        return this.cropRect.equals(transformationInfo.getCropRect()) && this.rotationDegrees == transformationInfo.getRotationDegrees() && this.targetRotation == transformationInfo.getTargetRotation();
    }

    public Rect getCropRect() {
        return this.cropRect;
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int getTargetRotation() {
        return this.targetRotation;
    }

    public int hashCode() {
        return ((((this.cropRect.hashCode() ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.targetRotation;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + ", targetRotation=" + this.targetRotation + "}";
    }
}
