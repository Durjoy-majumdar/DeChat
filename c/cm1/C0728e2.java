package cm1;

import gy3.C87412m;
import te3.C64370fp1;
import tf1.C13914m;

/* renamed from: cm1.e2 */
public final class C0728e2 implements C0740i2 {

    /* renamed from: d */
    public final C64370fp1 f1742d;

    public C0728e2(C64370fp1 fp12) {
        C87412m.m108594g(fp12, "productInfo");
        this.f1742d = fp12;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0728e2.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C0728e2 e2Var = mVar instanceof C0728e2 ? (C0728e2) mVar : null;
        return (e2Var == null || e2Var.f1742d.f183176d != this.f1742d.f183176d) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
