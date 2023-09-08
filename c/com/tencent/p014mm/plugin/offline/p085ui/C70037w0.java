package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.offline.ui.w0 */
public class C70037w0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202066d;

    public C70037w0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202066d = walletOfflineCoinPurseUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(0, this.f202066d.getString(C0966R.string.lbp));
        e0Var.mo107140d(1, this.f202066d.getResources().getColor(C0966R.color.f2966ao), this.f202066d.getString(C0966R.string.lal));
    }
}
