package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ResendAllFailSnsMsgEvent */
public final class ResendAllFailSnsMsgEvent extends IEvent {
    public ResendAllFailSnsMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendAllFailSnsMsgEvent)) {
            return false;
        }
        ResendAllFailSnsMsgEvent resendAllFailSnsMsgEvent = (ResendAllFailSnsMsgEvent) iEvent;
        return true;
    }
}
