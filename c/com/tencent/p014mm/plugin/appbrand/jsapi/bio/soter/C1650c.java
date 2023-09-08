package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c */
public class C1650c extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 277;
    public static final String NAME = "startSoterAuthentication";

    /* renamed from: w */
    public static void m1703w(C1650c cVar, C82381f fVar, int i, Bundle bundle, String str) {
        byte b;
        String str2;
        String str3;
        String str4;
        int i2;
        cVar.getClass();
        String str5 = "";
        if (bundle != null) {
            i2 = bundle.getInt("err_code");
            str4 = bundle.getString("err_msg");
            str3 = bundle.getString("result_json");
            str2 = bundle.getString("result_json_signature");
            b = bundle.getByte("use_mode");
        } else {
            i2 = -1;
            str4 = "not returned";
            str3 = str5;
            str2 = str3;
            b = 0;
        }
        JSONArray b2 = C1648a.m1701b(b);
        if (b2.length() > 0) {
            try {
                str5 = b2.getString(0);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiStartSoterAuthentication", e, "hy: json error in callback", new Object[0]);
            }
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put("authMode", str5);
        hashMap.put("errCode", Integer.valueOf(i2));
        hashMap.put("resultJSON", str3);
        hashMap.put("resultJSONSignature", str2);
        if ("fail".equals(str)) {
            str = str + " " + str4;
        }
        fVar.mo109647a(i, cVar.mo115112m(str, hashMap));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82554k kVar = (C82554k) fVar;
        Log.m105924i("MicroMsg.JsApiStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
        Activity R = kVar.getRuntime().mo113026R();
        int i3 = 0;
        if (R == null) {
            Log.m105921e("MicroMsg.JsApiStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", kVar.getAppId());
            kVar.mo109647a(i2, mo115109j("fail:internal error invalid android context"));
            return;
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("requestAuthModes");
        String optString = jSONObject2.optString("challenge");
        String optString2 = jSONObject2.optString("authContent");
        Intent intent = new Intent();
        intent.setClassName(R, "com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC");
        Object[] objArr = new Object[1];
        objArr[0] = optJSONArray == null ? null : optJSONArray.toString();
        Log.m105925i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", objArr);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            str = "0x00";
        } else {
            int i4 = 0;
            byte b = 0;
            while (i4 < optJSONArray.length()) {
                try {
                    b = (byte) (C1648a.m1700a(optJSONArray.getString(i4)) | b);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandSoterTranslateUtil", e, "hy: json error in translate", new Object[i3]);
                }
                i4++;
                i3 = 0;
            }
            str = "0x" + Integer.toHexString(b);
            Log.m105925i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translated bitsetStr: %s", str);
        }
        intent.putExtra("auth_mode", str);
        intent.putExtra("challenge", optString);
        intent.putExtra("auth_content", optString2);
        intent.putExtra("key_soter_fp_mp_scene", 0);
        C89916g.m112446a(R).mo124232f(new C1649b(this, kVar, i2));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(1000);
        aVar.mo10233c(intent);
        C117292a.m165364j(R, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/bio/soter/JsApiStartSoterAuthentication", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
