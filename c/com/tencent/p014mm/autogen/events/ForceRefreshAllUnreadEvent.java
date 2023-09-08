package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ForceRefreshAllUnreadEvent */
public final class ForceRefreshAllUnreadEvent extends IEvent {
    public ForceRefreshAllUnreadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ForceRefreshAllUnreadEvent)) {
            return false;
        }
        ForceRefreshAllUnreadEvent forceRefreshAllUnreadEvent = (ForceRefreshAllUnreadEvent) iEvent;
        return true;
    }
}
