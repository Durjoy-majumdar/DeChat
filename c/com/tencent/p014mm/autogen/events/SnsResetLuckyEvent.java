package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsResetLuckyEvent */
public final class SnsResetLuckyEvent extends IEvent {
    public SnsResetLuckyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsResetLuckyEvent)) {
            return false;
        }
        SnsResetLuckyEvent snsResetLuckyEvent = (SnsResetLuckyEvent) iEvent;
        return true;
    }
}
