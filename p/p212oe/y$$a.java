package p212oe;

import android.os.Handler;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p933be.C113173i;

/* renamed from: oe.y$$a */
public final /* synthetic */ class y$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117783y f352310d;

    /* renamed from: e */
    public final /* synthetic */ Handler f352311e;

    public /* synthetic */ y$$a(C117783y yVar, Handler handler) {
        this.f352310d = yVar;
        this.f352311e = handler;
    }

    public final void run() {
        C117783y yVar = this.f352310d;
        Handler handler = this.f352311e;
        if (!yVar.f352304a) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = C117783y.f352303g;
            if (j == 0 || currentTimeMillis - j >= 1800000) {
                Log.m105924i("MicroMsg.ThermalExceptionMonitor", "start watching");
                C113173i e = C117750b.m166047e();
                C114467i iVar = e == null ? null : new C117784z(e.f338613h, "alertBatt").f352286a;
                yVar.f352306c = iVar;
                if (iVar != null) {
                    yVar.f352305b = 0;
                    Log.m105924i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (yVar.f352305b + 1));
                    yVar.f352306c.mo173679v();
                    handler.postDelayed(yVar.f352308e, 60000);
                    yVar.f352304a = true;
                    C117783y.f352303g = currentTimeMillis;
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.ThermalExceptionMonitor", "monitor too many, fromLast = " + ((currentTimeMillis - C117783y.f352303g) / 60000) + "min");
            return;
        }
        Log.m105924i("MicroMsg.ThermalExceptionMonitor", "monitor is already running, skip");
    }
}
