package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CleanWebViewCacheEvent */
public final class CleanWebViewCacheEvent extends IEvent {
    public CleanWebViewCacheEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CleanWebViewCacheEvent)) {
            return false;
        }
        CleanWebViewCacheEvent cleanWebViewCacheEvent = (CleanWebViewCacheEvent) iEvent;
        return true;
    }
}
