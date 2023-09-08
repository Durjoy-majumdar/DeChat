package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.plugin.remittance.ui.d2 */
public class C70882d2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205295d;

    public C70882d2(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205295d = walletMerchantPayUI;
    }

    public void run() {
        this.f205295d.f205241e.setText(this.f205295d.getString(C0966R.string.m8w) + " " + this.f205295d.f205219B);
        String str = this.f205295d.f205221D;
        if (str == null || str.length() <= 0) {
            String str2 = this.f205295d.f205220C;
            if (str2 != null && str2.length() > 0) {
                WalletMerchantPayUI walletMerchantPayUI = this.f205295d;
                walletMerchantPayUI.f205242f.setText(walletMerchantPayUI.f205220C);
            }
        } else {
            WalletMerchantPayUI walletMerchantPayUI2 = this.f205295d;
            walletMerchantPayUI2.f205242f.setText(walletMerchantPayUI2.f205221D);
        }
        this.f205295d.f205243g.setRoundCorner(true);
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f205295d, 36.0f);
        WalletMerchantPayUI walletMerchantPayUI3 = this.f205295d;
        walletMerchantPayUI3.f205243g.mo100288c(walletMerchantPayUI3.f205222E, fromDPToPix, fromDPToPix, -1);
    }
}
