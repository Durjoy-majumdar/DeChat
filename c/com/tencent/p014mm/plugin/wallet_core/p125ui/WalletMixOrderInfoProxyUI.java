package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoProxyUI */
public class WalletMixOrderInfoProxyUI extends WalletOrderInfoNewUI {

    /* renamed from: x1 */
    public Orders f210057x1;

    /* renamed from: y1 */
    public String f210058y1 = null;

    /* renamed from: K7 */
    public Orders mo99582K7() {
        return this.f210057x1;
    }

    /* renamed from: R7 */
    public void mo99583R7() {
        Iterator it = ((HashSet) this.f210127i).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!Util.isNullOrNil(str)) {
                Log.m105919d("MicroMsg.WalletMixOrderInfoProxyUI", "hy: doing netscene subscribe...appName: %s", str);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C75119h0(str));
            }
        }
        if (!Util.isNullOrNil(this.f210058y1)) {
            WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
            Intent intent = new Intent();
            intent.putExtra("intent_pay_end", true);
            intent.putExtra("is_jsapi_close_page", this.f210057x1.f209560Y);
            WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
            aVar.f194086a = intent;
            aVar.f194089d = this.f210058y1;
            aVar.f194088c = -1;
            aVar.f194092g = 1;
            walletPayResultEvent.publish();
        }
        setResult(-1);
        finish();
    }

    /* renamed from: U7 */
    public void mo99584U7() {
    }

    public void onCreate(Bundle bundle) {
        this.f210057x1 = (Orders) getIntent().getParcelableExtra("key_orders");
        this.f210058y1 = getIntent().getStringExtra("prepayId");
        super.onCreate(bundle);
    }
}
