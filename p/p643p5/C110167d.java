package p643p5;

import a14.C53921m;
import android.view.View;
import android.view.ViewTreeObserver;
import coil.size.PixelSize;
import coil.size.Size;
import gy3.C87412m;
import p643p5.C110170g;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: p5.d */
public final class C110167d<T extends View> implements C110170g<T> {

    /* renamed from: c */
    public final T f329582c;

    /* renamed from: d */
    public final boolean f329583d;

    public C110167d(T t, boolean z) {
        C87412m.m108594g(t, "view");
        this.f329582c = t;
        this.f329583d = z;
    }

    /* renamed from: a */
    public Object mo60229a(C15601d<? super Size> dVar) {
        PixelSize b = C110170g.C110171a.m149769b(this);
        if (b != null) {
            return b;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        C110173i iVar = new C110173i(this, viewTreeObserver, mVar);
        viewTreeObserver.addOnPreDrawListener(iVar);
        mVar.mo74599v(new C110172h(this, viewTreeObserver, iVar));
        return mVar.mo74608o();
    }

    /* renamed from: b */
    public boolean mo161581b() {
        return this.f329583d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C110167d) {
            C110167d dVar = (C110167d) obj;
            return C87412m.m108589b(this.f329582c, dVar.f329582c) && this.f329583d == dVar.f329583d;
        }
    }

    public T getView() {
        return this.f329582c;
    }

    public int hashCode() {
        return (this.f329582c.hashCode() * 31) + (this.f329583d ? 1231 : 1237);
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f329582c + ", subtractPadding=" + this.f329583d + ')';
    }
}
