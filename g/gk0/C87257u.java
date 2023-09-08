package gk0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lp3.C46888b;
import rx3.C13598b0;
import zq0.C91891k0;

/* renamed from: gk0.u */
public final class C87257u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252975d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f252976e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87257u(C91891k0 k0Var, C46888b bVar) {
        super(0);
        this.f252975d = k0Var;
        this.f252976e = bVar;
    }

    public Object invoke() {
        C91891k0 k0Var = this.f252975d;
        if (k0Var != null) {
            Long valueOf = Long.valueOf(k0Var.f263096f);
            C87412m.m108591d(valueOf);
            k0Var.f263096f = valueOf.longValue() + 1;
        }
        this.f252976e.mo72091a("user cancel");
        return C13598b0.f38549a;
    }
}
