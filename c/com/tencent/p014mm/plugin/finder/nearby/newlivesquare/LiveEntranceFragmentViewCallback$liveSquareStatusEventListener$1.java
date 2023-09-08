package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import com.tencent.p014mm.autogen.events.FinderLiveSquareStatusEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveSquareStatusEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1 */
public final class LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1 extends IListener<FinderLiveSquareStatusEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15744d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEntranceFragmentViewCallback$liveSquareStatusEventListener$1(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15744d = liveEntranceFragmentViewCallback;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = (FinderLiveSquareStatusEvent) iEvent;
        C87412m.m108594g(finderLiveSquareStatusEvent, "event");
        if (finderLiveSquareStatusEvent.f9220d == null) {
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "notify FinderLiveSquareStatusEvent videoView = null");
            return false;
        }
        MMActivity mMActivity = this.f15744d.f15702a;
        C87412m.m108592e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        if (((MMFinderUI) mMActivity).mo2194I7() != 135) {
            return false;
        }
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "receive FinderLiveSquareStatusEvent status: " + finderLiveSquareStatusEvent.f9220d.f9221a + " listSize: " + this.f15744d.f15710i.size() + " pullCommentScene: " + this.f15744d.f15722u);
        if (finderLiveSquareStatusEvent.f9220d.f9221a != 1) {
            return false;
        }
        if (this.f15744d.f15710i.isEmpty()) {
            WxRefreshLayout wxRefreshLayout = this.f15744d.f15712k;
            if (wxRefreshLayout != null) {
                wxRefreshLayout.mo26620r();
            } else {
                C87412m.m108603p("refreshLayout");
                throw null;
            }
        }
        return true;
    }
}
