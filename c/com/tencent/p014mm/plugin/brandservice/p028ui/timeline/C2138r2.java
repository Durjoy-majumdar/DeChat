package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.r2 */
public final class C2138r2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f12108d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2138r2(MultiProcessMMKV multiProcessMMKV) {
        super(0);
        this.f12108d = multiProcessMMKV;
    }

    public Object invoke() {
        this.f12108d.encode("BizTimeLineChannelCanvasOpen", 0);
        return C13598b0.f38549a;
    }
}
