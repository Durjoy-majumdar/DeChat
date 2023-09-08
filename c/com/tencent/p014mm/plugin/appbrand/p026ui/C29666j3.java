package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.os.PowerManager;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.j3 */
public final class C29666j3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f80619d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f80620e;

    public C29666j3(Context context, C32226l<? super Boolean, C13598b0> lVar) {
        this.f80619d = context;
        this.f80620e = lVar;
    }

    public final void run() {
        Context context = this.f80619d;
        C32226l<Boolean, C13598b0> lVar = this.f80620e;
        Object systemService = context.getSystemService("power");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        lVar.invoke(Boolean.valueOf(((PowerManager) systemService).isInteractive()));
    }
}
