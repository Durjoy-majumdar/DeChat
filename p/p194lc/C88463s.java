package p194lc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.m0$$y;
import com.tencent.skyline.SkylineRuntime;
import gy3.C87412m;
import p284zb.C91635f;
import p963fc.C86812g;

/* renamed from: lc.s */
public final class C88463s implements m0$$y {

    /* renamed from: a */
    public final m0$$y f255535a;

    /* renamed from: b */
    public final C86812g f255536b;

    /* renamed from: lc.s$a */
    public static final class C88464a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88463s f255537d;

        /* renamed from: lc.s$a$a */
        public static final class C88465a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C88463s f255538d;

            public C88465a(C88463s sVar) {
                this.f255538d = sVar;
            }

            public final void run() {
                this.f255538d.f255535a.proceed();
            }
        }

        public C88464a(C88463s sVar) {
            this.f255537d = sVar;
        }

        public final void run() {
            C88463s sVar = this.f255537d;
            sVar.f255536b.mo113024P0(new C88465a(sVar));
        }
    }

    public C88463s(m0$$y m0__y, C86812g gVar) {
        C87412m.m108594g(m0__y, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(gVar, "runtime");
        this.f255535a = m0__y;
        this.f255536b = gVar;
    }

    /* renamed from: c */
    public void mo116241c(String str, Object obj) {
        this.f255535a.mo116241c(str, obj);
    }

    public void cancel() {
        this.f255535a.cancel();
    }

    public void proceed() {
        C81925i2 b0 = this.f255536b.mo113047b0();
        C87412m.m108592e(b0, "null cannot be cast to non-null type com.tencent.luggage.sdk.jsapi.component.service.AppBrandServiceLU");
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (AppServiceSkylineExtensionImpl) ((C91635f) b0).mo125517G0(AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl == null) {
            this.f255535a.proceed();
            return;
        }
        C88464a aVar = new C88464a(this);
        SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f235027d;
        C87412m.m108591d(skylineRuntime);
        skylineRuntime.waitForBootstrap(new C88451k(aVar));
    }

    public void setAnimationEnabled(boolean z) {
        this.f255535a.setAnimationEnabled(z);
    }
}
