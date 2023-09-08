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

/* renamed from: xh.b0 */
public class C38527b0 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f101714g;

    /* renamed from: h */
    public static final String[] f101715h = new String[0];

    /* renamed from: i */
    public static final int f101716i = 93028124;

    /* renamed from: j */
    public static final int f101717j = 689108018;

    /* renamed from: n */
    public static final int f101718n = -670514810;

    /* renamed from: o */
    public static final int f101719o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f101720p = initAutoDBInfo(C38527b0.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38527b0> f101721q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101722d = true;

    /* renamed from: e */
    public boolean f101723e = true;

    /* renamed from: f */
    public boolean f101724f = true;
    public String field_appId;
    public String field_versionMd5;
    public int field_versionType;

    static {
        SingleTable singleTable = new SingleTable("AppBrandTestCodeVersionMarkTable");
        f101714g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("versionMd5", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[2] = "versionMd5";
        mAutoDBInfo.colsMap.put("versionMd5", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  versionType INTEGER,  versionMd5 TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38527b0)) {
            return false;
        }
        C38527b0 b0Var = (C38527b0) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, b0Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(b0Var.field_versionType)) && C46238a.m51546a(this.field_versionMd5, b0Var.field_versionMd5);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101716i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101717j == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101718n == hashCode) {
                    try {
                        this.field_versionMd5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101719o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101722d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f101723e) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f101724f) {
            contentValues.put("versionMd5", this.field_versionMd5);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandTestCodeVersionMarkTable ( " + f101720p.sql + ");");
        for (String add : f101715h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandTestCodeVersionMarkTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101720p, "AppBrandTestCodeVersionMarkTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandTestCodeVersionMarkTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101720p;
    }

    public String[] getIndexCreateSQL() {
        return f101715h;
    }

    public StorageObserverOwner<C38527b0> getObserverOwner() {
        return f101721q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101714g;
    }

    public String getTableName() {
        return f101714g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f101722d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f101723e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.field_versionMd5 = contentValues.getAsString("versionMd5");
            if (z) {
                this.f101724f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
