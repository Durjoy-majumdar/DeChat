package p451b2;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p146e2.C107163g;
import rx3.C13598b0;

/* renamed from: b2.b0 */
public final class C104007b0 extends C87413o implements C32226l<C104010d0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104008c0 f307630d;

    /* renamed from: e */
    public final /* synthetic */ C104006a0 f307631e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104007b0(C104008c0 c0Var, C104006a0 a0Var) {
        super(1);
        this.f307630d = c0Var;
        this.f307631e = a0Var;
    }

    public Object invoke(Object obj) {
        C104010d0 d0Var = (C104010d0) obj;
        C87412m.m108594g(d0Var, "finalResult");
        C104008c0 c0Var = this.f307630d;
        C107163g gVar = c0Var.f307632a;
        C104006a0 a0Var = this.f307631e;
        synchronized (gVar) {
            if (d0Var.mo145608c()) {
                c0Var.f307633b.mo143070b(a0Var, d0Var);
            } else {
                c0Var.f307633b.mo143071c(a0Var);
            }
        }
        return C13598b0.f38549a;
    }
}
