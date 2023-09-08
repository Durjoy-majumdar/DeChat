package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
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
import te3.C50499n6;

/* renamed from: xh.v0 */
public class C118880v0 extends IAutoDBItem {

    /* renamed from: I */
    public static final SingleTable f356010I;

    /* renamed from: J */
    public static final Column f356011J;

    /* renamed from: K */
    public static final Column f356012K;

    /* renamed from: L */
    public static final String[] f356013L = new String[0];

    /* renamed from: M */
    public static final int f356014M = 104191100;

    /* renamed from: N */
    public static final int f356015N = -1294411543;

    /* renamed from: P */
    public static final int f356016P = 3575610;

    /* renamed from: Q */
    public static final int f356017Q = -892481550;

    /* renamed from: Q0 */
    public static final int f356018Q0 = -103570919;

    /* renamed from: R */
    public static final int f356019R = 1369213417;

    /* renamed from: R0 */
    public static final int f356020R0 = 1298065502;

    /* renamed from: S */
    public static final int f356021S = -881080743;

    /* renamed from: S0 */
    public static final int f356022S0 = -783547515;

    /* renamed from: T */
    public static final int f356023T = 951530617;

    /* renamed from: T0 */
    public static final int f356024T0 = 1595834407;

    /* renamed from: U */
    public static final int f356025U = 1916786312;

    /* renamed from: U0 */
    public static final int f356026U0 = 1365093326;

    /* renamed from: V */
    public static final int f356027V = -486944182;

    /* renamed from: V0 */
    public static final int f356028V0 = -472288783;

    /* renamed from: W */
    public static final int f356029W = -610034348;

    /* renamed from: W0 */
    public static final int f356030W0 = 631376413;

    /* renamed from: X */
    public static final int f356031X = -615133084;

    /* renamed from: X0 */
    public static final int f356032X0 = 2028474912;

    /* renamed from: Y */
    public static final int f356033Y = -391994406;

    /* renamed from: Y0 */
    public static final int f356034Y0 = 108705909;

    /* renamed from: Z */
    public static final int f356035Z = 696911031;

    /* renamed from: Z0 */
    public static final IAutoDBItem.MAutoDBInfo f356036Z0 = initAutoDBInfo(C118880v0.class);

    /* renamed from: a1 */
    public static final StorageObserverOwner<C118880v0> f356037a1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f356038p0 = 1858928334;

    /* renamed from: x0 */
    public static final int f356039x0 = -78641114;

    /* renamed from: y0 */
    public static final int f356040y0 = -1180158496;

    /* renamed from: A */
    public boolean f356041A = true;

    /* renamed from: B */
    public boolean f356042B = true;

    /* renamed from: C */
    public boolean f356043C = true;

    /* renamed from: D */
    public boolean f356044D = true;

    /* renamed from: E */
    public int f356045E;

    /* renamed from: F */
    public String f356046F;

    /* renamed from: G */
    public byte[] f356047G;

    /* renamed from: H */
    public long f356048H;

    /* renamed from: d */
    public boolean f356049d = true;

    /* renamed from: e */
    public boolean f356050e = true;

    /* renamed from: f */
    public boolean f356051f = true;
    public C50499n6 field_appMsgStatInfoProto;
    public int field_bitFlag;
    public String field_bizClientMsgId;
    public String field_content;
    public long field_createTime;
    public int field_hasShow;
    public String field_imgPath;
    public boolean field_isExpand;
    public int field_isRead;
    public boolean field_isValidExposed;
    public byte[] field_lvbuffer;
    public long field_msgId;
    public long field_msgSvrId;
    public long field_orderFlag;
    public int field_placeTop;
    public String field_rankSessionId;
    public String field_recommendCardId;
    public String field_recommendReason;
    public int field_recycleCardType;
    public String field_resortBuffer;
    public int field_status;
    public String field_talker;
    public int field_talkerId;
    public int field_type;

    /* renamed from: g */
    public boolean f356052g = true;

    /* renamed from: h */
    public boolean f356053h = true;

    /* renamed from: i */
    public boolean f356054i = true;

    /* renamed from: j */
    public boolean f356055j = true;

    /* renamed from: n */
    public boolean f356056n = true;

