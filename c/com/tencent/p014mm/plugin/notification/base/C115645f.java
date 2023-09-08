package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.notification.base.f */
public class C115645f implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ AbstractSendMsgFailNotification f346891d;

    public C115645f(AbstractSendMsgFailNotification abstractSendMsgFailNotification) {
        this.f346891d = abstractSendMsgFailNotification;
    }

    public boolean onTimerExpired() {
        AbstractSendMsgFailNotification abstractSendMsgFailNotification = this.f346891d;
        if (!abstractSendMsgFailNotification.f346878c) {
            return false;
        }
        Log.m105925i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, before check msgList.size:%d, successList.size:%d, failedList.size:%d", Integer.valueOf(abstractSendMsgFailNotification.f346876a.mo175867e()), Integer.valueOf(this.f346891d.f346880e.size()), Integer.valueOf(this.f346891d.f346881f.size()));
        this.f346891d.mo175852r();
        Log.m105925i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, after check msgList.size:%d, successList.size:%d, failedList.size:%d", Integer.valueOf(this.f346891d.f346876a.mo175867e()), Integer.valueOf(this.f346891d.f346880e.size()), Integer.valueOf(this.f346891d.f346881f.size()));
        if (this.f346891d.f346876a.mo175867e() > 0) {
            this.f346891d.mo175858y();
        } else {
            this.f346891d.mo175854t();
        }
        return true;
    }
}
