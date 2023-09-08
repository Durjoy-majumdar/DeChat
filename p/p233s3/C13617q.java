package p233s3;

import gy3.C87412m;

/* renamed from: s3.q */
public final class C13617q {

    /* renamed from: a */
    public final String f38584a;

    /* renamed from: b */
    public final String f38585b;

    public C13617q(String str, String str2) {
        C87412m.m108594g(str, "stateName");
        C87412m.m108594g(str2, "state");
        this.f38584a = str;
        this.f38585b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C13617q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type androidx.metrics.performance.StateInfo");
        C13617q qVar = (C13617q) obj;
        return C87412m.m108589b(this.f38584a, qVar.f38584a) && C87412m.m108589b(this.f38585b, qVar.f38585b);
    }

    public int hashCode() {
        return (this.f38584a.hashCode() * 31) + this.f38585b.hashCode();
    }

    public String toString() {
        return this.f38584a + ": " + this.f38585b;
    }
}
