package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletChangeBankcardUI;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.c */
public class C71954c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletRealNameResultNotifyEvent f208722d;

    /* renamed from: e */
    public final /* synthetic */ WalletChangeBankcardUI.C718951 f208723e;

    public C71954c(WalletChangeBankcardUI.C718951 r1, WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
        this.f208723e = r1;
        this.f208722d = walletRealNameResultNotifyEvent;
    }

    public void run() {
        if (-1 == this.f208722d.f9603d.f9604a) {
            WalletChangeBankcardUI walletChangeBankcardUI = WalletChangeBankcardUI.this;
            int i = WalletChangeBankcardUI.f208532z;
            walletChangeBankcardUI.mo99094N7(-1);
        }
    }
}
