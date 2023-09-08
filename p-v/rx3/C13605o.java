package rx3;

import gy3.C87412m;
import java.io.Serializable;

/* renamed from: rx3.o */
public final class C13605o<A, B, C> implements Serializable {

    /* renamed from: d */
    public final A f38557d;

    /* renamed from: e */
    public final B f38558e;

    /* renamed from: f */
    public final C f38559f;

    public C13605o(A a, B b, C c) {
        this.f38557d = a;
        this.f38558e = b;
        this.f38559f = c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13605o)) {
            return false;
        }
        C13605o oVar = (C13605o) obj;
        return C87412m.m108589b(this.f38557d, oVar.f38557d) && C87412m.m108589b(this.f38558e, oVar.f38558e) && C87412m.m108589b(this.f38559f, oVar.f38559f);
    }

    public int hashCode() {
        A a = this.f38557d;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f38558e;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f38559f;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.f38557d + ", " + this.f38558e + ", " + this.f38559f + ')';
    }
}
