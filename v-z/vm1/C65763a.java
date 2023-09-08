package vm1;

import com.tencent.p014mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import o40.C61926c;
import o40.C61937h;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: vm1.a */
public final class C65763a {

    /* renamed from: a */
    public static final C65763a f189172a = new C65763a();

    /* renamed from: a */
    public final void mo89802a(String str, int i, String str2, String str3) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "feedId");
        C87412m.m108594g(str3, "liveId");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5("FinderLiveEntrance");
        EnterFinderLiveFromRedDotReportStruct enterFinderLiveFromRedDotReportStruct = new EnterFinderLiveFromRedDotReportStruct();
        enterFinderLiveFromRedDotReportStruct.f155000d = 1;
        enterFinderLiveFromRedDotReportStruct.f155006j = enterFinderLiveFromRedDotReportStruct.mo86045b("ContextId", str, true);
        enterFinderLiveFromRedDotReportStruct.f155001e = (long) i;
        enterFinderLiveFromRedDotReportStruct.f155002f = enterFinderLiveFromRedDotReportStruct.mo86045b("FeedID", str2, true);
        enterFinderLiveFromRedDotReportStruct.f155003g = enterFinderLiveFromRedDotReportStruct.mo86045b("LiveID", str3, true);
        enterFinderLiveFromRedDotReportStruct.f155004h = enterFinderLiveFromRedDotReportStruct.mo86045b("RedDotTipsID", G5 != null ? G5.field_tipsId : null, true);
        if (G5 != null) {
            JSONObject h = C61937h.m72709h(G5.mo77309p2());
            h.put("object_id", C61926c.m72691p(G5.mo77309p2().object_id));
            String jSONObject = h.toString();
            C87412m.m108593f(jSONObject, "extInfo.toString()");
            enterFinderLiveFromRedDotReportStruct.f155007k = enterFinderLiveFromRedDotReportStruct.mo86045b("ReportExtInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
        }
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        enterFinderLiveFromRedDotReportStruct.f155005i = enterFinderLiveFromRedDotReportStruct.mo86045b("SessionID", Wb, true);
        Log.m105924i("EnterFinderLiveFromRedDotReport", "report " + enterFinderLiveFromRedDotReportStruct.mo1006q());
        enterFinderLiveFromRedDotReportStruct.mo86054n();
    }
}
