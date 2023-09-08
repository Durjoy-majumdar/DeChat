package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotView$Companion$addLiveStatusChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/BizFinderLineStatusChangedEvent;", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView$Companion$addLiveStatusChangeListener$1 */
public final class BizTimeLineHotView$Companion$addLiveStatusChangeListener$1 extends IListener<BizFinderLineStatusChangedEvent> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<C18440a0> f109311d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizTimeLineHotView$Companion$addLiveStatusChangeListener$1(WeakReference<C18440a0> weakReference, C40008f fVar) {
        super(fVar);
        this.f109311d = weakReference;
    }

    public boolean callback(IEvent iEvent) {
        BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
        C87412m.m108594g(bizFinderLineStatusChangedEvent, "event");
        C18440a0 a0Var = this.f109311d.get();
        if (a0Var == null) {
            return false;
        }
        BizFinderLineStatusChangedEvent.C40040a aVar = bizFinderLineStatusChangedEvent.f107369d;
        a0Var.mo23048z0(aVar.f107370a, aVar.f107371b, aVar.f107372c);
        return false;
    }
}
