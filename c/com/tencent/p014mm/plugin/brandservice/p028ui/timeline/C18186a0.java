package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import p007bo.C16813m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a0 */
public final class C18186a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f50263d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18186a0(BizTestUI bizTestUI) {
        super(0);
        this.f50263d = bizTestUI;
    }

    public Object invoke() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        singleMMKV.encode("BizTimeLineReSortMsgCheck", 0);
        singleMMKV.apply();
        C16813m.f45424a.mo17857c().ignoreResortNextReqTimeCheck(1);
        BizTestUI.m38863H7(this.f50263d);
        return C13598b0.f38549a;
    }
}
