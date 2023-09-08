package com.tencent.p014mm.plugin.remittance.p098ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.remittance.ui.x1 */
public class C70961x1 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205417d;

    public C70961x1(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205417d = walletMerchantPayUI;
    }

    public void afterTextChanged(Editable editable) {
        WalletMerchantPayUI walletMerchantPayUI = this.f205417d;
        int i = WalletMerchantPayUI.f205217X;
        walletMerchantPayUI.mo97531M7();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
