package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import ie3.C76324c;
import k53.C76492a;
import nj3.C11184p0;
import yq3.C79143a;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$g */
public class WalletLqtSaveFetchUI$$g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C76492a f208252d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtSaveFetchUI f208253e;

    public WalletLqtSaveFetchUI$$g(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C76492a aVar) {
        this.f208253e = walletLqtSaveFetchUI;
        this.f208252d = aVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76492a aVar = this.f208252d;
        if (aVar != null) {
            aVar.mo106728c();
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208253e;
            int i2 = walletLqtSaveFetchUI.f208173T;
            boolean z = true;
            if (i2 == 1 || i2 == 2) {
                walletLqtSaveFetchUI.getClass();
                Bundle bundle = new Bundle();
                PayInfo payInfo = (PayInfo) walletLqtSaveFetchUI.getInput().get("key_pay_info");
                if (payInfo == null) {
                    payInfo = new PayInfo();
                    payInfo.f212592j = "";
                    if (walletLqtSaveFetchUI.f208173T == 1) {
                        if (walletLqtSaveFetchUI.f208208p0 == 0) {
                            payInfo.f212587e = 45;
                        } else {
                            payInfo.f212587e = 52;
                        }
                    } else if (walletLqtSaveFetchUI.f208208p0 == 0) {
                        payInfo.f212587e = 51;
                    } else {
                        payInfo.f212587e = 53;
                    }
                }
                bundle.putParcelable("key_pay_info", payInfo);
                if (walletLqtSaveFetchUI.f208173T == 1) {
                    if (walletLqtSaveFetchUI.f208208p0 == 0) {
                        bundle.putInt("key_scene", 45);
                    } else {
                        bundle.putInt("key_scene", 52);
                    }
                    bundle.putInt("key_bind_scene", 16);
                } else {
                    if (walletLqtSaveFetchUI.f208208p0 == 0) {
                        bundle.putInt("key_scene", 51);
                    } else {
                        bundle.putInt("key_scene", 53);
                    }
                    bundle.putInt("key_bind_scene", 17);
                }
                bundle.putBoolean("key_need_bind_response", true);
                bundle.putInt("key_req_bind_scene", 0);
                bundle.putBoolean("key_is_bind_bankcard", true);
                if (C79144b.m95773a().mo109087b()) {
                    walletLqtSaveFetchUI.f208204l1.alive();
                    Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "startKindaBindCard:true");
                    C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
                    C75133p0.m90118b(bundle.getInt("key_bind_scene"));
                    ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(walletLqtSaveFetchUI, bundle);
                } else {
                    Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "startKindaBindCard:false");
                    z = false;
                }
                if (!z) {
                    C79143a.m95771j(walletLqtSaveFetchUI, C71787c.class, bundle, new C71837u1(walletLqtSaveFetchUI));
                }
            }
        }
    }
}
