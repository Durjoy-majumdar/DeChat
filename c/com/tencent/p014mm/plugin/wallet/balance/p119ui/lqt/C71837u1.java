package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.u1 */
public class C71837u1 implements C79148e.C79149a {
    public C71837u1(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
    }

    public Intent onProcessEnd(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "feedbackData: %s", bundle);
        return null;
    }
}
