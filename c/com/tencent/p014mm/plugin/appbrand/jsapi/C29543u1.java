package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u1 */
public final class C29543u1 extends C87413o implements C32226l<List<? extends WxaAttributes>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f80441d;

    /* renamed from: e */
    public final /* synthetic */ C83131y1 f80442e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29543u1(int i, C83131y1 y1Var) {
        super(1);
        this.f80441d = i;
        this.f80442e = y1Var;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "list");
        Log.m105924i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80441d + ").onLoaded, list.size:" + list.size());
        this.f80442e.apply(list);
        return C13598b0.f38549a;
    }
}
