package s50;

import ac3.C54009m;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import q00.C110264g;
import rx3.C13598b0;

/* renamed from: s50.e */
public final class C63705e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110747k f180585d;

    /* renamed from: e */
    public final /* synthetic */ C54009m f180586e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63705e(C110747k kVar, C54009m mVar) {
        super(0);
        this.f180585d = kVar;
        this.f180586e = mVar;
    }

    public Object invoke() {
        C110264g gVar;
        C110760u uVar = this.f180585d.f331238j;
        if (uVar != null) {
            C54009m mVar = this.f180586e;
            C87412m.m108594g(mVar, "effect");
            C110743c0 c0Var = uVar.f331275E;
            if (c0Var != null) {
                c0Var.f331225k = mVar;
                C110742c cVar = c0Var.f331216b;
                if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
                    mVar.mo74671d(gVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
