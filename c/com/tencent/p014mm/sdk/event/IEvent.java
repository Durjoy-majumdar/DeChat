package com.tencent.p014mm.sdk.event;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.tencent.mm.sdk.event.IEvent */
public abstract class IEvent {
    private int __eventID = 0;
    public Runnable callback = null;
    public boolean order;

    public int __getEventID() {
        if (this.__eventID == 0) {
            this.__eventID = getClass().getName().hashCode();
        }
        return this.__eventID;
    }

    public final void asyncPublish(String str) {
        EventCenter.instance.asyncPublish(this, str);
    }

    public boolean compareContent(IEvent iEvent) {
        return equals(iEvent);
    }

    public boolean getOrder() {
        return this.order;
    }

    public final boolean publish() {
        return EventCenter.instance.lambda$asyncPublish$1(this);
    }

    public final void asyncPublish(Looper looper) {
        EventCenter.instance.asyncPublish(this, looper);
    }

    public final void asyncPublish(Executor executor) {
        EventCenter.instance.asyncPublish(this, executor);
    }
}
