package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.r5 */
public final class C73592r5 extends C87413o implements C32227p<C73537m5.C73538a, C73537m5.C73538a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216104d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73592r5(C73537m5 m5Var) {
        super(2);
        this.f216104d = m5Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C73537m5.C73538a aVar = (C73537m5.C73538a) obj2;
        C87412m.m108594g((C73537m5.C73538a) obj, "oldStatus");
        C87412m.m108594g(aVar, "newStatus");
        if (aVar == C73537m5.C73538a.BarStatusEmpty) {
            TranslateControllerView translateControllerView = this.f216104d.f216021j;
            if (translateControllerView != null) {
                Log.m105924i(translateControllerView.f215707e, "showLanguage: ");
                translateControllerView.post(new C73525l5(translateControllerView));
            } else {
                C87412m.m108603p("controllerView");
                throw null;
            }
        } else {
            TranslateControllerView translateControllerView2 = this.f216104d.f216021j;
            if (translateControllerView2 != null) {
                Log.m105924i(translateControllerView2.f215707e, "hideLanguage: ");
                translateControllerView2.post(new C73519k5(translateControllerView2));
            } else {
                C87412m.m108603p("controllerView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
