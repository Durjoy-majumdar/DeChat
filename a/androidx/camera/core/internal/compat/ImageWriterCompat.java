package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            ImageWriterCompatApi23Impl.close(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i + ". Version 23 or higher required.");
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    public static ImageWriter newInstance(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i, i2);
        }
        if (i3 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    public static ImageWriter newInstance(Surface surface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return ImageWriterCompatApi23Impl.newInstance(surface, i);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i2 + ". Version 23 or higher required.");
    }
}
