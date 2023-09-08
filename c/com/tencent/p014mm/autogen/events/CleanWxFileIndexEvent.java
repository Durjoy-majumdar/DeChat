package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CleanWxFileIndexEvent */
public final class CleanWxFileIndexEvent extends IEvent {
    public CleanWxFileIndexEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CleanWxFileIndexEvent)) {
            return false;
        }
        CleanWxFileIndexEvent cleanWxFileIndexEvent = (CleanWxFileIndexEvent) iEvent;
        return true;
    }
}
