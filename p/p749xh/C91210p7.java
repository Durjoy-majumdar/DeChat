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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.p7 */
public class C91210p7 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f261689A = 351608024;

    /* renamed from: B */
    public static final int f261690B = 3575610;

    /* renamed from: C */
    public static final int f261691C = -1148297858;

    /* renamed from: D */
    public static final int f261692D = 198222360;

    /* renamed from: E */
    public static final int f261693E = -1174977651;

    /* renamed from: F */
    public static final int f261694F = -1940613496;

    /* renamed from: G */
    public static final int f261695G = -986540014;

    /* renamed from: H */
    public static final int f261696H = 29312057;

    /* renamed from: I */
    public static final int f261697I = 908960928;

    /* renamed from: J */
    public static final int f261698J = 1493724063;

    /* renamed from: K */
    public static final int f261699K = 1279317997;

    /* renamed from: L */
    public static final int f261700L = -427040401;

    /* renamed from: M */
    public static final int f261701M = -1821065992;

    /* renamed from: N */
    public static final int f261702N = 109254796;

    /* renamed from: P */
    public static final int f261703P = -692288741;

    /* renamed from: Q */
    public static final int f261704Q = 1211737883;

    /* renamed from: R */
    public static final int f261705R = 108705909;

    /* renamed from: S */
    public static final IAutoDBItem.MAutoDBInfo f261706S = initAutoDBInfo(C91210p7.class);

    /* renamed from: T */
    public static final StorageObserverOwner<C91210p7> f261707T = new StorageObserverOwner<>();

    /* renamed from: x */
    public static final SingleTable f261708x;

    /* renamed from: y */
    public static final String[] f261709y = new String[0];

    /* renamed from: z */
    public static final int f261710z = 93028124;

    /* renamed from: d */
    public boolean f261711d = true;

    /* renamed from: e */
    public boolean f261712e = true;

    /* renamed from: f */
    public boolean f261713f = true;
    public String field_appId;
    public long field_cmdSequence;
    public boolean field_firstTimeTried;
    public long field_lastRetryTime;
    public String field_localRequestKey;
    public int field_networkType;
    public String field_packageKey;
    public int field_packageType;
    public String field_pkgMd5;
    public int field_reportId;
    public int field_retriedCount;
    public long field_retryInterval;
    public int field_retryTimes;
    public int field_scene;
    public boolean field_splitDownloadURLCgi;
    public int field_type;
    public int field_version;

    /* renamed from: g */
    public boolean f261714g = true;

    /* renamed from: h */
    public boolean f261715h = true;

    /* renamed from: i */
    public boolean f261716i = true;

    /* renamed from: j */
    public boolean f261717j = true;

    /* renamed from: n */
    public boolean f261718n = true;

    /* renamed from: o */
    public boolean f261719o = true;

    /* renamed from: p */
    public boolean f261720p = true;

    /* renamed from: q */
    public boolean f261721q = true;

    /* renamed from: r */
    public boolean f261722r = true;

    /* renamed from: s */
    public boolean f261723s = true;

    /* renamed from: t */
    public boolean f261724t = true;

    /* renamed from: u */
    public boolean f261725u = true;

    /* renamed from: v */
    public boolean f261726v = true;

    /* renamed from: w */
    public boolean f261727w = true;

    static {
        SingleTable singleTable = new SingleTable("PredownloadCmdGetCodePersistentInfo2");
        f261708x = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("retryTimes", "int", singleTable.getName(), "");
        new Column("retriedCount", "int", singleTable.getName(), "");
        new Column("retryInterval", "long", singleTable.getName(), "");
        new Column("networkType", "int", singleTable.getName(), "");
        new Column("pkgMd5", "string", singleTable.getName(), "");
        new Column("packageKey", "string", singleTable.getName(), "");
        new Column("packageType", "int", singleTable.getName(), "");
        new Column("lastRetryTime", "long", singleTable.getName(), "");
        new Column("firstTimeTried", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
        new Column("splitDownloadURLCgi", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("cmdSequence", "long", singleTable.getName(), "");
        new Column("localRequestKey", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[17];
        String[] strArr = new String[18];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "retryTimes";
        mAutoDBInfo.colsMap.put("retryTimes", "INTEGER");
        mAutoDBInfo.columns[4] = "retriedCount";
        mAutoDBInfo.colsMap.put("retriedCount", "INTEGER");
        mAutoDBInfo.columns[5] = "retryInterval";
        mAutoDBInfo.colsMap.put("retryInterval", "LONG");
        mAutoDBInfo.columns[6] = "networkType";
        mAutoDBInfo.colsMap.put("networkType", "INTEGER");
        mAutoDBInfo.columns[7] = "pkgMd5";
        mAutoDBInfo.colsMap.put("pkgMd5", "TEXT");
        mAutoDBInfo.columns[8] = "packageKey";
        mAutoDBInfo.colsMap.put("packageKey", "TEXT");
        mAutoDBInfo.columns[9] = "packageType";
        mAutoDBInfo.colsMap.put("packageType", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "lastRetryTime";
        mAutoDBInfo.colsMap.put("lastRetryTime", "LONG");
        mAutoDBInfo.columns[11] = "firstTimeTried";
        mAutoDBInfo.colsMap.put("firstTimeTried", "INTEGER");
        mAutoDBInfo.columns[12] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER");
        mAutoDBInfo.columns[13] = "splitDownloadURLCgi";
        mAutoDBInfo.colsMap.put("splitDownloadURLCgi", "INTEGER");
        mAutoDBInfo.columns[14] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[15] = "cmdSequence";
        mAutoDBInfo.colsMap.put("cmdSequence", "LONG");
        mAutoDBInfo.columns[16] = "localRequestKey";
        mAutoDBInfo.colsMap.put("localRequestKey", "TEXT");
        mAutoDBInfo.columns[17] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  version INTEGER,  type INTEGER,  retryTimes INTEGER,  retriedCount INTEGER,  retryInterval LONG,  networkType INTEGER,  pkgMd5 TEXT,  packageKey TEXT,  packageType INTEGER default '0' ,  lastRetryTime LONG,  firstTimeTried INTEGER,  reportId INTEGER,  splitDownloadURLCgi INTEGER,  scene INTEGER,  cmdSequence LONG,  localRequestKey TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91210p7)) {
            return false;
        }
        C91210p7 p7Var = (C91210p7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, p7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(p7Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(p7Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_retryTimes), Integer.valueOf(p7Var.field_retryTimes)) && C46238a.m51546a(Integer.valueOf(this.field_retriedCount), Integer.valueOf(p7Var.field_retriedCount)) && C46238a.m51546a(Long.valueOf(this.field_retryInterval), Long.valueOf(p7Var.field_retryInterval)) && C46238a.m51546a(Integer.valueOf(this.field_networkType), Integer.valueOf(p7Var.field_networkType)) && C46238a.m51546a(this.field_pkgMd5, p7Var.field_pkgMd5) && C46238a.m51546a(this.field_packageKey, p7Var.field_packageKey) && C46238a.m51546a(Integer.valueOf(this.field_packageType), Integer.valueOf(p7Var.field_packageType)) && C46238a.m51546a(Long.valueOf(this.field_lastRetryTime), Long.valueOf(p7Var.field_lastRetryTime)) && C46238a.m51546a(Boolean.valueOf(this.field_firstTimeTried), Boolean.valueOf(p7Var.field_firstTimeTried)) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(p7Var.field_reportId)) && C46238a.m51546a(Boolean.valueOf(this.field_splitDownloadURLCgi), Boolean.valueOf(p7Var.field_splitDownloadURLCgi)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(p7Var.field_scene)) && C46238a.m51546a(Long.valueOf(this.field_cmdSequence), Long.valueOf(p7Var.field_cmdSequence)) && C46238a.m51546a(this.field_localRequestKey, p7Var.field_localRequestKey);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261710z == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261689A == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261690B == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261691C == hashCode) {
                    try {
                        this.field_retryTimes = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261692D == hashCode) {
                    try {
                        this.field_retriedCount = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261693E == hashCode) {
                    try {
                        this.field_retryInterval = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261694F == hashCode) {
                    try {
                        this.field_networkType = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261695G == hashCode) {
                    try {
                        this.field_pkgMd5 = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261696H == hashCode) {
                    try {
                        this.field_packageKey = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261697I == hashCode) {
                    try {
                        this.field_packageType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261698J == hashCode) {
                    try {
                        this.field_lastRetryTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261699K == hashCode) {
                    try {
                        this.field_firstTimeTried = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261700L == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261701M == hashCode) {
                    try {
                        this.field_splitDownloadURLCgi = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261702N == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261703P == hashCode) {
                    try {
                        this.field_cmdSequence = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261704Q == hashCode) {
                    try {
                        this.field_localRequestKey = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261705R == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261711d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f261712e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f261713f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f261714g) {
            contentValues.put("retryTimes", Integer.valueOf(this.field_retryTimes));
        }
        if (this.f261715h) {
            contentValues.put("retriedCount", Integer.valueOf(this.field_retriedCount));
        }
        if (this.f261716i) {
            contentValues.put("retryInterval", Long.valueOf(this.field_retryInterval));
        }
        if (this.f261717j) {
            contentValues.put("networkType", Integer.valueOf(this.field_networkType));
        }
        if (this.f261718n) {
            contentValues.put("pkgMd5", this.field_pkgMd5);
        }
        if (this.f261719o) {
            contentValues.put("packageKey", this.field_packageKey);
        }
        if (this.f261720p) {
            contentValues.put("packageType", Integer.valueOf(this.field_packageType));
        }
        if (this.f261721q) {
            contentValues.put("lastRetryTime", Long.valueOf(this.field_lastRetryTime));
        }
        if (this.f261722r) {
            if (this.field_firstTimeTried) {
                contentValues.put("firstTimeTried", 1);
            } else {
                contentValues.put("firstTimeTried", 0);
            }
        }
        if (this.f261723s) {
            contentValues.put("reportId", Integer.valueOf(this.field_reportId));
        }
        if (this.f261724t) {
            if (this.field_splitDownloadURLCgi) {
                contentValues.put("splitDownloadURLCgi", 1);
            } else {
                contentValues.put("splitDownloadURLCgi", 0);
            }
        }
        if (this.f261725u) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f261726v) {
            contentValues.put("cmdSequence", Long.valueOf(this.field_cmdSequence));
        }
        if (this.f261727w) {
            contentValues.put("localRequestKey", this.field_localRequestKey);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PredownloadCmdGetCodePersistentInfo2 ( " + f261706S.sql + ");");
        for (String add : f261709y) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PredownloadCmdGetCodePersistentInfo2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261706S, "PredownloadCmdGetCodePersistentInfo2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PredownloadCmdGetCodePersistentInfo2", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePredownloadCmdGetCodePersistentInfo2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261706S;
    }

    public String[] getIndexCreateSQL() {
        return f261709y;
    }

    public StorageObserverOwner<C91210p7> getObserverOwner() {
        return f261707T;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261708x;
    }

    public String getTableName() {
        return f261708x.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f261711d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f261712e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f261713f = true;
            }
        }
        if (contentValues.containsKey("retryTimes")) {
            this.field_retryTimes = contentValues.getAsInteger("retryTimes").intValue();
            if (z) {
                this.f261714g = true;
            }
        }
        if (contentValues.containsKey("retriedCount")) {
            this.field_retriedCount = contentValues.getAsInteger("retriedCount").intValue();
            if (z) {
                this.f261715h = true;
            }
        }
        if (contentValues.containsKey("retryInterval")) {
            this.field_retryInterval = contentValues.getAsLong("retryInterval").longValue();
            if (z) {
                this.f261716i = true;
            }
        }
        if (contentValues.containsKey("networkType")) {
            this.field_networkType = contentValues.getAsInteger("networkType").intValue();
            if (z) {
                this.f261717j = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.field_pkgMd5 = contentValues.getAsString("pkgMd5");
            if (z) {
                this.f261718n = true;
            }
        }
        if (contentValues.containsKey("packageKey")) {
            this.field_packageKey = contentValues.getAsString("packageKey");
            if (z) {
                this.f261719o = true;
            }
        }
        if (contentValues.containsKey("packageType")) {
            this.field_packageType = contentValues.getAsInteger("packageType").intValue();
            if (z) {
                this.f261720p = true;
            }
        }
        if (contentValues.containsKey("lastRetryTime")) {
            this.field_lastRetryTime = contentValues.getAsLong("lastRetryTime").longValue();
            if (z) {
                this.f261721q = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("firstTimeTried")) {
            this.field_firstTimeTried = contentValues.getAsInteger("firstTimeTried").intValue() != 0;
            if (z) {
                this.f261722r = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f261723s = true;
            }
        }
        if (contentValues.containsKey("splitDownloadURLCgi")) {
            if (contentValues.getAsInteger("splitDownloadURLCgi").intValue() != 0) {
                z2 = true;
            }
            this.field_splitDownloadURLCgi = z2;
            if (z) {
                this.f261724t = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f261725u = true;
            }
        }
        if (contentValues.containsKey("cmdSequence")) {
            this.field_cmdSequence = contentValues.getAsLong("cmdSequence").longValue();
            if (z) {
                this.f261726v = true;
            }
        }
        if (contentValues.containsKey("localRequestKey")) {
            this.field_localRequestKey = contentValues.getAsString("localRequestKey");
            if (z) {
                this.f261727w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
