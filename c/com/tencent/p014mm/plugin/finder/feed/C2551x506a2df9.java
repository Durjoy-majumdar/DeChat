package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderExposeChangedEventListener;
import gy3.C87412m;
import jq3.C60898l;
import kf1.C9745g8;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C49417ff1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$feedExposeInfoChangeListener$1", "Lcom/tencent/mm/plugin/finder/view/FinderExposeChangedEventListener;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedExposeInfoChangeListener$1 */
public final class C2551x506a2df9 extends FinderExposeChangedEventListener {

    /* renamed from: d */
    public String f13203d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13204e;

    public C2551x506a2df9(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        this.f13204e = finderProfileTimelineContract$ProfileTimelinePresenter;
        this.f13203d = finderProfileTimelineContract$ProfileTimelinePresenter.f13140h;
    }

    /* renamed from: e */
    public FinderItem mo2473e(long j) {
        C9745g8 g8Var = this.f13204e.f13143n;
        if (g8Var == null) {
            return null;
        }
        RecyclerView recyclerView = g8Var.getRecyclerView();
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f13204e;
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
        RecyclerView.C16631z b6 = C60898l.m71330b6((C60898l) adapter, j, false, 2, (Object) null);
        if (b6 == null) {
            return null;
        }
        C0740i2 i2Var = (C0740i2) finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x().safeGet(b6.mo17363j());
        if (i2Var instanceof BaseFinderFeed) {
            return ((BaseFinderFeed) i2Var).mo3513o();
        }
        return null;
    }

    /* renamed from: f */
    public String mo2474f() {
        return this.f13203d;
    }

    /* renamed from: g */
    public void mo2475g(long j, C49417ff1 ff12) {
        C9745g8 g8Var = this.f13204e.f13143n;
        if (g8Var != null) {
            RecyclerView recyclerView = g8Var.getRecyclerView();
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            RecyclerView.C16631z b6 = C60898l.m71330b6((C60898l) adapter, j, false, 2, (Object) null);
            if (b6 != null) {
                int j2 = b6.mo17363j();
                RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(j2, new C13604l(1, ff12));
                }
            }
        }
    }
}
