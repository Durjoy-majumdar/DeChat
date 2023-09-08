package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
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

/* renamed from: xh.e0 */
public class C53334e0 extends IAutoDBItem {

    /* renamed from: S0 */
    public static final SingleTable f149202S0;

    /* renamed from: T0 */
    public static final String[] f149203T0 = {"CREATE INDEX IF NOT EXISTS appInfo_status_Index ON AppInfo(status)"};

    /* renamed from: U0 */
    public static final int f149204U0 = 93028124;

    /* renamed from: V0 */
    public static final int f149205V0 = -794136500;

    /* renamed from: W0 */
    public static final int f149206W0 = 433686423;

    /* renamed from: X0 */
    public static final int f149207X0 = -1523697451;

    /* renamed from: Y0 */
    public static final int f149208Y0 = -1829910001;

    /* renamed from: Z0 */
    public static final int f149209Z0 = 1484112759;

    /* renamed from: a1 */
    public static final int f149210a1 = -484966612;

    /* renamed from: b1 */
    public static final int f149211b1 = 908759025;

    /* renamed from: c1 */
    public static final int f149212c1 = -892481550;

    /* renamed from: d1 */
    public static final int f149213d1 = 1073584312;

    /* renamed from: e1 */
    public static final int f149214e1 = 1211388583;

    /* renamed from: f1 */
    public static final int f149215f1 = -1440510596;

    /* renamed from: g1 */
    public static final int f149216g1 = -1440510122;

    /* renamed from: h1 */
    public static final int f149217h1 = -1440510506;

    /* renamed from: i1 */
    public static final int f149218i1 = 690695761;

    /* renamed from: j1 */
    public static final int f149219j1 = 690696235;

    /* renamed from: k1 */
    public static final int f149220k1 = -793934597;

    /* renamed from: l1 */
    public static final int f149221l1 = -1010580219;

    /* renamed from: m1 */
    public static final int f149222m1 = 1431846196;

    /* renamed from: n1 */
    public static final int f149223n1 = 925433467;

    /* renamed from: o1 */
    public static final int f149224o1 = -1091008291;

    /* renamed from: p1 */
    public static final int f149225p1 = 1462521990;

    /* renamed from: q1 */
    public static final int f149226q1 = -2098131834;

    /* renamed from: r1 */
    public static final int f149227r1 = 891432414;

    /* renamed from: s1 */
    public static final int f149228s1 = -1639570427;

    /* renamed from: t1 */
    public static final int f149229t1 = 1514430678;

    /* renamed from: u1 */
    public static final int f149230u1 = 108705909;

    /* renamed from: v1 */
    public static final IAutoDBItem.MAutoDBInfo f149231v1 = initAutoDBInfo(C53334e0.class);

    /* renamed from: w1 */
    public static final StorageObserverOwner<C53334e0> f149232w1 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f149233A = true;

    /* renamed from: B */
    public boolean f149234B = true;

    /* renamed from: C */
    public boolean f149235C = true;

    /* renamed from: D */
    public boolean f149236D = true;

    /* renamed from: E */
    public boolean f149237E = true;

    /* renamed from: F */
    public boolean f149238F = true;

    /* renamed from: G */
    public String f149239G;

    /* renamed from: H */
    public String f149240H;

    /* renamed from: I */
    public String f149241I;

    /* renamed from: J */
    public int f149242J;

    /* renamed from: K */
    public int f149243K;

    /* renamed from: L */
    public String f149244L;

    /* renamed from: M */
    public String f149245M;

    /* renamed from: N */
    public String f149246N;

    /* renamed from: P */
    public String f149247P;

    /* renamed from: Q */
    public String f149248Q;

    /* renamed from: Q0 */
    public String f149249Q0;

    /* renamed from: R */
    public String f149250R;

    /* renamed from: R0 */
    public int f149251R0;

    /* renamed from: S */
    public int f149252S;

    /* renamed from: T */
    public String f149253T;

    /* renamed from: U */
    public String f149254U;

    /* renamed from: V */
    public String f149255V;

    /* renamed from: W */
    public String f149256W;

    /* renamed from: X */
    public String f149257X;

    /* renamed from: Y */
    public int f149258Y;

    /* renamed from: Z */
    public String f149259Z;

    /* renamed from: d */
    public boolean f149260d = true;

    /* renamed from: e */
    public boolean f149261e = true;

