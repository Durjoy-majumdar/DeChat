package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.ShowWalletOrderInfoEvent */
public final class ShowWalletOrderInfoEvent extends IEvent {
    public ShowWalletOrderInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShowWalletOrderInfoEvent)) {
            return false;
        }
        ShowWalletOrderInfoEvent showWalletOrderInfoEvent = (ShowWalletOrderInfoEvent) iEvent;
        return true;
    }
}
