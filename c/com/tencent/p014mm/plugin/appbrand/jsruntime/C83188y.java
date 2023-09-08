package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.appbrand.p942v8.C80666h;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.y */
public class C83188y extends C83139a {
    public C83188y(IJSRuntime.Config config) {
        super(config);
    }

    /* renamed from: v1 */
    public IJSRuntime mo73002v1(IJSRuntime.Config config) {
        boolean z = C80658e.f236022a;
        return new C80662g(config);
    }

    /* renamed from: w1 */
    public C80669j mo115382w1(IJSRuntime iJSRuntime, int i) {
        C80662g gVar = (C80662g) iJSRuntime;
        if (gVar.f236030z == null) {
            gVar.f236030z = new C80669j(gVar, gVar.mo112469c(), new C80666h(gVar));
        }
        return gVar.f236030z;
    }

    public C83188y() {
        super(new IJSRuntime.Config((String) null, (byte[]) null));
    }
}
