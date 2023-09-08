package ej3;

import android.view.animation.Interpolator;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ej3.m */
public final class C45675m extends C45663b {
    public C45675m(float f, float f2, C45676n nVar, int i, C8480h hVar) {
        float f3 = (i & 1) != 0 ? 0.0f : f;
        float f4 = (i & 2) != 0 ? 0.0f : f2;
        C45676n nVar2 = (i & 4) != 0 ? C45673k.f123480a : nVar;
        C87412m.m108594g(nVar2, "scaleType");
        this.f123472b = new C45671i(f3, f4, (Interpolator) null, nVar2, 4, (C8480h) null);
    }
}
