package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.i1 */
public final class C55301i1 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f157510d;

    /* renamed from: e */
    public final /* synthetic */ int f157511e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55301i1(C55304k kVar, int i) {
        super(2);
        this.f157510d = kVar;
        this.f157511e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104682u0.m140312d(this.f157510d, (C108504h) obj, this.f157511e | 1);
        return C13598b0.f38549a;
    }
}
