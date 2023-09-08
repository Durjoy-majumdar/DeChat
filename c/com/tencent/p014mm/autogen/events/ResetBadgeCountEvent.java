package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ResetBadgeCountEvent */
public final class ResetBadgeCountEvent extends IEvent {
    public ResetBadgeCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResetBadgeCountEvent)) {
            return false;
        }
        ResetBadgeCountEvent resetBadgeCountEvent = (ResetBadgeCountEvent) iEvent;
        return true;
    }
}
