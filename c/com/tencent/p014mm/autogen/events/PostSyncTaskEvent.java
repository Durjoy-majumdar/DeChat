package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.PostSyncTaskEvent */
public final class PostSyncTaskEvent extends IEvent {
    public PostSyncTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PostSyncTaskEvent)) {
            return false;
        }
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        return true;
    }
}
