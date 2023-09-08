package com.tencent.p014mm.plugin.appbrand;

import android.graphics.Bitmap;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import jp3.C9486a;
import js0.C88020k;
import lb0.C88394b;
import lb0.C88431k;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$n */
public class AppBrandRuntime$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238186d;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$n$a */
    public class C81069a extends C88394b.C88400e {

        /* renamed from: d */
        public final C9486a f238187d;

        /* renamed from: e */
        public final /* synthetic */ C79774c f238188e;

        /* renamed from: f */
        public final /* synthetic */ C79774c.C79775a f238189f;

        public C81069a(C79774c cVar, C79774c.C79775a aVar) {
            this.f238188e = cVar;
            this.f238189f = aVar;
            AppBrandRuntime appBrandRuntime = AppBrandRuntime$$n.this.f238186d;
            AppBrandRuntime$$n$a$$a appBrandRuntime$$n$a$$a = new AppBrandRuntime$$n$a$$a(this);
            this.f238187d = appBrandRuntime$$n$a$$a;
            appBrandRuntime.keep(appBrandRuntime$$n$a$$a);
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            C79774c cVar = this.f238188e;
            C79774c.C79775a aVar = this.f238189f;
            cVar.setWindowDescription(new C79774c.C79775a(aVar.f233791a, bitmap, aVar.f233793c));
            AppBrandRuntime$$n.this.f238186d.mo1963B7(this.f238187d);
        }
    }

    public AppBrandRuntime$$n(AppBrandRuntime appBrandRuntime) {
        this.f238186d = appBrandRuntime;
    }

    public void run() {
        C79774c.C79775a aVar;
        C79774c f0 = this.f238186d.mo113054f0();
        if (f0 != null) {
            C81634a F = this.f238186d.mo113008F();
            if (F == null) {
                aVar = new C79774c.C79775a(this.f238186d.mo113036W().f239363e, (Bitmap) null, 0);
            } else {
                int i = -16777216;
                try {
                    i = C88020k.m109562m(F.mo113982a().f239654d);
                } catch (Exception unused) {
                }
                aVar = new C79774c.C79775a(this.f238186d.mo113036W().f239363e, (Bitmap) null, i);
            }
            f0.setWindowDescription(aVar);
            String str = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C81069a(f0, aVar), this.f238186d.mo113036W().f239364f, C88431k.f255437d);
        }
    }
}
