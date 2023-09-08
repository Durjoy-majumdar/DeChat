package e70;

import gy3.C87412m;

/* renamed from: e70.a */
public final class C7603a {

    /* renamed from: a */
    public final String f25870a;

    public C7603a(String str) {
        C87412m.m108594g(str, "apiName");
        this.f25870a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7603a) && C87412m.m108589b(this.f25870a, ((C7603a) obj).f25870a);
    }

    public int hashCode() {
        return this.f25870a.hashCode();
    }

    public String toString() {
        return "FlutterCoverViewAttribute(apiName=" + this.f25870a + ')';
    }
}
