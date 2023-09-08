package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent */
public final class ReleaseFingerPrintAuthEvent extends IEvent {
    public ReleaseFingerPrintAuthEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReleaseFingerPrintAuthEvent)) {
            return false;
        }
        ReleaseFingerPrintAuthEvent releaseFingerPrintAuthEvent = (ReleaseFingerPrintAuthEvent) iEvent;
        return true;
    }
}
