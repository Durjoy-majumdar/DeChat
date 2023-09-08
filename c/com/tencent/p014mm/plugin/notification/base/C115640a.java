package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.notification.base.a */
public class C115640a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115642c f346886d;

    public C115640a(C115642c cVar) {
        this.f346886d = cVar;
    }

    public void run() {
        C115669n.INSTANCE.mo160131h(11425, Integer.valueOf(this.f346886d.f346888a.mo56033k()), 3, 0, 0);
        this.f346886d.f346888a.mo175846a();
        AbstractSendMsgFailNotification abstractSendMsgFailNotification = this.f346886d.f346888a;
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistBeforeResend, mMsgList.size:%d", Integer.valueOf(abstractSendMsgFailNotification.f346876a.mo175867e()));
        abstractSendMsgFailNotification.mo175852r();
        abstractSendMsgFailNotification.f346877b.mo175874g(abstractSendMsgFailNotification.mo56028f(abstractSendMsgFailNotification.f346876a.mo175867e()));
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistBeforeResend, after check, mMsgList.size:%d", Integer.valueOf(abstractSendMsgFailNotification.f346876a.mo175867e()));
        this.f346886d.f346888a.mo175853s();
    }
}
