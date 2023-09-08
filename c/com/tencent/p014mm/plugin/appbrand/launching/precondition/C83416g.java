package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83393n3;
import com.tencent.p014mm.plugin.appbrand.launching.C83400o3;
import com.tencent.p014mm.plugin.appbrand.launching.m3$$b;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83421k;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.xwalk.core.XWalkEnvironment;
import p1174c5.C113248f;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.g */
public class C83416g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f243773d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f243774e;

    /* renamed from: f */
    public final /* synthetic */ C83421k.C83422a f243775f;

    public C83416g(C83421k.C83422a aVar, AppBrandInitConfigWC appBrandInitConfigWC, Runnable runnable) {
        this.f243775f = aVar;
        this.f243773d = appBrandInitConfigWC;
        this.f243774e = runnable;
    }

    public void run() {
        C83421k kVar = C83421k.this;
        if (!kVar.f243787f.mo115713i(this.f243773d, kVar.f243785d.f243738o)) {
            this.f243774e.run();
            return;
        }
        C83410a aVar = C83421k.this.f243787f;
        Runnable runnable = this.f243774e;
        aVar.getClass();
        C83412c cVar = new C83412c(aVar);
        C83413d dVar = new C83413d(aVar, runnable);
        Class cls = C87790d.class;
        if (!((C87790d) C86312j.m106911c(cls)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            Log.m105924i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "wait for expansions file");
            C113248f.m155038a(new C83400o3(dVar, ((C87790d) C86312j.m106911c(cls)).nx0(new C83393n3(dVar, cVar)), cVar));
            return;
        }
        dVar.mo115657b((m3$$b) cVar);
    }
}
