package com.tencent.p014mm.plugin.finder.profile.uic;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC$coverSetEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderFeedUiActionEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1 */
public final class FinderProfileUiStyleUIC$coverSetEvent$1 extends IListener<FinderFeedUiActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileUiStyleUIC f16378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileUiStyleUIC$coverSetEvent$1(FinderProfileUiStyleUIC finderProfileUiStyleUIC, C40008f fVar) {
        super(fVar);
        this.f16378d = finderProfileUiStyleUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderFeedUiActionEvent finderFeedUiActionEvent = (FinderFeedUiActionEvent) iEvent;
        C87412m.m108594g(finderFeedUiActionEvent, "event");
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        if (aVar == null) {
            return true;
        }
        FinderProfileUiStyleUIC finderProfileUiStyleUIC = this.f16378d;
        Log.m105924i("Finder.ProfileUiStyleUIC", "callback actionType:" + aVar.f9205c);
        int i = aVar.f9205c;
        if (i == 50000) {
            String str = aVar.f9211i;
            C87412m.m108593f(str, "url");
            FinderProfileUiStyleUIC.m3623c3(finderProfileUiStyleUIC, str, C58784w3.f168295a.mo83888N(1.0f, aVar.f9210h));
            return true;
        } else if (i != 50001) {
            return true;
        } else {
            finderProfileUiStyleUIC.setNormalStyle();
            return true;
        }
    }
}
