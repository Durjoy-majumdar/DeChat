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

/* renamed from: xh.la */
public class C91207la extends IAutoDBItem {

    /* renamed from: A */
    public static final int f261568A = 2016003884;

    /* renamed from: B */
    public static final int f261569B = -1996836874;

    /* renamed from: C */
    public static final int f261570C = 1701671718;

    /* renamed from: D */
    public static final int f261571D = -266299312;

    /* renamed from: E */
    public static final int f261572E = -224922910;

    /* renamed from: F */
    public static final int f261573F = -931648503;

    /* renamed from: G */
    public static final int f261574G = -1992054941;

    /* renamed from: H */
    public static final int f261575H = -2072012342;

    /* renamed from: I */
    public static final int f261576I = -726230473;

    /* renamed from: J */
    public static final int f261577J = -1148597490;

    /* renamed from: K */
    public static final int f261578K = 217120882;

    /* renamed from: L */
    public static final int f261579L = 1953886731;

    /* renamed from: M */
    public static final int f261580M = 108705909;

    /* renamed from: N */
    public static final IAutoDBItem.MAutoDBInfo f261581N = initAutoDBInfo(C91207la.class);

    /* renamed from: P */
    public static final StorageObserverOwner<C91207la> f261582P = new StorageObserverOwner<>();

    /* renamed from: v */
    public static final SingleTable f261583v;

    /* renamed from: w */
    public static final String[] f261584w = new String[0];

    /* renamed from: x */
    public static final int f261585x = 3002454;

    /* renamed from: y */
    public static final int f261586y = -1360790959;

    /* renamed from: z */
    public static final int f261587z = 925931986;

    /* renamed from: d */
    public boolean f261588d = true;

    /* renamed from: e */
    public boolean f261589e = true;

    /* renamed from: f */
    public boolean f261590f = true;
    public int field_arch;
    public int field_consumingSnapshotCount;
    public String field_produceSnapshotConfig;
    public String field_produceSnapshotFlag;
    public int field_producingSnapshotCount;
    public int field_recoverCount;
    public String field_snapshotCategory;
    public long field_snapshotLastModified;
    public long field_snapshotLength;
    public String field_snapshotMetaInfo;
    public String field_snapshotPath;
    public String field_v8Version;
    public String field_wxaPkgMd5;
    public String field_wxaPkgPath;
    public int field_wxaPkgVersion;

    /* renamed from: g */
    public boolean f261591g = true;

    /* renamed from: h */
    public boolean f261592h = true;

    /* renamed from: i */
    public boolean f261593i = true;

    /* renamed from: j */
    public boolean f261594j = true;

    /* renamed from: n */
    public boolean f261595n = true;

    /* renamed from: o */
    public boolean f261596o = true;

    /* renamed from: p */
    public boolean f261597p = true;

    /* renamed from: q */
    public boolean f261598q = true;

    /* renamed from: r */
    public boolean f261599r = true;

    /* renamed from: s */
    public boolean f261600s = true;

    /* renamed from: t */
    public boolean f261601t = true;

    /* renamed from: u */
    public boolean f261602u = true;

