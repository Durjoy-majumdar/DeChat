package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p275xz.C15919f;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b0 */
public class C5879b0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b0$a */
    public class C5880a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22088d;

        public C5880a(C53096b.C53097a aVar) {
            this.f22088d = aVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5879b0.this.hashCode() & 65535)) {
                if (i2 == -1) {
                    this.f22088d.mo73776a();
                } else if (i2 == 5) {
                    HashMap hashMap = new HashMap();
                    int intExtra = intent.getIntExtra("key_jsapi_pay_err_code", 0);
                    String nullAsNil = Util.nullAsNil(intent.getStringExtra("key_jsapi_pay_err_msg"));
                    hashMap.put("err_code", Integer.valueOf(intExtra));
                    hashMap.put("err_desc", nullAsNil);
                    Log.m105921e("MicroMsg.JsApiGetBrandWCPayRequest", "errCode: %d, errMsg: %s", Integer.valueOf(intExtra), nullAsNil);
                    this.f22088d.mo73777b("fail", hashMap);
                } else {
                    this.f22088d.mo73778c("cancel", (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getBrandWCPayRequest";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiGetBrandWCPayRequest", "invokeInOwn");
        MMActivity mMActivity = (MMActivity) ((C43658n) aVar.f148189a).f148196d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", ((C43658n) aVar.f148189a).mo67943v());
            jSONObject.put("pay_scene", 3);
        } catch (JSONException unused) {
        }
        WalletJsapiData walletJsapiData = new WalletJsapiData(aVar.f148190b.f129368c);
        walletJsapiData.f24058A = 1;
        walletJsapiData.f24065H = ((C43658n) aVar.f148189a).f148261n.getString(C74928u.C45093i.f122325q);
        Log.m105925i("MicroMsg.JsApiGetBrandWCPayRequest", "pay channel: %s, scene: %s, adUxInfo: %s", Integer.valueOf(walletJsapiData.f24090v), Integer.valueOf(walletJsapiData.f24088t), walletJsapiData.f24065H);
        if (!((C15919f) C86312j.m106911c(C15919f.class)).Q50(mMActivity, walletJsapiData, hashCode() & 65535, new C5880a(aVar))) {
            aVar.mo73778c("fail", (JSONObject) null);
        }
    }
}
