package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShakeCardGiftedEvent */
public final class ShakeCardGiftedEvent extends IEvent {
    public ShakeCardGiftedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShakeCardGiftedEvent)) {
            return false;
        }
        ShakeCardGiftedEvent shakeCardGiftedEvent = (ShakeCardGiftedEvent) iEvent;
        return true;
    }
}
