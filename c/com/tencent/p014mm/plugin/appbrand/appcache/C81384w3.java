package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.w3 */
public final class C81384w3 extends C87413o implements C32226l<C81298o0.C81299a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WxaPluginPkgInfo f238889d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81384w3(WxaPluginPkgInfo wxaPluginPkgInfo) {
        super(1);
        this.f238889d = wxaPluginPkgInfo;
    }

    public Object invoke(Object obj) {
        C81298o0.C81299a aVar = (C81298o0.C81299a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        WxaPluginPkgInfo wxaPluginPkgInfo = this.f238889d;
        aVar.f238716a = wxaPluginPkgInfo.provider;
        aVar.f238717b = wxaPluginPkgInfo.pkgVersion();
        aVar.f238718c = this.f238889d.checksumMd5();
        return C13598b0.f38549a;
    }
}
