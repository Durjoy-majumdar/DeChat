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

@Metadata(mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0018\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/executor/UpdateExecutor;", "", "item", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "event", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "observerOwner", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "logTag", "", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;Ljava/lang/String;)V", "getItem", "()Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "getLogTag", "()Ljava/lang/String;", "setLogTag", "(Ljava/lang/String;)V", "execute", "", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.executor.UpdateExecutor */
public final class UpdateExecutor {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.UpdateExecutor";
    private final StorageObserverEvent<? extends IAutoDBItem> event;
    private final IAutoDBItem item;
    private String logTag;
    private final StorageObserverOwner<?> observerOwner;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/executor/UpdateExecutor$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.executor.UpdateExecutor$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public UpdateExecutor(IAutoDBItem iAutoDBItem, StorageObserverEvent<? extends IAutoDBItem> storageObserverEvent, StorageObserverOwner<?> storageObserverOwner, String str) {
        C87412m.m108594g(iAutoDBItem, "item");
        this.item = iAutoDBItem;
        this.event = storageObserverEvent;
        this.observerOwner = storageObserverOwner;
        this.logTag = str;
    }

    public final int execute(ISQLiteDatabase iSQLiteDatabase) {
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
        if (iSQLiteDatabase == null || convertTo == null || obj == null) {
            String str2 = this.logTag;
            if (str2 != null) {
                str = str2;
            }
            Log.m105924i(str, "update table:" + this.item.getTableName() + " fail primaryKey:" + dBInfo.primaryKey + " value:" + obj);
            return 0;
        }
        int update = iSQLiteDatabase.update(this.item.getTableName(), convertTo, dBInfo.primaryKey + " = ?", new String[]{obj.toString()});
        if (update > 0) {
            StorageObserverOwner<?> storageObserverOwner = this.observerOwner;
            StorageObserverEvent<? extends IAutoDBItem> storageObserverEvent = this.event;
            if (!(storageObserverOwner == null || storageObserverEvent == null)) {
                storageObserverOwner.notifyAny(storageObserverEvent);
            }
        }
        if (update > 0) {
            String str3 = this.logTag;
            if (str3 != null && !C112551y.m153811k(str3)) {
                z = false;
            }
            if (!z) {
                Log.m105924i(this.logTag, "update table:" + this.item.getTableName() + " success primaryKey:" + dBInfo.primaryKey + " value:" + obj);
            }
        }
        if (update <= 0) {
            String str4 = this.logTag;
            if (str4 != null) {
                str = str4;
            }
            Log.m105920e(str, "update effectRow:" + update + " table:" + this.item.getTableName() + " fail primaryKey:" + dBInfo.primaryKey + " value:" + obj);
        }
        return update;
    }

    public final IAutoDBItem getItem() {
        return this.item;
    }

    public final String getLogTag() {
        return this.logTag;
    }

    public final void setLogTag(String str) {
        this.logTag = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateExecutor(IAutoDBItem iAutoDBItem, StorageObserverEvent storageObserverEvent, StorageObserverOwner storageObserverOwner, String str, int i, C8480h hVar) {
        this(iAutoDBItem, (i & 2) != 0 ? null : storageObserverEvent, (i & 4) != 0 ? null : storageObserverOwner, (i & 8) != 0 ? null : str);
    }
}
