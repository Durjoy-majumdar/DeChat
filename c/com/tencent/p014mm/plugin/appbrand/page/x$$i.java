package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x$$i */
public abstract class x$$i implements Runnable {

    /* renamed from: d */
    public boolean f245144d = false;

    /* renamed from: e */
    public boolean f245145e = false;

    /* renamed from: a */
    public abstract void mo116098a();

    public final void run() {
        if (!this.f245144d && !this.f245145e) {
            this.f245144d = true;
            mo116098a();
        }
    }
}
