package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import wc3.C53143h0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.q */
public final class C44452q extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C44408c f120549d;

    /* renamed from: e */
    public final /* synthetic */ C53143h0 f120550e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44452q(C44408c cVar, C53143h0 h0Var) {
        super(1);
        this.f120549d = cVar;
        this.f120550e = h0Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C44408c.m48768a(this.f120549d, this.f120550e, C44408c.C44427k.STEP_EVAL_MAIN_FRAME);
        return C13598b0.f38549a;
    }
}
