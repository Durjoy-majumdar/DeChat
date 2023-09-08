package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.SystemClock;
import bj0.C79708a;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81792m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l */
public final class C81791l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f239998d;

    /* renamed from: e */
    public final /* synthetic */ C81792m.C81793a f239999e;

    public C81791l(String str, C81792m.C81793a aVar) {
        this.f239998d = str;
        this.f239999e = aVar;
    }

    public final void run() {
        C81797p pVar = C81797p.f240015a;
        String str = this.f239998d;
        C81792m.C81793a aVar = this.f239999e;
        aVar.getClass();
        C79708a.f233619a.mo109821a(aVar.f240008e.f240002c, "get#gattConnectListenerWithRetry");
        aVar.f240004a = SystemClock.elapsedRealtime();
        pVar.mo114177a(str, aVar);
    }
}
