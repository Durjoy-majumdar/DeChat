package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.v */
public class C72435v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f210692d;

    /* renamed from: e */
    public final /* synthetic */ WalletCardImportUI.C72240a f210693e;

    public C72435v(WalletCardImportUI.C72240a aVar, int i) {
        this.f210693e = aVar;
        this.f210692d = i;
    }

    public void run() {
        if (this.f210692d != WalletCardImportUI.this.f209961e.getVisibility()) {
            WalletCardImportUI.this.f209961e.setVisibility(this.f210692d);
        }
    }
}
