package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ResetCardRetryCounterEvent */
public final class ResetCardRetryCounterEvent extends IEvent {
    public ResetCardRetryCounterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResetCardRetryCounterEvent)) {
            return false;
        }
        ResetCardRetryCounterEvent resetCardRetryCounterEvent = (ResetCardRetryCounterEvent) iEvent;
        return true;
    }
}
