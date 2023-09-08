package com.tencent.p014mm.plugin.appbrand.jsapi.bio.face;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C1761b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p224ra.C89909e;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.b */
public abstract class C1639b extends C82268c<C82554k> {
    /* renamed from: w */
    public static void m1675w(C1639b bVar, C82381f fVar, int i, Bundle bundle, String str) {
        String str2;
        String str3;
        int i2;
        bVar.getClass();
        if (bundle != null) {
            i2 = bundle.getInt("err_code");
            str3 = bundle.getString("err_msg");
            str2 = bundle.getString("verify_result");
        } else {
            i2 = -1;
            str3 = "not returned";
            str2 = "";
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("errCode", Integer.valueOf(i2));
        hashMap.put("verifyResult", str2);
        if ("fail".equals(str)) {
            str = str + " " + str3;
        }
        fVar.mo109647a(i, bVar.mo115112m(str, hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        boolean z = false;
        if (R == null) {
            Log.m105921e("MicroMsg.JsApiFaceAsyncBase", "JsApiFaceAsyncBase context is null, appId is %s", kVar.getAppId());
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        int i2 = i;
        String optString = jSONObject2.optString("requestVerifyPreInfo");
        int optInt = jSONObject2.optInt("checkAliveType");
        String appId = kVar.getAppId();
        int i3 = mo1672z() ? 1001 : 1000;
        Bundle bundle = new Bundle();
        bundle.putBoolean("k_need_signature", true);
        bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 5);
        bundle.putBoolean("needVideo", mo1672z());
        bundle.putBoolean("is_check_dyncfg", false);
        bundle.putString("appId", appId);
        bundle.putString("request_verify_pre_info", optString);
        bundle.putInt("key_business_type", 4);
        bundle.putString("key_function_name", mo1670x());
        bundle.putInt("check_alive_type", optInt);
        bundle.putBoolean("key_is_need_confirm_page", mo1671y());
        Intent intent = new Intent();
        intent.setClassName(R, "com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI");
        intent.putExtra("KEY_EXTRAS", bundle);
        intent.putExtra("KEY_REQUEST_CODE", i3);
        C1761b bVar = (C1761b) C89909e.m112436a(C1761b.class);
        if (bVar != null) {
            z = bVar.mo1749X0(kVar);
        }
        if (z) {
            bVar.mo1750dE();
        }
        C89916g.m112446a(R).mo124232f(new C1638a(this, z, bVar, kVar, i));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        aVar.mo10233c(intent);
        C117292a.m165364j(R, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiFaceAsyncBase", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: x */
    public abstract String mo1670x();

    /* renamed from: y */
    public boolean mo1671y() {
        return !(this instanceof C1640c);
    }

    /* renamed from: z */
    public abstract boolean mo1672z();
}
