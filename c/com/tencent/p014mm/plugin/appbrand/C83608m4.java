package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import java.util.HashMap;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.m4 */
public final class C83608m4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.m4$a */
    public static class C83609a extends C82926s {
        public static final int CTRL_INDEX = -2;
        public static final String NAME = "onBottomBannerButtonClicked";
    }

    /* renamed from: a */
    public static boolean m102642a(AppBrandRuntimeWC appBrandRuntimeWC) {
        return appBrandRuntimeWC.mo113210l1().f234813Q0 == 1;
    }

    /* renamed from: b */
    public static void m102643b(AppBrandRuntimeWC appBrandRuntimeWC, String str) {
        C83609a aVar = new C83609a();
        HashMap hashMap = new HashMap(1);
        hashMap.put("currentPath", str);
        aVar.mo115165o(hashMap);
        aVar.mo115194p((C88267e) appBrandRuntimeWC.f238150p);
        aVar.mo115158h();
    }
}
