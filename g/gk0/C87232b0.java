package gk0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ik0.C87744a;
import rx3.C13598b0;
import zq0.C91875g0;
import zq0.C91891k0;
import zq0.C91893l0;
import zq0.C91894m;
import zq0.C91910r;

/* renamed from: gk0.b0 */
public final class C87232b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252913d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f252914e;

    /* renamed from: f */
    public final /* synthetic */ C87744a f252915f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87232b0(C91891k0 k0Var, C83780d1 d1Var, C87744a aVar) {
        super(0);
        this.f252913d = k0Var;
        this.f252914e = d1Var;
        this.f252915f = aVar;
    }

    public Object invoke() {
        C91891k0 k0Var = this.f252913d;
        if (k0Var != null) {
            Long valueOf = Long.valueOf(k0Var.f263101k);
            C87412m.m108591d(valueOf);
            k0Var.f263101k = valueOf.longValue() + 1;
        }
        String appId = this.f252914e.getAppId();
        if (appId != null) {
            C91893l0.f263119a.mo125721c(appId);
        }
        Context context = this.f252914e.getContext();
        if (context != null) {
            C83780d1 d1Var = this.f252914e;
            C87744a aVar = this.f252915f;
            String appId2 = d1Var.getAppId();
            if (appId2 != null) {
                C91910r rVar = C91875g0.f263042b;
                if (rVar == null) {
                    rVar = new C91894m();
                }
                String R0 = d1Var.mo116163R0();
                if (R0 == null) {
                    R0 = "";
                }
                rVar.mo125727g(context, appId2, R0, new C87230a0(aVar, d1Var));
            }
        }
        return C13598b0.f38549a;
    }
}
