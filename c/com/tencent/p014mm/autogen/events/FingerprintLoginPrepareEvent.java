package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FingerprintLoginPrepareEvent */
public final class FingerprintLoginPrepareEvent extends IEvent {
    public FingerprintLoginPrepareEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FingerprintLoginPrepareEvent)) {
            return false;
        }
        FingerprintLoginPrepareEvent fingerprintLoginPrepareEvent = (FingerprintLoginPrepareEvent) iEvent;
        return true;
    }
}