    /* renamed from: o */
    public boolean f356057o = true;

    /* renamed from: p */
    public boolean f356058p = true;

    /* renamed from: q */
    public boolean f356059q = true;

    /* renamed from: r */
    public boolean f356060r = true;

    /* renamed from: s */
    public boolean f356061s = true;

    /* renamed from: t */
    public boolean f356062t = true;

    /* renamed from: u */
    public boolean f356063u = true;

    /* renamed from: v */
    public boolean f356064v = true;

    /* renamed from: w */
    public boolean f356065w = true;

    /* renamed from: x */
    public boolean f356066x = true;

    /* renamed from: y */
    public boolean f356067y = true;

    /* renamed from: z */
    public boolean f356068z = true;

    static {
        SingleTable singleTable = new SingleTable("BizTimeLineInfo");
        f356010I = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f356011J = new Column("msgId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("imgPath", "string", singleTable.getName(), "");
        new Column("lvbuffer", "byte[]", singleTable.getName(), "");
        new Column("talkerId", "int", singleTable.getName(), "");
        new Column("isExpand", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        f356012K = new Column("orderFlag", "long", singleTable.getName(), "");
        new Column("hasShow", "int", singleTable.getName(), "");
        new Column("placeTop", "int", singleTable.getName(), "");
        new Column("appMsgStatInfoProto", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AppMsgStatInfo");
        new Column("isRead", "int", singleTable.getName(), "");
        new Column("bitFlag", "int", singleTable.getName(), "");
        new Column("bizClientMsgId", "string", singleTable.getName(), "");
        new Column("rankSessionId", "string", singleTable.getName(), "");
        new Column("recommendCardId", "string", singleTable.getName(), "");
        new Column("isValidExposed", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("resortBuffer", "string", singleTable.getName(), "");
        new Column("recycleCardType", "int", singleTable.getName(), "");
        new Column("recommendReason", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[24];
        String[] strArr = new String[25];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[5] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[6] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "imgPath";
        mAutoDBInfo.colsMap.put("imgPath", "TEXT");
        mAutoDBInfo.columns[8] = "lvbuffer";
        mAutoDBInfo.colsMap.put("lvbuffer", "BLOB");
        mAutoDBInfo.columns[9] = "talkerId";
        mAutoDBInfo.colsMap.put("talkerId", "INTEGER");
        mAutoDBInfo.columns[10] = "isExpand";
        mAutoDBInfo.colsMap.put("isExpand", "INTEGER");
        mAutoDBInfo.columns[11] = "orderFlag";
        mAutoDBInfo.colsMap.put("orderFlag", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "hasShow";
        mAutoDBInfo.colsMap.put("hasShow", "INTEGER default '1' ");
        mAutoDBInfo.columns[13] = "placeTop";
        mAutoDBInfo.colsMap.put("placeTop", "INTEGER default '1' ");
        mAutoDBInfo.columns[14] = "appMsgStatInfoProto";
        mAutoDBInfo.colsMap.put("appMsgStatInfoProto", "BLOB");
        mAutoDBInfo.columns[15] = "isRead";
        mAutoDBInfo.colsMap.put("isRead", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "bitFlag";
        mAutoDBInfo.colsMap.put("bitFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[17] = "bizClientMsgId";
        mAutoDBInfo.colsMap.put("bizClientMsgId", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "rankSessionId";
        mAutoDBInfo.colsMap.put("rankSessionId", "TEXT default '' ");
        mAutoDBInfo.columns[19] = "recommendCardId";
        mAutoDBInfo.colsMap.put("recommendCardId", "TEXT default '' ");
        mAutoDBInfo.columns[20] = "isValidExposed";
        mAutoDBInfo.colsMap.put("isValidExposed", "INTEGER");
        mAutoDBInfo.columns[21] = "resortBuffer";
        mAutoDBInfo.colsMap.put("resortBuffer", "TEXT default '' ");
        mAutoDBInfo.columns[22] = "recycleCardType";
        mAutoDBInfo.colsMap.put("recycleCardType", "INTEGER default '0' ");
        mAutoDBInfo.columns[23] = "recommendReason";
        mAutoDBInfo.colsMap.put("recommendReason", "TEXT default '' ");
        mAutoDBInfo.columns[24] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  msgSvrId LONG,  type INTEGER,  status INTEGER,  createTime LONG,  talker TEXT,  content TEXT default '' ,  imgPath TEXT,  lvbuffer BLOB,  talkerId INTEGER,  isExpand INTEGER,  orderFlag LONG default '0' ,  hasShow INTEGER default '1' ,  placeTop INTEGER default '1' ,  appMsgStatInfoProto BLOB,  isRead INTEGER default '0' ,  bitFlag INTEGER default '0' ,  bizClientMsgId TEXT default '' ,  rankSessionId TEXT default '' ,  recommendCardId TEXT default '' ,  isValidExposed INTEGER,  resortBuffer TEXT default '' ,  recycleCardType INTEGER default '0' ,  recommendReason TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118880v0)) {
            return false;
        }
        C118880v0 v0Var = (C118880v0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(v0Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(v0Var.field_msgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(v0Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(v0Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(v0Var.field_createTime)) && C46238a.m51546a(this.field_talker, v0Var.field_talker) && C46238a.m51546a(this.field_content, v0Var.field_content) && C46238a.m51546a(this.field_imgPath, v0Var.field_imgPath) && C46238a.m51546a(this.field_lvbuffer, v0Var.field_lvbuffer) && C46238a.m51546a(Integer.valueOf(this.field_talkerId), Integer.valueOf(v0Var.field_talkerId)) && C46238a.m51546a(Boolean.valueOf(this.field_isExpand), Boolean.valueOf(v0Var.field_isExpand)) && C46238a.m51546a(Long.valueOf(this.field_orderFlag), Long.valueOf(v0Var.field_orderFlag)) && C46238a.m51546a(Integer.valueOf(this.field_hasShow), Integer.valueOf(v0Var.field_hasShow)) && C46238a.m51546a(Integer.valueOf(this.field_placeTop), Integer.valueOf(v0Var.field_placeTop)) && C46238a.m51546a(this.field_appMsgStatInfoProto, v0Var.field_appMsgStatInfoProto) && C46238a.m51546a(Integer.valueOf(this.field_isRead), Integer.valueOf(v0Var.field_isRead)) && C46238a.m51546a(Integer.valueOf(this.field_bitFlag), Integer.valueOf(v0Var.field_bitFlag)) && C46238a.m51546a(this.field_bizClientMsgId, v0Var.field_bizClientMsgId) && C46238a.m51546a(this.field_rankSessionId, v0Var.field_rankSessionId) && C46238a.m51546a(this.field_recommendCardId, v0Var.field_recommendCardId) && C46238a.m51546a(Boolean.valueOf(this.field_isValidExposed), Boolean.valueOf(v0Var.field_isValidExposed)) && C46238a.m51546a(this.field_resortBuffer, v0Var.field_resortBuffer) && C46238a.m51546a(Integer.valueOf(this.field_recycleCardType), Integer.valueOf(v0Var.field_recycleCardType)) && C46238a.m51546a(this.field_recommendReason, v0Var.field_recommendReason);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f356014M == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f356049d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356015N == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356016P == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356017Q == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356019R == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356021S == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356023T == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356025U == hashCode) {
                    try {
                        this.field_imgPath = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356027V == hashCode) {
                    try {
                        this.field_lvbuffer = cursor.getBlob(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356029W == hashCode) {
                    try {
                        this.field_talkerId = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356031X == hashCode) {
                    try {
                        this.field_isExpand = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356033Y == hashCode) {
                    try {
                        this.field_orderFlag = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356035Z == hashCode) {
                    try {
                        this.field_hasShow = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356038p0 == hashCode) {
                    try {
                        this.field_placeTop = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356039x0 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_appMsgStatInfoProto = (C50499n6) new C50499n6().parseFrom(blob);
                        }
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356040y0 == hashCode) {
                    try {
                        this.field_isRead = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356018Q0 == hashCode) {
                    try {
                        this.field_bitFlag = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356020R0 == hashCode) {
                    try {
                        this.field_bizClientMsgId = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356022S0 == hashCode) {
                    try {
                        this.field_rankSessionId = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356024T0 == hashCode) {
                    try {
                        this.field_recommendCardId = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356026U0 == hashCode) {
                    try {
                        this.field_isValidExposed = cursor.getInt(i) != 0;
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356028V0 == hashCode) {
                    try {
                        this.field_resortBuffer = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356030W0 == hashCode) {
                    try {
                        this.field_recycleCardType = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356032X0 == hashCode) {
                    try {
                        this.field_recommendReason = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizTimeLineInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f356034Y0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
            try {
                byte[] bArr = this.field_lvbuffer;
                if (bArr == null) {
                    return;
                }
                if (bArr.length != 0) {
                    LVBuffer lVBuffer = new LVBuffer();
                    int initParse = lVBuffer.initParse(this.field_lvbuffer);
                    if (initParse != 0) {
                        Log.m105920e("MicroMsg.SDK.BaseBizTimeLineInfo", "parse LVBuffer error:" + initParse);
                        return;
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f356045E = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f356046F = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f356047G = lVBuffer.getBuffer();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f356048H = lVBuffer.getLong();
                    }
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.SDK.BaseBizTimeLineInfo", "get value failed");
            }
        }
    }

    public ContentValues convertTo() {
        C50499n6 n6Var;
        try {
            if (this.f356057o) {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putInt(this.f356045E);
                lVBuffer.putString(this.f356046F);
                lVBuffer.putBuffer(this.f356047G);
                lVBuffer.putLong(this.f356048H);
                this.field_lvbuffer = lVBuffer.buildFinish();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDK.BaseBizTimeLineInfo", "get value failed, %s", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        if (this.f356049d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f356050e) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f356051f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f356052g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f356053h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f356054i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f356055j) {
            contentValues.put("content", this.field_content);
        }
        if (this.f356056n) {
            contentValues.put("imgPath", this.field_imgPath);
        }
        if (this.f356057o) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f356058p) {
            contentValues.put("talkerId", Integer.valueOf(this.field_talkerId));
        }
        if (this.f356059q) {
            if (this.field_isExpand) {
                contentValues.put("isExpand", 1);
            } else {
                contentValues.put("isExpand", 0);
            }
        }
        if (this.f356060r) {
            contentValues.put("orderFlag", Long.valueOf(this.field_orderFlag));
        }
        if (this.f356061s) {
            contentValues.put("hasShow", Integer.valueOf(this.field_hasShow));
        }
        if (this.f356062t) {
            contentValues.put("placeTop", Integer.valueOf(this.field_placeTop));
        }
        if (this.f356063u && (n6Var = this.field_appMsgStatInfoProto) != null) {
            try {
                contentValues.put("appMsgStatInfoProto", n6Var.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseBizTimeLineInfo", e2.getMessage());
            }
        }
        if (this.f356064v) {
            contentValues.put("isRead", Integer.valueOf(this.field_isRead));
        }
        if (this.f356065w) {
            contentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
        }
        if (this.field_bizClientMsgId == null) {
            this.field_bizClientMsgId = "";
        }
        if (this.f356066x) {
            contentValues.put("bizClientMsgId", this.field_bizClientMsgId);
        }
        if (this.field_rankSessionId == null) {
            this.field_rankSessionId = "";
        }
        if (this.f356067y) {
            contentValues.put("rankSessionId", this.field_rankSessionId);
        }
        if (this.field_recommendCardId == null) {
            this.field_recommendCardId = "";
        }
        if (this.f356068z) {
            contentValues.put("recommendCardId", this.field_recommendCardId);
        }
        if (this.f356041A) {
            if (this.field_isValidExposed) {
                contentValues.put("isValidExposed", 1);
            } else {
                contentValues.put("isValidExposed", 0);
            }
        }
        if (this.field_resortBuffer == null) {
            this.field_resortBuffer = "";
        }
        if (this.f356042B) {
            contentValues.put("resortBuffer", this.field_resortBuffer);
        }
        if (this.f356043C) {
            contentValues.put("recycleCardType", Integer.valueOf(this.field_recycleCardType));
        }
        if (this.field_recommendReason == null) {
            this.field_recommendReason = "";
        }
        if (this.f356044D) {
            contentValues.put("recommendReason", this.field_recommendReason);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizTimeLineInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizTimeLineInfo ( " + f356036Z0.sql + ");");
        for (String add : f356013L) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizTimeLineInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizTimeLineInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f356036Z0, "BizTimeLineInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizTimeLineInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizTimeLineInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizTimeLineInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f356036Z0;
    }

    public String[] getIndexCreateSQL() {
        return f356013L;
    }

    public StorageObserverOwner<C118880v0> getObserverOwner() {
        return f356037a1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f356010I;
    }

    public String getTableName() {
        return f356010I.getName();
    }

    public long insertToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        InsertExecutor insertExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getINSERT(), String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseBizTimeLineInfo");
            storageObserverEvent.setObj(this);
            insertExecutor = new InsertExecutor(this, true, storageObserverEvent, f356037a1, "MicroMsg.SDK.BaseBizTimeLineInfo");
        } else {
            insertExecutor = new InsertExecutor(this, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseBizTimeLineInfo");
        }
        return insertExecutor.execute(iSQLiteDatabase);
    }

    /* renamed from: l2 */
    public void mo183585l2(int i) {
        this.f356045E = i;
        this.f356057o = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f356049d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f356050e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f356051f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f356052g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f356053h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f356054i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f356055j = true;
            }
        }
        if (contentValues.containsKey("imgPath")) {
            this.field_imgPath = contentValues.getAsString("imgPath");
            if (z) {
                this.f356056n = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z) {
                this.f356057o = true;
            }
        }
        if (contentValues.containsKey("talkerId")) {
            this.field_talkerId = contentValues.getAsInteger("talkerId").intValue();
            if (z) {
                this.f356058p = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isExpand")) {
            this.field_isExpand = contentValues.getAsInteger("isExpand").intValue() != 0;
            if (z) {
                this.f356059q = true;
            }
        }
        if (contentValues.containsKey("orderFlag")) {
            this.field_orderFlag = contentValues.getAsLong("orderFlag").longValue();
            if (z) {
                this.f356060r = true;
            }
        }
        if (contentValues.containsKey("hasShow")) {
            this.field_hasShow = contentValues.getAsInteger("hasShow").intValue();
            if (z) {
                this.f356061s = true;
            }
        }
        if (contentValues.containsKey("placeTop")) {
            this.field_placeTop = contentValues.getAsInteger("placeTop").intValue();
            if (z) {
                this.f356062t = true;
            }
        }
        if (contentValues.containsKey("appMsgStatInfoProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("appMsgStatInfoProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_appMsgStatInfoProto = (C50499n6) new C50499n6().parseFrom(asByteArray);
                    if (z) {
                        this.f356063u = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseBizTimeLineInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsInteger("isRead").intValue();
            if (z) {
                this.f356064v = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z) {
                this.f356065w = true;
            }
        }
        if (contentValues.containsKey("bizClientMsgId")) {
            this.field_bizClientMsgId = contentValues.getAsString("bizClientMsgId");
            if (z) {
                this.f356066x = true;
            }
        }
        if (contentValues.containsKey("rankSessionId")) {
            this.field_rankSessionId = contentValues.getAsString("rankSessionId");
            if (z) {
                this.f356067y = true;
            }
        }
        if (contentValues.containsKey("recommendCardId")) {
            this.field_recommendCardId = contentValues.getAsString("recommendCardId");
            if (z) {
                this.f356068z = true;
            }
        }
        if (contentValues.containsKey("isValidExposed")) {
            if (contentValues.getAsInteger("isValidExposed").intValue() != 0) {
                z2 = true;
            }
            this.field_isValidExposed = z2;
            if (z) {
                this.f356041A = true;
            }
        }
        if (contentValues.containsKey("resortBuffer")) {
            this.field_resortBuffer = contentValues.getAsString("resortBuffer");
            if (z) {
                this.f356042B = true;
            }
        }
        if (contentValues.containsKey("recycleCardType")) {
            this.field_recycleCardType = contentValues.getAsInteger("recycleCardType").intValue();
            if (z) {
                this.f356043C = true;
            }
        }
        if (contentValues.containsKey("recommendReason")) {
            this.field_recommendReason = contentValues.getAsString("recommendReason");
            if (z) {
                this.f356044D = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
