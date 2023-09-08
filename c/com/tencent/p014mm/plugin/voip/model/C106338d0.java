package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.model.d0 */
public final class C106338d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoipIncomingCallManager f317223d;

    public C106338d0(VoipIncomingCallManager voipIncomingCallManager) {
        this.f317223d = voipIncomingCallManager;
    }

    public final void run() {
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "on stop voip");
        VoipIncomingCallManager voipIncomingCallManager = this.f317223d;
        voipIncomingCallManager.f317151p = true;
        VoipIncomingCallManager.m143176c(voipIncomingCallManager);
    }
}
