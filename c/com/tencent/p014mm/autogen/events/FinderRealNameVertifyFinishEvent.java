package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FinderRealNameVertifyFinishEvent */
public final class FinderRealNameVertifyFinishEvent extends IEvent {
    public FinderRealNameVertifyFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderRealNameVertifyFinishEvent)) {
            return false;
        }
        FinderRealNameVertifyFinishEvent finderRealNameVertifyFinishEvent = (FinderRealNameVertifyFinishEvent) iEvent;
        return true;
    }
}
