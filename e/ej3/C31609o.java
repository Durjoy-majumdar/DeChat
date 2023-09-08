package ej3;

import android.view.animation.Interpolator;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ej3.o */
public final class C31609o {

    /* renamed from: a */
    public C32226l<? super Float, Float> f84463a;

    /* renamed from: b */
    public C32226l<? super Float, Float> f84464b;

    public C31609o(C32226l lVar, C32226l lVar2, Interpolator interpolator, int i, C8480h hVar) {
        C87412m.m108594g(lVar, "slideX");
        C87412m.m108594g(lVar2, "slideY");
        this.f84463a = lVar;
        this.f84464b = lVar2;
    }

    public String toString() {
        return "SlideData@" + hashCode();
    }
}
