package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import p281yz.C79173v;

/* renamed from: com.tencent.mm.plugin.offline.ui.t0 */
public class C70029t0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202055g;

    public C70029t0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202055g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        WalletOfflineCoinPurseUI.m82435R7(2);
        String str = (view.getTag() == null || !(view.getTag() instanceof String)) ? "" : (String) view.getTag();
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "mOfflineGuideButtonTv click! bindSerial:%s", str);
        if (!Util.isNullOrNil(str)) {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202055g;
            walletOfflineCoinPurseUI.f201867Z0 = false;
            walletOfflineCoinPurseUI.f201814B1 = true;
            this.f202055g.mo96293N7(((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91323e(str), false, (Runnable) null);
        }
    }
}
