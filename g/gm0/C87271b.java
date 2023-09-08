package gm0;

import com.tencent.p014mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gm0.b */
public final class C87271b extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "noticePerformanceMetrics";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            if (!C84186b0.m103776e()) {
                gVar.mo109647a(i, mo115109j("ok"));
                return;
            }
            JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("events") : null;
            if (optJSONArray == null) {
                gVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            try {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct = new WALifeCycleTimeAxisItemStruct();
                    String appId = gVar.getAppId();
                    C87412m.m108591d(appId);
                    QualitySessionRuntime c = C84185b.m103770c(appId, true);
                    C87412m.m108591d(c);
                    wALifeCycleTimeAxisItemStruct.f236461d = wALifeCycleTimeAxisItemStruct.mo86045b("InstanceId", c.f245832d, true);
                    String appId2 = gVar.getAppId();
                    C87412m.m108591d(appId2);
                    wALifeCycleTimeAxisItemStruct.f236462e = wALifeCycleTimeAxisItemStruct.mo86045b("Appid", appId2, true);
                    wALifeCycleTimeAxisItemStruct.f236463f = optJSONObject.optLong("timeStamp");
                    wALifeCycleTimeAxisItemStruct.f236464g = wALifeCycleTimeAxisItemStruct.mo86045b("EventName", optJSONObject.optString("eventName"), true);
                    wALifeCycleTimeAxisItemStruct.f236465h = optJSONObject.optLong("eventType");
                    wALifeCycleTimeAxisItemStruct.f236466i = wALifeCycleTimeAxisItemStruct.mo86045b("Parent", optJSONObject.optString("parent"), true);
                    wALifeCycleTimeAxisItemStruct.f236467j = optJSONObject.optLong("category");
                    wALifeCycleTimeAxisItemStruct.f236468k = optJSONObject.optLong("option");
                    C84186b0.m103778h(wALifeCycleTimeAxisItemStruct);
                }
                gVar.mo109647a(i, mo115109j("ok"));
            } catch (Exception e) {
                gVar.mo109647a(i, mo115109j("fail " + e));
            }
        }
    }
}
