package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import junit.framework.Assert;
import te3.C64428hr2;

/* renamed from: xh.h6 */
public class C78811h6 extends IAutoDBItem {

    /* renamed from: Q0 */
    public static final Column f230684Q0;

    /* renamed from: R0 */
    public static final Column f230685R0;

    /* renamed from: S0 */
    public static final Column f230686S0;

    /* renamed from: T0 */
    public static final Column f230687T0;

    /* renamed from: U0 */
    public static final Column f230688U0;

    /* renamed from: V0 */
    public static final String[] f230689V0 = new String[0];

    /* renamed from: W0 */
    public static final int f230690W0 = 104191100;

    /* renamed from: X0 */
    public static final int f230691X0 = -1294411543;

    /* renamed from: Y0 */
    public static final int f230692Y0 = 3575610;

    /* renamed from: Z0 */
    public static final int f230693Z0 = -892481550;

    /* renamed from: a1 */
    public static final int f230694a1 = -1180128302;

    /* renamed from: b1 */
    public static final int f230695b1 = -735390658;

    /* renamed from: c1 */
    public static final int f230696c1 = 1369213417;

    /* renamed from: d1 */
    public static final int f230697d1 = -881080743;

    /* renamed from: e1 */
    public static final int f230698e1 = 951530617;

    /* renamed from: f1 */
    public static final int f230699f1 = 1916786312;

    /* renamed from: g1 */
    public static final int f230700g1 = -350385368;

    /* renamed from: h1 */
    public static final int f230701h1 = -486944182;

    /* renamed from: i1 */
    public static final int f230702i1 = -610034348;

    /* renamed from: j1 */
    public static final int f230703j1 = 1437142193;

    /* renamed from: k1 */
    public static final int f230704k1 = 522984921;

    /* renamed from: l1 */
    public static final int f230705l1 = 1298065502;

    /* renamed from: m1 */
    public static final int f230706m1 = 193082758;

    /* renamed from: n1 */
    public static final int f230707n1 = -2109920975;

    /* renamed from: o1 */
    public static final int f230708o1 = -1065033442;

    /* renamed from: p1 */
    public static final int f230709p1 = 3145580;

    /* renamed from: q1 */
    public static final int f230710q1 = 60550149;

    /* renamed from: r1 */
    public static final int f230711r1 = 1604237984;

    /* renamed from: s1 */
    public static final int f230712s1 = -285781903;

    /* renamed from: t1 */
    public static final int f230713t1 = 1725503695;

    /* renamed from: u1 */
    public static final int f230714u1 = 108705909;

    /* renamed from: v1 */
    public static final IAutoDBItem.MAutoDBInfo f230715v1 = initAutoDBInfo(C78811h6.class);

    /* renamed from: w1 */
    public static final StorageObserverOwner<C78811h6> f230716w1 = new StorageObserverOwner<>();

    /* renamed from: y0 */
    public static final SingleTable f230717y0;

    /* renamed from: A */
    public boolean f230718A = false;

    /* renamed from: B */
    public boolean f230719B = false;

    /* renamed from: C */
    public boolean f230720C = false;

    /* renamed from: D */
    public boolean f230721D = false;

    /* renamed from: E */
    public String f230722E;

    /* renamed from: F */
    public int f230723F;

    /* renamed from: G */
    public String f230724G;

    /* renamed from: H */
    public int f230725H;

    /* renamed from: I */
    public int f230726I;

    /* renamed from: J */
    public int f230727J;

    /* renamed from: K */
    public int f230728K;

    /* renamed from: L */
    public int f230729L;

    /* renamed from: M */
    public int f230730M;

    /* renamed from: N */
    public String f230731N;

    /* renamed from: P */
    public String f230732P;

    /* renamed from: Q */
    public String f230733Q;

    /* renamed from: R */
    public int f230734R;

    /* renamed from: S */
    public String f230735S;

    /* renamed from: T */
    public byte[] f230736T;

    /* renamed from: U */
    public String f230737U;

