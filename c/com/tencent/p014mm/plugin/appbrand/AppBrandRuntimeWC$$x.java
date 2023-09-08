package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84218r;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandUpdateTask;
import fy3.C32226l;
import java.util.HashMap;
import p959ec.C86499a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$x */
public class AppBrandRuntimeWC$$x extends AppBrandRuntime$$z {

    /* renamed from: b */
    public volatile C83499v.C83501b f238347b;

    /* renamed from: c */
    public final /* synthetic */ AppBrandRuntimeWC f238348c;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$x$a */
    public class C81096a implements C32226l<ICommLibReader, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime$$z f238349d;

        public C81096a(AppBrandRuntime$$z appBrandRuntime$$z) {
            this.f238349d = appBrandRuntime$$z;
        }

        public Object invoke(Object obj) {
            ICommLibReader iCommLibReader = (ICommLibReader) obj;
            if (!AppBrandRuntimeWC$$x.this.f238348c.mo113064k0()) {
                AppBrandRuntimeWC appBrandRuntimeWC = AppBrandRuntimeWC$$x.this.f238348c;
                ICommLibReader O1 = appBrandRuntimeWC.mo113184O1(false);
                new AppBrandUpdateTask(C86499a.m107251a(appBrandRuntimeWC), O1 != null ? O1.mo113371a() : -1).mo114395c();
                String str = AppBrandRuntimeWC$$x.this.f238348c.f238147j;
                String i = AppBrandRuntimeWC$$x.this.f238348c.mo113184O1(false).mo113377i();
                C84218r rVar = (C84218r) ((HashMap) C84218r.f245991j).get(str);
                if (rVar != null) {
                    rVar.f246000h = i;
                }
                this.f238349d.mo113114c();
                C83226n.m102128e(AppBrandRuntimeWC$$x.this.f238348c.f238147j, KSProcessWeAppLaunch.stepWaitForCommLibConfirm);
            }
            return C13598b0.f38549a;
        }
    }

    public AppBrandRuntimeWC$$x(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238348c = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo113113a() {
        if (this.f238347b != null) {
            ((C83499v.C83502c) this.f238347b).mo115797a();
        }
    }

    /* renamed from: b */
    public void mo54191b() {
        C83226n.m102130g(this.f238348c.f238147j, KSProcessWeAppLaunch.stepWaitForCommLibConfirm);
        this.f238347b = C83499v.m102464a(this.f238348c, new C81096a(this));
    }
}
