package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ReportCCDataByPayEvent */
public final class ReportCCDataByPayEvent extends IEvent {
    public ReportCCDataByPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportCCDataByPayEvent)) {
            return false;
        }
        ReportCCDataByPayEvent reportCCDataByPayEvent = (ReportCCDataByPayEvent) iEvent;
        return true;
    }
}
