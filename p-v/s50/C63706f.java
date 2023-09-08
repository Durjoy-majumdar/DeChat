package s50;

import ac3.C0031n;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.f */
public final class C63706f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180587d;

    /* renamed from: e */
    public final /* synthetic */ C0031n f180588e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63706f(C110747k kVar, C0031n nVar) {
        super(0);
        this.f180587d = kVar;
        this.f180588e = nVar;
    }

    public Object invoke() {
        C110264g gVar;
        C110760u uVar = this.f180587d.f331238j;
        if (uVar != null) {
            C0031n nVar = this.f180588e;
            C87412m.m108594g(nVar, "effect");
            C110743c0 c0Var = uVar.f331275E;
            if (c0Var != null) {
                c0Var.f331226l = nVar;
                C110742c cVar = c0Var.f331216b;
                if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
                    nVar.mo74671d(gVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
