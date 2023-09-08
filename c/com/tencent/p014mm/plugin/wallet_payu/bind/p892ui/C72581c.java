package com.tencent.p014mm.plugin.wallet_payu.bind.p892ui;

import android.text.Editable;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUCardElementUI;

/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.c */
public class C72581c extends WalletPayUCardElementUI.C72577a {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUCardElementUI f211158d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72581c(WalletPayUCardElementUI walletPayUCardElementUI) {
        super(walletPayUCardElementUI, (C72579a) null);
        this.f211158d = walletPayUCardElementUI;
    }

    public void afterTextChanged(Editable editable) {
        WalletPayUCardElementUI walletPayUCardElementUI = this.f211158d;
        WalletPayUCardElementUI.m84945H7(walletPayUCardElementUI, walletPayUCardElementUI.f211141d, editable);
    }
}
