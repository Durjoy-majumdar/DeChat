package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import kr0.C34008p0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.app.e0 */
public class C29108e0 extends C86301e implements C34008p0 {
    /* renamed from: wB */
    public boolean mo56467wB(String str, String str2) {
        return AppBrandCommonBindingJni.nativeBrotliDecompress(C86013q1.m106448i(str, false), C86013q1.m106448i(str2, true));
    }
}
