package com.tencent.p014mm.plugin.lite.storage;

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
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.lite.storage.b */
public class C115502b extends IAutoDBItem {

    /* renamed from: A */
    public static final int f346273A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f346274B = initAutoDBInfo(C115502b.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C115502b> f346275C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f346276p;

    /* renamed from: q */
    public static final String[] f346277q = new String[0];

    /* renamed from: r */
    public static final int f346278r = -606876449;

    /* renamed from: s */
    public static final int f346279s = -1471139193;

    /* renamed from: t */
    public static final int f346280t = -517880815;

    /* renamed from: u */
    public static final int f346281u = -517738714;

    /* renamed from: v */
    public static final int f346282v = -791595133;

    /* renamed from: w */
    public static final int f346283w = -295931082;

    /* renamed from: x */
    public static final int f346284x = 116079;

    /* renamed from: y */
    public static final int f346285y = 107902;

    /* renamed from: z */
    public static final int f346286z = 1736147326;

    /* renamed from: d */
    public boolean f346287d = true;

    /* renamed from: e */
    public boolean f346288e = true;

    /* renamed from: f */
    public boolean f346289f = true;
    public long field_lastUseTime;
    public String field_majorVersion;
    public String field_md5;
    public String field_patchId;
    public String field_pkgPath;
    public String field_pkgType;
    public String field_signatureKey;
    public long field_updateTime;
    public String field_url;

    /* renamed from: g */
    public boolean f346290g = true;

    /* renamed from: h */
    public boolean f346291h = true;

    /* renamed from: i */
    public boolean f346292i = true;

    /* renamed from: j */
    public boolean f346293j = true;

    /* renamed from: n */
    public boolean f346294n = true;

    /* renamed from: o */
    public boolean f346295o = true;

    static {
        SingleTable singleTable = new SingleTable("LiteAppBaselibInfo");
        f346276p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("majorVersion", "string", singleTable.getName(), "");
        new Column("signatureKey", "string", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
        new Column("pkgType", "string", singleTable.getName(), "");
        new Column("patchId", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("lastUseTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "majorVersion";
        mAutoDBInfo.colsMap.put("majorVersion", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "majorVersion";
        mAutoDBInfo.columns[1] = "signatureKey";
        mAutoDBInfo.colsMap.put("signatureKey", "TEXT");
        mAutoDBInfo.columns[2] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[3] = "pkgType";
        mAutoDBInfo.colsMap.put("pkgType", "TEXT");
        mAutoDBInfo.columns[4] = "patchId";
        mAutoDBInfo.colsMap.put("patchId", "TEXT");
        mAutoDBInfo.columns[5] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[6] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[7] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[8] = "lastUseTime";
        mAutoDBInfo.colsMap.put("lastUseTime", "LONG");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " majorVersion TEXT PRIMARY KEY ,  signatureKey TEXT,  pkgPath TEXT,  pkgType TEXT,  patchId TEXT,  updateTime LONG,  url TEXT,  md5 TEXT,  lastUseTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C115502b)) {
            return false;
        }
        C115502b bVar = (C115502b) iAutoDBItem;
        return C46238a.m51546a(this.field_majorVersion, bVar.field_majorVersion) && C46238a.m51546a(this.field_signatureKey, bVar.field_signatureKey) && C46238a.m51546a(this.field_pkgPath, bVar.field_pkgPath) && C46238a.m51546a(this.field_pkgType, bVar.field_pkgType) && C46238a.m51546a(this.field_patchId, bVar.field_patchId) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(bVar.field_updateTime)) && C46238a.m51546a(this.field_url, bVar.field_url) && C46238a.m51546a(this.field_md5, bVar.field_md5) && C46238a.m51546a(Long.valueOf(this.field_lastUseTime), Long.valueOf(bVar.field_lastUseTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f346278r == hashCode) {
                    try {
                        this.field_majorVersion = cursor.getString(i);
                        this.f346287d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346279s == hashCode) {
                    try {
                        this.field_signatureKey = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346280t == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346281u == hashCode) {
                    try {
                        this.field_pkgType = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346282v == hashCode) {
                    try {
                        this.field_patchId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346283w == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346284x == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346285y == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346286z == hashCode) {
                    try {
                        this.field_lastUseTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiteAppBaselibInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f346273A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f346287d) {
            contentValues.put("majorVersion", this.field_majorVersion);
        }
        if (this.f346288e) {
            contentValues.put("signatureKey", this.field_signatureKey);
        }
        if (this.f346289f) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f346290g) {
            contentValues.put("pkgType", this.field_pkgType);
        }
        if (this.f346291h) {
            contentValues.put("patchId", this.field_patchId);
        }
        if (this.f346292i) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f346293j) {
            contentValues.put("url", this.field_url);
        }
        if (this.f346294n) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f346295o) {
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
            Log.m105920e("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LiteAppBaselibInfo ( " + f346274B.sql + ");");
        for (String add : f346277q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LiteAppBaselibInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f346274B, "LiteAppBaselibInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LiteAppBaselibInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLiteAppBaselibInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f346274B;
    }

    public String[] getIndexCreateSQL() {
        return f346277q;
    }

    public StorageObserverOwner<C115502b> getObserverOwner() {
        return f346275C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_majorVersion;
    }

    public SingleTable getTable() {
        return f346276p;
    }

    public String getTableName() {
        return f346276p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("majorVersion")) {
            this.field_majorVersion = contentValues.getAsString("majorVersion");
            if (z) {
                this.f346287d = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.field_signatureKey = contentValues.getAsString("signatureKey");
            if (z) {
                this.f346288e = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f346289f = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.field_pkgType = contentValues.getAsString("pkgType");
            if (z) {
                this.f346290g = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.field_patchId = contentValues.getAsString("patchId");
            if (z) {
                this.f346291h = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f346292i = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f346293j = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f346294n = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.field_lastUseTime = contentValues.getAsLong("lastUseTime").longValue();
            if (z) {
                this.f346295o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
