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
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.x7 */
public class C118881x7 extends IAutoDBItem {

    /* renamed from: P */
    public static final SingleTable f356069P;

    /* renamed from: Q */
    public static final String[] f356070Q = new String[0];

    /* renamed from: Q0 */
    public static final int f356071Q0 = 107902;

    /* renamed from: R */
    public static final int f356072R = -913313558;

    /* renamed from: R0 */
    public static final int f356073R0 = 506340215;

    /* renamed from: S */
    public static final int f356074S = -836782480;

    /* renamed from: S0 */
    public static final int f356075S0 = 506340216;

    /* renamed from: T */
    public static final int f356076T = 116079;

    /* renamed from: T0 */
    public static final int f356077T0 = -1165461084;

    /* renamed from: U */
    public static final int f356078U = -2044601412;

    /* renamed from: U0 */
    public static final int f356079U0 = 1664327583;

    /* renamed from: V */
    public static final int f356080V = -1940613496;

    /* renamed from: V0 */
    public static final int f356081V0 = 1550463001;

    /* renamed from: W */
    public static final int f356082W = 1974301186;

    /* renamed from: W0 */
    public static final int f356083W0 = 1096575994;

    /* renamed from: X */
    public static final int f356084X = -1148297858;

    /* renamed from: X0 */
    public static final int f356085X0 = -1868521062;

    /* renamed from: Y */
    public static final int f356086Y = -735662143;

    /* renamed from: Y0 */
    public static final int f356087Y0 = -427040401;

    /* renamed from: Z */
    public static final int f356088Z = -892481550;

    /* renamed from: Z0 */
    public static final int f356089Z0 = 1975565413;

    /* renamed from: a1 */
    public static final int f356090a1 = -849488205;

    /* renamed from: b1 */
    public static final int f356091b1 = 1731528173;

    /* renamed from: c1 */
    public static final int f356092c1 = -1867314946;

    /* renamed from: d1 */
    public static final int f356093d1 = 291500361;

    /* renamed from: e1 */
    public static final int f356094e1 = -1512661574;

    /* renamed from: f1 */
    public static final int f356095f1 = 726531449;

    /* renamed from: g1 */
    public static final int f356096g1 = 68640;

    /* renamed from: h1 */
    public static final int f356097h1 = -735564899;

    /* renamed from: i1 */
    public static final int f356098i1 = 1064015794;

    /* renamed from: j1 */
    public static final int f356099j1 = 93028124;

    /* renamed from: k1 */
    public static final int f356100k1 = 647790013;

    /* renamed from: l1 */
    public static final int f356101l1 = 1802060801;

    /* renamed from: m1 */
    public static final int f356102m1 = 108705909;

    /* renamed from: n1 */
    public static final IAutoDBItem.MAutoDBInfo f356103n1 = initAutoDBInfo(C118881x7.class);

    /* renamed from: o1 */
    public static final StorageObserverOwner<C118881x7> f356104o1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f356105p0 = -540713793;

    /* renamed from: x0 */
    public static final int f356106x0 = -389131437;

    /* renamed from: y0 */
    public static final int f356107y0 = -834724724;

    /* renamed from: A */
    public boolean f356108A = true;

    /* renamed from: B */
    public boolean f356109B = true;

    /* renamed from: C */
    public boolean f356110C = true;

    /* renamed from: D */
    public boolean f356111D = true;

    /* renamed from: E */
    public boolean f356112E = true;

    /* renamed from: F */
    public boolean f356113F = true;

    /* renamed from: G */
    public boolean f356114G = true;

    /* renamed from: H */
    public boolean f356115H = true;

    /* renamed from: I */
    public boolean f356116I = true;

    /* renamed from: J */
    public boolean f356117J = true;

    /* renamed from: K */
    public boolean f356118K = true;

    /* renamed from: L */
    public boolean f356119L = true;

    /* renamed from: M */
    public boolean f356120M = true;

    /* renamed from: N */
    public boolean f356121N = true;

    /* renamed from: d */
    public boolean f356122d = true;

