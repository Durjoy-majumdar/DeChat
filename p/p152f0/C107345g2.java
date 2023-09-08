package p152f0;

import a14.C0000n0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1165z.C112527l;
import p1166z0.C112539e;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C108515x;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p190l1.C109099h0;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66217g;

/* renamed from: f0.g2 */
public final class C107345g2 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C112539e, C13598b0> f321162d;

    /* renamed from: e */
    public final /* synthetic */ C112527l f321163e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107345g2(C32226l<? super C112539e, C13598b0> lVar, C112527l lVar2) {
        super(3);
        this.f321162d = lVar;
        this.f321163e = lVar2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(-102778667);
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
        hVar.mo51557H(-492369756);
        Object q2 = hVar.mo51606q();
        if (q2 == obj4) {
            q2 = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q2;
        C60667k2<T> e = C108500f2.m146998e(this.f321162d, hVar, 0);
        C112527l lVar = this.f321163e;
        C60655g0.m70930a(lVar, new C107322e2(y0Var, lVar), hVar, 0);
        int i2 = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C112527l lVar2 = this.f321163e;
        C65503j a = C109099h0.m148137a(aVar, lVar2, new C107337f2(n0Var, y0Var, lVar2, e, (C15601d<? super C107337f2>) null));
        hVar.mo51565P();
        return a;
    }
}
