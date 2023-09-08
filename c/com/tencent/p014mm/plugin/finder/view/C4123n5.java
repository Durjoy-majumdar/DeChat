package com.tencent.p014mm.plugin.finder.view;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.n5 */
public final class C4123n5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C4105m5<Object> f18297d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4123n5(C4105m5<Object> m5Var) {
        super(0);
        this.f18297d = m5Var;
    }

    public Object invoke() {
        if (this.f18297d.isShowing()) {
            this.f18297d.dismiss();
        }
        return C13598b0.f38549a;
    }
}
