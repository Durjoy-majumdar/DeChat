package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SnsClickUnreadBtnEvent */
public final class SnsClickUnreadBtnEvent extends IEvent {
    public SnsClickUnreadBtnEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsClickUnreadBtnEvent)) {
            return false;
        }
        SnsClickUnreadBtnEvent snsClickUnreadBtnEvent = (SnsClickUnreadBtnEvent) iEvent;
        return true;
    }
}
