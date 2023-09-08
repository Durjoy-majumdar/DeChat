package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.h2 */
public final class C29739h2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80745d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29739h2(BizTestUI bizTestUI) {
        super(0);
        this.f80745d = bizTestUI;
    }

    public Object invoke() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__webview_command");
        mmkv.encode("ImmersiveStyleFromUrl", false);
        mmkv.apply();
        BizTestUI.m38863H7(this.f80745d);
        return C13598b0.f38549a;
    }
}
