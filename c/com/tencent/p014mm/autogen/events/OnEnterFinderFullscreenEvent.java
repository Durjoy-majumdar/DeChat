package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OnEnterFinderFullscreenEvent */
public final class OnEnterFinderFullscreenEvent extends IEvent {
    public OnEnterFinderFullscreenEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnEnterFinderFullscreenEvent)) {
            return false;
        }
        OnEnterFinderFullscreenEvent onEnterFinderFullscreenEvent = (OnEnterFinderFullscreenEvent) iEvent;
        return true;
    }
}
