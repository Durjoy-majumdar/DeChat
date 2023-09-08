package com.tencent.p014mm.sns_compose;

import com.tencent.p014mm.sns_compose.page.C106620k;
import com.tencent.p014mm.sns_compose.page.C57589s;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.sns_compose.a */
public final class C106601a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsWithTaUI f318535d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106601a(SnsWithTaUI snsWithTaUI) {
        super(2);
        this.f318535d = snsWithTaUI;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            SnsWithTaUI snsWithTaUI = this.f318535d;
            int i = SnsWithTaUI.f318528g;
            C57589s sVar = (C57589s) ((C36570n) snsWithTaUI.f318531f).getValue();
            C87412m.m108593f(sVar, "viewModel");
            C106620k.m143966e(sVar, hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
