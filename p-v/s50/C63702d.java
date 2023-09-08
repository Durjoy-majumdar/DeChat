package s50;

import ac3.C54010o;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.d */
public final class C63702d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180579d;

    /* renamed from: e */
    public final /* synthetic */ C54010o f180580e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63702d(C110747k kVar, C54010o oVar) {
        super(0);
        this.f180579d = kVar;
        this.f180580e = oVar;
    }

    public Object invoke() {
        C110264g gVar;
        C110760u uVar = this.f180579d.f331238j;
        if (uVar != null) {
            C54010o oVar = this.f180580e;
            C87412m.m108594g(oVar, "effect");
            C110743c0 c0Var = uVar.f331275E;
            if (c0Var != null) {
                c0Var.f331224j = oVar;
                C110742c cVar = c0Var.f331216b;
                if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
                    oVar.mo74671d(gVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
