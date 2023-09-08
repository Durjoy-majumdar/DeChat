package com.tencent.p014mm.plugin.wallet_payu.balance.p891ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceSaveUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import ie3.C76331i;
import ob0.C117747y;
import q63.C77305a;

/* renamed from: com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceSaveUI */
public class WalletPayUBalanceSaveUI extends WalletBalanceSaveUI {
    /* renamed from: H7 */
    public void mo98874H7() {
        doSceneProgress(new C77305a(this.f207832d, "ZAR"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f207837i.setVisibility(8);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0 || !(yVar instanceof C77305a)) {
            return false;
        }
        String str2 = ((C77305a) yVar).f225432d;
        if (Util.isNullOrNil(str2)) {
            return false;
        }
        C76331i.m91761e(this, C76331i.m91757a(str2, "", (String) null, (String) null, 11, 0), 1);
        return false;
    }
}
