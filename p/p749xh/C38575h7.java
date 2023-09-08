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

/* renamed from: xh.h7 */
public class C38575h7 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102464g;

    /* renamed from: h */
    public static final String[] f102465h = new String[0];

    /* renamed from: i */
    public static final int f102466i = 93028124;

    /* renamed from: j */
    public static final int f102467j = 55126294;

    /* renamed from: n */
    public static final int f102468n = -427040401;

    /* renamed from: o */
    public static final int f102469o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102470p = initAutoDBInfo(C38575h7.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38575h7> f102471q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102472d = true;

    /* renamed from: e */
    public boolean f102473e = true;

    /* renamed from: f */
    public boolean f102474f = true;
    public String field_appId;
    public int field_reportId;
    public long field_timestamp;

    static {
        SingleTable singleTable = new SingleTable("PersistentWxaSyncInvalidCodeCmd");
        f102464g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[2] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  timestamp LONG,  reportId INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38575h7)) {
            return false;
        }
        C38575h7 h7Var = (C38575h7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, h7Var.field_appId) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(h7Var.field_timestamp)) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(h7Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102466i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f102472d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102467j == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102468n == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102469o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102472d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102473e) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f102474f) {
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
            Log.m105920e("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PersistentWxaSyncInvalidCodeCmd ( " + f102470p.sql + ");");
        for (String add : f102465h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PersistentWxaSyncInvalidCodeCmd", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102470p, "PersistentWxaSyncInvalidCodeCmd", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PersistentWxaSyncInvalidCodeCmd", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePersistentWxaSyncInvalidCodeCmd", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102470p;
    }

    public String[] getIndexCreateSQL() {
        return f102465h;
    }

    public StorageObserverOwner<C38575h7> getObserverOwner() {
        return f102471q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f102464g;
    }

    public String getTableName() {
        return f102464g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102472d = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102473e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f102474f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
