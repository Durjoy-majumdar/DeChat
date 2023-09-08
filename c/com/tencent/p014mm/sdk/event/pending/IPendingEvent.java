package com.tencent.p014mm.sdk.event.pending;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H&¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "", "getKey", "", "mergeEvent", "newEvent", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.event.pending.IPendingEvent */
public interface IPendingEvent {
    String getKey();

    IPendingEvent mergeEvent(IPendingEvent iPendingEvent);
}
