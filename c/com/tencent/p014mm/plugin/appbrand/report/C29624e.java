package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import kr0.C34014s0;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.report.e */
public class C29624e extends C86301e implements C34014s0 {
    public String getNetworkType() {
        return C84116i0.m103659b(MMApplicationContext.getContext());
    }
}
