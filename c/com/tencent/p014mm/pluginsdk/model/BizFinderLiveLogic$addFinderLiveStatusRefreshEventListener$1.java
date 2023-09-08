package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveStatusRefreshEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/pluginsdk/model/BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveStatusRefreshEvent;", "plugin-biz_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.model.BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1 */
public final class BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1 extends IListener<FinderLiveStatusRefreshEvent> {
    public BizFinderLiveLogic$addFinderLiveStatusRefreshEventListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveStatusRefreshEvent finderLiveStatusRefreshEvent = (FinderLiveStatusRefreshEvent) iEvent;
        C87412m.m108594g(finderLiveStatusRefreshEvent, "event");
        Log.m105918d("MicroMsg.BizFinderLiveLogic", "onFinderLiveStatusRefreshEvent liveId=" + finderLiveStatusRefreshEvent.f154787d.f154789b + ", exportId=" + finderLiveStatusRefreshEvent.f154787d.f154788a + ", status=" + finderLiveStatusRefreshEvent.f154787d.f154790c);
        String str = finderLiveStatusRefreshEvent.f154787d.f154788a;
        if (!(str == null || C112551y.m153811k(str)) && finderLiveStatusRefreshEvent.f154787d.f154790c != 0) {
            C19428d dVar = C19428d.f54856a;
            MMKVSlotManager mMKVSlotManager = C19428d.f54858c;
            String decodeString$default = MMKVSlotManager.decodeString$default(mMKVSlotManager, "userName-" + str, (String) null, 2, (Object) null);
            if (!(decodeString$default == null || C112551y.m153811k(decodeString$default))) {
                Log.m105918d("MicroMsg.BizFinderLiveLogic", "onFinderLiveStatusRefreshEvent bizUserName=" + decodeString$default);
                if (finderLiveStatusRefreshEvent.f154787d.f154790c != 1) {
                    ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(dVar.mo25169c(decodeString$default), "");
                    dVar.mo25153F(decodeString$default, "", 5);
                }
            }
        }
        return false;
    }
}
