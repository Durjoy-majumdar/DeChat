package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

abstract class ImmutableImageInfo implements ImageInfo {
    public static ImageInfo create(TagBundle tagBundle, long j, int i, Matrix matrix) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j, i, matrix);
    }

    public abstract int getRotationDegrees();

    public abstract Matrix getSensorToBufferTransformMatrix();

    public abstract TagBundle getTagBundle();

    public abstract long getTimestamp();

    public void populateExifData(ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
