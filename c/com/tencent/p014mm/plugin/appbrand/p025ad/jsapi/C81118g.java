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

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.g */
public class C81118g extends C82926s {
    private static final int CTRL_INDEX = 751;
    public static final String NAME = "onSplashAdShow";

    /* renamed from: i */
    public String f238395i = "launch";

    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.g$a */
    public class C81119a implements C83195k3 {

        /* renamed from: a */
        public final /* synthetic */ HashMap f238396a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f238397b;

        public C81119a(HashMap hashMap, C88267e eVar) {
            this.f238396a = hashMap;
            this.f238397b = eVar;
        }

        /* renamed from: a */
        public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
            if (oVar != null) {
                C81118g gVar = C81118g.this;
                gVar.mo115165o(this.f238396a);
                gVar.mo115194p(this.f238397b);
                gVar.mo115159i(oVar);
            }
        }
    }

    /* renamed from: s */
    public void mo113282s(C88267e eVar) {
        if (eVar != null && eVar.getRuntime() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Util.nullAs(this.f238395i, "launch"));
            Log.m105925i("MicroMsg.JsApiEventOnSplashAdShow[AppBrandSplashAd]", "dispatch, source:%s", this.f238395i);
            eVar.getRuntime().f238295w1.mo113817f(new C81119a(hashMap, eVar));
        }
    }
}
