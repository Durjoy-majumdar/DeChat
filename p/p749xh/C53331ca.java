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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.ca */
public class C53331ca extends IAutoDBItem {

    /* renamed from: F */
    public static final SingleTable f149085F;

    /* renamed from: G */
    public static final String[] f149086G = new String[0];

    /* renamed from: H */
    public static final int f149087H = 106723335;

    /* renamed from: I */
    public static final int f149088I = 93028124;

    /* renamed from: J */
    public static final int f149089J = 351608024;

    /* renamed from: K */
    public static final int f149090K = -517880815;

    /* renamed from: L */
    public static final int f149091L = -1038089253;

    /* renamed from: M */
    public static final int f149092M = -541568084;

    /* renamed from: N */
    public static final int f149093N = -28987814;

    /* renamed from: P */
    public static final int f149094P = -544642982;

    /* renamed from: Q */
    public static final int f149095Q = -1326197564;

    /* renamed from: Q0 */
    public static final int f149096Q0 = 1671308008;

    /* renamed from: R */
    public static final int f149097R = 107902;

    /* renamed from: R0 */
    public static final int f149098R0 = -947425149;

    /* renamed from: S */
    public static final int f149099S = -1211148345;

    /* renamed from: S0 */
    public static final int f149100S0 = -338867519;

    /* renamed from: T */
    public static final int f149101T = -517783571;

    /* renamed from: T0 */
    public static final int f149102T0 = 1896576874;

    /* renamed from: U */
    public static final int f149103U = -2057421617;

    /* renamed from: U0 */
    public static final int f149104U0 = 108705909;

    /* renamed from: V */
    public static final int f149105V = -1861083582;

    /* renamed from: V0 */
    public static final IAutoDBItem.MAutoDBInfo f149106V0 = initAutoDBInfo(C53331ca.class);

    /* renamed from: W */
    public static final int f149107W = 1369213417;

    /* renamed from: W0 */
    public static final StorageObserverOwner<C53331ca> f149108W0 = new StorageObserverOwner<>();

    /* renamed from: X */
    public static final int f149109X = -1142019503;

    /* renamed from: Y */
    public static final int f149110Y = 739074380;

    /* renamed from: Z */
    public static final int f149111Z = -1713716707;

    /* renamed from: p0 */
    public static final int f149112p0 = 264778837;

    /* renamed from: x0 */
    public static final int f149113x0 = -854208071;

    /* renamed from: y0 */
    public static final int f149114y0 = 2123822072;

    /* renamed from: A */
    public boolean f149115A = true;

    /* renamed from: B */
    public boolean f149116B = true;

    /* renamed from: C */
    public boolean f149117C = true;

    /* renamed from: D */
    public boolean f149118D = true;

    /* renamed from: E */
    public boolean f149119E = true;

    /* renamed from: d */
    public boolean f149120d = true;

    /* renamed from: e */
    public boolean f149121e = true;

    /* renamed from: f */
    public boolean f149122f = true;
    public long field_accessTime;
    public String field_appId;
    public int field_autoDownloadCount;
    public boolean field_bigPackageReady;
    public String field_charset;
    public long field_checkIntervalTime;
    public long field_clearPkgTime;
    public long field_createTime;
    public boolean field_disable;
    public boolean field_disableWvCache;
    public String field_domain;
    public int field_downloadNetType;
    public int field_downloadTriggerType;
    public String field_downloadUrl;
    public String field_md5;
    public long field_nextCheckTime;
    public int field_packMethod;
    public int field_packageDownloadCount;
    public String field_pkgId;
    public String field_pkgPath;
    public int field_pkgSize;
    public boolean field_preloadFilesAtomic;
    public boolean field_preloadFilesReady;
    public int field_totalDownloadCount;
    public String field_version;

    /* renamed from: g */
    public boolean f149123g = true;

    /* renamed from: h */
    public boolean f149124h = true;

    /* renamed from: i */
    public boolean f149125i = true;

    /* renamed from: j */
    public boolean f149126j = true;

    /* renamed from: n */
    public boolean f149127n = true;

    /* renamed from: o */
    public boolean f149128o = true;

    /* renamed from: p */
    public boolean f149129p = true;

    /* renamed from: q */
    public boolean f149130q = true;

    /* renamed from: r */
    public boolean f149131r = true;

    /* renamed from: s */
    public boolean f149132s = true;

