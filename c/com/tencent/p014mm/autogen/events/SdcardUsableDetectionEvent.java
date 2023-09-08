package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SdcardUsableDetectionEvent */
public final class SdcardUsableDetectionEvent extends IEvent {
    public SdcardUsableDetectionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SdcardUsableDetectionEvent)) {
            return false;
        }
        SdcardUsableDetectionEvent sdcardUsableDetectionEvent = (SdcardUsableDetectionEvent) iEvent;
        return true;
    }
}
