package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.BatchInsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

/* renamed from: xh.o5 */
public class C66268o5 extends IAutoDBItem {
    public static final String COL_EXPIRE_AT = "expire_at";
    public static final String COL_KEY = "key";
    public static final String COL_VALUE = "value";
    public static final IAutoDBItem.MAutoDBInfo DB_INFO = initAutoDBInfo(C66268o5.class);
    public static final Column EXPIRE_AT;
    public static final String[] INDEX_CREATE = new String[0];
    public static final Column KEY;
    public static final StorageObserverOwner<C66268o5> OBSERVER_OWNER = new StorageObserverOwner<>();
    public static final Column ROWID;
    public static final SingleTable TABLE;
    public static final String TABLE_NAME = "KindaCacheTable";
    private static final String TAG_ = "MicroMsg.SDK.BaseKindaCacheTable";
    public static final Column VALUE;
    private static final int expire_at_HASHCODE = 250178387;
    private static final int key_HASHCODE = 106079;
    private static final int rowid_HASHCODE = 108705909;
    private static final int value_HASHCODE = 111972721;
    private boolean __hadSetexpire_at = true;
    private boolean __hadSetkey = true;
    private boolean __hadSetvalue = true;
    public long field_expire_at;
    public String field_key;
    public byte[] field_value;

    /* renamed from: xh.o5$a */
    public static class C38625a {
        public C38625a() {
            new ContentValues();
        }
    }

    /* renamed from: xh.o5$d */
    public static class C38626d {
        public C38626d() {
            new ContentValues();
        }
    }

    /* renamed from: xh.o5$b */
    public static class C66269b {
    }

    /* renamed from: xh.o5$c */
    public static class C66270c {

        /* renamed from: a */
        public List<Column> f190615a = new LinkedList();

        /* renamed from: b */
        public ISqlCondition f190616b;

        /* renamed from: c */
        public List<ISqlOrder> f190617c = new LinkedList();

        /* renamed from: d */
        public List<Column> f190618d = new LinkedList();
    }

    static {
        SingleTable singleTable = new SingleTable("KindaCacheTable");
        TABLE = singleTable;
        ROWID = new Column("rowid", "long", singleTable.getName(), "");
        KEY = new Column("key", "string", singleTable.getName(), "");
        VALUE = new Column("value", "byte[]", singleTable.getName(), "");
        EXPIRE_AT = new Column("expire_at", "long", singleTable.getName(), "");
    }

    public static final BatchInsertExecutor batchInsert(List<C66268o5> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C66268o5 next : list) {
            if (z) {
                arrayList.add(new InsertExecutor(next, true, next.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new InsertExecutor(next, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_));
            }
        }
        return new BatchInsertExecutor(arrayList);
    }

