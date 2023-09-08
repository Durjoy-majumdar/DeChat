package com.tencent.p014mm.sdk.event.pending;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H&¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/StoragePendingEventHandler;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "", "", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "eventList", "Lrx3/b0;", "handleEvent", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventHandler */
public interface StoragePendingEventHandler<T extends IAutoDBItem> {
    void handleEvent(List<? extends StorageObserverEvent<T>> list);
}
