package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.EnterSnsTimeLineUIEvent */
public final class EnterSnsTimeLineUIEvent extends IEvent {
    public EnterSnsTimeLineUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnterSnsTimeLineUIEvent)) {
            return false;
        }
        EnterSnsTimeLineUIEvent enterSnsTimeLineUIEvent = (EnterSnsTimeLineUIEvent) iEvent;
        return true;
    }
}
