package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.tencent.mm.plugin.remittance.ui.z1 */
public class C70967z1 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205424d;

    public C70967z1(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205424d = walletMerchantPayUI;
    }

    public void onFocusChange(View view, boolean z) {
        if (view.isFocused()) {
            this.f205424d.f205250q.setHint("");
            ((InputMethodManager) this.f205424d.getContext().getSystemService("input_method")).showSoftInput(this.f205424d.f205250q, 0);
        } else if (this.f205424d.f205250q.getText().length() <= 0) {
            WalletMerchantPayUI walletMerchantPayUI = this.f205424d;
            walletMerchantPayUI.f205250q.setHint(walletMerchantPayUI.f205252s);
        }
    }
}
