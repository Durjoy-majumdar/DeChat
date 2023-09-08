package fr1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import pj3.C47511g;

/* renamed from: fr1.a */
public final class C8184a implements C8195i {

    /* renamed from: a */
    public final String f27081a;

    /* renamed from: b */
    public final C47511g f27082b;

    /* renamed from: c */
    public final Context f27083c;

    public C8184a(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27081a = str;
        this.f27082b = gVar;
        this.f27083c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = "gh_4ee148a6ecaa@app";
        aVar.f9533h = "wxdfda2588e999a42d";
        aVar.f9527b = "pages/index/index.html";
        aVar.f9529d = 1201;
        aVar.f9531f = this.f27083c;
        startAppBrandUIFromOuterEvent.publish();
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f27083c, 3, 1, false, 0, 0, (String) null, 120, (Object) null);
    }

    /* renamed from: b */
    public void mo9234b(boolean z) {
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27081a;
    }

    public void onCreate() {
    }

    public void onResume() {
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this.f27083c, 3, 2, false, 0, 0, (String) null, 120, (Object) null);
    }

    public void onStop() {
    }
}
