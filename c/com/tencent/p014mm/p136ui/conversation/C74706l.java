package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.conversation.l */
public class C74706l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74697k f219656d;

    public C74706l(C74697k kVar) {
        this.f219656d = kVar;
    }

    public void run() {
        if (!C97625j3.m125811a()) {
            this.f219656d.f219606F.stopTimer();
            Log.m105920e("MicroMsg.ConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        this.f219656d.mo7991f();
        long milliSecondsToNow = Util.milliSecondsToNow(nowMilliSecond) * 3;
        Log.m105919d("MicroMsg.ConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", Long.valueOf(milliSecondsToNow), Long.valueOf(C74697k.f219600G), Boolean.valueOf(this.f219656d.f219605E));
        long j = (milliSecondsToNow + C74697k.f219600G) / 2;
        C74697k.f219600G = j;
        C74697k kVar = this.f219656d;
        kVar.f219605E = false;
        kVar.f219606F.startTimer(j);
    }
}
