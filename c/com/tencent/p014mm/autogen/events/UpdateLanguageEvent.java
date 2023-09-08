package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UpdateLanguageEvent */
public final class UpdateLanguageEvent extends IEvent {
    public UpdateLanguageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateLanguageEvent)) {
            return false;
        }
        UpdateLanguageEvent updateLanguageEvent = (UpdateLanguageEvent) iEvent;
        return true;
    }
}
