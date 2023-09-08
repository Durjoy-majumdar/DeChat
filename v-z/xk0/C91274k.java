package xk0;

import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import xk0.C91259a;

/* renamed from: xk0.k */
public final class C91274k implements C82531i.C82535d {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f261874d;

    /* renamed from: e */
    public final /* synthetic */ int f261875e;

    /* renamed from: f */
    public final /* synthetic */ C80301a f261876f;

    public C91274k(C83928t1 t1Var, int i, C80301a aVar) {
        this.f261874d = t1Var;
        this.f261875e = i;
        this.f261876f = aVar;
    }

    /* renamed from: c */
    public final void mo22090c() {
        Log.m105924i("JsApiInsertHTMLCanvasElement", "foreground");
        C91259a.C91261b bVar = C91259a.f261849c;
        String appId = this.f261874d.getAppId();
        C87412m.m108593f(appId, "component.appId");
        C91259a a = bVar.mo125282a(appId);
        a.mo125280c(this.f261875e);
        if (a.mo125281d() == 1) {
            this.f261876f.mo111506d();
        }
    }
}
