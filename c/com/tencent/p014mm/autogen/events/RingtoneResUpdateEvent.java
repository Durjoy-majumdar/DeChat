package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.RingtoneResUpdateEvent */
public final class RingtoneResUpdateEvent extends IEvent {
    public RingtoneResUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RingtoneResUpdateEvent)) {
            return false;
        }
        RingtoneResUpdateEvent ringtoneResUpdateEvent = (RingtoneResUpdateEvent) iEvent;
        return true;
    }
}
