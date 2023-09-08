package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsOldItemContactEvent */
public final class SnsOldItemContactEvent extends IEvent {
    public SnsOldItemContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsOldItemContactEvent)) {
            return false;
        }
        SnsOldItemContactEvent snsOldItemContactEvent = (SnsOldItemContactEvent) iEvent;
        return true;
    }
}
