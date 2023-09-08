package qq0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import gy3.C87412m;
import rx3.C13603j;
import wi0.C66117m;

/* renamed from: qq0.l */
public final class C89807l {

    /* renamed from: a */
    public static final C89807l f258213a = new C89807l();

    /* renamed from: a */
    public final BaseAppBrandSingleCloseCapsuleBar mo124096a(AppBrandRuntimeWC appBrandRuntimeWC, Context context, boolean z) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C87412m.m108594g(context, "context");
        HalfScreenConfig halfScreenConfig = appBrandRuntimeWC.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "runtime.initConfig.halfScreenConfig");
        C81634a F = appBrandRuntimeWC.mo113008F();
        boolean z2 = false;
        boolean f = F != null ? F.mo113987f() : false;
        if (!z ? halfScreenConfig.f157948h || !f : halfScreenConfig.f157948h || halfScreenConfig.mo76930b() == C66117m.FORCE_LIGHT) {
            z2 = true;
        }
        int ordinal = halfScreenConfig.f157932C.ordinal();
        if (ordinal == 0) {
            return new AppBrandSingleCloseCapsuleBar(context, z2);
        }
        if (ordinal == 1) {
            return new AppBrandeEmbedSingleCloseCapsuleBar(context, z2);
        }
        throw new C13603j();
    }
}
