package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.h2$$a */
public final /* synthetic */ class h2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84534h2 f246691d;

    /* renamed from: e */
    public final /* synthetic */ Context f246692e;

    public /* synthetic */ h2$$a(C84534h2 h2Var, Context context) {
        this.f246691d = h2Var;
        this.f246692e = context;
    }

    public final void run() {
        C84534h2 h2Var = this.f246691d;
        Context context = this.f246692e;
        if (context == h2Var.f246690f.getBaseContext()) {
            Log.m105925i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "onActivityPostDestroyed auto release ref to %s", context);
            C84543i2 i2Var = h2Var.f246690f;
            h2$$a.super.setBaseContext(i2Var.f246707b);
        }
    }
}
