package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.p */
public class C83402p extends C83453r2<AppBrandSysConfigWC> {

    /* renamed from: g */
    public final /* synthetic */ AppBrandPrepareTask f243694g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83402p(AppBrandPrepareTask appBrandPrepareTask, AppBrandRuntime appBrandRuntime, AppBrandPrepareTask.C83253c cVar) {
        super(appBrandRuntime, cVar);
        this.f243694g = appBrandPrepareTask;
    }

    public void dead() {
        StringBuilder sb = new StringBuilder();
        sb.append("dead() hash=");
        sb.append(hashCode());
        sb.append(", appId:");
        AppBrandRuntime appBrandRuntime = this.f243869d;
        sb.append(appBrandRuntime != null ? appBrandRuntime.f238147j : null);
        Log.m105924i("MicroMsg.LaunchPrepareCallbackWrapper", sb.toString());
        AppBrandRuntime appBrandRuntime2 = this.f243869d;
        if (appBrandRuntime2 != null) {
            appBrandRuntime2.mo1963B7(this);
        }
        this.f243869d = null;
        this.f243870e = null;
        this.f243871f = true;
        if (this.f243694g.f243158d != null) {
            XIPCInvoker.m98750c(this.f243694g.f243158d);
            this.f243694g.f243158d = null;
        }
    }
}
