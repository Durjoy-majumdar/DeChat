package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.BankcardLogoReadyEvent */
public final class BankcardLogoReadyEvent extends IEvent {
    public BankcardLogoReadyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BankcardLogoReadyEvent)) {
            return false;
        }
        BankcardLogoReadyEvent bankcardLogoReadyEvent = (BankcardLogoReadyEvent) iEvent;
        return true;
    }
}
