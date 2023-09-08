package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import bn1.C0331b;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderNewEntranceNotifyInsertEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$finderNearbyRefreshEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderNewEntranceNotifyInsertEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$finderNearbyRefreshEventListener$1 */
public final class C3320x670f0ed extends IListener<FinderNewEntranceNotifyInsertEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3320x670f0ed(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15742d = liveEntranceFragmentViewCallback;
    }

    public boolean callback(IEvent iEvent) {
        int i;
        FinderNewEntranceNotifyInsertEvent finderNewEntranceNotifyInsertEvent = (FinderNewEntranceNotifyInsertEvent) iEvent;
        C87412m.m108594g(finderNewEntranceNotifyInsertEvent, "event");
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", " receive FinderNewEntranceNotifyInsertEvent objectId = " + finderNewEntranceNotifyInsertEvent.f9231d.f9232a);
        if (finderNewEntranceNotifyInsertEvent.f9231d.f9232a == 0) {
            return true;
        }
        C0740i2 i2Var = (C0740i2) C110818d0.m150925W(this.f15742d.f15710i);
        int i2 = 0;
        if (i2Var != null) {
            if (i2Var instanceof C0331b) {
                i2 = ((C0331b) i2Var).f903d.f130377d;
            }
            i = i2;
        } else {
            i = 0;
        }
        LiveEntranceFragmentViewCallback.m3359c(this.f15742d, false, i, 16, finderNewEntranceNotifyInsertEvent.f9231d.f9232a, (C32226l) null, (C32226l) null, 48, (Object) null);
        return true;
    }
}
