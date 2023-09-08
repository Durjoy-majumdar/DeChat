package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gy3.C87412m;
import ik0.C87744a;
import java.util.ArrayList;
import zq0.C91893l0;
import zq0.C91919w;

/* renamed from: gk0.z */
public final class C87266z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87744a f252989d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f252990e;

    public C87266z(C87744a aVar, C83780d1 d1Var) {
        this.f252989d = aVar;
        this.f252990e = d1Var;
    }

    public final void run() {
        this.f252989d.setPhoneItems((ArrayList) C91919w.f263170a.mo125747b());
        C91893l0 l0Var = C91893l0.f263119a;
        String appId = this.f252990e.getAppId();
        C87412m.m108593f(appId, "env.appId");
        l0Var.mo125720b(appId);
    }
}
