package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import lu3.C34379c;
import lu3.C88654b;
import vx2.C78493o;
import yx2.C79166c;
import zx2.C79435a;
import zx2.C79436b;
import zx2.C79437c;
import zx2.C79440e;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.k */
public class C71329k extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C71331l f206561e;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.k$a */
    public class C71330a implements Runnable {
        public C71330a() {
        }

        public void run() {
            C71331l lVar = C71329k.this.f206561e;
            lVar.f206565C = false;
            lVar.f206566D = false;
        }
    }

    public C71329k(C71331l lVar) {
        this.f206561e = lVar;
    }

    public String getKey() {
        return "MicroMsg.TaskBarAnimController#stopMonitorRunnable";
    }

    public void run() {
        C79435a aVar;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putInt2;
        C79437c cVar = C79437c.INSTANCE;
        if (cVar.f232975h) {
            Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo doStop performanceMonitor");
            cVar.f232972e = 0;
            cVar.f232973f = 0;
            cVar.f232975h = false;
            Log.m105925i("MicroMsg.Metronome", "[stop] stack:%s", Util.getStack());
            cVar.mo109415a().removeFrameCallback(cVar);
            C79440e eVar = C79440e.INSTANCE;
            synchronized (eVar.f232984g) {
                if (eVar.f232982e) {
                    C34379c<?> cVar2 = eVar.f232983f;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                    }
                    eVar.f232982e = false;
                }
            }
            C79436b bVar = eVar.f232981d.get(1);
            if (bVar instanceof C79435a) {
                bVar.mo109414b();
                aVar = (C79435a) bVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo doStop performanceMonitor dump fps, max: %f, min: %f, average: %f", Double.valueOf(aVar.f232968d), Double.valueOf(aVar.f232967c), Double.valueOf(aVar.f232966b));
                C79166c cVar3 = C79166c.f232463a;
                double d = aVar.f232966b;
                Log.m105925i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps currentDrawFps: %d, appFps: %f", Integer.valueOf(C79166c.f232464b), Double.valueOf(d));
                int i = (d > 45.0d ? 1 : (d == 45.0d ? 0 : -1));
                if (i >= 0) {
                    C78493o.m94792c(true);
                    if (d >= 55.0d) {
                        C79166c.f232464b = 20;
                    } else if (d >= 50.0d) {
                        C79166c.f232464b = 15;
                    } else if (i >= 0) {
                        C79166c.f232464b = 5;
                    }
                } else if (C79166c.f232464b == 2) {
                    Log.m105924i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps disable DynamicBackground");
                    C78493o.m94792c(false);
                } else {
                    C79166c.f232464b = 2;
                    C78493o.m94792c(true);
                }
                int i2 = (int) d;
                C79166c.f232466d = i2;
                SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
                if (!(defaultPreference == null || (edit2 = defaultPreference.edit()) == null || (putInt2 = edit2.putInt("current_draw_fps", C79166c.f232464b)) == null)) {
                    putInt2.apply();
                }
                if (!(defaultPreference == null || (edit = defaultPreference.edit()) == null || (putInt = edit.putInt("current_app_fps", i2)) == null)) {
                    putInt.apply();
                }
                Log.m105925i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps appFps: %f, FRAME_PER_SECOND: %d", Double.valueOf(d), Integer.valueOf(C79166c.f232464b));
                cVar3.mo109147a();
            }
            Log.m105924i("MicroMsg.PerformanceMonitor", "alvinluo PerformanceMonitor release");
            HashMap<Integer, C79436b> hashMap = eVar.f232981d;
            if (hashMap != null) {
                hashMap.clear();
            }
            MMHandlerThread.postToMainThread(new C71330a());
        }
    }
}
