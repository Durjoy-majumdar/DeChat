package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.d2 */
public class C71791d2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208319d;

    public C71791d2(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208319d = walletLqtSaveFetchUI;
    }

    public void run() {
        int width = this.f208319d.f208157F.getWidth();
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "saveFetchHintWordingTv trueWidth: %d", Integer.valueOf(width));
        if (width > 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f208319d.f208155D.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = width;
            }
            this.f208319d.f208155D.setLayoutParams(layoutParams);
        }
    }
}
