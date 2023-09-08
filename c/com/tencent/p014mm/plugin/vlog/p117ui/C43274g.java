package com.tencent.p014mm.plugin.vlog.p117ui;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.ui.g */
public final class C43274g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiVideoFullScreenPluginLayout f117094d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43274g(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        super(0);
        this.f117094d = multiVideoFullScreenPluginLayout;
    }

    public Object invoke() {
        C76701a.makeText(this.f117094d.getContext(), (int) C0966R.string.k_u, 0).show();
        return C13598b0.f38549a;
    }
}
