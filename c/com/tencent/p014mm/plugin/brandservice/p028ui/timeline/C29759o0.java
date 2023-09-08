package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o0 */
public final class C29759o0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80767d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29759o0(BizTestUI bizTestUI) {
        super(0);
        this.f80767d = bizTestUI;
    }

    public Object invoke() {
        this.f80767d.f80720e.encode("BizTimeLineOpenFlutter", -1);
        this.f80767d.f80720e.apply();
        BizTestUI.m38863H7(this.f80767d);
        return C13598b0.f38549a;
    }
}
