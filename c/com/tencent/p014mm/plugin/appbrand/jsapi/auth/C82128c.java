package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import java.util.HashMap;
import li0.C88508b;
import li0.C88509c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.c */
public final class C82128c implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f240906d;

    public C82128c(AppBrandRuntime appBrandRuntime) {
        this.f240906d = appBrandRuntime;
    }

    /* renamed from: b */
    public final void mo113102b(String str, C88508b bVar) {
        if (bVar == C88508b.DESTROYED) {
            HashMap<String, C82124b> hashMap = C82124b.f240897g;
            AppBrandRuntime appBrandRuntime = this.f240906d;
            synchronized (hashMap) {
                C82124b remove = hashMap.remove(appBrandRuntime.f238147j);
                if (remove != null) {
                    remove.f247102e.clear();
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
    }
}
