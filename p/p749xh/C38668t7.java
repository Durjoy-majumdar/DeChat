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

/* renamed from: xh.t7 */
public class C38668t7 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f103788i;

    /* renamed from: j */
    public static final String[] f103789j = new String[0];

    /* renamed from: n */
    public static final int f103790n = 93028124;

    /* renamed from: o */
    public static final int f103791o = 1484112759;

    /* renamed from: p */
    public static final int f103792p = 2066040210;

    /* renamed from: q */
    public static final int f103793q = -986540014;

    /* renamed from: r */
    public static final int f103794r = -427040401;

    /* renamed from: s */
    public static final int f103795s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f103796t = initAutoDBInfo(C38668t7.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38668t7> f103797u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103798d = true;

    /* renamed from: e */
    public boolean f103799e = true;

    /* renamed from: f */
    public boolean f103800f = true;
    public String field_appId;
    public int field_appVersion;
    public String field_decryptKey;
    public String field_pkgMd5;
    public int field_reportId;

    /* renamed from: g */
    public boolean f103801g = true;

    /* renamed from: h */
    public boolean f103802h = true;

    static {
        SingleTable singleTable = new SingleTable("PushWxaPkgDecryptKeyTable");
        f103788i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("decryptKey", "string", singleTable.getName(), "");
        new Column("pkgMd5", "string", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "decryptKey";
        mAutoDBInfo.colsMap.put("decryptKey", "TEXT");
        mAutoDBInfo.columns[3] = "pkgMd5";
        mAutoDBInfo.colsMap.put("pkgMd5", "TEXT");
        mAutoDBInfo.columns[4] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  appVersion INTEGER,  decryptKey TEXT,  pkgMd5 TEXT,  reportId INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38668t7)) {
            return false;
        }
        C38668t7 t7Var = (C38668t7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, t7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(t7Var.field_appVersion)) && C46238a.m51546a(this.field_decryptKey, t7Var.field_decryptKey) && C46238a.m51546a(this.field_pkgMd5, t7Var.field_pkgMd5) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(t7Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103790n == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103791o == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103792p == hashCode) {
                    try {
                        this.field_decryptKey = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103793q == hashCode) {
                    try {
                        this.field_pkgMd5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103794r == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103795s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103798d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103799e) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f103800f) {
            contentValues.put("decryptKey", this.field_decryptKey);
        }
        if (this.f103801g) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f103802h) {
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
            Log.m105920e("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PushWxaPkgDecryptKeyTable ( " + f103796t.sql + ");");
        for (String add : f103789j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PushWxaPkgDecryptKeyTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103796t, "PushWxaPkgDecryptKeyTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PushWxaPkgDecryptKeyTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103796t;
    }

    public String[] getIndexCreateSQL() {
        return f103789j;
    }

    public StorageObserverOwner<C38668t7> getObserverOwner() {
        return f103797u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103788i;
    }

    public String getTableName() {
        return f103788i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103798d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f103799e = true;
            }
        }
        if (contentValues.containsKey("decryptKey")) {
            this.field_decryptKey = contentValues.getAsString("decryptKey");
            if (z) {
                this.f103800f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z) {
                this.f103801g = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f103802h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
