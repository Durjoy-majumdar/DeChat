package p864t5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import gy3.C87412m;
import p1126j5.C108576g;
import p1144q5.C110366b;
import p1144q5.C110367c;
import p632o5.C109956h;
import p643p5.C110165a;
import p643p5.C110169f;
import p643p5.C110170g;
import rx3.C13603j;
import rx3.C13604l;

/* renamed from: t5.e */
public final class C110906e {
    /* renamed from: a */
    public static final <T> C108576g<T> m151210a(C109956h hVar, T t) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(t, "data");
        C13604l<C108576g<?>, Class<?>> lVar = hVar.f328999h;
        if (lVar == null) {
            return null;
        }
        C108576g<T> gVar = (C108576g) lVar.f38555d;
        if (((Class) lVar.f38556e).isAssignableFrom(t.getClass())) {
            return gVar;
        }
        throw new IllegalStateException((gVar.getClass().getName() + " cannot handle data with type " + t.getClass().getName() + '.').toString());
    }

    /* renamed from: b */
    public static final boolean m151211b(C109956h hVar) {
        C87412m.m108594g(hVar, "<this>");
        int ordinal = hVar.f329009r.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            C110366b bVar = hVar.f328994c;
            if ((bVar instanceof C110367c) && (((C110367c) bVar).getView() instanceof ImageView)) {
                C110169f fVar = hVar.f329005n;
                if ((fVar instanceof C110170g) && ((C110170g) fVar).getView() == ((C110367c) hVar.f328994c).getView()) {
                    return true;
                }
            }
            return hVar.f328990G.f328968b == null && (hVar.f329005n instanceof C110165a);
        }
        throw new C13603j();
    }

    /* renamed from: c */
    public static final Drawable m151212c(C109956h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        C87412m.m108594g(hVar, "<this>");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C110904c.m151204a(hVar.f328992a, num.intValue());
    }
}
