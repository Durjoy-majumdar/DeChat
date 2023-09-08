package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import com.tencent.luggage.sdk.processes.C80264l;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import kr0.C76630x0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$b */
public class e$$b implements C32226l<C80264l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f240033d;

    /* renamed from: e */
    public final /* synthetic */ Context f240034e;

    public e$$b(C81810e eVar, boolean[] zArr, Context context) {
        this.f240033d = zArr;
        this.f240034e = context;
    }

    public Object invoke(Object obj) {
        C80264l lVar = (C80264l) obj;
        boolean[] zArr = this.f240033d;
        if (zArr[0]) {
            return C13598b0.f38549a;
        }
        zArr[0] = true;
        C86299o oVar = new C86299o();
        oVar.f250930b = lVar.f234965a;
        oVar.f250931c = lVar.f234966b;
        oVar.f250939k = 1030;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f240034e, oVar);
        return C13598b0.f38549a;
    }
}
