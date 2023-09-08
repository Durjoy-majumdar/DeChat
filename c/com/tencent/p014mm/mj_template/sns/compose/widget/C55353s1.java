package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.s1 */
public final class C55353s1 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55319n1 f157644d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C55319n1, C13598b0> f157645e;

    /* renamed from: f */
    public final /* synthetic */ int f157646f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55353s1(C55319n1 n1Var, C32226l<? super C55319n1, C13598b0> lVar, int i) {
        super(2);
        this.f157644d = n1Var;
        this.f157645e = lVar;
        this.f157646f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104674o1.m140308h(this.f157644d, this.f157645e, (C108504h) obj, this.f157646f | 1);
        return C13598b0.f38549a;
    }
}
