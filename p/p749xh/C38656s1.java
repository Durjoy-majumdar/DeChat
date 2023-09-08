package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
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

/* renamed from: xh.s1 */
public class C38656s1 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103572g;

    /* renamed from: h */
    public static final String[] f103573h = new String[0];

    /* renamed from: i */
    public static final int f103574i = 93028124;

    /* renamed from: j */
    public static final int f103575j = -892481550;

    /* renamed from: n */
    public static final int f103576n = 1211388583;

    /* renamed from: o */
    public static final int f103577o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103578p = initAutoDBInfo(C38656s1.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38656s1> f103579q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103580d = true;

    /* renamed from: e */
    public boolean f103581e = true;

    /* renamed from: f */
    public boolean f103582f = true;
    public String field_appId;
    public long field_modifyTime;
    public int field_status;

    static {
        SingleTable singleTable = new SingleTable("DownloadTaskItem");
        f103572g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("modifyTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[2] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  status INTEGER,  modifyTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38656s1)) {
            return false;
        }
        C38656s1 s1Var = (C38656s1) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, s1Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(s1Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(s1Var.field_modifyTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103574i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f103580d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103575j == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103576n == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseDownloadTaskItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103577o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103580d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103581e) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f103582f) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseDownloadTaskItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS DownloadTaskItem ( " + f103578p.sql + ");");
        for (String add : f103573h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseDownloadTaskItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("DownloadTaskItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103578p, "DownloadTaskItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseDownloadTaskItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("DownloadTaskItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseDownloadTaskItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103578p;
    }

    public String[] getIndexCreateSQL() {
        return f103573h;
    }

    public StorageObserverOwner<C38656s1> getObserverOwner() {
        return f103579q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f103572g;
    }

    public String getTableName() {
        return f103572g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103580d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f103581e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f103582f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
