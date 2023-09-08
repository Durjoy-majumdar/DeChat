package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.i0 */
public final class C2106i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f12072d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2106i0(BizTestUI bizTestUI) {
        super(0);
        this.f12072d = bizTestUI;
    }

    public Object invoke() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_web_prefetcher_test_info");
        C87412m.m108593f(mmkv, "getMMKV(ConstantsPreload…BVIEW_PREFETCH_TEST_INFO)");
        mmkv.clearAll();
        C76879j.m92726T(this.f12072d, "clear prefetch report kv");
        return C13598b0.f38549a;
    }
}
