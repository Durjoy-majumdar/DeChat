package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DumpSnsABtestEvent */
public final class DumpSnsABtestEvent extends IEvent {
    public DumpSnsABtestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DumpSnsABtestEvent)) {
            return false;
        }
        DumpSnsABtestEvent dumpSnsABtestEvent = (DumpSnsABtestEvent) iEvent;
        return true;
    }
}
