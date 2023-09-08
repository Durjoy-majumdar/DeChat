package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.y3 */
public final class C81393y3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<IPkgInfo> f238899d;

    /* renamed from: e */
    public final /* synthetic */ C81364t3 f238900e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81393y3(LinkedList<IPkgInfo> linkedList, C81364t3 t3Var) {
        super(0);
        this.f238899d = linkedList;
        this.f238900e = t3Var;
    }

    public Object invoke() {
        Object obj;
        Iterator<IPkgInfo> it = this.f238899d.iterator();
        C81364t3 t3Var = this.f238900e;
        while (it.hasNext()) {
            IPkgInfo next = it.next();
            if (!(next instanceof ModulePkgInfo) && (next instanceof WxaPluginPkgInfo)) {
                WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = t3Var.f238858c.f238590i;
                C87412m.m108591d(wxaRuntimeModulePluginListMap);
                wxaRuntimeModulePluginListMap.mo113466d((WxaPluginPkgInfo) next);
                it.remove();
            }
        }
        LinkedList<IPkgInfo> linkedList = this.f238899d;
        C81364t3 t3Var2 = this.f238900e;
        for (IPkgInfo iPkgInfo : linkedList) {
            C87412m.m108592e(iPkgInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo");
            ModulePkgInfo modulePkgInfo = (ModulePkgInfo) iPkgInfo;
            Iterator<ModulePkgInfo> it4 = t3Var2.f238858c.iterator();
            while (true) {
                WxaPkgWrappingInfo.C81222a aVar = (WxaPkgWrappingInfo.C81222a) it4;
                if (!aVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = aVar.next();
                if (C87412m.m108589b(((ModulePkgInfo) obj).name, modulePkgInfo.name)) {
                    break;
                }
            }
            C87412m.m108591d(obj);
            ModulePkgInfo modulePkgInfo2 = (ModulePkgInfo) obj;
            modulePkgInfo2.pkgPath = modulePkgInfo.pkgPath;
            modulePkgInfo2.md5 = modulePkgInfo.md5;
            C81364t3.m99795j(t3Var2, modulePkgInfo);
            WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = t3Var2.f238858c.f238590i;
            if (wxaRuntimeModulePluginListMap2 != null) {
                String str = modulePkgInfo.name;
                C87412m.m108593f(str, "module.name");
                List<WxaPluginPkgInfo> b = wxaRuntimeModulePluginListMap2.mo113464b(str);
                if (b != null) {
                    for (WxaPluginPkgInfo k : b) {
                        String str2 = modulePkgInfo.name;
                        C87412m.m108593f(str2, "module.name");
                        C81364t3.m99796k(t3Var2, str2, k);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
