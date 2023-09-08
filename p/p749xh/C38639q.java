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

/* renamed from: xh.q */
public class C38639q extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103348f;

    /* renamed from: g */
    public static final String[] f103349g = new String[0];

    /* renamed from: h */
    public static final int f103350h = 106079;

    /* renamed from: i */
    public static final int f103351i = 111972721;

    /* renamed from: j */
    public static final int f103352j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103353n = initAutoDBInfo(C38639q.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38639q> f103354o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103355d = true;

    /* renamed from: e */
    public boolean f103356e = true;
    public String field_key;
    public String field_value;

    static {
        SingleTable singleTable = new SingleTable("AppBrandCommonKVData");
        f103348f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("value", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "value";
        mAutoDBInfo.colsMap.put("value", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  value TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38639q)) {
            return false;
        }
        C38639q qVar = (C38639q) iAutoDBItem;
        return C46238a.m51546a(this.field_key, qVar.field_key) && C46238a.m51546a(this.field_value, qVar.field_value);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103350h == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f103355d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonKVData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103351i == hashCode) {
                    try {
                        this.field_value = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandCommonKVData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103352j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103355d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f103356e) {
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
            Log.m105920e("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandCommonKVData ( " + f103353n.sql + ");");
        for (String add : f103349g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandCommonKVData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103353n, "AppBrandCommonKVData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandCommonKVData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandCommonKVData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103353n;
    }

    public String[] getIndexCreateSQL() {
        return f103349g;
    }

    public StorageObserverOwner<C38639q> getObserverOwner() {
        return f103354o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f103348f;
    }

    public String getTableName() {
        return f103348f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f103355d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.field_value = contentValues.getAsString("value");
            if (z) {
                this.f103356e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
