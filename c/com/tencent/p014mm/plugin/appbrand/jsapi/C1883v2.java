package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p230rt.C13584b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v2 */
public class C1883v2<COMPONENT extends C82381f> extends C82016a0<COMPONENT> {
    public static final int CTRL_INDEX = 527;
    public static final String NAME = "getABTestConfig";

    /* renamed from: t */
    public String mo1731t(COMPONENT component, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.JsApiGetABTestConfig", "JSONObject = " + jSONObject);
        if (jSONObject.optString("experimentType").equals("BatchGetExpt")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("experimentIds");
            if (optJSONArray == null) {
                return mo115109j("fail:experimentIds is empty");
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    hashMap.put(optJSONArray.getString(i), ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5(optJSONArray.getString(i), ""));
                } catch (JSONException unused) {
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("testConfig", hashMap);
            return mo115112m("ok", hashMap2);
        }
        String optString = jSONObject.optString("experimentId");
        boolean equals = "Expt".equals(jSONObject.optString("experimentType"));
        if (TextUtils.isEmpty(optString)) {
            return mo115109j("fail:experimentId is empty");
        }
        if (equals) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("testConfig", C117731d.m166007c().mo182444f(optString, "", true, true));
            return mo115112m("ok", hashMap3);
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("testConfig", ((C13584b) C86312j.m106911c(C13584b.class)).mo12975hH(optString));
        return mo115112m("ok", hashMap4);
    }
}
