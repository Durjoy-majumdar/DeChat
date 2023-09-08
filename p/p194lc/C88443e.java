package p194lc;

import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.IBootstrapDoneCallback;
import com.tencent.skyline.SkylineRuntime;
import p284zb.C91635f;

/* renamed from: lc.e */
public final class C88443e implements IBootstrapDoneCallback {

    /* renamed from: a */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255459a;

    /* renamed from: b */
    public final /* synthetic */ C91635f f255460b;

    /* renamed from: c */
    public final /* synthetic */ int f255461c;

    /* renamed from: d */
    public final /* synthetic */ C83181q f255462d;

    /* renamed from: e */
    public final /* synthetic */ SkylineRuntime f255463e;

    /* renamed from: lc.e$a */
    public static final class C88444a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppServiceSkylineExtensionImpl f255464d;

        /* renamed from: e */
        public final /* synthetic */ SkylineRuntime f255465e;

        public C88444a(AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, SkylineRuntime skylineRuntime) {
            this.f255464d = appServiceSkylineExtensionImpl;
            this.f255465e = skylineRuntime;
        }

        public final void run() {
            AppServiceSkylineExtensionImpl.m97721g(this.f255464d, this.f255465e);
        }
    }

    public C88443e(AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, C91635f fVar, int i, C83181q qVar, SkylineRuntime skylineRuntime) {
        this.f255459a = appServiceSkylineExtensionImpl;
        this.f255460b = fVar;
        this.f255461c = i;
        this.f255462d = qVar;
        this.f255463e = skylineRuntime;
    }

    public void onDone() {
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f255459a;
        C91635f fVar = this.f255460b;
        appServiceSkylineExtensionImpl.mo111458h(fVar, false);
        if (!appServiceSkylineExtensionImpl.f235035l) {
            appServiceSkylineExtensionImpl.mo111459i(new C88449i(fVar));
            appServiceSkylineExtensionImpl.f235035l = true;
        }
        Log.m105924i("AppServiceSkylineExtensionImpl", "SkylineGlobalReady " + this.f255461c);
        this.f255459a.f235029f = true;
        if (this.f255459a.f235030g) {
            this.f255462d.mo115423q0(new C88444a(this.f255459a, this.f255463e));
        }
    }
}
