package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BypNewSyncEvent */
public final class BypNewSyncEvent extends IEvent {
    public BypNewSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BypNewSyncEvent)) {
            return false;
        }
        BypNewSyncEvent bypNewSyncEvent = (BypNewSyncEvent) iEvent;
        return true;
    }
}
