package ej3;

import android.view.animation.Interpolator;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ej3.f */
public final class C31608f {

    /* renamed from: a */
    public float f84461a;

    /* renamed from: b */
    public Interpolator f84462b;

    public C31608f(float f, Interpolator interpolator, int i, C8480h hVar) {
        interpolator = (i & 2) != 0 ? null : interpolator;
        this.f84461a = f;
        this.f84462b = interpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31608f)) {
            return false;
        }
        C31608f fVar = (C31608f) obj;
        return C87412m.m108589b(Float.valueOf(this.f84461a), Float.valueOf(fVar.f84461a)) && C87412m.m108589b(this.f84462b, fVar.f84462b);
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f84461a) * 31;
        Interpolator interpolator = this.f84462b;
        return floatToIntBits + (interpolator == null ? 0 : interpolator.hashCode());
    }

    public String toString() {
        return "FadeData(alpha=" + this.f84461a + ", interpolator=" + this.f84462b + ')';
    }
}
