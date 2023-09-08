package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.g$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q4 */
public class C1843q4 implements g$$e {

    /* renamed from: a */
    public final /* synthetic */ boolean f11651a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f11652b;

    /* renamed from: c */
    public final /* synthetic */ int f11653c;

    /* renamed from: d */
    public final /* synthetic */ C1849r4 f11654d;

    public C1843q4(C1849r4 r4Var, boolean z, C81925i2 i2Var, int i) {
        this.f11654d = r4Var;
        this.f11651a = z;
        this.f11652b = i2Var;
        this.f11653c = i;
    }

    /* renamed from: a */
    public void mo1626a(int i, Intent intent) {
        String str;
        String str2;
        JSONArray jSONArray;
        if (intent != null) {
            str2 = intent.getStringExtra("key_app_authorize_state");
            str = intent.getStringExtra("key_app_subscriptions_setting");
        } else {
            str = "";
            str2 = str;
        }
        try {
            jSONArray = new JSONArray(str2);
        } catch (JSONException unused) {
            jSONArray = new JSONArray();
        }
        JSONObject jSONObject = null;
        if (this.f11651a) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errMsg", this.f11654d.mo114779e() + ":ok");
            jSONObject2.put("authSetting", jSONArray);
            if (this.f11651a) {
                jSONObject2.put("subscriptionsSetting", jSONObject);
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiOpenSetting", "set json error!");
            Log.printErrStackTrace("MicroMsg.JsApiOpenSetting", e, "", new Object[0]);
        }
        this.f11652b.mo109647a(this.f11653c, jSONObject2.toString());
    }
}
