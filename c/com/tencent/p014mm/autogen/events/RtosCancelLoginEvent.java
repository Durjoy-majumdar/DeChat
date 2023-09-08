package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.RtosCancelLoginEvent */
public final class RtosCancelLoginEvent extends IEvent {
    public RtosCancelLoginEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RtosCancelLoginEvent)) {
            return false;
        }
        RtosCancelLoginEvent rtosCancelLoginEvent = (RtosCancelLoginEvent) iEvent;
        return true;
    }
}
