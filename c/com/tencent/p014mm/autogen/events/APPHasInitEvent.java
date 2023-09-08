package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.APPHasInitEvent */
public final class APPHasInitEvent extends IEvent {
    public APPHasInitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof APPHasInitEvent)) {
            return false;
        }
        APPHasInitEvent aPPHasInitEvent = (APPHasInitEvent) iEvent;
        return true;
    }
}
