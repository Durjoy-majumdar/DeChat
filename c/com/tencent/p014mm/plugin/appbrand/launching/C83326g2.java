package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g2 */
public final class C83326g2 extends C87413o implements C32226l<List<? extends IPkgInfo>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243496d;

    /* renamed from: e */
    public final /* synthetic */ WxaPkgWrappingInfo f243497e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReference<WxaPkgWrappingInfo> f243498f;

    /* renamed from: g */
    public final /* synthetic */ CountDownLatch f243499g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83326g2(C83399o2 o2Var, WxaPkgWrappingInfo wxaPkgWrappingInfo, AtomicReference<WxaPkgWrappingInfo> atomicReference, CountDownLatch countDownLatch) {
        super(1);
        this.f243496d = o2Var;
        this.f243497e = wxaPkgWrappingInfo;
        this.f243498f = atomicReference;
        this.f243499g = countDownLatch;
    }

    public Object invoke(Object obj) {
        Object obj2;
        List<IPkgInfo> list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        C83399o2 o2Var = this.f243496d;
        WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f243497e;
        o2Var.getClass();
        for (IPkgInfo iPkgInfo : list) {
            if (iPkgInfo instanceof ModulePkgInfo) {
                Iterator<ModulePkgInfo> it = wxaPkgWrappingInfo.iterator();
                while (true) {
                    WxaPkgWrappingInfo.C81222a aVar = (WxaPkgWrappingInfo.C81222a) it;
                    if (!aVar.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = aVar.next();
                    if (C87412m.m108589b(((ModulePkgInfo) obj2).name, ((ModulePkgInfo) iPkgInfo).name)) {
                        break;
                    }
                }
                C87412m.m108591d(obj2);
                ModulePkgInfo modulePkgInfo = (ModulePkgInfo) obj2;
                ModulePkgInfo modulePkgInfo2 = (ModulePkgInfo) iPkgInfo;
                modulePkgInfo.pkgPath = modulePkgInfo2.pkgPath;
                modulePkgInfo.md5 = modulePkgInfo2.md5;
            } else if (iPkgInfo instanceof WxaPluginPkgInfo) {
                WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f238590i;
                C87412m.m108591d(wxaRuntimeModulePluginListMap);
                wxaRuntimeModulePluginListMap.mo113466d((WxaPluginPkgInfo) iPkgInfo);
            }
        }
        this.f243498f.set(this.f243497e);
        this.f243499g.countDown();
        return C13598b0.f38549a;
    }
}
