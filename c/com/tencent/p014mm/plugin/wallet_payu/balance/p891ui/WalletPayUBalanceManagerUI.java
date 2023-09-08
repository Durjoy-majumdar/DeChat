package com.tencent.p014mm.plugin.wallet_payu.balance.p891ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceManagerUI;
import ob0.C117747y;
import x53.C78770a;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceManagerUI */
public class WalletPayUBalanceManagerUI extends WalletBalanceManagerUI {
    /* renamed from: H7 */
    public void mo98860H7() {
        doSceneProgress(new C78770a(), C79029b0.vx0().wx0().f192955h == null);
    }

    /* renamed from: J7 */
    public void mo98862J7() {
        startActivity(WalletPayUBalanceSaveUI.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && (yVar instanceof C78770a)) {
            mo98865M7(false);
        }
        return false;
    }
}
