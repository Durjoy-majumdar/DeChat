package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import ik0.C87744a;
import java.util.ArrayList;
import zq0.C91893l0;
import zq0.C91919w;

/* renamed from: gk0.w */
public final class C87258w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87744a f252977d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f252978e;

    public C87258w(C87744a aVar, C83780d1 d1Var) {
        this.f252977d = aVar;
        this.f252978e = d1Var;
    }

    public final void run() {
        this.f252977d.setPhoneItems((ArrayList) C91919w.f263170a.mo125747b());
        String appId = this.f252978e.getAppId();
        if (appId != null) {
            C91893l0.f263119a.mo125720b(appId);
        }
    }
}
