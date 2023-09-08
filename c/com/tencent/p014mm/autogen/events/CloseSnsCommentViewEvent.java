package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CloseSnsCommentViewEvent */
public final class CloseSnsCommentViewEvent extends IEvent {
    public CloseSnsCommentViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseSnsCommentViewEvent)) {
            return false;
        }
        CloseSnsCommentViewEvent closeSnsCommentViewEvent = (CloseSnsCommentViewEvent) iEvent;
        return true;
    }
}