    /* renamed from: t */
    public boolean f149133t = true;

    /* renamed from: u */
    public boolean f149134u = true;

    /* renamed from: v */
    public boolean f149135v = true;

    /* renamed from: w */
    public boolean f149136w = true;

    /* renamed from: x */
    public boolean f149137x = true;

    /* renamed from: y */
    public boolean f149138y = true;

    /* renamed from: z */
    public boolean f149139z = true;

    static {
        SingleTable singleTable = new SingleTable("WepkgVersion");
        f149085F = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("pkgId", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "string", singleTable.getName(), "");
        new Column("pkgPath", "string", singleTable.getName(), "");
        new Column("disableWvCache", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("clearPkgTime", "long", singleTable.getName(), "");
        new Column("checkIntervalTime", "long", singleTable.getName(), "");
        new Column("packMethod", "int", singleTable.getName(), "");
        new Column("domain", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column("pkgSize", "int", singleTable.getName(), "");
        new Column("downloadNetType", "int", singleTable.getName(), "");
        new Column("nextCheckTime", "long", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("accessTime", "long", singleTable.getName(), "");
        new Column("charset", "string", singleTable.getName(), "");
        new Column("bigPackageReady", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("preloadFilesReady", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("preloadFilesAtomic", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("autoDownloadCount", "int", singleTable.getName(), "");
        new Column("disable", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("totalDownloadCount", "int", singleTable.getName(), "");
        new Column("packageDownloadCount", "int", singleTable.getName(), "");
        new Column("downloadTriggerType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[25];
        String[] strArr = new String[26];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "pkgId";
        mAutoDBInfo.colsMap.put("pkgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "pkgId";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "TEXT");
        mAutoDBInfo.columns[3] = "pkgPath";
        mAutoDBInfo.colsMap.put("pkgPath", "TEXT");
        mAutoDBInfo.columns[4] = "disableWvCache";
        mAutoDBInfo.colsMap.put("disableWvCache", "INTEGER default 'true' ");
        mAutoDBInfo.columns[5] = "clearPkgTime";
        mAutoDBInfo.colsMap.put("clearPkgTime", "LONG");
        mAutoDBInfo.columns[6] = "checkIntervalTime";
        mAutoDBInfo.colsMap.put("checkIntervalTime", "LONG");
        mAutoDBInfo.columns[7] = "packMethod";
        mAutoDBInfo.colsMap.put("packMethod", "INTEGER");
        mAutoDBInfo.columns[8] = "domain";
        mAutoDBInfo.colsMap.put("domain", "TEXT");
        mAutoDBInfo.columns[9] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[10] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT");
        mAutoDBInfo.columns[11] = "pkgSize";
        mAutoDBInfo.colsMap.put("pkgSize", "INTEGER");
        mAutoDBInfo.columns[12] = "downloadNetType";
        mAutoDBInfo.colsMap.put("downloadNetType", "INTEGER");
        mAutoDBInfo.columns[13] = "nextCheckTime";
        mAutoDBInfo.colsMap.put("nextCheckTime", "LONG");
        mAutoDBInfo.columns[14] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[15] = "accessTime";
        mAutoDBInfo.colsMap.put("accessTime", "LONG default '0' ");
        mAutoDBInfo.columns[16] = "charset";
        mAutoDBInfo.colsMap.put("charset", "TEXT default 'UTF-8' ");
        mAutoDBInfo.columns[17] = "bigPackageReady";
        mAutoDBInfo.colsMap.put("bigPackageReady", "INTEGER default 'false' ");
        mAutoDBInfo.columns[18] = "preloadFilesReady";
        mAutoDBInfo.colsMap.put("preloadFilesReady", "INTEGER default 'false' ");
        mAutoDBInfo.columns[19] = "preloadFilesAtomic";
        mAutoDBInfo.colsMap.put("preloadFilesAtomic", "INTEGER default 'false' ");
        mAutoDBInfo.columns[20] = "autoDownloadCount";
        mAutoDBInfo.colsMap.put("autoDownloadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "disable";
        mAutoDBInfo.colsMap.put("disable", "INTEGER default 'false' ");
        mAutoDBInfo.columns[22] = "totalDownloadCount";
        mAutoDBInfo.colsMap.put("totalDownloadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[23] = "packageDownloadCount";
        mAutoDBInfo.colsMap.put("packageDownloadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[24] = "downloadTriggerType";
        mAutoDBInfo.colsMap.put("downloadTriggerType", "INTEGER default '-1' ");
        mAutoDBInfo.columns[25] = "rowid";
        mAutoDBInfo.sql = " pkgId TEXT PRIMARY KEY ,  appId TEXT,  version TEXT,  pkgPath TEXT,  disableWvCache INTEGER default 'true' ,  clearPkgTime LONG,  checkIntervalTime LONG,  packMethod INTEGER,  domain TEXT,  md5 TEXT,  downloadUrl TEXT,  pkgSize INTEGER,  downloadNetType INTEGER,  nextCheckTime LONG,  createTime LONG,  accessTime LONG default '0' ,  charset TEXT default 'UTF-8' ,  bigPackageReady INTEGER default 'false' ,  preloadFilesReady INTEGER default 'false' ,  preloadFilesAtomic INTEGER default 'false' ,  autoDownloadCount INTEGER default '0' ,  disable INTEGER default 'false' ,  totalDownloadCount INTEGER default '0' ,  packageDownloadCount INTEGER default '0' ,  downloadTriggerType INTEGER default '-1' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53331ca)) {
            return false;
        }
        C53331ca caVar = (C53331ca) iAutoDBItem;
        return C46238a.m51546a(this.field_pkgId, caVar.field_pkgId) && C46238a.m51546a(this.field_appId, caVar.field_appId) && C46238a.m51546a(this.field_version, caVar.field_version) && C46238a.m51546a(this.field_pkgPath, caVar.field_pkgPath) && C46238a.m51546a(Boolean.valueOf(this.field_disableWvCache), Boolean.valueOf(caVar.field_disableWvCache)) && C46238a.m51546a(Long.valueOf(this.field_clearPkgTime), Long.valueOf(caVar.field_clearPkgTime)) && C46238a.m51546a(Long.valueOf(this.field_checkIntervalTime), Long.valueOf(caVar.field_checkIntervalTime)) && C46238a.m51546a(Integer.valueOf(this.field_packMethod), Integer.valueOf(caVar.field_packMethod)) && C46238a.m51546a(this.field_domain, caVar.field_domain) && C46238a.m51546a(this.field_md5, caVar.field_md5) && C46238a.m51546a(this.field_downloadUrl, caVar.field_downloadUrl) && C46238a.m51546a(Integer.valueOf(this.field_pkgSize), Integer.valueOf(caVar.field_pkgSize)) && C46238a.m51546a(Integer.valueOf(this.field_downloadNetType), Integer.valueOf(caVar.field_downloadNetType)) && C46238a.m51546a(Long.valueOf(this.field_nextCheckTime), Long.valueOf(caVar.field_nextCheckTime)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(caVar.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_accessTime), Long.valueOf(caVar.field_accessTime)) && C46238a.m51546a(this.field_charset, caVar.field_charset) && C46238a.m51546a(Boolean.valueOf(this.field_bigPackageReady), Boolean.valueOf(caVar.field_bigPackageReady)) && C46238a.m51546a(Boolean.valueOf(this.field_preloadFilesReady), Boolean.valueOf(caVar.field_preloadFilesReady)) && C46238a.m51546a(Boolean.valueOf(this.field_preloadFilesAtomic), Boolean.valueOf(caVar.field_preloadFilesAtomic)) && C46238a.m51546a(Integer.valueOf(this.field_autoDownloadCount), Integer.valueOf(caVar.field_autoDownloadCount)) && C46238a.m51546a(Boolean.valueOf(this.field_disable), Boolean.valueOf(caVar.field_disable)) && C46238a.m51546a(Integer.valueOf(this.field_totalDownloadCount), Integer.valueOf(caVar.field_totalDownloadCount)) && C46238a.m51546a(Integer.valueOf(this.field_packageDownloadCount), Integer.valueOf(caVar.field_packageDownloadCount)) && C46238a.m51546a(Integer.valueOf(this.field_downloadTriggerType), Integer.valueOf(caVar.field_downloadTriggerType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149087H == hashCode) {
                    try {
                        this.field_pkgId = cursor.getString(i);
                        this.f149120d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149088I == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149089J == hashCode) {
                    try {
                        this.field_version = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149090K == hashCode) {
                    try {
                        this.field_pkgPath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149091L == hashCode) {
                    try {
                        this.field_disableWvCache = cursor.getInt(i) != 0;
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149092M == hashCode) {
                    try {
                        this.field_clearPkgTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149093N == hashCode) {
                    try {
                        this.field_checkIntervalTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149094P == hashCode) {
                    try {
                        this.field_packMethod = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149095Q == hashCode) {
                    try {
                        this.field_domain = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149097R == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149099S == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149101T == hashCode) {
                    try {
                        this.field_pkgSize = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149103U == hashCode) {
                    try {
                        this.field_downloadNetType = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149105V == hashCode) {
                    try {
                        this.field_nextCheckTime = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149107W == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149109X == hashCode) {
                    try {
                        this.field_accessTime = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149110Y == hashCode) {
                    try {
                        this.field_charset = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149111Z == hashCode) {
                    try {
                        this.field_bigPackageReady = cursor.getInt(i) != 0;
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149112p0 == hashCode) {
                    try {
                        this.field_preloadFilesReady = cursor.getInt(i) != 0;
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149113x0 == hashCode) {
                    try {
                        this.field_preloadFilesAtomic = cursor.getInt(i) != 0;
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149114y0 == hashCode) {
                    try {
                        this.field_autoDownloadCount = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149096Q0 == hashCode) {
                    try {
                        this.field_disable = cursor.getInt(i) != 0;
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149098R0 == hashCode) {
                    try {
                        this.field_totalDownloadCount = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149100S0 == hashCode) {
                    try {
                        this.field_packageDownloadCount = cursor.getInt(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149102T0 == hashCode) {
                    try {
                        this.field_downloadTriggerType = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgVersion", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149104U0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149120d) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f149121e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f149122f) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.field_version);
        }
        if (this.f149123g) {
            contentValues.put("pkgPath", this.field_pkgPath);
        }
        if (this.f149124h) {
            if (this.field_disableWvCache) {
                contentValues.put("disableWvCache", 1);
            } else {
                contentValues.put("disableWvCache", 0);
            }
        }
        if (this.f149125i) {
            contentValues.put("clearPkgTime", Long.valueOf(this.field_clearPkgTime));
        }
        if (this.f149126j) {
            contentValues.put("checkIntervalTime", Long.valueOf(this.field_checkIntervalTime));
        }
        if (this.f149127n) {
            contentValues.put("packMethod", Integer.valueOf(this.field_packMethod));
        }
        if (this.f149128o) {
            contentValues.put("domain", this.field_domain);
        }
        if (this.f149129p) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f149130q) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f149131r) {
            contentValues.put("pkgSize", Integer.valueOf(this.field_pkgSize));
        }
        if (this.f149132s) {
            contentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
        }
        if (this.f149133t) {
            contentValues.put("nextCheckTime", Long.valueOf(this.field_nextCheckTime));
        }
        if (this.f149134u) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f149135v) {
            contentValues.put("accessTime", Long.valueOf(this.field_accessTime));
        }
        if (this.field_charset == null) {
            this.field_charset = "UTF-8";
        }
        if (this.f149136w) {
            contentValues.put("charset", this.field_charset);
        }
        if (this.f149137x) {
            if (this.field_bigPackageReady) {
                contentValues.put("bigPackageReady", 1);
            } else {
                contentValues.put("bigPackageReady", 0);
            }
        }
        if (this.f149138y) {
            if (this.field_preloadFilesReady) {
                contentValues.put("preloadFilesReady", 1);
            } else {
                contentValues.put("preloadFilesReady", 0);
            }
        }
        if (this.f149139z) {
            if (this.field_preloadFilesAtomic) {
                contentValues.put("preloadFilesAtomic", 1);
            } else {
                contentValues.put("preloadFilesAtomic", 0);
            }
        }
        if (this.f149115A) {
            contentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
        }
        if (this.f149116B) {
            if (this.field_disable) {
                contentValues.put("disable", 1);
            } else {
                contentValues.put("disable", 0);
            }
        }
        if (this.f149117C) {
            contentValues.put("totalDownloadCount", Integer.valueOf(this.field_totalDownloadCount));
        }
        if (this.f149118D) {
            contentValues.put("packageDownloadCount", Integer.valueOf(this.field_packageDownloadCount));
        }
        if (this.f149119E) {
            contentValues.put("downloadTriggerType", Integer.valueOf(this.field_downloadTriggerType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWepkgVersion", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WepkgVersion ( " + f149106V0.sql + ");");
        for (String add : f149086G) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWepkgVersion", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WepkgVersion", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149106V0, "WepkgVersion", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWepkgVersion", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WepkgVersion", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWepkgVersion", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149106V0;
    }

    public String[] getIndexCreateSQL() {
        return f149086G;
    }

    public StorageObserverOwner<C53331ca> getObserverOwner() {
        return f149108W0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_pkgId;
    }

    public SingleTable getTable() {
        return f149085F;
    }

    public String getTableName() {
        return f149085F.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z) {
                this.f149120d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149121e = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (z) {
                this.f149122f = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.field_pkgPath = contentValues.getAsString("pkgPath");
            if (z) {
                this.f149123g = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("disableWvCache")) {
            this.field_disableWvCache = contentValues.getAsInteger("disableWvCache").intValue() != 0;
            if (z) {
                this.f149124h = true;
            }
        }
        if (contentValues.containsKey("clearPkgTime")) {
            this.field_clearPkgTime = contentValues.getAsLong("clearPkgTime").longValue();
            if (z) {
                this.f149125i = true;
            }
        }
        if (contentValues.containsKey("checkIntervalTime")) {
            this.field_checkIntervalTime = contentValues.getAsLong("checkIntervalTime").longValue();
            if (z) {
                this.f149126j = true;
            }
        }
        if (contentValues.containsKey("packMethod")) {
            this.field_packMethod = contentValues.getAsInteger("packMethod").intValue();
            if (z) {
                this.f149127n = true;
            }
        }
        if (contentValues.containsKey("domain")) {
            this.field_domain = contentValues.getAsString("domain");
            if (z) {
                this.f149128o = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f149129p = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f149130q = true;
            }
        }
        if (contentValues.containsKey("pkgSize")) {
            this.field_pkgSize = contentValues.getAsInteger("pkgSize").intValue();
            if (z) {
                this.f149131r = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.field_downloadNetType = contentValues.getAsInteger("downloadNetType").intValue();
            if (z) {
                this.f149132s = true;
            }
        }
        if (contentValues.containsKey("nextCheckTime")) {
            this.field_nextCheckTime = contentValues.getAsLong("nextCheckTime").longValue();
            if (z) {
                this.f149133t = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f149134u = true;
            }
        }
        if (contentValues.containsKey("accessTime")) {
            this.field_accessTime = contentValues.getAsLong("accessTime").longValue();
            if (z) {
                this.f149135v = true;
            }
        }
        if (contentValues.containsKey("charset")) {
            this.field_charset = contentValues.getAsString("charset");
            if (z) {
                this.f149136w = true;
            }
        }
        if (contentValues.containsKey("bigPackageReady")) {
            this.field_bigPackageReady = contentValues.getAsInteger("bigPackageReady").intValue() != 0;
            if (z) {
                this.f149137x = true;
            }
        }
        if (contentValues.containsKey("preloadFilesReady")) {
            this.field_preloadFilesReady = contentValues.getAsInteger("preloadFilesReady").intValue() != 0;
            if (z) {
                this.f149138y = true;
            }
        }
        if (contentValues.containsKey("preloadFilesAtomic")) {
            this.field_preloadFilesAtomic = contentValues.getAsInteger("preloadFilesAtomic").intValue() != 0;
            if (z) {
                this.f149139z = true;
            }
        }
        if (contentValues.containsKey("autoDownloadCount")) {
            this.field_autoDownloadCount = contentValues.getAsInteger("autoDownloadCount").intValue();
            if (z) {
                this.f149115A = true;
            }
        }
        if (contentValues.containsKey("disable")) {
            if (contentValues.getAsInteger("disable").intValue() != 0) {
                z2 = true;
            }
            this.field_disable = z2;
            if (z) {
                this.f149116B = true;
            }
        }
        if (contentValues.containsKey("totalDownloadCount")) {
            this.field_totalDownloadCount = contentValues.getAsInteger("totalDownloadCount").intValue();
            if (z) {
                this.f149117C = true;
            }
        }
        if (contentValues.containsKey("packageDownloadCount")) {
            this.field_packageDownloadCount = contentValues.getAsInteger("packageDownloadCount").intValue();
            if (z) {
                this.f149118D = true;
            }
        }
        if (contentValues.containsKey("downloadTriggerType")) {
            this.field_downloadTriggerType = contentValues.getAsInteger("downloadTriggerType").intValue();
            if (z) {
                this.f149119E = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
