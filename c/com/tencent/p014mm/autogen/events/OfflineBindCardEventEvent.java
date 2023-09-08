package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OfflineBindCardEventEvent */
public final class OfflineBindCardEventEvent extends IEvent {
    public OfflineBindCardEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OfflineBindCardEventEvent)) {
            return false;
        }
        OfflineBindCardEventEvent offlineBindCardEventEvent = (OfflineBindCardEventEvent) iEvent;
        return true;
    }
}
