package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.MyLifeAroundPreloadEvent */
public final class MyLifeAroundPreloadEvent extends IEvent {
    public MyLifeAroundPreloadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MyLifeAroundPreloadEvent)) {
            return false;
        }
        MyLifeAroundPreloadEvent myLifeAroundPreloadEvent = (MyLifeAroundPreloadEvent) iEvent;
        return true;
    }
}
