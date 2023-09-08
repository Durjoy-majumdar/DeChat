package ej3;

import android.view.animation.Interpolator;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ej3.i */
public final class C45671i {

    /* renamed from: a */
    public float f123475a;

    /* renamed from: b */
    public float f123476b;

    /* renamed from: c */
    public Interpolator f123477c;

    /* renamed from: d */
    public C45676n f123478d;

    public C45671i(float f, float f2, Interpolator interpolator, C45676n nVar, int i, C8480h hVar) {
        interpolator = (i & 4) != 0 ? null : interpolator;
        nVar = (i & 8) != 0 ? C45673k.f123480a : nVar;
        C87412m.m108594g(nVar, "scaleType");
        this.f123475a = f;
        this.f123476b = f2;
        this.f123477c = interpolator;
        this.f123478d = nVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45671i)) {
            return false;
        }
        C45671i iVar = (C45671i) obj;
        return C87412m.m108589b(Float.valueOf(this.f123475a), Float.valueOf(iVar.f123475a)) && C87412m.m108589b(Float.valueOf(this.f123476b), Float.valueOf(iVar.f123476b)) && C87412m.m108589b(this.f123477c, iVar.f123477c) && C87412m.m108589b(this.f123478d, iVar.f123478d);
    }

    public int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.f123475a) * 31) + Float.floatToIntBits(this.f123476b)) * 31;
        Interpolator interpolator = this.f123477c;
        return ((floatToIntBits + (interpolator == null ? 0 : interpolator.hashCode())) * 31) + this.f123478d.hashCode();
    }

    public String toString() {
        return "ScaleData(scaleX=" + this.f123475a + ", scaleY=" + this.f123476b + ", interpolator=" + this.f123477c + ", scaleType=" + this.f123478d + ')';
    }
}
