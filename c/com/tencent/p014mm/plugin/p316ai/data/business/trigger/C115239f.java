package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.autogen.events.EnterMainUIEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p151er.C7774m;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.f */
public class C115239f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnterMainUIEvent f345327d;

    /* renamed from: e */
    public final /* synthetic */ LiveNotifyMsgTrigger f345328e;

    public C115239f(LiveNotifyMsgTrigger liveNotifyMsgTrigger, EnterMainUIEvent enterMainUIEvent) {
        this.f345328e = liveNotifyMsgTrigger;
        this.f345327d = enterMainUIEvent;
    }

    public void run() {
        LiveNotifyMsgTrigger liveNotifyMsgTrigger = this.f345328e;
        EnterMainUIEvent.C114672a aVar = this.f345327d.f343547d;
        String c = LiveNotifyMsgTrigger.m161987c(liveNotifyMsgTrigger, aVar.f343548a, aVar.f343549b);
        this.f345328e.getClass();
        Log.m105925i("MicroMsg.LiveNotifyMsgTrigger", "request svr to get live msg [%s]", c);
        C115669n.INSTANCE.idkeyStat(1559, 220, 1, false);
        ((C7774m) C86312j.m106911c(C7774m.class)).mo8885r0(c);
    }
}
