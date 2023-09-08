package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.ipc.C81957e;
import com.tencent.p014mm.plugin.appbrand.keepalive.C83202b;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.q$$g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import kr0.C88273g1;

/* renamed from: com.tencent.mm.plugin.appbrand.app.l */
public class C81168l implements C32226l<String, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C84343y f238492d;

    /* renamed from: e */
    public final /* synthetic */ boolean f238493e;

    /* renamed from: f */
    public final /* synthetic */ int f238494f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandPreloadProfiler f238495g;

    /* renamed from: h */
    public final /* synthetic */ C88273g1 f238496h;

    public C81168l(C84343y yVar, boolean z, int i, AppBrandPreloadProfiler appBrandPreloadProfiler, C88273g1 g1Var) {
        this.f238492d = yVar;
        this.f238493e = z;
        this.f238494f = i;
        this.f238495g = appBrandPreloadProfiler;
        this.f238496h = g1Var;
    }

    public Object invoke(Object obj) {
        C81176n.f238501c = true;
        boolean z = C81176n.f238500b;
        Log.m105925i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "start misc preload type[%s], aggressive[%b], reason[%s], skip[%b], level[%d]", this.f238492d, Boolean.valueOf(this.f238493e), (String) obj, Boolean.valueOf(z), Integer.valueOf(this.f238494f));
        if (!z) {
            try {
                C81957e.m100676a();
                if (this.f238493e) {
                    if (C84331q.m103947b(this.f238492d)) {
                        C84331q.m103955j(this.f238492d, (q$$g) null, true, this.f238495g, this.f238496h, this.f238494f);
                    }
                    C81176n.m99461a("preload aggressive before keepalive");
                    if (MMApplicationContext.getProcessName().equals(C84273a0.f246143j)) {
                        C83202b.m102118a(new l$$a());
                    }
                } else {
                    C84331q.m103955j(this.f238492d, (q$$g) null, false, this.f238495g, this.f238496h, this.f238494f);
                }
            } catch (Exception e) {
                if (!AppBrandRuntimeWC.f238264Q1) {
                    Log.printErrStackTrace("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", e, "Preload [%s] in IdleHandler encountered Exception", this.f238492d.name());
                } else {
                    throw e;
                }
            }
        }
        return 0;
    }
}
