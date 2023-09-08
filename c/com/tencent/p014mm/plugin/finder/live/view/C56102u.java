package com.tencent.p014mm.plugin.finder.live.view;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.u */
public final class C56102u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159967d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56102u(C56081l lVar) {
        super(0);
        this.f159967d = lVar;
    }

    public Object invoke() {
        this.f159967d.f159918A.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
