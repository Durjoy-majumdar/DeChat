package p285zh;

import android.os.SystemClock;
import zt3.C119157j;

/* renamed from: zh.d$$b */
public final /* synthetic */ class d$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119115d f356720d;

    public /* synthetic */ d$$b(C119115d dVar) {
        this.f356720d = dVar;
    }

    public final void run() {
        C119115d dVar = this.f356720d;
        dVar.getClass();
        synchronized ("MicroMsg.NotifyPowerInspector") {
            ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.NotifyPowerInspector");
        }
        long j = 0;
        if (dVar.f356718b > 0) {
            j = SystemClock.uptimeMillis() - dVar.f356718b;
        }
        ((C119157j) C119157j.f356862d).mo183879j(new d$$c(j), 10000, "MicroMsg.NotifyPowerInspector");
    }
}
