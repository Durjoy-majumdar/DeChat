package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f */
public class C83315f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f243475d;

    /* renamed from: e */
    public final /* synthetic */ C80247h f243476e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandLaunchErrorAction f243477f;

    public C83315f(AppBrandLaunchErrorAction appBrandLaunchErrorAction, Activity activity, C80247h hVar) {
        this.f243477f = appBrandLaunchErrorAction;
        this.f243475d = activity;
        this.f243476e = hVar;
    }

    public void run() {
        Activity activity = this.f243475d;
        Context context = (activity == null || activity.isFinishing() || this.f243475d.isDestroyed()) ? MMApplicationContext.getContext() : this.f243475d;
        if (!C90595a.m113498b(AppBrandLaunchErrorAction.f243115f, this.f243476e)) {
            this.f243477f.mo115478a(context, "handleAsync");
        }
    }
}
