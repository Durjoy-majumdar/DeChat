package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OnPrivacyPolicyAgreedEvent */
public final class OnPrivacyPolicyAgreedEvent extends IEvent {
    public OnPrivacyPolicyAgreedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnPrivacyPolicyAgreedEvent)) {
            return false;
        }
        OnPrivacyPolicyAgreedEvent onPrivacyPolicyAgreedEvent = (OnPrivacyPolicyAgreedEvent) iEvent;
        return true;
    }
}
