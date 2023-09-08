package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent */
public final class ShakeCardMsgNotifyEvent extends IEvent {
    public ShakeCardMsgNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShakeCardMsgNotifyEvent)) {
            return false;
        }
        ShakeCardMsgNotifyEvent shakeCardMsgNotifyEvent = (ShakeCardMsgNotifyEvent) iEvent;
        return true;
    }
}
