package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsFileCollectEvent */
public final class SnsFileCollectEvent extends IEvent {
    public SnsFileCollectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFileCollectEvent)) {
            return false;
        }
        SnsFileCollectEvent snsFileCollectEvent = (SnsFileCollectEvent) iEvent;
        return true;
    }
}
