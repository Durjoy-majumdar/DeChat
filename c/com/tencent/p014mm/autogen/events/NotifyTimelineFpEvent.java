package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.NotifyTimelineFpEvent */
public final class NotifyTimelineFpEvent extends IEvent {
    public NotifyTimelineFpEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyTimelineFpEvent)) {
            return false;
        }
        NotifyTimelineFpEvent notifyTimelineFpEvent = (NotifyTimelineFpEvent) iEvent;
        return true;
    }
}
