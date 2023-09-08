package cm1;

import gy3.C87412m;
import te3.C49088d31;
import tf1.C13914m;

/* renamed from: cm1.b1 */
public final class C0713b1 implements C0740i2 {

    /* renamed from: d */
    public final C49088d31 f1710d;

    public C0713b1(C49088d31 d312) {
        C87412m.m108594g(d312, "lotteryRecord");
        this.f1710d = d312;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0713b1.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C0713b1 b1Var = mVar instanceof C0713b1 ? (C0713b1) mVar : null;
        if (b1Var == null) {
            return -1;
        }
        C49088d31 d312 = b1Var.f1710d;
        long j = d312.f132089f;
        C49088d31 d313 = this.f1710d;
        if (j == d313.f132089f && d312.f132090g == d313.f132090g && C87412m.m108589b(d312.f132091h, d313.f132091h)) {
            return 0;
        }
        return this.f1710d.f132087d > b1Var.f1710d.f132087d ? 1 : -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
