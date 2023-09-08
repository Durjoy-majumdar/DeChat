package com.tencent.p014mm.plugin.finder.gallery;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import jq3.C9500j;
import kf1.C9707f;
import kf1.C9854m5;
import zf1.C16153k;
import zf1.C16154l;
import zf1.C66800f;

/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter */
public final class FinderGalleryTimelineContract$Presenter extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f15001t;

    /* renamed from: u */
    public boolean f15002u;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$a */
    public static final class C3127a implements C60907t {

        /* renamed from: a */
        public final /* synthetic */ FinderGalleryTimelineContract$Presenter f15003a;

        public C3127a(FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter) {
            this.f15003a = finderGalleryTimelineContract$Presenter;
        }

        /* renamed from: a */
        public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(rVar, "wxRVData");
            int i = rVar.f173505a;
            if (i == 0 || i == 8) {
                FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter = this.f15003a;
                if (finderGalleryTimelineContract$Presenter.f15002u) {
                    for (C33631s sVar : rVar.f173510f) {
                        C9493c cVar = sVar.f91020a;
                        if (cVar instanceof BaseFinderFeed) {
                            C66800f.f191913a.mo90796d(cVar.getItemId(), finderGalleryTimelineContract$Presenter.f15001t, -1, "");
                        }
                    }
                    return;
                }
                finderGalleryTimelineContract$Presenter.f15002u = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryTimelineContract$Presenter(MMActivity mMActivity, int i) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f15001t = i;
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C9707f fVar = this.f29964g;
        if (fVar instanceof C16154l) {
            C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract.ViewCallback");
            C16154l lVar = (C16154l) fVar;
            if (cVar.f24951f) {
                RecyclerView recyclerView = lVar.mo10308D().getRecyclerView();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
                if (C < lVar.mo10312p().getData().size()) {
                    recyclerView.post(new C16153k(recyclerView, C));
                }
            }
        }
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderGalleryTimelineContract$Presenter$buildItemCoverts$1(this);
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void requestRefresh() {
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        C9707f fVar = this.f29964g;
        WxRecyclerAdapter<?> p = fVar != null ? fVar.mo10312p() : null;
        if (p != null) {
            p.f165737C = new C3127a(this);
        }
    }
}
