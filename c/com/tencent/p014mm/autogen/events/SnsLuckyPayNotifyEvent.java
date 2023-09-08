package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsLuckyPayNotifyEvent */
public final class SnsLuckyPayNotifyEvent extends IEvent {
    public SnsLuckyPayNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsLuckyPayNotifyEvent)) {
            return false;
        }
        SnsLuckyPayNotifyEvent snsLuckyPayNotifyEvent = (SnsLuckyPayNotifyEvent) iEvent;
        return true;
    }
}
