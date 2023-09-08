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

/* renamed from: xh.b9 */
public class C38535b9 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f101834f;

    /* renamed from: g */
    public static final String[] f101835g = new String[0];

    /* renamed from: h */
    public static final int f101836h = -1988896260;

    /* renamed from: i */
    public static final int f101837i = 230099550;

    /* renamed from: j */
    public static final int f101838j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f101839n = initAutoDBInfo(C38535b9.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38535b9> f101840o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101841d = true;

    /* renamed from: e */
    public boolean f101842e = true;
    public int field_tableHash;
    public String field_tableSQLMD5;

    static {
        SingleTable singleTable = new SingleTable("TablesVersion");
        f101834f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("tableHash", "int", singleTable.getName(), "");
        new Column("tableSQLMD5", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "tableHash";
        mAutoDBInfo.colsMap.put("tableHash", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "tableHash";
        mAutoDBInfo.columns[1] = "tableSQLMD5";
        mAutoDBInfo.colsMap.put("tableSQLMD5", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " tableHash INTEGER PRIMARY KEY ,  tableSQLMD5 TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38535b9)) {
            return false;
        }
        C38535b9 b9Var = (C38535b9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_tableHash), Integer.valueOf(b9Var.field_tableHash)) && C46238a.m51546a(this.field_tableSQLMD5, b9Var.field_tableSQLMD5);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101836h == hashCode) {
                    try {
                        this.field_tableHash = cursor.getInt(i);
                        this.f101841d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTablesVersion", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101837i == hashCode) {
                    try {
                        this.field_tableSQLMD5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTablesVersion", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101838j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101841d) {
            contentValues.put("tableHash", Integer.valueOf(this.field_tableHash));
        }
        if (this.f101842e) {
            contentValues.put("tableSQLMD5", this.field_tableSQLMD5);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTablesVersion", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TablesVersion ( " + f101839n.sql + ");");
        for (String add : f101835g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTablesVersion", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TablesVersion", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101839n, "TablesVersion", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTablesVersion", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TablesVersion", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTablesVersion", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101839n;
    }

    public String[] getIndexCreateSQL() {
        return f101835g;
    }

    public StorageObserverOwner<C38535b9> getObserverOwner() {
        return f101840o;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_tableHash);
    }

    public SingleTable getTable() {
        return f101834f;
    }

    public String getTableName() {
        return f101834f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("tableHash")) {
            this.field_tableHash = contentValues.getAsInteger("tableHash").intValue();
            if (z) {
                this.f101841d = true;
            }
        }
        if (contentValues.containsKey("tableSQLMD5")) {
            this.field_tableSQLMD5 = contentValues.getAsString("tableSQLMD5");
            if (z) {
                this.f101842e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
