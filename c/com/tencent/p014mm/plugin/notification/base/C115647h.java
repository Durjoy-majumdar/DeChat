package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.notification.base.h */
public class C115647h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f346893d;

    /* renamed from: e */
    public final /* synthetic */ AbstractSendMsgFailNotification f346894e;

    public C115647h(AbstractSendMsgFailNotification abstractSendMsgFailNotification, long j) {
        this.f346894e = abstractSendMsgFailNotification;
        this.f346893d = j;
    }

    public void run() {
        AbstractSendMsgFailNotification abstractSendMsgFailNotification = this.f346894e;
        long j = this.f346893d;
        while (!abstractSendMsgFailNotification.mo56026b(j)) {
            abstractSendMsgFailNotification.f346881f.add(Long.valueOf(j));
            Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, msg:%d not exist", Long.valueOf(j));
            abstractSendMsgFailNotification.mo175858y();
            j = abstractSendMsgFailNotification.f346876a.mo175866d();
            if (j == -1) {
                Log.m105920e("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg error, finalMsgId is -1, may be resend finish");
                if (abstractSendMsgFailNotification.f346880e.size() + abstractSendMsgFailNotification.f346881f.size() >= abstractSendMsgFailNotification.f346876a.mo175867e()) {
                    Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, resend finish");
                    abstractSendMsgFailNotification.mo175854t();
                    return;
                }
                return;
            }
        }
        Log.m105919d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, finalMsgId:%d", Long.valueOf(j));
        abstractSendMsgFailNotification.mo56036u(j);
        MTimerHandler mTimerHandler = new MTimerHandler(new C115648i(abstractSendMsgFailNotification, j), false);
        mTimerHandler.startTimer(1800000);
        abstractSendMsgFailNotification.f346883h.add(mTimerHandler);
    }
}
