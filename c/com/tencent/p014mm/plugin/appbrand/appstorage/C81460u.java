package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import di3.C86301e;
import ei3.C86522b;
import mi0.C34574b;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.u */
public class C81460u extends C86301e implements C34574b {
    /* renamed from: LU */
    public int mo56629LU(String str) {
        AppBrandRuntimeWC b = C81682d.m100222b(str);
        if (b == null || b.mo113210l1() == null) {
            return 0;
        }
        return b.mo113210l1().f234818T;
    }
}
