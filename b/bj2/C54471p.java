package bj2;

import gy3.C87412m;
import zb2.C66777a;

/* renamed from: bj2.p */
public final class C54471p extends C66777a<C54471p> {

    /* renamed from: d */
    public final C54473v f152734d;

    public C54471p(C54473v vVar) {
        C87412m.m108594g(vVar, "info");
        this.f152734d = vVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        String l2 = this.f152734d.mo90394l2();
        C87412m.m108593f(l2, "info.id");
        return l2;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C54471p pVar = (C54471p) obj;
        C87412m.m108594g(pVar, "other");
        return C87412m.m108597j(this.f152734d.getTimestamp(), pVar.f152734d.getTimestamp());
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C54471p pVar = (C54471p) obj;
        C87412m.m108594g(pVar, "other");
        return C87412m.m108589b(this.f152734d.mo90395m2(), pVar.f152734d.mo90395m2()) && this.f152734d.getTimestamp() == pVar.f152734d.getTimestamp();
    }
}
