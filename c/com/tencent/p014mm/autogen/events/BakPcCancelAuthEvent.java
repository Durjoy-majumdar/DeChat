package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BakPcCancelAuthEvent */
public final class BakPcCancelAuthEvent extends IEvent {
    public BakPcCancelAuthEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BakPcCancelAuthEvent)) {
            return false;
        }
        BakPcCancelAuthEvent bakPcCancelAuthEvent = (BakPcCancelAuthEvent) iEvent;
        return true;
    }
}
