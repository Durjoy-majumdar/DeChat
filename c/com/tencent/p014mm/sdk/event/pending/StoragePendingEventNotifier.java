package com.tencent.p014mm.sdk.event.pending;

import androidx.lifecycle.C0124r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEventKt;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+B-\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u001c¢\u0006\u0004\b)\u0010*J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\t\u001a\u00020\bR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Landroidx/lifecycle/r;", "Lrx3/b0;", "doRealNotify", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "event", "", "pending", "mergeNotifyData", "", "what", "sendPendingMessage", "sendMessage", "doNotify", "", "delay", "J", "getDelay", "()J", "setDelay", "(J)V", "", "handleThreadTag", "Ljava/lang/String;", "getHandleThreadTag", "()Ljava/lang/String;", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "handler", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "getHandler", "()Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "pendingEvent", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "pendingHandler$delegate", "Lrx3/g;", "getPendingHandler", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "pendingHandler", "<init>", "(JLjava/lang/String;Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier */
public final class StoragePendingEventNotifier<T extends IAutoDBItem> implements C0124r {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int MERGE = 1;
    private static final int SUBMIT = 0;
    public static final String TAG = "MicroMsg.Mvvm.StoragePendingEventNotifier";
    public static final String THREAD_TAG = "StoragePendingEventNotifierTag";
    private long delay;
    private final String handleThreadTag;
    private final PendingEventHandler<StorageObserverEvent<T>> handler;
    private final StorageObserverEvent<T> pendingEvent;
    private final C13601g pendingHandler$delegate;

    @Metadata(mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier$Companion;", "", "()V", "MERGE", "", "SUBMIT", "TAG", "", "THREAD_TAG", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public StoragePendingEventNotifier(long j, String str, PendingEventHandler<StorageObserverEvent<T>> pendingEventHandler) {
        C87412m.m108594g(str, "handleThreadTag");
        C87412m.m108594g(pendingEventHandler, "handler");
        this.delay = j;
        this.handleThreadTag = str;
        this.handler = pendingEventHandler;
        if (j > 0) {
            StorageObserverEvent<T> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.Companion.getBATCH_EVENT(), StorageObserverEventKt.BATCH_PENDING_KEY, TAG);
            storageObserverEvent.setObjEventMap(new HashMap());
            this.pendingEvent = storageObserverEvent;
            this.pendingHandler$delegate = C36568h.m40985a(new StoragePendingEventNotifier$pendingHandler$2(this));
            return;
        }
        throw new IllegalArgumentException("not allow use zero or smaller delay");
    }

    public static /* synthetic */ void doNotify$default(StoragePendingEventNotifier storagePendingEventNotifier, StorageObserverEvent storageObserverEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        storagePendingEventNotifier.doNotify(storageObserverEvent, z);
    }

    /* access modifiers changed from: private */
    public final void doRealNotify() {
        HashMap<String, StorageObserverEvent<T>> objEventMap = this.pendingEvent.getObjEventMap();
        if (objEventMap != null) {
            if (!(!objEventMap.isEmpty())) {
                objEventMap = null;
            }
            if (objEventMap != null) {
                ArrayList arrayList = new ArrayList(objEventMap.size());
                for (Map.Entry<String, StorageObserverEvent<T>> value : objEventMap.entrySet()) {
                    arrayList.add((StorageObserverEvent) value.getValue());
                }
                this.pendingEvent.setObjEventMap(new HashMap());
                if (!arrayList.isEmpty()) {
                    this.handler.handleEvent(arrayList);
                }
            }
        }
    }

    private final MMHandler getPendingHandler() {
        return (MMHandler) this.pendingHandler$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void mergeNotifyData(StorageObserverEvent<T> storageObserverEvent, boolean z) {
        IPendingEvent mergeEvent = this.pendingEvent.mergeEvent(storageObserverEvent);
        C87412m.m108592e(mergeEvent, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.observer.StorageObserverEvent<T of com.tencent.mm.sdk.event.pending.StoragePendingEventNotifier>");
        this.pendingEvent.setObjEventMap(((StorageObserverEvent) mergeEvent).getObjEventMap());
        if (z) {
            sendPendingMessage(0);
        } else {
            sendMessage(0);
        }
    }

    private final void sendMessage(int i) {
        Log.m105918d(TAG, "send message " + i);
        getPendingHandler().sendEmptyMessage(i);
    }

    private final void sendPendingMessage(int i) {
        if (!getPendingHandler().hasMessages(i)) {
            Log.m105918d(TAG, "send pending message " + i);
            getPendingHandler().sendEmptyMessageDelayed(i, this.delay);
            return;
        }
        Log.m105918d(TAG, "ignore pending message " + i);
    }

    public final void doNotify(StorageObserverEvent<T> storageObserverEvent, boolean z) {
        C87412m.m108594g(storageObserverEvent, "event");
        getPendingHandler().sendMessage(getPendingHandler().obtainMessage(1, z ? 1 : 0, 0, storageObserverEvent));
    }

    public final long getDelay() {
        return this.delay;
    }

    public final String getHandleThreadTag() {
        return this.handleThreadTag;
    }

    public final PendingEventHandler<StorageObserverEvent<T>> getHandler() {
        return this.handler;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoragePendingEventNotifier(long j, String str, PendingEventHandler pendingEventHandler, int i, C8480h hVar) {
        this(j, (i & 2) != 0 ? THREAD_TAG : str, pendingEventHandler);
    }
}
