package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.q */
public final class C29787q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80794d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80795e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29787q(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80794d = multiProcessMMKV;
        this.f80795e = bizTestUI;
    }

    public Object invoke() {
        this.f80794d.encode("BizTimeLineAdTestMode", 1);
        this.f80794d.encode("BizTimeLineAdMockType", 1);
        BizTestUI.m38863H7(this.f80795e);
        return C13598b0.f38549a;
    }
}
