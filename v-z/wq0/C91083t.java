package wq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import sf0.C90188n0;

/* renamed from: wq0.t */
public class C91083t extends C91065g {

    /* renamed from: p */
    public static final boolean f261267p = (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE);

    public C91083t(AppBrandRuntimeWC appBrandRuntimeWC) {
        super(appBrandRuntimeWC, -Util.getInt(C90188n0.f258945m, 0), f261267p);
    }
}
