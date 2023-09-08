package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.PCManagerBakEvent */
public final class PCManagerBakEvent extends IEvent {
    public PCManagerBakEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PCManagerBakEvent)) {
            return false;
        }
        PCManagerBakEvent pCManagerBakEvent = (PCManagerBakEvent) iEvent;
        return true;
    }
}
