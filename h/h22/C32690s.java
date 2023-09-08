package h22;

import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C33071r2;
import ue1.C65328r;

/* renamed from: h22.s */
public final class C32690s extends IStaticListener<VoipEvent> {
    public boolean callback(IEvent iEvent) {
        VoipEvent voipEvent = (VoipEvent) iEvent;
        C87412m.m108594g(voipEvent, "event");
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "VoipEvent=" + voipEvent.f194019d.f194022b);
        if (voipEvent.f194019d.f194022b != 11) {
            return false;
        }
        C33071r2 gJ = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76848gJ();
        C87412m.m108592e(gJ, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer");
        ((C65328r) gJ).mo89428e(500, C65328r.C37445f.EXIT);
        return false;
    }
}