    private final void buildBuff() {
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e(TAG_, "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(getCreateSQLs());
        for (String add : INDEX_CREATE) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i(TAG_, "createTableSql %s", str);
            iSQLiteDatabase.execSQL("KindaCacheTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(DB_INFO, "KindaCacheTable", iSQLiteDatabase)) {
            Log.m105925i(TAG_, "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("KindaCacheTable", next);
        }
        Log.m105925i(TAG_, "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static final C38625a cvBuilder() {
        return new C38625a();
    }

    public static final C66269b delete() {
        return new C66269b();
    }

    private static String getCreateSQLs() {
        return "CREATE TABLE IF NOT EXISTS KindaCacheTable ( " + DB_INFO.sql + ");";
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "BLOB");
        mAutoDBInfo.columns[2] = "expire_at";
        mAutoDBInfo.colsMap.put("expire_at", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  value BLOB,  expire_at LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public static final InsertExecutor insert(C66268o5 o5Var, boolean z) {
        if (!z) {
            return new InsertExecutor(o5Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(o5Var, true, o5Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final InsertExecutor insertOrThrow(C66268o5 o5Var, boolean z) {
        if (!z) {
            return new InsertExecutor(o5Var, false, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(o5Var, false, o5Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final SelectSql isExistByKey(String str) {
        SingleTable singleTable = TABLE;
        Column column = KEY;
        return singleTable.select(column).where(column.equal(str)).log(TAG_).limit(1, 0).build();
    }

    public static final void observe(C0125s sVar, IStorageObserver<? extends C66268o5> iStorageObserver) {
        OBSERVER_OWNER.observe(sVar, iStorageObserver);
    }

    private final void parseBuff() {
    }

    public static final void removeObserve(IStorageObserver<? extends C66268o5> iStorageObserver) {
        OBSERVER_OWNER.removeObserver(iStorageObserver);
    }

    public static final ReplaceExecutor replace(C66268o5 o5Var, boolean z) {
        return z ? new ReplaceExecutor(o5Var, o5Var.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new ReplaceExecutor(o5Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final C66270c select() {
        return new C66270c();
    }

    public static final SelectSql selectByExpire_at(long j) {
        return TABLE.selectAll().where(EXPIRE_AT.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectByExpire_atList(List<Long> list) {
        return TABLE.selectAll().where(EXPIRE_AT.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByKey(String str) {
        return TABLE.selectAll().where(KEY.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByKeyList(List<String> list) {
        return TABLE.selectAll().where(KEY.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectExistListByKey(List<String> list) {
        SingleTable singleTable = TABLE;
        Column column = KEY;
        return singleTable.select(column).where(column.inString(list)).log(TAG_).build();
    }

    public static final long selectExpire_atByKey(ISQLiteDatabase iSQLiteDatabase, String str) {
        C66270c select = select();
        ((LinkedList) select.f190615a).add(EXPIRE_AT);
        select.f190616b = KEY.equal(str);
        C66268o5 o5Var = (C66268o5) TABLE.select((List<? extends ISqlColumn>) select.f190615a).where(select.f190616b).orderBy((List<? extends ISqlOrder>) select.f190617c).groupBy((List<? extends Column>) select.f190618d).build().singleQuery(iSQLiteDatabase, C66268o5.class);
        if (o5Var != null) {
            return o5Var.field_expire_at;
        }
        return 0;
    }

    public static final C38626d update() {
        return new C38626d();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66268o5)) {
            return false;
        }
        C66268o5 o5Var = (C66268o5) iAutoDBItem;
        return C46238a.m51546a(this.field_key, o5Var.field_key) && C46238a.m51546a(this.field_value, o5Var.field_value) && C46238a.m51546a(Long.valueOf(this.field_expire_at), Long.valueOf(o5Var.field_expire_at));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (key_HASHCODE == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.__hadSetkey = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace(TAG_, th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (value_HASHCODE == hashCode) {
                    try {
                        this.field_value = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace(TAG_, th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (expire_at_HASHCODE == hashCode) {
                    try {
                        this.field_expire_at = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace(TAG_, th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (rowid_HASHCODE == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        buildBuff();
        ContentValues contentValues = new ContentValues();
        if (this.__hadSetkey) {
            contentValues.put("key", this.field_key);
        }
        if (this.__hadSetvalue) {
            contentValues.put("value", this.field_value);
        }
        if (this.__hadSetexpire_at) {
            contentValues.put("expire_at", Long.valueOf(this.field_expire_at));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public StorageObserverEvent<? extends C66268o5> createDeleteEvent() {
        StorageObserverEvent<? extends C66268o5> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getDELETE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C66268o5> createInsertEvent() {
        StorageObserverEvent<? extends C66268o5> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getINSERT(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public StorageObserverEvent<? extends C66268o5> createReplaceEvent() {
        StorageObserverEvent<? extends C66268o5> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C66268o5> createUpdateEvent() {
        StorageObserverEvent<? extends C66268o5> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public int deleteFromDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return delete(this, z).execute(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return DB_INFO;
    }

    public String[] getIndexCreateSQL() {
        return INDEX_CREATE;
    }

    public StorageObserverOwner<C66268o5> getObserverOwner() {
        return OBSERVER_OWNER;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return TABLE;
    }

    public String getTableName() {
        return TABLE.getName();
    }

    public long insertOrThrowToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insertOrThrow(this, z).execute(iSQLiteDatabase);
    }

    public long insertToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insert(this, z).execute(iSQLiteDatabase);
    }

    public boolean isExistByKeyInDB(ISQLiteDatabase iSQLiteDatabase) {
        return isExistByKey(this.field_key).isExist(iSQLiteDatabase);
    }

    public long replaceToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return replace(this, z).execute(iSQLiteDatabase);
    }

    public void reset() {
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return update(this, z).execute(iSQLiteDatabase);
    }

    public static final DeleteExecutor delete(C66268o5 o5Var, boolean z) {
        if (z) {
            return new DeleteExecutor(o5Var, o5Var.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new DeleteExecutor(o5Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final UpdateExecutor update(C66268o5 o5Var, boolean z) {
        if (z) {
            return new UpdateExecutor(o5Var, o5Var.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new UpdateExecutor(o5Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public SelectSql selectByExpire_at() {
        return selectByExpire_at(this.field_expire_at);
    }

    public SelectSql selectByKey() {
        return selectByKey(this.field_key);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.__hadSetkey = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z) {
                this.__hadSetvalue = true;
            }
        }
        if (contentValues.containsKey("expire_at")) {
            this.field_expire_at = contentValues.getAsLong("expire_at").longValue();
            if (z) {
                this.__hadSetexpire_at = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
