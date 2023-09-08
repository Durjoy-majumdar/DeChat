package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.NotifyMsgForSnsEvent */
public final class NotifyMsgForSnsEvent extends IEvent {
    public NotifyMsgForSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyMsgForSnsEvent)) {
            return false;
        }
        NotifyMsgForSnsEvent notifyMsgForSnsEvent = (NotifyMsgForSnsEvent) iEvent;
        return true;
    }
}