    static {
        SingleTable singleTable = new SingleTable("WxaPkgV8SnapshotInfoV2");
        f261583v = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("arch", "int", singleTable.getName(), "");
        new Column("wxaPkgPath", "string", singleTable.getName(), "");
        new Column("wxaPkgMd5", "string", singleTable.getName(), "");
        new Column("wxaPkgVersion", "int", singleTable.getName(), "");
        new Column("v8Version", "string", singleTable.getName(), "");
        new Column("produceSnapshotConfig", "string", singleTable.getName(), "");
        new Column("produceSnapshotFlag", "string", singleTable.getName(), "");
        new Column("snapshotCategory", "string", singleTable.getName(), "");
        new Column("snapshotPath", "string", singleTable.getName(), "");
        new Column("snapshotLastModified", "long", singleTable.getName(), "");
        new Column("snapshotLength", "long", singleTable.getName(), "");
        new Column("snapshotMetaInfo", "string", singleTable.getName(), "");
        new Column("producingSnapshotCount", "int", singleTable.getName(), "");
        new Column("consumingSnapshotCount", "int", singleTable.getName(), "");
        new Column("recoverCount", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[15];
        String[] strArr = new String[16];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "arch";
        mAutoDBInfo.colsMap.put("arch", "INTEGER");
        mAutoDBInfo.columns[1] = "wxaPkgPath";
        mAutoDBInfo.colsMap.put("wxaPkgPath", "TEXT");
        mAutoDBInfo.columns[2] = "wxaPkgMd5";
        mAutoDBInfo.colsMap.put("wxaPkgMd5", "TEXT");
        mAutoDBInfo.columns[3] = "wxaPkgVersion";
        mAutoDBInfo.colsMap.put("wxaPkgVersion", "INTEGER");
        mAutoDBInfo.columns[4] = "v8Version";
        mAutoDBInfo.colsMap.put("v8Version", "TEXT");
        mAutoDBInfo.columns[5] = "produceSnapshotConfig";
        mAutoDBInfo.colsMap.put("produceSnapshotConfig", "TEXT");
        mAutoDBInfo.columns[6] = "produceSnapshotFlag";
        mAutoDBInfo.colsMap.put("produceSnapshotFlag", "TEXT");
        mAutoDBInfo.columns[7] = "snapshotCategory";
        mAutoDBInfo.colsMap.put("snapshotCategory", "TEXT");
        mAutoDBInfo.columns[8] = "snapshotPath";
        mAutoDBInfo.colsMap.put("snapshotPath", "TEXT");
        mAutoDBInfo.columns[9] = "snapshotLastModified";
        mAutoDBInfo.colsMap.put("snapshotLastModified", "LONG");
        mAutoDBInfo.columns[10] = "snapshotLength";
        mAutoDBInfo.colsMap.put("snapshotLength", "LONG");
        mAutoDBInfo.columns[11] = "snapshotMetaInfo";
        mAutoDBInfo.colsMap.put("snapshotMetaInfo", "TEXT");
        mAutoDBInfo.columns[12] = "producingSnapshotCount";
        mAutoDBInfo.colsMap.put("producingSnapshotCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "consumingSnapshotCount";
        mAutoDBInfo.colsMap.put("consumingSnapshotCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "recoverCount";
        mAutoDBInfo.colsMap.put("recoverCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "rowid";
        mAutoDBInfo.sql = " arch INTEGER,  wxaPkgPath TEXT,  wxaPkgMd5 TEXT,  wxaPkgVersion INTEGER,  v8Version TEXT,  produceSnapshotConfig TEXT,  produceSnapshotFlag TEXT,  snapshotCategory TEXT,  snapshotPath TEXT,  snapshotLastModified LONG,  snapshotLength LONG,  snapshotMetaInfo TEXT,  producingSnapshotCount INTEGER default '0' ,  consumingSnapshotCount INTEGER default '0' ,  recoverCount INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91207la)) {
            return false;
        }
        C91207la laVar = (C91207la) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_arch), Integer.valueOf(laVar.field_arch)) && C46238a.m51546a(this.field_wxaPkgPath, laVar.field_wxaPkgPath) && C46238a.m51546a(this.field_wxaPkgMd5, laVar.field_wxaPkgMd5) && C46238a.m51546a(Integer.valueOf(this.field_wxaPkgVersion), Integer.valueOf(laVar.field_wxaPkgVersion)) && C46238a.m51546a(this.field_v8Version, laVar.field_v8Version) && C46238a.m51546a(this.field_produceSnapshotConfig, laVar.field_produceSnapshotConfig) && C46238a.m51546a(this.field_produceSnapshotFlag, laVar.field_produceSnapshotFlag) && C46238a.m51546a(this.field_snapshotCategory, laVar.field_snapshotCategory) && C46238a.m51546a(this.field_snapshotPath, laVar.field_snapshotPath) && C46238a.m51546a(Long.valueOf(this.field_snapshotLastModified), Long.valueOf(laVar.field_snapshotLastModified)) && C46238a.m51546a(Long.valueOf(this.field_snapshotLength), Long.valueOf(laVar.field_snapshotLength)) && C46238a.m51546a(this.field_snapshotMetaInfo, laVar.field_snapshotMetaInfo) && C46238a.m51546a(Integer.valueOf(this.field_producingSnapshotCount), Integer.valueOf(laVar.field_producingSnapshotCount)) && C46238a.m51546a(Integer.valueOf(this.field_consumingSnapshotCount), Integer.valueOf(laVar.field_consumingSnapshotCount)) && C46238a.m51546a(Integer.valueOf(this.field_recoverCount), Integer.valueOf(laVar.field_recoverCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261585x == hashCode) {
                    try {
                        this.field_arch = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261586y == hashCode) {
                    try {
                        this.field_wxaPkgPath = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261587z == hashCode) {
                    try {
                        this.field_wxaPkgMd5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261568A == hashCode) {
                    try {
                        this.field_wxaPkgVersion = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261569B == hashCode) {
                    try {
                        this.field_v8Version = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261570C == hashCode) {
                    try {
                        this.field_produceSnapshotConfig = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261571D == hashCode) {
                    try {
                        this.field_produceSnapshotFlag = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261572E == hashCode) {
                    try {
                        this.field_snapshotCategory = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261573F == hashCode) {
                    try {
                        this.field_snapshotPath = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261574G == hashCode) {
                    try {
                        this.field_snapshotLastModified = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261575H == hashCode) {
                    try {
                        this.field_snapshotLength = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261576I == hashCode) {
                    try {
                        this.field_snapshotMetaInfo = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261577J == hashCode) {
                    try {
                        this.field_producingSnapshotCount = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261578K == hashCode) {
                    try {
                        this.field_consumingSnapshotCount = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261579L == hashCode) {
                    try {
                        this.field_recoverCount = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261580M == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261588d) {
            contentValues.put("arch", Integer.valueOf(this.field_arch));
        }
        if (this.f261589e) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f261590f) {
            contentValues.put("wxaPkgMd5", this.field_wxaPkgMd5);
        }
        if (this.f261591g) {
            contentValues.put("wxaPkgVersion", Integer.valueOf(this.field_wxaPkgVersion));
        }
        if (this.f261592h) {
            contentValues.put("v8Version", this.field_v8Version);
        }
        if (this.f261593i) {
            contentValues.put("produceSnapshotConfig", this.field_produceSnapshotConfig);
        }
        if (this.f261594j) {
            contentValues.put("produceSnapshotFlag", this.field_produceSnapshotFlag);
        }
        if (this.f261595n) {
            contentValues.put("snapshotCategory", this.field_snapshotCategory);
        }
        if (this.f261596o) {
            contentValues.put("snapshotPath", this.field_snapshotPath);
        }
        if (this.f261597p) {
            contentValues.put("snapshotLastModified", Long.valueOf(this.field_snapshotLastModified));
        }
        if (this.f261598q) {
            contentValues.put("snapshotLength", Long.valueOf(this.field_snapshotLength));
        }
        if (this.f261599r) {
            contentValues.put("snapshotMetaInfo", this.field_snapshotMetaInfo);
        }
        if (this.f261600s) {
            contentValues.put("producingSnapshotCount", Integer.valueOf(this.field_producingSnapshotCount));
        }
        if (this.f261601t) {
            contentValues.put("consumingSnapshotCount", Integer.valueOf(this.field_consumingSnapshotCount));
        }
        if (this.f261602u) {
            contentValues.put("recoverCount", Integer.valueOf(this.field_recoverCount));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaPkgV8SnapshotInfoV2 ( " + f261581N.sql + ");");
        for (String add : f261584w) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaPkgV8SnapshotInfoV2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261581N, "WxaPkgV8SnapshotInfoV2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaPkgV8SnapshotInfoV2", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261581N;
    }

    public String[] getIndexCreateSQL() {
        return f261584w;
    }

    public StorageObserverOwner<C91207la> getObserverOwner() {
        return f261582P;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261583v;
    }

    public String getTableName() {
        return f261583v.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("arch")) {
            this.field_arch = contentValues.getAsInteger("arch").intValue();
            if (z) {
                this.f261588d = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z) {
                this.f261589e = true;
            }
        }
        if (contentValues.containsKey("wxaPkgMd5")) {
            this.field_wxaPkgMd5 = contentValues.getAsString("wxaPkgMd5");
            if (z) {
                this.f261590f = true;
            }
        }
        if (contentValues.containsKey("wxaPkgVersion")) {
            this.field_wxaPkgVersion = contentValues.getAsInteger("wxaPkgVersion").intValue();
            if (z) {
                this.f261591g = true;
            }
        }
        if (contentValues.containsKey("v8Version")) {
            this.field_v8Version = contentValues.getAsString("v8Version");
            if (z) {
                this.f261592h = true;
            }
        }
        if (contentValues.containsKey("produceSnapshotConfig")) {
            this.field_produceSnapshotConfig = contentValues.getAsString("produceSnapshotConfig");
            if (z) {
                this.f261593i = true;
            }
        }
        if (contentValues.containsKey("produceSnapshotFlag")) {
            this.field_produceSnapshotFlag = contentValues.getAsString("produceSnapshotFlag");
            if (z) {
                this.f261594j = true;
            }
        }
        if (contentValues.containsKey("snapshotCategory")) {
            this.field_snapshotCategory = contentValues.getAsString("snapshotCategory");
            if (z) {
                this.f261595n = true;
            }
        }
        if (contentValues.containsKey("snapshotPath")) {
            this.field_snapshotPath = contentValues.getAsString("snapshotPath");
            if (z) {
                this.f261596o = true;
            }
        }
        if (contentValues.containsKey("snapshotLastModified")) {
            this.field_snapshotLastModified = contentValues.getAsLong("snapshotLastModified").longValue();
            if (z) {
                this.f261597p = true;
            }
        }
        if (contentValues.containsKey("snapshotLength")) {
            this.field_snapshotLength = contentValues.getAsLong("snapshotLength").longValue();
            if (z) {
                this.f261598q = true;
            }
        }
        if (contentValues.containsKey("snapshotMetaInfo")) {
            this.field_snapshotMetaInfo = contentValues.getAsString("snapshotMetaInfo");
            if (z) {
                this.f261599r = true;
            }
        }
        if (contentValues.containsKey("producingSnapshotCount")) {
            this.field_producingSnapshotCount = contentValues.getAsInteger("producingSnapshotCount").intValue();
            if (z) {
                this.f261600s = true;
            }
        }
        if (contentValues.containsKey("consumingSnapshotCount")) {
            this.field_consumingSnapshotCount = contentValues.getAsInteger("consumingSnapshotCount").intValue();
            if (z) {
                this.f261601t = true;
            }
        }
        if (contentValues.containsKey("recoverCount")) {
            this.field_recoverCount = contentValues.getAsInteger("recoverCount").intValue();
            if (z) {
                this.f261602u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
