package rr0;

import android.content.Context;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83571d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import s00.C90110f;

/* renamed from: rr0.d */
public final class C90093d {

    /* renamed from: rr0.d$a */
    public enum C90094a {
    }

    /* renamed from: a */
    public static final void m112716a(String str, C90094a aVar, C104289g gVar) {
        C87412m.m108594g(str, "uuid");
        C87412m.m108594g(aVar, "type");
        C87412m.m108594g(gVar, "args");
        if (C90092a.f258749a[aVar.ordinal()] == 1) {
            Log.m105924i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + str + ") started feedback");
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            String optString = gVar.optString("appId");
            if (optString != null) {
                String optString2 = gVar.optString("pageId");
                int optInt = gVar.optInt("appVersion", 0);
                int optInt2 = gVar.optInt("versionType", 0);
                WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
                bVar.f239557a = optString;
                bVar.f239567k = optString2;
                bVar.f239563g = optInt;
                bVar.f239564h = optInt2;
                bVar.f239566j = 16;
                C83571d.m102592a((Context) null, new C48075c(str, bVar.mo113977a()));
            }
        }
    }
}
