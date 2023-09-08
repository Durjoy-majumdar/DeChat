package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ExtRequestAccountSyncEvent */
public final class ExtRequestAccountSyncEvent extends IEvent {
    public ExtRequestAccountSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtRequestAccountSyncEvent)) {
            return false;
        }
        ExtRequestAccountSyncEvent extRequestAccountSyncEvent = (ExtRequestAccountSyncEvent) iEvent;
        return true;
    }
}
