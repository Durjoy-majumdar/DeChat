package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import js0.C88024r;
import qq0.C89790a;
import qq0.C89816t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.a0 */
public final class C82572a0 {

    /* renamed from: a */
    public long f241683a = 0;

    /* renamed from: b */
    public C89816t.C89818b f241684b;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.a0$a */
    public class C82573a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f241685d;

        public C82573a(AppBrandRuntime appBrandRuntime) {
            this.f241685d = appBrandRuntime;
        }

        public void run() {
            C89816t.C89818b bVar = C82572a0.this.f241684b;
            if (bVar != null) {
                bVar.dismiss();
            }
            C82572a0.this.f241684b = C89790a.C89791a.m112271a(this.f241685d).mo124076f(C89790a.C89793b.LBS);
            C82572a0.this.f241683a = System.currentTimeMillis();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.a0$b */
    public class C82574b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.a0$b$a */
        public class C82575a implements Runnable {
            public C82575a() {
            }

            public void run() {
                C82572a0.this.f241684b.dismiss();
            }
        }

        public C82574b() {
        }

        public void run() {
            if (C82572a0.this.f241684b != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C82572a0 a0Var = C82572a0.this;
                long j = currentTimeMillis - a0Var.f241683a;
                if (j < 3000) {
                    MMHandlerThread.postToMainThreadDelayed(new C82575a(), 3000 - j);
                } else {
                    a0Var.f241684b.dismiss();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo114890a(AppBrandRuntime appBrandRuntime) {
        Log.m105924i("MicroMsg.LbsBlinkHelper", "startBlinkSubTitle");
        C88024r.m109572b(new C82573a(appBrandRuntime));
    }

    /* renamed from: b */
    public void mo114891b(AppBrandRuntime appBrandRuntime) {
        Log.m105924i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitle");
        C88024r.m109572b(new C82574b());
    }
}
