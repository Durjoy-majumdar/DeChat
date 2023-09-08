package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.o */
public final class C55326o extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f157567d;

    /* renamed from: e */
    public final /* synthetic */ int f157568e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55326o(String str, int i) {
        super(2);
        this.f157567d = str;
        this.f157568e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104671n.m140294c(this.f157567d, (C108504h) obj, this.f157568e | 1);
        return C13598b0.f38549a;
    }
}
