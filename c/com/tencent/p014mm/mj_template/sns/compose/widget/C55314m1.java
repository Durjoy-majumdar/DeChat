package com.tencent.p014mm.mj_template.sns.compose.widget;

import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.m1 */
public final class C55314m1 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f157536d;

    /* renamed from: e */
    public final /* synthetic */ List<C55319n1.C55323d> f157537e;

    /* renamed from: f */
    public final /* synthetic */ int f157538f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55314m1(C55304k kVar, List<C55319n1.C55323d> list, int i) {
        super(2);
        this.f157536d = kVar;
        this.f157537e = list;
        this.f157538f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C104682u0.m140313e(this.f157536d, this.f157537e, (C108504h) obj, this.f157538f | 1);
        return C13598b0.f38549a;
    }
}
