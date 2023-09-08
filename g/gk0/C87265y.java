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

/* renamed from: gk0.y */
public final class C87265y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252986d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f252987e;

    /* renamed from: f */
    public final /* synthetic */ C87744a f252988f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87265y(C91891k0 k0Var, C83780d1 d1Var, C87744a aVar) {
        super(0);
        this.f252986d = k0Var;
        this.f252987e = d1Var;
        this.f252988f = aVar;
    }

    public Object invoke() {
        C91891k0 k0Var = this.f252986d;
        if (k0Var != null) {
            Long valueOf = Long.valueOf(k0Var.f263100j);
            C87412m.m108591d(valueOf);
            k0Var.f263100j = valueOf.longValue() + 1;
        }
        String appId = this.f252987e.getAppId();
        if (appId != null) {
            C91893l0.f263119a.mo125721c(appId);
        }
        Context context = this.f252987e.getContext();
        if (context != null) {
            C83780d1 d1Var = this.f252987e;
            C87744a aVar = this.f252988f;
            String appId2 = d1Var.getAppId();
            if (appId2 != null) {
                C91910r rVar = C91875g0.f263042b;
                if (rVar == null) {
                    rVar = new C91894m();
                }
                rVar.mo125723b(context, appId2, new C87263x(aVar, d1Var));
            }
        }
        return C13598b0.f38549a;
    }
}
