package com.tencent.p014mm.sdk.storage.mvvm;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.ObservableStorage;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.MultiCondition;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import ey3.C116796a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import ny3.C25235d;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B\u0011\b\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J'\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Lcom/tencent/mm/sdk/storage/ObservableStorage;", "Landroid/content/ContentValues;", "cv", "Lny3/d;", "clazz", "get", "(Landroid/content/ContentValues;Lny3/d;)Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "item", "", "isNotify", "needLog", "noCatch", "insert", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZZZ)Z", "", "delete", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZZ)I", "update", "", "replace", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZZ)J", "", "getLogTag", "Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;", "dbProvider", "Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;", "getDbProvider", "()Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;", "<init>", "(Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.mvvm.MvvmStorage */
public abstract class MvvmStorage<T extends IAutoDBItem> extends ObservableStorage<T> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.MMLiveStorage";
    private final IMvvmDBProvider dbProvider;

    @Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u00020\u0006\"\b\b\u0001\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage$Companion;", "", "()V", "TAG", "", "getDbInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "T", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "item", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;)Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.mvvm.MvvmStorage$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final <T extends IAutoDBItem> IAutoDBItem.MAutoDBInfo getDbInfo(T t) {
            C87412m.m108594g(t, "item");
            IAutoDBItem.MAutoDBInfo dBInfo = t.getDBInfo();
            String str = dBInfo.primaryKey;
            if (str == null || str.length() == 0) {
                dBInfo.primaryKey = "rowid";
            }
            return dBInfo;
        }
    }

    public MvvmStorage(IMvvmDBProvider iMvvmDBProvider) {
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
        this.dbProvider = iMvvmDBProvider;
    }

    public static /* synthetic */ int delete$default(MvvmStorage mvvmStorage, IAutoDBItem iAutoDBItem, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return mvvmStorage.delete(iAutoDBItem, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }

    public static final <T extends IAutoDBItem> IAutoDBItem.MAutoDBInfo getDbInfo(T t) {
        return Companion.getDbInfo(t);
    }

    public static /* synthetic */ boolean insert$default(MvvmStorage mvvmStorage, IAutoDBItem iAutoDBItem, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return mvvmStorage.insert(iAutoDBItem, z, z2, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insert");
    }

    public static /* synthetic */ long replace$default(MvvmStorage mvvmStorage, IAutoDBItem iAutoDBItem, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return mvvmStorage.replace(iAutoDBItem, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
    }

    public static /* synthetic */ int update$default(MvvmStorage mvvmStorage, IAutoDBItem iAutoDBItem, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return mvvmStorage.update(iAutoDBItem, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    public int delete(T t, boolean z, boolean z2) {
        C87412m.m108594g(t, "item");
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.Companion.getDELETE(), String.valueOf(t.getPrimaryKeyValue()), getLogTag());
        storageObserverEvent.setObj(t);
        String logTag = z2 ? getLogTag() : null;
        return (z ? new DeleteExecutor(t, storageObserverEvent, getOwner(), logTag) : new DeleteExecutor(t, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, logTag)).execute(this.dbProvider.getDB());
    }

    public T get(ContentValues contentValues, C25235d<T> dVar) {
        C87412m.m108594g(contentValues, "cv");
        C87412m.m108594g(dVar, "clazz");
        ISQLiteDatabase db = this.dbProvider.getDB();
        MultiCondition multiCondition = null;
        if (db == null) {
            return null;
        }
        Set<String> keySet = contentValues.keySet();
        C87412m.m108593f(keySet, "cv.keySet()");
        for (String str : keySet) {
            Object obj = contentValues.get(str);
            if (obj != null) {
                if (multiCondition != null) {
                    C87412m.m108593f(str, "key");
                    if (multiCondition.and((ISqlCondition) new Sql.Equal(str, obj.toString())) != null) {
                    }
                }
                C87412m.m108593f(str, "key");
                multiCondition = new MultiCondition(new Sql.Equal(str, obj.toString()));
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        return ((IAutoDBItem) C116796a.m164750b(dVar).newInstance()).getTable().selectAll().log(getLogTag()).where(multiCondition).limit(1, 0).build().singleQuery(db, C116796a.m164750b(dVar));
    }

    public final IMvvmDBProvider getDbProvider() {
        return this.dbProvider;
    }

    public String getLogTag() {
        return TAG;
    }

    public boolean insert(T t, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(t, "item");
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.Companion.getINSERT(), String.valueOf(t.getPrimaryKeyValue()), getLogTag());
        storageObserverEvent.setObj(t);
        String logTag = z2 ? getLogTag() : null;
        return (z ? new InsertExecutor(t, z3, storageObserverEvent, getOwner(), logTag) : new InsertExecutor(t, z3, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, logTag)).execute(this.dbProvider.getDB()) > 0;
    }

    public long replace(T t, boolean z, boolean z2) {
        C87412m.m108594g(t, "item");
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.Companion.getUPDATE(), String.valueOf(t.getPrimaryKeyValue()), getLogTag());
        storageObserverEvent.setObj(t);
        String logTag = z2 ? getLogTag() : null;
        return (z ? new ReplaceExecutor(t, storageObserverEvent, getOwner(), logTag) : new ReplaceExecutor(t, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, logTag)).execute(this.dbProvider.getDB());
    }

    public int update(T t, boolean z, boolean z2) {
        C87412m.m108594g(t, "item");
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.Companion.getUPDATE(), String.valueOf(t.getPrimaryKeyValue()), getLogTag());
        storageObserverEvent.setObj(t);
        String logTag = z2 ? getLogTag() : null;
        return (z ? new UpdateExecutor(t, storageObserverEvent, getOwner(), logTag) : new UpdateExecutor(t, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, logTag)).execute(this.dbProvider.getDB());
    }
}
