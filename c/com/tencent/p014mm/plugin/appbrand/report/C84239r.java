package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.report.model.C84139c;
import com.tencent.p014mm.plugin.appbrand.report.model.C84146i;

/* renamed from: com.tencent.mm.plugin.appbrand.report.r */
public final class C84239r extends C84139c implements C84146i {

    /* renamed from: h */
    public volatile long f246069h = 0;

    /* renamed from: i */
    public volatile boolean f246070i = false;

    /* renamed from: j */
    public volatile String f246071j;

    /* renamed from: k */
    public volatile AppBrandRuntime f246072k;

    public C84239r(int i) {
        super(i);
    }

    /* renamed from: a */
    public String mo116816a() {
        return this.f246071j;
    }

    /* renamed from: b */
    public long mo116817b() {
        if (this.f246070i) {
            return this.f245632a.f245588f - this.f246069h;
        }
        return 0;
    }

    /* renamed from: f */
    public void mo116804f() {
        super.mo116804f();
        if (AppBrandRuntimeWCAccessible.isGame(this.f246072k)) {
            String T = this.f246072k.f238130W ? this.f246072k.mo113030T() : this.f246072k.mo113042Z().getCurrentUrl();
            this.f246069h = 0;
            if (T.startsWith("__wx__")) {
                this.f246070i = false;
                this.f246071j = null;
            }
        }
    }

    /* renamed from: g */
    public void mo116805g(AppBrandRuntime appBrandRuntime) {
        this.f245634c = appBrandRuntime.f238147j;
        this.f245635d = appBrandRuntime;
        this.f246072k = appBrandRuntime;
    }
}
