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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C50207l3;
import te3.C50694ok;
import te3.C77949j3;

/* renamed from: xh.c4 */
public class C38540c4 extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f101913C;

    /* renamed from: D */
    public static final String[] f101914D = new String[0];

    /* renamed from: E */
    public static final int f101915E = 98437;

    /* renamed from: F */
    public static final int f101916F = 94775253;

    /* renamed from: G */
    public static final int f101917G = 2066549636;

    /* renamed from: H */
    public static final int f101918H = 351608024;

    /* renamed from: I */
    public static final int f101919I = 1520391349;

    /* renamed from: J */
    public static final int f101920J = -1239621779;

    /* renamed from: K */
    public static final int f101921K = -427039409;

    /* renamed from: L */
    public static final int f101922L = -733627524;

    /* renamed from: M */
    public static final int f101923M = -1086584191;

    /* renamed from: N */
    public static final int f101924N = -632498101;

    /* renamed from: P */
    public static final int f101925P = -1581270204;

    /* renamed from: Q */
    public static final int f101926Q = -1422530784;

    /* renamed from: Q0 */
    public static final StorageObserverOwner<C38540c4> f101927Q0 = new StorageObserverOwner<>();

    /* renamed from: R */
    public static final int f101928R = -892481550;

    /* renamed from: S */
    public static final int f101929S = 865639603;

    /* renamed from: T */
    public static final int f101930T = -1339319560;

    /* renamed from: U */
    public static final int f101931U = 1851865635;

    /* renamed from: V */
    public static final int f101932V = -469104912;

    /* renamed from: W */
    public static final int f101933W = -1163811001;

    /* renamed from: X */
    public static final int f101934X = 953624756;

    /* renamed from: Y */
    public static final int f101935Y = -673073010;

    /* renamed from: Z */
    public static final int f101936Z = -1011591314;

    /* renamed from: p0 */
    public static final int f101937p0 = -1148781229;

    /* renamed from: x0 */
    public static final int f101938x0 = 108705909;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f101939y0 = initAutoDBInfo(C38540c4.class);

    /* renamed from: A */
    public boolean f101940A = true;

    /* renamed from: B */
    public boolean f101941B = true;

    /* renamed from: d */
    public boolean f101942d = true;

    /* renamed from: e */
    public boolean f101943e = true;

    /* renamed from: f */
    public boolean f101944f = true;
    public long field_actionTime;
    public C77949j3 field_addMsg;
    public C50207l3 field_addMsgs;
    public C50694ok field_businessInfo;
    public String field_cgi;
    public int field_cmdid;
    public String field_custombuff;
    public String field_defaultContent;
    public long field_delayTime;
    public int field_failkey;
    public int field_finalfailkey;
    public String field_functionmsgid;
    public boolean field_needShow;
    public int field_opCode;
    public long field_preVersion;
    public int field_reportid;
    public int field_retryCount;
    public int field_retryCountLimit;
    public int field_retryinterval;
    public int field_status;
    public int field_successkey;
    public long field_version;

    /* renamed from: g */
    public boolean f101945g = true;

    /* renamed from: h */
    public boolean f101946h = true;

    /* renamed from: i */
    public boolean f101947i = true;

    /* renamed from: j */
    public boolean f101948j = true;

    /* renamed from: n */
    public boolean f101949n = true;

    /* renamed from: o */
    public boolean f101950o = true;

    /* renamed from: p */
    public boolean f101951p = true;

    /* renamed from: q */
    public boolean f101952q = true;

    /* renamed from: r */
    public boolean f101953r = true;

    /* renamed from: s */
    public boolean f101954s = true;

    /* renamed from: t */
    public boolean f101955t = true;

    /* renamed from: u */
    public boolean f101956u = true;

    /* renamed from: v */
    public boolean f101957v = true;

    /* renamed from: w */
    public boolean f101958w = true;

    /* renamed from: x */
    public boolean f101959x = true;

    /* renamed from: y */
    public boolean f101960y = true;

    /* renamed from: z */
    public boolean f101961z = true;

    static {
        SingleTable singleTable = new SingleTable("FunctionMsgItem");
        f101913C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("cgi", "string", singleTable.getName(), "");
        new Column("cmdid", "int", singleTable.getName(), "");
        new Column("functionmsgid", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "long", singleTable.getName(), "");
        new Column("preVersion", "long", singleTable.getName(), "");
        new Column("retryinterval", "int", singleTable.getName(), "");
        new Column("reportid", "int", singleTable.getName(), "");
        new Column("successkey", "int", singleTable.getName(), "");
        new Column("failkey", "int", singleTable.getName(), "");
        new Column("finalfailkey", "int", singleTable.getName(), "");
        new Column("custombuff", "string", singleTable.getName(), "");
        new Column("addMsg", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AddMsg");
        new Column("status", "int", singleTable.getName(), "");
        new Column("needShow", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("defaultContent", "string", singleTable.getName(), "");
        new Column("actionTime", "long", singleTable.getName(), "");
        new Column("delayTime", "long", singleTable.getName(), "");
        new Column("retryCount", "int", singleTable.getName(), "");
        new Column("retryCountLimit", "int", singleTable.getName(), "");
        new Column("businessInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.BusinessInfo");
        new Column("opCode", "int", singleTable.getName(), "");
        new Column("addMsgs", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AddMsgList");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "cgi";
        mAutoDBInfo.colsMap.put("cgi", "TEXT");
        mAutoDBInfo.columns[1] = "cmdid";
        mAutoDBInfo.colsMap.put("cmdid", "INTEGER");
        mAutoDBInfo.columns[2] = "functionmsgid";
        mAutoDBInfo.colsMap.put("functionmsgid", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "functionmsgid";
        mAutoDBInfo.columns[3] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "LONG");
        mAutoDBInfo.columns[4] = "preVersion";
        mAutoDBInfo.colsMap.put("preVersion", "LONG");
        mAutoDBInfo.columns[5] = "retryinterval";
        mAutoDBInfo.colsMap.put("retryinterval", "INTEGER");
        mAutoDBInfo.columns[6] = "reportid";
        mAutoDBInfo.colsMap.put("reportid", "INTEGER");
        mAutoDBInfo.columns[7] = "successkey";
        mAutoDBInfo.colsMap.put("successkey", "INTEGER");
        mAutoDBInfo.columns[8] = "failkey";
        mAutoDBInfo.colsMap.put("failkey", "INTEGER");
        mAutoDBInfo.columns[9] = "finalfailkey";
        mAutoDBInfo.colsMap.put("finalfailkey", "INTEGER");
        mAutoDBInfo.columns[10] = "custombuff";
        mAutoDBInfo.colsMap.put("custombuff", "TEXT");
        mAutoDBInfo.columns[11] = "addMsg";
        mAutoDBInfo.colsMap.put("addMsg", "BLOB");
        mAutoDBInfo.columns[12] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '-1' ");
        mAutoDBInfo.columns[13] = "needShow";
        mAutoDBInfo.colsMap.put("needShow", "INTEGER default 'false' ");
        mAutoDBInfo.columns[14] = "defaultContent";
        mAutoDBInfo.colsMap.put("defaultContent", "TEXT");
        mAutoDBInfo.columns[15] = "actionTime";
        mAutoDBInfo.colsMap.put("actionTime", "LONG default '-1' ");
        mAutoDBInfo.columns[16] = "delayTime";
        mAutoDBInfo.colsMap.put("delayTime", "LONG default '-1' ");
        mAutoDBInfo.columns[17] = "retryCount";
        mAutoDBInfo.colsMap.put("retryCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "retryCountLimit";
        mAutoDBInfo.colsMap.put("retryCountLimit", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "businessInfo";
        mAutoDBInfo.colsMap.put("businessInfo", "BLOB");
        mAutoDBInfo.columns[20] = "opCode";
        mAutoDBInfo.colsMap.put("opCode", "INTEGER default '-1' ");
        mAutoDBInfo.columns[21] = "addMsgs";
        mAutoDBInfo.colsMap.put("addMsgs", "BLOB");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " cgi TEXT,  cmdid INTEGER,  functionmsgid TEXT PRIMARY KEY ,  version LONG,  preVersion LONG,  retryinterval INTEGER,  reportid INTEGER,  successkey INTEGER,  failkey INTEGER,  finalfailkey INTEGER,  custombuff TEXT,  addMsg BLOB,  status INTEGER default '-1' ,  needShow INTEGER default 'false' ,  defaultContent TEXT,  actionTime LONG default '-1' ,  delayTime LONG default '-1' ,  retryCount INTEGER default '0' ,  retryCountLimit INTEGER default '0' ,  businessInfo BLOB,  opCode INTEGER default '-1' ,  addMsgs BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38540c4)) {
            return false;
        }
        C38540c4 c4Var = (C38540c4) iAutoDBItem;
        return C46238a.m51546a(this.field_cgi, c4Var.field_cgi) && C46238a.m51546a(Integer.valueOf(this.field_cmdid), Integer.valueOf(c4Var.field_cmdid)) && C46238a.m51546a(this.field_functionmsgid, c4Var.field_functionmsgid) && C46238a.m51546a(Long.valueOf(this.field_version), Long.valueOf(c4Var.field_version)) && C46238a.m51546a(Long.valueOf(this.field_preVersion), Long.valueOf(c4Var.field_preVersion)) && C46238a.m51546a(Integer.valueOf(this.field_retryinterval), Integer.valueOf(c4Var.field_retryinterval)) && C46238a.m51546a(Integer.valueOf(this.field_reportid), Integer.valueOf(c4Var.field_reportid)) && C46238a.m51546a(Integer.valueOf(this.field_successkey), Integer.valueOf(c4Var.field_successkey)) && C46238a.m51546a(Integer.valueOf(this.field_failkey), Integer.valueOf(c4Var.field_failkey)) && C46238a.m51546a(Integer.valueOf(this.field_finalfailkey), Integer.valueOf(c4Var.field_finalfailkey)) && C46238a.m51546a(this.field_custombuff, c4Var.field_custombuff) && C46238a.m51546a(this.field_addMsg, c4Var.field_addMsg) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(c4Var.field_status)) && C46238a.m51546a(Boolean.valueOf(this.field_needShow), Boolean.valueOf(c4Var.field_needShow)) && C46238a.m51546a(this.field_defaultContent, c4Var.field_defaultContent) && C46238a.m51546a(Long.valueOf(this.field_actionTime), Long.valueOf(c4Var.field_actionTime)) && C46238a.m51546a(Long.valueOf(this.field_delayTime), Long.valueOf(c4Var.field_delayTime)) && C46238a.m51546a(Integer.valueOf(this.field_retryCount), Integer.valueOf(c4Var.field_retryCount)) && C46238a.m51546a(Integer.valueOf(this.field_retryCountLimit), Integer.valueOf(c4Var.field_retryCountLimit)) && C46238a.m51546a(this.field_businessInfo, c4Var.field_businessInfo) && C46238a.m51546a(Integer.valueOf(this.field_opCode), Integer.valueOf(c4Var.field_opCode)) && C46238a.m51546a(this.field_addMsgs, c4Var.field_addMsgs);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101915E == hashCode) {
                    try {
                        this.field_cgi = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101916F == hashCode) {
                    try {
                        this.field_cmdid = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101917G == hashCode) {
                    try {
                        this.field_functionmsgid = cursor.getString(i);
                        this.f101944f = true;
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101918H == hashCode) {
                    try {
                        this.field_version = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101919I == hashCode) {
                    try {
                        this.field_preVersion = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101920J == hashCode) {
                    try {
                        this.field_retryinterval = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101921K == hashCode) {
                    try {
                        this.field_reportid = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101922L == hashCode) {
                    try {
                        this.field_successkey = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101923M == hashCode) {
                    try {
                        this.field_failkey = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101924N == hashCode) {
                    try {
                        this.field_finalfailkey = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101925P == hashCode) {
                    try {
                        this.field_custombuff = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101926Q == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_addMsg = (C77949j3) new C77949j3().parseFrom(blob);
                        }
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101928R == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101929S == hashCode) {
                    try {
                        this.field_needShow = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101930T == hashCode) {
                    try {
                        this.field_defaultContent = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101931U == hashCode) {
                    try {
                        this.field_actionTime = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101932V == hashCode) {
                    try {
                        this.field_delayTime = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101933W == hashCode) {
                    try {
                        this.field_retryCount = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101934X == hashCode) {
                    try {
                        this.field_retryCountLimit = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101935Y == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_businessInfo = (C50694ok) new C50694ok().parseFrom(blob2);
                        }
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101936Z == hashCode) {
                    try {
                        this.field_opCode = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101937p0 == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_addMsgs = (C50207l3) new C50207l3().parseFrom(blob3);
                        }
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFunctionMsgItem", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101938x0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C50207l3 l3Var;
        C50694ok okVar;
        C77949j3 j3Var;
        ContentValues contentValues = new ContentValues();
        if (this.f101942d) {
            contentValues.put("cgi", this.field_cgi);
        }
        if (this.f101943e) {
            contentValues.put("cmdid", Integer.valueOf(this.field_cmdid));
        }
        if (this.f101944f) {
            contentValues.put("functionmsgid", this.field_functionmsgid);
        }
        if (this.f101945g) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Long.valueOf(this.field_version));
        }
        if (this.f101946h) {
            contentValues.put("preVersion", Long.valueOf(this.field_preVersion));
        }
        if (this.f101947i) {
            contentValues.put("retryinterval", Integer.valueOf(this.field_retryinterval));
        }
        if (this.f101948j) {
            contentValues.put("reportid", Integer.valueOf(this.field_reportid));
        }
        if (this.f101949n) {
            contentValues.put("successkey", Integer.valueOf(this.field_successkey));
        }
        if (this.f101950o) {
            contentValues.put("failkey", Integer.valueOf(this.field_failkey));
        }
        if (this.f101951p) {
            contentValues.put("finalfailkey", Integer.valueOf(this.field_finalfailkey));
        }
        if (this.f101952q) {
            contentValues.put("custombuff", this.field_custombuff);
        }
        if (this.f101953r && (j3Var = this.field_addMsg) != null) {
            try {
                contentValues.put("addMsg", j3Var.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e.getMessage());
            }
        }
        if (this.f101954s) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f101955t) {
            if (this.field_needShow) {
                contentValues.put("needShow", 1);
            } else {
                contentValues.put("needShow", 0);
            }
        }
        if (this.f101956u) {
            contentValues.put("defaultContent", this.field_defaultContent);
        }
        if (this.f101957v) {
            contentValues.put("actionTime", Long.valueOf(this.field_actionTime));
        }
        if (this.f101958w) {
            contentValues.put("delayTime", Long.valueOf(this.field_delayTime));
        }
        if (this.f101959x) {
            contentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
        }
        if (this.f101960y) {
            contentValues.put("retryCountLimit", Integer.valueOf(this.field_retryCountLimit));
        }
        if (this.f101961z && (okVar = this.field_businessInfo) != null) {
            try {
                contentValues.put("businessInfo", okVar.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e2.getMessage());
            }
        }
        if (this.f101940A) {
            contentValues.put("opCode", Integer.valueOf(this.field_opCode));
        }
        if (this.f101941B && (l3Var = this.field_addMsgs) != null) {
            try {
                contentValues.put("addMsgs", l3Var.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e3.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FunctionMsgItem ( " + f101939y0.sql + ");");
        for (String add : f101914D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFunctionMsgItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FunctionMsgItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101939y0, "FunctionMsgItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFunctionMsgItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FunctionMsgItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFunctionMsgItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101939y0;
    }

    public String[] getIndexCreateSQL() {
        return f101914D;
    }

    public StorageObserverOwner<C38540c4> getObserverOwner() {
        return f101927Q0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_functionmsgid;
    }

    public SingleTable getTable() {
        return f101913C;
    }

    public String getTableName() {
        return f101913C.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("cgi")) {
            this.field_cgi = contentValues.getAsString("cgi");
            if (z) {
                this.f101942d = true;
            }
        }
        if (contentValues.containsKey("cmdid")) {
            this.field_cmdid = contentValues.getAsInteger("cmdid").intValue();
            if (z) {
                this.f101943e = true;
            }
        }
        if (contentValues.containsKey("functionmsgid")) {
            this.field_functionmsgid = contentValues.getAsString("functionmsgid");
            if (z) {
                this.f101944f = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsLong(ProviderConstants.API_COLNAME_FEATURE_VERSION).longValue();
            if (z) {
                this.f101945g = true;
            }
        }
        if (contentValues.containsKey("preVersion")) {
            this.field_preVersion = contentValues.getAsLong("preVersion").longValue();
            if (z) {
                this.f101946h = true;
            }
        }
        if (contentValues.containsKey("retryinterval")) {
            this.field_retryinterval = contentValues.getAsInteger("retryinterval").intValue();
            if (z) {
                this.f101947i = true;
            }
        }
        if (contentValues.containsKey("reportid")) {
            this.field_reportid = contentValues.getAsInteger("reportid").intValue();
            if (z) {
                this.f101948j = true;
            }
        }
        if (contentValues.containsKey("successkey")) {
            this.field_successkey = contentValues.getAsInteger("successkey").intValue();
            if (z) {
                this.f101949n = true;
            }
        }
        if (contentValues.containsKey("failkey")) {
            this.field_failkey = contentValues.getAsInteger("failkey").intValue();
            if (z) {
                this.f101950o = true;
            }
        }
        if (contentValues.containsKey("finalfailkey")) {
            this.field_finalfailkey = contentValues.getAsInteger("finalfailkey").intValue();
            if (z) {
                this.f101951p = true;
            }
        }
        if (contentValues.containsKey("custombuff")) {
            this.field_custombuff = contentValues.getAsString("custombuff");
            if (z) {
                this.f101952q = true;
            }
        }
        if (contentValues.containsKey("addMsg")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("addMsg");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_addMsg = (C77949j3) new C77949j3().parseFrom(asByteArray);
                    if (z) {
                        this.f101953r = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e.getMessage());
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f101954s = true;
            }
        }
        if (contentValues.containsKey("needShow")) {
            this.field_needShow = contentValues.getAsInteger("needShow").intValue() != 0;
            if (z) {
                this.f101955t = true;
            }
        }
        if (contentValues.containsKey("defaultContent")) {
            this.field_defaultContent = contentValues.getAsString("defaultContent");
            if (z) {
                this.f101956u = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z) {
                this.f101957v = true;
            }
        }
        if (contentValues.containsKey("delayTime")) {
            this.field_delayTime = contentValues.getAsLong("delayTime").longValue();
            if (z) {
                this.f101958w = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z) {
                this.f101959x = true;
            }
        }
        if (contentValues.containsKey("retryCountLimit")) {
            this.field_retryCountLimit = contentValues.getAsInteger("retryCountLimit").intValue();
            if (z) {
                this.f101960y = true;
            }
        }
        if (contentValues.containsKey("businessInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("businessInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_businessInfo = (C50694ok) new C50694ok().parseFrom(asByteArray2);
                    if (z) {
                        this.f101961z = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e2.getMessage());
            }
        }
        if (contentValues.containsKey("opCode")) {
            this.field_opCode = contentValues.getAsInteger("opCode").intValue();
            if (z) {
                this.f101940A = true;
            }
        }
        if (contentValues.containsKey("addMsgs")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("addMsgs");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_addMsgs = (C50207l3) new C50207l3().parseFrom(asByteArray3);
                    if (z) {
                        this.f101941B = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFunctionMsgItem", e3.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
