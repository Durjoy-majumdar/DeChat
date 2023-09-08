package e42;

import gy3.C87412m;

/* renamed from: e42.q */
public final class C86437q extends C86434m {

    /* renamed from: a */
    public final String f251232a;

    /* renamed from: b */
    public final String f251233b;

    public C86437q(String str, String str2) {
        C87412m.m108594g(str, "pkgPath");
        C87412m.m108594g(str2, "mainScriptName");
        this.f251232a = str;
        this.f251233b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86437q)) {
            return false;
        }
        C86437q qVar = (C86437q) obj;
        return C87412m.m108589b(this.f251232a, qVar.f251232a) && C87412m.m108589b(this.f251233b, qVar.f251233b);
    }

    public int hashCode() {
        return (this.f251232a.hashCode() * 31) + this.f251233b.hashCode();
    }

    public String toString() {
        return "MBWxaPkgScriptDescriptor(pkgPath=" + this.f251232a + ", mainScriptName=" + this.f251233b + ')';
    }
}
