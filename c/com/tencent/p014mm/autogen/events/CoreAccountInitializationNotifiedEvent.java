package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent */
public final class CoreAccountInitializationNotifiedEvent extends IEvent {
    public CoreAccountInitializationNotifiedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CoreAccountInitializationNotifiedEvent)) {
            return false;
        }
        CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent = (CoreAccountInitializationNotifiedEvent) iEvent;
        return true;
    }
}
