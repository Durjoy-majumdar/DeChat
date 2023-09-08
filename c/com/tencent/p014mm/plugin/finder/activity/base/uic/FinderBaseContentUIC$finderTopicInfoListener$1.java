package com.tencent.p014mm.plugin.finder.activity.base.uic;

import bl3.C54492n;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderTopicEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C52271zj0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/activity/base/uic/FinderBaseContentUIC$finderTopicInfoListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderTopicEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1 */
public final class FinderBaseContentUIC$finderTopicInfoListener$1 extends IListener<FinderTopicEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderBaseContentUIC f12468d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBaseContentUIC$finderTopicInfoListener$1(FinderBaseContentUIC finderBaseContentUIC, C40008f fVar) {
        super(fVar);
        this.f12468d = finderBaseContentUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderTopicEvent finderTopicEvent = (FinderTopicEvent) iEvent;
        C87412m.m108594g(finderTopicEvent, "event");
        FinderTopicEvent.C1067a aVar = finderTopicEvent.f9258d;
        int i = aVar != null ? aVar.f9260b : -1;
        Log.m105924i(C54492n.TAG, "FinderTopicEvent : " + i);
        if (i != 0 && i != -4056 && i != -4058 && i != -4063) {
            this.f12468d.mo522l3();
            return true;
        } else if (i != 0) {
            return true;
        } else {
            FinderBaseContentUIC finderBaseContentUIC = this.f12468d;
            finderBaseContentUIC.f12462i = null;
            finderBaseContentUIC.mo523m3((C52271zj0) null);
            return true;
        }
    }
}
