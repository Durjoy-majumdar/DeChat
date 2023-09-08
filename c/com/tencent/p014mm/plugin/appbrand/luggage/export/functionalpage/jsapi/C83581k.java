package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82805k;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.k */
public final class C83581k extends C82805k {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "sdk_navigateToMiniProgram";

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.k$a */
    public static final class C83582a implements C83588k.C83592b {

        /* renamed from: a */
        public final /* synthetic */ C81879g f244136a;

        /* renamed from: b */
        public final /* synthetic */ int f244137b;

        /* renamed from: c */
        public final /* synthetic */ C83581k f244138c;

        public C83582a(C81879g gVar, int i, C83581k kVar) {
            this.f244136a = gVar;
            this.f244137b = i;
            this.f244138c = kVar;
        }

        /* renamed from: a */
        public final void mo115910a(AppBrandInitConfig appBrandInitConfig, Object obj) {
            JSONObject jSONObject = null;
            MiniProgramNavigationBackResult miniProgramNavigationBackResult = obj instanceof MiniProgramNavigationBackResult ? (MiniProgramNavigationBackResult) obj : null;
            Log.m105924i("MicroMsg.AppBrand.FunctionalJsApiNavigateToMiniProgram", "onReceiveReturnData navigateToAppId:" + appBrandInitConfig.f239362d + " result:" + miniProgramNavigationBackResult);
            HashMap hashMap = new HashMap();
            if ((miniProgramNavigationBackResult != null ? miniProgramNavigationBackResult.f238361d : null) != null) {
                hashMap.put("extraData", miniProgramNavigationBackResult.f238361d);
            }
            if (miniProgramNavigationBackResult != null) {
                jSONObject = miniProgramNavigationBackResult.f238362e;
            }
            if (jSONObject != null) {
                hashMap.put("privateExtraData", miniProgramNavigationBackResult.f238362e);
            }
            this.f244136a.mo109647a(this.f244137b, this.f244138c.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.k$b */
    public static final class C83583b implements C82794c.C82798c {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f244139a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f244140b;

        /* renamed from: c */
        public final /* synthetic */ int f244141c;

        /* renamed from: d */
        public final /* synthetic */ C83581k f244142d;

        public C83583b(JSONObject jSONObject, C81879g gVar, int i, C83581k kVar) {
            this.f244139a = jSONObject;
            this.f244140b = gVar;
            this.f244141c = i;
            this.f244142d = kVar;
        }

        /* renamed from: a */
        public final void mo1732a(boolean z, String str) {
            String optString = this.f244139a.optString("appId");
            Log.m105924i("MicroMsg.AppBrand.FunctionalJsApiNavigateToMiniProgram", "onNavigateResult, navigateToAppId:" + optString + " ok:" + z + ", reason:" + str);
            if (!z) {
                C81879g gVar = this.f244140b;
                int i = this.f244141c;
                C83581k kVar = this.f244142d;
                StringBuilder sb = new StringBuilder();
                sb.append("fail: navigate error ");
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                gVar.mo109647a(i, kVar.mo115109j(sb.toString()));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo1733b(AppBrandInitConfig appBrandInitConfig) {
        }
    }

    /* renamed from: y */
    public C82794c.C82798c mo77029y(C81879g gVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(gVar, "service");
        C87412m.m108594g(jSONObject, "data");
        AppBrandRuntime runtime = gVar.getRuntime();
        C87412m.m108592e(runtime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalRuntime");
        ((C83588k) runtime).f244154S1 = new C83582a(gVar, i, this);
        return new C83583b(jSONObject, gVar, i, this);
    }
}
