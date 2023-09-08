package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x$$f */
public class x$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ x$$h f245139d;

    /* renamed from: e */
    public final /* synthetic */ boolean[] f245140e;

    /* renamed from: f */
    public final /* synthetic */ String f245141f;

    /* renamed from: g */
    public final /* synthetic */ C83966x f245142g;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.x$$f$a */
    public class C83967a implements Runnable {
        public C83967a() {
        }

        public void run() {
            x$$f x__f = x$$f.this;
            x__f.f245139d.mo116457a(x__f.f245142g, x__f.f245141f);
        }
    }

    public x$$f(C83966x xVar, x$$h x__h, boolean[] zArr, String str) {
        this.f245142g = xVar;
        this.f245139d = x__h;
        this.f245140e = zArr;
        this.f245141f = str;
    }

    public void run() {
        x$$h x__h = this.f245139d;
        if (x__h == null) {
            return;
        }
        if (!this.f245140e[0]) {
            this.f245142g.post(new C83967a());
        } else {
            x__h.mo116457a(this.f245142g, this.f245141f);
        }
    }
}
