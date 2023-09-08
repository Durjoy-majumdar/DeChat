package ak1;

import ak1.C54067f0;
import gy3.C87412m;
import te3.C48868bk1;

/* renamed from: ak1.n */
public final class C54100n {

    /* renamed from: a */
    public final C48868bk1 f151849a;

    /* renamed from: b */
    public final int f151850b;

    /* renamed from: c */
    public final String f151851c;

    /* renamed from: d */
    public final C54067f0.C54078q f151852d;

    /* renamed from: e */
    public final String f151853e;

    /* renamed from: f */
    public final boolean f151854f;

    /* renamed from: g */
    public final String f151855g;

    public C54100n(C48868bk1 bk12, int i, String str, C54067f0.C54078q qVar, String str2, boolean z, String str3) {
        C87412m.m108594g(bk12, "contact");
        C87412m.m108594g(str, "feedId");
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str2, "commentscene");
        C87412m.m108594g(str3, "nickName");
        this.f151849a = bk12;
        this.f151850b = i;
        this.f151851c = str;
        this.f151852d = qVar;
        this.f151853e = str2;
        this.f151854f = z;
        this.f151855g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54100n)) {
            return false;
        }
        C54100n nVar = (C54100n) obj;
        return C87412m.m108589b(this.f151849a, nVar.f151849a) && this.f151850b == nVar.f151850b && C87412m.m108589b(this.f151851c, nVar.f151851c) && this.f151852d == nVar.f151852d && C87412m.m108589b(this.f151853e, nVar.f151853e) && this.f151854f == nVar.f151854f && C87412m.m108589b(this.f151855g, nVar.f151855g);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f151849a.hashCode() * 31) + this.f151850b) * 31) + this.f151851c.hashCode()) * 31) + this.f151852d.hashCode()) * 31) + this.f151853e.hashCode()) * 31;
        boolean z = this.f151854f;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f151855g.hashCode();
    }

    public String toString() {
        return "HellLiveMixSearchItem(contact=" + this.f151849a + ", pos=" + this.f151850b + ", feedId=" + this.f151851c + ", actionType=" + this.f151852d + ", commentscene=" + this.f151853e + ", liveStatus=" + this.f151854f + ", nickName=" + this.f151855g + ')';
    }
}
