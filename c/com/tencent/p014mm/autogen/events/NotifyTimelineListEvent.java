package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.NotifyTimelineListEvent */
public final class NotifyTimelineListEvent extends IEvent {
    public NotifyTimelineListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyTimelineListEvent)) {
            return false;
        }
        NotifyTimelineListEvent notifyTimelineListEvent = (NotifyTimelineListEvent) iEvent;
        return true;
    }
}
