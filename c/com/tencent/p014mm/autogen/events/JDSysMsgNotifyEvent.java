package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.JDSysMsgNotifyEvent */
public final class JDSysMsgNotifyEvent extends IEvent {
    public JDSysMsgNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JDSysMsgNotifyEvent)) {
            return false;
        }
        JDSysMsgNotifyEvent jDSysMsgNotifyEvent = (JDSysMsgNotifyEvent) iEvent;
        return true;
    }
}
