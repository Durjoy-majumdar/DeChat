package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z */
public final class C29807z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29807z(BizTestUI bizTestUI) {
        super(0);
        this.f80817d = bizTestUI;
    }

    public Object invoke() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        singleMMKV.encode("BizTimeLineUpdateCard", 1);
        singleMMKV.apply();
        BizTestUI.m38863H7(this.f80817d);
        return C13598b0.f38549a;
    }
}
