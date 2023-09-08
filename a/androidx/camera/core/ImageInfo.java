package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

public interface ImageInfo {
    int getRotationDegrees();

    Matrix getSensorToBufferTransformMatrix();

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}
