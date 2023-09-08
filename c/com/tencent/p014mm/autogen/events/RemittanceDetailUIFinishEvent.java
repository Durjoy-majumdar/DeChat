package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.RemittanceDetailUIFinishEvent */
public final class RemittanceDetailUIFinishEvent extends IEvent {
    public RemittanceDetailUIFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemittanceDetailUIFinishEvent)) {
            return false;
        }
        RemittanceDetailUIFinishEvent remittanceDetailUIFinishEvent = (RemittanceDetailUIFinishEvent) iEvent;
        return true;
    }
}
