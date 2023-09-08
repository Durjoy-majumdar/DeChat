package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
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

/* renamed from: xh.q7 */
public class C38645q7 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f103416i;

    /* renamed from: j */
    public static final String[] f103417j = new String[0];

    /* renamed from: n */
    public static final int f103418n = 93028124;

    /* renamed from: o */
    public static final int f103419o = 351608024;

    /* renamed from: p */
    public static final int f103420p = 3575610;

    /* renamed from: q */
    public static final int f103421q = -986540014;

    /* renamed from: r */
    public static final int f103422r = -517880815;

    /* renamed from: s */
    public static final int f103423s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f103424t = initAutoDBInfo(C38645q7.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38645q7> f103425u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103426d = true;

    /* renamed from: e */
    public boolean f103427e = true;

    /* renamed from: f */
    public boolean f103428f = true;
    public String field_appId;
    public String field_pkgMd5;
    public String field_pkgPath;
    public int field_type;
    public int field_version;

    /* renamed from: g */
    public boolean f103429g = true;

    /* renamed from: h */
    public boolean f103430h = true;

    static {
        SingleTable singleTable = new SingleTable("PredownloadEncryptPkgInfo");
        f103416i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("pkgMd5", "string", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "pkgMd5";
        mAutoDBInfo.colsMap.put("pkgMd5", "TEXT");
        mAutoDBInfo.columns[4] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  version INTEGER,  type INTEGER,  pkgMd5 TEXT,  pkgPath TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38645q7)) {
            return false;
        }
        C38645q7 q7Var = (C38645q7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, q7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(q7Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(q7Var.field_type)) && C46238a.m51546a(this.field_pkgMd5, q7Var.field_pkgMd5) && C46238a.m51546a(this.field_pkgPath, q7Var.field_pkgPath);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103418n == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103419o == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103420p == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103421q == hashCode) {
                    try {
                        this.field_pkgMd5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103422r == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103423s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103426d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103427e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f103428f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f103429g) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f103430h) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PredownloadEncryptPkgInfo ( " + f103424t.sql + ");");
        for (String add : f103417j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PredownloadEncryptPkgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103424t, "PredownloadEncryptPkgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PredownloadEncryptPkgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103424t;
    }

    public String[] getIndexCreateSQL() {
        return f103417j;
    }

    public StorageObserverOwner<C38645q7> getObserverOwner() {
        return f103425u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103416i;
    }

    public String getTableName() {
        return f103416i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103426d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f103427e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103428f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z) {
                this.f103429g = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f103430h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
