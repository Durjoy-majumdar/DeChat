package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.r0 */
public final class C1823r0 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11624a;

    /* renamed from: b */
    public final /* synthetic */ int f11625b;

    /* renamed from: c */
    public final /* synthetic */ C1825s0 f11626c;

    public C1823r0(C82554k kVar, int i, C1825s0 s0Var) {
        this.f11624a = kVar;
        this.f11625b = i;
        this.f11626c = s0Var;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        if (i == 34) {
            if (i2 == -1) {
                Log.m105924i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result ok");
                C82554k kVar = this.f11624a;
                int i3 = this.f11625b;
                C1825s0 s0Var = this.f11626c;
                s0Var.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar.mo109647a(i3, s0Var.mo115115p("ok", jSONObject));
            } else if (i2 != 1) {
                Log.m105924i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result cancel");
                C82554k kVar2 = this.f11624a;
                int i4 = this.f11625b;
                C1825s0 s0Var2 = this.f11626c;
                s0Var2.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                kVar2.mo109647a(i4, s0Var2.mo115115p("cancel", jSONObject2));
            } else {
                Log.m105924i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result fail");
                C82554k kVar3 = this.f11624a;
                int i5 = this.f11625b;
                C1825s0 s0Var3 = this.f11626c;
                s0Var3.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                kVar3.mo109647a(i5, s0Var3.mo115115p("fail:internal error", jSONObject3));
            }
            return true;
        }
        Log.m105924i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result code not equal");
        return false;
    }
}
