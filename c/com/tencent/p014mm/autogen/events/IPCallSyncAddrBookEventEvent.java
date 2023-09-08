package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.IPCallSyncAddrBookEventEvent */
public final class IPCallSyncAddrBookEventEvent extends IEvent {
    public IPCallSyncAddrBookEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof IPCallSyncAddrBookEventEvent)) {
            return false;
        }
        IPCallSyncAddrBookEventEvent iPCallSyncAddrBookEventEvent = (IPCallSyncAddrBookEventEvent) iEvent;
        return true;
    }
}
