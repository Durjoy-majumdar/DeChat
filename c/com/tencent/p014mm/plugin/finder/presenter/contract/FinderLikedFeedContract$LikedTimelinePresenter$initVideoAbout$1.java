package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$initVideoAbout$1", "Lcom/tencent/mm/plugin/finder/video/FinderVideoCore$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$initVideoAbout$1 */
public final class FinderLikedFeedContract$LikedTimelinePresenter$initVideoAbout$1 implements FinderVideoCore.C56519a {

    /* renamed from: a */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16034a;

    public FinderLikedFeedContract$LikedTimelinePresenter$initVideoAbout$1(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        this.f16034a = likedTimelinePresenter;
    }

    /* renamed from: a */
    public boolean mo3742a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo3743b() {
        return true;
    }

    /* renamed from: c */
    public RecyclerView mo3744c() {
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16034a.f15984p;
        C87412m.m108591d(likedTimelineViewCallback);
        return likedTimelineViewCallback.getRecyclerView();
    }

    public DataBuffer<C0740i2> getData() {
        return this.f16034a.f15978g.getDataList();
    }
}
