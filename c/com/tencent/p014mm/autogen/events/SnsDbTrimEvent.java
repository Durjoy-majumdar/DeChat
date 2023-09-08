package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsDbTrimEvent */
public final class SnsDbTrimEvent extends IEvent {
    public SnsDbTrimEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsDbTrimEvent)) {
            return false;
        }
        SnsDbTrimEvent snsDbTrimEvent = (SnsDbTrimEvent) iEvent;
        return true;
    }
}
