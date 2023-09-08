package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.model.c0 */
public final class C106335c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoipIncomingCallManager f317177d;

    public C106335c0(VoipIncomingCallManager voipIncomingCallManager) {
        this.f317177d = voipIncomingCallManager;
    }

    public final void run() {
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "on release camera");
        VoipIncomingCallManager voipIncomingCallManager = this.f317177d;
        voipIncomingCallManager.f317152q = true;
        VoipIncomingCallManager.m143176c(voipIncomingCallManager);
    }
}
