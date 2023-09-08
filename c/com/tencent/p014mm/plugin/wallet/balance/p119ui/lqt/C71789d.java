package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import t53.C77866b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.d */
public class C71789d extends C77866b {
    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
            return;
        }
        mo109113k(activity, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", -1, new Intent(), true);
    }
}
