package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;

final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {
    private final int rotationDegrees;
    private final Matrix sensorToBufferTransformMatrix;
    private final TagBundle tagBundle;
    private final long timestamp;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle2, long j, int i, Matrix matrix) {
        if (tagBundle2 != null) {
            this.tagBundle = tagBundle2;
            this.timestamp = j;
            this.rotationDegrees = i;
            if (matrix != null) {
                this.sensorToBufferTransformMatrix = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        return this.tagBundle.equals(immutableImageInfo.getTagBundle()) && this.timestamp == immutableImageInfo.getTimestamp() && this.rotationDegrees == immutableImageInfo.getRotationDegrees() && this.sensorToBufferTransformMatrix.equals(immutableImageInfo.getSensorToBufferTransformMatrix());
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public Matrix getSensorToBufferTransformMatrix() {
        return this.sensorToBufferTransformMatrix;
    }

    public TagBundle getTagBundle() {
        return this.tagBundle;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j = this.timestamp;
        return ((((((this.tagBundle.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransformMatrix.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.tagBundle + ", timestamp=" + this.timestamp + ", rotationDegrees=" + this.rotationDegrees + ", sensorToBufferTransformMatrix=" + this.sensorToBufferTransformMatrix + "}";
    }
}
