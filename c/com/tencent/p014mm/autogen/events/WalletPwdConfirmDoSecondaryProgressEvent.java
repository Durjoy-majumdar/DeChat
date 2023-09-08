package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressEvent */
public final class WalletPwdConfirmDoSecondaryProgressEvent extends IEvent {
    public WalletPwdConfirmDoSecondaryProgressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletPwdConfirmDoSecondaryProgressEvent)) {
            return false;
        }
        WalletPwdConfirmDoSecondaryProgressEvent walletPwdConfirmDoSecondaryProgressEvent = (WalletPwdConfirmDoSecondaryProgressEvent) iEvent;
        return true;
    }
}
