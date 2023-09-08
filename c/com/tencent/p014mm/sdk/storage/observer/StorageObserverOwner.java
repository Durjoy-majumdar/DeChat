package com.tencent.p014mm.sdk.storage.observer;

import com.tencent.p014mm.sdk.event.pending.PendingEventHandler;
import com.tencent.p014mm.sdk.event.pending.StoragePendingEventNotifier;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C26236u;
import sx3.C36907w;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0006:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\b\u001a\u00020\u0007H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\tH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\tH\u0016J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "Lcom/tencent/mm/sdk/storage/observer/IStorageObserver;", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "", "getLogTag", "", "eventList", "Lrx3/b0;", "handleEvent", "event", "notify", "", "eventId", "pendingKey", "obj", "doWrapNotify", "(ILjava/lang/String;Lcom/tencent/mm/sdk/storage/IAutoDBItem;)V", "Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "pendingNotifier$delegate", "Lrx3/g;", "getPendingNotifier", "()Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "pendingNotifier", "<init>", "()V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.observer.StorageObserverOwner */
public final class StorageObserverOwner<T extends IAutoDBItem> extends MvvmObserverOwner<IStorageObserver<T>, StorageObserverEvent<T>> implements PendingEventHandler<StorageObserverEvent<T>> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.StorageObserverOwner";
    private final C13601g pendingNotifier$delegate = C36568h.m40985a(new StorageObserverOwner$pendingNotifier$2(this));

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.observer.StorageObserverOwner$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    private final StoragePendingEventNotifier<T> getPendingNotifier() {
        return (StoragePendingEventNotifier) this.pendingNotifier$delegate.getValue();
    }

    public final void doWrapNotify(int i, String str, T t) {
        if (str != null) {
            if ((C112551y.m153811k(str) ^ true ? str : null) != null) {
                StorageObserverEvent storageObserverEvent = new StorageObserverEvent(i != 2 ? i != 3 ? i != 4 ? i != 5 ? StorageEventId.Companion.getNO_CHANGE() : StorageEventId.Companion.getDELETE() : StorageEventId.Companion.getUPDATE() : StorageEventId.Companion.getUPDATE() : StorageEventId.Companion.getINSERT(), str, getLogTag());
                storageObserverEvent.setObj(t);
                notify(storageObserverEvent);
            }
        }
    }

    public String getLogTag() {
        return "MicroMsg.Mvvm.StorageObserverOwner@" + hashCode();
    }

    public void handleEvent(List<? extends StorageObserverEvent<T>> list) {
        StorageObserverEvent storageObserverEvent;
        C87412m.m108594g(list, "eventList");
        if (list.size() == 1) {
            storageObserverEvent = (StorageObserverEvent) list.get(0);
        } else {
            if (Log.getLogLevel() <= 1) {
                String logTag = getLogTag();
                StringBuilder sb = new StringBuilder();
                sb.append("merge batch event ");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (StorageObserverEvent pendingKey : list) {
                    arrayList.add(pendingKey.getPendingKey());
                }
                sb.append(arrayList);
                Log.m105918d(logTag, sb.toString());
            }
            StorageObserverEvent storageObserverEvent2 = new StorageObserverEvent(StorageEventId.Companion.getBATCH_EVENT(), StorageObserverEventKt.BATCH_PENDING_KEY, getLogTag());
            storageObserverEvent2.setObjEventMap(new HashMap());
            for (StorageObserverEvent storageObserverEvent3 : list) {
                HashMap objEventMap = storageObserverEvent2.getObjEventMap();
                if (objEventMap != null) {
                    StorageObserverEvent storageObserverEvent4 = (StorageObserverEvent) objEventMap.put(storageObserverEvent3.getPendingKey(), storageObserverEvent3);
                }
            }
            storageObserverEvent = storageObserverEvent2;
        }
        super.notify(C26236u.m33719b(storageObserverEvent));
    }

    public void notify(StorageObserverEvent<T> storageObserverEvent) {
        C87412m.m108594g(storageObserverEvent, "event");
        getPendingNotifier().doNotify(storageObserverEvent, true);
    }

    public void notify(List<? extends StorageObserverEvent<T>> list) {
        C87412m.m108594g(list, "eventList");
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.Companion.getBATCH_EVENT(), StorageObserverEventKt.BATCH_PENDING_KEY, getLogTag());
        storageObserverEvent.setObjEventMap(new HashMap());
        for (StorageObserverEvent storageObserverEvent2 : list) {
            HashMap objEventMap = storageObserverEvent.getObjEventMap();
            if (objEventMap != null) {
                StorageObserverEvent storageObserverEvent3 = (StorageObserverEvent) objEventMap.put(storageObserverEvent2.getPendingKey(), storageObserverEvent2);
            }
        }
        notify(storageObserverEvent);
    }
}
