package p436a1;

import android.graphics.Bitmap;
import android.os.Build;
import gy3.C87412m;

/* renamed from: a1.e */
public final class C103230e {
    /* renamed from: a */
    public static final Bitmap m136641a(C103229d0 d0Var) {
        C87412m.m108594g(d0Var, "<this>");
        if (d0Var instanceof C103228d) {
            return ((C103228d) d0Var).f304433a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: b */
    public static final C103229d0 m136642b(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "<this>");
        return new C103228d(bitmap);
    }

    /* renamed from: c */
    public static final Bitmap.Config m136643c(int i) {
        boolean z = false;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            if (i == 3) {
                return Bitmap.Config.RGBA_F16;
            }
        }
        if (i2 >= 26) {
            if (i == 4) {
                z = true;
            }
            if (z) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }
}
