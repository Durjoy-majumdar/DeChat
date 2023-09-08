package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.b2 */
public class C81551b2 implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f239174d;

    public C81551b2(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f239174d = appBrandRuntimeWC;
    }

    public Object invoke(Object obj) {
        Log.m105921e("MicroMsg.AppBrandRuntimeWC", "getCurrentPageConfig returns null, appId[%s], reason[%s]", this.f239174d.f238147j, (String) obj);
        return C13598b0.f38549a;
    }
}
