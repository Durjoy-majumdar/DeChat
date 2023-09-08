package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.u3 */
public final class C81373u3 extends C87413o implements C32226l<C81298o0.C81299a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81364t3 f238872d;

    /* renamed from: e */
    public final /* synthetic */ ModulePkgInfo f238873e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81373u3(C81364t3 t3Var, ModulePkgInfo modulePkgInfo) {
        super(1);
        this.f238872d = t3Var;
        this.f238873e = modulePkgInfo;
    }

    public Object invoke(Object obj) {
        C81298o0.C81299a aVar = (C81298o0.C81299a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C81364t3 t3Var = this.f238872d;
        aVar.f238716a = t3Var.f238857b;
        aVar.f238717b = t3Var.f238858c.pkgVersion();
        aVar.f238718c = this.f238873e.checksumMd5();
        return C13598b0.f38549a;
    }
}
