package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43308p;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import nj3.C88989a;
import ob0.C117747y;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBeforeSaveUI */
public class WalletLqtBeforeSaveUI extends WalletBaseUI {
    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new C43308p().mo9225i().mo123062e(new C71823q(this, C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null)));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
