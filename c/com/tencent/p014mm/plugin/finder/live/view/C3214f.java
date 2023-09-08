package com.tencent.p014mm.plugin.finder.live.view;

import gy3.C87412m;
import te3.C48682a91;
import te3.C52231z81;

/* renamed from: com.tencent.mm.plugin.finder.live.view.f */
public final class C3214f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAfterPluginRecommendLiveView f15332d;

    /* renamed from: e */
    public final /* synthetic */ C48682a91 f15333e;

    public C3214f(FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, C48682a91 a912) {
        this.f15332d = finderLiveAfterPluginRecommendLiveView;
        this.f15333e = a912;
    }

    public final void run() {
        SimpleLivingCardView simpleLivingCardView = this.f15332d.f15204f;
        C52231z81 z812 = this.f15333e.f130381h.get(1);
        C87412m.m108593f(z812, "it.card_list[1]");
        simpleLivingCardView.mo3361c(z812, 1);
    }
}
