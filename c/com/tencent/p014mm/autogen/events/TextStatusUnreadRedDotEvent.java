package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.TextStatusUnreadRedDotEvent */
public final class TextStatusUnreadRedDotEvent extends IEvent {
    public TextStatusUnreadRedDotEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TextStatusUnreadRedDotEvent)) {
            return false;
        }
        TextStatusUnreadRedDotEvent textStatusUnreadRedDotEvent = (TextStatusUnreadRedDotEvent) iEvent;
        return true;
    }
}
