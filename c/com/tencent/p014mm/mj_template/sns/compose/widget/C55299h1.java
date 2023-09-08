package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import rx3.C13598b0;
import ya0.C66599g;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.h1 */
public final class C55299h1 extends C87413o implements C32229r<C66599g, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f157507d;

    /* renamed from: e */
    public final /* synthetic */ List<C1288t0> f157508e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55299h1(C55304k kVar, List<C1288t0> list) {
        super(4);
        this.f157507d = kVar;
        this.f157508e = list;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C66599g) obj, "$this$HorizontalPager");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            C55304k kVar = this.f157507d;
            this.f157508e.get(intValue).getClass();
            C104682u0.m140313e(kVar, (List) null, hVar, 72);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
