package com.tencent.p014mm.plugin.walletlock.p951ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import rt3.C22252b;

/* renamed from: com.tencent.mm.plugin.walletlock.ui.e */
public class C106569e implements Runnable {
    public C106569e(WalletLockSettingUI walletLockSettingUI) {
    }

    public void run() {
        try {
            C22252b.m25809f(3);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WalletLockSettingUI", "Remove AK after close wallet lock failed! " + e.getMessage());
        }
    }
}
