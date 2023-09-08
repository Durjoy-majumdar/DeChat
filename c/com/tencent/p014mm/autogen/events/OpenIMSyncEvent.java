package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OpenIMSyncEvent */
public final class OpenIMSyncEvent extends IEvent {
    public OpenIMSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenIMSyncEvent)) {
            return false;
        }
        OpenIMSyncEvent openIMSyncEvent = (OpenIMSyncEvent) iEvent;
        return true;
    }
}
