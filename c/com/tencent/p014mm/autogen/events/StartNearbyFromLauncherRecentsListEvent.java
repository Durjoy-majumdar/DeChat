package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.StartNearbyFromLauncherRecentsListEvent */
public final class StartNearbyFromLauncherRecentsListEvent extends IEvent {
    public StartNearbyFromLauncherRecentsListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartNearbyFromLauncherRecentsListEvent)) {
            return false;
        }
        StartNearbyFromLauncherRecentsListEvent startNearbyFromLauncherRecentsListEvent = (StartNearbyFromLauncherRecentsListEvent) iEvent;
        return true;
    }
}
