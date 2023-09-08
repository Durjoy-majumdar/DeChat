package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.VoicePlayStopEvent */
public final class VoicePlayStopEvent extends IEvent {
    public VoicePlayStopEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoicePlayStopEvent)) {
            return false;
        }
        VoicePlayStopEvent voicePlayStopEvent = (VoicePlayStopEvent) iEvent;
        return true;
    }
}
