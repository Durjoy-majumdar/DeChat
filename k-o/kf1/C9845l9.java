package kf1;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C49165dm1;
import te3.C64629pl1;
import tf1.C13914m;

/* renamed from: kf1.l9 */
public final class C9845l9 implements C0740i2 {

    /* renamed from: d */
    public C49165dm1 f30420d;

    public C9845l9(C49165dm1 dm12) {
        C87412m.m108594g(dm12, "card");
        this.f30420d = dm12;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2014;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C64629pl1)) {
            return -1;
        }
        C64629pl1 pl12 = (C64629pl1) mVar;
        long j = pl12.f184840d;
        C49165dm1 dm12 = this.f30420d;
        return (j == dm12.f132415d && pl12.f184847n == dm12.f132416e) ? 0 : -1;
    }

    public long getItemId() {
        return (long) ("FinderStreamCardTxtFeed#" + this.f30420d.f132415d).hashCode();
    }
}
