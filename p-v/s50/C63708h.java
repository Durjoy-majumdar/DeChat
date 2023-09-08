package s50;

import ac3.C54011p;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.h */
public final class C63708h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180591d;

    /* renamed from: e */
    public final /* synthetic */ C54011p f180592e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63708h(C110747k kVar, C54011p pVar) {
        super(0);
        this.f180591d = kVar;
        this.f180592e = pVar;
    }

    public Object invoke() {
        C110264g gVar;
        C110760u uVar = this.f180591d.f331238j;
        if (uVar != null) {
            C54011p pVar = this.f180592e;
            C87412m.m108594g(pVar, "effect");
            C110743c0 c0Var = uVar.f331275E;
            if (c0Var != null) {
                c0Var.f331223i = pVar;
                C110742c cVar = c0Var.f331216b;
                if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
                    pVar.mo74671d(gVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
