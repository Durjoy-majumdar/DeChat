package com.tencent.p014mm.plugin.finder.search;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderExposeChangedEventListener;
import gy3.C87412m;
import jq3.C60898l;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C49417ff1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$feedExposeInfoChangeListener$1", "Lcom/tencent/mm/plugin/finder/view/FinderExposeChangedEventListener;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$feedExposeInfoChangeListener$1 */
public final class FinderFeedSearchUI$feedExposeInfoChangeListener$1 extends FinderExposeChangedEventListener {

    /* renamed from: d */
    public String f16570d = "Finder.FinderFeedSearchUI";

    /* renamed from: e */
    public final /* synthetic */ FinderFeedSearchUI f16571e;

    public FinderFeedSearchUI$feedExposeInfoChangeListener$1(FinderFeedSearchUI finderFeedSearchUI) {
        this.f16571e = finderFeedSearchUI;
    }

    /* renamed from: e */
    public FinderItem mo2473e(long j) {
        FinderFeedSearchUI finderFeedSearchUI = this.f16571e;
        RecyclerView recyclerView = finderFeedSearchUI.f16470I;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            RecyclerView.C16631z b6 = C60898l.m71330b6((C60898l) adapter, j, false, 2, (Object) null);
            if (b6 != null) {
                C0740i2 i2Var = finderFeedSearchUI.f16513x.get(b6.mo17363j());
                if (i2Var instanceof BaseFinderFeed) {
                    return ((BaseFinderFeed) i2Var).mo3513o();
                }
            }
            return null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: f */
    public String mo2474f() {
        return this.f16570d;
    }

    /* renamed from: g */
    public void mo2475g(long j, C49417ff1 ff12) {
        RecyclerView recyclerView = this.f16571e.f16470I;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            RecyclerView.C16631z b6 = C60898l.m71330b6((C60898l) adapter, j, false, 2, (Object) null);
            if (b6 != null) {
                int j2 = b6.mo17363j();
                RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(j2, new C13604l(1, ff12));
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
