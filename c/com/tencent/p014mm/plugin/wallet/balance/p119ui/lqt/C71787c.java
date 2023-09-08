package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import t53.C77866b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.c */
public class C71787c extends C77866b {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        return super.mo91260A(activity, bundle);
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "BalanceFetchCardProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
            return;
        }
        mo109113k(activity, "wallet", ".balance.ui.lqt.WalletLqtSaveFetchUI", -1, new Intent(), true);
    }
}
