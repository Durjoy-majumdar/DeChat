package com.tencent.p014mm.sdk.storage.observer;

import com.tencent.p014mm.sdk.event.pending.IPendingEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u0007H\u0016J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0002J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RF\u0010\u0014\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0015j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u0001`\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\r¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "T", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "eventId", "Lcom/tencent/mm/sdk/storage/observer/StorageEventId;", "pendingKey", "", "logTag", "(Lcom/tencent/mm/sdk/storage/observer/StorageEventId;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Lcom/tencent/mm/sdk/storage/observer/StorageEventId;", "getLogTag", "()Ljava/lang/String;", "obj", "getObj", "()Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "setObj", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;)V", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "objEventMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getObjEventMap", "()Ljava/util/HashMap;", "setObjEventMap", "(Ljava/util/HashMap;)V", "getPendingKey", "getKey", "mergeBatchEvent", "newEvent", "oldEvent", "mergeEvent", "mergeSingleEvent", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.observer.StorageObserverEvent */
public class StorageObserverEvent<T extends IAutoDBItem> implements IPendingEvent {
    private final StorageEventId eventId;
    private final String logTag;
    private T obj;
    private HashMap<String, StorageObserverEvent<T>> objEventMap;
    private final String pendingKey;

    public StorageObserverEvent(StorageEventId storageEventId, String str, String str2) {
        C87412m.m108594g(storageEventId, "eventId");
        C87412m.m108594g(str, "pendingKey");
        C87412m.m108594g(str2, "logTag");
        this.eventId = storageEventId;
        this.pendingKey = str;
        this.logTag = str2;
    }

    private final StorageObserverEvent<T> mergeBatchEvent(StorageObserverEvent<?> storageObserverEvent, StorageObserverEvent<?> storageObserverEvent2) {
        HashMap<String, StorageObserverEvent<T>> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        StorageEventId storageEventId = storageObserverEvent2.eventId;
        StorageEventId.Companion companion = StorageEventId.Companion;
        if (C87412m.m108589b(storageEventId, companion.getBATCH_EVENT())) {
            HashMap<String, StorageObserverEvent<T>> hashMap4 = storageObserverEvent2.objEventMap;
            if (hashMap4 != null) {
                hashMap2.putAll(hashMap4);
            }
        } else {
            hashMap2.put(storageObserverEvent2.pendingKey, storageObserverEvent2);
        }
        if (C87412m.m108589b(storageObserverEvent.eventId, companion.getBATCH_EVENT())) {
            HashMap<String, StorageObserverEvent<T>> hashMap5 = storageObserverEvent.objEventMap;
            if (hashMap5 != null) {
                hashMap3.putAll(hashMap5);
            }
        } else {
            hashMap3.put(storageObserverEvent.pendingKey, storageObserverEvent);
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (hashMap3.containsKey(entry.getKey())) {
                StorageObserverEvent storageObserverEvent3 = (StorageObserverEvent) hashMap3.get(entry.getKey());
                if (storageObserverEvent3 != null) {
                    StorageObserverEvent mergeSingleEvent = mergeSingleEvent(storageObserverEvent3, (StorageObserverEvent) entry.getValue());
                    StorageObserverEvent put = hashMap.put(mergeSingleEvent.pendingKey, mergeSingleEvent);
                }
                hashMap3.remove(entry.getKey());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.putAll(hashMap3);
        StorageObserverEvent<T> storageObserverEvent4 = new StorageObserverEvent<>(StorageEventId.Companion.getBATCH_EVENT(), StorageObserverEventKt.BATCH_PENDING_KEY, this.logTag);
        storageObserverEvent4.objEventMap = hashMap;
        return storageObserverEvent4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent<T> mergeSingleEvent(com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent<?> r5, com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent<?> r6) {
        /*
            r4 = this;
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r6.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId r1 = r5.eventId
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x009e
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r6.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r1 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getNO_CHANGE()
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x001a
            goto L_0x009e
        L_0x001a:
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getNO_CHANGE()
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r5.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId r3 = r1.getDELETE()
            boolean r3 = gy3.C87412m.m108589b(r2, r3)
            if (r3 == 0) goto L_0x004a
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r6.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getUPDATE()
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x003b
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getDELETE()
            goto L_0x00a0
        L_0x003b:
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getINSERT()
            boolean r6 = gy3.C87412m.m108589b(r6, r2)
            if (r6 == 0) goto L_0x00a0
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getNO_CHANGE()
            goto L_0x00a0
        L_0x004a:
            com.tencent.mm.sdk.storage.observer.StorageEventId r3 = r1.getINSERT()
            boolean r3 = gy3.C87412m.m108589b(r2, r3)
            if (r3 == 0) goto L_0x0074
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r6.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getDELETE()
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x0065
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getUPDATE()
            goto L_0x00a0
        L_0x0065:
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getUPDATE()
            boolean r6 = gy3.C87412m.m108589b(r6, r2)
            if (r6 == 0) goto L_0x00a0
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getINSERT()
            goto L_0x00a0
        L_0x0074:
            com.tencent.mm.sdk.storage.observer.StorageEventId r3 = r1.getUPDATE()
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x00a0
            com.tencent.mm.sdk.storage.observer.StorageEventId r6 = r6.eventId
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getDELETE()
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x008f
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getDELETE()
            goto L_0x00a0
        L_0x008f:
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getINSERT()
            boolean r6 = gy3.C87412m.m108589b(r6, r2)
            if (r6 == 0) goto L_0x00a0
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r1.getINSERT()
            goto L_0x00a0
        L_0x009e:
            com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r5.eventId
        L_0x00a0:
            com.tencent.mm.sdk.storage.observer.StorageObserverEvent r6 = new com.tencent.mm.sdk.storage.observer.StorageObserverEvent
            java.lang.String r1 = r5.pendingKey
            java.lang.String r2 = r4.logTag
            r6.<init>(r0, r1, r2)
            T r5 = r5.obj
            boolean r0 = r5 instanceof com.tencent.p014mm.sdk.storage.IAutoDBItem
            if (r0 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            r6.obj = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent.mergeSingleEvent(com.tencent.mm.sdk.storage.observer.StorageObserverEvent, com.tencent.mm.sdk.storage.observer.StorageObserverEvent):com.tencent.mm.sdk.storage.observer.StorageObserverEvent");
    }

    public final StorageEventId getEventId() {
        return this.eventId;
    }

    public String getKey() {
        return this.pendingKey;
    }

    public final String getLogTag() {
        return this.logTag;
    }

    public final T getObj() {
        return this.obj;
    }

    public final HashMap<String, StorageObserverEvent<T>> getObjEventMap() {
        return this.objEventMap;
    }

    public final String getPendingKey() {
        return this.pendingKey;
    }

    public IPendingEvent mergeEvent(IPendingEvent iPendingEvent) {
        C87412m.m108594g(iPendingEvent, "newEvent");
        if (!(iPendingEvent instanceof StorageObserverEvent)) {
            return this;
        }
        String str = this.logTag;
        StringBuilder sb = new StringBuilder();
        sb.append("oldEvent:[");
        sb.append(this.eventId);
        sb.append(", ");
        sb.append(getKey());
        sb.append("] newEvent:[");
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) iPendingEvent;
        sb.append(storageObserverEvent.eventId);
        sb.append(", ");
        sb.append(iPendingEvent.getKey());
        sb.append(']');
        Log.m105918d(str, sb.toString());
        return mergeBatchEvent(storageObserverEvent, this);
    }

    public final void setObj(T t) {
        this.obj = t;
    }

    public final void setObjEventMap(HashMap<String, StorageObserverEvent<T>> hashMap) {
        this.objEventMap = hashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorageObserverEvent(StorageEventId storageEventId, String str, String str2, int i, C8480h hVar) {
        this(storageEventId, str, (i & 4) != 0 ? "MicroMsg.Mvvm.StorageObserverEvent" : str2);
    }
}
