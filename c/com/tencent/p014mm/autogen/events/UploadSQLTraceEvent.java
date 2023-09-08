package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UploadSQLTraceEvent */
public final class UploadSQLTraceEvent extends IEvent {
    public UploadSQLTraceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UploadSQLTraceEvent)) {
            return false;
        }
        UploadSQLTraceEvent uploadSQLTraceEvent = (UploadSQLTraceEvent) iEvent;
        return true;
    }
}
