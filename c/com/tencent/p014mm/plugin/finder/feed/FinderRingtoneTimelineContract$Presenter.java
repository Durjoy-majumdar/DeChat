package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import jq3.C33631s;
import jq3.C60905o;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9500j;
import kf1.C10069z8;
import kf1.C9707f;
import kf1.C9854m5;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter */
public final class FinderRingtoneTimelineContract$Presenter extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final boolean f13210t;

    /* renamed from: u */
    public boolean f13211u;

    /* renamed from: v */
    public int f13212v;

    /* renamed from: w */
    public C32226l<? super C60905o, C13598b0> f13213w;

    /* renamed from: x */
    public C32224a<C13598b0> f13214x;

    /* renamed from: y */
    public BaseFinderFeed f13215y;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$a */
    public static final class C2554a implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ FinderRingtoneTimelineContract$Presenter f13216a;

        public C2554a(FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter) {
            this.f13216a = finderRingtoneTimelineContract$Presenter;
        }

        /* renamed from: a */
        public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(rVar, "wxRVData");
            int i = rVar.f173505a;
            if (i == 0 || i == 8) {
                FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.f13216a;
                if (finderRingtoneTimelineContract$Presenter.f13211u) {
                    for (C33631s sVar : rVar.f173510f) {
                        boolean z = sVar.f91020a instanceof BaseFinderFeed;
                    }
                    return;
                }
                finderRingtoneTimelineContract$Presenter.f13211u = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRingtoneTimelineContract$Presenter(MMActivity mMActivity, boolean z) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f13210t = z;
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C9707f fVar = this.f29964g;
        if (fVar instanceof C10069z8) {
            C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.ViewCallback");
            C10069z8 z8Var = (C10069z8) fVar;
        }
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1(this);
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C32224a<C13598b0> aVar = this.f13214x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void requestRefresh() {
        if (this.f13210t || this.f13215y != null) {
            C32224a<C13598b0> aVar = this.f13214x;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        C9707f fVar = this.f29964g;
        WxRecyclerAdapter<?> p = fVar != null ? fVar.mo10312p() : null;
        if (p != null) {
            p.f165737C = new C2554a(this);
        }
    }
}
