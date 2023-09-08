package p436a1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import gy3.C87412m;
import p450b1.C103979c;
import p450b1.C103981e;

/* renamed from: a1.e0 */
public final class C103231e0 {
    /* renamed from: a */
    public static C103229d0 m136644a(int i, int i2, int i3, boolean z, C103979c cVar, int i4, Object obj) {
        Bitmap bitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            C103981e eVar = C103981e.f307538a;
            cVar = C103981e.f307541d;
        }
        C87412m.m108594g(cVar, "colorSpace");
        Bitmap.Config c = C103230e.m136643c(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = C103247m.m136703c(i, i2, i3, z, cVar);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, c);
            C87412m.m108593f(bitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmap.setHasAlpha(z);
        }
        return new C103228d(bitmap);
    }
}
