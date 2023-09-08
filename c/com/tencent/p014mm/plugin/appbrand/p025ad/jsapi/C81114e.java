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

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.e */
public class C81114e extends C82926s {
    private static final int CTRL_INDEX = 753;
    public static final String NAME = "onSplashAdClose";

    /* renamed from: i */
    public String f238387i = "launch";

    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.e$a */
    public class C81115a implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ HashMap f238388a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f238389b;

        public C81115a(HashMap hashMap, C88267e eVar) {
            this.f238388a = hashMap;
            this.f238389b = eVar;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C81114e eVar = C81114e.this;
                eVar.mo115165o(this.f238388a);
                eVar.mo115194p(this.f238389b);
                eVar.mo115159i(oVar);
            }
        }
    }

    /* renamed from: s */
    public void mo113280s(C88267e eVar) {
        if (eVar != null && eVar.getRuntime() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Util.nullAs(this.f238387i, "launch"));
            Log.m105925i("MicroMsg.JsApiEventOnSplashAdClosed[AppBrandSplashAd]", "dispatch, source:%s", this.f238387i);
            eVar.getRuntime().f238295w1.mo113817f(new C81115a(hashMap, eVar));
        }
    }
}
