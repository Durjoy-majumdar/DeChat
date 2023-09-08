package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import xi0.C38728b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.u */
public final class C29291u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<String> f79992d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29291u(List<String> list) {
        super(0);
        this.f79992d = list;
    }

    public Object invoke() {
        C38728b bVar = (C38728b) C81161g2.Bx0(C38728b.class);
        if (bVar != null) {
            List<String> list = this.f79992d;
            C87412m.m108593f(list, "updatedList");
            bVar.mo61740jo(list);
        }
        return C13598b0.f38549a;
    }
}
