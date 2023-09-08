package com.tencent.p014mm.sdk.event.pending;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import mu3.C109639a;

@Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "T", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier$pendingHandler$2 */
public final class StoragePendingEventNotifier$pendingHandler$2 extends C87413o implements C32224a<MMHandler> {
    public final /* synthetic */ StoragePendingEventNotifier<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoragePendingEventNotifier$pendingHandler$2(StoragePendingEventNotifier<T> storagePendingEventNotifier) {
        super(0);
        this.this$0 = storagePendingEventNotifier;
    }

    public final MMHandler invoke() {
        StoragePendingEventNotifier$pendingHandler$2$callback$1 storagePendingEventNotifier$pendingHandler$2$callback$1 = new StoragePendingEventNotifier$pendingHandler$2$callback$1(this.this$0);
        C109639a aVar = C109639a.f328235e.get(this.this$0.getHandleThreadTag());
        if (aVar == null) {
            aVar = C109639a.m148950a(this.this$0.getHandleThreadTag());
        }
        MMHandler mMHandler = new MMHandler(aVar, (MMHandler.Callback) storagePendingEventNotifier$pendingHandler$2$callback$1);
        mMHandler.setLogging(false);
        return mMHandler;
    }
}
