package yk0;

import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xk0.C91259a;

/* renamed from: yk0.d */
public final class C91474d implements C82531i.C82535d {

    /* renamed from: d */
    public final /* synthetic */ C82381f f262270d;

    /* renamed from: e */
    public final /* synthetic */ C91469a f262271e;

    /* renamed from: f */
    public final /* synthetic */ C80301a f262272f;

    public C91474d(C82381f fVar, C91469a aVar, C80301a aVar2) {
        this.f262270d = fVar;
        this.f262271e = aVar;
        this.f262272f = aVar2;
    }

    /* renamed from: c */
    public final void mo22090c() {
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "foreground");
        C91259a.C91261b bVar = C91259a.f261849c;
        String appId = ((C83780d1) this.f262270d).getAppId();
        C87412m.m108593f(appId, "component.appId");
        C91259a a = bVar.mo125282a(appId);
        C91469a aVar = this.f262271e;
        C80301a aVar2 = this.f262272f;
        a.mo125280c(aVar.f262250i);
        if (a.mo125281d() == 1) {
            aVar2.mo111506d();
        }
    }
}
