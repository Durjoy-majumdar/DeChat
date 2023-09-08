package lm0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter;
import com.tencent.p014mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C66261f3;
import rx3.C13598b0;

/* renamed from: lm0.a */
public final class C88581a extends C87413o implements C32226l<Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JsApiGetRecentUsageList$Companion$Parameter f255835d;

    /* renamed from: e */
    public final /* synthetic */ C1256g<JsApiGetRecentUsageList$Companion$Result> f255836e;

    /* renamed from: f */
    public final /* synthetic */ C88584d f255837f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88581a(JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter, C1256g<JsApiGetRecentUsageList$Companion$Result> gVar, C88584d dVar) {
        super(1);
        this.f255835d = jsApiGetRecentUsageList$Companion$Parameter;
        this.f255836e = gVar;
        this.f255837f = dVar;
    }

    public Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        C81161g2.requireAccountInitializedOnDemand();
        ArrayList<AppBrandRecentTaskInfo> a = C81161g2.f238473i.f80166f.mo56648a(longValue, this.f255835d.f242412d);
        JSONArray jSONArray = new JSONArray();
        JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = this.f255835d;
        C1256g<JsApiGetRecentUsageList$Companion$Result> gVar = this.f255836e;
        C88584d dVar = this.f255837f;
        Log.m105924i("MicroMsg.JsApiGetRecentUsageList", "lastUpdateTime=" + longValue + "  requestId=" + jsApiGetRecentUsageList$Companion$Parameter.f242414f + " count=" + jsApiGetRecentUsageList$Companion$Parameter.f242412d);
        for (AppBrandRecentTaskInfo appBrandRecentTaskInfo : a) {
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                Log.m105924i("MicroMsg.JsApiGetRecentUsageList", "appName=" + appBrandRecentTaskInfo.f239032u + "  userName=" + appBrandRecentTaskInfo.f239040d + " lastUpdateTime=" + appBrandRecentTaskInfo.f239037z);
            }
            C87412m.m108593f(appBrandRecentTaskInfo, "each");
            dVar.getClass();
            Class cls = C32735h.class;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userName", appBrandRecentTaskInfo.f239040d);
            jSONObject.put("appName", appBrandRecentTaskInfo.f239032u);
            jSONObject.put("appId", appBrandRecentTaskInfo.f239041e);
            jSONObject.put("shortNickname", appBrandRecentTaskInfo.f239045i);
            jSONObject.put("appIcon", appBrandRecentTaskInfo.f239033v);
            jSONObject.put("appServiceType", appBrandRecentTaskInfo.f239034w);
            jSONObject.put("appVersion", appBrandRecentTaskInfo.f239043g);
            jSONObject.put("runningFlag", appBrandRecentTaskInfo.f239048o);
            jSONObject.put("cannotAddStarWxaUtil", appBrandRecentTaskInfo.f239049p);
            jSONObject.put("starApp", appBrandRecentTaskInfo.f239036y);
            jSONObject.put("debugType", appBrandRecentTaskInfo.f239035x);
            jSONObject.put(C66261f3.COL_UPDATETIME, appBrandRecentTaskInfo.f239037z);
            jSONObject.put("runInThirdPartyAppRecently", appBrandRecentTaskInfo.f239050q);
            jSONObject.put("thirdPartyAppUsingDesc", appBrandRecentTaskInfo.f239051r);
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) == 1) {
                jSONObject.put("showRelievedBuyFlag", appBrandRecentTaskInfo.f239027A);
            }
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_show_official_flag, 0) == 1) {
                jSONObject.put("showOfficialFlag", appBrandRecentTaskInfo.f239029C);
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "it.toString()");
        gVar.mo894a(new JsApiGetRecentUsageList$Companion$Result(jSONArray2, 0, ""));
        return C13598b0.f38549a;
    }
}
