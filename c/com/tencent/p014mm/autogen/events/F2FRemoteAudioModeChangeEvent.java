package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.F2FRemoteAudioModeChangeEvent */
public final class F2FRemoteAudioModeChangeEvent extends IEvent {
    public F2FRemoteAudioModeChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof F2FRemoteAudioModeChangeEvent)) {
            return false;
        }
        F2FRemoteAudioModeChangeEvent f2FRemoteAudioModeChangeEvent = (F2FRemoteAudioModeChangeEvent) iEvent;
        return true;
    }
}
