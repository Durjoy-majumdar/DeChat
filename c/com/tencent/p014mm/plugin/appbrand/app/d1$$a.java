package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p210o.C11323a;
import wi0.C90981g;

/* renamed from: com.tencent.mm.plugin.appbrand.app.d1$$a */
public final /* synthetic */ class d1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f238459d;

    /* renamed from: e */
    public final /* synthetic */ C11323a f238460e;

    public /* synthetic */ d1$$a(String str, C11323a aVar) {
        this.f238459d = str;
        this.f238460e = aVar;
    }

    public final void run() {
        String str = this.f238459d;
        C11323a aVar = this.f238460e;
        AppBrandInitConfigWC N = AppBrandProcessesManager.m103869I().mo116950N(str);
        if (N != null) {
            if (aVar != null) {
                aVar.apply("ok");
            }
            LaunchParcel a = C90981g.m114148a(N);
            a.f243728U = true;
            ((C83285a) C83428o.f243800a).mo115582b(MMApplicationContext.getContext(), a);
        } else if (aVar != null) {
            aVar.apply("fail miniprogram not running");
        }
    }
}
