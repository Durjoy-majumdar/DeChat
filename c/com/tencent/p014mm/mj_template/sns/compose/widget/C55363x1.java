package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C103941f;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.x1 */
public final class C55363x1 extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C55319n1> f157658d;

    /* renamed from: e */
    public final /* synthetic */ C55366y1 f157659e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55363x1(List<? extends C55319n1> list, C55366y1 y1Var) {
        super(4);
        this.f157658d = list;
        this.f157659e = y1Var;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C103941f) obj, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            C104674o1.m140308h(this.f157658d.get(intValue), new C55360w1(this.f157659e), hVar, 0);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
