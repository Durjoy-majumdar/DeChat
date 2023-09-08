package com.tencent.p014mm.plugin.wallet_core.p125ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import nj3.C88989a;
import ob0.C117747y;
import w53.C78520c;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI */
public class WalletIbgOrderInfoUI extends WalletBaseUI {

    /* renamed from: n */
    public static Orders f210603n;

    /* renamed from: d */
    public String f210604d = null;

    /* renamed from: e */
    public String f210605e = null;

    /* renamed from: f */
    public String f210606f = null;

    /* renamed from: g */
    public String f210607g = null;

    /* renamed from: h */
    public String f210608h = null;

    /* renamed from: i */
    public String f210609i = null;

    /* renamed from: j */
    public String f210610j = null;

    public int getLayoutId() {
        return C0966R.C0971layout.cat;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 1) {
                JsapiResultEvent jsapiResultEvent = new JsapiResultEvent();
                JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
                aVar.f193695a = 25;
                aVar.f193696b = -1;
                aVar.f193697c = new Intent();
                jsapiResultEvent.publish();
            }
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1565);
        this.f210604d = getIntent().getStringExtra("appId");
        this.f210605e = getIntent().getStringExtra("nonceStr");
        this.f210606f = getIntent().getStringExtra("timeStamp");
        this.f210607g = getIntent().getStringExtra("packageExt");
        this.f210608h = getIntent().getStringExtra("paySignature");
        this.f210609i = getIntent().getStringExtra("signtype");
        this.f210610j = getIntent().getStringExtra("url");
        Bundle bundle2 = new Bundle();
        bundle2.putString("appid", this.f210604d);
        bundle2.putString(AppMeasurement.Param.TIMESTAMP, this.f210606f);
        bundle2.putString("nonce_str", this.f210605e);
        bundle2.putString("package", this.f210607g);
        bundle2.putString("sign_type", this.f210609i);
        bundle2.putString("pay_sign", this.f210608h);
        bundle2.putString("webview_url", this.f210610j);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startPayIBGJsGetSuccPageUseCase(this, bundle2)) {
            doSceneForceProgress(new C78520c(this.f210604d, this.f210605e, this.f210606f, this.f210607g, this.f210608h, this.f210609i, this.f210610j));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1565);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletIbgOrderInfoUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (yVar instanceof C78520c) {
            removeSceneEndListener(1565);
            if (i == 0 && i2 == 0) {
                C78520c cVar = (C78520c) yVar;
                Orders orders = cVar.f230005f;
                f210603n = orders;
                int i3 = cVar.f230006g;
                Log.m105925i("MicroMsg.WalletIbgOrderInfoUI", "gotoIbgOrderInfoUI, useNewPage: %s, orders: %s", Integer.valueOf(i3), orders);
                if (i3 == 1) {
                    Intent intent = new Intent(this, WalletIbgOrderInfoNewUI.class);
                    intent.putExtra("key_orders", orders);
                    startActivityForResult(intent, 1);
                } else {
                    Intent intent2 = new Intent(this, WalletIbgOrderInfoOldUI.class);
                    intent2.putExtra("key_orders", orders);
                    startActivityForResult(intent2, 2);
                }
                return true;
            }
            setResult(0);
            finish();
        }
        setResult(0);
        finish();
        return false;
    }
}
