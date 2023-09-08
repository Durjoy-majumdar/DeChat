package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FcmUnRegisterEvent */
public final class FcmUnRegisterEvent extends IEvent {
    public FcmUnRegisterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FcmUnRegisterEvent)) {
            return false;
        }
        FcmUnRegisterEvent fcmUnRegisterEvent = (FcmUnRegisterEvent) iEvent;
        return true;
    }
}
