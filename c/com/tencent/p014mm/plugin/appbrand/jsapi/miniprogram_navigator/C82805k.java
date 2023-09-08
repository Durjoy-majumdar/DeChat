package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import ak0.C79584a;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandInitWindowConfig;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82804j;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84499c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C76630x0;
import org.json.JSONObject;
import p963fc.C86812g;
import wi0.C90973a0;
import wi0.C91003z;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k */
public class C82805k extends C82804j {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k$a */
    public class C82806a implements C82794c.C82798c {

        /* renamed from: a */
        public final /* synthetic */ C82794c.C82798c f242178a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f242179b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f242180c;

        public C82806a(C82805k kVar, C82794c.C82798c cVar, C81879g gVar, JSONObject jSONObject) {
            this.f242178a = cVar;
            this.f242179b = gVar;
            this.f242180c = jSONObject;
        }

        /* renamed from: a */
        public void mo1732a(boolean z, String str) {
            C82794c.C82798c cVar = this.f242178a;
            if (cVar != null) {
                cVar.mo1732a(z, str);
            }
        }

        /* renamed from: b */
        public void mo1733b(AppBrandInitConfig appBrandInitConfig) {
            String str = appBrandInitConfig.f239362d;
            C82794c.C82798c cVar = this.f242178a;
            if (cVar != null) {
                cVar.mo1733b(appBrandInitConfig);
            }
            boolean z = ((C86812g) this.f242179b.getRuntime()).mo113036W().f234841u == 7;
            boolean optBoolean = this.f242180c.optBoolean("useTransparentBackground", false);
            boolean z2 = !((C76630x0) C86312j.m106911c(C76630x0.class)).fn0();
            AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) appBrandInitConfig;
            boolean z3 = appBrandInitConfigLU.f234804H.f239451D;
            boolean b = C84499c0.m104088b();
            if (z && optBoolean && z2 && (z3 || b)) {
                AppBrandInitWindowConfig appBrandInitWindowConfig = new AppBrandInitWindowConfig();
                appBrandInitWindowConfig.f234851f = C90973a0.TRANSPARENT;
                C91003z zVar = C91003z.DISABLED;
                appBrandInitWindowConfig.f234854i = zVar;
                appBrandInitWindowConfig.f234855j = zVar;
                appBrandInitConfigLU.f234828Y = appBrandInitWindowConfig;
            }
            AppBrandRuntime runtime = this.f242179b.getRuntime();
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) runtime;
            C79584a.C79585a aVar = C79584a.f233382a;
            if (aVar.mo109699b(appBrandRuntimeWC)) {
                AppBrandRuntimeWC a = (!(runtime instanceof AppBrandRuntimeWC) || !aVar.mo109699b(appBrandRuntimeWC)) ? null : aVar.mo109698a(appBrandRuntimeWC);
                if (a != null && TextUtils.equals(str, a.f238147j)) {
                    Log.m105924i("MicroMsg.JsApiNavigateToMiniProgramWC", "close embedded wxa runtime. REASON[embedded wxa's host will be brought to front].");
                    runtime.mo113063k();
                }
            }
        }
    }

    /* renamed from: w */
    public C82794c mo114794w() {
        return C82819r.f242212b;
    }

    /* renamed from: y */
    public C82794c.C82798c mo77029y(C81879g gVar, JSONObject jSONObject, int i) {
        return new C82806a(this, new C82804j.C1750a(gVar, i), gVar, jSONObject);
    }
}
