package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent */
public final class ExitMultiTalkRoomEvent extends IEvent {
    public ExitMultiTalkRoomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExitMultiTalkRoomEvent)) {
            return false;
        }
        ExitMultiTalkRoomEvent exitMultiTalkRoomEvent = (ExitMultiTalkRoomEvent) iEvent;
        return true;
    }
}
