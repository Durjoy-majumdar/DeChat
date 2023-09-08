package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;

public interface ImageReference {
    boolean decrement();

    Image get();

    boolean increment();
}