    /* renamed from: V */
    public String f230738V;

    /* renamed from: W */
    public int f230739W;

    /* renamed from: X */
    public int f230740X;

    /* renamed from: Y */
    public int f230741Y;

    /* renamed from: Z */
    public int f230742Z;

    /* renamed from: d */
    public boolean f230743d = false;

    /* renamed from: e */
    public boolean f230744e = false;

    /* renamed from: f */
    public boolean f230745f = false;
    private long field_bizChatId;
    private String field_bizChatUserId;
    private String field_bizClientMsgId;
    private String field_content;
    private long field_createTime;
    private int field_flag;
    private String field_fromUsername;
    private String field_historyId;
    private String field_imgPath;
    private int field_isSend;
    private int field_isShowTimer;
    private byte[] field_lvbuffer;
    private long field_msgId;
    private long field_msgSeq;
    private long field_msgSvrId;
    private String field_reserved;
    private C64428hr2 field_solitaireFoldInfo;
    private int field_status;
    private String field_talker;
    private int field_talkerId;
    private String field_toUsername;
    private String field_transBrandWording;
    private String field_transContent;
    private int field_type;

    /* renamed from: g */
    public boolean f230746g = false;

    /* renamed from: h */
    public boolean f230747h = false;

    /* renamed from: i */
    public boolean f230748i = false;

    /* renamed from: j */
    public boolean f230749j = false;

    /* renamed from: n */
    public boolean f230750n = false;

    /* renamed from: o */
    public boolean f230751o = false;

    /* renamed from: p */
    public boolean f230752p = false;

    /* renamed from: p0 */
    public int f230753p0;

    /* renamed from: q */
    public boolean f230754q = false;

    /* renamed from: r */
    public boolean f230755r = false;

    /* renamed from: s */
    public boolean f230756s = false;

    /* renamed from: t */
    public boolean f230757t = false;

    /* renamed from: u */
    public boolean f230758u = false;

    /* renamed from: v */
    public boolean f230759v = false;

    /* renamed from: w */
    public boolean f230760w = false;

    /* renamed from: x */
    public boolean f230761x = false;

    /* renamed from: x0 */
    public String f230762x0;

    /* renamed from: y */
    public boolean f230763y = false;

    /* renamed from: z */
    public boolean f230764z = false;

