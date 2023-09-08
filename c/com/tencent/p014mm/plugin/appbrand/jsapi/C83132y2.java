package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.eclipsesource.mmv8.snapshot.C80141Utils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import wi0.C90980f0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y2 */
public final class C83132y2 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 927;
    public static final String NAME = "getAppContact";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        WxaAttributes.C81629c.C81630a aVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject2 != null) {
            String optString = jSONObject2.optString("username");
            String optString2 = jSONObject2.optString("appid");
            boolean z = true;
            Object obj = null;
            if (!C80141Utils.isNullOrEmpty(optString) || !C80141Utils.isNullOrEmpty(optString2)) {
                WxaAttributes d = !C80141Utils.isNullOrEmpty(optString) ? C90980f0.f261056b.mo125059d(optString, new String[0]) : C90980f0.f261056b.mo125058c(optString2, new String[0]);
                HashMap hashMap = new HashMap();
                if (d != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("nickName", d.field_nickname);
                    hashMap2.put("iconUrl", d.field_brandIconURL);
                    hashMap2.put("appId", d.field_appId);
                    hashMap2.put("username", d.field_username);
                    WxaAttributes.WxaVersionInfo o2 = d.mo113942o2();
                    hashMap2.put("weappVersion", o2 != null ? Integer.valueOf(o2.f239452d) : null);
                    hashMap2.put("signature", d.field_signature);
                    hashMap2.put("debugMode", Integer.valueOf(i2Var.getRuntime().mo113036W().f239365g));
                    WxaAttributes.C81628a m2 = d.mo113940m2();
                    WxaAttributes.C81629c n2 = d.mo113941n2();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("originalRedirectUrl", m2 != null ? m2.f239499o : null);
                    hashMap3.put("appServiceType", m2 != null ? Integer.valueOf(m2.f239488d) : null);
                    hashMap3.put("originalFlag", m2 != null ? Integer.valueOf(m2.f239498n) : null);
                    hashMap3.put("brandOfficialFlag", (n2 == null || (aVar = n2.f239507a) == null) ? null : Integer.valueOf(aVar.f239537y));
                    hashMap3.put("relievedBuyFlag", m2 != null ? Integer.valueOf(m2.f239500p) : null);
                    if (m2 != null) {
                        obj = Integer.valueOf(m2.f239501q);
                    }
                    hashMap3.put("flagshipFlag", obj);
                    hashMap2.put("appBrandInfo", hashMap3);
                    Log.m105925i("JsApiGetAppContact", "get contact from profile, nickName=%s, iconUrl=%s, appId=%s, username=%s, weappVersion=%s, signature=%s, debugMode=%d", d.field_nickname, d.field_brandIconURL, d.field_appId, d.field_username, d.field_versionInfo, d.field_signature, Integer.valueOf(i2Var.getRuntime().mo113036W().f239365g));
                    obj = hashMap2;
                }
                hashMap.put(LiteAppCenter.FRAMEWORK_TYPE_BASE, obj);
                C13598b0 b0Var = C13598b0.f38549a;
                i2Var.mo109647a(i2, mo115112m("ok", hashMap));
                return;
            }
            String optString3 = jSONObject2.optString("keyPath");
            Log.m105924i("JsApiGetAppContact", "keyPath=" + optString3);
            WxaAttributes c = C90980f0.f261056b.mo125058c(i2Var.getAppId(), new String[0]);
            if (c != null) {
                C87412m.m108593f(optString3, "keyPath");
                List U = C112550d0.m153785U(optString3, new String[]{"."}, false, 0, 6, (Object) null);
                try {
                    JSONObject jSONObject3 = new JSONObject(c.mo113944q2());
                    Iterator it = U.iterator();
                    Object obj2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            obj = obj2;
                            break;
                        }
                        String str = (String) it.next();
                        if (jSONObject3 == null) {
                            break;
                        }
                        if (jSONObject3.has(str)) {
                            obj2 = jSONObject3.opt(str);
                            if (obj2 == null) {
                                obj2 = "";
                            }
                        } else {
                            obj2 = null;
                        }
                        jSONObject3 = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("next=");
                    if (obj != null) {
                        z = false;
                    }
                    sb.append(z ? "is null" : String.valueOf(obj));
                    Log.m105924i("JsApiGetAppContact", sb.toString());
                    if (obj == null) {
                        i2Var.mo109647a(i2, mo115109j("fail: keyPath not found"));
                        return;
                    }
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("data", obj);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    i2Var.mo109647a(i2, mo115112m("ok", hashMap4));
                } catch (JSONException e) {
                    Log.m105920e("JsApiGetAppContact", e.getMessage());
                    i2Var.mo109647a(i2, mo115109j("fail:internal error"));
                }
            }
        }
    }
}
