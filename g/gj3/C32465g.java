package gj3;

import gy3.C87412m;

/* renamed from: gj3.g */
public final class C32465g {

    /* renamed from: a */
    public String f86259a;

    /* renamed from: b */
    public Object f86260b;

    public C32465g(String str, Object obj) {
        C87412m.m108594g(str, "transitionName");
        this.f86259a = str;
        this.f86260b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32465g)) {
            return false;
        }
        C32465g gVar = (C32465g) obj;
        return C87412m.m108589b(this.f86259a, gVar.f86259a) && C87412m.m108589b(this.f86260b, gVar.f86260b);
    }

    public int hashCode() {
        int hashCode = this.f86259a.hashCode() * 31;
        Object obj = this.f86260b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "TransitionInfo(transitionName=" + this.f86259a + ", extraInfo=" + this.f86260b + ')';
    }
}
