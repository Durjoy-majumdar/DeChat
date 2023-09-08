package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.notification.base.i */
public class C115648i implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ long f346895d;

    /* renamed from: e */
    public final /* synthetic */ AbstractSendMsgFailNotification f346896e;

    public C115648i(AbstractSendMsgFailNotification abstractSendMsgFailNotification, long j) {
        this.f346896e = abstractSendMsgFailNotification;
        this.f346895d = j;
    }

    public boolean onTimerExpired() {
        if (!this.f346896e.f346880e.contains(Long.valueOf(this.f346895d)) && !this.f346896e.f346881f.contains(Long.valueOf(this.f346895d)) && this.f346896e.f346876a.mo175864b(this.f346895d)) {
            Log.m105925i("MicroMsg.AbstractSendMsgFailNotification", "msg:%d send timeout, move this message to fail list, continue send next message", Long.valueOf(this.f346895d));
            this.f346896e.f346881f.add(Long.valueOf(this.f346895d));
            this.f346896e.f346882g.add(Long.valueOf(this.f346895d));
            if (this.f346896e.f346880e.size() + this.f346896e.f346881f.size() >= this.f346896e.f346876a.mo175867e()) {
                this.f346896e.mo175854t();
            } else {
                long d = this.f346896e.f346876a.mo175866d();
                AbstractSendMsgFailNotification abstractSendMsgFailNotification = this.f346896e;
                abstractSendMsgFailNotification.getClass();
                MMHandlerThread.postToMainThreadDelayed(new C115647h(abstractSendMsgFailNotification, d), 200);
            }
        }
        return true;
    }
}
