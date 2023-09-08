package com.tencent.p014mm.plugin.finder.p056ui;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.l1 */
public final class C3855l1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePostHelperUI f17394d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3855l1(FinderLivePostHelperUI finderLivePostHelperUI) {
        super(1);
        this.f17394d = finderLivePostHelperUI;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        this.f17394d.setResult(-1);
        FinderLivePostHelperUI finderLivePostHelperUI = this.f17394d;
        finderLivePostHelperUI.finish();
        finderLivePostHelperUI.overridePendingTransition(0, 0);
        return C13598b0.f38549a;
    }
}
