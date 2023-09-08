package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.NotifyGetResultOfVoiceControlEvent */
public final class NotifyGetResultOfVoiceControlEvent extends IEvent {
    public NotifyGetResultOfVoiceControlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGetResultOfVoiceControlEvent)) {
            return false;
        }
        NotifyGetResultOfVoiceControlEvent notifyGetResultOfVoiceControlEvent = (NotifyGetResultOfVoiceControlEvent) iEvent;
        return true;
    }
}
