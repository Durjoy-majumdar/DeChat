package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.z1 */
public class C71846z1 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208399d;

    public C71846z1(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208399d = walletLqtSaveFetchUI;
    }

    public void afterTextChanged(Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 3) {
            WalletFormView.m90177f(this.f208399d.f208199i.getContentEt(), obj, indexOf + 3, length);
        } else if (indexOf > 12) {
            WalletFormView.m90177f(this.f208399d.f208199i.getContentEt(), obj, 12, indexOf);
        } else if (indexOf == -1 && length > 12) {
            WalletFormView.m90177f(this.f208399d.f208199i.getContentEt(), obj, 12, length);
        }
        String obj2 = editable.toString();
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208399d;
        int i = WalletLqtSaveFetchUI.f208151m1;
        walletLqtSaveFetchUI.mo98990c8(obj2, false);
        this.f208399d.f208174T0 = obj2;
        if (Util.isNullOrNil(obj2)) {
            this.f208399d.f208154C.setVisibility(8);
        } else {
            this.f208399d.f208154C.setVisibility(0);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
