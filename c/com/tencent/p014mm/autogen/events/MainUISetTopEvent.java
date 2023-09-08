package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.MainUISetTopEvent */
public final class MainUISetTopEvent extends IEvent {
    public MainUISetTopEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MainUISetTopEvent)) {
            return false;
        }
        MainUISetTopEvent mainUISetTopEvent = (MainUISetTopEvent) iEvent;
        return true;
    }
}
