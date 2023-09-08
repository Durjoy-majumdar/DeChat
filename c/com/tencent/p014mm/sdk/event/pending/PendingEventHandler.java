package com.tencent.p014mm.sdk.event.pending;

import com.tencent.p014mm.sdk.event.pending.IPendingEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "T", "", "", "eventList", "Lrx3/b0;", "handleEvent", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.pending.PendingEventHandler */
public interface PendingEventHandler<T extends IPendingEvent> {
    void handleEvent(List<? extends T> list);
}
