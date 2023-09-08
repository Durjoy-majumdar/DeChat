package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DumpSnsEvent */
public final class DumpSnsEvent extends IEvent {
    public DumpSnsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DumpSnsEvent)) {
            return false;
        }
        DumpSnsEvent dumpSnsEvent = (DumpSnsEvent) iEvent;
        return true;
    }
}
