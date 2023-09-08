package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.ui.u1 */
public class C70952u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205399d;

    public C70952u1(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205399d = walletMerchantPayUI;
    }

    public void run() {
        Log.m105924i("MicroMsg.MerchantPayUI", "delay finish");
        this.f205399d.finish();
    }
}
