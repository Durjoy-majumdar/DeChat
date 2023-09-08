package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p */
public final class C29764p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80773d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80774e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29764p(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80773d = multiProcessMMKV;
        this.f80774e = bizTestUI;
    }

    public Object invoke() {
        this.f80773d.encode("BizTimeLineAdTestMode", 1);
        this.f80773d.encode("BizTimeLineAdMockType", 0);
        BizTestUI.m38863H7(this.f80774e);
        return C13598b0.f38549a;
    }
}
