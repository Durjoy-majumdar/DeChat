package com.tencent.p014mm.plugin.card.p031ui.p034v4;

import android.view.View;
import android.widget.TextView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.card.ui.v4.b */
public final class C2181b extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StringBuilder f12154d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2181b(StringBuilder sb) {
        super(1);
        this.f12154d = sb;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, "labelView");
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.isShown()) {
                this.f12154d.append(textView.getText());
            }
        }
        return C13598b0.f38549a;
    }
}
