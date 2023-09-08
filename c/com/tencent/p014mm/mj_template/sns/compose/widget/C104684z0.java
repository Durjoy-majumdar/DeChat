package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p631o1.C109854n0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.z0 */
public final class C104684z0 extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C109854n0> f310850d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104684z0(List<? extends C109854n0> list) {
        super(1);
        this.f310850d = list;
    }

    public Object invoke(Object obj) {
        C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
        C87412m.m108594g(aVar, "$this$layout");
        for (C109854n0 c : this.f310850d) {
            C109854n0.C109855a.m149304c(aVar, c, 0, 0, 0.0f, 4, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
