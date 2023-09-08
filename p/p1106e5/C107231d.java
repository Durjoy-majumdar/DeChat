package p1106e5;

import android.graphics.Bitmap;
import gy3.C87412m;
import p864t5.C110902a;

/* renamed from: e5.d */
public final class C107231d implements C107228a {
    /* renamed from: a */
    public void mo157692a(int i) {
    }

    /* renamed from: b */
    public void mo157693b(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        bitmap.recycle();
    }

    /* renamed from: c */
    public Bitmap mo157694c(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        return mo157695d(i, i2, config);
    }

    /* renamed from: d */
    public Bitmap mo157695d(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        if (!C110902a.m151200c(config)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            C87412m.m108593f(createBitmap, "createBitmap(width, height, config)");
            return createBitmap;
        }
        throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
    }
}
