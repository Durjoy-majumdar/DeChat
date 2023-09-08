package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C83195k3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import kr0.C88267e;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.d */
public class C81112d extends C82926s {
    private static final int CTRL_INDEX = 760;
    public static final String NAME = "onSplashAdButtonClicked";

    /* renamed from: i */
    public String f238382i = "launch";

    /* renamed from: j */
    public String f238383j = "close";

    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.d$a */
    public class C81113a implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ HashMap f238384a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f238385b;

        public C81113a(HashMap hashMap, C88267e eVar) {
            this.f238384a = hashMap;
            this.f238385b = eVar;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C81112d dVar = C81112d.this;
                dVar.mo115165o(this.f238384a);
                dVar.mo115194p(this.f238385b);
                dVar.mo115159i(oVar);
            }
        }
    }

    /* renamed from: s */
    public void mo113279s(C88267e eVar) {
        if (eVar != null && eVar.getRuntime() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Util.nullAs(this.f238382i, "launch"));
            hashMap.put("buttonType", Util.nullAs(this.f238383j, "close"));
            Log.m105925i("MicroMsg.JsApiEventOnSplashAdButtonClicked[AppBrandSplashAd]", "dispatch, source:%s, buttonType:%s", this.f238382i, this.f238383j);
            eVar.getRuntime().f238295w1.mo113817f(new C81113a(hashMap, eVar));
        }
    }
}
