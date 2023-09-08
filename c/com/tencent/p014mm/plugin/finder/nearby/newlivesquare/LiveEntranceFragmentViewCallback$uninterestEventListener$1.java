package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import an1.C0091d;
import an1.C0103p;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import sx3.C64197v;
import xm1.C15829e0;
import zm1.C16301e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$uninterestEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveUninterestedEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$uninterestEventListener$1 */
public final class LiveEntranceFragmentViewCallback$uninterestEventListener$1 extends IListener<FinderLiveUninterestedEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15745d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEntranceFragmentViewCallback$uninterestEventListener$1(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15745d = liveEntranceFragmentViewCallback;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveUninterestedEvent finderLiveUninterestedEvent = (FinderLiveUninterestedEvent) iEvent;
        C87412m.m108594g(finderLiveUninterestedEvent, "event");
        long j = finderLiveUninterestedEvent.f9222d.f9223a;
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f15745d;
        Iterator<C0740i2> it = liveEntranceFragmentViewCallback.f15710i.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            C0740i2 next = it.next();
            int i3 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = next;
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getFeedObject().f164794id == j) {
                    i2 = i;
                } else if (i2Var instanceof C0091d) {
                    Iterator it4 = ((ArrayList) liveEntranceFragmentViewCallback.f15713l.f42636a).iterator();
                    while (it4.hasNext()) {
                        ((C15829e0.C15830a) it4.next()).mo760a(j);
                    }
                } else if (i2Var instanceof C0103p) {
                    Iterator it5 = ((ArrayList) liveEntranceFragmentViewCallback.f15713l.f42636a).iterator();
                    while (it5.hasNext()) {
                        ((C15829e0.C15830a) it5.next()).mo760a(j);
                    }
                }
                i = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (i2 == -1) {
            return true;
        }
        this.f15745d.f15710i.remove(i2);
        C16301e eVar = this.f15745d.f15711j;
        C87412m.m108592e(eVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        int c6 = eVar.mo85796c6();
        C16301e eVar2 = this.f15745d.f15711j;
        if (eVar2 == null) {
            return true;
        }
        eVar2.notifyItemRemoved(i2 + c6);
        return true;
    }
}
