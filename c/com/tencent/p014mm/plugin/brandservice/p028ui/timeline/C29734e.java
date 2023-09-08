package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import p910lj.C76701a;
import rx3.C13598b0;
import te3.mg4;
import te3.pg4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.e */
public final class C29734e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80739d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29734e(BizTestUI bizTestUI) {
        super(0);
        this.f80739d = bizTestUI;
    }

    public Object invoke() {
        LinkedList<pg4> linkedList;
        C19428d dVar = C19428d.f54856a;
        dVar.mo25168b();
        mg4 a = C29763t.m38870a();
        if (!(a == null || (linkedList = a.f184323d) == null)) {
            dVar.mo25148A(linkedList);
        }
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success!", 1).show();
        BizTestUI bizTestUI = this.f80739d;
        int i = BizTestUI.f80718h;
        bizTestUI.mo56910K7();
        return C13598b0.f38549a;
    }
}
