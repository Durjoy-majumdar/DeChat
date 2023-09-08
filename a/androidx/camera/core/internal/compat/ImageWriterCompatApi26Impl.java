package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        Class<ImageWriter> cls = ImageWriter.class;
        try {
            Class cls2 = Integer.TYPE;
            sNewInstanceMethod = cls.getMethod("newInstance", new Class[]{Surface.class, cls2, cls2});
        } catch (NoSuchMethodException unused) {
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    public static ImageWriter newInstance(Surface surface, int i, int i2) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object invoke = sNewInstanceMethod.invoke((Object) null, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)});
                invoke.getClass();
                return (ImageWriter) invoke;
            } catch (IllegalAccessException | InvocationTargetException e) {
                th = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
