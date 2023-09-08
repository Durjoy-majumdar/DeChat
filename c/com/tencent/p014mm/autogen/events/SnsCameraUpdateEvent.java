package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsCameraUpdateEvent */
public final class SnsCameraUpdateEvent extends IEvent {
    public SnsCameraUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsCameraUpdateEvent)) {
            return false;
        }
        SnsCameraUpdateEvent snsCameraUpdateEvent = (SnsCameraUpdateEvent) iEvent;
        return true;
    }
}
