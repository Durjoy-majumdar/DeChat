package com.tencent.p014mm.plugin.wallet_core.p125ui;

import di3.C86312j;
import p281yz.C79173v;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.u */
public class C72433u implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ WalletCardElementUI f210690a;

    public C72433u(WalletCardElementUI walletCardElementUI) {
        this.f210690a = walletCardElementUI;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        this.f210690a.hideVKB();
        this.f210690a.hideTenpayKB();
        if (z) {
            WalletCardElementUI walletCardElementUI = this.f210690a;
            int i = walletCardElementUI.f209838H1;
            if (i != -1) {
                walletCardElementUI.f209840I1 = i;
                int intValue = walletCardElementUI.f209861W.mo99415a().get(this.f210690a.f209838H1).intValue();
                WalletCardElementUI walletCardElementUI2 = this.f210690a;
                if (walletCardElementUI2.f209862W0 != intValue) {
                    walletCardElementUI2.f209862W0 = intValue;
                    walletCardElementUI2.f209828C1 = walletCardElementUI2.f209913y.getText();
                    this.f210690a.f209913y.setText(((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91346b(this.f210690a.getContext(), this.f210690a.f209862W0));
                    WalletCardElementUI walletCardElementUI3 = this.f210690a;
                    walletCardElementUI3.mo99517M7(walletCardElementUI3.f209916z, walletCardElementUI3.f209862W0);
                    this.f210690a.f209916z.mo105071c();
                    this.f210690a.f209916z.mo105072d();
                    this.f210690a.mo99520P7(false);
                }
            } else {
                return;
            }
        }
        this.f210690a.f209838H1 = -1;
    }
}
