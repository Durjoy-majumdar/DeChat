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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.ma */
public class C91208ma extends IAutoDBItem {

    /* renamed from: A */
    public static final int f261603A = 2016003884;

    /* renamed from: B */
    public static final int f261604B = -224922910;

    /* renamed from: C */
    public static final int f261605C = -931648503;

    /* renamed from: D */
    public static final int f261606D = -1992054941;

    /* renamed from: E */
    public static final int f261607E = -2072012342;

    /* renamed from: F */
    public static final int f261608F = 315335255;

    /* renamed from: G */
    public static final int f261609G = -726230473;

    /* renamed from: H */
    public static final int f261610H = -1331513296;

    /* renamed from: I */
    public static final int f261611I = -1949736760;

    /* renamed from: J */
    public static final int f261612J = -1148597490;

    /* renamed from: K */
    public static final int f261613K = 217120882;

    /* renamed from: L */
    public static final int f261614L = 1953886731;

    /* renamed from: M */
    public static final int f261615M = 108705909;

    /* renamed from: N */
    public static final IAutoDBItem.MAutoDBInfo f261616N = initAutoDBInfo(C91208ma.class);

    /* renamed from: P */
    public static final StorageObserverOwner<C91208ma> f261617P = new StorageObserverOwner<>();

    /* renamed from: v */
    public static final SingleTable f261618v;

    /* renamed from: w */
    public static final String[] f261619w = new String[0];

    /* renamed from: x */
    public static final int f261620x = 3002454;

    /* renamed from: y */
    public static final int f261621y = -1360790959;

    /* renamed from: z */
    public static final int f261622z = 925931986;

    /* renamed from: d */
    public boolean f261623d = true;

    /* renamed from: e */
    public boolean f261624e = true;

    /* renamed from: f */
    public boolean f261625f = true;
    public int field_arch;
    public int field_consumingSnapshotCount;
    public boolean field_isNodeSnapshot;
    public int field_producingSnapshotCount;
    public int field_recoverCount;
    public String field_snapshotBaseConfig;
    public String field_snapshotCategory;
    public long field_snapshotLastModified;
    public long field_snapshotLength;
    public String field_snapshotMetaInfo;
    public String field_snapshotNodeConfig;
    public String field_snapshotPath;
    public String field_wxaPkgMd5;
    public String field_wxaPkgPath;
    public int field_wxaPkgVersion;

    /* renamed from: g */
    public boolean f261626g = true;

    /* renamed from: h */
    public boolean f261627h = true;

    /* renamed from: i */
    public boolean f261628i = true;

    /* renamed from: j */
    public boolean f261629j = true;

    /* renamed from: n */
    public boolean f261630n = true;

    /* renamed from: o */
    public boolean f261631o = true;

    /* renamed from: p */
    public boolean f261632p = true;

    /* renamed from: q */
    public boolean f261633q = true;

    /* renamed from: r */
    public boolean f261634r = true;

    /* renamed from: s */
    public boolean f261635s = true;

    /* renamed from: t */
    public boolean f261636t = true;

    /* renamed from: u */
    public boolean f261637u = true;

