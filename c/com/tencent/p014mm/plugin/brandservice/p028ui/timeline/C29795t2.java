package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.t2 */
public final class C29795t2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80804d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80805e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29795t2(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80804d = multiProcessMMKV;
        this.f80805e = bizTestUI;
    }

    public Object invoke() {
        this.f80804d.apply();
        BizTestUI.m38863H7(this.f80805e);
        return C13598b0.f38549a;
    }
}
