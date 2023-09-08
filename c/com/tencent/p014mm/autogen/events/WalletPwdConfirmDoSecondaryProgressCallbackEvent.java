package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.WalletPwdConfirmDoSecondaryProgressCallbackEvent */
public final class WalletPwdConfirmDoSecondaryProgressCallbackEvent extends IEvent {
    public WalletPwdConfirmDoSecondaryProgressCallbackEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletPwdConfirmDoSecondaryProgressCallbackEvent)) {
            return false;
        }
        WalletPwdConfirmDoSecondaryProgressCallbackEvent walletPwdConfirmDoSecondaryProgressCallbackEvent = (WalletPwdConfirmDoSecondaryProgressCallbackEvent) iEvent;
        return true;
    }
}
