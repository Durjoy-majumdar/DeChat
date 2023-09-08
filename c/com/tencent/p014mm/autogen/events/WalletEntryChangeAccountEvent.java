package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent */
public final class WalletEntryChangeAccountEvent extends IEvent {
    public WalletEntryChangeAccountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletEntryChangeAccountEvent)) {
            return false;
        }
        WalletEntryChangeAccountEvent walletEntryChangeAccountEvent = (WalletEntryChangeAccountEvent) iEvent;
        return true;
    }
}
