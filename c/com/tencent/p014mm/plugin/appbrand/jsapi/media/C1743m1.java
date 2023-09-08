package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C2045o2;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p170ic.C87687a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m1 */
public class C1743m1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1162;
    public static final String NAME = "cropImage";

    /* renamed from: g */
    public final int f11466g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        Context context = i2Var.getContext();
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiCropImage", "cropImage fail,  pageContext is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            i2Var.mo109647a(i2, mo115115p("fail:internal error", jSONObject3));
        } else if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiCropImage", "cropImage fail,  data is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            i2Var.mo109647a(i2, mo115115p("fail:jsapi invalid request data", jSONObject4));
        } else {
            Log.m105925i("MicroMsg.JsApiCropImage", "data:%s", jSONObject2);
            String optString = jSONObject2.optString("src");
            int optInt = jSONObject2.optInt("width", 0);
            int optInt2 = jSONObject2.optInt("height", 0);
            if (TextUtils.isEmpty(optString)) {
                Log.m105920e("MicroMsg.JsApiCropImage", "cropImage fail,  src is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                i2Var.mo109647a(i2, mo115115p("fail:jsapi invalid request data", jSONObject5));
            } else if (optInt <= 0 || optInt2 <= 0) {
                Log.m105920e("MicroMsg.JsApiCropImage", "cropImage fail,  width or height is illegal");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("errno", 101);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                i2Var.mo109647a(i2, mo115115p("fail:jsapi invalid request data", jSONObject6));
            } else {
                C1739l1 l1Var = new C1739l1(this, optString, i2Var, i, optInt2, optInt);
                C87412m.m108594g(optString, "path");
                if (!C112551y.m153819s(optString, HttpWrapperBase.PROTOCAL_HTTP, false) && !C112551y.m153819s(optString, HttpWrapperBase.PROTOCAL_HTTPS, false)) {
                    boolean s = C112551y.m153819s(optString, "wxfile://", false);
                }
                C84795y.m104477c(i2Var, optString, (String) null, new C2045o2(l1Var, C112551y.m153819s(optString, "wxfile://", false)));
            }
        }
    }
}
