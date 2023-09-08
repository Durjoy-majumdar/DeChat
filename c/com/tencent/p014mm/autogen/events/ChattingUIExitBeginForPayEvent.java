package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ChattingUIExitBeginForPayEvent */
public final class ChattingUIExitBeginForPayEvent extends IEvent {
    public ChattingUIExitBeginForPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChattingUIExitBeginForPayEvent)) {
            return false;
        }
        ChattingUIExitBeginForPayEvent chattingUIExitBeginForPayEvent = (ChattingUIExitBeginForPayEvent) iEvent;
        return true;
    }
}
