package ak0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ak0.a */
public final class C79584a {

    /* renamed from: a */
    public static final C79585a f233382a = new C79585a((C8480h) null);

    /* renamed from: ak0.a$a */
    public static final class C79585a {
        public C79585a(C8480h hVar) {
        }

        /* renamed from: a */
        public final AppBrandRuntimeWC mo109698a(AppBrandRuntimeWC appBrandRuntimeWC) {
            C81820e3 e3Var;
            C87412m.m108594g(appBrandRuntimeWC, "embedWxa");
            if (!mo109699b(appBrandRuntimeWC) || (e3Var = appBrandRuntimeWC.f238142e) == null || !e3Var.mo113124e(appBrandRuntimeWC)) {
                return null;
            }
            return (AppBrandRuntimeWC) e3Var.mo113136o(appBrandRuntimeWC);
        }

        /* renamed from: b */
        public final boolean mo109699b(AppBrandRuntimeWC appBrandRuntimeWC) {
            C87412m.m108594g(appBrandRuntimeWC, "embedWxa");
            HalfScreenConfig halfScreenConfig = appBrandRuntimeWC.mo113210l1().f234815R0;
            C87412m.m108593f(halfScreenConfig, "embedWxa.initConfig.halfScreenConfig");
            return halfScreenConfig.mo76931c() && halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED;
        }

        /* renamed from: c */
        public final boolean mo109700c(AppBrandRuntimeWC appBrandRuntimeWC) {
            AppBrandRuntimeWC appBrandRuntimeWC2;
            C87412m.m108594g(appBrandRuntimeWC, "host");
            C81820e3 e3Var = appBrandRuntimeWC.f238142e;
            if (e3Var != null && (appBrandRuntimeWC2 = (AppBrandRuntimeWC) e3Var.getActiveRuntime()) != null && !C87412m.m108589b(appBrandRuntimeWC, appBrandRuntimeWC2) && mo109699b(appBrandRuntimeWC2)) {
                AppBrandRuntime appBrandRuntime = null;
                try {
                    appBrandRuntime = e3Var.mo113136o(appBrandRuntimeWC2);
                } catch (Throwable unused) {
                }
                if (appBrandRuntime == appBrandRuntimeWC) {
                    return true;
                }
            }
            return false;
        }
    }
}
