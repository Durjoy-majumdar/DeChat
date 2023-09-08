package p604m1;

import gy3.C87412m;
import java.util.List;

/* renamed from: m1.c */
public final class C34458c {

    /* renamed from: a */
    public final List<Float> f92759a;

    /* renamed from: b */
    public final float f92760b;

    public C34458c(List<Float> list, float f) {
        C87412m.m108594g(list, "coefficients");
        this.f92759a = list;
        this.f92760b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34458c)) {
            return false;
        }
        C34458c cVar = (C34458c) obj;
        return C87412m.m108589b(this.f92759a, cVar.f92759a) && C87412m.m108589b(Float.valueOf(this.f92760b), Float.valueOf(cVar.f92760b));
    }

    public int hashCode() {
        return (this.f92759a.hashCode() * 31) + Float.floatToIntBits(this.f92760b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.f92759a + ", confidence=" + this.f92760b + ')';
    }
}
