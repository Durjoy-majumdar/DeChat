package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g3 */
public final class C83327g3 {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f243500a;

    /* renamed from: b */
    public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallArgs f243501b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference<ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult> f243502c;

    public C83327g3(AtomicBoolean atomicBoolean, ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallArgs iPCCallArgs, AtomicReference<ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult> atomicReference) {
        this.f243500a = atomicBoolean;
        this.f243501b = iPCCallArgs;
        this.f243502c = atomicReference;
    }

    /* renamed from: a */
    public final void mo115616a(ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult iPCCallResult) {
        C87412m.m108594g(iPCCallResult, "callbackResult");
        if (1 == iPCCallResult.f243374d) {
            C80242c<ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult> cVar = this.f243501b.f243373s;
            if (cVar != null) {
                cVar.mo111345a(iPCCallResult);
                return;
            }
            return;
        }
        boolean z = this.f243500a.get();
        Log.m105924i("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallTask", "onCallback instance:" + this.f243501b.f243371q.f245832d + " appId:" + this.f243501b.f243361d + " module:" + this.f243501b.f243362e + " isCallStackCompleted:" + z);
        if (!z) {
            this.f243502c.set(iPCCallResult);
        } else {
            C80242c<ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult> cVar2 = this.f243501b.f243373s;
            if (cVar2 != null) {
                cVar2.mo111345a(iPCCallResult);
            }
        }
        this.f243501b.f243369o.close();
    }
}
