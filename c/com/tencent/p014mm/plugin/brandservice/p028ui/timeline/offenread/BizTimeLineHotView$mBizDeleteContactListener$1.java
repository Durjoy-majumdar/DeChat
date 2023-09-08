package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizDeleteContactEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import dx0.C31332a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotView$mBizDeleteContactListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/BizDeleteContactEvent;", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView$mBizDeleteContactListener$1 */
public final class BizTimeLineHotView$mBizDeleteContactListener$1 extends IListener<BizDeleteContactEvent> {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51189d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizTimeLineHotView$mBizDeleteContactListener$1(BizTimeLineHotView bizTimeLineHotView, C40008f fVar) {
        super(fVar);
        this.f51189d = bizTimeLineHotView;
    }

    public boolean callback(IEvent iEvent) {
        BizDeleteContactEvent bizDeleteContactEvent = (BizDeleteContactEvent) iEvent;
        C87412m.m108594g(bizDeleteContactEvent, "event");
        BizDeleteContactEvent.C40039a aVar = bizDeleteContactEvent.f107367d;
        if (aVar == null || Util.isNullOrNil(aVar.f107368a) || this.f51189d.f51172n.isEmpty()) {
            return false;
        }
        C31332a.m39373a("BrandServiceWorkerThread", new C18461k(this.f51189d, bizDeleteContactEvent), 0);
        return false;
    }
}
