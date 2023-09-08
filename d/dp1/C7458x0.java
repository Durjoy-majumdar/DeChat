package dp1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderUserFlowActionStruct;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: dp1.x0 */
public final class C7458x0 {

    /* renamed from: a */
    public static final C7458x0 f25666a = new C7458x0();

    /* renamed from: b */
    public static String f25667b = "1";

    /* renamed from: a */
    public final void mo8608a(String str, String str2, JSONObject jSONObject) {
        C87412m.m108594g(str, "eventId");
        C87412m.m108594g(str2, "finderUin");
        FinderUserFlowActionStruct finderUserFlowActionStruct = new FinderUserFlowActionStruct();
        if (C87412m.m108589b(str, "1")) {
            f25667b = "1-" + C31543z5.m39453c();
        }
        finderUserFlowActionStruct.f9914d = finderUserFlowActionStruct.mo86045b("biz_id", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, true);
        finderUserFlowActionStruct.f9915e = finderUserFlowActionStruct.mo86045b("flow_id", f25667b, true);
        finderUserFlowActionStruct.f9916f = finderUserFlowActionStruct.mo86045b("event_id", str, true);
        finderUserFlowActionStruct.f9917g = finderUserFlowActionStruct.mo86045b("event_time", String.valueOf(C31543z5.m39453c()), true);
        finderUserFlowActionStruct.f9918h = finderUserFlowActionStruct.mo86045b("finderuin", str2, true);
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "udf_kv.toString()");
            finderUserFlowActionStruct.f9919i = finderUserFlowActionStruct.mo86045b("udf_kv", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        }
        finderUserFlowActionStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderUserFlowActionStruct);
    }
}
