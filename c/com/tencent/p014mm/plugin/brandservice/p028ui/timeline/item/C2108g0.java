package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g0 */
public final class C2108g0 extends C87413o implements C32227p<View, Integer, C13598b0> {

    /* renamed from: d */
    public static final C2108g0 f12074d = new C2108g0();

    public C2108g0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.rightMargin = intValue;
        view.setLayoutParams(layoutParams2);
        return C13598b0.f38549a;
    }
}
