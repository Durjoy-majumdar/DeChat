package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l */
public class C83593l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f244158d;

    /* renamed from: e */
    public final /* synthetic */ C83588k f244159e;

    public C83593l(C83588k kVar, Context context) {
        this.f244159e = kVar;
        this.f244158d = context;
    }

    public void run() {
        Context context = this.f244158d;
        if (context instanceof AppBrandPluginUI) {
            ((AppBrandPluginUI) context).finish();
        }
    }
}
