package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82914r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v1 */
public final class C29544v1 extends C87413o implements C32226l<List<? extends WxaAttributes>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f80443d;

    /* renamed from: e */
    public final /* synthetic */ C83131y1 f80444e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<C81879g> f80445f;

    /* renamed from: g */
    public final /* synthetic */ String f80446g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29544v1(int i, C83131y1 y1Var, WeakReference<C81879g> weakReference, String str) {
        super(1);
        this.f80443d = i;
        this.f80444e = y1Var;
        this.f80445f = weakReference;
        this.f80446g = str;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "list");
        Log.m105924i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80443d + ").onUpdated, list.size:" + list.size());
        if (!this.f80444e.apply(list).booleanValue()) {
            C82914r1.C82916b.f242400i.mo115156a(this.f80445f.get(), list, this.f80446g);
        }
        return C13598b0.f38549a;
    }
}
