package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CheckLanguageChangeEvent */
public final class CheckLanguageChangeEvent extends IEvent {
    public CheckLanguageChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckLanguageChangeEvent)) {
            return false;
        }
        CheckLanguageChangeEvent checkLanguageChangeEvent = (CheckLanguageChangeEvent) iEvent;
        return true;
    }
}
