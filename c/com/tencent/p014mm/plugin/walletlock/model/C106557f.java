package com.tencent.p014mm.plugin.walletlock.model;

import android.app.Activity;
import b73.C67213b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import g73.C107759d;

/* renamed from: com.tencent.mm.plugin.walletlock.model.f */
public class C106557f implements C67213b.C67214b {

    /* renamed from: a */
    public static C106557f f318377a;

    /* renamed from: a */
    public boolean mo153252a(Activity activity) {
        String a = C107759d.m145971a();
        Log.m105918d("MicroMsg.WalletGuardFilter", "coveredPage: " + a);
        if (a == null || a.equals(activity.getClass().getName()) || !a.contains(MMApplicationContext.getSourcePackageName())) {
            return true;
        }
        return !a.contains("plugin.mall") && !a.contains("plugin.card") && !a.contains("plugin.wallet") && !a.contains("plugin.wallet_index") && !a.contains("plugin.webview") && !a.contains("plugin.offline") && !a.contains("plugin.recharge");
    }
}
