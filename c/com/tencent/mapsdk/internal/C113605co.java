package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.http.HttpProxyRule;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.co */
public final class C113605co implements C113604cn {

    /* renamed from: a */
    public boolean f339999a;

    /* renamed from: b */
    public List<HttpProxyRule> f340000b;

    /* renamed from: a */
    private void m156528a(boolean z) {
        this.f339999a = z;
    }

    /* renamed from: b */
    public final List<HttpProxyRule> mo171940b() {
        return this.f340000b;
    }

    /* renamed from: a */
    private void m156527a(List<HttpProxyRule> list) {
        this.f340000b = list;
    }

    /* renamed from: a */
    private void m156526a(C113603cm cmVar) {
        this.f339999a = cmVar.f339997a;
        this.f340000b = cmVar.f339998b;
    }

    /* renamed from: a */
    public final boolean mo171939a() {
        return this.f339999a;
    }
}
