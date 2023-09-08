package com.tencent.p014mm.plugin.finder.live.multistream;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget$liveLayoutManager$1", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLayoutManager;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 */
public final class FinderLiveMultiStreamWidget$liveLayoutManager$1 extends FinderLiveLayoutManager {

    /* renamed from: F */
    public final /* synthetic */ FinderLiveMultiStreamWidget f159451F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMultiStreamWidget$liveLayoutManager$1(FinderLiveMultiStreamWidget finderLiveMultiStreamWidget, Context context) {
        super(context, 0, false);
        this.f159451F = finderLiveMultiStreamWidget;
        C87412m.m108593f(context, "context");
    }

    public boolean canScrollHorizontally() {
        FinderLiveMultiStreamWidget finderLiveMultiStreamWidget = this.f159451F;
        return finderLiveMultiStreamWidget.f159438k && finderLiveMultiStreamWidget.f159428a.mo86655O();
    }
}
