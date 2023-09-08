package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.model.y$$b */
public final /* synthetic */ class y$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106400y f317735d;

    public /* synthetic */ y$$b(C106400y yVar) {
        this.f317735d = yVar;
    }

    public final void run() {
        C106400y yVar = this.f317735d;
        yVar.getClass();
        try {
            if (yVar.f317709b != null) {
                yVar.f317709b.mo161907l();
                yVar.f317709b = null;
                Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord and release recorder");
            }
            yVar.mo152862i();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Voip.VoipDeviceHandler", "start record error: %s", e.getMessage());
            yVar.f317716i = 1;
            C106377r rVar = yVar.f317711d;
            rVar.f317500x.f317575J = Math.abs(1);
            rVar.f317502z.mo152419B();
        }
    }
}
