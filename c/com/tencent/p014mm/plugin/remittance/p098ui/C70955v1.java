package com.tencent.p014mm.plugin.remittance.p098ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.v1 */
public class C70955v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f205405d;

    /* renamed from: e */
    public final /* synthetic */ WalletMerchantPayUI f205406e;

    public C70955v1(WalletMerchantPayUI walletMerchantPayUI, boolean z) {
        this.f205406e = walletMerchantPayUI;
        this.f205405d = z;
    }

    public void run() {
        if (this.f205405d) {
            this.f205406e.f205244h.setHint("");
            this.f205406e.f205244h.getContentEt().requestFocus();
        }
    }
}
