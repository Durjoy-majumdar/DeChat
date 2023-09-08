package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UpdateSnsHeaderNotiftyListEvent */
public final class UpdateSnsHeaderNotiftyListEvent extends IEvent {
    public UpdateSnsHeaderNotiftyListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateSnsHeaderNotiftyListEvent)) {
            return false;
        }
        UpdateSnsHeaderNotiftyListEvent updateSnsHeaderNotiftyListEvent = (UpdateSnsHeaderNotiftyListEvent) iEvent;
        return true;
    }
}
