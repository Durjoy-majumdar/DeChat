package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CloseImagePreviewEvent */
public final class CloseImagePreviewEvent extends IEvent {
    public CloseImagePreviewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseImagePreviewEvent)) {
            return false;
        }
        CloseImagePreviewEvent closeImagePreviewEvent = (CloseImagePreviewEvent) iEvent;
        return true;
    }
}
