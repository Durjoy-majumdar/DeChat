package com.tencent.p014mm.plugin.lite.storage;

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

/* renamed from: com.tencent.mm.plugin.lite.storage.c */
public class C115503c extends IAutoDBItem {

    /* renamed from: A */
    public static final int f346296A = 351608024;

    /* renamed from: B */
    public static final int f346297B = 116079;

    /* renamed from: C */
    public static final int f346298C = 107902;

    /* renamed from: D */
    public static final int f346299D = 1736147326;

    /* renamed from: E */
    public static final int f346300E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f346301F = initAutoDBInfo(C115503c.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C115503c> f346302G = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f346303r;

    /* renamed from: s */
    public static final String[] f346304s = new String[0];

    /* renamed from: t */
    public static final int f346305t = 93028124;

    /* renamed from: u */
    public static final int f346306u = 293428218;

    /* renamed from: v */
    public static final int f346307v = -1471139193;

    /* renamed from: w */
    public static final int f346308w = -517880815;

    /* renamed from: x */
    public static final int f346309x = -517738714;

    /* renamed from: y */
    public static final int f346310y = -791595133;

    /* renamed from: z */
    public static final int f346311z = -295931082;

    /* renamed from: d */
    public boolean f346312d = true;

    /* renamed from: e */
    public boolean f346313e = true;

    /* renamed from: f */
    public boolean f346314f = true;
    public String field_appId;
    public String field_groupId;
    public long field_lastUseTime;
    public String field_md5;
    public String field_patchId;
    public String field_pkgPath;
    public String field_pkgType;
    public String field_signatureKey;
    public long field_updateTime;
    public String field_url;
    public String field_version;

    /* renamed from: g */
    public boolean f346315g = true;

    /* renamed from: h */
    public boolean f346316h = true;

    /* renamed from: i */
    public boolean f346317i = true;

    /* renamed from: j */
    public boolean f346318j = true;

    /* renamed from: n */
    public boolean f346319n = true;

    /* renamed from: o */
    public boolean f346320o = true;

    /* renamed from: p */
    public boolean f346321p = true;

    /* renamed from: q */
    public boolean f346322q = true;

    static {
        SingleTable singleTable = new SingleTable("LiteAppInfo");
        f346303r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("groupId", "string", singleTable.getName(), "");
        new Column("signatureKey", "string", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
        new Column("pkgType", "string", singleTable.getName(), "");
        new Column("patchId", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("lastUseTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "TEXT");
        mAutoDBInfo.columns[2] = "signatureKey";
        mAutoDBInfo.colsMap.put("signatureKey", "TEXT");
        mAutoDBInfo.columns[3] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[4] = "pkgType";
        mAutoDBInfo.colsMap.put("pkgType", "TEXT");
        mAutoDBInfo.columns[5] = "patchId";
        mAutoDBInfo.colsMap.put("patchId", "TEXT");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[7] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "TEXT");
        mAutoDBInfo.columns[8] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[9] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[10] = "lastUseTime";
        mAutoDBInfo.colsMap.put("lastUseTime", "LONG");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  groupId TEXT,  signatureKey TEXT,  pkgPath TEXT,  pkgType TEXT,  patchId TEXT,  updateTime LONG,  version TEXT,  url TEXT,  md5 TEXT,  lastUseTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C115503c)) {
            return false;
        }
        C115503c cVar = (C115503c) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, cVar.field_appId) && C46238a.m51546a(this.field_groupId, cVar.field_groupId) && C46238a.m51546a(this.field_signatureKey, cVar.field_signatureKey) && C46238a.m51546a(this.field_pkgPath, cVar.field_pkgPath) && C46238a.m51546a(this.field_pkgType, cVar.field_pkgType) && C46238a.m51546a(this.field_patchId, cVar.field_patchId) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(cVar.field_updateTime)) && C46238a.m51546a(this.field_version, cVar.field_version) && C46238a.m51546a(this.field_url, cVar.field_url) && C46238a.m51546a(this.field_md5, cVar.field_md5) && C46238a.m51546a(Long.valueOf(this.field_lastUseTime), Long.valueOf(cVar.field_lastUseTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f346305t == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f346312d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346306u == hashCode) {
                    try {
                        this.field_groupId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346307v == hashCode) {
                    try {
                        this.field_signatureKey = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346308w == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346309x == hashCode) {
                    try {
                        this.field_pkgType = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346310y == hashCode) {
                    try {
                        this.field_patchId = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346311z == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346296A == hashCode) {
                    try {
                        this.field_version = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346297B == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346298C == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346299D == hashCode) {
                    try {
                        this.field_lastUseTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346300E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f346312d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f346313e) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f346314f) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f346315g) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f346316h) {
            contentValues.put("pkgType", this.field_pkgType);
        }
        if (this.f346317i) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f346318j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f346319n) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.field_version);
        }
        if (this.f346320o) {
            contentValues.put("url", this.field_url);
        }
        if (this.f346321p) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f346322q) {
            contentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLiteAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LiteAppInfo ( " + f346301F.sql + ");");
        for (String add : f346304s) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LiteAppInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f346301F, "LiteAppInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LiteAppInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLiteAppInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f346301F;
    }

    public String[] getIndexCreateSQL() {
        return f346304s;
    }

    public StorageObserverOwner<C115503c> getObserverOwner() {
        return f346302G;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f346303r;
    }

    public String getTableName() {
        return f346303r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f346312d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z) {
                this.f346313e = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z) {
                this.f346314f = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f346315g = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsString("pkgType");
            if (z) {
                this.f346316h = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z) {
                this.f346317i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f346318j = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (z) {
                this.f346319n = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f346320o = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f346321p = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z) {
                this.f346322q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