    static {
        SingleTable singleTable = new SingleTable(StateEvent.Name.MESSAGE);
        f230717y0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f230684Q0 = new Column("msgId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        f230685R0 = new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        f230686S0 = new Column("isSend", "int", singleTable.getName(), "");
        new Column("isShowTimer", "int", singleTable.getName(), "");
        f230687T0 = new Column("createTime", "long", singleTable.getName(), "");
        f230688U0 = new Column("talker", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("imgPath", "string", singleTable.getName(), "");
        new Column("reserved", "string", singleTable.getName(), "");
        new Column("lvbuffer", "byte[]", singleTable.getName(), "");
        new Column("talkerId", "int", singleTable.getName(), "");
        new Column("transContent", "string", singleTable.getName(), "");
        new Column("transBrandWording", "string", singleTable.getName(), "");
        new Column("bizClientMsgId", "string", singleTable.getName(), "");
        new Column("bizChatId", "long", singleTable.getName(), "");
        new Column("bizChatUserId", "string", singleTable.getName(), "");
        new Column("msgSeq", "long", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("solitaireFoldInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalSolitaireFoldInfo");
        new Column("fromUsername", "string", singleTable.getName(), "");
        new Column("toUsername", "string", singleTable.getName(), "");
        new Column("historyId", "string", singleTable.getName(), "");
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
        mAutoDBInfo.columns[4] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER");
        mAutoDBInfo.columns[5] = "isShowTimer";
        mAutoDBInfo.colsMap.put("isShowTimer", "INTEGER");
        mAutoDBInfo.columns[6] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[7] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[8] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "imgPath";
        mAutoDBInfo.colsMap.put("imgPath", "TEXT");
        mAutoDBInfo.columns[10] = "reserved";
        mAutoDBInfo.colsMap.put("reserved", "TEXT");
        mAutoDBInfo.columns[11] = "lvbuffer";
        mAutoDBInfo.colsMap.put("lvbuffer", "BLOB");
        mAutoDBInfo.columns[12] = "talkerId";
        mAutoDBInfo.colsMap.put("talkerId", "INTEGER");
        mAutoDBInfo.columns[13] = "transContent";
        mAutoDBInfo.colsMap.put("transContent", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "transBrandWording";
        mAutoDBInfo.colsMap.put("transBrandWording", "TEXT default '' ");
        mAutoDBInfo.columns[15] = "bizClientMsgId";
        mAutoDBInfo.colsMap.put("bizClientMsgId", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "bizChatId";
        mAutoDBInfo.colsMap.put("bizChatId", "LONG default '-1' ");
        mAutoDBInfo.columns[17] = "bizChatUserId";
        mAutoDBInfo.colsMap.put("bizChatUserId", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "msgSeq";
        mAutoDBInfo.colsMap.put("msgSeq", "LONG");
        mAutoDBInfo.columns[19] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "solitaireFoldInfo";
        mAutoDBInfo.colsMap.put("solitaireFoldInfo", "BLOB");
        mAutoDBInfo.columns[21] = "fromUsername";
        mAutoDBInfo.colsMap.put("fromUsername", "TEXT");
        mAutoDBInfo.columns[22] = "toUsername";
        mAutoDBInfo.colsMap.put("toUsername", "TEXT");
        mAutoDBInfo.columns[23] = "historyId";
        mAutoDBInfo.colsMap.put("historyId", "TEXT");
        mAutoDBInfo.columns[24] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  msgSvrId LONG,  type INTEGER,  status INTEGER,  isSend INTEGER,  isShowTimer INTEGER,  createTime LONG,  talker TEXT,  content TEXT default '' ,  imgPath TEXT,  reserved TEXT,  lvbuffer BLOB,  talkerId INTEGER,  transContent TEXT default '' ,  transBrandWording TEXT default '' ,  bizClientMsgId TEXT default '' ,  bizChatId LONG default '-1' ,  bizChatUserId TEXT default '' ,  msgSeq LONG,  flag INTEGER default '0' ,  solitaireFoldInfo BLOB,  fromUsername TEXT,  toUsername TEXT,  historyId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: A2 */
    public final C64428hr2 mo108722A2() {
        return this.field_solitaireFoldInfo;
    }

    /* renamed from: B2 */
    public int mo108723B2() {
        return this.field_talkerId;
    }

    /* renamed from: C2 */
    public int mo108724C2() {
        return this.f230726I;
    }

    /* renamed from: D2 */
    public int mo108725D2() {
        return this.f230725H;
    }

    /* renamed from: E2 */
    public String mo100965E2() {
        return this.field_toUsername;
    }

    /* renamed from: F2 */
    public String mo108726F2() {
        return this.field_transBrandWording;
    }

    /* renamed from: G2 */
    public String mo108727G2() {
        return this.field_transContent;
    }

    /* renamed from: H2 */
    public void mo108728H2(long j) {
        this.field_bizChatId = j;
        this.f230760w = true;
    }

    /* renamed from: I2 */
    public void mo108729I2(String str) {
        this.field_bizChatUserId = str;
        this.f230761x = true;
    }

    /* renamed from: J2 */
    public void mo108730J2(String str) {
        this.field_bizClientMsgId = str;
        this.f230759v = true;
    }

    /* renamed from: K2 */
    public void mo108731K2(String str) {
        this.f230732P = str;
        this.f230755r = true;
    }

    /* renamed from: L2 */
    public void mo108732L2(String str) {
        this.field_content = str;
        this.f230751o = true;
    }

    /* renamed from: M2 */
    public void mo108733M2(long j) {
        this.field_createTime = j;
        this.f230749j = true;
    }

    /* renamed from: N2 */
    public void mo108734N2(int i) {
        this.f230742Z = i;
        this.f230755r = true;
    }

    /* renamed from: O2 */
    public void mo108735O2(int i) {
        this.field_flag = i;
        this.f230764z = true;
    }

    /* renamed from: P2 */
    public void mo108736P2(String str) {
        this.field_fromUsername = str;
        this.f230719B = true;
    }

    /* renamed from: Q2 */
    public void mo108737Q2(String str) {
        this.f230738V = str;
        this.f230755r = true;
    }

    /* renamed from: R2 */
    public void mo108738R2(String str) {
        this.field_historyId = str;
        this.f230721D = true;
    }

    /* renamed from: S2 */
    public void mo108739S2(String str) {
        this.field_imgPath = str;
        this.f230752p = true;
    }

    /* renamed from: T2 */
    public void mo108740T2(int i) {
        this.field_isSend = i;
        this.f230747h = true;
    }

    /* renamed from: U2 */
    public void mo108741U2(int i) {
        this.field_isShowTimer = i;
        this.f230748i = true;
    }

    /* renamed from: V2 */
    public void mo108742V2(byte[] bArr) {
        this.field_lvbuffer = bArr;
        this.f230755r = true;
    }

    /* renamed from: W2 */
    public void mo108743W2(int i) {
        this.f230723F = i;
        this.f230755r = true;
    }

    /* renamed from: X2 */
    public void mo108744X2(long j) {
        this.field_msgSeq = j;
        this.f230763y = true;
    }

    /* renamed from: Y2 */
    public void mo108745Y2(long j) {
        this.field_msgSvrId = j;
        this.f230744e = true;
    }

    /* renamed from: Z2 */
    public void mo108746Z2(String str) {
        this.field_reserved = str;
        this.f230754q = true;
    }

    /* renamed from: a3 */
    public final void mo108747a3(C64428hr2 hr22) {
        this.field_solitaireFoldInfo = hr22;
        this.f230718A = true;
    }

    /* renamed from: b3 */
    public void mo108748b3(int i) {
        this.f230728K = i;
        this.f230755r = true;
    }

    /* renamed from: c3 */
    public void mo108749c3(String str) {
        this.field_talker = str;
        this.f230750n = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78811h6)) {
            return false;
        }
        C78811h6 h6Var = (C78811h6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(h6Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(h6Var.field_msgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(h6Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(h6Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(h6Var.field_isSend)) && C46238a.m51546a(Integer.valueOf(this.field_isShowTimer), Integer.valueOf(h6Var.field_isShowTimer)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(h6Var.field_createTime)) && C46238a.m51546a(this.field_talker, h6Var.field_talker) && C46238a.m51546a(this.field_content, h6Var.field_content) && C46238a.m51546a(this.field_imgPath, h6Var.field_imgPath) && C46238a.m51546a(this.field_reserved, h6Var.field_reserved) && C46238a.m51546a(this.field_lvbuffer, h6Var.field_lvbuffer) && C46238a.m51546a(Integer.valueOf(this.field_talkerId), Integer.valueOf(h6Var.field_talkerId)) && C46238a.m51546a(this.field_transContent, h6Var.field_transContent) && C46238a.m51546a(this.field_transBrandWording, h6Var.field_transBrandWording) && C46238a.m51546a(this.field_bizClientMsgId, h6Var.field_bizClientMsgId) && C46238a.m51546a(Long.valueOf(this.field_bizChatId), Long.valueOf(h6Var.field_bizChatId)) && C46238a.m51546a(this.field_bizChatUserId, h6Var.field_bizChatUserId) && C46238a.m51546a(Long.valueOf(this.field_msgSeq), Long.valueOf(h6Var.field_msgSeq)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(h6Var.field_flag)) && C46238a.m51546a(this.field_solitaireFoldInfo, h6Var.field_solitaireFoldInfo) && C46238a.m51546a(this.field_fromUsername, h6Var.field_fromUsername) && C46238a.m51546a(this.field_toUsername, h6Var.field_toUsername) && C46238a.m51546a(this.field_historyId, h6Var.field_historyId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230690W0 == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f230743d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230691X0 == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230692Y0 == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230693Z0 == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230694a1 == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230695b1 == hashCode) {
                    try {
                        this.field_isShowTimer = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230696c1 == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230697d1 == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230698e1 == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230699f1 == hashCode) {
                    try {
                        this.field_imgPath = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230700g1 == hashCode) {
                    try {
                        this.field_reserved = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230701h1 == hashCode) {
                    try {
                        this.field_lvbuffer = cursor.getBlob(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230702i1 == hashCode) {
                    try {
                        this.field_talkerId = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230703j1 == hashCode) {
                    try {
                        this.field_transContent = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230704k1 == hashCode) {
                    try {
                        this.field_transBrandWording = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230705l1 == hashCode) {
                    try {
                        this.field_bizClientMsgId = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230706m1 == hashCode) {
                    try {
                        this.field_bizChatId = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230707n1 == hashCode) {
                    try {
                        this.field_bizChatUserId = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230708o1 == hashCode) {
                    try {
                        this.field_msgSeq = cursor.getLong(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230709p1 == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230710q1 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_solitaireFoldInfo = (C64428hr2) new C64428hr2().parseFrom(blob);
                        }
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230711r1 == hashCode) {
                    try {
                        this.field_fromUsername = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230712s1 == hashCode) {
                    try {
                        this.field_toUsername = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230713t1 == hashCode) {
                    try {
                        this.field_historyId = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230714u1 == hashCode) {
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
                        Log.m105920e("MicroMsg.SDK.BaseMsgInfo", "parse LVBuffer error:" + initParse);
                        return;
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230722E = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230723F = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230724G = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230725H = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230726I = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230727J = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230728K = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230729L = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230730M = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230731N = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230732P = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230733Q = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230734R = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230735S = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230736T = lVBuffer.getBuffer();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230737U = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230738V = lVBuffer.getString();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230739W = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230740X = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230741Y = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230742Z = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230753p0 = lVBuffer.getInt();
                    }
                    if (!lVBuffer.checkGetFinish()) {
                        this.f230762x0 = lVBuffer.getString();
                    }
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.SDK.BaseMsgInfo", "get value failed");
            }
        }
    }

    public ContentValues convertTo() {
        C64428hr2 hr22;
        try {
            if (this.f230755r) {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putString(this.f230722E);
                lVBuffer.putInt(this.f230723F);
                lVBuffer.putString(this.f230724G);
                lVBuffer.putInt(this.f230725H);
                lVBuffer.putInt(this.f230726I);
                lVBuffer.putInt(this.f230727J);
                lVBuffer.putInt(this.f230728K);
                lVBuffer.putInt(this.f230729L);
                lVBuffer.putInt(this.f230730M);
                lVBuffer.putString(this.f230731N);
                lVBuffer.putString(this.f230732P);
                lVBuffer.putString(this.f230733Q);
                lVBuffer.putInt(this.f230734R);
                lVBuffer.putString(this.f230735S);
                lVBuffer.putBuffer(this.f230736T);
                lVBuffer.putString(this.f230737U);
                lVBuffer.putString(this.f230738V);
                lVBuffer.putInt(this.f230739W);
                lVBuffer.putInt(this.f230740X);
                lVBuffer.putInt(this.f230741Y);
                lVBuffer.putInt(this.f230742Z);
                lVBuffer.putInt(this.f230753p0);
                lVBuffer.putString(this.f230762x0);
                this.field_lvbuffer = lVBuffer.buildFinish();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDK.BaseMsgInfo", "get value failed, %s", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        if (this.f230743d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f230744e) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f230745f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f230746g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f230747h) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f230748i) {
            contentValues.put("isShowTimer", Integer.valueOf(this.field_isShowTimer));
        }
        if (this.f230749j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f230750n) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f230751o) {
            contentValues.put("content", this.field_content);
        }
        if (this.f230752p) {
            contentValues.put("imgPath", this.field_imgPath);
        }
        if (this.f230754q) {
            contentValues.put("reserved", this.field_reserved);
        }
        if (this.f230755r) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f230756s) {
            contentValues.put("talkerId", Integer.valueOf(this.field_talkerId));
        }
        if (this.field_transContent == null) {
            this.field_transContent = "";
        }
        if (this.f230757t) {
            contentValues.put("transContent", this.field_transContent);
        }
        if (this.field_transBrandWording == null) {
            this.field_transBrandWording = "";
        }
        if (this.f230758u) {
            contentValues.put("transBrandWording", this.field_transBrandWording);
        }
        if (this.field_bizClientMsgId == null) {
            this.field_bizClientMsgId = "";
        }
        if (this.f230759v) {
            contentValues.put("bizClientMsgId", this.field_bizClientMsgId);
        }
        if (this.f230760w) {
            contentValues.put("bizChatId", Long.valueOf(this.field_bizChatId));
        }
        if (this.field_bizChatUserId == null) {
            this.field_bizChatUserId = "";
        }
        if (this.f230761x) {
            contentValues.put("bizChatUserId", this.field_bizChatUserId);
        }
        if (this.f230763y) {
            contentValues.put("msgSeq", Long.valueOf(this.field_msgSeq));
        }
        if (this.f230764z) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f230718A && (hr22 = this.field_solitaireFoldInfo) != null) {
            try {
                contentValues.put("solitaireFoldInfo", hr22.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseMsgInfo", e2.getMessage());
            }
        }
        if (this.f230719B) {
            contentValues.put("fromUsername", this.field_fromUsername);
        }
        if (this.f230720C) {
            contentValues.put("toUsername", this.field_toUsername);
        }
        if (this.f230721D) {
            contentValues.put("historyId", this.field_historyId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    /* renamed from: d */
    public void mo100991d(int i) {
        this.field_status = i;
        this.f230746g = true;
    }

    /* renamed from: d3 */
    public void mo108750d3(int i) {
        this.field_talkerId = i;
        this.f230756s = true;
    }

    /* renamed from: e3 */
    public void mo108751e3(int i) {
        this.f230726I = i;
        this.f230755r = true;
    }

    /* renamed from: f3 */
    public void mo108752f3(int i) {
        this.f230725H = i;
        this.f230755r = true;
    }

    /* renamed from: g3 */
    public void mo108753g3(String str) {
        this.field_toUsername = str;
        this.f230720C = true;
    }

    public String getContent() {
        return this.field_content;
    }

    public long getCreateTime() {
        return this.field_createTime;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230715v1;
    }

    public String[] getIndexCreateSQL() {
        return f230689V0;
    }

    public long getMsgId() {
        return this.field_msgId;
    }

    public StorageObserverOwner<C78811h6> getObserverOwner() {
        return f230716w1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public int getStatus() {
        return this.field_status;
    }

    public SingleTable getTable() {
        return f230717y0;
    }

    public String getTableName() {
        return f230717y0.getName();
    }

    public int getType() {
        return this.field_type;
    }

    /* renamed from: h3 */
    public void mo108757h3(String str) {
        this.field_transBrandWording = str;
        this.f230758u = true;
    }

    /* renamed from: i3 */
    public void mo108758i3(String str) {
        this.field_transContent = str;
        this.f230757t = true;
    }

    /* renamed from: l2 */
    public long mo108759l2() {
        return this.field_bizChatId;
    }

    /* renamed from: m2 */
    public String mo108760m2() {
        return this.field_bizChatUserId;
    }

    /* renamed from: n2 */
    public String mo108761n2() {
        return this.field_bizClientMsgId;
    }

    /* renamed from: o2 */
    public int mo108762o2() {
        return this.field_flag;
    }

    /* renamed from: p2 */
    public String mo101010p2() {
        return this.field_fromUsername;
    }

    /* renamed from: q2 */
    public String mo108763q2() {
        return this.f230738V;
    }

    /* renamed from: r2 */
    public String mo108764r2() {
        return this.field_historyId;
    }

    /* renamed from: s2 */
    public String mo108765s2() {
        return this.field_imgPath;
    }

    public void setMsgId(long j) {
        this.field_msgId = j;
        this.f230743d = true;
    }

    public void setType(int i) {
        this.field_type = i;
        this.f230745f = true;
    }

    /* renamed from: t */
    public String mo108768t() {
        return this.field_talker;
    }

    /* renamed from: t2 */
    public int mo108769t2() {
        return this.field_isSend;
    }

    /* renamed from: u2 */
    public int mo108770u2() {
        return this.field_isShowTimer;
    }

    /* renamed from: v2 */
    public byte[] mo108771v2() {
        return this.field_lvbuffer;
    }

    /* renamed from: w2 */
    public long mo108772w2() {
        return this.field_msgSeq;
    }

    /* renamed from: x2 */
    public String mo108773x2() {
        return this.f230724G;
    }

    /* renamed from: y2 */
    public long mo108774y2() {
        return this.field_msgSvrId;
    }

    /* renamed from: z2 */
    public String mo108775z2() {
        return this.field_reserved;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f230743d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f230744e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f230745f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f230746g = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f230747h = true;
            }
        }
        if (contentValues.containsKey("isShowTimer")) {
            this.field_isShowTimer = contentValues.getAsInteger("isShowTimer").intValue();
            if (z) {
                this.f230748i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f230749j = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f230750n = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f230751o = true;
            }
        }
        if (contentValues.containsKey("imgPath")) {
            this.field_imgPath = contentValues.getAsString("imgPath");
            if (z) {
                this.f230752p = true;
            }
        }
        if (contentValues.containsKey("reserved")) {
            this.field_reserved = contentValues.getAsString("reserved");
            if (z) {
                this.f230754q = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z) {
                this.f230755r = true;
            }
        }
        if (contentValues.containsKey("talkerId")) {
            this.field_talkerId = contentValues.getAsInteger("talkerId").intValue();
            if (z) {
                this.f230756s = true;
            }
        }
        if (contentValues.containsKey("transContent")) {
            this.field_transContent = contentValues.getAsString("transContent");
            if (z) {
                this.f230757t = true;
            }
        }
        if (contentValues.containsKey("transBrandWording")) {
            this.field_transBrandWording = contentValues.getAsString("transBrandWording");
            if (z) {
                this.f230758u = true;
            }
        }
        if (contentValues.containsKey("bizClientMsgId")) {
            this.field_bizClientMsgId = contentValues.getAsString("bizClientMsgId");
            if (z) {
                this.f230759v = true;
            }
        }
        if (contentValues.containsKey("bizChatId")) {
            this.field_bizChatId = contentValues.getAsLong("bizChatId").longValue();
            if (z) {
                this.f230760w = true;
            }
        }
        if (contentValues.containsKey("bizChatUserId")) {
            this.field_bizChatUserId = contentValues.getAsString("bizChatUserId");
            if (z) {
                this.f230761x = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.field_msgSeq = contentValues.getAsLong("msgSeq").longValue();
            if (z) {
                this.f230763y = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f230764z = true;
            }
        }
        if (contentValues.containsKey("solitaireFoldInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("solitaireFoldInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_solitaireFoldInfo = (C64428hr2) new C64428hr2().parseFrom(asByteArray);
                    if (z) {
                        this.f230718A = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseMsgInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("fromUsername")) {
            this.field_fromUsername = contentValues.getAsString("fromUsername");
            if (z) {
                this.f230719B = true;
            }
        }
        if (contentValues.containsKey("toUsername")) {
            this.field_toUsername = contentValues.getAsString("toUsername");
            if (z) {
                this.f230720C = true;
            }
        }
        if (contentValues.containsKey("historyId")) {
            this.field_historyId = contentValues.getAsString("historyId");
            if (z) {
                this.f230721D = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
