package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

final class ImageWriterCompatApi23Impl {
    private ImageWriterCompatApi23Impl() {
    }

    public static void close(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter newInstance(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
