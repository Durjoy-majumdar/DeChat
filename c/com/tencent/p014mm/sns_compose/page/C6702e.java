package com.tencent.p014mm.sns_compose.page;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.sns_compose.page.e */
public final class C6702e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<String, C13598b0> f24104d;

    /* renamed from: e */
    public final /* synthetic */ List<C101804kv2> f24105e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6702e(C32226l<? super String, C13598b0> lVar, List<? extends C101804kv2> list) {
        super(0);
        this.f24104d = lVar;
        this.f24105e = list;
    }

    public Object invoke() {
        C32226l<String, C13598b0> lVar = this.f24104d;
        String str = this.f24105e.get(2).f298689d;
        C87412m.m108593f(str, "mediaList[2].Id");
        lVar.invoke(str);
        return C13598b0.f38549a;
    }
}
