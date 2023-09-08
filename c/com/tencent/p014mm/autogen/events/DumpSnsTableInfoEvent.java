package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DumpSnsTableInfoEvent */
public final class DumpSnsTableInfoEvent extends IEvent {
    public DumpSnsTableInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DumpSnsTableInfoEvent)) {
            return false;
        }
        DumpSnsTableInfoEvent dumpSnsTableInfoEvent = (DumpSnsTableInfoEvent) iEvent;
        return true;
    }
}
