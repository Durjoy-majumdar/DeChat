package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.q0 */
public final class C29788q0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80796d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29788q0(BizTestUI bizTestUI) {
        super(0);
        this.f80796d = bizTestUI;
    }

    public Object invoke() {
        this.f80796d.f80720e.encode("BizTimeLineUserAff", 1);
        this.f80796d.f80720e.apply();
        BizTestUI.m38863H7(this.f80796d);
        return C13598b0.f38549a;
    }
}