    /* renamed from: f */
    public boolean f149262f = true;
    public String field_appDiscription;
    public String field_appDiscription_en;
    public String field_appDiscription_tw;
    public String field_appIconUrl;
    public String field_appId;
    public int field_appInfoFlag;
    public String field_appName;
    public String field_appName_en;
    public String field_appName_hk;
    public String field_appName_tw;
    public String field_appStoreUrl;
    public long field_appSupportContentType;
    public String field_appType;
    public int field_appVersion;
    public String field_appWatermarkUrl;
    public int field_authFlag;
    public byte[] field_lvbuff;
    public long field_modifyTime;
    public String field_openId;
    public String field_packageName;
    public int field_serviceAppInfoFlag;
    public int field_serviceAppType;
    public int field_serviceShowFlag;
    public String field_signature;
    public int field_status;
    public long field_svrAppSupportContentType;

    /* renamed from: g */
    public boolean f149263g = true;

    /* renamed from: h */
    public boolean f149264h = true;

    /* renamed from: i */
    public boolean f149265i = true;

    /* renamed from: j */
    public boolean f149266j = true;

    /* renamed from: n */
    public boolean f149267n = true;

    /* renamed from: o */
    public boolean f149268o = true;

    /* renamed from: p */
    public boolean f149269p = true;

    /* renamed from: p0 */
    public int f149270p0;

    /* renamed from: q */
    public boolean f149271q = true;

    /* renamed from: r */
    public boolean f149272r = true;

    /* renamed from: s */
    public boolean f149273s = true;

    /* renamed from: t */
    public boolean f149274t = true;

    /* renamed from: u */
    public boolean f149275u = true;

    /* renamed from: v */
    public boolean f149276v = true;

    /* renamed from: w */
    public boolean f149277w = true;

    /* renamed from: x */
    public boolean f149278x = true;

    /* renamed from: x0 */
    public String f149279x0;

    /* renamed from: y */
    public boolean f149280y = true;

    /* renamed from: y0 */
    public String f149281y0;

    /* renamed from: z */
    public boolean f149282z = true;

