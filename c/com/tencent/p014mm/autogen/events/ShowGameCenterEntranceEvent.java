package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent */
public final class ShowGameCenterEntranceEvent extends IEvent {
    public ShowGameCenterEntranceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShowGameCenterEntranceEvent)) {
            return false;
        }
        ShowGameCenterEntranceEvent showGameCenterEntranceEvent = (ShowGameCenterEntranceEvent) iEvent;
        return true;
    }
}
