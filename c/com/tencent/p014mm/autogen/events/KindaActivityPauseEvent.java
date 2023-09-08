package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.KindaActivityPauseEvent */
public final class KindaActivityPauseEvent extends IEvent {
    public KindaActivityPauseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KindaActivityPauseEvent)) {
            return false;
        }
        KindaActivityPauseEvent kindaActivityPauseEvent = (KindaActivityPauseEvent) iEvent;
        return true;
    }
}
