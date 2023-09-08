package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CleanError0831Event */
public final class CleanError0831Event extends IEvent {
    public CleanError0831Event() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CleanError0831Event)) {
            return false;
        }
        CleanError0831Event cleanError0831Event = (CleanError0831Event) iEvent;
        return true;
    }
}
