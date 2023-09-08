package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.PreloadToolsProcessEvent */
public final class PreloadToolsProcessEvent extends IEvent {
    public PreloadToolsProcessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PreloadToolsProcessEvent)) {
            return false;
        }
        PreloadToolsProcessEvent preloadToolsProcessEvent = (PreloadToolsProcessEvent) iEvent;
        return true;
    }
}
