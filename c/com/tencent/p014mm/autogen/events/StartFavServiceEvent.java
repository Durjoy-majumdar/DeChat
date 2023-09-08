package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.StartFavServiceEvent */
public final class StartFavServiceEvent extends IEvent {
    public StartFavServiceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartFavServiceEvent)) {
            return false;
        }
        StartFavServiceEvent startFavServiceEvent = (StartFavServiceEvent) iEvent;
        return true;
    }
}
