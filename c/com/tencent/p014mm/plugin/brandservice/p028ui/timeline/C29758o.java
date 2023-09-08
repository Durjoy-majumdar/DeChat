package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o */
public final class C29758o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80765d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80766e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29758o(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80765d = multiProcessMMKV;
        this.f80766e = bizTestUI;
    }

    public Object invoke() {
        this.f80765d.encode("BizTimeLineAdTestMode", 2);
        BizTestUI.m38863H7(this.f80766e);
        return C13598b0.f38549a;
    }
}
