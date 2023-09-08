package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rs1.C63575n3;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1", "Ltf1/l;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1 */
public final class C3391xa3330be5 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f15996a;

    /* renamed from: b */
    public final /* synthetic */ FinderInteractionSearchFeedLoader f15997b;

    public C3391xa3330be5(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader) {
        this.f15996a = likedTimelinePresenter;
        this.f15997b = finderInteractionSearchFeedLoader;
    }

    public void call(int i) {
        RecyclerView.LayoutManager layoutManager;
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f15996a.f15984p;
        if (!(likedTimelineViewCallback == null || (layoutManager = likedTimelineViewCallback.getRecyclerView().getLayoutManager()) == null)) {
            FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
            int initPos = this.f15997b.getInitPos();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(initPos));
            C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f15996a.f15984p;
        if (likedTimelineViewCallback2 != null) {
            ((C63575n3) C39818r.f106831a.mo62444c(this.f15996a.f15975d).mo75002a(C63575n3.class)).mo88422e3(likedTimelineViewCallback2.getRecyclerView());
        }
    }
}
