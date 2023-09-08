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

/* renamed from: xh.u9 */
public class C53351u9 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C53351u9> f149957A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f149958o;

    /* renamed from: p */
    public static final String[] f149959p = new String[0];

    /* renamed from: q */
    public static final int f149960q = 106723335;

    /* renamed from: r */
    public static final int f149961r = 351608024;

    /* renamed from: s */
    public static final int f149962s = -2066080591;

    /* renamed from: t */
    public static final int f149963t = -1379525908;

    /* renamed from: u */
    public static final int f149964u = 107902;

    /* renamed from: v */
    public static final int f149965v = -1211148345;

    /* renamed from: w */
    public static final int f149966w = -517783571;

    /* renamed from: x */
    public static final int f149967x = -2057421617;

    /* renamed from: y */
    public static final int f149968y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f149969z = initAutoDBInfo(C53351u9.class);

    /* renamed from: d */
    public boolean f149970d = true;

    /* renamed from: e */
    public boolean f149971e = true;

    /* renamed from: f */
    public boolean f149972f = true;
    public int field_downloadNetType;
    public String field_downloadUrl;
    public String field_md5;
    public String field_oldPath;
    public String field_oldVersion;
    public String field_pkgId;
    public int field_pkgSize;
    public String field_version;

    /* renamed from: g */
    public boolean f149973g = true;

    /* renamed from: h */
    public boolean f149974h = true;

    /* renamed from: i */
    public boolean f149975i = true;

    /* renamed from: j */
    public boolean f149976j = true;

    /* renamed from: n */
    public boolean f149977n = true;

    static {
        SingleTable singleTable = new SingleTable("WePkgDiffPackage");
        f149958o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("pkgId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "string", singleTable.getName(), "");
        new Column("oldVersion", "string", singleTable.getName(), "");
        new Column("oldPath", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column("pkgSize", "int", singleTable.getName(), "");
        new Column("downloadNetType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "pkgId";
        mAutoDBInfo.colsMap.put("pkgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "pkgId";
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "TEXT");
        mAutoDBInfo.columns[2] = "oldVersion";
        mAutoDBInfo.colsMap.put("oldVersion", "TEXT");
        mAutoDBInfo.columns[3] = "oldPath";
        mAutoDBInfo.colsMap.put("oldPath", "TEXT");
        mAutoDBInfo.columns[4] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[5] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT");
        mAutoDBInfo.columns[6] = "pkgSize";
        mAutoDBInfo.colsMap.put("pkgSize", "INTEGER");
        mAutoDBInfo.columns[7] = "downloadNetType";
        mAutoDBInfo.colsMap.put("downloadNetType", "INTEGER");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " pkgId TEXT PRIMARY KEY ,  version TEXT,  oldVersion TEXT,  oldPath TEXT,  md5 TEXT,  downloadUrl TEXT,  pkgSize INTEGER,  downloadNetType INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53351u9)) {
            return false;
        }
        C53351u9 u9Var = (C53351u9) iAutoDBItem;
        return C46238a.m51546a(this.field_pkgId, u9Var.field_pkgId) && C46238a.m51546a(this.field_version, u9Var.field_version) && C46238a.m51546a(this.field_oldVersion, u9Var.field_oldVersion) && C46238a.m51546a(this.field_oldPath, u9Var.field_oldPath) && C46238a.m51546a(this.field_md5, u9Var.field_md5) && C46238a.m51546a(this.field_downloadUrl, u9Var.field_downloadUrl) && C46238a.m51546a(Integer.valueOf(this.field_pkgSize), Integer.valueOf(u9Var.field_pkgSize)) && C46238a.m51546a(Integer.valueOf(this.field_downloadNetType), Integer.valueOf(u9Var.field_downloadNetType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149960q == hashCode) {
                    try {
                        this.field_pkgId = cursor.getString(i);
                        this.f149970d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149961r == hashCode) {
                    try {
                        this.field_version = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149962s == hashCode) {
                    try {
                        this.field_oldVersion = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149963t == hashCode) {
                    try {
                        this.field_oldPath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149964u == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149965v == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149966w == hashCode) {
                    try {
                        this.field_pkgSize = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149967x == hashCode) {
                    try {
                        this.field_downloadNetType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWePkgDiffPackage", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149968y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149970d) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f149971e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.field_version);
        }
        if (this.f149972f) {
            contentValues.put("oldVersion", this.field_oldVersion);
        }
        if (this.f149973g) {
            contentValues.put("oldPath", this.field_oldPath);
        }
        if (this.f149974h) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f149975i) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f149976j) {
            contentValues.put("pkgSize", Integer.valueOf(this.field_pkgSize));
        }
        if (this.f149977n) {
            contentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WePkgDiffPackage ( " + f149969z.sql + ");");
        for (String add : f149959p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WePkgDiffPackage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149969z, "WePkgDiffPackage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWePkgDiffPackage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WePkgDiffPackage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149969z;
    }

    public String[] getIndexCreateSQL() {
        return f149959p;
    }

    public StorageObserverOwner<C53351u9> getObserverOwner() {
        return f149957A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_pkgId;
    }

    public SingleTable getTable() {
        return f149958o;
    }

    public String getTableName() {
        return f149958o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z) {
                this.f149970d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (z) {
                this.f149971e = true;
            }
        }
        if (contentValues.containsKey("oldVersion")) {
            this.field_oldVersion = contentValues.getAsString("oldVersion");
            if (z) {
                this.f149972f = true;
            }
        }
        if (contentValues.containsKey("oldPath")) {
            this.field_oldPath = contentValues.getAsString("oldPath");
            if (z) {
                this.f149973g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f149974h = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f149975i = true;
            }
        }
        if (contentValues.containsKey("pkgSize")) {
            this.field_pkgSize = contentValues.getAsInteger("pkgSize").intValue();
            if (z) {
                this.f149976j = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.field_downloadNetType = contentValues.getAsInteger("downloadNetType").intValue();
            if (z) {
                this.f149977n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
