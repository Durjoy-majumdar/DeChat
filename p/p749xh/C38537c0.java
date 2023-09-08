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

/* renamed from: xh.c0 */
public class C38537c0 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f101864A = -198232019;

    /* renamed from: B */
    public static final int f101865B = -1211149369;

    /* renamed from: C */
    public static final int f101866C = -2129294769;

    /* renamed from: D */
    public static final int f101867D = -1607243192;

    /* renamed from: E */
    public static final int f101868E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f101869F = initAutoDBInfo(C38537c0.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C38537c0> f101870G = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f101871r;

    /* renamed from: s */
    public static final String[] f101872s = {"CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)"};

    /* renamed from: t */
    public static final int f101873t = 93028124;

    /* renamed from: u */
    public static final int f101874u = 351608024;

    /* renamed from: v */
    public static final int f101875v = -670514810;

    /* renamed from: w */
    public static final int f101876w = -1964995618;

    /* renamed from: x */
    public static final int f101877x = 1536908355;

    /* renamed from: y */
    public static final int f101878y = -517880815;

    /* renamed from: z */
    public static final int f101879z = 1369213417;

    /* renamed from: d */
    public boolean f101880d = true;

    /* renamed from: e */
    public boolean f101881e = true;

    /* renamed from: f */
    public boolean f101882f = true;
    public String field_NewMd5;
    public String field_appId;
    public long field_checksum;
    public long field_createTime;
    public int field_debugType;
    public String field_downloadURL;
    public long field_endTime;
    public String field_pkgPath;
    public long field_startTime;
    public int field_version;
    public String field_versionMd5;

    /* renamed from: g */
    public boolean f101883g = true;

    /* renamed from: h */
    public boolean f101884h = true;

    /* renamed from: i */
    public boolean f101885i = true;

    /* renamed from: j */
    public boolean f101886j = true;

    /* renamed from: n */
    public boolean f101887n = true;

    /* renamed from: o */
    public boolean f101888o = true;

    /* renamed from: p */
    public boolean f101889p = true;

    /* renamed from: q */
    public boolean f101890q = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandWxaPkgManifestRecord");
        f101871r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("versionMd5", "string", singleTable.getName(), "");
        new Column("NewMd5", "string", singleTable.getName(), "");
        new Column("checksum", "long", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("debugType", "int", singleTable.getName(), "");
        new Column("downloadURL", "string", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("endTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[2] = "versionMd5";
        mAutoDBInfo.colsMap.put("versionMd5", "TEXT");
        mAutoDBInfo.columns[3] = "NewMd5";
        mAutoDBInfo.colsMap.put("NewMd5", "TEXT");
        mAutoDBInfo.columns[4] = "checksum";
        mAutoDBInfo.colsMap.put("checksum", "LONG");
        mAutoDBInfo.columns[5] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[6] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[7] = "debugType";
        mAutoDBInfo.colsMap.put("debugType", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "downloadURL";
        mAutoDBInfo.colsMap.put("downloadURL", "TEXT");
        mAutoDBInfo.columns[9] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[10] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "LONG");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  version INTEGER,  versionMd5 TEXT,  NewMd5 TEXT,  checksum LONG,  pkgPath TEXT,  createTime LONG,  debugType INTEGER default '0' ,  downloadURL TEXT,  startTime LONG,  endTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38537c0)) {
            return false;
        }
        C38537c0 c0Var = (C38537c0) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, c0Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(c0Var.field_version)) && C46238a.m51546a(this.field_versionMd5, c0Var.field_versionMd5) && C46238a.m51546a(this.field_NewMd5, c0Var.field_NewMd5) && C46238a.m51546a(Long.valueOf(this.field_checksum), Long.valueOf(c0Var.field_checksum)) && C46238a.m51546a(this.field_pkgPath, c0Var.field_pkgPath) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(c0Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_debugType), Integer.valueOf(c0Var.field_debugType)) && C46238a.m51546a(this.field_downloadURL, c0Var.field_downloadURL) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(c0Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_endTime), Long.valueOf(c0Var.field_endTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101873t == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101874u == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101875v == hashCode) {
                    try {
                        this.field_versionMd5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101876w == hashCode) {
                    try {
                        this.field_NewMd5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101877x == hashCode) {
                    try {
                        this.field_checksum = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101878y == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101879z == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101864A == hashCode) {
                    try {
                        this.field_debugType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101865B == hashCode) {
                    try {
                        this.field_downloadURL = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101866C == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101867D == hashCode) {
                    try {
                        this.field_endTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101868E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101880d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f101881e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f101882f) {
            contentValues.put("versionMd5", this.field_versionMd5);
        }
        if (this.f101883g) {
            contentValues.put("NewMd5", this.field_NewMd5);
        }
        if (this.f101884h) {
            contentValues.put("checksum", Long.valueOf(this.field_checksum));
        }
        if (this.f101885i) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f101886j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f101887n) {
            contentValues.put("debugType", Integer.valueOf(this.field_debugType));
        }
        if (this.f101888o) {
            contentValues.put("downloadURL", this.field_downloadURL);
        }
        if (this.f101889p) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f101890q) {
            contentValues.put("endTime", Long.valueOf(this.field_endTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgManifestRecord ( " + f101869F.sql + ");");
        for (String add : f101872s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandWxaPkgManifestRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101869F, "AppBrandWxaPkgManifestRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandWxaPkgManifestRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101869F;
    }

    public String[] getIndexCreateSQL() {
        return f101872s;
    }

    public StorageObserverOwner<C38537c0> getObserverOwner() {
        return f101870G;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101871r;
    }

    public String getTableName() {
        return f101871r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f101880d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f101881e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.field_versionMd5 = contentValues.getAsString("versionMd5");
            if (z) {
                this.f101882f = true;
            }
        }
        if (contentValues.containsKey("NewMd5")) {
            this.field_NewMd5 = contentValues.getAsString("NewMd5");
            if (z) {
                this.f101883g = true;
            }
        }
        if (contentValues.containsKey("checksum")) {
            this.field_checksum = contentValues.getAsLong("checksum").longValue();
            if (z) {
                this.f101884h = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f101885i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f101886j = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.field_debugType = contentValues.getAsInteger("debugType").intValue();
            if (z) {
                this.f101887n = true;
            }
        }
        if (contentValues.containsKey("downloadURL")) {
            this.field_downloadURL = contentValues.getAsString("downloadURL");
            if (z) {
                this.f101888o = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f101889p = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsLong("endTime").longValue();
            if (z) {
                this.f101890q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
