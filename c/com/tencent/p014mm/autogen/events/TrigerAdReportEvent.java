package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.TrigerAdReportEvent */
public final class TrigerAdReportEvent extends IEvent {
    public TrigerAdReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TrigerAdReportEvent)) {
            return false;
        }
        TrigerAdReportEvent trigerAdReportEvent = (TrigerAdReportEvent) iEvent;
        return true;
    }
}
