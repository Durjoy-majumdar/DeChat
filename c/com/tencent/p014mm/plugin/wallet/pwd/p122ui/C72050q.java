package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import vt1.C78473a;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.q */
public class C72050q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78473a f209006d;

    /* renamed from: e */
    public final /* synthetic */ WalletPasswordSettingUI f209007e;

    public C72050q(WalletPasswordSettingUI walletPasswordSettingUI, C78473a aVar) {
        this.f209007e = walletPasswordSettingUI;
        this.f209006d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "user click the button to set system fingerprint");
        this.f209006d.Il0(this.f209007e);
    }
}
