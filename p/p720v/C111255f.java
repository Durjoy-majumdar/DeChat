package p720v;

import a14.C0000n0;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C108515x;
import p175j0.C60655g0;
import p257w.C37892b0;
import p560i2.C33181m;
import p721v0.C65503j;
import p868x0.C111979d;
import rx3.C13598b0;
import wx3.C66217g;

/* renamed from: v.f */
public final class C111255f extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<C33181m, C33181m, C13598b0> f333134d;

    /* renamed from: e */
    public final /* synthetic */ C37892b0<C33181m> f333135e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111255f(C32227p<? super C33181m, ? super C33181m, C13598b0> pVar, C37892b0<C33181m> b0Var) {
        super(3);
        this.f333134d = pVar;
        this.f333135e = b0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(-843180607);
        hVar.mo51557H(773894976);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i = C108504h.f324828a;
        Object obj4 = C108504h.C60656a.f172772a;
        if (q == obj4) {
            C108515x xVar = new C108515x(C60655g0.m70937h(C66217g.f190253d, hVar));
            hVar.mo51553F(xVar);
            q = xVar;
        }
        hVar.mo51565P();
        C0000n0 n0Var = ((C108515x) q).f324838d;
        hVar.mo51565P();
        C37892b0<C33181m> b0Var = this.f333135e;
        hVar.mo51557H(1157296644);
        boolean x = hVar.mo51619x(n0Var);
        Object q2 = hVar.mo51606q();
        if (x || q2 == obj4) {
            q2 = new C111261i0(b0Var, n0Var);
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C111261i0 i0Var = (C111261i0) q2;
        i0Var.f333144f = this.f333134d;
        C65503j i0 = C111979d.m152691b(jVar).mo74972i0(i0Var);
        hVar.mo51565P();
        return i0;
    }
}
