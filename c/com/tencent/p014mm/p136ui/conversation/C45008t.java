package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.conversation.t */
public class C45008t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45003s f122100d;

    public C45008t(C45003s sVar) {
        this.f122100d = sVar;
    }

    public void run() {
        if (!C97625j3.m125811a()) {
            this.f122100d.f122068C.stopTimer();
            Log.m105920e("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        this.f122100d.mo7991f();
        long milliSecondsToNow = Util.milliSecondsToNow(nowMilliSecond) * 3;
        Log.m105919d("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", Long.valueOf(milliSecondsToNow), Long.valueOf(C45003s.f122065D), Boolean.valueOf(this.f122100d.f122067B));
        long j = (milliSecondsToNow + C45003s.f122065D) / 2;
        C45003s.f122065D = j;
        C45003s sVar = this.f122100d;
        sVar.f122067B = false;
        sVar.f122068C.startTimer(j);
    }
}
