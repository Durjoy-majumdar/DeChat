package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lu3.C34379c;
import lu3.C88654b;
import zt3.C119157j;
import zx2.C79435a;
import zx2.C79437c;
import zx2.C79439d;
import zx2.C79440e;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.j */
public class C71328j extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C71331l f206560e;

    public C71328j(C71331l lVar) {
        this.f206560e = lVar;
    }

    public String getKey() {
        return "MicroMsg.TaskBarAnimController#startMonitorRunnable";
    }

    public void run() {
        C79437c cVar = C79437c.INSTANCE;
        if (!cVar.f232975h) {
            Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo doStart performanceMonitor");
            if (!cVar.f232975h) {
                cVar.f232975h = true;
                Log.m105925i("MicroMsg.Metronome", "[start] stack:%s", Util.getStack());
                cVar.mo109415a().postFrameCallback(cVar);
            }
            C79440e eVar = C79440e.INSTANCE;
            synchronized (eVar.f232984g) {
                if (eVar.f232982e) {
                    Log.m105928w("MicroMsg.PerformanceMonitor", "alvinluo already running and ignore this requestStartMonitor. If you want run a new one, stop first.");
                } else {
                    C34379c<?> cVar2 = eVar.f232983f;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                    System.gc();
                    eVar.f232981d.clear();
                    eVar.f232981d.put(1, new C79435a());
                    eVar.f232983f = ((C119157j) C119157j.f356862d).mo183872c(new C79439d(eVar), 0, 5);
                    eVar.f232982e = true;
                }
            }
            C71331l lVar = this.f206560e;
            Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo delayStopMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b, delay: %d", Boolean.valueOf(lVar.f206565C), Boolean.valueOf(lVar.f206566D), 10000L);
            if (lVar.f206565C && !lVar.f206566D) {
                C88654b bVar = lVar.f206564B;
                if (bVar != null) {
                    bVar.mo97819a();
                }
                lVar.f206564B = new C71329k(lVar);
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo execute stopMonitorRunnable");
                lVar.f206566D = true;
                ((C119157j) C119157j.f356862d).mo183879j(lVar.f206564B, 10000, "AppBrandDesktopPerformanceMonitor");
            }
        }
    }
}
