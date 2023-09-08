package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsClearDBEvent */
public final class SnsClearDBEvent extends IEvent {
    public SnsClearDBEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsClearDBEvent)) {
            return false;
        }
        SnsClearDBEvent snsClearDBEvent = (SnsClearDBEvent) iEvent;
        return true;
    }
}
