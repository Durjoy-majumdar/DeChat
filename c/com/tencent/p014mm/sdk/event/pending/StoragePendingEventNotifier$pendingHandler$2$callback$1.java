package com.tencent.p014mm.sdk.event.pending;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo182094d2 = {"<anonymous>", "", "T", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "msg", "Landroid/os/Message;", "handleMessage"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier$pendingHandler$2$callback$1 */
public final class StoragePendingEventNotifier$pendingHandler$2$callback$1 implements MMHandler.Callback {
    public final /* synthetic */ StoragePendingEventNotifier<T> this$0;

    public StoragePendingEventNotifier$pendingHandler$2$callback$1(StoragePendingEventNotifier<T> storagePendingEventNotifier) {
        this.this$0 = storagePendingEventNotifier;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        int i = message.what;
        if (i == 0) {
            this.this$0.doRealNotify();
        } else if (i == 1) {
            boolean z = message.arg1 == 1;
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.observer.StorageObserverEvent<T of com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier>");
            this.this$0.mergeNotifyData((StorageObserverEvent) obj, z);
        }
        return true;
    }
}
