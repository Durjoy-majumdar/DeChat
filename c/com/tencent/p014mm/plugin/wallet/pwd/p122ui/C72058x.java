package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletPasswordSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.x */
public class C72058x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletPasswordSettingUI.C720053 f209014d;

    public C72058x(WalletPasswordSettingUI.C720053 r1) {
        this.f209014d = r1;
    }

    public void run() {
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "update after soter init");
        WalletPasswordSettingUI walletPasswordSettingUI = WalletPasswordSettingUI.this;
        int i = WalletPasswordSettingUI.f208872G;
        walletPasswordSettingUI.mo99230R7();
    }
}
