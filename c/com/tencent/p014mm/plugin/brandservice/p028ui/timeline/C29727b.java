package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.b */
public final class C29727b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80732d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29727b(BizTestUI bizTestUI) {
        super(0);
        this.f80732d = bizTestUI;
    }

    public Object invoke() {
        C19428d.f54856a.mo25176k().encode("forceOpenLive", true);
        BizTestUI.m38863H7(this.f80732d);
        return C13598b0.f38549a;
    }
}
