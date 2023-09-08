package q53;

import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import s43.C13624e;
import te3.C51526uc2;

/* renamed from: q53.c0 */
public final class C12053c0 {

    /* renamed from: a */
    public final C13624e f35118a;

    /* renamed from: b */
    public final long f35119b;

    /* renamed from: c */
    public final C51526uc2 f35120c;

    /* renamed from: d */
    public final C32226l<C12049b0, C13598b0> f35121d;

    /* renamed from: e */
    public final C32226l<C12049b0, C13598b0> f35122e;

    /* renamed from: f */
    public final C32226l<C12049b0, C13598b0> f35123f;

    /* renamed from: g */
    public final C32226l<C12049b0, C13598b0> f35124g;

    public C12053c0(C13624e eVar, long j, C51526uc2 uc22, C32226l<? super C12049b0, C13598b0> lVar, C32226l<? super C12049b0, C13598b0> lVar2, C32226l<? super C12049b0, C13598b0> lVar3, C32226l<? super C12049b0, C13598b0> lVar4) {
        C87412m.m108594g(eVar, "consumeParameter");
        C87412m.m108594g(uc22, "priceListResp");
        C87412m.m108594g(lVar, "clickBalanceButtonCallback");
        C87412m.m108594g(lVar2, "clickCloseButtonCallback");
        C87412m.m108594g(lVar3, "clickConsumeButton");
        C87412m.m108594g(lVar4, "clickConsumeTips");
        this.f35118a = eVar;
        this.f35119b = j;
        this.f35120c = uc22;
        this.f35121d = lVar;
        this.f35122e = lVar2;
        this.f35123f = lVar3;
        this.f35124g = lVar4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12053c0)) {
            return false;
        }
        C12053c0 c0Var = (C12053c0) obj;
        return C87412m.m108589b(this.f35118a, c0Var.f35118a) && this.f35119b == c0Var.f35119b && C87412m.m108589b(this.f35120c, c0Var.f35120c) && C87412m.m108589b(this.f35121d, c0Var.f35121d) && C87412m.m108589b(this.f35122e, c0Var.f35122e) && C87412m.m108589b(this.f35123f, c0Var.f35123f) && C87412m.m108589b(this.f35124g, c0Var.f35124g);
    }

    public int hashCode() {
        long j = this.f35119b;
        return (((((((((((this.f35118a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f35120c.hashCode()) * 31) + this.f35121d.hashCode()) * 31) + this.f35122e.hashCode()) * 31) + this.f35123f.hashCode()) * 31) + this.f35124g.hashCode();
    }

    public String toString() {
        return "WeCoinConsumePanelParameter(consumeParameter=" + this.f35118a + ", wecoinBalance=" + this.f35119b + ", priceListResp=" + this.f35120c + ", clickBalanceButtonCallback=" + this.f35121d + ", clickCloseButtonCallback=" + this.f35122e + ", clickConsumeButton=" + this.f35123f + ", clickConsumeTips=" + this.f35124g + ')';
    }
}
