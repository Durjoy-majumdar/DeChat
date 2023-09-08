package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.g */
public final class C29736g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29736g(BizTestUI bizTestUI) {
        super(0);
        this.f80742d = bizTestUI;
    }

    public Object invoke() {
        C19428d dVar = C19428d.f54856a;
        boolean z = !dVar.mo25176k().decodeBool("showLiveBarWhenExpose", false);
        dVar.mo25176k().encode("showLiveBarWhenExpose", z);
        dVar.mo25168b();
        BizTestUI bizTestUI = this.f80742d;
        int i = BizTestUI.f80718h;
        bizTestUI.mo56910K7();
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success! ShowLiveBarAfterExpose=" + z + '.', 1).show();
        return C13598b0.f38549a;
    }
}
