package com.tencent.p014mm.plugin.finder.utils;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLocationRefreshEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/utils/FinderLbsLogic$syncWaitLbs$1$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLocationRefreshEvent;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.utils.FinderLbsLogic$syncWaitLbs$1$listener$1 */
public final class FinderLbsLogic$syncWaitLbs$1$listener$1 extends IListener<FinderLocationRefreshEvent> {

    /* renamed from: d */
    public final /* synthetic */ Object f17480d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLbsLogic$syncWaitLbs$1$listener$1(Object obj, C40008f fVar) {
        super(fVar);
        this.f17480d = obj;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((FinderLocationRefreshEvent) iEvent, "event");
        dead();
        Object obj = this.f17480d;
        synchronized (obj) {
            Log.m105924i("Finder.FinderLbsLogic", "notify syncWaitLbs");
            obj.notifyAll();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return true;
    }
}
