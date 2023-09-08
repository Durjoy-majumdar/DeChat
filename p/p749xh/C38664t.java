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

/* renamed from: xh.t */
public class C38664t extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103728h;

    /* renamed from: i */
    public static final String[] f103729i = new String[0];

    /* renamed from: j */
    public static final int f103730j = 106079;

    /* renamed from: n */
    public static final int f103731n = 3076010;

    /* renamed from: o */
    public static final int f103732o = 1789070852;

    /* renamed from: p */
    public static final int f103733p = 3530753;

    /* renamed from: q */
    public static final int f103734q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103735r = initAutoDBInfo(C38664t.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38664t> f103736s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103737d = true;

    /* renamed from: e */
    public boolean f103738e = true;

    /* renamed from: f */
    public boolean f103739f = true;
    public String field_data;
    public String field_dataType;
    public String field_key;
    public int field_size;

    /* renamed from: g */
    public boolean f103740g = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandKVData");
        f103728h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("data", "string", singleTable.getName(), "");
        new Column("dataType", "string", singleTable.getName(), "");
        new Column("size", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "data";
        mAutoDBInfo.colsMap.put("data", "TEXT");
        mAutoDBInfo.columns[2] = "dataType";
        mAutoDBInfo.colsMap.put("dataType", "TEXT");
        mAutoDBInfo.columns[3] = "size";
        mAutoDBInfo.colsMap.put("size", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  data TEXT,  dataType TEXT,  size INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38664t)) {
            return false;
        }
        C38664t tVar = (C38664t) iAutoDBItem;
        return C46238a.m51546a(this.field_key, tVar.field_key) && C46238a.m51546a(this.field_data, tVar.field_data) && C46238a.m51546a(this.field_dataType, tVar.field_dataType) && C46238a.m51546a(Integer.valueOf(this.field_size), Integer.valueOf(tVar.field_size));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103730j == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f103737d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103731n == hashCode) {
                    try {
                        this.field_data = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103732o == hashCode) {
                    try {
                        this.field_dataType = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103733p == hashCode) {
                    try {
                        this.field_size = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandKVData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103734q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103737d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f103738e) {
            contentValues.put("data", this.field_data);
        }
        if (this.f103739f) {
            contentValues.put("dataType", this.field_dataType);
        }
        if (this.f103740g) {
            contentValues.put("size", Integer.valueOf(this.field_size));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandKVData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandKVData ( " + f103735r.sql + ");");
        for (String add : f103729i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandKVData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandKVData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103735r, "AppBrandKVData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandKVData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandKVData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandKVData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103735r;
    }

    public String[] getIndexCreateSQL() {
        return f103729i;
    }

    public StorageObserverOwner<C38664t> getObserverOwner() {
        return f103736s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f103728h;
    }

    public String getTableName() {
        return f103728h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f103737d = true;
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsString("data");
            if (z) {
                this.f103738e = true;
            }
        }
        if (contentValues.containsKey("dataType")) {
            this.field_dataType = contentValues.getAsString("dataType");
            if (z) {
                this.f103739f = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z) {
                this.f103740g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
