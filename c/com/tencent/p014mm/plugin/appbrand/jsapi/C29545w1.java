package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82914r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.w1 */
public final class C29545w1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f80447d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<C81879g> f80448e;

    /* renamed from: f */
    public final /* synthetic */ String f80449f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29545w1(int i, WeakReference<C81879g> weakReference, String str) {
        super(0);
        this.f80447d = i;
        this.f80448e = weakReference;
        this.f80449f = str;
    }

    public Object invoke() {
        Log.m105924i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f80447d + ").onNoUpdate");
        C82914r1.C82916b.f242400i.mo115156a(this.f80448e.get(), (List<WxaAttributes>) null, this.f80449f);
        return C13598b0.f38549a;
    }
}
