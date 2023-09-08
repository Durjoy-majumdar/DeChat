package p643p5;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.PixelSize;
import coil.size.Size;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: p5.a */
public final class C110165a implements C110169f {

    /* renamed from: c */
    public final Context f329577c;

    public C110165a(Context context) {
        C87412m.m108594g(context, "context");
        this.f329577c = context;
    }

    /* renamed from: a */
    public Object mo60229a(C15601d<? super Size> dVar) {
        DisplayMetrics displayMetrics = this.f329577c.getResources().getDisplayMetrics();
        return new PixelSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C110165a) && C87412m.m108589b(this.f329577c, ((C110165a) obj).f329577c));
    }

    public int hashCode() {
        return this.f329577c.hashCode();
    }

    public String toString() {
        return "DisplaySizeResolver(context=" + this.f329577c + ')';
    }
}
