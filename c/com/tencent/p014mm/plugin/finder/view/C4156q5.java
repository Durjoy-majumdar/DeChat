package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.plugin.finder.feed.flow.FlowLayoutManager;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.q5 */
public final class C4156q5 implements FlowLayoutManager.C2643e {

    /* renamed from: a */
    public final /* synthetic */ FinderWordingLayout f18380a;

    public C4156q5(FinderWordingLayout finderWordingLayout) {
        this.f18380a = finderWordingLayout;
    }

    /* renamed from: a */
    public final void mo2659a(int i) {
        C32224a<C13598b0> sizeChangeListener = this.f18380a.getSizeChangeListener();
        if (sizeChangeListener != null) {
            sizeChangeListener.invoke();
        }
    }
}
