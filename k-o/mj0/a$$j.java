package mj0;

import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;

public class a$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88732a f256121d;

    public a$$j(C88732a aVar) {
        this.f256121d = aVar;
    }

    public void run() {
        QualitySessionRuntime c = C84185b.m103770c(this.f256121d.mo125521g0(), true);
        if (c == null) {
            Log.m105929w("MicroMsg.AppBrandGameServiceLogicImpWC", "get session failed for appid: %s", this.f256121d.mo125521g0());
            return;
        }
        String str = c.f245832d;
        Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "provide instanceId: %s", str);
        this.f256121d.mo125522h0().f262484a.notifySetInstanceId(str);
    }
}
