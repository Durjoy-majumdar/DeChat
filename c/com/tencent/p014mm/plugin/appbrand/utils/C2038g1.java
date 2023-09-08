package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import lb0.C88394b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.g1 */
public final class C2038g1 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2040h1 f11986d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2038g1(C2040h1 h1Var) {
        super(1);
        this.f11986d = h1Var;
    }

    public Object invoke(Object obj) {
        Log.m105924i("MicroMsg.AppBrand.IconAttacher", "onCancel#loadIcon, tr: " + ((Throwable) obj));
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122789e(this.f11986d);
        return C13598b0.f38549a;
    }
}
