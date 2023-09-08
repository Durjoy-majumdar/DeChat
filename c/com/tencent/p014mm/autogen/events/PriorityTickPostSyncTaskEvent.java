package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.PriorityTickPostSyncTaskEvent */
public final class PriorityTickPostSyncTaskEvent extends IEvent {
    public PriorityTickPostSyncTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PriorityTickPostSyncTaskEvent)) {
            return false;
        }
        PriorityTickPostSyncTaskEvent priorityTickPostSyncTaskEvent = (PriorityTickPostSyncTaskEvent) iEvent;
        return true;
    }
}
