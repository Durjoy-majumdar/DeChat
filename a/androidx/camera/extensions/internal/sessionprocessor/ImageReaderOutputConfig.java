package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;

public interface ImageReaderOutputConfig extends Camera2OutputConfig {
    int getImageFormat();

    int getMaxImages();

    Size getSize();
}
