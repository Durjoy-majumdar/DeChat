package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a1 */
public final class C55291a1 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f157491d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55291a1(C55304k kVar) {
        super(2);
        this.f157491d = kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C104682u0.m140311c(this.f157491d, hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
