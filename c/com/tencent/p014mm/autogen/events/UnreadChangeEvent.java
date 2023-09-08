package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UnreadChangeEvent */
public final class UnreadChangeEvent extends IEvent {
    public UnreadChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UnreadChangeEvent)) {
            return false;
        }
        UnreadChangeEvent unreadChangeEvent = (UnreadChangeEvent) iEvent;
        return true;
    }
}
