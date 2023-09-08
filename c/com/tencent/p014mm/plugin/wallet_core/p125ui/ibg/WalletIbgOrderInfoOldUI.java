package com.tencent.p014mm.plugin.wallet_core.p125ui.ibg;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoOldUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoOldUI */
public class WalletIbgOrderInfoOldUI extends WalletOrderInfoOldUI {
    /* renamed from: K7 */
    public Orders mo99582K7() {
        return this.f210192n;
    }

    /* renamed from: P7 */
    public void mo99609P7() {
        Log.m105924i("MicroMsg.WalletIbgOrderInfoOldUI", "hy: result is not set manly. set to OK");
        for (String next : this.f210195q) {
            if (!Util.isNullOrNil(next)) {
                Log.m105919d("MicroMsg.WalletIbgOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", next);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C75119h0(next));
            }
        }
        setResult(-1);
        finish();
    }

    public void onCreate(Bundle bundle) {
        this.f210192n = WalletIbgOrderInfoUI.f210603n;
        super.onCreate(bundle);
    }
}
