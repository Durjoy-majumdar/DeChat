package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.e2 */
public class C71795e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208324d;

    public C71795e2(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208324d = walletLqtSaveFetchUI;
    }

    public void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f208324d.findViewById(C0966R.C0970id.gbe).getLocationInWindow(iArr);
        this.f208324d.f208160I.getLocationInWindow(iArr2);
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "scroll y: %s", Integer.valueOf(iArr[1] - iArr2[1]));
        this.f208324d.f208160I.scrollBy(0, iArr[1] - iArr2[1]);
    }
}
