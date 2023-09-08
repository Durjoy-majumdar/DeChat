package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ServiceClickEvent */
public final class ServiceClickEvent extends IEvent {
    public ServiceClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ServiceClickEvent)) {
            return false;
        }
        ServiceClickEvent serviceClickEvent = (ServiceClickEvent) iEvent;
        return true;
    }
}
