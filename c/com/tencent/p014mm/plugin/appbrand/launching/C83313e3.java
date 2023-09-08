package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.e3 */
public final class C83313e3 extends C87413o implements C32226l<WxaPkgLoadProgress, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83327g3 f243473d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83313e3(C83327g3 g3Var) {
        super(1);
        this.f243473d = g3Var;
    }

    public Object invoke(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
        C87412m.m108594g(wxaPkgLoadProgress, "wholeProgressInfo");
        this.f243473d.mo115616a(new ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult(1, wxaPkgLoadProgress, (List) null, false, 0, (String) null, 60, (C8480h) null));
        return C13598b0.f38549a;
    }
}
