package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.mmdata.rpt.finder_page_exposeStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import h81.C59774i;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.sns.statistics.d */
public final class C57353d {

    /* renamed from: a */
    public static final C57353d f164332a = new C57353d();

    /* renamed from: b */
    public static /* synthetic */ void m66092b(C57353d dVar, int i, int i2, long j, int i3, String str, int i4, Object obj) {
        SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        dVar.mo80963a(i, i2, (i4 & 4) != 0 ? 0 : j, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? "" : str);
        SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }

    /* renamed from: a */
    public final void mo80963a(int i, int i2, long j, int i3, String str) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        C87412m.m108594g(str, "finderContextId");
        finder_page_exposeStruct finder_page_exposestruct = new finder_page_exposeStruct();
        finder_page_exposestruct.f156965d = finder_page_exposestruct.mo86045b("sessionid", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb(), true);
        finder_page_exposestruct.f156967f = finder_page_exposestruct.mo86045b("commentscene", String.valueOf(i), true);
        finder_page_exposestruct.f156968g = i2;
        finder_page_exposestruct.f156969h = finder_page_exposestruct.mo86045b("event_time", String.valueOf(System.currentTimeMillis()), true);
        finder_page_exposestruct.f156970i = finder_page_exposestruct.mo86045b("finderusername", C75592q0.m90778h(), true);
        finder_page_exposestruct.f156974m = j;
        finder_page_exposestruct.f156966e = finder_page_exposestruct.mo86045b("findercontextid", str, true);
        if (i3 != -1 && i2 == 1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nextstep", i3);
            finder_page_exposestruct.f156971j = finder_page_exposestruct.mo86045b("udf_kv", jSONObject.toString(), true);
        }
        finder_page_exposestruct.mo86054n();
        Log.m105924i("MicroMsg.FinderReportSns21874", "FinderReportSns21874 report scene:" + i + " eventCode:" + i2);
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }
}
