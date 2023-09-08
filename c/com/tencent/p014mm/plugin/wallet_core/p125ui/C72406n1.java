package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.n1 */
public class C72406n1 implements C72478z.C72479a {

    /* renamed from: a */
    public final /* synthetic */ WalletSelectBankcardUI f210640a;

    public C72406n1(WalletSelectBankcardUI walletSelectBankcardUI) {
        this.f210640a = walletSelectBankcardUI;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.WalletSelectBankcardUI", "hy: user clicked the phone.go to dial");
        WalletSelectBankcardUI walletSelectBankcardUI = this.f210640a;
        C75228t.m90244f(walletSelectBankcardUI, walletSelectBankcardUI.getString(C0966R.string.kml));
    }
}
