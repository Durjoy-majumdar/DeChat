package p1126j5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.size.Size;
import d24.C20419r;
import gy3.C87412m;
import p1106e5.C107228a;
import p864t5.C110905d;
import p906j4.C108561g;
import p972h5.C108136b;
import p972h5.C108140f;
import p972h5.C108143i;
import wx3.C15601d;

/* renamed from: j5.d */
public final class C108573d implements C108576g<Drawable> {

    /* renamed from: a */
    public final C108140f f325028a;

    public C108573d(C108140f fVar) {
        C87412m.m108594g(fVar, "drawableDecoder");
        this.f325028a = fVar;
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        C87412m.m108594g((Drawable) obj, "data");
        return true;
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        C87412m.m108594g((Drawable) obj, "data");
        return null;
    }

    /* renamed from: c */
    public Object mo159570c(C107228a aVar, Object obj, Size size, C108143i iVar, C15601d dVar) {
        Drawable drawable = (Drawable) obj;
        C20419r rVar = C110905d.f331711a;
        C87412m.m108594g(drawable, "<this>");
        boolean z = (drawable instanceof C108561g) || (drawable instanceof VectorDrawable);
        if (z) {
            Bitmap a = this.f325028a.mo158537a(drawable, iVar.f323811b, size, iVar.f323813d, iVar.f323814e);
            Resources resources = iVar.f323810a.getResources();
            C87412m.m108593f(resources, "context.resources");
            drawable = new BitmapDrawable(resources, a);
        }
        return new C108574e(drawable, z, C108136b.MEMORY);
    }
}
