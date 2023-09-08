package er1;

import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveStreamStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: er1.u0 */
public final class C58777u0 {

    /* renamed from: a */
    public static final C58777u0 f168283a = new C58777u0();

    /* renamed from: b */
    public static long f168284b = 18;

    /* renamed from: a */
    public final void mo83832a(FinderLiveStreamStruct finderLiveStreamStruct) {
        finderLiveStreamStruct.f155694d = finderLiveStreamStruct.mo86045b("FinderUsrname", C66785b.f191882e.mo90662O5(), true);
        finderLiveStreamStruct.f155696f = C58739j4.f168176a.mo83687P() ? 1 : 0;
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderLiveStreamStruct.f155697g = finderLiveStreamStruct.mo86045b("FinderSessionId", Wb, true);
        long currentTimeMillis = System.currentTimeMillis();
        finderLiveStreamStruct.f155698h = currentTimeMillis;
        finderLiveStreamStruct.mo86046c("ActionTimeMs", currentTimeMillis);
    }

    /* renamed from: b */
    public final void mo83833b(int i) {
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = f168284b;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …son)\n        }.toString()");
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(gVar2, ",", ";", false));
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }

    /* renamed from: c */
    public final void mo83834c(int i, C104289g gVar) {
        C87412m.m108594g(gVar, "extra");
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = f168284b;
        C104289g gVar2 = new C104289g();
        gVar2.mo145953n("type", i);
        String gVar3 = gVar2.toString();
        C87412m.m108593f(gVar3, "JSONObject().apply {\n   …son)\n        }.toString()");
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(gVar3, ",", ";", false));
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "extra.toString()");
        finderLiveStreamStruct.f155703m = finderLiveStreamStruct.mo86045b("Params", C112551y.m153814n(gVar4, ",", ";", false), true);
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }

    /* renamed from: d */
    public final void mo83835d(int i, String str) {
        C87412m.m108594g(str, "params");
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = f168284b;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …son)\n        }.toString()");
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(gVar2, ",", ";", false));
        finderLiveStreamStruct.f155703m = finderLiveStreamStruct.mo86045b("Params", str, true);
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }

    /* renamed from: e */
    public final void mo83836e(String str) {
        C87412m.m108594g(str, "actionJson");
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = f168284b;
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(str, ",", ";", false));
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }

    /* renamed from: f */
    public final void mo83837f(int i, String str, String str2) {
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = 18;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        if (str == null) {
            str = "";
        }
        gVar.put("activityid", str);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   … \"\")\n        }.toString()");
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(gVar2, ",", ";", false));
        finderLiveStreamStruct.f155703m = finderLiveStreamStruct.mo86045b("Params", "{\"gameappid\":\"" + str2 + "\"}", true);
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }

    /* renamed from: g */
    public final void mo83838g(int i, String str) {
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        mo83832a(finderLiveStreamStruct);
        finderLiveStreamStruct.f155699i = 25;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        if (str == null) {
            str = "";
        }
        gVar.put("result", str);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   … \"\")\n        }.toString()");
        finderLiveStreamStruct.mo76264s(C112551y.m153814n(gVar2, ",", ";", false));
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.mo1006q() + ' ');
    }
}
