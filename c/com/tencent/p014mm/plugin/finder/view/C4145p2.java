package com.tencent.p014mm.plugin.finder.view;

import android.animation.ObjectAnimator;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.p2 */
public final class C4145p2 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveRecommendView f18369d;

    public C4145p2(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        this.f18369d = finderFeedLiveRecommendView;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        FinderFeedLiveRecommendView finderFeedLiveRecommendView = this.f18369d;
        int i = FinderFeedLiveRecommendView.f17754A;
        finderFeedLiveRecommendView.getRecyclerView().setVisibility(4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(finderFeedLiveRecommendView.getEntryBg(), "alpha", new float[]{0.0f, 1.0f});
        C87412m.m108593f(ofFloat, "ofFloat(entryBg, \"alpha\", 0f, 1f)");
        ofFloat.setDuration(1000);
        ofFloat.start();
        finderFeedLiveRecommendView.f17769u = true;
        finderFeedLiveRecommendView.mo4530g(true, -1, "");
        return true;
    }
}
