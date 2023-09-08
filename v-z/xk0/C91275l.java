package xk0;

import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xk0.C91259a;

/* renamed from: xk0.l */
public final class C91275l implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f261877d;

    /* renamed from: e */
    public final /* synthetic */ int f261878e;

    /* renamed from: f */
    public final /* synthetic */ C80301a f261879f;

    public C91275l(C83928t1 t1Var, int i, C80301a aVar) {
        this.f261877d = t1Var;
        this.f261878e = i;
        this.f261879f = aVar;
    }

    /* renamed from: b */
    public final void mo22089b() {
        Log.m105924i("JsApiInsertHTMLCanvasElement", "background");
        if (!this.f261877d.getRuntime().mo113064k0()) {
            C91259a.C91261b bVar = C91259a.f261849c;
            String appId = this.f261877d.getAppId();
            C87412m.m108593f(appId, "component.appId");
            C91259a a = bVar.mo125282a(appId);
            a.mo125279b(this.f261878e);
            if (a.mo125281d() == 0) {
                this.f261879f.mo111504c();
            }
        }
    }
}
