package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.SwitchAccountKillProcessEvent */
public final class SwitchAccountKillProcessEvent extends IEvent {
    public SwitchAccountKillProcessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SwitchAccountKillProcessEvent)) {
            return false;
        }
        SwitchAccountKillProcessEvent switchAccountKillProcessEvent = (SwitchAccountKillProcessEvent) iEvent;
        return true;
    }
}
