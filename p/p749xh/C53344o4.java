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

/* renamed from: xh.o4 */
public class C53344o4 extends IAutoDBItem {

    /* renamed from: A */
    public static final String[] f149726A = new String[0];

    /* renamed from: B */
    public static final int f149727B = 93028124;

    /* renamed from: C */
    public static final int f149728C = -1211148345;

    /* renamed from: D */
    public static final int f149729D = 3530753;

    /* renamed from: E */
    public static final int f149730E = 107902;

    /* renamed from: F */
    public static final int f149731F = 908759025;

    /* renamed from: G */
    public static final int f149732G = -834724724;

    /* renamed from: H */
    public static final int f149733H = 115642928;

    /* renamed from: I */
    public static final int f149734I = 2058846118;

    /* renamed from: J */
    public static final int f149735J = -1861083582;

    /* renamed from: K */
    public static final int f149736K = 971005237;

    /* renamed from: L */
    public static final int f149737L = -1040553866;

    /* renamed from: M */
    public static final int f149738M = 635887106;

    /* renamed from: N */
    public static final int f149739N = -1376008971;

    /* renamed from: P */
    public static final int f149740P = -238158823;

    /* renamed from: Q */
    public static final int f149741Q = -1903071972;

    /* renamed from: R */
    public static final int f149742R = -140817541;

    /* renamed from: S */
    public static final int f149743S = -893564815;

    /* renamed from: T */
    public static final int f149744T = -1222440703;

    /* renamed from: U */
    public static final int f149745U = 268770592;

    /* renamed from: V */
    public static final int f149746V = 108705909;

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f149747W = initAutoDBInfo(C53344o4.class);

    /* renamed from: X */
    public static final StorageObserverOwner<C53344o4> f149748X = new StorageObserverOwner<>();

    /* renamed from: z */
    public static final SingleTable f149749z;

    /* renamed from: d */
    public boolean f149750d = true;

    /* renamed from: e */
    public boolean f149751e = true;

    /* renamed from: f */
    public boolean f149752f = true;
    public String field_SecondaryUrl;
    public String field_appId;
    public boolean field_continueDelay;
    public boolean field_downloadInWidget;
    public String field_downloadUrl;
    public long field_expireTime;
    public int field_forceUpdateFlag;
    public boolean field_isFirst;
    public boolean field_isRunning;
    public boolean field_lowBattery;
    public String field_md5;
    public long field_nextCheckTime;
    public boolean field_noEnoughSpace;
    public boolean field_noSdcard;
    public boolean field_noWifi;
    public String field_packageName;
    public long field_randomTime;
    public byte[] field_sectionMd5Byte;
    public long field_size;

    /* renamed from: g */
    public boolean f149753g = true;

    /* renamed from: h */
    public boolean f149754h = true;

    /* renamed from: i */
    public boolean f149755i = true;

    /* renamed from: j */
    public boolean f149756j = true;

    /* renamed from: n */
    public boolean f149757n = true;

    /* renamed from: o */
    public boolean f149758o = true;

    /* renamed from: p */
    public boolean f149759p = true;

    /* renamed from: q */
    public boolean f149760q = true;

    /* renamed from: r */
    public boolean f149761r = true;

    /* renamed from: s */
    public boolean f149762s = true;

    /* renamed from: t */
    public boolean f149763t = true;

    /* renamed from: u */
    public boolean f149764u = true;

    /* renamed from: v */
    public boolean f149765v = true;

    /* renamed from: w */
    public boolean f149766w = true;

    /* renamed from: x */
    public boolean f149767x = true;

    /* renamed from: y */
    public boolean f149768y = true;

