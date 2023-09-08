package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f3 */
public final class C83321f3 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83327g3 f243491d;

    /* renamed from: e */
    public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallArgs f243492e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83321f3(C83327g3 g3Var, ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallArgs iPCCallArgs) {
        super(2);
        this.f243491d = g3Var;
        this.f243492e = iPCCallArgs;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        Log.m105920e("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallTask", "waitForPkgList onError(" + intValue + ", " + str + ')');
        this.f243491d.mo115616a(new ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult(2, (WxaPkgLoadProgress) null, (List) null, false, intValue, str, 6, (C8480h) null));
        ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallArgs iPCCallArgs = this.f243492e;
        String str2 = iPCCallArgs.f243361d;
        int i = iPCCallArgs.f243364g;
        WxaAttributes.WxaVersionInfo wxaVersionInfo = iPCCallArgs.f243365h;
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(wxaVersionInfo, "wxaVersionInfo");
        C115669n.INSTANCE.mo175911u(1906, intValue);
        C84240s.m103843i(str2, C81289m.C81290a.m99664b(i) ? wxaVersionInfo.f239452d : 0, i, 1906, intValue, 1);
        return C13598b0.f38549a;
    }
}