    static {
        SingleTable singleTable = new SingleTable("AppInfo");
        f149202S0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appName", "string", singleTable.getName(), "");
        new Column("appDiscription", "string", singleTable.getName(), "");
        new Column("appIconUrl", "string", singleTable.getName(), "");
        new Column("appStoreUrl", "string", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("appWatermarkUrl", "string", singleTable.getName(), "");
        new Column("packageName", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("modifyTime", "long", singleTable.getName(), "");
        new Column("appName_en", "string", singleTable.getName(), "");
        new Column("appName_tw", "string", singleTable.getName(), "");
        new Column("appName_hk", "string", singleTable.getName(), "");
        new Column("appDiscription_en", "string", singleTable.getName(), "");
        new Column("appDiscription_tw", "string", singleTable.getName(), "");
        new Column("appType", "string", singleTable.getName(), "");
        new Column("openId", "string", singleTable.getName(), "");
        new Column("authFlag", "int", singleTable.getName(), "");
        new Column("appInfoFlag", "int", singleTable.getName(), "");
        new Column("lvbuff", "byte[]", singleTable.getName(), "");
        new Column("serviceAppType", "int", singleTable.getName(), "");
        new Column("serviceAppInfoFlag", "int", singleTable.getName(), "");
        new Column("serviceShowFlag", "int", singleTable.getName(), "");
        new Column("appSupportContentType", "long", singleTable.getName(), "");
        new Column("svrAppSupportContentType", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[26];
        String[] strArr = new String[27];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "appName";
        mAutoDBInfo.colsMap.put("appName", "TEXT");
        mAutoDBInfo.columns[2] = "appDiscription";
        mAutoDBInfo.colsMap.put("appDiscription", "TEXT");
        mAutoDBInfo.columns[3] = "appIconUrl";
        mAutoDBInfo.colsMap.put("appIconUrl", "TEXT");
        mAutoDBInfo.columns[4] = "appStoreUrl";
        mAutoDBInfo.colsMap.put("appStoreUrl", "TEXT");
        mAutoDBInfo.columns[5] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[6] = "appWatermarkUrl";
        mAutoDBInfo.colsMap.put("appWatermarkUrl", "TEXT");
        mAutoDBInfo.columns[7] = "packageName";
        mAutoDBInfo.colsMap.put("packageName", "TEXT");
        mAutoDBInfo.columns[8] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[9] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT");
        mAutoDBInfo.columns[10] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG");
        mAutoDBInfo.columns[11] = "appName_en";
        mAutoDBInfo.colsMap.put("appName_en", "TEXT");
        mAutoDBInfo.columns[12] = "appName_tw";
        mAutoDBInfo.colsMap.put("appName_tw", "TEXT");
        mAutoDBInfo.columns[13] = "appName_hk";
        mAutoDBInfo.colsMap.put("appName_hk", "TEXT");
        mAutoDBInfo.columns[14] = "appDiscription_en";
        mAutoDBInfo.colsMap.put("appDiscription_en", "TEXT");
        mAutoDBInfo.columns[15] = "appDiscription_tw";
        mAutoDBInfo.colsMap.put("appDiscription_tw", "TEXT");
        mAutoDBInfo.columns[16] = "appType";
        mAutoDBInfo.colsMap.put("appType", "TEXT");
        mAutoDBInfo.columns[17] = "openId";
        mAutoDBInfo.colsMap.put("openId", "TEXT");
        mAutoDBInfo.columns[18] = "authFlag";
        mAutoDBInfo.colsMap.put("authFlag", "INTEGER");
        mAutoDBInfo.columns[19] = "appInfoFlag";
        mAutoDBInfo.colsMap.put("appInfoFlag", "INTEGER default '-1' ");
        mAutoDBInfo.columns[20] = "lvbuff";
        mAutoDBInfo.colsMap.put("lvbuff", "BLOB");
        mAutoDBInfo.columns[21] = "serviceAppType";
        mAutoDBInfo.colsMap.put("serviceAppType", "INTEGER default '0' ");
        mAutoDBInfo.columns[22] = "serviceAppInfoFlag";
        mAutoDBInfo.colsMap.put("serviceAppInfoFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[23] = "serviceShowFlag";
        mAutoDBInfo.colsMap.put("serviceShowFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[24] = "appSupportContentType";
        mAutoDBInfo.colsMap.put("appSupportContentType", "LONG default '0' ");
        mAutoDBInfo.columns[25] = "svrAppSupportContentType";
        mAutoDBInfo.colsMap.put("svrAppSupportContentType", "LONG default '0' ");
        mAutoDBInfo.columns[26] = "rowid";
        mAutoDBInfo.sql = " appId TEXT default ''  PRIMARY KEY ,  appName TEXT,  appDiscription TEXT,  appIconUrl TEXT,  appStoreUrl TEXT,  appVersion INTEGER,  appWatermarkUrl TEXT,  packageName TEXT,  status INTEGER,  signature TEXT,  modifyTime LONG,  appName_en TEXT,  appName_tw TEXT,  appName_hk TEXT,  appDiscription_en TEXT,  appDiscription_tw TEXT,  appType TEXT,  openId TEXT,  authFlag INTEGER,  appInfoFlag INTEGER default '-1' ,  lvbuff BLOB,  serviceAppType INTEGER default '0' ,  serviceAppInfoFlag INTEGER default '0' ,  serviceShowFlag INTEGER default '0' ,  appSupportContentType LONG default '0' ,  svrAppSupportContentType LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53334e0)) {
            return false;
        }
        C53334e0 e0Var = (C53334e0) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, e0Var.field_appId) && C46238a.m51546a(this.field_appName, e0Var.field_appName) && C46238a.m51546a(this.field_appDiscription, e0Var.field_appDiscription) && C46238a.m51546a(this.field_appIconUrl, e0Var.field_appIconUrl) && C46238a.m51546a(this.field_appStoreUrl, e0Var.field_appStoreUrl) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(e0Var.field_appVersion)) && C46238a.m51546a(this.field_appWatermarkUrl, e0Var.field_appWatermarkUrl) && C46238a.m51546a(this.field_packageName, e0Var.field_packageName) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(e0Var.field_status)) && C46238a.m51546a(this.field_signature, e0Var.field_signature) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(e0Var.field_modifyTime)) && C46238a.m51546a(this.field_appName_en, e0Var.field_appName_en) && C46238a.m51546a(this.field_appName_tw, e0Var.field_appName_tw) && C46238a.m51546a(this.field_appName_hk, e0Var.field_appName_hk) && C46238a.m51546a(this.field_appDiscription_en, e0Var.field_appDiscription_en) && C46238a.m51546a(this.field_appDiscription_tw, e0Var.field_appDiscription_tw) && C46238a.m51546a(this.field_appType, e0Var.field_appType) && C46238a.m51546a(this.field_openId, e0Var.field_openId) && C46238a.m51546a(Integer.valueOf(this.field_authFlag), Integer.valueOf(e0Var.field_authFlag)) && C46238a.m51546a(Integer.valueOf(this.field_appInfoFlag), Integer.valueOf(e0Var.field_appInfoFlag)) && C46238a.m51546a(this.field_lvbuff, e0Var.field_lvbuff) && C46238a.m51546a(Integer.valueOf(this.field_serviceAppType), Integer.valueOf(e0Var.field_serviceAppType)) && C46238a.m51546a(Integer.valueOf(this.field_serviceAppInfoFlag), Integer.valueOf(e0Var.field_serviceAppInfoFlag)) && C46238a.m51546a(Integer.valueOf(this.field_serviceShowFlag), Integer.valueOf(e0Var.field_serviceShowFlag)) && C46238a.m51546a(Long.valueOf(this.field_appSupportContentType), Long.valueOf(e0Var.field_appSupportContentType)) && C46238a.m51546a(Long.valueOf(this.field_svrAppSupportContentType), Long.valueOf(e0Var.field_svrAppSupportContentType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149204U0 == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f149260d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149205V0 == hashCode) {
                    try {
                        this.field_appName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149206W0 == hashCode) {
                    try {
                        this.field_appDiscription = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149207X0 == hashCode) {
                    try {
                        this.field_appIconUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149208Y0 == hashCode) {
                    try {
                        this.field_appStoreUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149209Z0 == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149210a1 == hashCode) {
                    try {
                        this.field_appWatermarkUrl = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149211b1 == hashCode) {
                    try {
                        this.field_packageName = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149212c1 == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149213d1 == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149214e1 == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149215f1 == hashCode) {
                    try {
                        this.field_appName_en = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149216g1 == hashCode) {
                    try {
                        this.field_appName_tw = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149217h1 == hashCode) {
                    try {
                        this.field_appName_hk = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149218i1 == hashCode) {
                    try {
                        this.field_appDiscription_en = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149219j1 == hashCode) {
                    try {
                        this.field_appDiscription_tw = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149220k1 == hashCode) {
                    try {
                        this.field_appType = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149221l1 == hashCode) {
                    try {
                        this.field_openId = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149222m1 == hashCode) {
                    try {
                        this.field_authFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149223n1 == hashCode) {
                    try {
                        this.field_appInfoFlag = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149224o1 == hashCode) {
                    try {
                        this.field_lvbuff = cursor.getBlob(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149225p1 == hashCode) {
                    try {
                        this.field_serviceAppType = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149226q1 == hashCode) {
                    try {
                        this.field_serviceAppInfoFlag = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149227r1 == hashCode) {
                    try {
                        this.field_serviceShowFlag = cursor.getInt(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149228s1 == hashCode) {
                    try {
                        this.field_appSupportContentType = cursor.getLong(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149229t1 == hashCode) {
                    try {
                        this.field_svrAppSupportContentType = cursor.getLong(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149230u1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
            try {
                byte[] bArr = this.field_lvbuff;
                if (bArr == null) {
                    return;
                }
                if (bArr.length != 0) {
                    LVBuffer lVBuffer = new LVBuffer();
                    int initParse = lVBuffer.initParse(this.field_lvbuff);
                    if (initParse != 0) {
                        Log.m105920e("MicroMsg.SDK.BaseAppInfo", "parse LVBuffer error:" + initParse);
                        return;
                    }
                    this.f149239G = lVBuffer.getString();
                    this.f149240H = lVBuffer.getString();
                    this.f149241I = lVBuffer.getString();
                    this.f149242J = lVBuffer.getInt();
                    this.f149243K = lVBuffer.getInt();
                    this.f149244L = lVBuffer.getString();
                    this.f149245M = lVBuffer.getString();
                    this.f149246N = lVBuffer.getString();
                    this.f149247P = lVBuffer.getString();
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149248Q = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149250R = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149252S = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149253T = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149254U = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149255V = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149256W = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149257X = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149258Y = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149259Z = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149270p0 = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149279x0 = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149281y0 = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149249Q0 = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f149251R0 = lVBuffer.getInt();
                    }
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.SDK.BaseAppInfo", "get value failed");
            }
        }
    }

    public ContentValues convertTo() {
        try {
            if (this.f149233A) {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putString(this.f149239G);
                lVBuffer.putString(this.f149240H);
                lVBuffer.putString(this.f149241I);
                lVBuffer.putInt(this.f149242J);
                lVBuffer.putInt(this.f149243K);
                lVBuffer.putString(this.f149244L);
                lVBuffer.putString(this.f149245M);
                lVBuffer.putString(this.f149246N);
                lVBuffer.putString(this.f149247P);
                lVBuffer.putString(this.f149248Q);
                lVBuffer.putString(this.f149250R);
                lVBuffer.putInt(this.f149252S);
                lVBuffer.putString(this.f149253T);
                lVBuffer.putString(this.f149254U);
                lVBuffer.putString(this.f149255V);
                lVBuffer.putString(this.f149256W);
                lVBuffer.putString(this.f149257X);
                lVBuffer.putInt(this.f149258Y);
                lVBuffer.putString(this.f149259Z);
                lVBuffer.putInt(this.f149270p0);
                lVBuffer.putString(this.f149279x0);
                lVBuffer.putString(this.f149281y0);
                lVBuffer.putString(this.f149249Q0);
                lVBuffer.putInt(this.f149251R0);
                this.field_lvbuff = lVBuffer.buildFinish();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDK.BaseAppInfo", "get value failed, %s", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f149260d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f149261e) {
            contentValues.put("appName", this.field_appName);
        }
        if (this.f149262f) {
            contentValues.put("appDiscription", this.field_appDiscription);
        }
        if (this.f149263g) {
            contentValues.put("appIconUrl", this.field_appIconUrl);
        }
        if (this.f149264h) {
            contentValues.put("appStoreUrl", this.field_appStoreUrl);
        }
        if (this.f149265i) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f149266j) {
            contentValues.put("appWatermarkUrl", this.field_appWatermarkUrl);
        }
        if (this.f149267n) {
            contentValues.put("packageName", this.field_packageName);
        }
        if (this.f149268o) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f149269p) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f149271q) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        if (this.f149272r) {
            contentValues.put("appName_en", this.field_appName_en);
        }
        if (this.f149273s) {
            contentValues.put("appName_tw", this.field_appName_tw);
        }
        if (this.f149274t) {
            contentValues.put("appName_hk", this.field_appName_hk);
        }
        if (this.f149275u) {
            contentValues.put("appDiscription_en", this.field_appDiscription_en);
        }
        if (this.f149276v) {
            contentValues.put("appDiscription_tw", this.field_appDiscription_tw);
        }
        if (this.f149277w) {
            contentValues.put("appType", this.field_appType);
        }
        if (this.f149278x) {
            contentValues.put("openId", this.field_openId);
        }
        if (this.f149280y) {
            contentValues.put("authFlag", Integer.valueOf(this.field_authFlag));
        }
        if (this.f149282z) {
            contentValues.put("appInfoFlag", Integer.valueOf(this.field_appInfoFlag));
        }
        if (this.f149233A) {
            contentValues.put("lvbuff", this.field_lvbuff);
        }
        if (this.f149234B) {
            contentValues.put("serviceAppType", Integer.valueOf(this.field_serviceAppType));
        }
        if (this.f149235C) {
            contentValues.put("serviceAppInfoFlag", Integer.valueOf(this.field_serviceAppInfoFlag));
        }
        if (this.f149236D) {
            contentValues.put("serviceShowFlag", Integer.valueOf(this.field_serviceShowFlag));
        }
        if (this.f149237E) {
            contentValues.put("appSupportContentType", Long.valueOf(this.field_appSupportContentType));
        }
        if (this.f149238F) {
            contentValues.put("svrAppSupportContentType", Long.valueOf(this.field_svrAppSupportContentType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppInfo ( " + f149231v1.sql + ");");
        for (String add : f149203T0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149231v1, "AppInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149231v1;
    }

    public String[] getIndexCreateSQL() {
        return f149203T0;
    }

    public StorageObserverOwner<C53334e0> getObserverOwner() {
        return f149232w1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f149202S0;
    }

    public String getTableName() {
        return f149202S0.getName();
    }

    /* renamed from: l2 */
    public String mo73943l2() {
        return this.f149246N;
    }

    /* renamed from: m2 */
    public String mo73944m2() {
        return this.f149241I;
    }

    /* renamed from: n2 */
    public String mo73945n2() {
        return this.f149247P;
    }

    /* renamed from: o2 */
    public void mo73946o2(int i) {
        this.f149252S = i;
        this.f149233A = true;
    }

    /* renamed from: p2 */
    public void mo73947p2(String str) {
        this.f149246N = str;
        this.f149233A = true;
    }

    /* renamed from: q2 */
    public void mo73948q2(String str) {
        this.f149241I = str;
        this.f149233A = true;
    }

    /* renamed from: r2 */
    public void mo73949r2(String str) {
        this.f149247P = str;
        this.f149233A = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149260d = true;
            }
        }
        if (contentValues.containsKey("appName")) {
            this.field_appName = contentValues.getAsString("appName");
            if (z) {
                this.f149261e = true;
            }
        }
        if (contentValues.containsKey("appDiscription")) {
            this.field_appDiscription = contentValues.getAsString("appDiscription");
            if (z) {
                this.f149262f = true;
            }
        }
        if (contentValues.containsKey("appIconUrl")) {
            this.field_appIconUrl = contentValues.getAsString("appIconUrl");
            if (z) {
                this.f149263g = true;
            }
        }
        if (contentValues.containsKey("appStoreUrl")) {
            this.field_appStoreUrl = contentValues.getAsString("appStoreUrl");
            if (z) {
                this.f149264h = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f149265i = true;
            }
        }
        if (contentValues.containsKey("appWatermarkUrl")) {
            this.field_appWatermarkUrl = contentValues.getAsString("appWatermarkUrl");
            if (z) {
                this.f149266j = true;
            }
        }
        if (contentValues.containsKey("packageName")) {
            this.field_packageName = contentValues.getAsString("packageName");
            if (z) {
                this.f149267n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f149268o = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f149269p = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f149271q = true;
            }
        }
        if (contentValues.containsKey("appName_en")) {
            this.field_appName_en = contentValues.getAsString("appName_en");
            if (z) {
                this.f149272r = true;
            }
        }
        if (contentValues.containsKey("appName_tw")) {
            this.field_appName_tw = contentValues.getAsString("appName_tw");
            if (z) {
                this.f149273s = true;
            }
        }
        if (contentValues.containsKey("appName_hk")) {
            this.field_appName_hk = contentValues.getAsString("appName_hk");
            if (z) {
                this.f149274t = true;
            }
        }
        if (contentValues.containsKey("appDiscription_en")) {
            this.field_appDiscription_en = contentValues.getAsString("appDiscription_en");
            if (z) {
                this.f149275u = true;
            }
        }
        if (contentValues.containsKey("appDiscription_tw")) {
            this.field_appDiscription_tw = contentValues.getAsString("appDiscription_tw");
            if (z) {
                this.f149276v = true;
            }
        }
        if (contentValues.containsKey("appType")) {
            this.field_appType = contentValues.getAsString("appType");
            if (z) {
                this.f149277w = true;
            }
        }
        if (contentValues.containsKey("openId")) {
            this.field_openId = contentValues.getAsString("openId");
            if (z) {
                this.f149278x = true;
            }
        }
        if (contentValues.containsKey("authFlag")) {
            this.field_authFlag = contentValues.getAsInteger("authFlag").intValue();
            if (z) {
                this.f149280y = true;
            }
        }
        if (contentValues.containsKey("appInfoFlag")) {
            this.field_appInfoFlag = contentValues.getAsInteger("appInfoFlag").intValue();
            if (z) {
                this.f149282z = true;
            }
        }
        if (contentValues.containsKey("lvbuff")) {
            this.field_lvbuff = contentValues.getAsByteArray("lvbuff");
            if (z) {
                this.f149233A = true;
            }
        }
        if (contentValues.containsKey("serviceAppType")) {
            this.field_serviceAppType = contentValues.getAsInteger("serviceAppType").intValue();
            if (z) {
                this.f149234B = true;
            }
        }
        if (contentValues.containsKey("serviceAppInfoFlag")) {
            this.field_serviceAppInfoFlag = contentValues.getAsInteger("serviceAppInfoFlag").intValue();
            if (z) {
                this.f149235C = true;
            }
        }
        if (contentValues.containsKey("serviceShowFlag")) {
            this.field_serviceShowFlag = contentValues.getAsInteger("serviceShowFlag").intValue();
            if (z) {
                this.f149236D = true;
            }
        }
        if (contentValues.containsKey("appSupportContentType")) {
            this.field_appSupportContentType = contentValues.getAsLong("appSupportContentType").longValue();
            if (z) {
                this.f149237E = true;
            }
        }
        if (contentValues.containsKey("svrAppSupportContentType")) {
            this.field_svrAppSupportContentType = contentValues.getAsLong("svrAppSupportContentType").longValue();
            if (z) {
                this.f149238F = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
