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

/* renamed from: xh.y9 */
public class C38708y9 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104356i;

    /* renamed from: j */
    public static final String[] f104357j = new String[0];

    /* renamed from: n */
    public static final int f104358n = -799234740;

    /* renamed from: o */
    public static final int f104359o = 93028124;

    /* renamed from: p */
    public static final int f104360p = 95767015;

    /* renamed from: q */
    public static final int f104361q = 106079;

    /* renamed from: r */
    public static final int f104362r = 111972721;

    /* renamed from: s */
    public static final int f104363s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104364t = initAutoDBInfo(C38708y9.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38708y9> f104365u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104366d = true;

    /* renamed from: e */
    public boolean f104367e = true;

    /* renamed from: f */
    public boolean f104368f = true;
    public String field_appId;
    public String field_domin;
    public String field_key;
    public int field_recordId;
    public String field_value;

    /* renamed from: g */
    public boolean f104369g = true;

    /* renamed from: h */
    public boolean f104370h = true;

    static {
        SingleTable singleTable = new SingleTable("WebviewLocalData");
        f104356i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("recordId", "int", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("domin", "string", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("value", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "recordId";
        mAutoDBInfo.colsMap.put("recordId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "recordId";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "domin";
        mAutoDBInfo.colsMap.put("domin", "TEXT");
        mAutoDBInfo.columns[3] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT");
        mAutoDBInfo.columns[4] = "value";
        mAutoDBInfo.colsMap.put("value", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " recordId INTEGER PRIMARY KEY ,  appId TEXT,  domin TEXT,  key TEXT,  value TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38708y9)) {
            return false;
        }
        C38708y9 y9Var = (C38708y9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_recordId), Integer.valueOf(y9Var.field_recordId)) && C46238a.m51546a(this.field_appId, y9Var.field_appId) && C46238a.m51546a(this.field_domin, y9Var.field_domin) && C46238a.m51546a(this.field_key, y9Var.field_key) && C46238a.m51546a(this.field_value, y9Var.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104358n == hashCode) {
                    try {
                        this.field_recordId = cursor.getInt(i);
                        this.f104366d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104359o == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104360p == hashCode) {
                    try {
                        this.field_domin = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104361q == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104362r == hashCode) {
                    try {
                        this.field_value = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWebviewLocalData", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104363s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104366d) {
            contentValues.put("recordId", Integer.valueOf(this.field_recordId));
        }
        if (this.f104367e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104368f) {
            contentValues.put("domin", this.field_domin);
        }
        if (this.f104369g) {
            contentValues.put("key", this.field_key);
        }
        if (this.f104370h) {
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
            Log.m105920e("MicroMsg.SDK.BaseWebviewLocalData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WebviewLocalData ( " + f104364t.sql + ");");
        for (String add : f104357j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWebviewLocalData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WebviewLocalData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104364t, "WebviewLocalData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWebviewLocalData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WebviewLocalData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWebviewLocalData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104364t;
    }

    public String[] getIndexCreateSQL() {
        return f104357j;
    }

    public StorageObserverOwner<C38708y9> getObserverOwner() {
        return f104365u;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_recordId);
    }

    public SingleTable getTable() {
        return f104356i;
    }

    public String getTableName() {
        return f104356i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z) {
                this.f104366d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104367e = true;
            }
        }
        if (contentValues.containsKey("domin")) {
            this.field_domin = contentValues.getAsString("domin");
            if (z) {
                this.f104368f = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f104369g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z) {
                this.f104370h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
