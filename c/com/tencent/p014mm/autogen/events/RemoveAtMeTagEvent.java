package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.RemoveAtMeTagEvent */
public final class RemoveAtMeTagEvent extends IEvent {
    public RemoveAtMeTagEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemoveAtMeTagEvent)) {
            return false;
        }
        RemoveAtMeTagEvent removeAtMeTagEvent = (RemoveAtMeTagEvent) iEvent;
        return true;
    }
}
