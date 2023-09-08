package zx2;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.TimerTask;

/* renamed from: zx2.d */
public class C79439d extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C79440e f232978d;

    public C79439d(C79440e eVar) {
        this.f232978d = eVar;
    }

    public void run() {
        synchronized (this.f232978d.f232984g) {
            C79440e eVar = this.f232978d;
            if (eVar.f232982e) {
                for (C79436b a : eVar.f232981d.values()) {
                    a.mo109413a();
                }
            } else {
                Log.m105928w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                cancel();
            }
        }
    }
}
