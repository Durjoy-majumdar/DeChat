package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.model.y$$a */
public final /* synthetic */ class y$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106400y f317734d;

    public /* synthetic */ y$$a(C106400y yVar) {
        this.f317734d = yVar;
    }

    public final void run() {
        C106400y yVar = this.f317734d;
        yVar.getClass();
        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post success and wait running");
        if (yVar.f317708a != null) {
            yVar.f317708a.mo152546e();
            yVar.f317708a.mo152547f();
            yVar.f317708a = null;
            Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord and release player");
        }
        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "do stopRecord");
        if (yVar.f317709b != null) {
            yVar.f317709b.mo161907l();
            yVar.f317709b = null;
            Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord and release recorder");
        }
        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post success and quitSafely");
    }
}
