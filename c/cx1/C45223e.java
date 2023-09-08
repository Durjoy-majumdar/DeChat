package cx1;

import gy3.C87412m;

/* renamed from: cx1.e */
public final class C45223e {

    /* renamed from: a */
    public final String f122555a;

    /* renamed from: b */
    public final String f122556b;

    /* renamed from: c */
    public final String f122557c;

    public C45223e(String str, String str2, String str3) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "nickName");
        C87412m.m108594g(str3, "avatar");
        this.f122555a = str;
        this.f122556b = str2;
        this.f122557c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45223e)) {
            return false;
        }
        C45223e eVar = (C45223e) obj;
        return C87412m.m108589b(this.f122555a, eVar.f122555a) && C87412m.m108589b(this.f122556b, eVar.f122556b) && C87412m.m108589b(this.f122557c, eVar.f122557c);
    }

    public int hashCode() {
        return (((this.f122555a.hashCode() * 31) + this.f122556b.hashCode()) * 31) + this.f122557c.hashCode();
    }

    public String toString() {
        return "SimpleUserInfo(id=" + this.f122555a + ", nickName=" + this.f122556b + ", avatar=" + this.f122557c + ')';
    }
}