    static {
        SingleTable singleTable = new SingleTable("GameSilentDownload");
        f149749z = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("packageName", "string", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
        new Column("randomTime", "long", singleTable.getName(), "");
        new Column("isFirst", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("nextCheckTime", "long", singleTable.getName(), "");
        new Column("isRunning", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("noWifi", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("noSdcard", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("noEnoughSpace", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("lowBattery", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("continueDelay", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("SecondaryUrl", "string", singleTable.getName(), "");
        new Column("downloadInWidget", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("sectionMd5Byte", "byte[]", singleTable.getName(), "");
        new Column("forceUpdateFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[19];
        String[] strArr = new String[20];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT");
        mAutoDBInfo.columns[2] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[4] = "packageName";
        mAutoDBInfo.colsMap.put("packageName", "TEXT");
        mAutoDBInfo.columns[5] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG default '0' ");
        mAutoDBInfo.columns[6] = "randomTime";
        mAutoDBInfo.colsMap.put("randomTime", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "isFirst";
        mAutoDBInfo.colsMap.put("isFirst", "INTEGER default 'true' ");
        mAutoDBInfo.columns[8] = "nextCheckTime";
        mAutoDBInfo.colsMap.put("nextCheckTime", "LONG default '0' ");
        mAutoDBInfo.columns[9] = "isRunning";
        mAutoDBInfo.colsMap.put("isRunning", "INTEGER default 'false' ");
        mAutoDBInfo.columns[10] = "noWifi";
        mAutoDBInfo.colsMap.put("noWifi", "INTEGER default 'true' ");
        mAutoDBInfo.columns[11] = "noSdcard";
        mAutoDBInfo.colsMap.put("noSdcard", "INTEGER default 'true' ");
        mAutoDBInfo.columns[12] = "noEnoughSpace";
        mAutoDBInfo.colsMap.put("noEnoughSpace", "INTEGER default 'true' ");
        mAutoDBInfo.columns[13] = "lowBattery";
        mAutoDBInfo.colsMap.put("lowBattery", "INTEGER default 'true' ");
        mAutoDBInfo.columns[14] = "continueDelay";
        mAutoDBInfo.colsMap.put("continueDelay", "INTEGER default 'true' ");
        mAutoDBInfo.columns[15] = "SecondaryUrl";
        mAutoDBInfo.colsMap.put("SecondaryUrl", "TEXT");
        mAutoDBInfo.columns[16] = "downloadInWidget";
        mAutoDBInfo.colsMap.put("downloadInWidget", "INTEGER");
        mAutoDBInfo.columns[17] = "sectionMd5Byte";
        mAutoDBInfo.colsMap.put("sectionMd5Byte", "BLOB");
        mAutoDBInfo.columns[18] = "forceUpdateFlag";
        mAutoDBInfo.colsMap.put("forceUpdateFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  downloadUrl TEXT,  size LONG default '0' ,  md5 TEXT,  packageName TEXT,  expireTime LONG default '0' ,  randomTime LONG default '0' ,  isFirst INTEGER default 'true' ,  nextCheckTime LONG default '0' ,  isRunning INTEGER default 'false' ,  noWifi INTEGER default 'true' ,  noSdcard INTEGER default 'true' ,  noEnoughSpace INTEGER default 'true' ,  lowBattery INTEGER default 'true' ,  continueDelay INTEGER default 'true' ,  SecondaryUrl TEXT,  downloadInWidget INTEGER,  sectionMd5Byte BLOB,  forceUpdateFlag INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53344o4)) {
            return false;
        }
        C53344o4 o4Var = (C53344o4) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, o4Var.field_appId) && C46238a.m51546a(this.field_downloadUrl, o4Var.field_downloadUrl) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(o4Var.field_size)) && C46238a.m51546a(this.field_md5, o4Var.field_md5) && C46238a.m51546a(this.field_packageName, o4Var.field_packageName) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(o4Var.field_expireTime)) && C46238a.m51546a(Long.valueOf(this.field_randomTime), Long.valueOf(o4Var.field_randomTime)) && C46238a.m51546a(Boolean.valueOf(this.field_isFirst), Boolean.valueOf(o4Var.field_isFirst)) && C46238a.m51546a(Long.valueOf(this.field_nextCheckTime), Long.valueOf(o4Var.field_nextCheckTime)) && C46238a.m51546a(Boolean.valueOf(this.field_isRunning), Boolean.valueOf(o4Var.field_isRunning)) && C46238a.m51546a(Boolean.valueOf(this.field_noWifi), Boolean.valueOf(o4Var.field_noWifi)) && C46238a.m51546a(Boolean.valueOf(this.field_noSdcard), Boolean.valueOf(o4Var.field_noSdcard)) && C46238a.m51546a(Boolean.valueOf(this.field_noEnoughSpace), Boolean.valueOf(o4Var.field_noEnoughSpace)) && C46238a.m51546a(Boolean.valueOf(this.field_lowBattery), Boolean.valueOf(o4Var.field_lowBattery)) && C46238a.m51546a(Boolean.valueOf(this.field_continueDelay), Boolean.valueOf(o4Var.field_continueDelay)) && C46238a.m51546a(this.field_SecondaryUrl, o4Var.field_SecondaryUrl) && C46238a.m51546a(Boolean.valueOf(this.field_downloadInWidget), Boolean.valueOf(o4Var.field_downloadInWidget)) && C46238a.m51546a(this.field_sectionMd5Byte, o4Var.field_sectionMd5Byte) && C46238a.m51546a(Integer.valueOf(this.field_forceUpdateFlag), Integer.valueOf(o4Var.field_forceUpdateFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149727B == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f149750d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149728C == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149729D == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149730E == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149731F == hashCode) {
                    try {
                        this.field_packageName = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149732G == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149733H == hashCode) {
                    try {
                        this.field_randomTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149734I == hashCode) {
                    try {
                        this.field_isFirst = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149735J == hashCode) {
                    try {
                        this.field_nextCheckTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149736K == hashCode) {
                    try {
                        this.field_isRunning = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149737L == hashCode) {
                    try {
                        this.field_noWifi = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149738M == hashCode) {
                    try {
                        this.field_noSdcard = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149739N == hashCode) {
                    try {
                        this.field_noEnoughSpace = cursor.getInt(i) != 0;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149740P == hashCode) {
                    try {
                        this.field_lowBattery = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149741Q == hashCode) {
                    try {
                        this.field_continueDelay = cursor.getInt(i) != 0;
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149742R == hashCode) {
                    try {
                        this.field_SecondaryUrl = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149743S == hashCode) {
                    try {
                        this.field_downloadInWidget = cursor.getInt(i) != 0;
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149744T == hashCode) {
                    try {
                        this.field_sectionMd5Byte = cursor.getBlob(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149745U == hashCode) {
                    try {
                        this.field_forceUpdateFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSilentDownload", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149746V == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149750d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f149751e) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f149752f) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f149753g) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f149754h) {
            contentValues.put("packageName", this.field_packageName);
        }
        if (this.f149755i) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f149756j) {
            contentValues.put("randomTime", Long.valueOf(this.field_randomTime));
        }
        if (this.f149757n) {
            if (this.field_isFirst) {
                contentValues.put("isFirst", 1);
            } else {
                contentValues.put("isFirst", 0);
            }
        }
        if (this.f149758o) {
            contentValues.put("nextCheckTime", Long.valueOf(this.field_nextCheckTime));
        }
        if (this.f149759p) {
            if (this.field_isRunning) {
                contentValues.put("isRunning", 1);
            } else {
                contentValues.put("isRunning", 0);
            }
        }
        if (this.f149760q) {
            if (this.field_noWifi) {
                contentValues.put("noWifi", 1);
            } else {
                contentValues.put("noWifi", 0);
            }
        }
        if (this.f149761r) {
            if (this.field_noSdcard) {
                contentValues.put("noSdcard", 1);
            } else {
                contentValues.put("noSdcard", 0);
            }
        }
        if (this.f149762s) {
            if (this.field_noEnoughSpace) {
                contentValues.put("noEnoughSpace", 1);
            } else {
                contentValues.put("noEnoughSpace", 0);
            }
        }
        if (this.f149763t) {
            if (this.field_lowBattery) {
                contentValues.put("lowBattery", 1);
            } else {
                contentValues.put("lowBattery", 0);
            }
        }
        if (this.f149764u) {
            if (this.field_continueDelay) {
                contentValues.put("continueDelay", 1);
            } else {
                contentValues.put("continueDelay", 0);
            }
        }
        if (this.f149765v) {
            contentValues.put("SecondaryUrl", this.field_SecondaryUrl);
        }
        if (this.f149766w) {
            if (this.field_downloadInWidget) {
                contentValues.put("downloadInWidget", 1);
            } else {
                contentValues.put("downloadInWidget", 0);
            }
        }
        if (this.f149767x) {
            contentValues.put("sectionMd5Byte", this.field_sectionMd5Byte);
        }
        if (this.f149768y) {
            contentValues.put("forceUpdateFlag", Integer.valueOf(this.field_forceUpdateFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameSilentDownload", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameSilentDownload ( " + f149747W.sql + ");");
        for (String add : f149726A) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameSilentDownload", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameSilentDownload", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149747W, "GameSilentDownload", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameSilentDownload", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameSilentDownload", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameSilentDownload", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149747W;
    }

    public String[] getIndexCreateSQL() {
        return f149726A;
    }

    public StorageObserverOwner<C53344o4> getObserverOwner() {
        return f149748X;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f149749z;
    }

    public String getTableName() {
        return f149749z.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149750d = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f149751e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f149752f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f149753g = true;
            }
        }
        if (contentValues.containsKey("packageName")) {
            this.field_packageName = contentValues.getAsString("packageName");
            if (z) {
                this.f149754h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f149755i = true;
            }
        }
        if (contentValues.containsKey("randomTime")) {
            this.field_randomTime = contentValues.getAsLong("randomTime").longValue();
            if (z) {
                this.f149756j = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isFirst")) {
            this.field_isFirst = contentValues.getAsInteger("isFirst").intValue() != 0;
            if (z) {
                this.f149757n = true;
            }
        }
        if (contentValues.containsKey("nextCheckTime")) {
            this.field_nextCheckTime = contentValues.getAsLong("nextCheckTime").longValue();
            if (z) {
                this.f149758o = true;
            }
        }
        if (contentValues.containsKey("isRunning")) {
            this.field_isRunning = contentValues.getAsInteger("isRunning").intValue() != 0;
            if (z) {
                this.f149759p = true;
            }
        }
        if (contentValues.containsKey("noWifi")) {
            this.field_noWifi = contentValues.getAsInteger("noWifi").intValue() != 0;
            if (z) {
                this.f149760q = true;
            }
        }
        if (contentValues.containsKey("noSdcard")) {
            this.field_noSdcard = contentValues.getAsInteger("noSdcard").intValue() != 0;
            if (z) {
                this.f149761r = true;
            }
        }
        if (contentValues.containsKey("noEnoughSpace")) {
            this.field_noEnoughSpace = contentValues.getAsInteger("noEnoughSpace").intValue() != 0;
            if (z) {
                this.f149762s = true;
            }
        }
        if (contentValues.containsKey("lowBattery")) {
            this.field_lowBattery = contentValues.getAsInteger("lowBattery").intValue() != 0;
            if (z) {
                this.f149763t = true;
            }
        }
        if (contentValues.containsKey("continueDelay")) {
            this.field_continueDelay = contentValues.getAsInteger("continueDelay").intValue() != 0;
            if (z) {
                this.f149764u = true;
            }
        }
        if (contentValues.containsKey("SecondaryUrl")) {
            this.field_SecondaryUrl = contentValues.getAsString("SecondaryUrl");
            if (z) {
                this.f149765v = true;
            }
        }
        if (contentValues.containsKey("downloadInWidget")) {
            if (contentValues.getAsInteger("downloadInWidget").intValue() != 0) {
                z2 = true;
            }
            this.field_downloadInWidget = z2;
            if (z) {
                this.f149766w = true;
            }
        }
        if (contentValues.containsKey("sectionMd5Byte")) {
            this.field_sectionMd5Byte = contentValues.getAsByteArray("sectionMd5Byte");
            if (z) {
                this.f149767x = true;
            }
        }
        if (contentValues.containsKey("forceUpdateFlag")) {
            this.field_forceUpdateFlag = contentValues.getAsInteger("forceUpdateFlag").intValue();
            if (z) {
                this.f149768y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
