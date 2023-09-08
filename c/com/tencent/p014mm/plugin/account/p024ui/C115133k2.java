package com.tencent.p014mm.plugin.account.p024ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.account.ui.k2 */
public class C115133k2 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ RegAffiliateAccountUI f345160d;

    public C115133k2(RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f345160d = regAffiliateAccountUI;
    }

    public void afterTextChanged(Editable editable) {
        RegAffiliateAccountUI regAffiliateAccountUI = this.f345160d;
        regAffiliateAccountUI.f344800r = regAffiliateAccountUI.f344790e.getText().toString().trim();
        RegAffiliateAccountUI.m161880H7(this.f345160d);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
