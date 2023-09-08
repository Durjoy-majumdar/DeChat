package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import an1.C0095h;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderLiveScrollSquareStatusEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import ln1.C10584f;
import te3.C64414h71;
import te3.C64836xp2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveScrollSquareStatusEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1 */
public final class LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1 extends IListener<FinderLiveScrollSquareStatusEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15743d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEntranceFragmentViewCallback$liveScrollSquareEventListener$1(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15743d = liveEntranceFragmentViewCallback;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveScrollSquareStatusEvent finderLiveScrollSquareStatusEvent = (FinderLiveScrollSquareStatusEvent) iEvent;
        C87412m.m108594g(finderLiveScrollSquareStatusEvent, "event");
        if (finderLiveScrollSquareStatusEvent.f9216d == null) {
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "notify FinderLiveScrollSquareStatusEvent videoView = null");
        } else {
            MMActivity mMActivity = this.f15743d.f15702a;
            C87412m.m108592e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            if (((MMFinderUI) mMActivity).mo2194I7() == 182) {
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "receive FinderLiveScrollSquareStatusEvent status: " + finderLiveScrollSquareStatusEvent.f9216d.f9217a + " scrollRefObjectId: " + this.f15743d.f15726y + " listSize: " + this.f15743d.f15710i.size() + " pullCommentScene: " + this.f15743d.f15722u);
                FinderLiveScrollSquareStatusEvent.C1050a aVar = finderLiveScrollSquareStatusEvent.f9216d;
                if (aVar.f9217a == 3) {
                    LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f15743d;
                    C64836xp2 xp22 = aVar.f9218b;
                    liveEntranceFragmentViewCallback.f15725x = xp22 != null ? xp22.f186372g : null;
                    String str = liveEntranceFragmentViewCallback.f15722u;
                    boolean z = true;
                    String str2 = "";
                    if (str == null || str.length() == 0) {
                        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback2 = this.f15743d;
                        C64836xp2 xp23 = finderLiveScrollSquareStatusEvent.f9216d.f9218b;
                        String str3 = xp23 != null ? xp23.f186377o : null;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        liveEntranceFragmentViewCallback2.f15722u = str3;
                    }
                    LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback3 = this.f15743d;
                    C64414h71 h712 = liveEntranceFragmentViewCallback3.f15725x;
                    if (h712 != null) {
                        h712.f183438u = liveEntranceFragmentViewCallback3.f15722u;
                    }
                    long j = 0;
                    if (liveEntranceFragmentViewCallback3.f15726y == 0) {
                        C64836xp2 xp24 = finderLiveScrollSquareStatusEvent.f9216d.f9218b;
                        liveEntranceFragmentViewCallback3.f15726y = xp24 != null ? xp24.f186376n : 0;
                    }
                    if (h712 != null) {
                        h712.f183433p = liveEntranceFragmentViewCallback3.f15726y;
                    }
                    C10584f fVar = (C10584f) C39818r.f106831a.mo62444c(liveEntranceFragmentViewCallback3.f15702a).mo75002a(C10584f.class);
                    if (fVar != null) {
                        C64414h71 h713 = this.f15743d.f15725x;
                        String str4 = h713 != null ? h713.f183438u : null;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        fVar.f31931p = str2;
                        C64836xp2 xp25 = finderLiveScrollSquareStatusEvent.f9216d.f9218b;
                        if (xp25 != null) {
                            j = xp25.f186373h;
                        }
                        fVar.f31930o = j;
                    }
                    C64836xp2 xp26 = finderLiveScrollSquareStatusEvent.f9216d.f9218b;
                    if (xp26 == null || !xp26.f186374i) {
                        z = false;
                    }
                    if (z) {
                        if (this.f15743d.f15710i.isEmpty()) {
                            LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback4 = this.f15743d;
                            LiveEntranceFragmentViewCallback.m3359c(liveEntranceFragmentViewCallback4, true, 0, 18, 0, (C32226l) null, new C3321a(liveEntranceFragmentViewCallback4), 24, (Object) null);
                        }
                    } else if (this.f15743d.f15710i.isEmpty()) {
                        WxRefreshLayout wxRefreshLayout = this.f15743d.f15712k;
                        if (wxRefreshLayout != null) {
                            wxRefreshLayout.mo26620r();
                        } else {
                            C87412m.m108603p("refreshLayout");
                            throw null;
                        }
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback5 = this.f15743d;
                        if (currentTimeMillis - liveEntranceFragmentViewCallback5.f15724w > 30000) {
                            Iterator<C0740i2> it = liveEntranceFragmentViewCallback5.f15710i.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C0740i2 next = it.next();
                                if (next instanceof C0095h) {
                                    i = ((C0095h) next).f532d.f130377d;
                                }
                            }
                            LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback6 = this.f15743d;
                            LiveEntranceFragmentViewCallback.m3359c(liveEntranceFragmentViewCallback6, false, i, 1, 0, (C32226l) null, new C3327b(liveEntranceFragmentViewCallback6), 24, (Object) null);
                            this.f15743d.f15724w = System.currentTimeMillis();
                        } else {
                            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "receive FinderLiveScrollSquareStatusEvent updateRecentWatch in interval");
                        }
                    }
                }
            }
        }
        return false;
    }
}
