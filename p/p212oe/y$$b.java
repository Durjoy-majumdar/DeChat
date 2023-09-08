package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p933be.C113173i;

/* renamed from: oe.y$$b */
public class y$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117783y f352312d;

    public y$$b(C117783y yVar) {
        this.f352312d = yVar;
    }

    public void run() {
        this.f352312d.f352305b++;
        Log.m105924i("MicroMsg.ThermalExceptionMonitor", "finish, loop count: " + this.f352312d.f352305b);
        C114467i iVar = this.f352312d.f352306c;
        C114467i iVar2 = null;
        if (iVar != null) {
            iVar.mo173662f();
            this.f352312d.f352306c.mo173664h(new y$$b$$a(this));
            this.f352312d.f352306c.mo173658a();
            this.f352312d.f352306c = null;
        }
        C117783y yVar = this.f352312d;
        if (yVar.f352305b >= 5) {
            yVar.f352304a = false;
        } else if (yVar.f352307d != null) {
            C113173i e = C117750b.m166047e();
            if (e != null) {
                iVar2 = new C117784z(e.f338613h, "alertBatt").f352286a;
            }
            yVar.f352306c = iVar2;
            if (this.f352312d.f352306c != null) {
                Log.m105924i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (this.f352312d.f352305b + 1));
                this.f352312d.f352306c.mo173679v();
                this.f352312d.f352307d.f338613h.f339059f.postDelayed(this, 60000);
            }
        }
    }
}
