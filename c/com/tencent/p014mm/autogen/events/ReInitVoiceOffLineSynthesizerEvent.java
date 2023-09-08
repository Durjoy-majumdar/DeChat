package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent */
public final class ReInitVoiceOffLineSynthesizerEvent extends IEvent {
    public ReInitVoiceOffLineSynthesizerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReInitVoiceOffLineSynthesizerEvent)) {
            return false;
        }
        ReInitVoiceOffLineSynthesizerEvent reInitVoiceOffLineSynthesizerEvent = (ReInitVoiceOffLineSynthesizerEvent) iEvent;
        return true;
    }
}
