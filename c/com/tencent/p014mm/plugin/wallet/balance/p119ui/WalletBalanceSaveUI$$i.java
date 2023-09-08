package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$i */
public class WalletBalanceSaveUI$$i implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceSaveUI f207864d;

    public WalletBalanceSaveUI$$i(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207864d = walletBalanceSaveUI;
    }

    public void afterTextChanged(Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 3) {
            WalletFormView.m90177f(this.f207864d.f207836h.getContentEt(), obj, indexOf + 3, length);
        } else if (indexOf > 10) {
            WalletFormView.m90177f(this.f207864d.f207836h.getContentEt(), obj, 10, indexOf);
        } else if (indexOf == -1 && length > 10) {
            WalletFormView.m90177f(this.f207864d.f207836h.getContentEt(), obj, 10, length);
        }
        WalletBalanceSaveUI walletBalanceSaveUI = this.f207864d;
        int i = WalletBalanceSaveUI.f207831A;
        walletBalanceSaveUI.mo98878L7();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
