package com.tencent.p014mm.plugin.finder.live.view;

import gy3.C87412m;
import te3.C48682a91;
import te3.C52231z81;

/* renamed from: com.tencent.mm.plugin.finder.live.view.e */
public final class C3211e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAfterPluginRecommendLiveView f15326d;

    /* renamed from: e */
    public final /* synthetic */ C48682a91 f15327e;

    public C3211e(FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, C48682a91 a912) {
        this.f15326d = finderLiveAfterPluginRecommendLiveView;
        this.f15327e = a912;
    }

    public final void run() {
        SimpleLivingCardView simpleLivingCardView = this.f15326d.f15203e;
        C52231z81 z812 = this.f15327e.f130381h.get(0);
        C87412m.m108593f(z812, "it.card_list[0]");
        simpleLivingCardView.mo3361c(z812, 0);
    }
}
