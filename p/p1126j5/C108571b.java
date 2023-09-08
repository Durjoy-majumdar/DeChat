package p1126j5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.size.Size;
import gy3.C87412m;
import p1106e5.C107228a;
import p972h5.C108136b;
import p972h5.C108143i;
import wx3.C15601d;

/* renamed from: j5.b */
public final class C108571b implements C108576g<Bitmap> {
    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        C87412m.m108594g((Bitmap) obj, "data");
        return true;
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        C87412m.m108594g((Bitmap) obj, "data");
        return null;
    }

    /* renamed from: c */
    public Object mo159570c(C107228a aVar, Object obj, Size size, C108143i iVar, C15601d dVar) {
        Resources resources = iVar.f323810a.getResources();
        C87412m.m108593f(resources, "context.resources");
        return new C108574e(new BitmapDrawable(resources, (Bitmap) obj), false, C108136b.MEMORY);
    }
}
