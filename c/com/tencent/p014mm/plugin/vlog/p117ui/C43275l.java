package com.tencent.p014mm.plugin.vlog.p117ui;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.ui.l */
public final class C43275l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiVideoPluginLayout f117095d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43275l(MultiVideoPluginLayout multiVideoPluginLayout) {
        super(0);
        this.f117095d = multiVideoPluginLayout;
    }

    public Object invoke() {
        C76701a.makeText(this.f117095d.getContext(), (int) C0966R.string.k_u, 0).show();
        return C13598b0.f38549a;
    }
}
