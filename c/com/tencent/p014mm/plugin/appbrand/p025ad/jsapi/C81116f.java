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

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.f */
public class C81116f extends C82926s {
    private static final int CTRL_INDEX = 752;
    public static final String NAME = "onSplashAdHide";

    /* renamed from: i */
    public String f238391i = "launch";

    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.f$a */
    public class C81117a implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ HashMap f238392a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f238393b;

        public C81117a(HashMap hashMap, C88267e eVar) {
            this.f238392a = hashMap;
            this.f238393b = eVar;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C81116f fVar = C81116f.this;
                fVar.mo115165o(this.f238392a);
                fVar.mo115194p(this.f238393b);
                fVar.mo115159i(oVar);
            }
        }
    }

    /* renamed from: s */
    public void mo113281s(C88267e eVar) {
        if (eVar != null && eVar.getRuntime() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Util.nullAs(this.f238391i, "launch"));
            Log.m105925i("MicroMsg.JsApiEventOnSplashAdHide[AppBrandSplashAd]", "dispatch, source:%s", this.f238391i);
            eVar.getRuntime().f238295w1.mo113817f(new C81117a(hashMap, eVar));
        }
    }
}
