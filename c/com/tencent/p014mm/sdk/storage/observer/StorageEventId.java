package com.tencent.p014mm.sdk.storage.observer;

import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/observer/StorageEventId;", "", "name", "", "(Ljava/lang/String;)V", "toString", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.observer.StorageEventId */
public class StorageEventId {
    /* access modifiers changed from: private */
    public static final StorageEventId BATCH_EVENT = new StorageEventId("BATCH");
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static final StorageEventId DELETE = new StorageEventId("DELETE");
    /* access modifiers changed from: private */
    public static final StorageEventId INSERT = new StorageEventId("INSERT");
    /* access modifiers changed from: private */
    public static final StorageEventId NO_CHANGE = new StorageEventId("NO_CHANGE");
    /* access modifiers changed from: private */
    public static final StorageEventId UPDATE = new StorageEventId("UPDATE");
    private final String name;

    @Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/observer/StorageEventId$Companion;", "", "()V", "BATCH_EVENT", "Lcom/tencent/mm/sdk/storage/observer/StorageEventId;", "getBATCH_EVENT$annotations", "getBATCH_EVENT", "()Lcom/tencent/mm/sdk/storage/observer/StorageEventId;", "DELETE", "getDELETE$annotations", "getDELETE", "INSERT", "getINSERT$annotations", "getINSERT", "NO_CHANGE", "getNO_CHANGE$annotations", "getNO_CHANGE", "UPDATE", "getUPDATE$annotations", "getUPDATE", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.observer.StorageEventId$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public static /* synthetic */ void getBATCH_EVENT$annotations() {
        }

        public static /* synthetic */ void getDELETE$annotations() {
        }

        public static /* synthetic */ void getINSERT$annotations() {
        }

        public static /* synthetic */ void getNO_CHANGE$annotations() {
        }

        public static /* synthetic */ void getUPDATE$annotations() {
        }

        public final StorageEventId getBATCH_EVENT() {
            return StorageEventId.BATCH_EVENT;
        }

        public final StorageEventId getDELETE() {
            return StorageEventId.DELETE;
        }

        public final StorageEventId getINSERT() {
            return StorageEventId.INSERT;
        }

        public final StorageEventId getNO_CHANGE() {
            return StorageEventId.NO_CHANGE;
        }

        public final StorageEventId getUPDATE() {
            return StorageEventId.UPDATE;
        }
    }

    public StorageEventId(String str) {
        C87412m.m108594g(str, "name");
        this.name = str;
    }

    public static final StorageEventId getBATCH_EVENT() {
        return Companion.getBATCH_EVENT();
    }

    public static final StorageEventId getDELETE() {
        return Companion.getDELETE();
    }

    public static final StorageEventId getINSERT() {
        return Companion.getINSERT();
    }

    public static final StorageEventId getNO_CHANGE() {
        return Companion.getNO_CHANGE();
    }

    public static final StorageEventId getUPDATE() {
        return Companion.getUPDATE();
    }

    public String toString() {
        return this.name;
    }
}
