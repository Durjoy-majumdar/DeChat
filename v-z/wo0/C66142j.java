package wo0;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import te3.b85;
import te3.l65;

/* renamed from: wo0.j */
public final class C66142j {
    /* renamed from: a */
    public static l65 m77969a(AppBrandLaunchReferrer appBrandLaunchReferrer) {
        l65 l65 = null;
        if (appBrandLaunchReferrer == null) {
            return null;
        }
        int i = appBrandLaunchReferrer.f239396d;
        if (1 == i || 5 == i || 4 == i) {
            l65 = new l65();
            l65.f184041d = appBrandLaunchReferrer.f239397e;
            l65.f184042e = appBrandLaunchReferrer.f239403n;
            l65.f184043f = appBrandLaunchReferrer.f239402j;
        }
        if (appBrandLaunchReferrer.f239403n != 0) {
            if (l65 == null) {
                l65 = new l65();
            }
            l65.f184042e = appBrandLaunchReferrer.f239403n;
        }
        return l65;
    }

    /* renamed from: b */
    public static b85 m77970b(AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer == null || 2 != appBrandLaunchReferrer.f239396d) {
            return null;
        }
        b85 b85 = new b85();
        b85.f182231d = appBrandLaunchReferrer.f239397e;
        b85.f182232e = appBrandLaunchReferrer.f239401i;
        return b85;
    }
}
