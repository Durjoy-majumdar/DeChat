package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsNewSyncObjectEvent */
public final class SnsNewSyncObjectEvent extends IEvent {
    public SnsNewSyncObjectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsNewSyncObjectEvent)) {
            return false;
        }
        SnsNewSyncObjectEvent snsNewSyncObjectEvent = (SnsNewSyncObjectEvent) iEvent;
        return true;
    }
}
