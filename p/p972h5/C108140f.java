package p972h5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import d24.C20419r;
import gy3.C87412m;
import p1106e5.C107228a;
import p643p5.C110168e;
import p864t5.C110902a;
import p864t5.C110905d;

/* renamed from: h5.f */
public final class C108140f {

    /* renamed from: a */
    public final C107228a f323804a;

    public C108140f(C107228a aVar) {
        C87412m.m108594g(aVar, "bitmapPool");
        this.f323804a = aVar;
    }

    /* renamed from: a */
    public final Bitmap mo158537a(Drawable drawable, Bitmap.Config config, Size size, C110168e eVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(config, "config");
        C87412m.m108594g(size, "size");
        C87412m.m108594g(eVar, "scale");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            C87412m.m108593f(bitmap3, "bitmap");
            boolean z2 = true;
            if (bitmap3.getConfig() == (C110902a.m151200c(config) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z && !(size instanceof OriginalSize) && !C87412m.m108589b(size, C108138d.m146472b(bitmap3.getWidth(), bitmap3.getHeight(), size, eVar))) {
                    z2 = false;
                }
                if (z2) {
                    return bitmap3;
                }
            }
        }
        Drawable mutate = drawable.mutate();
        C87412m.m108593f(mutate, "drawable.mutate()");
        C20419r rVar = C110905d.f331711a;
        boolean z3 = mutate instanceof BitmapDrawable;
        Integer num = null;
        BitmapDrawable bitmapDrawable = z3 ? (BitmapDrawable) mutate : null;
        Integer valueOf = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? null : Integer.valueOf(bitmap2.getWidth());
        int intrinsicWidth = valueOf == null ? mutate.getIntrinsicWidth() : valueOf.intValue();
        int i = 512;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z3 ? (BitmapDrawable) mutate : null;
        if (!(bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null)) {
            num = Integer.valueOf(bitmap.getHeight());
        }
        int intrinsicHeight = num == null ? mutate.getIntrinsicHeight() : num.intValue();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        PixelSize b = C108138d.m146472b(intrinsicWidth, i, size, eVar);
        int i2 = b.f309028d;
        int i3 = b.f309029e;
        C107228a aVar = this.f323804a;
        if (C110902a.m151200c(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c = aVar.mo157694c(i2, i3, config);
        Rect bounds = mutate.getBounds();
        C87412m.m108593f(bounds, "bounds");
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        mutate.setBounds(0, 0, i2, i3);
        mutate.draw(new Canvas(c));
        mutate.setBounds(i4, i5, i6, i7);
        return c;
    }
}
