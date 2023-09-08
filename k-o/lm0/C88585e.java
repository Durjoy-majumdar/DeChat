package lm0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: lm0.e */
public final class C88585e extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 853;
    public static final String NAME = "getRecentUsageList";

    /* renamed from: lm0.e$a */
    public static final class C88586a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C82381f f255844d;

        /* renamed from: e */
        public final /* synthetic */ int f255845e;

        public C88586a(C82381f fVar, int i) {
            this.f255844d = fVar;
            this.f255845e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            String str;
            JsApiGetRecentUsageList$Companion$Result jsApiGetRecentUsageList$Companion$Result = (JsApiGetRecentUsageList$Companion$Result) obj;
            C82381f fVar = this.f255844d;
            int i = this.f255845e;
            C87412m.m108593f(jsApiGetRecentUsageList$Companion$Result, "ret");
            C87412m.m108594g(fVar, "component");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", i);
            jSONObject.put("recentUsageInfo", new JSONArray(jsApiGetRecentUsageList$Companion$Result.f242415d));
            jSONObject.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, jsApiGetRecentUsageList$Companion$Result.f242416e);
            String jSONObject2 = jSONObject.put(OpenSDKTool4Assistant.EXTRA_ERROR_MSG, jsApiGetRecentUsageList$Companion$Result.f242417f).toString();
            C87412m.m108593f(jSONObject2, "with(JSONObject()) {\n   …\n            }.toString()");
            StringBuilder sb = new StringBuilder();
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                str = "data=" + jSONObject2 + 10;
            } else {
                str = "******";
            }
            sb.append(str);
            sb.append("errorCode=");
            sb.append(jsApiGetRecentUsageList$Companion$Result.f242416e);
            sb.append("\nerrorMsg=");
            sb.append(jsApiGetRecentUsageList$Companion$Result.f242417f);
            Log.m105924i("MicroMsg.JsApiOnGetRecentUsageListResultEvent", sb.toString());
            C88587f fVar2 = new C88587f((C8480h) null);
            fVar2.mo115194p(fVar);
            fVar2.f242407f = jSONObject2;
            fVar2.mo115158h();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null && jSONObject != null) {
            Log.m105924i("MicroMsg.JsApiGetRecentUsageList", "data=" + jSONObject);
            int optInt = jSONObject.optInt("count", Integer.MAX_VALUE);
            if (optInt < 0) {
                fVar.mo109647a(i, mo115109j("fail:illegal count"));
                return;
            }
            int optInt2 = jSONObject.optInt("requestId", Integer.MAX_VALUE);
            if (optInt2 == Integer.MAX_VALUE) {
                fVar.mo109647a(i, mo115109j("fail:illegal requestId"));
                return;
            }
            long optLong = jSONObject.optLong("lastUpdateTime", MAlarmHandler.NEXT_FIRE_INTERVAL);
            if (optLong < 0) {
                fVar.mo109647a(i, mo115109j("fail:illegal lastUpdateTime"));
                return;
            }
            fVar.mo109647a(i, mo115109j("ok"));
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new JsApiGetRecentUsageList$Companion$Parameter(optInt, optLong, optInt2), C88584d.class, new C88586a(fVar, optInt2));
        }
    }
}
