package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z1 */
public final class C29809z1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80819d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29809z1(BizTestUI bizTestUI) {
        super(0);
        this.f80819d = bizTestUI;
    }

    public Object invoke() {
        this.f80819d.f80720e.encode("forbidDeleteCanvasFromJS", false);
        return C13598b0.f38549a;
    }
}
