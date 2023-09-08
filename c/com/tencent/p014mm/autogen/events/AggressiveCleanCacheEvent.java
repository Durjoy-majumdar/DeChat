package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.AggressiveCleanCacheEvent */
public final class AggressiveCleanCacheEvent extends IEvent {
    public AggressiveCleanCacheEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AggressiveCleanCacheEvent)) {
            return false;
        }
        AggressiveCleanCacheEvent aggressiveCleanCacheEvent = (AggressiveCleanCacheEvent) iEvent;
        return true;
    }
}
