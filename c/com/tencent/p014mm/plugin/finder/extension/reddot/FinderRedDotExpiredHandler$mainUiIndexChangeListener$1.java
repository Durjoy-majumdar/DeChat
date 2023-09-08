package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotExpiredHandler$mainUiIndexChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HomeUITabChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1 */
public final class FinderRedDotExpiredHandler$mainUiIndexChangeListener$1 extends IListener<HomeUITabChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotExpiredHandler f158522d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRedDotExpiredHandler$mainUiIndexChangeListener$1(FinderRedDotExpiredHandler finderRedDotExpiredHandler, C40008f fVar) {
        super(fVar);
        this.f158522d = finderRedDotExpiredHandler;
    }

    public boolean callback(IEvent iEvent) {
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        if (homeUITabChangeEvent.f78831d.f78832a == 2) {
            FinderRedDotExpiredHandler finderRedDotExpiredHandler = this.f158522d;
            finderRedDotExpiredHandler.getClass();
            Log.m105924i("Finder.RedDotExpiredHandler", "[checkDoSync] source=findMoreFriend delayed=0");
            finderRedDotExpiredHandler.f158520e.postDelayed(new C55709c0(finderRedDotExpiredHandler), 0);
            FinderRedDotExpiredHandler.m63314a(this.f158522d, "findMoreFriend", (String) null, 0, 6, (Object) null);
            return false;
        }
        FinderRedDotExpiredHandler.m63314a(this.f158522d, "otherTab", "Discovery", 0, 4, (Object) null);
        return false;
    }
}
