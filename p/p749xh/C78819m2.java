package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.m2 */
public class C78819m2 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f231075g;

    /* renamed from: h */
    public static final Column f231076h;

    /* renamed from: i */
    public static final Column f231077i;

    /* renamed from: j */
    public static final Column f231078j;

    /* renamed from: n */
    public static final Column f231079n;

    /* renamed from: o */
    public static final String[] f231080o = new String[0];

    /* renamed from: p */
    public static final int f231081p = 107944136;

    /* renamed from: q */
    public static final int f231082q = -295931082;

    /* renamed from: r */
    public static final int f231083r = 3145580;

    /* renamed from: s */
    public static final int f231084s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f231085t = initAutoDBInfo(C78819m2.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C78819m2> f231086u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f231087d = false;

    /* renamed from: e */
    public boolean f231088e = false;

    /* renamed from: f */
    public boolean f231089f = false;
    private long field_flag;
    private String field_query;
    private long field_updateTime;

    static {
        SingleTable singleTable = new SingleTable("FTS5NativeQueryClickRecallInfo");
        f231075g = singleTable;
        f231076h = new Column("rowid", "long", singleTable.getName(), "");
        f231077i = new Column(SearchIntents.EXTRA_QUERY, "string", singleTable.getName(), "");
        f231078j = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        f231079n = new Column("flag", "long", singleTable.getName(), "");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FTS5NativeQueryClickRecallInfo ( " + f231085t.sql + ");");
        for (String add : f231080o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FTS5NativeQueryClickRecallInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231085t, "FTS5NativeQueryClickRecallInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FTS5NativeQueryClickRecallInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = SearchIntents.EXTRA_QUERY;
        mAutoDBInfo.colsMap.put(SearchIntents.EXTRA_QUERY, "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = SearchIntents.EXTRA_QUERY;
        mAutoDBInfo.columns[1] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[2] = "flag";
        mAutoDBInfo.colsMap.put("flag", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " query TEXT default ''  PRIMARY KEY ,  updateTime LONG default '0' ,  flag LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78819m2)) {
            return false;
        }
        C78819m2 m2Var = (C78819m2) iAutoDBItem;
        return C46238a.m51546a(this.field_query, m2Var.field_query) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(m2Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_flag), Long.valueOf(m2Var.field_flag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231081p == hashCode) {
                    try {
                        this.field_query = cursor.getString(i);
                        this.f231087d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231082q == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231083r == hashCode) {
                    try {
                        this.field_flag = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231084s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_query == null) {
            this.field_query = "";
        }
        if (this.f231087d) {
            contentValues.put(SearchIntents.EXTRA_QUERY, this.field_query);
        }
        if (this.f231088e) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f231089f) {
            contentValues.put("flag", Long.valueOf(this.field_flag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231085t;
    }

    public String[] getIndexCreateSQL() {
        return f231080o;
    }

    public StorageObserverOwner<C78819m2> getObserverOwner() {
        return f231086u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_query;
    }

    public SingleTable getTable() {
        return f231075g;
    }

    public String getTableName() {
        return f231075g.getName();
    }

    /* renamed from: l2 */
    public void mo108776l2(long j) {
        this.field_flag = j;
        this.f231089f = true;
    }

    /* renamed from: m2 */
    public void mo108777m2(String str) {
        this.field_query = str;
        this.f231087d = true;
    }

    /* renamed from: n2 */
    public void mo108778n2(long j) {
        this.field_updateTime = j;
        this.f231088e = true;
    }

    public long replaceToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        ReplaceExecutor replaceExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(this.field_query), "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
            storageObserverEvent.setObj(this);
            replaceExecutor = new ReplaceExecutor(this, storageObserverEvent, f231086u, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        } else {
            replaceExecutor = new ReplaceExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        }
        return replaceExecutor.execute(iSQLiteDatabase);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(SearchIntents.EXTRA_QUERY)) {
            this.field_query = contentValues.getAsString(SearchIntents.EXTRA_QUERY);
            if (z) {
                this.f231087d = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f231088e = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z) {
                this.f231089f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
