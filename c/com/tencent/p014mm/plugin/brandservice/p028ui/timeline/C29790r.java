package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rb0.C48009v0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.r */
public final class C29790r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f80798d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f80799e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29790r(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f80798d = multiProcessMMKV;
        this.f80799e = bizTestUI;
    }

    public Object invoke() {
        this.f80798d.encode("BizLastExposeAdTime", 0);
        C48009v0.vx0().mo57688Lo();
        BizTestUI.m38863H7(this.f80799e);
        return C13598b0.f38549a;
    }
}
