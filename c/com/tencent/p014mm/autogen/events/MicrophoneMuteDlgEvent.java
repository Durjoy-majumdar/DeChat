package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent */
public final class MicrophoneMuteDlgEvent extends IEvent {
    public MicrophoneMuteDlgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MicrophoneMuteDlgEvent)) {
            return false;
        }
        MicrophoneMuteDlgEvent microphoneMuteDlgEvent = (MicrophoneMuteDlgEvent) iEvent;
        return true;
    }
}
