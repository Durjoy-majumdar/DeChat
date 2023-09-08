package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.g0 */
public final class C2101g0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f12065d;

    /* renamed from: e */
    public final /* synthetic */ BizTestUI f12066e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2101g0(MultiProcessMMKV multiProcessMMKV, BizTestUI bizTestUI) {
        super(0);
        this.f12065d = multiProcessMMKV;
        this.f12066e = bizTestUI;
    }

    public Object invoke() {
        this.f12065d.putBoolean("preload_tmpl_test_noredir", true);
        C76879j.m92726T(this.f12066e, "disable re-direct");
        return C13598b0.f38549a;
    }
}
