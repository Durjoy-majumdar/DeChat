package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.n0 */
public final class C55583n0 extends C87413o implements C32230s<View, Integer, Integer, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public static final C55583n0 f158253d = new C55583n0();

    public C55583n0() {
        super(5);
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        int intValue3 = ((Number) obj4).intValue();
        int intValue4 = ((Number) obj5).intValue();
        C87412m.m108594g(view, "view");
        view.setPadding(intValue, intValue2, intValue3, intValue4);
        return C13598b0.f38549a;
    }
}
