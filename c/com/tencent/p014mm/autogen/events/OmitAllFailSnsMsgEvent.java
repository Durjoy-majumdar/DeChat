package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OmitAllFailSnsMsgEvent */
public final class OmitAllFailSnsMsgEvent extends IEvent {
    public OmitAllFailSnsMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OmitAllFailSnsMsgEvent)) {
            return false;
        }
        OmitAllFailSnsMsgEvent omitAllFailSnsMsgEvent = (OmitAllFailSnsMsgEvent) iEvent;
        return true;
    }
}
