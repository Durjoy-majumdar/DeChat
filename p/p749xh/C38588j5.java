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

/* renamed from: xh.j5 */
public class C38588j5 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102627g;

    /* renamed from: h */
    public static final String[] f102628h = new String[0];

    /* renamed from: i */
    public static final int f102629i = -1477067101;

    /* renamed from: j */
    public static final int f102630j = 2122790276;

    /* renamed from: n */
    public static final int f102631n = -1893080319;

    /* renamed from: o */
    public static final int f102632o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102633p = initAutoDBInfo(C38588j5.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38588j5> f102634q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102635d = true;

    /* renamed from: e */
    public boolean f102636e = true;

    /* renamed from: f */
    public boolean f102637f = true;
    public long field_callTimeCount;
    public int field_countryCode;
    public long field_lastCallTime;

    static {
        SingleTable singleTable = new SingleTable("IPCallPopularCountry");
        f102627g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("countryCode", "int", singleTable.getName(), "");
        new Column("callTimeCount", "long", singleTable.getName(), "");
        new Column("lastCallTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "countryCode";
        mAutoDBInfo.colsMap.put("countryCode", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "countryCode";
        mAutoDBInfo.columns[1] = "callTimeCount";
        mAutoDBInfo.colsMap.put("callTimeCount", "LONG");
        mAutoDBInfo.columns[2] = "lastCallTime";
        mAutoDBInfo.colsMap.put("lastCallTime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " countryCode INTEGER PRIMARY KEY ,  callTimeCount LONG,  lastCallTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38588j5)) {
            return false;
        }
        C38588j5 j5Var = (C38588j5) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_countryCode), Integer.valueOf(j5Var.field_countryCode)) && C46238a.m51546a(Long.valueOf(this.field_callTimeCount), Long.valueOf(j5Var.field_callTimeCount)) && C46238a.m51546a(Long.valueOf(this.field_lastCallTime), Long.valueOf(j5Var.field_lastCallTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102629i == hashCode) {
                    try {
                        this.field_countryCode = cursor.getInt(i);
                        this.f102635d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102630j == hashCode) {
                    try {
                        this.field_callTimeCount = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102631n == hashCode) {
                    try {
                        this.field_lastCallTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallPopularCountry", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102632o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102635d) {
            contentValues.put("countryCode", Integer.valueOf(this.field_countryCode));
        }
        if (this.f102636e) {
            contentValues.put("callTimeCount", Long.valueOf(this.field_callTimeCount));
        }
        if (this.f102637f) {
            contentValues.put("lastCallTime", Long.valueOf(this.field_lastCallTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS IPCallPopularCountry ( " + f102633p.sql + ");");
        for (String add : f102628h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("IPCallPopularCountry", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102633p, "IPCallPopularCountry", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallPopularCountry", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("IPCallPopularCountry", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102633p;
    }

    public String[] getIndexCreateSQL() {
        return f102628h;
    }

    public StorageObserverOwner<C38588j5> getObserverOwner() {
        return f102634q;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_countryCode);
    }

    public SingleTable getTable() {
        return f102627g;
    }

    public String getTableName() {
        return f102627g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("countryCode")) {
            this.field_countryCode = contentValues.getAsInteger("countryCode").intValue();
            if (z) {
                this.f102635d = true;
            }
        }
        if (contentValues.containsKey("callTimeCount")) {
            this.field_callTimeCount = contentValues.getAsLong("callTimeCount").longValue();
            if (z) {
                this.f102636e = true;
            }
        }
        if (contentValues.containsKey("lastCallTime")) {
            this.field_lastCallTime = contentValues.getAsLong("lastCallTime").longValue();
            if (z) {
                this.f102637f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
