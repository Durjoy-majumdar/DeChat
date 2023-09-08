package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OnAuthSyncEvent */
public final class OnAuthSyncEvent extends IEvent {
    public OnAuthSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnAuthSyncEvent)) {
            return false;
        }
        OnAuthSyncEvent onAuthSyncEvent = (OnAuthSyncEvent) iEvent;
        return true;
    }
}
