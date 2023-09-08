package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.d3 */
public final class C83309d3 extends C87413o implements C32226l<List<? extends IPkgInfo>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83327g3 f243465d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83309d3(C83327g3 g3Var) {
        super(1);
        this.f243465d = g3Var;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "resultPkgList");
        this.f243465d.mo115616a(new ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult(2, (WxaPkgLoadProgress) null, list, true, 0, (String) null, 50, (C8480h) null));
        return C13598b0.f38549a;
    }
}
