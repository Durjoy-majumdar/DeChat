package ur0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;

/* renamed from: ur0.d */
public final class C90727d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f260589d;

    public C90727d(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f260589d = appBrandRuntimeWC;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f260589d;
        C81820e3 e3Var = appBrandRuntimeWC.f238142e;
        if (e3Var != null && e3Var.getActiveRuntime() == appBrandRuntimeWC) {
            appBrandRuntimeWC.mo113090y();
        }
    }
}
