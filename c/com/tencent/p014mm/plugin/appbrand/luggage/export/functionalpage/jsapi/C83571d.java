package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.d */
public final class C83571d {
    /* renamed from: a */
    public static final void m102592a(Context context, C32226l<? super MMActivity, C13598b0> lVar) {
        C87412m.m108594g(lVar, "block");
        int hashCode = lVar.hashCode();
        SparseArray<C32226l<MMActivity, C13598b0>> sparseArray = C83567a.f244116a;
        C83567a.f244116a.put(lVar.hashCode(), lVar);
        if (MMApplicationContext.isAppBrandProcess()) {
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            C81956c.m100674b(context, new ProxyRequest(hashCode), (AppBrandProxyUIProcessTask.C81943b) null);
            return;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C81956c.m100675c(context, new ProxyRequest(hashCode), (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
    }
}
