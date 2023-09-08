package p864t5;

import android.graphics.Bitmap;
import android.os.Build;
import gy3.C87412m;

/* renamed from: t5.a */
public final class C110902a {
    /* renamed from: a */
    public static final int m151198a(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "<this>");
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                return m151199b(bitmap.getConfig()) * width * height;
            }
        } else {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
    }

    /* renamed from: b */
    public static final int m151199b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    /* renamed from: c */
    public static final boolean m151200c(Bitmap.Config config) {
        C87412m.m108594g(config, "<this>");
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }
}
