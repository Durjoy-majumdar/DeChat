package com.tencent.p014mm.feature.performance;

import android.text.TextUtils;
import android.text.format.DateFormat;
import ce2.C28544a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.p014mm.plugin.performance.watchdogs.C85325b;
import com.tencent.p014mm.plugin.performance.watchdogs.b$$a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fe2.C86863b;
import java.util.Map;
import oa1.C117731d;
import p212oe.C117750b;
import p212oe.C89203l;
import p212oe.b$$b;
import p933be.C113159b;
import p988jj.C87968a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.feature.performance.q$$a */
public final /* synthetic */ class q$$a implements C89203l.C89204a {
    /* renamed from: a */
    public final void mo112632a(C114490k0.C114491a.C114494b.C114502c cVar) {
        Class cls = C86863b.class;
        int b = C117750b.m166044b() + 1;
        String valueOf = String.valueOf(DateFormat.format("yyyyMMdd", System.currentTimeMillis()));
        if (!TextUtils.isEmpty(valueOf)) {
            MultiProcessMMKV.getDefault().putInt("battery_tkill_count_" + valueOf, b).commit();
        }
        boolean z = false;
        for (ITEM item : cVar.f343212a) {
            if (item.f343069e.toUpperCase().contains("R")) {
                String str = item.f343067c;
                int i = item.f343066b;
                if (C113159b.m154842h().mo165664a().mo165676a() >= 1200000 && !TextUtils.isEmpty(str)) {
                    boolean hasOverlayWindow = OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow();
                    boolean hasForegroundService = ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService();
                    Log.m105924i("Matrix.battery.BatteryCanaryConfigs", "floatView = " + hasOverlayWindow + ", fgSrv = " + hasForegroundService);
                    if (!hasOverlayWindow && !hasForegroundService) {
                        String[] split = String.valueOf(C117731d.m166007c().mo182444f("clicfg_battery_thread_cooling_list", (C117750b.m166049g() || C117750b.m166050h()) ? ".raster;Loader:Extract;readercontainer;readercachepars;main.thread;video_jitter" : "raster", false, true)).split(";");
                        int length = split.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (str.contains(split[i2])) {
                                Log.m105928w("Matrix.battery.BatteryCanaryConfigs", "cooling down thread: " + str + ", tid = " + i);
                                StringBuilder sb = new StringBuilder();
                                sb.append("tid-");
                                sb.append(i);
                                C87968a.C87969a.C87970a.m109467a("coolingDown", (Throwable) null, (Map<String, Object>) null, str, sb.toString());
                                ((C119157j) C119157j.f356862d).mo183878i(new b$$b(str, i), 60000);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            if (C117750b.m166050h() && !z) {
                if (item.f343067c.contains("video_jitter_bu") || item.f343067c.contains("JSBizRenderJsEn") || item.f343067c.contains("readercachepars") || item.f343067c.contains("readercontainer") || item.f343067c.contains("main.thread")) {
                    z = true;
                }
            }
        }
        if (z) {
            C85325b bVar = C85325b.f248606p;
            bVar.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new b$$a(bVar));
        }
        C28544a aVar = C28544a.INSTANCE;
        if (((C86863b) aVar.mo56045a(cls)).f252158g.mo118547e()) {
            Log.m105928w("MicroMsg.PluginPerformance", "Dump pthread report");
            ((C86863b) aVar.mo56045a(cls)).mo118541p(false);
        }
    }
}
