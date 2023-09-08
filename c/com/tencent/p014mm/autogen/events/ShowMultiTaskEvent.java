package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShowMultiTaskEvent */
public final class ShowMultiTaskEvent extends IEvent {
    public ShowMultiTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShowMultiTaskEvent)) {
            return false;
        }
        ShowMultiTaskEvent showMultiTaskEvent = (ShowMultiTaskEvent) iEvent;
        return true;
    }
}
