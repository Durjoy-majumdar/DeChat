package com.tencent.p014mm.plugin.finder.video;

import ac3.C103355g1;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;
import sh2.C110790c;

/* renamed from: com.tencent.mm.plugin.finder.video.f */
public final class C105307f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110790c f312885d;

    /* renamed from: e */
    public final /* synthetic */ FinderRecordPluginLayout f312886e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105307f(C110790c cVar, FinderRecordPluginLayout finderRecordPluginLayout) {
        super(0);
        this.f312885d = cVar;
        this.f312886e = finderRecordPluginLayout;
    }

    public Object invoke() {
        C103355g1 g1Var = this.f312885d.f331427v;
        if (C87412m.m108589b(g1Var != null ? Boolean.valueOf(g1Var.f304801u) : null, Boolean.FALSE)) {
            C76701a.makeText(this.f312886e.f312852h.getContext(), (int) C0966R.string.huq, 0).show();
        }
        return C13598b0.f38549a;
    }
}
