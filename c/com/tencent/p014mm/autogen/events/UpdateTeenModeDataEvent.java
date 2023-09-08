package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UpdateTeenModeDataEvent */
public final class UpdateTeenModeDataEvent extends IEvent {
    public UpdateTeenModeDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateTeenModeDataEvent)) {
            return false;
        }
        UpdateTeenModeDataEvent updateTeenModeDataEvent = (UpdateTeenModeDataEvent) iEvent;
        return true;
    }
}
