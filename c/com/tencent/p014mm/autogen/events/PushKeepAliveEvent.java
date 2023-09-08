package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.PushKeepAliveEvent */
public final class PushKeepAliveEvent extends IEvent {
    public PushKeepAliveEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PushKeepAliveEvent)) {
            return false;
        }
        PushKeepAliveEvent pushKeepAliveEvent = (PushKeepAliveEvent) iEvent;
        return true;
    }
}
