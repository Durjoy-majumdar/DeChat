package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.w */
public final class C83509w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<ICommLibReader, C13598b0> f243989d;

    /* renamed from: e */
    public final /* synthetic */ C83499v.C83502c f243990e;

    /* renamed from: f */
    public final /* synthetic */ long f243991f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83509w(C32226l<? super ICommLibReader, C13598b0> lVar, C83499v.C83502c cVar, long j) {
        super(0);
        this.f243989d = lVar;
        this.f243990e = cVar;
        this.f243991f = j;
    }

    public Object invoke() {
        WxaCommLibRuntimeReader.m99501e();
        this.f243989d.invoke(WxaCommLibRuntimeReader.m99498b());
        Log.m105924i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + this.f243990e.hashCode() + ") WxaCommLibRuntimeReader.loadOrFallback cost[" + (Util.currentTicks() - this.f243991f) + ']');
        return C13598b0.f38549a;
    }
}