    /* renamed from: e */
    public boolean f356123e = true;

    /* renamed from: f */
    public boolean f356124f = true;
    public int field_EID;
    public String field_appId;
    public long field_contentLength;
    public String field_contentType;
    public boolean field_deleted;
    public byte[] field_eccSignature;
    public String field_encryptKey;
    public long field_expireTime;
    public boolean field_fileCompress;
    public boolean field_fileEncrypt;
    public String field_filePath;
    public long field_fileSize;
    public boolean field_fileUpdated;
    public String field_fileVersion;
    public String field_groupId1;
    public String field_groupId2;
    public int field_keyVersion;
    public int field_maxRetryTimes;
    public String field_md5;
    public boolean field_needRetry;
    public int field_networkType;
    public String field_originalMd5;
    public String field_packageId;
    public int field_priority;
    public long field_reportId;
    public int field_resType;
    public int field_retryTimes;
    public String field_sampleId;
    public int field_status;
    public int field_subType;
    public String field_url;
    public String field_urlKey;
    public int field_urlKey_hashcode;
    public int field_wvCacheType;

    /* renamed from: g */
    public boolean f356125g = true;

    /* renamed from: h */
    public boolean f356126h = true;

    /* renamed from: i */
    public boolean f356127i = true;

    /* renamed from: j */
    public boolean f356128j = true;

    /* renamed from: n */
    public boolean f356129n = true;

    /* renamed from: o */
    public boolean f356130o = true;

    /* renamed from: p */
    public boolean f356131p = true;

    /* renamed from: q */
    public boolean f356132q = true;

    /* renamed from: r */
    public boolean f356133r = true;

    /* renamed from: s */
    public boolean f356134s = true;

    /* renamed from: t */
    public boolean f356135t = true;

    /* renamed from: u */
    public boolean f356136u = true;

    /* renamed from: v */
    public boolean f356137v = true;

    /* renamed from: w */
    public boolean f356138w = true;

    /* renamed from: x */
    public boolean f356139x = true;

    /* renamed from: y */
    public boolean f356140y = true;

    /* renamed from: z */
    public boolean f356141z = true;

