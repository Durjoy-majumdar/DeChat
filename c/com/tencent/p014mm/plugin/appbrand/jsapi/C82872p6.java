package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import org.json.JSONArray;
import org.json.JSONObject;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p6 */
public class C82872p6 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 283;
    public static final String NAME = "traceEvent";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("events");
        if (!AppBrandPerformanceManager.m103497f((C86812g) gVar.getRuntime()) || optJSONArray == null) {
            gVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("category");
                String optString2 = optJSONObject.optString("name");
                long optLong = optJSONObject.optLong(IXWebBroadcastListener.STAGE_START);
                long optLong2 = optJSONObject.optLong("end");
                String optString3 = optJSONObject.optString("phase");
                String optString4 = optJSONObject.optString("args");
                if (!Util.isNullOrNil(optString2)) {
                    C83997d.m103520c(gVar.getAppId(), optString, optString2, optString3, optLong, optLong2, optString4);
                }
            }
        }
        gVar.mo109647a(i, mo115109j("ok"));
    }
}
