package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.i7 */
public class C38582i7 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102551g;

    /* renamed from: h */
    public static final String[] f102552h = new String[0];

    /* renamed from: i */
    public static final int f102553i = -265713450;

    /* renamed from: j */
    public static final int f102554j = 55126294;

    /* renamed from: n */
    public static final int f102555n = -427040401;

    /* renamed from: o */
    public static final int f102556o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102557p = initAutoDBInfo(C38582i7.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38582i7> f102558q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102559d = true;

    /* renamed from: e */
    public boolean f102560e = true;

    /* renamed from: f */
    public boolean f102561f = true;
    public int field_reportId;
    public long field_timestamp;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("PersistentWxaSyncInvalidContactCmd");
        f102551g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[2] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  timestamp LONG,  reportId INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38582i7)) {
            return false;
        }
        C38582i7 i7Var = (C38582i7) iAutoDBItem;
        return C46238a.m51546a(this.field_username, i7Var.field_username) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(i7Var.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(i7Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102553i == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f102559d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102554j == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102555n == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102556o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102559d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f102560e) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f102561f) {
            contentValues.put("reportId", Integer.valueOf(this.field_reportId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PersistentWxaSyncInvalidContactCmd ( " + f102557p.sql + ");");
        for (String add : f102552h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PersistentWxaSyncInvalidContactCmd", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102557p, "PersistentWxaSyncInvalidContactCmd", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PersistentWxaSyncInvalidContactCmd", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidContactCmd", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102557p;
    }

    public String[] getIndexCreateSQL() {
        return f102552h;
    }

    public StorageObserverOwner<C38582i7> getObserverOwner() {
        return f102558q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f102551g;
    }

    public String getTableName() {
        return f102551g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102559d = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102560e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f102561f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
