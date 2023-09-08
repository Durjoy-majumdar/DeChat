package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ExptChangeEvent */
public final class ExptChangeEvent extends IEvent {
    public ExptChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExptChangeEvent)) {
            return false;
        }
        ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
        return true;
    }
}
