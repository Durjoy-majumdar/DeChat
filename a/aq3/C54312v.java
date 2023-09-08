package aq3;

import androidx.compose.p002ui.platform.C103645l0;
import bp3.C54528r;
import fq3.C59270b;
import fy3.C32227p;
import gq3.C107902e;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C59480d;
import p175j0.C108504h;
import p175j0.C60667k2;
import p869y0.C66478i;
import rx3.C13598b0;

/* renamed from: aq3.v */
public final class C54312v extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54301o f152432d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54312v(C54301o oVar) {
        super(2);
        this.f152432d = oVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C60667k2<ArrayList<C59480d>> g3 = this.f152432d.mo75099c3().mo84641g3(hVar, 8);
            C60667k2<C59270b> l3 = this.f152432d.mo75099c3().mo84645l3(hVar, 8);
            C60667k2<String> k3 = this.f152432d.mo75099c3().mo84644k3(hVar, 8);
            C54301o oVar = this.f152432d;
            oVar.f152416i = new C54528r(oVar.getActivity(), new C54308r((C66478i) hVar.mo51598m(C103645l0.f306125f)));
            C59629h c3 = this.f152432d.mo75099c3();
            C87412m.m108593f(c3, "viewModel");
            C107902e.m146197b(c3, new C54309s(this.f152432d), new C54310t(this.f152432d), new C54311u(this.f152432d, g3, l3, k3), hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
