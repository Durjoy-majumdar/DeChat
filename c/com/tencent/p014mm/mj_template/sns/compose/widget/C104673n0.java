package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.n0 */
public final class C104673n0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f310827d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f310828e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f310829f;

    /* renamed from: g */
    public final /* synthetic */ int f310830g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104673n0(String str, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, int i) {
        super(2);
        this.f310827d = str;
        this.f310828e = aVar;
        this.f310829f = aVar2;
        this.f310830g = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104671n.m140299h(this.f310827d, this.f310828e, this.f310829f, (C108504h) obj, this.f310830g | 1);
        return C13598b0.f38549a;
    }
}
