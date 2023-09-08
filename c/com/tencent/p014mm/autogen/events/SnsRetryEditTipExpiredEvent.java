package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsRetryEditTipExpiredEvent */
public final class SnsRetryEditTipExpiredEvent extends IEvent {
    public SnsRetryEditTipExpiredEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsRetryEditTipExpiredEvent)) {
            return false;
        }
        SnsRetryEditTipExpiredEvent snsRetryEditTipExpiredEvent = (SnsRetryEditTipExpiredEvent) iEvent;
        return true;
    }
}
