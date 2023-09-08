package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.remittance.ui.a2 */
public class C70872a2 implements RemittanceRemarkInputHalfPage.C70829c {

    /* renamed from: a */
    public final /* synthetic */ WalletMerchantPayUI f205278a;

    public C70872a2(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205278a = walletMerchantPayUI;
    }

    public void onResult(boolean z, String str, String str2) {
        if (!z) {
            if (!Util.isNullOrNil(str)) {
                this.f205278a.f205258y = str;
            } else {
                this.f205278a.f205258y = "";
            }
            WalletMerchantPayUI walletMerchantPayUI = this.f205278a;
            int i = WalletMerchantPayUI.f205217X;
            walletMerchantPayUI.mo97530L7();
        }
        this.f205278a.f205244h.mo105095m();
        this.f205278a.showNormalStWcKb();
    }
}
