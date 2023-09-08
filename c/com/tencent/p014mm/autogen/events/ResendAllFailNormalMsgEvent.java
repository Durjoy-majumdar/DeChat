package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ResendAllFailNormalMsgEvent */
public final class ResendAllFailNormalMsgEvent extends IEvent {
    public ResendAllFailNormalMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendAllFailNormalMsgEvent)) {
            return false;
        }
        ResendAllFailNormalMsgEvent resendAllFailNormalMsgEvent = (ResendAllFailNormalMsgEvent) iEvent;
        return true;
    }
}
