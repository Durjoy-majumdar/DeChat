package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.WalletCloseProgressEvent */
public final class WalletCloseProgressEvent extends IEvent {
    public WalletCloseProgressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletCloseProgressEvent)) {
            return false;
        }
        WalletCloseProgressEvent walletCloseProgressEvent = (WalletCloseProgressEvent) iEvent;
        return true;
    }
}
