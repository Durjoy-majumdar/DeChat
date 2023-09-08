package p000ag;

import gy3.C87412m;

/* renamed from: ag.k */
public final class C0038k {

    /* renamed from: a */
    public String f45a;

    /* renamed from: b */
    public int f46b;

    /* renamed from: c */
    public String f47c;

    public C0038k(String str, int i, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "moduleName");
        this.f45a = str;
        this.f46b = i;
        this.f47c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0038k)) {
            return false;
        }
        C0038k kVar = (C0038k) obj;
        return C87412m.m108589b(this.f45a, kVar.f45a) && this.f46b == kVar.f46b && C87412m.m108589b(this.f47c, kVar.f47c);
    }

    public int hashCode() {
        return (((this.f45a.hashCode() * 31) + this.f46b) * 31) + this.f47c.hashCode();
    }

    public String toString() {
        return "PlayablePkgInfo(appId=" + this.f45a + ", versionType=" + this.f46b + ", moduleName=" + this.f47c + ')';
    }
}
