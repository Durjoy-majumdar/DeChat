package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.FinderPrivateMsgBubbleEvent */
public final class FinderPrivateMsgBubbleEvent extends IEvent {
    public FinderPrivateMsgBubbleEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderPrivateMsgBubbleEvent)) {
            return false;
        }
        FinderPrivateMsgBubbleEvent finderPrivateMsgBubbleEvent = (FinderPrivateMsgBubbleEvent) iEvent;
        return true;
    }
}
