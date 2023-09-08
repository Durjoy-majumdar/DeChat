package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84239r;
import com.tencent.p014mm.plugin.appbrand.report.model.C84139c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;
import p547hb.C87465d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s2 */
public final class C82930s2 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "functionalPageStartGame";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        C87412m.m108594g(eVar, "service");
        String str = "index.html";
        String optString = jSONObject != null ? jSONObject.optString("url", str) : null;
        if (optString != null) {
            str = optString;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiFunctionalPageStartGame", "invoke: " + str);
        C83820i0 currentPage = eVar.getRuntime().mo113212m1().getCurrentPage();
        if (currentPage == null || !(currentPage instanceof C87465d)) {
            eVar.mo109647a(i, mo115109j("fail: current page is null or not GamePage"));
            return;
        }
        C87465d dVar = (C87465d) currentPage;
        dVar.setCurrentUrl(str);
        C83780d1 currentPageView = dVar.getCurrentPageView();
        C87412m.m108592e(currentPageView, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
        C84139c cVar = ((C83928t1) currentPageView).f260370X0;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.report.AppBrandPageViewStatisticsWC");
        C84239r rVar = (C84239r) cVar;
        rVar.f246069h = Util.nowMilliSecond() - rVar.f245632a.f245584b.getStartTime();
        rVar.f246071j = str;
        rVar.f246070i = true;
        eVar.mo109647a(i, mo115109j("ok"));
    }
}
