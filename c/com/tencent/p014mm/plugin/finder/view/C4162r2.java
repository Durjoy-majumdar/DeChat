package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.view.r2 */
public final class C4162r2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveRecommendView f18395d;

    public C4162r2(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        this.f18395d = finderFeedLiveRecommendView;
    }

    public final void run() {
        View view;
        FinderFeedLiveRecommendView finderFeedLiveRecommendView = this.f18395d;
        RecyclerView.C16631z I0 = finderFeedLiveRecommendView.getRecyclerView().mo17023I0(1);
        if (!(I0 == null || (view = I0.f44854d) == null)) {
            view.getTop();
        }
        finderFeedLiveRecommendView.getClass();
        this.f18395d.mo4538h();
        this.f18395d.f17768t = true;
        Log.m105924i(this.f18395d.f17755d, "[startRecommendTipsAnim] nomal start");
    }
}
