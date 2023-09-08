package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DismissAllSendFailNotificationEvent */
public final class DismissAllSendFailNotificationEvent extends IEvent {
    public DismissAllSendFailNotificationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DismissAllSendFailNotificationEvent)) {
            return false;
        }
        DismissAllSendFailNotificationEvent dismissAllSendFailNotificationEvent = (DismissAllSendFailNotificationEvent) iEvent;
        return true;
    }
}
