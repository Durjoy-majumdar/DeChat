package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import p175j0.C60667k2;
import rx3.C13598b0;
import te3.o74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y */
public final class C55364y extends C87413o implements C32230s<C103941f, Integer, C28971l<o74>, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ float f157660d;

    /* renamed from: e */
    public final /* synthetic */ C55341p0 f157661e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C28971l<o74>> f157662f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55364y(float f, C55341p0 p0Var, C60667k2<C28971l<o74>> k2Var) {
        super(5);
        this.f157660d = f;
        this.f157661e = p0Var;
        this.f157662f = k2Var;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj2).intValue();
        C28971l lVar = (C28971l) obj3;
        C108504h hVar = (C108504h) obj4;
        ((Number) obj5).intValue();
        C87412m.m108594g((C103941f) obj, "$this$itemsIndexed");
        if (lVar != null) {
            float f = this.f157660d;
            C55341p0 p0Var = this.f157661e;
            C60667k2<C28971l<o74>> k2Var = this.f157662f;
            o74 o74 = (o74) lVar.f79451a;
            String str = o74.f139009g;
            if (str == null) {
                str = "";
            }
            String str2 = o74.f139010h;
            if (str2 == null) {
                str2 = "";
            }
            C104671n.m140296e(f, str, str2, new C40341w(o74), C87412m.m108589b(((o74) k2Var.getValue().f79451a).f139006d, o74.f139006d), p0Var.f157608o, new C55361x(p0Var, lVar), hVar, 0, 0);
        }
        return C13598b0.f38549a;
    }
}
