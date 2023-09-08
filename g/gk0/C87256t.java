package gk0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lp3.C46888b;
import rx3.C13598b0;
import zq0.C91891k0;

/* renamed from: gk0.t */
public final class C87256t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252973d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f252974e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87256t(C91891k0 k0Var, C46888b bVar) {
        super(0);
        this.f252973d = k0Var;
        this.f252974e = bVar;
    }

    public Object invoke() {
        C91891k0 k0Var = this.f252973d;
        if (k0Var != null) {
            Long valueOf = Long.valueOf(k0Var.f263095e);
            C87412m.m108591d(valueOf);
            k0Var.f263095e = valueOf.longValue() + 1;
        }
        this.f252974e.mo72091a("user deny");
        return C13598b0.f38549a;
    }
}
