package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.MainUIShowListviewEvent */
public final class MainUIShowListviewEvent extends IEvent {
    public MainUIShowListviewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MainUIShowListviewEvent)) {
            return false;
        }
        MainUIShowListviewEvent mainUIShowListviewEvent = (MainUIShowListviewEvent) iEvent;
        return true;
    }
}
