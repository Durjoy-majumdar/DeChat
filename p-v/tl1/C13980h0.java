package tl1;

import al1.C0082q;
import dj1.C7339i0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C50617o01;
import te3.C52204z21;

/* renamed from: tl1.h0 */
public final class C13980h0 implements C7339i0.C7340a {

    /* renamed from: a */
    public final /* synthetic */ C13985j0 f39265a;

    /* renamed from: tl1.h0$a */
    public static final class C13981a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13985j0 f39266d;

        /* renamed from: e */
        public final /* synthetic */ C52204z21 f39267e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13981a(C13985j0 j0Var, C52204z21 z212) {
            super(0);
            this.f39266d = j0Var;
            this.f39267e = z212;
        }

        public Object invoke() {
            C13998p pVar = this.f39266d.f39273a;
            C52204z21 z212 = this.f39267e;
            pVar.getClass();
            C87412m.m108594g(z212, "lotteryInfo");
            C14012y yVar = pVar.f39321H;
            if (yVar != null) {
                yVar.mo13442d(z212, false);
            }
            return C13598b0.f38549a;
        }
    }

    public C13980h0(C13985j0 j0Var) {
        this.f39265a = j0Var;
    }

    /* renamed from: a */
    public void mo8508a(int i, int i2, String str, C50617o01 o012) {
        C52204z21 z212;
        Class cls = C13022d0.class;
        C87412m.m108594g(o012, "resp");
        if (i == 0 && i2 == 0) {
            ((C13022d0) this.f39265a.f39273a.mo87696x0(cls)).mo12537L3(o012.f138872d);
            ((C13022d0) this.f39265a.f39273a.mo87696x0(cls)).mo12545l3(o012);
            C13985j0 j0Var = this.f39265a;
            j0Var.getClass();
            C61926c.m72668M(new C13978g0(j0Var, true));
            return;
        }
        C0082q qVar = ((C13022d0) this.f39265a.f39273a.mo87696x0(cls)).f37098n;
        if (qVar != null && (z212 = qVar.f509d) != null) {
            C61926c.m72668M(new C13981a(this.f39265a, z212));
        }
    }
}
