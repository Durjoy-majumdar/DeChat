package androidx.camera.core.impl;

import android.util.Size;

final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {
    private final Size analysisSize;
    private final Size previewSize;
    private final Size recordSize;

    public AutoValue_SurfaceSizeDefinition(Size size, Size size2, Size size3) {
        if (size != null) {
            this.analysisSize = size;
            if (size2 != null) {
                this.previewSize = size2;
                if (size3 != null) {
                    this.recordSize = size3;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceSizeDefinition)) {
            return false;
        }
        SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
        return this.analysisSize.equals(surfaceSizeDefinition.getAnalysisSize()) && this.previewSize.equals(surfaceSizeDefinition.getPreviewSize()) && this.recordSize.equals(surfaceSizeDefinition.getRecordSize());
    }

    public Size getAnalysisSize() {
        return this.analysisSize;
    }

    public Size getPreviewSize() {
        return this.previewSize;
    }

    public Size getRecordSize() {
        return this.recordSize;
    }

    public int hashCode() {
        return ((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.recordSize.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.analysisSize + ", previewSize=" + this.previewSize + ", recordSize=" + this.recordSize + "}";
    }
}
