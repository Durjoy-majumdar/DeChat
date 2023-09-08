package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.m */
public class C82595m extends C82597n {
    private static final int CTRL_INDEX = 586;
    private static final String NAME = "enableLocationUpdateBackground";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.m$a */
    public static class C82596a implements C80916r<IPCVoid, IPCInteger> {
        private C82596a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Class cls = C81591s.class;
            int i = 0;
            if (!C86312j.m106916h(cls)) {
                return new IPCInteger(0);
            }
            for (AppBrandBackgroundRunningApp appBrandBackgroundRunningApp : ((C81591s) C86312j.m106911c(cls)).mo113854fA()) {
                if (C81583j.m100070b(appBrandBackgroundRunningApp.f239209f, 2)) {
                    i++;
                }
            }
            return new IPCInteger(i);
        }
    }

    /* renamed from: x */
    public void mo114896x(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C82581d0 d0Var = (C82581d0) i2Var.mo109666h(C82581d0.class);
        this.f241719h = d0Var;
        if (d0Var instanceof C82587e0) {
            C82587e0 e0Var = (C82587e0) d0Var;
            if (e0Var.f241701j && e0Var.f241702n) {
                Log.m105924i("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "already in location background mode");
                i2Var.mo109647a(i, mo115109j("ok"));
                return;
            }
        }
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C82596a.class);
        AppBrandGlobalSystemConfig b = AppBrandGlobalSystemConfig.m100099b();
        if (iPCInteger == null || iPCInteger.f10313d < b.f239305f) {
            super.mo114903A(i2Var, jSONObject, i);
            C82581d0 d0Var2 = this.f241719h;
            if (!(d0Var2 instanceof C82587e0)) {
                Log.m105928w("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "state manager not RuntimeLocationUpdateStateManagerWxa");
                i2Var.mo109647a(i, mo115109j("fail:system error"));
            } else if (d0Var2 != null && d0Var2.f241702n) {
                AppBrandBackgroundRunningMonitor.m100056a(i2Var, 1, 2, false);
            }
        } else {
            Log.m105928w("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "enableLocationBackground: fail reach max concurrent background count");
            i2Var.mo109647a(i, mo115109j("fail reach max concurrent background count"));
        }
    }
}
