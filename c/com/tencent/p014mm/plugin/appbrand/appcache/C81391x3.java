package com.tencent.p014mm.plugin.appbrand.appcache;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.x3 */
public final class C81391x3 extends C87413o implements C32224a<WxaPkg> {

    /* renamed from: d */
    public final /* synthetic */ WxaPluginPkgInfo f238896d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81391x3(WxaPluginPkgInfo wxaPluginPkgInfo) {
        super(0);
        this.f238896d = wxaPluginPkgInfo;
    }

    public Object invoke() {
        return new WxaPkg(this.f238896d.pkgPath);
    }
}
