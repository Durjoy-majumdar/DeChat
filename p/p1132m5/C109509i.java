package p1132m5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import gy3.C87412m;
import p1106e5.C107230c;
import p632o5.C109963m;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: m5.i */
public final class C109509i extends C109528s {

    /* renamed from: a */
    public final C107230c f327749a;

    public C109509i(C107230c cVar) {
        C87412m.m108594g(cVar, "referenceCounter");
        this.f327749a = cVar;
    }

    /* renamed from: e */
    public Object mo160739e(C109963m mVar, C15601d<? super C13598b0> dVar) {
        C107230c cVar = this.f327749a;
        Drawable a = mVar.mo161275a();
        Bitmap bitmap = null;
        BitmapDrawable bitmapDrawable = a instanceof BitmapDrawable ? (BitmapDrawable) a : null;
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        if (bitmap != null) {
            cVar.mo157701a(bitmap, false);
        }
        return C13598b0.f38549a;
    }
}
