package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import ie3.C76324c;
import t43.C77854a;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.r */
public class C71853r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceManagerUI f208411d;

    public C71853r(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f208411d = walletBalanceManagerUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WalletBalanceManagerUI walletBalanceManagerUI = this.f208411d;
        int i2 = WalletBalanceManagerUI.f207786A;
        walletBalanceManagerUI.getClass();
        Bundle bundle = new Bundle();
        PayInfo payInfo = (PayInfo) walletBalanceManagerUI.getInput().get("key_pay_info");
        PayInfo payInfo2 = new PayInfo();
        payInfo2.f212587e = 21;
        bundle.putParcelable("key_pay_info", payInfo2);
        bundle.putInt("key_scene", 21);
        boolean z = false;
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 0);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putInt("from_bind_ui", 1);
        if (C79144b.m95773a().mo109087b()) {
            walletBalanceManagerUI.f207806z.alive();
            Log.m105918d("MicroMsg.WalletBalanceManagerUI", "startKindaBindCard:true");
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(walletBalanceManagerUI, bundle);
            z = true;
        } else {
            Log.m105918d("MicroMsg.WalletBalanceManagerUI", "startKindaBindCard:false");
        }
        if (!z) {
            C79143a.m95771j(walletBalanceManagerUI, C77854a.class, bundle, (C79148e.C79149a) null);
        }
    }
}