    static {
        SingleTable singleTable = new SingleTable("WxaPkgV8SnapshotInfoV3");
        f261618v = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("arch", "int", singleTable.getName(), "");
        new Column("wxaPkgPath", "string", singleTable.getName(), "");
        new Column("wxaPkgMd5", "string", singleTable.getName(), "");
        new Column("wxaPkgVersion", "int", singleTable.getName(), "");
        new Column("snapshotCategory", "string", singleTable.getName(), "");
        new Column("snapshotPath", "string", singleTable.getName(), "");
        new Column("snapshotLastModified", "long", singleTable.getName(), "");
        new Column("snapshotLength", "long", singleTable.getName(), "");
        new Column("snapshotBaseConfig", "string", singleTable.getName(), "");
        new Column("snapshotMetaInfo", "string", singleTable.getName(), "");
        new Column("isNodeSnapshot", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("snapshotNodeConfig", "string", singleTable.getName(), "");
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
        mAutoDBInfo.columns[4] = "snapshotCategory";
        mAutoDBInfo.colsMap.put("snapshotCategory", "TEXT");
        mAutoDBInfo.columns[5] = "snapshotPath";
        mAutoDBInfo.colsMap.put("snapshotPath", "TEXT");
        mAutoDBInfo.columns[6] = "snapshotLastModified";
        mAutoDBInfo.colsMap.put("snapshotLastModified", "LONG");
        mAutoDBInfo.columns[7] = "snapshotLength";
        mAutoDBInfo.colsMap.put("snapshotLength", "LONG");
        mAutoDBInfo.columns[8] = "snapshotBaseConfig";
        mAutoDBInfo.colsMap.put("snapshotBaseConfig", "TEXT");
        mAutoDBInfo.columns[9] = "snapshotMetaInfo";
        mAutoDBInfo.colsMap.put("snapshotMetaInfo", "TEXT");
        mAutoDBInfo.columns[10] = "isNodeSnapshot";
        mAutoDBInfo.colsMap.put("isNodeSnapshot", "INTEGER default 'false' ");
        mAutoDBInfo.columns[11] = "snapshotNodeConfig";
        mAutoDBInfo.colsMap.put("snapshotNodeConfig", "TEXT");
        mAutoDBInfo.columns[12] = "producingSnapshotCount";
        mAutoDBInfo.colsMap.put("producingSnapshotCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "consumingSnapshotCount";
        mAutoDBInfo.colsMap.put("consumingSnapshotCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "recoverCount";
        mAutoDBInfo.colsMap.put("recoverCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "rowid";
        mAutoDBInfo.sql = " arch INTEGER,  wxaPkgPath TEXT,  wxaPkgMd5 TEXT,  wxaPkgVersion INTEGER,  snapshotCategory TEXT,  snapshotPath TEXT,  snapshotLastModified LONG,  snapshotLength LONG,  snapshotBaseConfig TEXT,  snapshotMetaInfo TEXT,  isNodeSnapshot INTEGER default 'false' ,  snapshotNodeConfig TEXT,  producingSnapshotCount INTEGER default '0' ,  consumingSnapshotCount INTEGER default '0' ,  recoverCount INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91208ma)) {
            return false;
        }
        C91208ma maVar = (C91208ma) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_arch), Integer.valueOf(maVar.field_arch)) && C46238a.m51546a(this.field_wxaPkgPath, maVar.field_wxaPkgPath) && C46238a.m51546a(this.field_wxaPkgMd5, maVar.field_wxaPkgMd5) && C46238a.m51546a(Integer.valueOf(this.field_wxaPkgVersion), Integer.valueOf(maVar.field_wxaPkgVersion)) && C46238a.m51546a(this.field_snapshotCategory, maVar.field_snapshotCategory) && C46238a.m51546a(this.field_snapshotPath, maVar.field_snapshotPath) && C46238a.m51546a(Long.valueOf(this.field_snapshotLastModified), Long.valueOf(maVar.field_snapshotLastModified)) && C46238a.m51546a(Long.valueOf(this.field_snapshotLength), Long.valueOf(maVar.field_snapshotLength)) && C46238a.m51546a(this.field_snapshotBaseConfig, maVar.field_snapshotBaseConfig) && C46238a.m51546a(this.field_snapshotMetaInfo, maVar.field_snapshotMetaInfo) && C46238a.m51546a(Boolean.valueOf(this.field_isNodeSnapshot), Boolean.valueOf(maVar.field_isNodeSnapshot)) && C46238a.m51546a(this.field_snapshotNodeConfig, maVar.field_snapshotNodeConfig) && C46238a.m51546a(Integer.valueOf(this.field_producingSnapshotCount), Integer.valueOf(maVar.field_producingSnapshotCount)) && C46238a.m51546a(Integer.valueOf(this.field_consumingSnapshotCount), Integer.valueOf(maVar.field_consumingSnapshotCount)) && C46238a.m51546a(Integer.valueOf(this.field_recoverCount), Integer.valueOf(maVar.field_recoverCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261620x == hashCode) {
                    try {
                        this.field_arch = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261621y == hashCode) {
                    try {
                        this.field_wxaPkgPath = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261622z == hashCode) {
                    try {
                        this.field_wxaPkgMd5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261603A == hashCode) {
                    try {
                        this.field_wxaPkgVersion = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261604B == hashCode) {
                    try {
                        this.field_snapshotCategory = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261605C == hashCode) {
                    try {
                        this.field_snapshotPath = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261606D == hashCode) {
                    try {
                        this.field_snapshotLastModified = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261607E == hashCode) {
                    try {
                        this.field_snapshotLength = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261608F == hashCode) {
                    try {
                        this.field_snapshotBaseConfig = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261609G == hashCode) {
                    try {
                        this.field_snapshotMetaInfo = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261610H == hashCode) {
                    try {
                        this.field_isNodeSnapshot = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261611I == hashCode) {
                    try {
                        this.field_snapshotNodeConfig = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261612J == hashCode) {
                    try {
                        this.field_producingSnapshotCount = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261613K == hashCode) {
                    try {
                        this.field_consumingSnapshotCount = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261614L == hashCode) {
                    try {
                        this.field_recoverCount = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261615M == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261623d) {
            contentValues.put("arch", Integer.valueOf(this.field_arch));
        }
        if (this.f261624e) {
            contentValues.put("wxaPkgPath", this.field_wxaPkgPath);
        }
        if (this.f261625f) {
            contentValues.put("wxaPkgMd5", this.field_wxaPkgMd5);
        }
        if (this.f261626g) {
            contentValues.put("wxaPkgVersion", Integer.valueOf(this.field_wxaPkgVersion));
        }
        if (this.f261627h) {
            contentValues.put("snapshotCategory", this.field_snapshotCategory);
        }
        if (this.f261628i) {
            contentValues.put("snapshotPath", this.field_snapshotPath);
        }
        if (this.f261629j) {
            contentValues.put("snapshotLastModified", Long.valueOf(this.field_snapshotLastModified));
        }
        if (this.f261630n) {
            contentValues.put("snapshotLength", Long.valueOf(this.field_snapshotLength));
        }
        if (this.f261631o) {
            contentValues.put("snapshotBaseConfig", this.field_snapshotBaseConfig);
        }
        if (this.f261632p) {
            contentValues.put("snapshotMetaInfo", this.field_snapshotMetaInfo);
        }
        if (this.f261633q) {
            if (this.field_isNodeSnapshot) {
                contentValues.put("isNodeSnapshot", 1);
            } else {
                contentValues.put("isNodeSnapshot", 0);
            }
        }
        if (this.f261634r) {
            contentValues.put("snapshotNodeConfig", this.field_snapshotNodeConfig);
        }
        if (this.f261635s) {
            contentValues.put("producingSnapshotCount", Integer.valueOf(this.field_producingSnapshotCount));
        }
        if (this.f261636t) {
            contentValues.put("consumingSnapshotCount", Integer.valueOf(this.field_consumingSnapshotCount));
        }
        if (this.f261637u) {
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
            Log.m105920e("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaPkgV8SnapshotInfoV3 ( " + f261616N.sql + ");");
        for (String add : f261619w) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaPkgV8SnapshotInfoV3", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261616N, "WxaPkgV8SnapshotInfoV3", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaPkgV8SnapshotInfoV3", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaPkgV8SnapshotInfoV3", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261616N;
    }

    public String[] getIndexCreateSQL() {
        return f261619w;
    }

    public StorageObserverOwner<C91208ma> getObserverOwner() {
        return f261617P;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261618v;
    }

    public String getTableName() {
        return f261618v.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("arch")) {
            this.field_arch = contentValues.getAsInteger("arch").intValue();
            if (z) {
                this.f261623d = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.field_wxaPkgPath = contentValues.getAsString("wxaPkgPath");
            if (z) {
                this.f261624e = true;
            }
        }
        if (contentValues.containsKey("wxaPkgMd5")) {
            this.field_wxaPkgMd5 = contentValues.getAsString("wxaPkgMd5");
            if (z) {
                this.f261625f = true;
            }
        }
        if (contentValues.containsKey("wxaPkgVersion")) {
            this.field_wxaPkgVersion = contentValues.getAsInteger("wxaPkgVersion").intValue();
            if (z) {
                this.f261626g = true;
            }
        }
        if (contentValues.containsKey("snapshotCategory")) {
            this.field_snapshotCategory = contentValues.getAsString("snapshotCategory");
            if (z) {
                this.f261627h = true;
            }
        }
        if (contentValues.containsKey("snapshotPath")) {
            this.field_snapshotPath = contentValues.getAsString("snapshotPath");
            if (z) {
                this.f261628i = true;
            }
        }
        if (contentValues.containsKey("snapshotLastModified")) {
            this.field_snapshotLastModified = contentValues.getAsLong("snapshotLastModified").longValue();
            if (z) {
                this.f261629j = true;
            }
        }
        if (contentValues.containsKey("snapshotLength")) {
            this.field_snapshotLength = contentValues.getAsLong("snapshotLength").longValue();
            if (z) {
                this.f261630n = true;
            }
        }
        if (contentValues.containsKey("snapshotBaseConfig")) {
            this.field_snapshotBaseConfig = contentValues.getAsString("snapshotBaseConfig");
            if (z) {
                this.f261631o = true;
            }
        }
        if (contentValues.containsKey("snapshotMetaInfo")) {
            this.field_snapshotMetaInfo = contentValues.getAsString("snapshotMetaInfo");
            if (z) {
                this.f261632p = true;
            }
        }
        if (contentValues.containsKey("isNodeSnapshot")) {
            this.field_isNodeSnapshot = contentValues.getAsInteger("isNodeSnapshot").intValue() != 0;
            if (z) {
                this.f261633q = true;
            }
        }
        if (contentValues.containsKey("snapshotNodeConfig")) {
            this.field_snapshotNodeConfig = contentValues.getAsString("snapshotNodeConfig");
            if (z) {
                this.f261634r = true;
            }
        }
        if (contentValues.containsKey("producingSnapshotCount")) {
            this.field_producingSnapshotCount = contentValues.getAsInteger("producingSnapshotCount").intValue();
            if (z) {
                this.f261635s = true;
            }
        }
        if (contentValues.containsKey("consumingSnapshotCount")) {
            this.field_consumingSnapshotCount = contentValues.getAsInteger("consumingSnapshotCount").intValue();
            if (z) {
                this.f261636t = true;
            }
        }
        if (contentValues.containsKey("recoverCount")) {
            this.field_recoverCount = contentValues.getAsInteger("recoverCount").intValue();
            if (z) {
                this.f261637u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
