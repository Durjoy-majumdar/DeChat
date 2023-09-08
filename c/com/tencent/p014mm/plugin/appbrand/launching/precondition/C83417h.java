package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83421k;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.h */
public class C83417h implements AppBrandProcessProxyUI.C81940e {

    /* renamed from: a */
    public final /* synthetic */ Runnable f243776a;

    /* renamed from: b */
    public final /* synthetic */ C83421k.C83422a f243777b;

    public C83417h(C83421k.C83422a aVar, Runnable runnable) {
        this.f243777b = aVar;
        this.f243776a = runnable;
    }

    /* renamed from: a */
    public void mo114365a() {
        this.f243776a.run();
    }

    public void cancel() {
        C83421k.this.f243787f.mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
    }
}
