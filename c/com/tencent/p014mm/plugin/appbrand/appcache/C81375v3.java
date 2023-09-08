package com.tencent.p014mm.plugin.appbrand.appcache;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.v3 */
public final class C81375v3 extends C87413o implements C32224a<WxaPkg> {

    /* renamed from: d */
    public final /* synthetic */ ModulePkgInfo f238874d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81375v3(ModulePkgInfo modulePkgInfo) {
        super(0);
        this.f238874d = modulePkgInfo;
    }

    public Object invoke() {
        return new WxaPkg(this.f238874d.pkgPath);
    }
}
