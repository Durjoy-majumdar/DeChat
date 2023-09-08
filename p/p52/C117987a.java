package p52;

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
import p749xh.C66261f3;

/* renamed from: p52.a */
public class C117987a extends IAutoDBItem {

    /* renamed from: A */
    public static final int f352650A = 351608024;

    /* renamed from: B */
    public static final int f352651B = 116079;

    /* renamed from: C */
    public static final int f352652C = 107902;

    /* renamed from: D */
    public static final int f352653D = 1736147326;

    /* renamed from: E */
    public static final int f352654E = -1360790959;

    /* renamed from: F */
    public static final int f352655F = 2137794556;

    /* renamed from: G */
    public static final int f352656G = 108705909;

    /* renamed from: H */
    public static final IAutoDBItem.MAutoDBInfo f352657H = initAutoDBInfo(C117987a.class);

    /* renamed from: I */
    public static final StorageObserverOwner<C117987a> f352658I = new StorageObserverOwner<>();

    /* renamed from: s */
    public static final SingleTable f352659s;

    /* renamed from: t */
    public static final String[] f352660t = new String[0];

    /* renamed from: u */
    public static final int f352661u = 106723335;

    /* renamed from: v */
    public static final int f352662v = -517880815;

    /* renamed from: w */
    public static final int f352663w = -1200238067;

    /* renamed from: x */
    public static final int f352664x = -517738714;

    /* renamed from: y */
    public static final int f352665y = -791595133;

    /* renamed from: z */
    public static final int f352666z = -295931082;

    /* renamed from: d */
    public boolean f352667d = true;

    /* renamed from: e */
    public boolean f352668e = true;

    /* renamed from: f */
    public boolean f352669f = true;
    public long field_lastUseTime;
    public String field_md5;
    public String field_originalName;
    public String field_patchId;
    public String field_pkgId;
    public String field_pkgPath;
    public int field_pkgType;
    public String field_unZipPath;
    public long field_updateTime;
    public String field_url;
    public String field_version;
    public String field_wxaPkgPath;

    /* renamed from: g */
    public boolean f352670g = true;

    /* renamed from: h */
    public boolean f352671h = true;

    /* renamed from: i */
    public boolean f352672i = true;

    /* renamed from: j */
    public boolean f352673j = true;

    /* renamed from: n */
    public boolean f352674n = true;

    /* renamed from: o */
    public boolean f352675o = true;

    /* renamed from: p */
    public boolean f352676p = true;

    /* renamed from: q */
    public boolean f352677q = true;

    /* renamed from: r */
    public boolean f352678r = true;

