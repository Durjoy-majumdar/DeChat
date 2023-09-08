package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h */
public class C82802h extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 252;
    public static final String NAME = "navigateBackMiniProgram";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h$a */
    public class C82803a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82554k f242173d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f242174e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f242175f;

        /* renamed from: g */
        public final /* synthetic */ int f242176g;

        public C82803a(C82554k kVar, JSONObject jSONObject, JSONObject jSONObject2, int i) {
            this.f242173d = kVar;
            this.f242174e = jSONObject;
            this.f242175f = jSONObject2;
            this.f242176g = i;
        }

        public void run() {
            MiniProgramNavigationBackResult miniProgramNavigationBackResult;
            AppBrandRuntime runtime = this.f242173d.getRuntime();
            JSONObject jSONObject = this.f242174e;
            JSONObject jSONObject2 = this.f242175f;
            if (jSONObject == null && jSONObject2 == null) {
                MiniProgramNavigationBackResult miniProgramNavigationBackResult2 = MiniProgramNavigationBackResult.f238360f;
                miniProgramNavigationBackResult = null;
            } else {
                miniProgramNavigationBackResult = new MiniProgramNavigationBackResult();
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject == null) {
                    jSONObject = jSONObject3;
                }
                miniProgramNavigationBackResult.f238361d = jSONObject;
                JSONObject jSONObject4 = new JSONObject();
                if (jSONObject2 == null) {
                    jSONObject2 = jSONObject4;
                }
                miniProgramNavigationBackResult.f238362e = jSONObject2;
            }
            runtime.mo113066m(miniProgramNavigationBackResult, (Runnable) null);
            this.f242173d.mo109647a(this.f242176g, C82802h.this.mo115109j("ok"));
        }
    }

    /* renamed from: w */
    public void mo1505u(C82554k kVar, JSONObject jSONObject, int i) {
        kVar.mo109673t(new C82803a(kVar, jSONObject.optJSONObject("extraData"), jSONObject.optJSONObject("privateExtraData"), i));
    }
}
