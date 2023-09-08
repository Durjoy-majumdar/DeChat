package com.tencent.p014mm.sdk.storage.observer;

import com.tencent.p014mm.sdk.event.pending.StoragePendingEventNotifier;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "T", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.observer.StorageObserverOwner$pendingNotifier$2 */
public final class StorageObserverOwner$pendingNotifier$2 extends C87413o implements C32224a<StoragePendingEventNotifier<T>> {
    public final /* synthetic */ StorageObserverOwner<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageObserverOwner$pendingNotifier$2(StorageObserverOwner<T> storageObserverOwner) {
        super(0);
        this.this$0 = storageObserverOwner;
    }

    public final StoragePendingEventNotifier<T> invoke() {
        return new StoragePendingEventNotifier<>(50, this.this$0.getLogTag(), this.this$0);
    }
}
