package yk0;

import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xk0.C91259a;

/* renamed from: yk0.e */
public final class C91475e implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C82381f f262273d;

    /* renamed from: e */
    public final /* synthetic */ C91469a f262274e;

    /* renamed from: f */
    public final /* synthetic */ C80301a f262275f;

    public C91475e(C82381f fVar, C91469a aVar, C80301a aVar2) {
        this.f262273d = fVar;
        this.f262274e = aVar;
        this.f262275f = aVar2;
    }

    /* renamed from: b */
    public final void mo22089b() {
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "background");
        if (!((C83780d1) this.f262273d).getRuntime().mo113064k0()) {
            C91259a.C91261b bVar = C91259a.f261849c;
            String appId = ((C83780d1) this.f262273d).getAppId();
            C87412m.m108593f(appId, "component.appId");
            C91259a a = bVar.mo125282a(appId);
            C91469a aVar = this.f262274e;
            C80301a aVar2 = this.f262275f;
            a.mo125279b(aVar.f262250i);
            if (a.mo125281d() == 0) {
                aVar2.mo111504c();
            }
        }
    }
}
