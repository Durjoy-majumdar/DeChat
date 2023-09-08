package com.tencent.p014mm.plugin.finder.service;

import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60179k4;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.service.b1 */
public final class C56278b1 extends C87413o implements C32229r<String, Integer, Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60179k4.C60180a f160848d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56278b1(C60179k4.C60180a aVar) {
        super(4);
        this.f160848d = aVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        C87412m.m108594g(str, "sessionIdServer");
        this.f160848d.mo83611a(str, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
        return C13598b0.f38549a;
    }
}
