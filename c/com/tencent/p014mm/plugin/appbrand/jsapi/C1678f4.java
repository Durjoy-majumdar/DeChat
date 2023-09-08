package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C8480h;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f4 */
public final class C1678f4 extends C82268c<C82554k> {
    private static final int CTRL_INDEX = 1209;
    private static final String NAME = "openCTID";

    /* renamed from: g */
    public static final int f11356g = C87687a.m109085a(new C1679a((C8480h) null));

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f4$a */
    public static final class C1679a {
        public C1679a(C8480h hVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Activity R;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82554k kVar = (C82554k) fVar;
        if (kVar != null) {
            AppBrandRuntime runtime = kVar.getRuntime();
            if (runtime == null || (R = runtime.mo113026R()) == null) {
                C82554k kVar2 = kVar;
                int i3 = i2;
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, activity is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar2.mo109647a(i3, mo115115p("fail:internal error", jSONObject3));
            } else if (jSONObject2 == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                kVar.mo109647a(i2, mo115115p("fail:jsapi invalid request data", jSONObject4));
            } else {
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data: " + jSONObject2);
                C1699h4 h4Var = new C1699h4(this, jSONObject2, kVar, i2);
                String optString = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger() ? jSONObject2.optString("miniProgramID") : null;
                if (optString == null) {
                    optString = kVar.getAppId();
                }
                if (optString == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, miniProgramID is null");
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                    }
                    kVar.mo109647a(i2, mo115115p("fail:internal error", jSONObject5));
                    return;
                }
                String str5 = (String) h4Var.invoke("orgID");
                if (str5 != null && (str = (String) h4Var.invoke("businessID")) != null && (str2 = (String) h4Var.invoke("bizSeq")) != null && (str3 = (String) h4Var.invoke("type")) != null && (str4 = (String) h4Var.invoke("miniProgramPlatformID")) != null) {
                    Intent intent = new Intent();
                    C82554k kVar3 = kVar;
                    String str6 = "MicroMsg.AppBrand.JsApiOpenCTID";
                    intent.setComponent(new ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                    intent.setFlags(8388608);
                    intent.putExtra("orgID", str5);
                    intent.putExtra("appID", str);
                    intent.putExtra("bizSeq", str2);
                    intent.putExtra("type", str3);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("miniProgramID", optString);
                    jSONObject6.put("miniProgramPlatformID", str4);
                    C13598b0 b0Var = C13598b0.f38549a;
                    intent.putExtra("extras", jSONObject6.toString());
                    intent.putExtra("packageName", MMApplicationContext.getApplicationId());
                    if (!Util.isIntentAvailable(R, intent, true)) {
                        Log.m105924i(str6, "invoke, intent not available");
                        kVar3.mo109647a(i, mo1692w());
                        return;
                    }
                    int i4 = i;
                    C82554k kVar4 = kVar3;
                    String str7 = str6;
                    Intent intent2 = intent;
                    C89916g.m112446a(R).mo124232f(new C1695g4(kVar4, i4, this));
                    try {
                        int i5 = f11356g;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i5));
                        aVar.mo10233c(intent2);
                        C117292a.m165364j(R, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCTID", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } catch (Exception e4) {
                        Log.printErrStackTrace(str7, e4, "invoke, startActivityForResult fail", new Object[0]);
                        kVar4.mo109647a(i4, mo1692w());
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final String mo1692w() {
        Map f = C90364q0.m113147f(new C13604l("resultCode", "C0412002"), new C13604l("resultDesc", "APP尚未安装"));
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        if (!(f instanceof HashMap)) {
            f = new HashMap(f);
        }
        f.put("errno", 0);
        return mo115114o("ok", f);
    }
}
