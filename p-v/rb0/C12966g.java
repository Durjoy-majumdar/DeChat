package rb0;

import gy3.C87412m;

/* renamed from: rb0.g */
public final class C12966g {

    /* renamed from: a */
    public final long f36986a;

    /* renamed from: b */
    public final String f36987b;

    /* renamed from: c */
    public final String f36988c;

    /* renamed from: d */
    public final int f36989d;

    public C12966g(long j, String str, String str2, int i) {
        C87412m.m108594g(str, "frameSetName");
        C87412m.m108594g(str2, "frameSetData");
        this.f36986a = j;
        this.f36987b = str;
        this.f36988c = str2;
        this.f36989d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12966g)) {
            return false;
        }
        C12966g gVar = (C12966g) obj;
        return this.f36986a == gVar.f36986a && C87412m.m108589b(this.f36987b, gVar.f36987b) && C87412m.m108589b(this.f36988c, gVar.f36988c) && this.f36989d == gVar.f36989d;
    }

    public int hashCode() {
        long j = this.f36986a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.f36987b.hashCode()) * 31) + this.f36988c.hashCode()) * 31) + this.f36989d;
    }

    public String toString() {
        return "BizDynamicCardInfo(msgId=" + this.f36986a + ", frameSetName=" + this.f36987b + ", frameSetData=" + this.f36988c + ", pos=" + this.f36989d + ')';
    }
}
