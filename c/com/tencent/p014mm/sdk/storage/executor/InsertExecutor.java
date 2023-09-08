package com.tencent.p014mm.sdk.storage.executor;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001b\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/executor/InsertExecutor;", "", "item", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "noCatch", "", "event", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "observerOwner", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "logTag", "", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZLcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;Ljava/lang/String;)V", "getEvent", "()Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "getItem", "()Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "getLogTag", "()Ljava/lang/String;", "setLogTag", "(Ljava/lang/String;)V", "getNoCatch", "()Z", "getObserverOwner", "()Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "execute", "", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.executor.InsertExecutor */
public final class InsertExecutor {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.InsertExecutor";
    private final StorageObserverEvent<? extends IAutoDBItem> event;
    private final IAutoDBItem item;
    private String logTag;
    private final boolean noCatch;
    private final StorageObserverOwner<?> observerOwner;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/executor/InsertExecutor$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.executor.InsertExecutor$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public InsertExecutor(IAutoDBItem iAutoDBItem, boolean z, StorageObserverEvent<? extends IAutoDBItem> storageObserverEvent, StorageObserverOwner<?> storageObserverOwner, String str) {
        C87412m.m108594g(iAutoDBItem, "item");
        this.item = iAutoDBItem;
        this.noCatch = z;
        this.event = storageObserverEvent;
        this.observerOwner = storageObserverOwner;
        this.logTag = str;
    }

    public final long execute(ISQLiteDatabase iSQLiteDatabase) {
        IAutoDBItem.MAutoDBInfo dBInfo = this.item.getDBInfo();
        ContentValues convertTo = this.item.convertTo();
        boolean z = true;
        Object obj = null;
        if (!(convertTo.size() > 0)) {
            convertTo = null;
        }
        if (convertTo != null) {
            obj = convertTo.get(dBInfo.primaryKey);
        }
        String str = TAG;
        if (iSQLiteDatabase == null || convertTo == null) {
            String str2 = this.logTag;
            if (str2 != null) {
                str = str2;
            }
            Log.m105924i(str, "insert table:" + this.item.getTableName() + " fail primaryKey:" + dBInfo.primaryKey + " value:" + obj);
            return -1;
        }
        long insertOrThrow = this.noCatch ? iSQLiteDatabase.insertOrThrow(this.item.getTableName(), dBInfo.primaryKey, convertTo) : iSQLiteDatabase.insert(this.item.getTableName(), dBInfo.primaryKey, convertTo);
        int i = (insertOrThrow > 0 ? 1 : (insertOrThrow == 0 ? 0 : -1));
        if (i > 0) {
            this.item.systemRowid = insertOrThrow;
            StorageObserverOwner<?> storageObserverOwner = this.observerOwner;
            StorageObserverEvent<? extends IAutoDBItem> storageObserverEvent = this.event;
            if (!(storageObserverOwner == null || storageObserverEvent == null)) {
                storageObserverOwner.notifyAny(storageObserverEvent);
            }
        }
        if (i > 0) {
            String str3 = this.logTag;
            if (str3 != null && !C112551y.m153811k(str3)) {
                z = false;
            }
            if (!z) {
                Log.m105924i(this.logTag, "insert table:" + this.item.getTableName() + " success primaryKey:" + dBInfo.primaryKey + " value:" + obj);
            }
        }
        if (i <= 0) {
            String str4 = this.logTag;
            if (str4 != null) {
                str = str4;
            }
            Log.m105920e(str, "insert resultRowId" + insertOrThrow + " table:" + this.item.getTableName() + " fail primaryKey:" + dBInfo.primaryKey + " value:" + obj);
        }
        return insertOrThrow;
    }

    public final StorageObserverEvent<? extends IAutoDBItem> getEvent() {
        return this.event;
    }

    public final IAutoDBItem getItem() {
        return this.item;
    }

    public final String getLogTag() {
        return this.logTag;
    }

    public final boolean getNoCatch() {
        return this.noCatch;
    }

    public final StorageObserverOwner<?> getObserverOwner() {
        return this.observerOwner;
    }

    public final void setLogTag(String str) {
        this.logTag = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsertExecutor(IAutoDBItem iAutoDBItem, boolean z, StorageObserverEvent storageObserverEvent, StorageObserverOwner storageObserverOwner, String str, int i, C8480h hVar) {
        this(iAutoDBItem, z, (i & 4) != 0 ? null : storageObserverEvent, (i & 8) != 0 ? null : storageObserverOwner, (i & 16) != 0 ? null : str);
    }
}
