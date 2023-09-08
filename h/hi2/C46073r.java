package hi2;

import gy3.C87412m;

/* renamed from: hi2.r */
public final class C46073r {

    /* renamed from: a */
    public final boolean f124221a;

    /* renamed from: b */
    public final String f124222b;

    public C46073r(boolean z, String str) {
        C87412m.m108594g(str, "extData");
        this.f124221a = z;
        this.f124222b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46073r)) {
            return false;
        }
        C46073r rVar = (C46073r) obj;
        return this.f124221a == rVar.f124221a && C87412m.m108589b(this.f124222b, rVar.f124222b);
    }

    public int hashCode() {
        boolean z = this.f124221a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f124222b.hashCode();
    }

    public String toString() {
        return "Result(exist=" + this.f124221a + ", extData=" + this.f124222b + ')';
    }
}
