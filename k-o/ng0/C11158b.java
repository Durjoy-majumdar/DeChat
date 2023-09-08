package ng0;

import gy3.C87412m;

/* renamed from: ng0.b */
public final class C11158b {

    /* renamed from: a */
    public final C11159a f32939a;

    /* renamed from: b */
    public final int f32940b;

    /* renamed from: c */
    public final String f32941c;

    /* renamed from: d */
    public final String f32942d;

    /* renamed from: e */
    public final String f32943e;

    /* renamed from: ng0.b$a */
    public enum C11159a {
        JsApiAgree,
        CgiEnd
    }

    public C11158b(C11159a aVar, int i, String str, String str2, String str3) {
        C87412m.m108594g(aVar, "type");
        C87412m.m108594g(str, "customInfo");
        C87412m.m108594g(str2, "ticket");
        C87412m.m108594g(str3, "policyList");
        this.f32939a = aVar;
        this.f32940b = i;
        this.f32941c = str;
        this.f32942d = str2;
        this.f32943e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11158b)) {
            return false;
        }
        C11158b bVar = (C11158b) obj;
        return this.f32939a == bVar.f32939a && this.f32940b == bVar.f32940b && C87412m.m108589b(this.f32941c, bVar.f32941c) && C87412m.m108589b(this.f32942d, bVar.f32942d) && C87412m.m108589b(this.f32943e, bVar.f32943e);
    }

    public int hashCode() {
        return (((((((this.f32939a.hashCode() * 31) + this.f32940b) * 31) + this.f32941c.hashCode()) * 31) + this.f32942d.hashCode()) * 31) + this.f32943e.hashCode();
    }

    public String toString() {
        return "AccountPolicyAgreeEventObj(type=" + this.f32939a + ", isAgree=" + this.f32940b + ", customInfo=" + this.f32941c + ", ticket=" + this.f32942d + ", policyList=" + this.f32943e + ')';
    }
}
