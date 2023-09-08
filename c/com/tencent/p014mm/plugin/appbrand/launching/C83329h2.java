package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.h2 */
public final class C83329h2 extends C87413o implements C32226l<WxaPkgLoadProgress, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243505d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83329h2(C83399o2 o2Var) {
        super(1);
        this.f243505d = o2Var;
    }

    public Object invoke(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
        C87412m.m108594g(wxaPkgLoadProgress, "progress");
        C83399o2 o2Var = this.f243505d;
        if (!o2Var.f243687r) {
            o2Var.mo115674c();
            o2Var.f243687r = true;
        }
        this.f243505d.mo115673b(wxaPkgLoadProgress.f238582d);
        return C13598b0.f38549a;
    }
}
