package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p0 */
public final class C29765p0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80775d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29765p0(BizTestUI bizTestUI) {
        super(0);
        this.f80775d = bizTestUI;
    }

    public Object invoke() {
        this.f80775d.f80720e.encode("BizTimeLineOpenFlutter", 0);
        this.f80775d.f80720e.apply();
        BizTestUI.m38863H7(this.f80775d);
        return C13598b0.f38549a;
    }
}
