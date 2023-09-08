package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsUploadPostDoneEvent */
public final class SnsUploadPostDoneEvent extends IEvent {
    public SnsUploadPostDoneEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsUploadPostDoneEvent)) {
            return false;
        }
        SnsUploadPostDoneEvent snsUploadPostDoneEvent = (SnsUploadPostDoneEvent) iEvent;
        return true;
    }
}
