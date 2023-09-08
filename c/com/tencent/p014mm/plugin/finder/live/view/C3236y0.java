package com.tencent.p014mm.plugin.finder.live.view;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49098d51;

/* renamed from: com.tencent.mm.plugin.finder.live.view.y0 */
public final class C3236y0 extends C87413o implements C32226l<C49098d51, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15364d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3236y0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        super(1);
        this.f15364d = finderLiveMultiNoticeView;
    }

    public Object invoke(Object obj) {
        C49098d51 d512 = (C49098d51) obj;
        C87412m.m108594g(d512, "noticeInfo");
        C32226l<? super C49098d51, C13598b0> lVar = this.f15364d.f15292o;
        if (lVar != null) {
            lVar.invoke(d512);
        }
        this.f15364d.mo3333e();
        return C13598b0.f38549a;
    }
}
