package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent */
public final class CheckSnsAutoPlayEvent extends IEvent {
    public CheckSnsAutoPlayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckSnsAutoPlayEvent)) {
            return false;
        }
        CheckSnsAutoPlayEvent checkSnsAutoPlayEvent = (CheckSnsAutoPlayEvent) iEvent;
        return true;
    }
}
