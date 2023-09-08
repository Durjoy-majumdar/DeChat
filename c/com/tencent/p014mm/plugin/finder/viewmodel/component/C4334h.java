package com.tencent.p014mm.plugin.finder.viewmodel.component;

import as1.C0201a;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.h */
public final class C4334h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDrawerUIC f18814d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4334h(FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(0);
        this.f18814d = finderProfileDrawerUIC;
    }

    public Object invoke() {
        C0201a aVar = this.f18814d.f18766f;
        if (aVar != null) {
            FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
