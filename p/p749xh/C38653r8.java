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

/* renamed from: xh.r8 */
public class C38653r8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f103537i;

    /* renamed from: j */
    public static final String[] f103538j = {"CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)"};

    /* renamed from: n */
    public static final int f103539n = 342668305;

    /* renamed from: o */
    public static final int f103540o = -1019779949;

    /* renamed from: p */
    public static final int f103541p = 342638917;

    /* renamed from: q */
    public static final int f103542q = 1639744519;

    /* renamed from: r */
    public static final int f103543r = 111972721;

    /* renamed from: s */
    public static final int f103544s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f103545t = initAutoDBInfo(C38653r8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38653r8> f103546u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103547d = true;

    /* renamed from: e */
    public boolean f103548e = true;

    /* renamed from: f */
    public boolean f103549f = true;
    public int field_errorcount;
    public int field_logsize;
    public long field_logtime;
    public int field_offset;
    public byte[] field_value;

    /* renamed from: g */
    public boolean f103550g = true;

    /* renamed from: h */
    public boolean f103551h = true;

    static {
        SingleTable singleTable = new SingleTable("SnsReportKv");
        f103537i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("logtime", "long", singleTable.getName(), "");
        new Column("offset", "int", singleTable.getName(), "");
        new Column("logsize", "int", singleTable.getName(), "");
        new Column("errorcount", "int", singleTable.getName(), "");
        new Column("value", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "logtime";
        mAutoDBInfo.colsMap.put("logtime", "LONG");
        mAutoDBInfo.columns[1] = "offset";
        mAutoDBInfo.colsMap.put("offset", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "logsize";
        mAutoDBInfo.colsMap.put("logsize", "INTEGER");
        mAutoDBInfo.columns[3] = "errorcount";
        mAutoDBInfo.colsMap.put("errorcount", "INTEGER");
        mAutoDBInfo.columns[4] = "value";
        mAutoDBInfo.colsMap.put("value", "BLOB");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " logtime LONG,  offset INTEGER default '0' ,  logsize INTEGER,  errorcount INTEGER,  value BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38653r8)) {
            return false;
        }
        C38653r8 r8Var = (C38653r8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_logtime), Long.valueOf(r8Var.field_logtime)) && C46238a.m51546a(Integer.valueOf(this.field_offset), Integer.valueOf(r8Var.field_offset)) && C46238a.m51546a(Integer.valueOf(this.field_logsize), Integer.valueOf(r8Var.field_logsize)) && C46238a.m51546a(Integer.valueOf(this.field_errorcount), Integer.valueOf(r8Var.field_errorcount)) && C46238a.m51546a(this.field_value, r8Var.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103539n == hashCode) {
                    try {
                        this.field_logtime = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103540o == hashCode) {
                    try {
                        this.field_offset = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103541p == hashCode) {
                    try {
                        this.field_logsize = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103542q == hashCode) {
                    try {
                        this.field_errorcount = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103543r == hashCode) {
                    try {
                        this.field_value = cursor.getBlob(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsReportKv", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103544s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103547d) {
            contentValues.put("logtime", Long.valueOf(this.field_logtime));
        }
        if (this.f103548e) {
            contentValues.put("offset", Integer.valueOf(this.field_offset));
        }
        if (this.f103549f) {
            contentValues.put("logsize", Integer.valueOf(this.field_logsize));
        }
        if (this.f103550g) {
            contentValues.put("errorcount", Integer.valueOf(this.field_errorcount));
        }
        if (this.f103551h) {
            contentValues.put("value", this.field_value);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsReportKv", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsReportKv ( " + f103545t.sql + ");");
        for (String add : f103538j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsReportKv", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsReportKv", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103545t, "SnsReportKv", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsReportKv", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsReportKv", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsReportKv", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103545t;
    }

    public String[] getIndexCreateSQL() {
        return f103538j;
    }

    public StorageObserverOwner<C38653r8> getObserverOwner() {
        return f103546u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103537i;
    }

    public String getTableName() {
        return f103537i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("logtime")) {
            this.field_logtime = contentValues.getAsLong("logtime").longValue();
            if (z) {
                this.f103547d = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z) {
                this.f103548e = true;
            }
        }
        if (contentValues.containsKey("logsize")) {
            this.field_logsize = contentValues.getAsInteger("logsize").intValue();
            if (z) {
                this.f103549f = true;
            }
        }
        if (contentValues.containsKey("errorcount")) {
            this.field_errorcount = contentValues.getAsInteger("errorcount").intValue();
            if (z) {
                this.f103550g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsByteArray("value");
            if (z) {
                this.f103551h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
