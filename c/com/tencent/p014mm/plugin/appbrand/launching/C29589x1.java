package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Set;
import rx3.C13598b0;
import te3.C90415hz1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.x1 */
public final class C29589x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HashMap<C83397o1.C83398a, C90415hz1[]> f80516d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29589x1(HashMap<C83397o1.C83398a, C90415hz1[]> hashMap) {
        super(0);
        this.f80516d = hashMap;
    }

    public Object invoke() {
        Set<C83397o1.C83398a> keySet = this.f80516d.keySet();
        C87412m.m108593f(keySet, "map.keys");
        for (C83397o1.C83398a aVar : keySet) {
            C83344j1 j1Var = C83344j1.f243546a;
            C87412m.m108593f(aVar, "key");
            j1Var.getClass();
            Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "removePreGetDownloadUrlResult " + aVar);
            C83344j1.f243547b.remove(aVar);
        }
        return C13598b0.f38549a;
    }
}
