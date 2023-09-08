package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.StopAllChannelEvent */
public final class StopAllChannelEvent extends IEvent {
    public StopAllChannelEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StopAllChannelEvent)) {
            return false;
        }
        StopAllChannelEvent stopAllChannelEvent = (StopAllChannelEvent) iEvent;
        return true;
    }
}
