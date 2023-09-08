package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.StoryVideoViewDetachEvent */
public final class StoryVideoViewDetachEvent extends IEvent {
    public StoryVideoViewDetachEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StoryVideoViewDetachEvent)) {
            return false;
        }
        StoryVideoViewDetachEvent storyVideoViewDetachEvent = (StoryVideoViewDetachEvent) iEvent;
        return true;
    }
}
