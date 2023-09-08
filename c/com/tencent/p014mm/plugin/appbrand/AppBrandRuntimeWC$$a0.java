package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$a0 */
public final class AppBrandRuntimeWC$$a0 extends AppBrandRuntime$$z {

    /* renamed from: b */
    public volatile AppBrandPrepareTask f238303b;

    /* renamed from: c */
    public volatile boolean f238304c = false;

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238305d;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$a0$a */
    public class C81092a implements C32226l<ICommLibReader, C13598b0> {
        public C81092a() {
        }

        public Object invoke(Object obj) {
            ICommLibReader iCommLibReader = (ICommLibReader) obj;
            if (!AppBrandRuntimeWC$$a0.this.f238304c) {
                try {
                    AppBrandRuntimeWC$$a0 appBrandRuntimeWC$$a0 = AppBrandRuntimeWC$$a0.this;
                    appBrandRuntimeWC$$a0.f238303b = AppBrandRuntimeWC.m99219z(appBrandRuntimeWC$$a0.f238305d, appBrandRuntimeWC$$a0);
                } catch (NullPointerException e) {
                    if (!AppBrandRuntimeWC$$a0.this.f238305d.mo113064k0()) {
                        throw e;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public AppBrandRuntimeWC$$a0(AppBrandRuntimeWC appBrandRuntimeWC, C84886w1 w1Var) {
        this.f238305d = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo113113a() {
        this.f238304c = true;
        AppBrandPrepareTask appBrandPrepareTask = this.f238303b;
        if (appBrandPrepareTask != null) {
            appBrandPrepareTask.mo115499b();
        }
    }

    /* renamed from: b */
    public void mo54191b() {
        this.f238305d.mo113052e("ResourcePrepareProcess.prepare()", new Object[0]);
        C83499v.m102464a(this.f238305d, new C81092a());
    }
}
