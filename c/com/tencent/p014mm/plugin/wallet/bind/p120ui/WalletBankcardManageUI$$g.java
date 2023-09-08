package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import ie3.C76324c;
import t53.C77866b;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$g */
public class WalletBankcardManageUI$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f208472d;

    /* renamed from: e */
    public final /* synthetic */ WalletBankcardManageUI f208473e;

    public WalletBankcardManageUI$$g(WalletBankcardManageUI walletBankcardManageUI, Bundle bundle) {
        this.f208473e = walletBankcardManageUI;
        this.f208472d = bundle;
    }

    public void run() {
        this.f208472d.putInt("key_bind_scene", 15);
        this.f208472d.putBoolean("key_bind_show_change_card", true);
        if (C79144b.m95773a().mo109087b()) {
            this.f208473e.f208459x.alive();
            WalletBankcardManageUI walletBankcardManageUI = this.f208473e;
            Bundle bundle = this.f208472d;
            walletBankcardManageUI.getClass();
            Log.m105918d("MicroMsg.WalletBankcardManageUI", "startKindaBindCard");
            if (bundle != null) {
                C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
                C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            } else {
                C75136r0.m90122d(6, 0);
                C75133p0.m90118b(0);
            }
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(walletBankcardManageUI, bundle);
            return;
        }
        C79143a.m95771j(this.f208473e, C77866b.class, this.f208472d, (C79148e.C79149a) null);
    }
}
