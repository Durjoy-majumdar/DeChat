package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83419j;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.i */
public class C83418i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f243778d;

    /* renamed from: e */
    public final /* synthetic */ Boolean f243779e;

    /* renamed from: f */
    public final /* synthetic */ C83419j.C83420a f243780f;

    public C83418i(C83419j.C83420a aVar, String str, Boolean bool) {
        this.f243780f = aVar;
        this.f243778d = str;
        this.f243779e = bool;
    }

    public void run() {
        if (!this.f243778d.equals(C83419j.this.f243781d.f239362d) || !this.f243779e.booleanValue()) {
            C83421k.this.f243787f.mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
        } else {
            C83419j.this.f243782e.run();
        }
    }
}
