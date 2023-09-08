package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.page.c0 */
public class C83772c0 implements C82531i.C82538g {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f244517a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f244518b;

    /* renamed from: c */
    public final /* synthetic */ x$$i f244519c;

    /* renamed from: d */
    public final /* synthetic */ long f244520d;

    /* renamed from: e */
    public final /* synthetic */ String f244521e;

    /* renamed from: f */
    public final /* synthetic */ C83966x f244522f;

    public C83772c0(C83966x xVar, C83780d1 d1Var, AtomicBoolean atomicBoolean, x$$i x__i, long j, String str) {
        this.f244522f = xVar;
        this.f244517a = d1Var;
        this.f244518b = atomicBoolean;
        this.f244519c = x__i;
        this.f244520d = j;
        this.f244521e = str;
    }

    public void onReady() {
        this.f244517a.f244657w.f241645d.remove(this);
        if (this.f244518b.get()) {
            this.f244519c.run();
        } else {
            this.f244522f.post(this.f244519c);
        }
        Log.m105925i("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] onReady received, time: %d", this.f244522f.getAppId(), this.f244521e, Long.valueOf(System.currentTimeMillis() - this.f244520d));
    }
}