    static {
        SingleTable singleTable = new SingleTable("MagicPkgInfo");
        f352659s = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("pkgId", "string", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
        new Column("unZipPath", "string", singleTable.getName(), "");
        new Column("pkgType", "int", singleTable.getName(), "");
        new Column("patchId", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("lastUseTime", "long", singleTable.getName(), "");
        new Column("wxaPkgPath", "string", singleTable.getName(), "");
        new Column("originalName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[12];
        String[] strArr = new String[13];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "pkgId";
        mAutoDBInfo.colsMap.put("pkgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "pkgId";
        mAutoDBInfo.columns[1] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[2] = "unZipPath";
        mAutoDBInfo.colsMap.put("unZipPath", "TEXT");
        mAutoDBInfo.columns[3] = "pkgType";
        mAutoDBInfo.colsMap.put("pkgType", "INTEGER");
        mAutoDBInfo.columns[4] = "patchId";
        mAutoDBInfo.colsMap.put("patchId", "TEXT");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "TEXT");
        mAutoDBInfo.columns[7] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[8] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[9] = "lastUseTime";
        mAutoDBInfo.colsMap.put("lastUseTime", "LONG");
        mAutoDBInfo.columns[10] = "wxaPkgPath";
        mAutoDBInfo.colsMap.put("wxaPkgPath", "TEXT");
        mAutoDBInfo.columns[11] = "originalName";
        mAutoDBInfo.colsMap.put("originalName", "TEXT");
        mAutoDBInfo.columns[12] = "rowid";
        mAutoDBInfo.sql = " pkgId TEXT PRIMARY KEY ,  pkgPath TEXT,  unZipPath TEXT,  pkgType INTEGER,  patchId TEXT,  updateTime LONG,  version TEXT,  url TEXT,  md5 TEXT,  lastUseTime LONG,  wxaPkgPath TEXT,  originalName TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C117987a)) {
            return false;
        }
        C117987a aVar = (C117987a) iAutoDBItem;
        return C46238a.m51546a(this.field_pkgId, aVar.field_pkgId) && C46238a.m51546a(this.field_pkgPath, aVar.field_pkgPath) && C46238a.m51546a(this.field_unZipPath, aVar.field_unZipPath) && C46238a.m51546a(Integer.valueOf(this.field_pkgType), Integer.valueOf(aVar.field_pkgType)) && C46238a.m51546a(this.field_patchId, aVar.field_patchId) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(aVar.field_updateTime)) && C46238a.m51546a(this.field_version, aVar.field_version) && C46238a.m51546a(this.field_url, aVar.field_url) && C46238a.m51546a(this.field_md5, aVar.field_md5) && C46238a.m51546a(Long.valueOf(this.field_lastUseTime), Long.valueOf(aVar.field_lastUseTime)) && C46238a.m51546a(this.field_wxaPkgPath, aVar.field_wxaPkgPath) && C46238a.m51546a(this.field_originalName, aVar.field_originalName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f352661u == hashCode) {
                    try {
                        this.field_pkgId = cursor.getString(i);
                        this.f352667d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352662v == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352663w == hashCode) {
                    try {
                        this.field_unZipPath = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352664x == hashCode) {
                    try {
                        this.field_pkgType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352665y == hashCode) {
                    try {
                        this.field_patchId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352666z == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352650A == hashCode) {
                    try {
                        this.field_version = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352651B == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352652C == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352653D == hashCode) {
                    try {
                        this.field_lastUseTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352654E == hashCode) {
                    try {
                        this.field_wxaPkgPath = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352655F == hashCode) {
                    try {
                        this.field_originalName = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMagicPkgInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f352656G == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f352667d) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f352668e) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f352669f) {
            contentValues.put("unZipPath", this.field_unZipPath);
        }
        if (this.f352670g) {
            contentValues.put("pkgType", Integer.valueOf(this.field_pkgType));
        }
        if (this.f352671h) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f352672i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f352673j) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.field_version);
        }
        if (this.f352674n) {
            contentValues.put("url", this.field_url);
        }
        if (this.f352675o) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f352676p) {
            contentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
        }
        if (this.f352677q) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f352678r) {
            contentValues.put("originalName", this.field_originalName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMagicPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MagicPkgInfo ( " + f352657H.sql + ");");
        for (String add : f352660t) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMagicPkgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MagicPkgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f352657H, "MagicPkgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMagicPkgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MagicPkgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMagicPkgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f352657H;
    }

    public String[] getIndexCreateSQL() {
        return f352660t;
    }

    public StorageObserverOwner<C117987a> getObserverOwner() {
        return f352658I;
    }

    public Object getPrimaryKeyValue() {
        return this.field_pkgId;
    }

    public SingleTable getTable() {
        return f352659s;
    }

    public String getTableName() {
        return f352659s.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z) {
                this.f352667d = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f352668e = true;
            }
        }
        if (contentValues.containsKey("unZipPath")) {
            this.field_unZipPath = contentValues.getAsString("unZipPath");
            if (z) {
                this.f352669f = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsInteger("pkgType").intValue();
            if (z) {
                this.f352670g = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z) {
                this.f352671h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f352672i = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (z) {
                this.f352673j = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f352674n = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f352675o = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z) {
                this.f352676p = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z) {
                this.f352677q = true;
            }
        }
        if (contentValues.containsKey("originalName")) {
            this.field_originalName = contentValues.getAsString("originalName");
            if (z) {
                this.f352678r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
