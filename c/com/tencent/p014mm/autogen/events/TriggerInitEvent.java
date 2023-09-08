package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.TriggerInitEvent */
public final class TriggerInitEvent extends IEvent {
    public TriggerInitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TriggerInitEvent)) {
            return false;
        }
        TriggerInitEvent triggerInitEvent = (TriggerInitEvent) iEvent;
        return true;
    }
}
