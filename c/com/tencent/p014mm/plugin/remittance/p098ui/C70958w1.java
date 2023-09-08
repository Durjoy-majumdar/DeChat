package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.remittance.ui.w1 */
public class C70958w1 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205413d;

    public C70958w1(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205413d = walletMerchantPayUI;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.f205413d.showNormalStWcKb();
        }
    }
}
