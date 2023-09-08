package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ChattingUIExitBeginEvent */
public final class ChattingUIExitBeginEvent extends IEvent {
    public ChattingUIExitBeginEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChattingUIExitBeginEvent)) {
            return false;
        }
        ChattingUIExitBeginEvent chattingUIExitBeginEvent = (ChattingUIExitBeginEvent) iEvent;
        return true;
    }
}
