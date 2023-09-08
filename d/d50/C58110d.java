package d50;

import gy3.C87412m;

/* renamed from: d50.d */
public final class C58110d {

    /* renamed from: a */
    public String f166190a;

    public C58110d(String str) {
        C87412m.m108594g(str, "name");
        this.f166190a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58110d) && C87412m.m108589b(this.f166190a, ((C58110d) obj).f166190a);
    }

    public int hashCode() {
        return this.f166190a.hashCode();
    }

    public String toString() {
        return "LiveJumpInfo(name=" + this.f166190a + ')';
    }
}
