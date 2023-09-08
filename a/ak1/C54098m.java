package ak1;

import ak1.C54067f0;
import cm1.C0748l0;
import gy3.C87412m;

/* renamed from: ak1.m */
public final class C54098m {

    /* renamed from: a */
    public final C0748l0 f151817a;

    /* renamed from: b */
    public final int f151818b;

    /* renamed from: c */
    public final String f151819c;

    /* renamed from: d */
    public final C54067f0.C54078q f151820d;

    /* renamed from: e */
    public final String f151821e;

    /* renamed from: f */
    public final boolean f151822f;

    /* renamed from: g */
    public final String f151823g;

    public C54098m(C0748l0 l0Var, int i, String str, C54067f0.C54078q qVar, String str2, boolean z, String str3) {
        C87412m.m108594g(l0Var, "feed");
        C87412m.m108594g(str, "feedId");
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str2, "commentscene");
        C87412m.m108594g(str3, "nickName");
        this.f151817a = l0Var;
        this.f151818b = i;
        this.f151819c = str;
        this.f151820d = qVar;
        this.f151821e = str2;
        this.f151822f = z;
        this.f151823g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54098m)) {
            return false;
        }
        C54098m mVar = (C54098m) obj;
        return C87412m.m108589b(this.f151817a, mVar.f151817a) && this.f151818b == mVar.f151818b && C87412m.m108589b(this.f151819c, mVar.f151819c) && this.f151820d == mVar.f151820d && C87412m.m108589b(this.f151821e, mVar.f151821e) && this.f151822f == mVar.f151822f && C87412m.m108589b(this.f151823g, mVar.f151823g);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f151817a.hashCode() * 31) + this.f151818b) * 31) + this.f151819c.hashCode()) * 31) + this.f151820d.hashCode()) * 31) + this.f151821e.hashCode()) * 31;
        boolean z = this.f151822f;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f151823g.hashCode();
    }

    public String toString() {
        return "HellLiveItem(feed=" + this.f151817a + ", pos=" + this.f151818b + ", feedId=" + this.f151819c + ", actionType=" + this.f151820d + ", commentscene=" + this.f151821e + ", liveStatus=" + this.f151822f + ", nickName=" + this.f151823g + ')';
    }
}
