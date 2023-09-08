package b03;

import gy3.C8480h;
import gy3.C87412m;
import qy2.C77448f0;

/* renamed from: b03.h */
public final class C67131h {

    /* renamed from: a */
    public boolean f192744a;

    /* renamed from: b */
    public C77448f0.C77449a f192745b;

    public C67131h() {
        this(false, (C77448f0.C77449a) null, 3, (C8480h) null);
    }

    public C67131h(boolean z, C77448f0.C77449a aVar, int i, C8480h hVar) {
        z = (i & 1) != 0 ? false : z;
        aVar = (i & 2) != 0 ? null : aVar;
        this.f192744a = z;
        this.f192745b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67131h)) {
            return false;
        }
        C67131h hVar = (C67131h) obj;
        return this.f192744a == hVar.f192744a && C87412m.m108589b(this.f192745b, hVar.f192745b);
    }

    public int hashCode() {
        boolean z = this.f192744a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C77448f0.C77449a aVar = this.f192745b;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "SquareRedDotResult(isShow=" + this.f192744a + ", durationData=" + this.f192745b + ')';
    }
}
