package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.c */
public final class C29729c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80734d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29729c(BizTestUI bizTestUI) {
        super(0);
        this.f80734d = bizTestUI;
    }

    public Object invoke() {
        C19428d.f54856a.mo25176k().encode("forceOpenLive", false);
        BizTestUI.m38863H7(this.f80734d);
        return C13598b0.f38549a;
    }
}
