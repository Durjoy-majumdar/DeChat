package h22;

import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C33071r2;
import ue1.C65328r;

/* renamed from: h22.m */
public final class C32685m extends IStaticListener<HomeUITabChangeEvent> {
    public boolean callback(IEvent iEvent) {
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        if (homeUITabChangeEvent.f78831d.f78832a == 0) {
            return false;
        }
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "change tab event tab=" + homeUITabChangeEvent.f78831d.f78832a);
        C33071r2 gJ = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76848gJ();
        C87412m.m108592e(gJ, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer");
        ((C65328r) gJ).mo89428e(500, C65328r.C37445f.TAB);
        return false;
    }
}
