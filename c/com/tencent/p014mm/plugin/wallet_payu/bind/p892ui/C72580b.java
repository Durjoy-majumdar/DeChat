package com.tencent.p014mm.plugin.wallet_payu.bind.p892ui;

import android.text.Editable;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUCardElementUI;

/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.b */
public class C72580b extends WalletPayUCardElementUI.C72577a {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUCardElementUI f211157d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72580b(WalletPayUCardElementUI walletPayUCardElementUI) {
        super(walletPayUCardElementUI, (C72579a) null);
        this.f211157d = walletPayUCardElementUI;
    }

    public void afterTextChanged(Editable editable) {
        WalletPayUCardElementUI walletPayUCardElementUI = this.f211157d;
        WalletPayUCardElementUI.m84945H7(walletPayUCardElementUI, walletPayUCardElementUI.f211142e, editable);
    }
}
