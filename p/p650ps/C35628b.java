package p650ps;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;

/* renamed from: ps.b */
public final class C35628b extends IStaticListener<FeedUpdateEvent> {
    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        GameLiveCommonService gameLiveCommonService = (GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class);
        gameLiveCommonService.getClass();
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        boolean z = true;
        if (aVar != null && aVar.f9175b == 8) {
            if (aVar == null || aVar.f9182i != 2) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.PluginGameLive", gameLiveCommonService.Dx0("received live end event"));
            }
        }
        return false;
    }
}
