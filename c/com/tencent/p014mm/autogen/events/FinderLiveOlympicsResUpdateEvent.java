package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveOlympicsResUpdateEvent */
public final class FinderLiveOlympicsResUpdateEvent extends IEvent {
    public FinderLiveOlympicsResUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveOlympicsResUpdateEvent)) {
            return false;
        }
        FinderLiveOlympicsResUpdateEvent finderLiveOlympicsResUpdateEvent = (FinderLiveOlympicsResUpdateEvent) iEvent;
        return true;
    }
}
