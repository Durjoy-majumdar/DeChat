package p194lc;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineRuntime;
import gy3.C87412m;
import p176jc.C87919d;
import p774zg.C91717i0;

/* renamed from: lc.g */
public final class C88446g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f255467d;

    /* renamed from: e */
    public final /* synthetic */ C83165i f255468e;

    /* renamed from: f */
    public final /* synthetic */ SkylineRuntime f255469f;

    /* renamed from: g */
    public final /* synthetic */ C83187w f255470g;

    public C88446g(int i, C83165i iVar, SkylineRuntime skylineRuntime, C83187w wVar) {
        this.f255467d = i;
        this.f255468e = iVar;
        this.f255469f = skylineRuntime;
        this.f255470g = wVar;
    }

    public final void run() {
        Log.m105924i("AppServiceSkylineExtensionImpl", "initJSEngine on JsThread " + this.f255467d);
        C87919d.f254457a.getClass();
        if (C87919d.f254461e) {
            C83165i iVar = this.f255468e;
            if (iVar instanceof C83188y) {
                C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsruntime.AppBrandNodeJSBasedJsEngine");
                C80669j jVar = ((C83188y) iVar).f242939g;
                if (jVar != null) {
                    C91717i0 i0Var = new C91717i0();
                    i0Var.f262725e = true;
                    i0Var.mo125557b(jVar);
                }
            }
        }
        this.f255469f.initJSEngine(this.f255470g.mo115417m(), this.f255470g.mo115393J0(), this.f255470g.mo115414j());
    }
}
