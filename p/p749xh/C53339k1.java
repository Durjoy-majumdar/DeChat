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
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import junit.framework.Assert;
import te3.C49072d00;

/* renamed from: xh.k1 */
public class C53339k1 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f149457A1 = 2108832346;

    /* renamed from: B1 */
    public static final int f149458B1 = 960914961;

    /* renamed from: C1 */
    public static final int f149459C1 = -1091008291;

    /* renamed from: D1 */
    public static final int f149460D1 = -1033431163;

    /* renamed from: E1 */
    public static final int f149461E1 = -1914377637;

    /* renamed from: F1 */
    public static final int f149462F1 = 722913855;

    /* renamed from: G1 */
    public static final int f149463G1 = 1764174775;

    /* renamed from: H1 */
    public static final int f149464H1 = 1223897956;

    /* renamed from: I1 */
    public static final int f149465I1 = 1014117442;

    /* renamed from: J1 */
    public static final int f149466J1 = 1685833358;

    /* renamed from: K1 */
    public static final int f149467K1 = -1211935276;

    /* renamed from: L1 */
    public static final int f149468L1 = -873960692;

    /* renamed from: M1 */
    public static final int f149469M1 = 1007591778;

    /* renamed from: N1 */
    public static final int f149470N1 = 1254036432;

    /* renamed from: O1 */
    public static final int f149471O1 = 108705909;

    /* renamed from: P1 */
    public static final IAutoDBItem.MAutoDBInfo f149472P1 = initAutoDBInfo(C53339k1.class);

    /* renamed from: Q1 */
    public static final StorageObserverOwner<C53339k1> f149473Q1 = new StorageObserverOwner<>();

    /* renamed from: h1 */
    public static final SingleTable f149474h1;

    /* renamed from: i1 */
    public static final Column f149475i1;

    /* renamed from: j1 */
    public static final Column f149476j1;

    /* renamed from: k1 */
    public static final Column f149477k1;

    /* renamed from: l1 */
    public static final Column f149478l1;

    /* renamed from: m1 */
    public static final Column f149479m1;

    /* renamed from: n1 */
    public static final String[] f149480n1 = {"CREATE INDEX IF NOT EXISTS deleteflag_index ON rcontact(deleteFlag)"};

    /* renamed from: o1 */
    public static final int f149481o1 = -265713450;

    /* renamed from: p1 */
    public static final int f149482p1 = 92902992;

    /* renamed from: q1 */
    public static final int f149483q1 = -1380546654;

    /* renamed from: r1 */
    public static final int f149484r1 = -1244137598;

    /* renamed from: s1 */
    public static final int f149485s1 = 70690926;

    /* renamed from: t1 */
    public static final int f149486t1 = -826755845;

    /* renamed from: u1 */
    public static final int f149487u1 = 651250308;

    /* renamed from: v1 */
    public static final int f149488v1 = -339192195;

    /* renamed from: w1 */
    public static final int f149489w1 = 3575610;

    /* renamed from: x1 */
    public static final int f149490x1 = -845764626;

    /* renamed from: y1 */
    public static final int f149491y1 = 1200434292;

    /* renamed from: z1 */
    public static final int f149492z1 = -811200138;

    /* renamed from: A */
    public boolean f149493A = false;

    /* renamed from: B */
    public boolean f149494B = false;

    /* renamed from: C */
    public boolean f149495C = false;

    /* renamed from: D */
    public boolean f149496D = false;

    /* renamed from: E */
    public boolean f149497E = false;

    /* renamed from: F */
    public boolean f149498F = false;

    /* renamed from: G */
    public int f149499G;

    /* renamed from: H */
    public int f149500H;

    /* renamed from: I */
    public String f149501I;

    /* renamed from: J */
    public long f149502J;

    /* renamed from: K */
    public int f149503K;

    /* renamed from: L */
    public String f149504L;

    /* renamed from: M */
    public String f149505M;

    /* renamed from: N */
    public int f149506N;

    /* renamed from: P */
    public int f149507P;

    /* renamed from: Q */
    public String f149508Q;

    /* renamed from: Q0 */
    public int f149509Q0;

    /* renamed from: R */
    public String f149510R;

    /* renamed from: R0 */
    public int f149511R0;

    /* renamed from: S */
    public int f149512S;

    /* renamed from: S0 */
    public String f149513S0;

    /* renamed from: T */
    public int f149514T;

    /* renamed from: T0 */
    public String f149515T0;

    /* renamed from: U */
    public String f149516U;

    /* renamed from: U0 */
    public String f149517U0;

    /* renamed from: V */
    public String f149518V;

    /* renamed from: V0 */
    public String f149519V0;

    /* renamed from: W */
    public String f149520W;

    /* renamed from: W0 */
    public String f149521W0;

    /* renamed from: X */
    public String f149522X;

    /* renamed from: X0 */
    public String f149523X0;

    /* renamed from: Y */
    public int f149524Y;

    /* renamed from: Y0 */
    public String f149525Y0;

    /* renamed from: Z */
    public int f149526Z;

    /* renamed from: Z0 */
    public String f149527Z0;

    /* renamed from: a1 */
    public int f149528a1;

    /* renamed from: b1 */
    public String f149529b1;

    /* renamed from: c1 */
    public int f149530c1;

    /* renamed from: d */
    public boolean f149531d = false;

    /* renamed from: d1 */
    public String f149532d1;

    /* renamed from: e */
    public boolean f149533e = false;

    /* renamed from: e1 */
    public int f149534e1;

    /* renamed from: f */
    public boolean f149535f = false;

    /* renamed from: f1 */
    public long f149536f1;
    private String field_alias;
    private int field_chatroomFlag;
    private String field_conRemark;
    private String field_conRemarkPYFull;
    private String field_conRemarkPYShort;
    private C49072d00 field_contactExtra;
    private String field_contactLabelIds;
    private int field_deleteFlag;
    private String field_descWordingId;
    private String field_domainList;
    private String field_encryptUsername;
    private byte[] field_lvbuff;
    private String field_nickname;
    private String field_openImAppid;
    private String field_pyInitial;
    private String field_quanPin;
    private int field_showHead;
    private String field_sourceExtInfo;
    private String field_ticket;
    private int field_type;
    private long field_uiType;
    private String field_username;
    private long field_usernameFlag;
    private int field_verifyFlag;
    private int field_weiboFlag;
    private String field_weiboNickname;

    /* renamed from: g */
    public boolean f149537g = false;

    /* renamed from: g1 */
    public long f149538g1;

    /* renamed from: h */
    public boolean f149539h = false;

    /* renamed from: i */
    public boolean f149540i = false;

    /* renamed from: j */
    public boolean f149541j = false;

    /* renamed from: n */
    public boolean f149542n = false;

    /* renamed from: o */
    public boolean f149543o = false;

    /* renamed from: p */
    public boolean f149544p = false;

    /* renamed from: p0 */
    public String f149545p0;

    /* renamed from: q */
    public boolean f149546q = false;

    /* renamed from: r */
    public boolean f149547r = false;

    /* renamed from: s */
    public boolean f149548s = false;

    /* renamed from: t */
    public boolean f149549t = false;

    /* renamed from: u */
    public boolean f149550u = false;

    /* renamed from: v */
    public boolean f149551v = false;

    /* renamed from: w */
    public boolean f149552w = false;

    /* renamed from: x */
    public boolean f149553x = false;

    /* renamed from: x0 */
    public String f149554x0;

    /* renamed from: y */
    public boolean f149555y = false;

    /* renamed from: y0 */
    public String f149556y0;

    /* renamed from: z */
    public boolean f149557z = false;

    static {
        SingleTable singleTable = new SingleTable("rcontact");
        f149474h1 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f149475i1 = new Column("username", "string", singleTable.getName(), "");
        new Column("alias", "string", singleTable.getName(), "");
        new Column("conRemark", "string", singleTable.getName(), "");
        new Column("domainList", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("pyInitial", "string", singleTable.getName(), "");
        new Column("quanPin", "string", singleTable.getName(), "");
        new Column("showHead", "int", singleTable.getName(), "");
        f149476j1 = new Column("type", "int", singleTable.getName(), "");
        new Column("uiType", "long", singleTable.getName(), "");
        new Column("weiboFlag", "int", singleTable.getName(), "");
        new Column("weiboNickname", "string", singleTable.getName(), "");
        new Column("conRemarkPYFull", "string", singleTable.getName(), "");
        new Column("conRemarkPYShort", "string", singleTable.getName(), "");
        new Column("lvbuff", "byte[]", singleTable.getName(), "");
        f149477k1 = new Column("verifyFlag", "int", singleTable.getName(), "");
        new Column("encryptUsername", "string", singleTable.getName(), "");
        new Column("chatroomFlag", "int", singleTable.getName(), "");
        new Column("deleteFlag", "int", singleTable.getName(), "");
        f149478l1 = new Column("contactLabelIds", "string", singleTable.getName(), "");
        new Column("descWordingId", "string", singleTable.getName(), "");
        new Column("openImAppid", "string", singleTable.getName(), "");
        new Column("sourceExtInfo", "string", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
        f149479m1 = new Column("usernameFlag", "long", singleTable.getName(), "");
        new Column("contactExtra", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.ContactExtraInfo");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[26];
        String[] strArr = new String[27];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "alias";
        mAutoDBInfo.colsMap.put("alias", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "conRemark";
        mAutoDBInfo.colsMap.put("conRemark", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "domainList";
        mAutoDBInfo.colsMap.put("domainList", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "pyInitial";
        mAutoDBInfo.colsMap.put("pyInitial", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "quanPin";
        mAutoDBInfo.colsMap.put("quanPin", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "showHead";
        mAutoDBInfo.colsMap.put("showHead", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "uiType";
        mAutoDBInfo.colsMap.put("uiType", "LONG default '0' ");
        mAutoDBInfo.columns[10] = "weiboFlag";
        mAutoDBInfo.colsMap.put("weiboFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "weiboNickname";
        mAutoDBInfo.colsMap.put("weiboNickname", "TEXT default '' ");
        mAutoDBInfo.columns[12] = "conRemarkPYFull";
        mAutoDBInfo.colsMap.put("conRemarkPYFull", "TEXT default '' ");
        mAutoDBInfo.columns[13] = "conRemarkPYShort";
        mAutoDBInfo.colsMap.put("conRemarkPYShort", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "lvbuff";
        mAutoDBInfo.colsMap.put("lvbuff", "BLOB");
        mAutoDBInfo.columns[15] = "verifyFlag";
        mAutoDBInfo.colsMap.put("verifyFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "encryptUsername";
        mAutoDBInfo.colsMap.put("encryptUsername", "TEXT default '' ");
        mAutoDBInfo.columns[17] = "chatroomFlag";
        mAutoDBInfo.colsMap.put("chatroomFlag", "INTEGER");
        mAutoDBInfo.columns[18] = "deleteFlag";
        mAutoDBInfo.colsMap.put("deleteFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "contactLabelIds";
        mAutoDBInfo.colsMap.put("contactLabelIds", "TEXT default '' ");
        mAutoDBInfo.columns[20] = "descWordingId";
        mAutoDBInfo.colsMap.put("descWordingId", "TEXT default '' ");
        mAutoDBInfo.columns[21] = "openImAppid";
        mAutoDBInfo.colsMap.put("openImAppid", "TEXT");
        mAutoDBInfo.columns[22] = "sourceExtInfo";
        mAutoDBInfo.colsMap.put("sourceExtInfo", "TEXT");
        mAutoDBInfo.columns[23] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT default '' ");
        mAutoDBInfo.columns[24] = "usernameFlag";
        mAutoDBInfo.colsMap.put("usernameFlag", "LONG default '0' ");
        mAutoDBInfo.columns[25] = "contactExtra";
        mAutoDBInfo.colsMap.put("contactExtra", "BLOB");
        mAutoDBInfo.columns[26] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  alias TEXT default '' ,  conRemark TEXT default '' ,  domainList TEXT default '' ,  nickname TEXT default '' ,  pyInitial TEXT default '' ,  quanPin TEXT default '' ,  showHead INTEGER default '0' ,  type INTEGER default '0' ,  uiType LONG default '0' ,  weiboFlag INTEGER default '0' ,  weiboNickname TEXT default '' ,  conRemarkPYFull TEXT default '' ,  conRemarkPYShort TEXT default '' ,  lvbuff BLOB,  verifyFlag INTEGER default '0' ,  encryptUsername TEXT default '' ,  chatroomFlag INTEGER,  deleteFlag INTEGER default '0' ,  contactLabelIds TEXT default '' ,  descWordingId TEXT default '' ,  openImAppid TEXT,  sourceExtInfo TEXT,  ticket TEXT default '' ,  usernameFlag LONG default '0' ,  contactExtra BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: A2 */
    public int mo62845A2() {
        return this.field_showHead;
    }

    /* renamed from: B2 */
    public String mo73950B2() {
        return this.field_sourceExtInfo;
    }

    /* renamed from: C2 */
    public long mo73951C2() {
        return this.field_uiType;
    }

    /* renamed from: D2 */
    public long mo73952D2() {
        return this.field_usernameFlag;
    }

    /* renamed from: E2 */
    public int mo73953E2() {
        return this.field_verifyFlag;
    }

    /* renamed from: F2 */
    public String mo73954F2() {
        return this.f149545p0;
    }

    /* renamed from: G2 */
    public int mo73955G2() {
        return this.field_weiboFlag;
    }

    /* renamed from: H2 */
    public String mo73956H2() {
        return this.field_weiboNickname;
    }

    /* renamed from: I2 */
    public void mo62857I2(String str) {
        this.field_alias = str;
        this.f149533e = true;
    }

    /* renamed from: J2 */
    public void mo73957J2(int i) {
        this.field_chatroomFlag = i;
        this.f149553x = true;
    }

    /* renamed from: K */
    public String mo73958K() {
        return this.field_ticket;
    }

    /* renamed from: K2 */
    public void mo62860K2(String str) {
        this.field_conRemark = str;
        this.f149535f = true;
    }

    /* renamed from: L2 */
    public void mo62862L2(String str) {
        this.field_conRemarkPYFull = str;
        this.f149548s = true;
    }

    /* renamed from: M2 */
    public void mo62864M2(String str) {
        this.field_conRemarkPYShort = str;
        this.f149549t = true;
    }

    /* renamed from: N2 */
    public final void mo73959N2(C49072d00 d002) {
        this.field_contactExtra = d002;
        this.f149498F = true;
    }

    /* renamed from: O2 */
    public void mo62867O2(String str) {
        this.field_contactLabelIds = str;
        this.f149557z = true;
    }

    /* renamed from: P2 */
    public void mo62869P2(int i) {
        this.field_deleteFlag = i;
        this.f149555y = true;
    }

    /* renamed from: Q2 */
    public void mo73960Q2(String str) {
        this.field_descWordingId = str;
        this.f149493A = true;
    }

    /* renamed from: R2 */
    public void mo62872R2(String str) {
        this.field_domainList = str;
        this.f149537g = true;
    }

    /* renamed from: S2 */
    public void mo62874S2(String str) {
        this.field_encryptUsername = str;
        this.f149552w = true;
    }

    /* renamed from: T2 */
    public void mo62876T2(byte[] bArr) {
        this.field_lvbuff = bArr;
        this.f149550u = true;
    }

    /* renamed from: U2 */
    public void mo62878U2(String str) {
        this.field_nickname = str;
        this.f149539h = true;
    }

    /* renamed from: V2 */
    public void mo62880V2(String str) {
        this.field_openImAppid = str;
        this.f149494B = true;
    }

    /* renamed from: W2 */
    public void mo62882W2(String str) {
        this.field_pyInitial = str;
        this.f149540i = true;
    }

    /* renamed from: X2 */
    public void mo62884X2(String str) {
        this.field_quanPin = str;
        this.f149541j = true;
    }

    /* renamed from: Y2 */
    public void mo62886Y2(int i) {
        this.field_showHead = i;
        this.f149542n = true;
    }

    /* renamed from: Z2 */
    public void mo62888Z2(String str) {
        this.field_sourceExtInfo = str;
        this.f149495C = true;
    }

    /* renamed from: a3 */
    public void mo62890a3(String str) {
        this.field_ticket = str;
        this.f149496D = true;
    }

    /* renamed from: b3 */
    public void mo73961b3(long j) {
        this.field_uiType = j;
        this.f149544p = true;
    }

    /* renamed from: c3 */
    public void mo73962c3(long j) {
        this.field_usernameFlag = j;
        this.f149497E = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53339k1)) {
            return false;
        }
        C53339k1 k1Var = (C53339k1) iAutoDBItem;
        return C46238a.m51546a(this.field_username, k1Var.field_username) && C46238a.m51546a(this.field_alias, k1Var.field_alias) && C46238a.m51546a(this.field_conRemark, k1Var.field_conRemark) && C46238a.m51546a(this.field_domainList, k1Var.field_domainList) && C46238a.m51546a(this.field_nickname, k1Var.field_nickname) && C46238a.m51546a(this.field_pyInitial, k1Var.field_pyInitial) && C46238a.m51546a(this.field_quanPin, k1Var.field_quanPin) && C46238a.m51546a(Integer.valueOf(this.field_showHead), Integer.valueOf(k1Var.field_showHead)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(k1Var.field_type)) && C46238a.m51546a(Long.valueOf(this.field_uiType), Long.valueOf(k1Var.field_uiType)) && C46238a.m51546a(Integer.valueOf(this.field_weiboFlag), Integer.valueOf(k1Var.field_weiboFlag)) && C46238a.m51546a(this.field_weiboNickname, k1Var.field_weiboNickname) && C46238a.m51546a(this.field_conRemarkPYFull, k1Var.field_conRemarkPYFull) && C46238a.m51546a(this.field_conRemarkPYShort, k1Var.field_conRemarkPYShort) && C46238a.m51546a(this.field_lvbuff, k1Var.field_lvbuff) && C46238a.m51546a(Integer.valueOf(this.field_verifyFlag), Integer.valueOf(k1Var.field_verifyFlag)) && C46238a.m51546a(this.field_encryptUsername, k1Var.field_encryptUsername) && C46238a.m51546a(Integer.valueOf(this.field_chatroomFlag), Integer.valueOf(k1Var.field_chatroomFlag)) && C46238a.m51546a(Integer.valueOf(this.field_deleteFlag), Integer.valueOf(k1Var.field_deleteFlag)) && C46238a.m51546a(this.field_contactLabelIds, k1Var.field_contactLabelIds) && C46238a.m51546a(this.field_descWordingId, k1Var.field_descWordingId) && C46238a.m51546a(this.field_openImAppid, k1Var.field_openImAppid) && C46238a.m51546a(this.field_sourceExtInfo, k1Var.field_sourceExtInfo) && C46238a.m51546a(this.field_ticket, k1Var.field_ticket) && C46238a.m51546a(Long.valueOf(this.field_usernameFlag), Long.valueOf(k1Var.field_usernameFlag)) && C46238a.m51546a(this.field_contactExtra, k1Var.field_contactExtra);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149481o1 == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f149531d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149482p1 == hashCode) {
                    try {
                        this.field_alias = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149483q1 == hashCode) {
                    try {
                        this.field_conRemark = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149484r1 == hashCode) {
                    try {
                        this.field_domainList = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149485s1 == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149486t1 == hashCode) {
                    try {
                        this.field_pyInitial = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149487u1 == hashCode) {
                    try {
                        this.field_quanPin = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149488v1 == hashCode) {
                    try {
                        this.field_showHead = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149489w1 == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149490x1 == hashCode) {
                    try {
                        this.field_uiType = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149491y1 == hashCode) {
                    try {
                        this.field_weiboFlag = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149492z1 == hashCode) {
                    try {
                        this.field_weiboNickname = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149457A1 == hashCode) {
                    try {
                        this.field_conRemarkPYFull = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149458B1 == hashCode) {
                    try {
                        this.field_conRemarkPYShort = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149459C1 == hashCode) {
                    try {
                        this.field_lvbuff = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149460D1 == hashCode) {
                    try {
                        this.field_verifyFlag = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149461E1 == hashCode) {
                    try {
                        this.field_encryptUsername = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149462F1 == hashCode) {
                    try {
                        this.field_chatroomFlag = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149463G1 == hashCode) {
                    try {
                        this.field_deleteFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149464H1 == hashCode) {
                    try {
                        this.field_contactLabelIds = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149465I1 == hashCode) {
                    try {
                        this.field_descWordingId = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149466J1 == hashCode) {
                    try {
                        this.field_openImAppid = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149467K1 == hashCode) {
                    try {
                        this.field_sourceExtInfo = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149468L1 == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149469M1 == hashCode) {
                    try {
                        this.field_usernameFlag = cursor.getLong(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149470N1 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_contactExtra = (C49072d00) new C49072d00().parseFrom(blob);
                        }
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseContact", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149471O1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
            parseBuff();
        }
    }

    public ContentValues convertTo() {
        C49072d00 d002;
        try {
            if (this.f149550u) {
                LVBuffer lVBuffer = new LVBuffer();
                lVBuffer.initBuild();
                lVBuffer.putInt(this.f149499G);
                lVBuffer.putInt(this.f149500H);
                lVBuffer.putString(this.f149501I);
                lVBuffer.putLong(this.f149502J);
                lVBuffer.putInt(this.f149503K);
                lVBuffer.putString(this.f149504L);
                lVBuffer.putString(this.f149505M);
                lVBuffer.putInt(this.f149506N);
                lVBuffer.putInt(this.f149507P);
                lVBuffer.putString(this.f149508Q);
                lVBuffer.putString(this.f149510R);
                lVBuffer.putInt(this.f149512S);
                lVBuffer.putInt(this.f149514T);
                lVBuffer.putString(this.f149516U);
                lVBuffer.putString(this.f149518V);
                lVBuffer.putString(this.f149520W);
                lVBuffer.putString(this.f149522X);
                lVBuffer.putInt(this.f149524Y);
                lVBuffer.putInt(this.f149526Z);
                lVBuffer.putString(this.f149545p0);
                lVBuffer.putInt(this.field_verifyFlag);
                lVBuffer.putString(this.f149554x0);
                lVBuffer.putString(this.f149556y0);
                lVBuffer.putInt(this.f149509Q0);
                lVBuffer.putInt(this.f149511R0);
                lVBuffer.putString(this.f149513S0);
                lVBuffer.putString(this.f149515T0);
                lVBuffer.putString(this.f149517U0);
                lVBuffer.putString(this.f149519V0);
                lVBuffer.putString(this.f149521W0);
                lVBuffer.putString(this.f149523X0);
                lVBuffer.putString(this.f149525Y0);
                lVBuffer.putString(this.f149527Z0);
                lVBuffer.putInt(this.f149528a1);
                lVBuffer.putString(this.f149529b1);
                lVBuffer.putInt(this.f149530c1);
                lVBuffer.putString(this.f149532d1);
                lVBuffer.putInt(this.f149534e1);
                lVBuffer.putLong(this.f149536f1);
                lVBuffer.putLong(this.f149538g1);
                this.field_lvbuff = lVBuffer.buildFinish();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDK.BaseContact", "get value failed, %s", e.getMessage());
        }
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f149531d) {
            contentValues.put("username", this.field_username);
        }
        if (this.field_alias == null) {
            this.field_alias = "";
        }
        if (this.f149533e) {
            contentValues.put("alias", this.field_alias);
        }
        if (this.field_conRemark == null) {
            this.field_conRemark = "";
        }
        if (this.f149535f) {
            contentValues.put("conRemark", this.field_conRemark);
        }
        if (this.field_domainList == null) {
            this.field_domainList = "";
        }
        if (this.f149537g) {
            contentValues.put("domainList", this.field_domainList);
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f149539h) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_pyInitial == null) {
            this.field_pyInitial = "";
        }
        if (this.f149540i) {
            contentValues.put("pyInitial", this.field_pyInitial);
        }
        if (this.field_quanPin == null) {
            this.field_quanPin = "";
        }
        if (this.f149541j) {
            contentValues.put("quanPin", this.field_quanPin);
        }
        if (this.f149542n) {
            contentValues.put("showHead", Integer.valueOf(this.field_showHead));
        }
        if (this.f149543o) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f149544p) {
            contentValues.put("uiType", Long.valueOf(this.field_uiType));
        }
        if (this.f149546q) {
            contentValues.put("weiboFlag", Integer.valueOf(this.field_weiboFlag));
        }
        if (this.field_weiboNickname == null) {
            this.field_weiboNickname = "";
        }
        if (this.f149547r) {
            contentValues.put("weiboNickname", this.field_weiboNickname);
        }
        if (this.field_conRemarkPYFull == null) {
            this.field_conRemarkPYFull = "";
        }
        if (this.f149548s) {
            contentValues.put("conRemarkPYFull", this.field_conRemarkPYFull);
        }
        if (this.field_conRemarkPYShort == null) {
            this.field_conRemarkPYShort = "";
        }
        if (this.f149549t) {
            contentValues.put("conRemarkPYShort", this.field_conRemarkPYShort);
        }
        if (this.f149550u) {
            contentValues.put("lvbuff", this.field_lvbuff);
        }
        if (this.f149551v) {
            contentValues.put("verifyFlag", Integer.valueOf(this.field_verifyFlag));
        }
        if (this.field_encryptUsername == null) {
            this.field_encryptUsername = "";
        }
        if (this.f149552w) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.f149553x) {
            contentValues.put("chatroomFlag", Integer.valueOf(this.field_chatroomFlag));
        }
        if (this.f149555y) {
            contentValues.put("deleteFlag", Integer.valueOf(this.field_deleteFlag));
        }
        if (this.field_contactLabelIds == null) {
            this.field_contactLabelIds = "";
        }
        if (this.f149557z) {
            contentValues.put("contactLabelIds", this.field_contactLabelIds);
        }
        if (this.field_descWordingId == null) {
            this.field_descWordingId = "";
        }
        if (this.f149493A) {
            contentValues.put("descWordingId", this.field_descWordingId);
        }
        if (this.f149494B) {
            contentValues.put("openImAppid", this.field_openImAppid);
        }
        if (this.f149495C) {
            contentValues.put("sourceExtInfo", this.field_sourceExtInfo);
        }
        if (this.field_ticket == null) {
            this.field_ticket = "";
        }
        if (this.f149496D) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f149497E) {
            contentValues.put("usernameFlag", Long.valueOf(this.field_usernameFlag));
        }
        if (this.f149498F && (d002 = this.field_contactExtra) != null) {
            try {
                contentValues.put("contactExtra", d002.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseContact", e2.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    /* renamed from: d3 */
    public void mo62894d3(int i) {
        this.field_verifyFlag = i;
        this.f149551v = true;
    }

    /* renamed from: e3 */
    public void mo62896e3(int i) {
        this.field_weiboFlag = i;
        this.f149546q = true;
    }

    /* renamed from: f3 */
    public void mo62899f3(String str) {
        this.field_weiboNickname = str;
        this.f149547r = true;
    }

    public String getCity() {
        return this.f149520W;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149472P1;
    }

    public String[] getIndexCreateSQL() {
        return f149480n1;
    }

    public String getNickname() {
        return this.field_nickname;
    }

    public StorageObserverOwner<C53339k1> getObserverOwner() {
        return f149473Q1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public String getProvince() {
        return this.f149518V;
    }

    public String getSignature() {
        return this.f149516U;
    }

    public SingleTable getTable() {
        return f149474h1;
    }

    public String getTableName() {
        return f149474h1.getName();
    }

    public int getType() {
        return this.field_type;
    }

    public String getUsername() {
        return this.field_username;
    }

    /* renamed from: l2 */
    public String mo62913l2() {
        return this.field_alias;
    }

    /* renamed from: m2 */
    public int mo73968m2() {
        return this.field_chatroomFlag;
    }

    /* renamed from: n2 */
    public String mo73969n2() {
        return this.field_conRemark;
    }

    /* renamed from: o2 */
    public String mo73970o2() {
        return this.field_conRemarkPYFull;
    }

    /* renamed from: p2 */
    public String mo73971p2() {
        return this.field_conRemarkPYShort;
    }

    public final void parseBuff() {
        try {
            byte[] bArr = this.field_lvbuff;
            if (bArr == null) {
                return;
            }
            if (bArr.length != 0) {
                LVBuffer lVBuffer = new LVBuffer();
                int initParse = lVBuffer.initParse(this.field_lvbuff);
                if (initParse != 0) {
                    Log.m105920e("MicroMsg.SDK.BaseContact", "parse LVBuffer error:" + initParse);
                    return;
                }
                this.f149499G = lVBuffer.getInt();
                this.f149500H = lVBuffer.getInt();
                this.f149501I = lVBuffer.getString();
                this.f149502J = lVBuffer.getLong();
                this.f149503K = lVBuffer.getInt();
                this.f149504L = lVBuffer.getString();
                this.f149505M = lVBuffer.getString();
                this.f149506N = lVBuffer.getInt();
                this.f149507P = lVBuffer.getInt();
                this.f149508Q = lVBuffer.getString();
                this.f149510R = lVBuffer.getString();
                this.f149512S = lVBuffer.getInt();
                this.f149514T = lVBuffer.getInt();
                this.f149516U = lVBuffer.getString();
                this.f149518V = lVBuffer.getString();
                this.f149520W = lVBuffer.getString();
                this.f149522X = lVBuffer.getString();
                this.f149524Y = lVBuffer.getInt();
                this.f149526Z = lVBuffer.getInt();
                this.f149545p0 = lVBuffer.getString();
                this.field_verifyFlag = lVBuffer.getInt();
                this.f149554x0 = lVBuffer.getString();
                if (!lVBuffer.checkGetFinish()) {
                    this.f149556y0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149509Q0 = lVBuffer.getInt();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149511R0 = lVBuffer.getInt();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149513S0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149515T0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149517U0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149519V0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149521W0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149523X0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149525Y0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149527Z0 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149528a1 = lVBuffer.getInt();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149529b1 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149530c1 = lVBuffer.getInt();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149532d1 = lVBuffer.getString();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149534e1 = lVBuffer.getInt();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149536f1 = lVBuffer.getLong();
                }
                if (!lVBuffer.checkGetFinish()) {
                    this.f149538g1 = lVBuffer.getLong();
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SDK.BaseContact", "get value failed");
        }
    }

    /* renamed from: q2 */
    public final C49072d00 mo73973q2() {
        return this.field_contactExtra;
    }

    /* renamed from: r2 */
    public String mo73974r2() {
        return this.field_contactLabelIds;
    }

    /* renamed from: s2 */
    public int mo73975s2() {
        return this.field_deleteFlag;
    }

    public void setType(int i) {
        this.field_type = i;
        this.f149543o = true;
    }

    public void setUsername(String str) {
        this.field_username = str;
        this.f149531d = true;
    }

    /* renamed from: t2 */
    public String mo73976t2() {
        return this.field_descWordingId;
    }

    /* renamed from: u2 */
    public String mo73977u2() {
        return this.field_domainList;
    }

    /* renamed from: v2 */
    public String mo73978v2() {
        return this.field_encryptUsername;
    }

    /* renamed from: w2 */
    public byte[] mo73979w2() {
        return this.field_lvbuff;
    }

    /* renamed from: x2 */
    public String mo73980x2() {
        return this.field_openImAppid;
    }

    /* renamed from: y2 */
    public String mo62942y2() {
        return this.field_pyInitial;
    }

    /* renamed from: z2 */
    public String mo62945z2() {
        return this.field_quanPin;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f149531d = true;
            }
        }
        if (contentValues.containsKey("alias")) {
            this.field_alias = contentValues.getAsString("alias");
            if (z) {
                this.f149533e = true;
            }
        }
        if (contentValues.containsKey("conRemark")) {
            this.field_conRemark = contentValues.getAsString("conRemark");
            if (z) {
                this.f149535f = true;
            }
        }
        if (contentValues.containsKey("domainList")) {
            this.field_domainList = contentValues.getAsString("domainList");
            if (z) {
                this.f149537g = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f149539h = true;
            }
        }
        if (contentValues.containsKey("pyInitial")) {
            this.field_pyInitial = contentValues.getAsString("pyInitial");
            if (z) {
                this.f149540i = true;
            }
        }
        if (contentValues.containsKey("quanPin")) {
            this.field_quanPin = contentValues.getAsString("quanPin");
            if (z) {
                this.f149541j = true;
            }
        }
        if (contentValues.containsKey("showHead")) {
            this.field_showHead = contentValues.getAsInteger("showHead").intValue();
            if (z) {
                this.f149542n = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f149543o = true;
            }
        }
        if (contentValues.containsKey("uiType")) {
            this.field_uiType = contentValues.getAsLong("uiType").longValue();
            if (z) {
                this.f149544p = true;
            }
        }
        if (contentValues.containsKey("weiboFlag")) {
            this.field_weiboFlag = contentValues.getAsInteger("weiboFlag").intValue();
            if (z) {
                this.f149546q = true;
            }
        }
        if (contentValues.containsKey("weiboNickname")) {
            this.field_weiboNickname = contentValues.getAsString("weiboNickname");
            if (z) {
                this.f149547r = true;
            }
        }
        if (contentValues.containsKey("conRemarkPYFull")) {
            this.field_conRemarkPYFull = contentValues.getAsString("conRemarkPYFull");
            if (z) {
                this.f149548s = true;
            }
        }
        if (contentValues.containsKey("conRemarkPYShort")) {
            this.field_conRemarkPYShort = contentValues.getAsString("conRemarkPYShort");
            if (z) {
                this.f149549t = true;
            }
        }
        if (contentValues.containsKey("lvbuff")) {
            this.field_lvbuff = contentValues.getAsByteArray("lvbuff");
            if (z) {
                this.f149550u = true;
            }
        }
        if (contentValues.containsKey("verifyFlag")) {
            this.field_verifyFlag = contentValues.getAsInteger("verifyFlag").intValue();
            if (z) {
                this.f149551v = true;
            }
        }
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z) {
                this.f149552w = true;
            }
        }
        if (contentValues.containsKey("chatroomFlag")) {
            this.field_chatroomFlag = contentValues.getAsInteger("chatroomFlag").intValue();
            if (z) {
                this.f149553x = true;
            }
        }
        if (contentValues.containsKey("deleteFlag")) {
            this.field_deleteFlag = contentValues.getAsInteger("deleteFlag").intValue();
            if (z) {
                this.f149555y = true;
            }
        }
        if (contentValues.containsKey("contactLabelIds")) {
            this.field_contactLabelIds = contentValues.getAsString("contactLabelIds");
            if (z) {
                this.f149557z = true;
            }
        }
        if (contentValues.containsKey("descWordingId")) {
            this.field_descWordingId = contentValues.getAsString("descWordingId");
            if (z) {
                this.f149493A = true;
            }
        }
        if (contentValues.containsKey("openImAppid")) {
            this.field_openImAppid = contentValues.getAsString("openImAppid");
            if (z) {
                this.f149494B = true;
            }
        }
        if (contentValues.containsKey("sourceExtInfo")) {
            this.field_sourceExtInfo = contentValues.getAsString("sourceExtInfo");
            if (z) {
                this.f149495C = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f149496D = true;
            }
        }
        if (contentValues.containsKey("usernameFlag")) {
            this.field_usernameFlag = contentValues.getAsLong("usernameFlag").longValue();
            if (z) {
                this.f149497E = true;
            }
        }
        if (contentValues.containsKey("contactExtra")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("contactExtra");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_contactExtra = (C49072d00) new C49072d00().parseFrom(asByteArray);
                    if (z) {
                        this.f149498F = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseContact", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
