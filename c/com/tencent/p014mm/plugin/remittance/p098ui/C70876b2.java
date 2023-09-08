package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.ui.b2 */
public class C70876b2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletMerchantPayUI f205286d;

    public C70876b2(WalletMerchantPayUI walletMerchantPayUI) {
        this.f205286d = walletMerchantPayUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105924i("MicroMsg.MerchantPayUI", "click back btn");
        WalletMerchantPayUI walletMerchantPayUI = this.f205286d;
        int i = WalletMerchantPayUI.f205217X;
        if (walletMerchantPayUI.needConfirmFinish()) {
            this.f205286d.hideVKB();
            this.f205286d.showDialog(1000);
        } else {
            WalletMerchantPayUI walletMerchantPayUI2 = this.f205286d;
            walletMerchantPayUI2.mo97527I7(walletMerchantPayUI2.f205256w, 1);
            this.f205286d.finish();
        }
        return true;
    }
}
