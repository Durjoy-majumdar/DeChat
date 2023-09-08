package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.IPCallNewXmlInfoChangeEvent */
public final class IPCallNewXmlInfoChangeEvent extends IEvent {
    public IPCallNewXmlInfoChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof IPCallNewXmlInfoChangeEvent)) {
            return false;
        }
        IPCallNewXmlInfoChangeEvent iPCallNewXmlInfoChangeEvent = (IPCallNewXmlInfoChangeEvent) iEvent;
        return true;
    }
}