    static {
        SingleTable singleTable = new SingleTable("ResDownloaderRecordTable");
        f356069P = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("urlKey_hashcode", "int", singleTable.getName(), "");
        new Column("urlKey", "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("fileVersion", "string", singleTable.getName(), "");
        new Column("networkType", "int", singleTable.getName(), "");
        new Column("maxRetryTimes", "int", singleTable.getName(), "");
        new Column("retryTimes", "int", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("contentLength", "long", singleTable.getName(), "");
        new Column(DownloadInfo.CONTENTTYPE, "string", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("groupId1", "string", singleTable.getName(), "");
        new Column("groupId2", "string", singleTable.getName(), "");
        new Column(DownloadInfo.PRIORITY, "int", singleTable.getName(), "");
        new Column("fileUpdated", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("deleted", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("resType", "int", singleTable.getName(), "");
        new Column("subType", "int", singleTable.getName(), "");
        new Column("reportId", "long", singleTable.getName(), "");
        new Column("sampleId", "string", singleTable.getName(), "");
        new Column("eccSignature", "byte[]", singleTable.getName(), "");
        new Column("originalMd5", "string", singleTable.getName(), "");
        new Column("fileCompress", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("fileEncrypt", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("encryptKey", "string", singleTable.getName(), "");
        new Column("keyVersion", "int", singleTable.getName(), "");
        new Column("EID", "int", singleTable.getName(), "");
        new Column("fileSize", "long", singleTable.getName(), "");
        new Column("needRetry", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("wvCacheType", "int", singleTable.getName(), "");
        new Column("packageId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[34];
        String[] strArr = new String[35];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "urlKey_hashcode";
        mAutoDBInfo.colsMap.put("urlKey_hashcode", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "urlKey_hashcode";
        mAutoDBInfo.columns[1] = "urlKey";
        mAutoDBInfo.colsMap.put("urlKey", "TEXT");
        mAutoDBInfo.columns[2] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[3] = "fileVersion";
        mAutoDBInfo.colsMap.put("fileVersion", "TEXT");
        mAutoDBInfo.columns[4] = "networkType";
        mAutoDBInfo.colsMap.put("networkType", "INTEGER default '2' ");
        mAutoDBInfo.columns[5] = "maxRetryTimes";
        mAutoDBInfo.colsMap.put("maxRetryTimes", "INTEGER default '3' ");
        mAutoDBInfo.columns[6] = "retryTimes";
        mAutoDBInfo.colsMap.put("retryTimes", "INTEGER default '3' ");
        mAutoDBInfo.columns[7] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        mAutoDBInfo.columns[8] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "contentLength";
        mAutoDBInfo.colsMap.put("contentLength", "LONG default '0' ");
        mAutoDBInfo.columns[10] = DownloadInfo.CONTENTTYPE;
        mAutoDBInfo.colsMap.put(DownloadInfo.CONTENTTYPE, "TEXT");
        mAutoDBInfo.columns[11] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[13] = "groupId1";
        mAutoDBInfo.colsMap.put("groupId1", "TEXT");
        mAutoDBInfo.columns[14] = "groupId2";
        mAutoDBInfo.colsMap.put("groupId2", "TEXT");
        mAutoDBInfo.columns[15] = DownloadInfo.PRIORITY;
        mAutoDBInfo.colsMap.put(DownloadInfo.PRIORITY, "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "fileUpdated";
        mAutoDBInfo.colsMap.put("fileUpdated", "INTEGER");
        mAutoDBInfo.columns[17] = "deleted";
        mAutoDBInfo.colsMap.put("deleted", "INTEGER default 'false' ");
        mAutoDBInfo.columns[18] = "resType";
        mAutoDBInfo.colsMap.put("resType", "INTEGER");
        mAutoDBInfo.columns[19] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER");
        mAutoDBInfo.columns[20] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "LONG");
        mAutoDBInfo.columns[21] = "sampleId";
        mAutoDBInfo.colsMap.put("sampleId", "TEXT");
        mAutoDBInfo.columns[22] = "eccSignature";
        mAutoDBInfo.colsMap.put("eccSignature", "BLOB");
        mAutoDBInfo.columns[23] = "originalMd5";
        mAutoDBInfo.colsMap.put("originalMd5", "TEXT");
        mAutoDBInfo.columns[24] = "fileCompress";
        mAutoDBInfo.colsMap.put("fileCompress", "INTEGER default 'false' ");
        mAutoDBInfo.columns[25] = "fileEncrypt";
        mAutoDBInfo.colsMap.put("fileEncrypt", "INTEGER default 'false' ");
        mAutoDBInfo.columns[26] = "encryptKey";
        mAutoDBInfo.colsMap.put("encryptKey", "TEXT");
        mAutoDBInfo.columns[27] = "keyVersion";
        mAutoDBInfo.colsMap.put("keyVersion", "INTEGER default '0' ");
        mAutoDBInfo.columns[28] = "EID";
        mAutoDBInfo.colsMap.put("EID", "INTEGER");
        mAutoDBInfo.columns[29] = "fileSize";
        mAutoDBInfo.colsMap.put("fileSize", "LONG");
        mAutoDBInfo.columns[30] = "needRetry";
        mAutoDBInfo.colsMap.put("needRetry", "INTEGER default '1' ");
        mAutoDBInfo.columns[31] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[32] = "wvCacheType";
        mAutoDBInfo.colsMap.put("wvCacheType", "INTEGER");
        mAutoDBInfo.columns[33] = "packageId";
        mAutoDBInfo.colsMap.put("packageId", "TEXT");
        mAutoDBInfo.columns[34] = "rowid";
        mAutoDBInfo.sql = " urlKey_hashcode INTEGER PRIMARY KEY ,  urlKey TEXT,  url TEXT,  fileVersion TEXT,  networkType INTEGER default '2' ,  maxRetryTimes INTEGER default '3' ,  retryTimes INTEGER default '3' ,  filePath TEXT,  status INTEGER default '0' ,  contentLength LONG default '0' ,  contentType TEXT,  expireTime LONG default '0' ,  md5 TEXT,  groupId1 TEXT,  groupId2 TEXT,  priority INTEGER default '0' ,  fileUpdated INTEGER,  deleted INTEGER default 'false' ,  resType INTEGER,  subType INTEGER,  reportId LONG,  sampleId TEXT,  eccSignature BLOB,  originalMd5 TEXT,  fileCompress INTEGER default 'false' ,  fileEncrypt INTEGER default 'false' ,  encryptKey TEXT,  keyVersion INTEGER default '0' ,  EID INTEGER,  fileSize LONG,  needRetry INTEGER default '1' ,  appId TEXT,  wvCacheType INTEGER,  packageId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118881x7)) {
            return false;
        }
        C118881x7 x7Var = (C118881x7) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_urlKey_hashcode), Integer.valueOf(x7Var.field_urlKey_hashcode)) && C46238a.m51546a(this.field_urlKey, x7Var.field_urlKey) && C46238a.m51546a(this.field_url, x7Var.field_url) && C46238a.m51546a(this.field_fileVersion, x7Var.field_fileVersion) && C46238a.m51546a(Integer.valueOf(this.field_networkType), Integer.valueOf(x7Var.field_networkType)) && C46238a.m51546a(Integer.valueOf(this.field_maxRetryTimes), Integer.valueOf(x7Var.field_maxRetryTimes)) && C46238a.m51546a(Integer.valueOf(this.field_retryTimes), Integer.valueOf(x7Var.field_retryTimes)) && C46238a.m51546a(this.field_filePath, x7Var.field_filePath) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(x7Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_contentLength), Long.valueOf(x7Var.field_contentLength)) && C46238a.m51546a(this.field_contentType, x7Var.field_contentType) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(x7Var.field_expireTime)) && C46238a.m51546a(this.field_md5, x7Var.field_md5) && C46238a.m51546a(this.field_groupId1, x7Var.field_groupId1) && C46238a.m51546a(this.field_groupId2, x7Var.field_groupId2) && C46238a.m51546a(Integer.valueOf(this.field_priority), Integer.valueOf(x7Var.field_priority)) && C46238a.m51546a(Boolean.valueOf(this.field_fileUpdated), Boolean.valueOf(x7Var.field_fileUpdated)) && C46238a.m51546a(Boolean.valueOf(this.field_deleted), Boolean.valueOf(x7Var.field_deleted)) && C46238a.m51546a(Integer.valueOf(this.field_resType), Integer.valueOf(x7Var.field_resType)) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(x7Var.field_subType)) && C46238a.m51546a(Long.valueOf(this.field_reportId), Long.valueOf(x7Var.field_reportId)) && C46238a.m51546a(this.field_sampleId, x7Var.field_sampleId) && C46238a.m51546a(this.field_eccSignature, x7Var.field_eccSignature) && C46238a.m51546a(this.field_originalMd5, x7Var.field_originalMd5) && C46238a.m51546a(Boolean.valueOf(this.field_fileCompress), Boolean.valueOf(x7Var.field_fileCompress)) && C46238a.m51546a(Boolean.valueOf(this.field_fileEncrypt), Boolean.valueOf(x7Var.field_fileEncrypt)) && C46238a.m51546a(this.field_encryptKey, x7Var.field_encryptKey) && C46238a.m51546a(Integer.valueOf(this.field_keyVersion), Integer.valueOf(x7Var.field_keyVersion)) && C46238a.m51546a(Integer.valueOf(this.field_EID), Integer.valueOf(x7Var.field_EID)) && C46238a.m51546a(Long.valueOf(this.field_fileSize), Long.valueOf(x7Var.field_fileSize)) && C46238a.m51546a(Boolean.valueOf(this.field_needRetry), Boolean.valueOf(x7Var.field_needRetry)) && C46238a.m51546a(this.field_appId, x7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_wvCacheType), Integer.valueOf(x7Var.field_wvCacheType)) && C46238a.m51546a(this.field_packageId, x7Var.field_packageId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f356072R == hashCode) {
                    try {
                        this.field_urlKey_hashcode = cursor.getInt(i);
                        this.f356122d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356074S == hashCode) {
                    try {
                        this.field_urlKey = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356076T == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356078U == hashCode) {
                    try {
                        this.field_fileVersion = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356080V == hashCode) {
                    try {
                        this.field_networkType = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356082W == hashCode) {
                    try {
                        this.field_maxRetryTimes = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356084X == hashCode) {
                    try {
                        this.field_retryTimes = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356086Y == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356088Z == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356105p0 == hashCode) {
                    try {
                        this.field_contentLength = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356106x0 == hashCode) {
                    try {
                        this.field_contentType = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356107y0 == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356071Q0 == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356073R0 == hashCode) {
                    try {
                        this.field_groupId1 = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356075S0 == hashCode) {
                    try {
                        this.field_groupId2 = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356077T0 == hashCode) {
                    try {
                        this.field_priority = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356079U0 == hashCode) {
                    try {
                        this.field_fileUpdated = cursor.getInt(i) != 0;
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356081V0 == hashCode) {
                    try {
                        this.field_deleted = cursor.getInt(i) != 0;
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356083W0 == hashCode) {
                    try {
                        this.field_resType = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356085X0 == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356087Y0 == hashCode) {
                    try {
                        this.field_reportId = cursor.getLong(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356089Z0 == hashCode) {
                    try {
                        this.field_sampleId = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356090a1 == hashCode) {
                    try {
                        this.field_eccSignature = cursor.getBlob(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356091b1 == hashCode) {
                    try {
                        this.field_originalMd5 = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356092c1 == hashCode) {
                    try {
                        this.field_fileCompress = cursor.getInt(i) != 0;
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356093d1 == hashCode) {
                    try {
                        this.field_fileEncrypt = cursor.getInt(i) != 0;
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356094e1 == hashCode) {
                    try {
                        this.field_encryptKey = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356095f1 == hashCode) {
                    try {
                        this.field_keyVersion = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356096g1 == hashCode) {
                    try {
                        this.field_EID = cursor.getInt(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356097h1 == hashCode) {
                    try {
                        this.field_fileSize = cursor.getLong(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356098i1 == hashCode) {
                    try {
                        this.field_needRetry = cursor.getInt(i) != 0;
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356099j1 == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356100k1 == hashCode) {
                    try {
                        this.field_wvCacheType = cursor.getInt(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356101l1 == hashCode) {
                    try {
                        this.field_packageId = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseResDownloaderRecordTable", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356102m1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f356122d) {
            contentValues.put("urlKey_hashcode", Integer.valueOf(this.field_urlKey_hashcode));
        }
        if (this.f356123e) {
            contentValues.put("urlKey", this.field_urlKey);
        }
        if (this.f356124f) {
            contentValues.put("url", this.field_url);
        }
        if (this.f356125g) {
            contentValues.put("fileVersion", this.field_fileVersion);
        }
        if (this.f356126h) {
            contentValues.put("networkType", Integer.valueOf(this.field_networkType));
        }
        if (this.f356127i) {
            contentValues.put("maxRetryTimes", Integer.valueOf(this.field_maxRetryTimes));
        }
        if (this.f356128j) {
            contentValues.put("retryTimes", Integer.valueOf(this.field_retryTimes));
        }
        if (this.f356129n) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f356130o) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f356131p) {
            contentValues.put("contentLength", Long.valueOf(this.field_contentLength));
        }
        if (this.f356132q) {
            contentValues.put(DownloadInfo.CONTENTTYPE, this.field_contentType);
        }
        if (this.f356133r) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f356134s) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f356135t) {
            contentValues.put("groupId1", this.field_groupId1);
        }
        if (this.f356136u) {
            contentValues.put("groupId2", this.field_groupId2);
        }
        if (this.f356137v) {
            contentValues.put(DownloadInfo.PRIORITY, Integer.valueOf(this.field_priority));
        }
        if (this.f356138w) {
            if (this.field_fileUpdated) {
                contentValues.put("fileUpdated", 1);
            } else {
                contentValues.put("fileUpdated", 0);
            }
        }
        if (this.f356139x) {
            if (this.field_deleted) {
                contentValues.put("deleted", 1);
            } else {
                contentValues.put("deleted", 0);
            }
        }
        if (this.f356140y) {
            contentValues.put("resType", Integer.valueOf(this.field_resType));
        }
        if (this.f356141z) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.f356108A) {
            contentValues.put("reportId", Long.valueOf(this.field_reportId));
        }
        if (this.f356109B) {
            contentValues.put("sampleId", this.field_sampleId);
        }
        if (this.f356110C) {
            contentValues.put("eccSignature", this.field_eccSignature);
        }
        if (this.f356111D) {
            contentValues.put("originalMd5", this.field_originalMd5);
        }
        if (this.f356112E) {
            if (this.field_fileCompress) {
                contentValues.put("fileCompress", 1);
            } else {
                contentValues.put("fileCompress", 0);
            }
        }
        if (this.f356113F) {
            if (this.field_fileEncrypt) {
                contentValues.put("fileEncrypt", 1);
            } else {
                contentValues.put("fileEncrypt", 0);
            }
        }
        if (this.f356114G) {
            contentValues.put("encryptKey", this.field_encryptKey);
        }
        if (this.f356115H) {
            contentValues.put("keyVersion", Integer.valueOf(this.field_keyVersion));
        }
        if (this.f356116I) {
            contentValues.put("EID", Integer.valueOf(this.field_EID));
        }
        if (this.f356117J) {
            contentValues.put("fileSize", Long.valueOf(this.field_fileSize));
        }
        if (this.f356118K) {
            if (this.field_needRetry) {
                contentValues.put("needRetry", 1);
            } else {
                contentValues.put("needRetry", 0);
            }
        }
        if (this.f356119L) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f356120M) {
            contentValues.put("wvCacheType", Integer.valueOf(this.field_wvCacheType));
        }
        if (this.f356121N) {
            contentValues.put("packageId", this.field_packageId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseResDownloaderRecordTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ResDownloaderRecordTable ( " + f356103n1.sql + ");");
        for (String add : f356070Q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseResDownloaderRecordTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ResDownloaderRecordTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f356103n1, "ResDownloaderRecordTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseResDownloaderRecordTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ResDownloaderRecordTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseResDownloaderRecordTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f356103n1;
    }

    public String[] getIndexCreateSQL() {
        return f356070Q;
    }

    public StorageObserverOwner<C118881x7> getObserverOwner() {
        return f356104o1;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_urlKey_hashcode);
    }

    public SingleTable getTable() {
        return f356069P;
    }

    public String getTableName() {
        return f356069P.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("urlKey_hashcode")) {
            this.field_urlKey_hashcode = contentValues.getAsInteger("urlKey_hashcode").intValue();
            if (z) {
                this.f356122d = true;
            }
        }
        if (contentValues.containsKey("urlKey")) {
            this.field_urlKey = contentValues.getAsString("urlKey");
            if (z) {
                this.f356123e = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f356124f = true;
            }
        }
        if (contentValues.containsKey("fileVersion")) {
            this.field_fileVersion = contentValues.getAsString("fileVersion");
            if (z) {
                this.f356125g = true;
            }
        }
        if (contentValues.containsKey("networkType")) {
            this.field_networkType = contentValues.getAsInteger("networkType").intValue();
            if (z) {
                this.f356126h = true;
            }
        }
        if (contentValues.containsKey("maxRetryTimes")) {
            this.field_maxRetryTimes = contentValues.getAsInteger("maxRetryTimes").intValue();
            if (z) {
                this.f356127i = true;
            }
        }
        if (contentValues.containsKey("retryTimes")) {
            this.field_retryTimes = contentValues.getAsInteger("retryTimes").intValue();
            if (z) {
                this.f356128j = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f356129n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f356130o = true;
            }
        }
        if (contentValues.containsKey("contentLength")) {
            this.field_contentLength = contentValues.getAsLong("contentLength").longValue();
            if (z) {
                this.f356131p = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.CONTENTTYPE)) {
            this.field_contentType = contentValues.getAsString(DownloadInfo.CONTENTTYPE);
            if (z) {
                this.f356132q = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f356133r = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f356134s = true;
            }
        }
        if (contentValues.containsKey("groupId1")) {
            this.field_groupId1 = contentValues.getAsString("groupId1");
            if (z) {
                this.f356135t = true;
            }
        }
        if (contentValues.containsKey("groupId2")) {
            this.field_groupId2 = contentValues.getAsString("groupId2");
            if (z) {
                this.f356136u = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.PRIORITY)) {
            this.field_priority = contentValues.getAsInteger(DownloadInfo.PRIORITY).intValue();
            if (z) {
                this.f356137v = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("fileUpdated")) {
            this.field_fileUpdated = contentValues.getAsInteger("fileUpdated").intValue() != 0;
            if (z) {
                this.f356138w = true;
            }
        }
        if (contentValues.containsKey("deleted")) {
            this.field_deleted = contentValues.getAsInteger("deleted").intValue() != 0;
            if (z) {
                this.f356139x = true;
            }
        }
        if (contentValues.containsKey("resType")) {
            this.field_resType = contentValues.getAsInteger("resType").intValue();
            if (z) {
                this.f356140y = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.f356141z = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsLong("reportId").longValue();
            if (z) {
                this.f356108A = true;
            }
        }
        if (contentValues.containsKey("sampleId")) {
            this.field_sampleId = contentValues.getAsString("sampleId");
            if (z) {
                this.f356109B = true;
            }
        }
        if (contentValues.containsKey("eccSignature")) {
            this.field_eccSignature = contentValues.getAsByteArray("eccSignature");
            if (z) {
                this.f356110C = true;
            }
        }
        if (contentValues.containsKey("originalMd5")) {
            this.field_originalMd5 = contentValues.getAsString("originalMd5");
            if (z) {
                this.f356111D = true;
            }
        }
        if (contentValues.containsKey("fileCompress")) {
            this.field_fileCompress = contentValues.getAsInteger("fileCompress").intValue() != 0;
            if (z) {
                this.f356112E = true;
            }
        }
        if (contentValues.containsKey("fileEncrypt")) {
            this.field_fileEncrypt = contentValues.getAsInteger("fileEncrypt").intValue() != 0;
            if (z) {
                this.f356113F = true;
            }
        }
        if (contentValues.containsKey("encryptKey")) {
            this.field_encryptKey = contentValues.getAsString("encryptKey");
            if (z) {
                this.f356114G = true;
            }
        }
        if (contentValues.containsKey("keyVersion")) {
            this.field_keyVersion = contentValues.getAsInteger("keyVersion").intValue();
            if (z) {
                this.f356115H = true;
            }
        }
        if (contentValues.containsKey("EID")) {
            this.field_EID = contentValues.getAsInteger("EID").intValue();
            if (z) {
                this.f356116I = true;
            }
        }
        if (contentValues.containsKey("fileSize")) {
            this.field_fileSize = contentValues.getAsLong("fileSize").longValue();
            if (z) {
                this.f356117J = true;
            }
        }
        if (contentValues.containsKey("needRetry")) {
            if (contentValues.getAsInteger("needRetry").intValue() != 0) {
                z2 = true;
            }
            this.field_needRetry = z2;
            if (z) {
                this.f356118K = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f356119L = true;
            }
        }
        if (contentValues.containsKey("wvCacheType")) {
            this.field_wvCacheType = contentValues.getAsInteger("wvCacheType").intValue();
            if (z) {
                this.f356120M = true;
            }
        }
        if (contentValues.containsKey("packageId")) {
            this.field_packageId = contentValues.getAsString("packageId");
            if (z) {
                this.f356121N = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
