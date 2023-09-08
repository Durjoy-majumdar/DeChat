package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShouldRescanMessagesEvent */
public final class ShouldRescanMessagesEvent extends IEvent {
    public ShouldRescanMessagesEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShouldRescanMessagesEvent)) {
            return false;
        }
        ShouldRescanMessagesEvent shouldRescanMessagesEvent = (ShouldRescanMessagesEvent) iEvent;
        return true;
    }
}
