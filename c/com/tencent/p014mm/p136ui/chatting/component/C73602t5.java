package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.t5 */
public final class C73602t5 extends C87413o implements C32227p<C73537m5.C73538a, C73537m5.C73538a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216136d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73602t5(C73537m5 m5Var) {
        super(2);
        this.f216136d = m5Var;
    }

    public Object invoke(Object obj, Object obj2) {
        int i;
        C73537m5.C73538a aVar = (C73537m5.C73538a) obj2;
        C87412m.m108594g((C73537m5.C73538a) obj, "oldStatus");
        C87412m.m108594g(aVar, "newStatus");
        LoadableTextView loadableTextView = this.f216136d.f216022n;
        if (loadableTextView != null) {
            if (aVar == C73537m5.C73538a.BarStatusEmpty) {
                loadableTextView.setText("");
                i = 4;
            } else {
                i = 0;
            }
            loadableTextView.setVisibility(i);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("resultTv");
        throw null;
    }
}
