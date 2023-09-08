package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a */
public final class C29724a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80729d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29724a(BizTestUI bizTestUI) {
        super(0);
        this.f80729d = bizTestUI;
    }

    public Object invoke() {
        C19428d.f54856a.mo25168b();
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success!", 1).show();
        BizTestUI bizTestUI = this.f80729d;
        int i = BizTestUI.f80718h;
        bizTestUI.mo56910K7();
        return C13598b0.f38549a;
    }
}
