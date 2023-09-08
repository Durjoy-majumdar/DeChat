package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.b0 */
public class C72030b0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletSecuritySettingUI f208980g;

    public C72030b0(WalletSecuritySettingUI walletSecuritySettingUI) {
        this.f208980g = walletSecuritySettingUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105926v("MicroMsg.WalletSecuritySettingUI", "alvinluo click close");
        this.f208980g.finish();
    }
}
