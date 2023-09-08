package cm1;

import gy3.C87412m;
import te3.C51773w21;
import tf1.C13914m;

/* renamed from: cm1.c1 */
public final class C0718c1 implements C0740i2 {

    /* renamed from: d */
    public final C51773w21 f1725d;

    public C0718c1(C51773w21 w212) {
        C87412m.m108594g(w212, "winnerInfo");
        this.f1725d = w212;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0718c1.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C51773w21 w212 = mVar instanceof C51773w21 ? (C51773w21) mVar : null;
        return (w212 == null || !C87412m.m108589b(w212.f143824d, this.f1725d.f143824d) || !C87412m.m108589b(w212.f143825e, this.f1725d.f143825e)) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
