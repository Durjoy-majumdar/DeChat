package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40709f;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.d0 */
public final class C29733d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80738d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29733d0(BizTestUI bizTestUI) {
        super(0);
        this.f80738d = bizTestUI;
    }

    public Object invoke() {
        C40709f.m43950a();
        C76879j.m92726T(this.f80738d, "clear all cached data");
        return C13598b0.f38549a;
    }
}
