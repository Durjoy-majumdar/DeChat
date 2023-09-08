package com.tencent.p014mm.plugin.wallet_core.p125ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoNewUI */
public class WalletIbgOrderInfoNewUI extends WalletOrderInfoNewUI {

    /* renamed from: x1 */
    public Orders f210602x1;

    /* renamed from: K7 */
    public Orders mo99582K7() {
        return this.f210602x1;
    }

    /* renamed from: R7 */
    public void mo99583R7() {
        Log.m105924i("MicroMsg.WalletIbgOrderInfoNewUI", "hy: result is not set manly. set to OK");
        for (String next : this.f210127i) {
            if (!Util.isNullOrNil(next)) {
                Log.m105919d("MicroMsg.WalletIbgOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", next);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C75119h0(next));
            }
        }
        setResult(-1);
        finish();
    }

    /* renamed from: U7 */
    public void mo99584U7() {
    }

    public void onCreate(Bundle bundle) {
        this.f210602x1 = WalletIbgOrderInfoUI.f210603n;
        super.onCreate(bundle);
        JsapiResultEvent jsapiResultEvent = new JsapiResultEvent();
        JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
        aVar.f193695a = 25;
        aVar.f193696b = -1;
        aVar.f193697c = new Intent();
        jsapiResultEvent.publish();
    }
}
