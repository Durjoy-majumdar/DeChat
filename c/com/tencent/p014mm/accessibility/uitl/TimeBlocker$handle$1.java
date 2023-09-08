package com.tencent.p014mm.accessibility.uitl;

import com.tencent.p014mm.accessibility.uitl.TimeBlocker;
import com.tencent.p014mm.sdk.event.pending.PendingEventHandler;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/accessibility/uitl/TimeBlocker$handle$1", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "", "eventList", "Lrx3/b0;", "handleEvent", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1 */
public final class TimeBlocker$handle$1 implements PendingEventHandler<TimeBlocker.CallbackEvent> {
    public void handleEvent(List<TimeBlocker.CallbackEvent> list) {
        C87412m.m108594g(list, "eventList");
        for (TimeBlocker.CallbackEvent callback : list) {
            callback.getCallback().invoke();
        }
    }
}
