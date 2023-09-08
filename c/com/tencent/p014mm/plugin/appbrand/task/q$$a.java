package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q$$a */
public final /* synthetic */ class q$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPreloadProfiler f246226d;

    /* renamed from: e */
    public final /* synthetic */ C84343y f246227e;

    public /* synthetic */ q$$a(AppBrandPreloadProfiler appBrandPreloadProfiler, C84343y yVar) {
        this.f246226d = appBrandPreloadProfiler;
        this.f246227e = yVar;
    }

    public final void run() {
        AppBrandPreloadProfiler appBrandPreloadProfiler = this.f246226d;
        C84343y yVar = this.f246227e;
        if (appBrandPreloadProfiler == null) {
            Log.m105920e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadProfile]AppBrandPreloadProfiler == null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[PreloadProfile]");
        sb.append(" ");
        Object[] objArr = new Object[1];
        objArr[0] = yVar == null ? "Unknown" : yVar.name();
        sb.append(Util.safeFormatString("Preload for [%s]Type | ", objArr));
        Object[] objArr2 = new Object[1];
        long j = appBrandPreloadProfiler.f246123d;
        if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            j = -1;
        }
        objArr2[0] = Long.valueOf(j);
        sb.append(Util.safeFormatString("Preload request at [%d] | ", objArr2));
        sb.append(Util.safeFormatString("Process prepared cost [%s]ms | ", C84331q.m103949d(appBrandPreloadProfiler.f246123d, "req", appBrandPreloadProfiler.f246127h, "proc")));
        sb.append(Util.safeFormatString("Trans-thread prepared cost [%s]ms | ", C84331q.m103949d(appBrandPreloadProfiler.f246127h, "proc", appBrandPreloadProfiler.f246128i, IXWebBroadcastListener.STAGE_START)));
        sb.append(Util.safeFormatString("Preload prepared cost [%s]ms | ", C84331q.m103949d(appBrandPreloadProfiler.f246128i, IXWebBroadcastListener.STAGE_START, appBrandPreloadProfiler.f246129j, "end")));
        sb.append(Util.safeFormatString("All cost [%s]ms | ", C84331q.m103949d(appBrandPreloadProfiler.f246123d, "req", appBrandPreloadProfiler.f246129j, "end")));
        sb.append(Util.safeFormatString("level [%d] | ", Integer.valueOf(appBrandPreloadProfiler.f246124e)));
        sb.append(Util.safeFormatString("mem usage [%d]mb", 0));
        Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", sb.toString());
    }
}
