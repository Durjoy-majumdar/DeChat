package jb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import uc0.C52522u;

/* renamed from: jb0.a */
public class C46452a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46453b f125130d;

    public C46452a(C46453b bVar) {
        this.f125130d = bVar;
    }

    public void run() {
        if (this.f125130d.f125132d) {
            Log.m105924i("MicroMsg.TraceConfigUpdater", "summer update isUpdating and ret");
            return;
        }
        long j = this.f125130d.f125133e.getLong("trace_config_last_update_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 86400000 || j > currentTimeMillis) {
            this.f125130d.mo71842a();
            this.f125130d.f125132d = true;
            C97625j3.m125815e().mo123455a(159, this.f125130d);
            C97625j3.m125815e().mo123455a(160, this.f125130d);
            C97625j3.m125815e().mo123460f(new C52522u(21));
            return;
        }
        Log.m105924i("MicroMsg.TraceConfigUpdater", "summer last update time: " + j + " current time: " + currentTimeMillis + " in same day");
    }
}
