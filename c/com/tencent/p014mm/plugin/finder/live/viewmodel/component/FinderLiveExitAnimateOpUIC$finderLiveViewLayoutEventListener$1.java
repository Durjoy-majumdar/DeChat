package com.tencent.p014mm.plugin.finder.live.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveViewLayoutEvent;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f50.C58924d;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveViewLayoutEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1 */
public final class FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1 extends IListener<FinderLiveViewLayoutEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f160028d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C40008f fVar) {
        super(fVar);
        this.f160028d = finderLiveExitAnimateOpUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveViewLayoutEvent finderLiveViewLayoutEvent = (FinderLiveViewLayoutEvent) iEvent;
        C87412m.m108594g(finderLiveViewLayoutEvent, "event");
        if (finderLiveViewLayoutEvent.f154794d.f154796b == null) {
            Log.m105924i(this.f160028d.f160012d, "notify FinderLiveViewLayoutEvent videoView = null");
            return false;
        }
        String str = this.f160028d.f160012d;
        Log.m105924i(str, "notify FinderLiveViewLayoutEvent currentFeedId: " + this.f160028d.f160018j + " objectId = " + finderLiveViewLayoutEvent.f154794d.f154795a);
        Object obj = finderLiveViewLayoutEvent.f154794d.f154796b;
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.rtmp.ui.TXCloudVideoView");
        FinderLiveViewLayoutEvent.C55131a aVar = finderLiveViewLayoutEvent.f154794d;
        int i = aVar.f154797c;
        int i2 = aVar.f154798d;
        float f = aVar.f154799e;
        String str2 = this.f160028d.f160012d;
        Log.m105924i(str2, "notify FinderLiveViewLayoutEvent objectId: " + finderLiveViewLayoutEvent.f154794d.f154795a + " videoWidth: " + i + " videoHeight: " + i2 + " videoRatioWH: " + f + " videoView: " + ((TXCloudVideoView) obj) + " player: " + ((C58924d) aVar.f154800f) + "size: " + this.f160028d.f160014f.size() + " value: " + this.f160028d.f160014f);
        FinderLiveExitAnimateOpUIC.C56123a aVar2 = this.f160028d.f160014f;
        Long valueOf = Long.valueOf(finderLiveViewLayoutEvent.f154794d.f154795a);
        FinderLiveViewLayoutEvent.C55131a aVar3 = finderLiveViewLayoutEvent.f154794d;
        C87412m.m108593f(aVar3, "event.data");
        aVar2.put(valueOf, aVar3);
        return true;
    }
}
