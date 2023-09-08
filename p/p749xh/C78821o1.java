package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import i40.C46166d;
import if0.C46238a;
import java.lang.reflect.Field;
import junit.framework.Assert;

/* renamed from: xh.o1 */
public class C78821o1 extends IAutoDBItem {

    /* renamed from: K */
    public static final SingleTable f231207K;

    /* renamed from: L */
    public static final Column f231208L;

    /* renamed from: M */
    public static final Column f231209M;

    /* renamed from: N */
    public static final Column f231210N;

    /* renamed from: P */
    public static final Column f231211P;

    /* renamed from: Q */
    public static final Column f231212Q;

    /* renamed from: Q0 */
    public static final int f231213Q0 = 3145580;

    /* renamed from: R */
    public static final String[] f231214R = new String[0];

    /* renamed from: R0 */
    public static final int f231215R0 = -1331913276;

    /* renamed from: S */
    public static final int f231216S = -1309392370;

    /* renamed from: S0 */
    public static final int f231217S0 = -1309115473;

    /* renamed from: T */
    public static final int f231218T = -265713450;

    /* renamed from: T0 */
    public static final int f231219T0 = 130632498;

    /* renamed from: U */
    public static final int f231220U = 932971136;

    /* renamed from: U0 */
    public static final int f231221U0 = 2070314889;

    /* renamed from: V */
    public static final int f231222V = 1438146811;

    /* renamed from: V0 */
    public static final int f231223V0 = 554531037;

    /* renamed from: W */
    public static final int f231224W = -892481550;

    /* renamed from: W0 */
    public static final int f231225W0 = -1731317047;

    /* renamed from: X */
    public static final int f231226X = -1180128302;

    /* renamed from: X0 */
    public static final int f231227X0 = -720175972;

    /* renamed from: Y */
    public static final int f231228Y = -114447888;

    /* renamed from: Y0 */
    public static final int f231229Y0 = 918391306;

    /* renamed from: Z */
    public static final int f231230Z = 951530617;

    /* renamed from: Z0 */
    public static final int f231231Z0 = 537528167;

    /* renamed from: a1 */
    public static final int f231232a1 = -47078935;

    /* renamed from: b1 */
    public static final int f231233b1 = -1435150269;

    /* renamed from: c1 */
    public static final int f231234c1 = -807469096;

    /* renamed from: d1 */
    public static final int f231235d1 = 1971866435;

    /* renamed from: e1 */
    public static final int f231236e1 = -270989544;

    /* renamed from: f1 */
    public static final int f231237f1 = 696947200;

    /* renamed from: g1 */
    public static final int f231238g1 = -1791064022;

    /* renamed from: h1 */
    public static final int f231239h1 = -1510771841;

    /* renamed from: i1 */
    public static final int f231240i1 = 170025296;

    /* renamed from: j1 */
    public static final int f231241j1 = 108705909;

    /* renamed from: k1 */
    public static final IAutoDBItem.MAutoDBInfo f231242k1 = initAutoDBInfo(C78821o1.class);

    /* renamed from: l1 */
    public static final StorageObserverOwner<C78821o1> f231243l1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f231244p0 = 1343750747;

    /* renamed from: x0 */
    public static final int f231245x0 = 240055834;

    /* renamed from: y0 */
    public static final int f231246y0 = -338830379;

    /* renamed from: A */
    public boolean f231247A = false;

    /* renamed from: B */
    public boolean f231248B = false;

    /* renamed from: C */
    public boolean f231249C = false;

    /* renamed from: D */
    public boolean f231250D = false;

    /* renamed from: E */
    public boolean f231251E = false;

    /* renamed from: F */
    public boolean f231252F = false;

    /* renamed from: G */
    public boolean f231253G = false;

    /* renamed from: H */
    public boolean f231254H = false;

    /* renamed from: I */
    public boolean f231255I = false;

    /* renamed from: J */
    public boolean f231256J = false;

    /* renamed from: d */
    public boolean f231257d = false;

    /* renamed from: e */
    public boolean f231258e = false;

    /* renamed from: f */
    public boolean f231259f = false;
    private int field_UnDeliverCount;
    private int field_UnReadInvite;
    private int field_atCount;
    private int field_attrflag;
    private int field_chatmode;
    private String field_content;
    private long field_conversationTime;
    private String field_customNotify;
    private String field_digest;
    private String field_digestUser;
    private String field_editingMsg;
    private long field_editingQuoteMsgId;
    private long field_firstUnDeliverSeq;
    private long field_flag;
    private int field_hasSpecialFollow;
    private int field_hasTodo;
    private int field_hasTrunc;
    private int field_hbMarkRed;
    private int field_isSend;
    private long field_lastSeq;
    private int field_msgCount;
    private String field_msgType;
    private String field_parentRef;
    private int field_remitMarkRed;
    private int field_showTips;
    private long field_sightTime;
    private int field_status;
    private int field_unReadCount;
    private int field_unReadMuteCount;
    private String field_username;

    /* renamed from: g */
    public boolean f231260g = false;

    /* renamed from: h */
    public boolean f231261h = false;

    /* renamed from: i */
    public boolean f231262i = false;

    /* renamed from: j */
    public boolean f231263j = false;

    /* renamed from: n */
    public boolean f231264n = false;

    /* renamed from: o */
    public boolean f231265o = false;

    /* renamed from: p */
    public boolean f231266p = false;

    /* renamed from: q */
    public boolean f231267q = false;

    /* renamed from: r */
    public boolean f231268r = false;

    /* renamed from: s */
    public boolean f231269s = false;

    /* renamed from: t */
    public boolean f231270t = false;

    /* renamed from: u */
    public boolean f231271u = false;

    /* renamed from: v */
    public boolean f231272v = false;

    /* renamed from: w */
    public boolean f231273w = false;

    /* renamed from: x */
    public boolean f231274x = false;

    /* renamed from: y */
    public boolean f231275y = false;

    /* renamed from: z */
    public boolean f231276z = false;

    static {
        SingleTable singleTable = new SingleTable("rconversation");
        f231207K = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgCount", "int", singleTable.getName(), "");
        f231208L = new Column("username", "string", singleTable.getName(), "");
        new Column("unReadCount", "int", singleTable.getName(), "");
        new Column("chatmode", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        f231209M = new Column("conversationTime", "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("msgType", "string", singleTable.getName(), "");
        new Column("customNotify", "string", singleTable.getName(), "");
        new Column("showTips", "int", singleTable.getName(), "");
        f231210N = new Column("flag", "long", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
        new Column("digestUser", "string", singleTable.getName(), "");
        new Column("hasTrunc", "int", singleTable.getName(), "");
        f231211P = new Column("parentRef", "string", singleTable.getName(), "");
        f231212Q = new Column("attrflag", "int", singleTable.getName(), "");
        new Column("editingMsg", "string", singleTable.getName(), "");
        new Column("atCount", "int", singleTable.getName(), "");
        new Column("sightTime", "long", singleTable.getName(), "");
        new Column("unReadMuteCount", "int", singleTable.getName(), "");
        new Column("lastSeq", "long", singleTable.getName(), "");
        new Column("UnDeliverCount", "int", singleTable.getName(), "");
        new Column("UnReadInvite", "int", singleTable.getName(), "");
        new Column("firstUnDeliverSeq", "long", singleTable.getName(), "");
        new Column("editingQuoteMsgId", "long", singleTable.getName(), "");
        new Column("hasTodo", "int", singleTable.getName(), "");
        new Column("hbMarkRed", "int", singleTable.getName(), "");
        new Column("remitMarkRed", "int", singleTable.getName(), "");
        new Column("hasSpecialFollow", "int", singleTable.getName(), "");
        new C46166d();
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[30];
        String[] strArr = new String[31];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgCount";
        mAutoDBInfo.colsMap.put("msgCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[2] = "unReadCount";
        mAutoDBInfo.colsMap.put("unReadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "chatmode";
        mAutoDBInfo.colsMap.put("chatmode", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "conversationTime";
        mAutoDBInfo.colsMap.put("conversationTime", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "customNotify";
        mAutoDBInfo.colsMap.put("customNotify", "TEXT default '' ");
        mAutoDBInfo.columns[10] = "showTips";
        mAutoDBInfo.colsMap.put("showTips", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "flag";
        mAutoDBInfo.colsMap.put("flag", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "digest";
        mAutoDBInfo.colsMap.put("digest", "TEXT default '' ");
        mAutoDBInfo.columns[13] = "digestUser";
        mAutoDBInfo.colsMap.put("digestUser", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "hasTrunc";
        mAutoDBInfo.colsMap.put("hasTrunc", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "parentRef";
        mAutoDBInfo.colsMap.put("parentRef", "TEXT");
        mAutoDBInfo.columns[16] = "attrflag";
        mAutoDBInfo.colsMap.put("attrflag", "INTEGER default '0' ");
        mAutoDBInfo.columns[17] = "editingMsg";
        mAutoDBInfo.colsMap.put("editingMsg", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "atCount";
        mAutoDBInfo.colsMap.put("atCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "sightTime";
        mAutoDBInfo.colsMap.put("sightTime", "LONG default '0' ");
        mAutoDBInfo.columns[20] = "unReadMuteCount";
        mAutoDBInfo.colsMap.put("unReadMuteCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "lastSeq";
        mAutoDBInfo.colsMap.put("lastSeq", "LONG");
        mAutoDBInfo.columns[22] = "UnDeliverCount";
        mAutoDBInfo.colsMap.put("UnDeliverCount", "INTEGER");
        mAutoDBInfo.columns[23] = "UnReadInvite";
        mAutoDBInfo.colsMap.put("UnReadInvite", "INTEGER");
        mAutoDBInfo.columns[24] = "firstUnDeliverSeq";
        mAutoDBInfo.colsMap.put("firstUnDeliverSeq", "LONG");
        mAutoDBInfo.columns[25] = "editingQuoteMsgId";
        mAutoDBInfo.colsMap.put("editingQuoteMsgId", "LONG default '0' ");
        mAutoDBInfo.columns[26] = "hasTodo";
        mAutoDBInfo.colsMap.put("hasTodo", "INTEGER default '0' ");
        mAutoDBInfo.columns[27] = "hbMarkRed";
        mAutoDBInfo.colsMap.put("hbMarkRed", "INTEGER default '0' ");
        mAutoDBInfo.columns[28] = "remitMarkRed";
        mAutoDBInfo.colsMap.put("remitMarkRed", "INTEGER default '0' ");
        mAutoDBInfo.columns[29] = "hasSpecialFollow";
        mAutoDBInfo.colsMap.put("hasSpecialFollow", "INTEGER default '0' ");
        mAutoDBInfo.columns[30] = "rowid";
        mAutoDBInfo.sql = " msgCount INTEGER default '0' ,  username TEXT default ''  PRIMARY KEY ,  unReadCount INTEGER default '0' ,  chatmode INTEGER default '0' ,  status INTEGER default '0' ,  isSend INTEGER default '0' ,  conversationTime LONG default '0' ,  content TEXT default '' ,  msgType TEXT default '' ,  customNotify TEXT default '' ,  showTips INTEGER default '0' ,  flag LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  hasTrunc INTEGER default '0' ,  parentRef TEXT,  attrflag INTEGER default '0' ,  editingMsg TEXT default '' ,  atCount INTEGER default '0' ,  sightTime LONG default '0' ,  unReadMuteCount INTEGER default '0' ,  lastSeq LONG,  UnDeliverCount INTEGER,  UnReadInvite INTEGER,  firstUnDeliverSeq LONG,  editingQuoteMsgId LONG default '0' ,  hasTodo INTEGER default '0' ,  hbMarkRed INTEGER default '0' ,  remitMarkRed INTEGER default '0' ,  hasSpecialFollow INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: A2 */
    public int mo108780A2() {
        return this.field_msgCount;
    }

    /* renamed from: B2 */
    public String mo108781B2() {
        return this.field_msgType;
    }

    /* renamed from: C2 */
    public String mo108782C2() {
        return this.field_parentRef;
    }

    /* renamed from: D2 */
    public int mo108783D2() {
        return this.field_remitMarkRed;
    }

    /* renamed from: E2 */
    public int mo108784E2() {
        return this.field_showTips;
    }

    /* renamed from: F2 */
    public int mo108785F2() {
        return this.field_UnDeliverCount;
    }

    /* renamed from: G2 */
    public int mo108786G2() {
        return this.field_unReadCount;
    }

    /* renamed from: H2 */
    public int mo108787H2() {
        return this.field_UnReadInvite;
    }

    /* renamed from: I2 */
    public int mo108788I2() {
        return this.field_unReadMuteCount;
    }

    /* renamed from: J2 */
    public void mo108789J2(int i) {
        this.field_atCount = i;
        this.f231275y = true;
    }

    /* renamed from: K2 */
    public void mo108790K2(int i) {
        this.field_attrflag = i;
        this.f231273w = true;
    }

    /* renamed from: L2 */
    public void mo108791L2(int i) {
        this.field_chatmode = i;
        this.f231260g = true;
    }

    /* renamed from: M2 */
    public void mo108792M2(String str) {
        this.field_content = str;
        this.f231264n = true;
    }

    /* renamed from: N2 */
    public void mo108793N2(long j) {
        this.field_conversationTime = j;
        this.f231263j = true;
    }

    /* renamed from: O2 */
    public void mo108794O2(String str) {
        this.field_digest = str;
        this.f231269s = true;
    }

    /* renamed from: P2 */
    public void mo108795P2(String str) {
        this.field_digestUser = str;
        this.f231270t = true;
    }

    /* renamed from: Q2 */
    public void mo108796Q2(String str) {
        this.field_editingMsg = str;
        this.f231274x = true;
    }

    /* renamed from: R2 */
    public void mo108797R2(long j) {
        this.field_editingQuoteMsgId = j;
        this.f231252F = true;
    }

    /* renamed from: S2 */
    public void mo108798S2(long j) {
        this.field_firstUnDeliverSeq = j;
        this.f231251E = true;
    }

    /* renamed from: T2 */
    public void mo101161T2(long j) {
        this.field_flag = j;
        this.f231268r = true;
    }

    /* renamed from: U2 */
    public void mo108799U2(int i) {
        this.field_hasSpecialFollow = i;
        this.f231256J = true;
    }

    /* renamed from: V2 */
    public void mo108800V2(int i) {
        this.field_hasTodo = i;
        this.f231253G = true;
    }

    /* renamed from: W2 */
    public void mo108801W2(int i) {
        this.field_hasTrunc = i;
        this.f231271u = true;
    }

    /* renamed from: X2 */
    public void mo108802X2(int i) {
        this.field_hbMarkRed = i;
        this.f231254H = true;
    }

    /* renamed from: Y2 */
    public void mo108803Y2(int i) {
        this.field_isSend = i;
        this.f231262i = true;
    }

    /* renamed from: Z2 */
    public void mo108804Z2(long j) {
        this.field_lastSeq = j;
        this.f231248B = true;
    }

    /* renamed from: a3 */
    public void mo108805a3(int i) {
        this.field_msgCount = i;
        this.f231257d = true;
    }

    /* renamed from: b3 */
    public void mo108806b3(String str) {
        this.field_msgType = str;
        this.f231265o = true;
    }

    /* renamed from: c3 */
    public void mo108807c3(String str) {
        this.field_parentRef = str;
        this.f231272v = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78821o1)) {
            return false;
        }
        C78821o1 o1Var = (C78821o1) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_msgCount), Integer.valueOf(o1Var.field_msgCount)) && C46238a.m51546a(this.field_username, o1Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_unReadCount), Integer.valueOf(o1Var.field_unReadCount)) && C46238a.m51546a(Integer.valueOf(this.field_chatmode), Integer.valueOf(o1Var.field_chatmode)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(o1Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(o1Var.field_isSend)) && C46238a.m51546a(Long.valueOf(this.field_conversationTime), Long.valueOf(o1Var.field_conversationTime)) && C46238a.m51546a(this.field_content, o1Var.field_content) && C46238a.m51546a(this.field_msgType, o1Var.field_msgType) && C46238a.m51546a(this.field_customNotify, o1Var.field_customNotify) && C46238a.m51546a(Integer.valueOf(this.field_showTips), Integer.valueOf(o1Var.field_showTips)) && C46238a.m51546a(Long.valueOf(this.field_flag), Long.valueOf(o1Var.field_flag)) && C46238a.m51546a(this.field_digest, o1Var.field_digest) && C46238a.m51546a(this.field_digestUser, o1Var.field_digestUser) && C46238a.m51546a(Integer.valueOf(this.field_hasTrunc), Integer.valueOf(o1Var.field_hasTrunc)) && C46238a.m51546a(this.field_parentRef, o1Var.field_parentRef) && C46238a.m51546a(Integer.valueOf(this.field_attrflag), Integer.valueOf(o1Var.field_attrflag)) && C46238a.m51546a(this.field_editingMsg, o1Var.field_editingMsg) && C46238a.m51546a(Integer.valueOf(this.field_atCount), Integer.valueOf(o1Var.field_atCount)) && C46238a.m51546a(Long.valueOf(this.field_sightTime), Long.valueOf(o1Var.field_sightTime)) && C46238a.m51546a(Integer.valueOf(this.field_unReadMuteCount), Integer.valueOf(o1Var.field_unReadMuteCount)) && C46238a.m51546a(Long.valueOf(this.field_lastSeq), Long.valueOf(o1Var.field_lastSeq)) && C46238a.m51546a(Integer.valueOf(this.field_UnDeliverCount), Integer.valueOf(o1Var.field_UnDeliverCount)) && C46238a.m51546a(Integer.valueOf(this.field_UnReadInvite), Integer.valueOf(o1Var.field_UnReadInvite)) && C46238a.m51546a(Long.valueOf(this.field_firstUnDeliverSeq), Long.valueOf(o1Var.field_firstUnDeliverSeq)) && C46238a.m51546a(Long.valueOf(this.field_editingQuoteMsgId), Long.valueOf(o1Var.field_editingQuoteMsgId)) && C46238a.m51546a(Integer.valueOf(this.field_hasTodo), Integer.valueOf(o1Var.field_hasTodo)) && C46238a.m51546a(Integer.valueOf(this.field_hbMarkRed), Integer.valueOf(o1Var.field_hbMarkRed)) && C46238a.m51546a(Integer.valueOf(this.field_remitMarkRed), Integer.valueOf(o1Var.field_remitMarkRed)) && C46238a.m51546a(Integer.valueOf(this.field_hasSpecialFollow), Integer.valueOf(o1Var.field_hasSpecialFollow));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231216S == hashCode) {
                    try {
                        this.field_msgCount = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231218T == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f231258e = true;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231220U == hashCode) {
                    try {
                        this.field_unReadCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231222V == hashCode) {
                    try {
                        this.field_chatmode = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231224W == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231226X == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231228Y == hashCode) {
                    try {
                        this.field_conversationTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231230Z == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231244p0 == hashCode) {
                    try {
                        this.field_msgType = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231245x0 == hashCode) {
                    try {
                        this.field_customNotify = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231246y0 == hashCode) {
                    try {
                        this.field_showTips = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231213Q0 == hashCode) {
                    try {
                        this.field_flag = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231215R0 == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231217S0 == hashCode) {
                    try {
                        this.field_digestUser = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231219T0 == hashCode) {
                    try {
                        this.field_hasTrunc = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231221U0 == hashCode) {
                    try {
                        this.field_parentRef = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231223V0 == hashCode) {
                    try {
                        this.field_attrflag = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231225W0 == hashCode) {
                    try {
                        this.field_editingMsg = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231227X0 == hashCode) {
                    try {
                        this.field_atCount = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231229Y0 == hashCode) {
                    try {
                        this.field_sightTime = cursor.getLong(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231231Z0 == hashCode) {
                    try {
                        this.field_unReadMuteCount = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231232a1 == hashCode) {
                    try {
                        this.field_lastSeq = cursor.getLong(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231233b1 == hashCode) {
                    try {
                        this.field_UnDeliverCount = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231234c1 == hashCode) {
                    try {
                        this.field_UnReadInvite = cursor.getInt(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231235d1 == hashCode) {
                    try {
                        this.field_firstUnDeliverSeq = cursor.getLong(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231236e1 == hashCode) {
                    try {
                        this.field_editingQuoteMsgId = cursor.getLong(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231237f1 == hashCode) {
                    try {
                        this.field_hasTodo = cursor.getInt(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231238g1 == hashCode) {
                    try {
                        this.field_hbMarkRed = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231239h1 == hashCode) {
                    try {
                        this.field_remitMarkRed = cursor.getInt(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231240i1 == hashCode) {
                    try {
                        this.field_hasSpecialFollow = cursor.getInt(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseConversation", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231241j1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231257d) {
            contentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f231258e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f231259f) {
            contentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
        }
        if (this.f231260g) {
            contentValues.put("chatmode", Integer.valueOf(this.field_chatmode));
        }
        if (this.f231261h) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f231262i) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f231263j) {
            contentValues.put("conversationTime", Long.valueOf(this.field_conversationTime));
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f231264n) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_msgType == null) {
            this.field_msgType = "";
        }
        if (this.f231265o) {
            contentValues.put("msgType", this.field_msgType);
        }
        if (this.field_customNotify == null) {
            this.field_customNotify = "";
        }
        if (this.f231266p) {
            contentValues.put("customNotify", this.field_customNotify);
        }
        if (this.f231267q) {
            contentValues.put("showTips", Integer.valueOf(this.field_showTips));
        }
        if (this.f231268r) {
            contentValues.put("flag", Long.valueOf(this.field_flag));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f231269s) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f231270t) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.f231271u) {
            contentValues.put("hasTrunc", Integer.valueOf(this.field_hasTrunc));
        }
        if (this.f231272v) {
            contentValues.put("parentRef", this.field_parentRef);
        }
        if (this.f231273w) {
            contentValues.put("attrflag", Integer.valueOf(this.field_attrflag));
        }
        if (this.field_editingMsg == null) {
            this.field_editingMsg = "";
        }
        if (this.f231274x) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f231275y) {
            contentValues.put("atCount", Integer.valueOf(this.field_atCount));
        }
        if (this.f231276z) {
            contentValues.put("sightTime", Long.valueOf(this.field_sightTime));
        }
        if (this.f231247A) {
            contentValues.put("unReadMuteCount", Integer.valueOf(this.field_unReadMuteCount));
        }
        if (this.f231248B) {
            contentValues.put("lastSeq", Long.valueOf(this.field_lastSeq));
        }
        if (this.f231249C) {
            contentValues.put("UnDeliverCount", Integer.valueOf(this.field_UnDeliverCount));
        }
        if (this.f231250D) {
            contentValues.put("UnReadInvite", Integer.valueOf(this.field_UnReadInvite));
        }
        if (this.f231251E) {
            contentValues.put("firstUnDeliverSeq", Long.valueOf(this.field_firstUnDeliverSeq));
        }
        if (this.f231252F) {
            contentValues.put("editingQuoteMsgId", Long.valueOf(this.field_editingQuoteMsgId));
        }
        if (this.f231253G) {
            contentValues.put("hasTodo", Integer.valueOf(this.field_hasTodo));
        }
        if (this.f231254H) {
            contentValues.put("hbMarkRed", Integer.valueOf(this.field_hbMarkRed));
        }
        if (this.f231255I) {
            contentValues.put("remitMarkRed", Integer.valueOf(this.field_remitMarkRed));
        }
        if (this.f231256J) {
            contentValues.put("hasSpecialFollow", Integer.valueOf(this.field_hasSpecialFollow));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    /* renamed from: d */
    public void mo108808d(int i) {
        this.field_status = i;
        this.f231261h = true;
    }

    /* renamed from: d3 */
    public void mo108809d3(int i) {
        this.field_remitMarkRed = i;
        this.f231255I = true;
    }

    /* renamed from: e3 */
    public void mo108810e3(long j) {
        this.field_sightTime = j;
        this.f231276z = true;
    }

    /* renamed from: f3 */
    public void mo108811f3(int i) {
        this.field_UnDeliverCount = i;
        this.f231249C = true;
    }

    /* renamed from: g3 */
    public void mo108812g3(int i) {
        this.field_unReadCount = i;
        this.f231259f = true;
    }

    public String getContent() {
        return this.field_content;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231242k1;
    }

    public String[] getIndexCreateSQL() {
        return f231214R;
    }

    public StorageObserverOwner<C78821o1> getObserverOwner() {
        return f231243l1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public int getStatus() {
        return this.field_status;
    }

    public SingleTable getTable() {
        return f231207K;
    }

    public String getTableName() {
        return f231207K.getName();
    }

    public String getUsername() {
        return this.field_username;
    }

    /* renamed from: h3 */
    public void mo108816h3(int i) {
        this.field_UnReadInvite = i;
        this.f231250D = true;
    }

    /* renamed from: i3 */
    public void mo108817i3(int i) {
        this.field_unReadMuteCount = i;
        this.f231247A = true;
    }

    /* renamed from: l2 */
    public int mo108818l2() {
        return this.field_atCount;
    }

    /* renamed from: m2 */
    public int mo108819m2() {
        return this.field_attrflag;
    }

    /* renamed from: n2 */
    public int mo108820n2() {
        return this.field_chatmode;
    }

    /* renamed from: o2 */
    public long mo108821o2() {
        return this.field_conversationTime;
    }

    /* renamed from: p2 */
    public String mo108822p2() {
        return this.field_digest;
    }

    /* renamed from: q2 */
    public String mo108823q2() {
        return this.field_digestUser;
    }

    /* renamed from: r2 */
    public String mo108824r2() {
        return this.field_editingMsg;
    }

    /* renamed from: s2 */
    public long mo108825s2() {
        return this.field_editingQuoteMsgId;
    }

    public void setUsername(String str) {
        this.field_username = str;
        this.f231258e = true;
    }

    /* renamed from: t2 */
    public long mo108827t2() {
        return this.field_firstUnDeliverSeq;
    }

    /* renamed from: u2 */
    public long mo108828u2() {
        return this.field_flag;
    }

    /* renamed from: v2 */
    public int mo108829v2() {
        return this.field_hasSpecialFollow;
    }

    /* renamed from: w2 */
    public int mo108830w2() {
        return this.field_hasTodo;
    }

    /* renamed from: x2 */
    public int mo108831x2() {
        return this.field_hbMarkRed;
    }

    /* renamed from: y2 */
    public int mo108832y2() {
        return this.field_isSend;
    }

    /* renamed from: z2 */
    public long mo108833z2() {
        return this.field_lastSeq;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgCount")) {
            this.field_msgCount = contentValues.getAsInteger("msgCount").intValue();
            if (z) {
                this.f231257d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f231258e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z) {
                this.f231259f = true;
            }
        }
        if (contentValues.containsKey("chatmode")) {
            this.field_chatmode = contentValues.getAsInteger("chatmode").intValue();
            if (z) {
                this.f231260g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f231261h = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f231262i = true;
            }
        }
        if (contentValues.containsKey("conversationTime")) {
            this.field_conversationTime = contentValues.getAsLong("conversationTime").longValue();
            if (z) {
                this.f231263j = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f231264n = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsString("msgType");
            if (z) {
                this.f231265o = true;
            }
        }
        if (contentValues.containsKey("customNotify")) {
            this.field_customNotify = contentValues.getAsString("customNotify");
            if (z) {
                this.f231266p = true;
            }
        }
        if (contentValues.containsKey("showTips")) {
            this.field_showTips = contentValues.getAsInteger("showTips").intValue();
            if (z) {
                this.f231267q = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z) {
                this.f231268r = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f231269s = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z) {
                this.f231270t = true;
            }
        }
        if (contentValues.containsKey("hasTrunc")) {
            this.field_hasTrunc = contentValues.getAsInteger("hasTrunc").intValue();
            if (z) {
                this.f231271u = true;
            }
        }
        if (contentValues.containsKey("parentRef")) {
            this.field_parentRef = contentValues.getAsString("parentRef");
            if (z) {
                this.f231272v = true;
            }
        }
        if (contentValues.containsKey("attrflag")) {
            this.field_attrflag = contentValues.getAsInteger("attrflag").intValue();
            if (z) {
                this.f231273w = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z) {
                this.f231274x = true;
            }
        }
        if (contentValues.containsKey("atCount")) {
            this.field_atCount = contentValues.getAsInteger("atCount").intValue();
            if (z) {
                this.f231275y = true;
            }
        }
        if (contentValues.containsKey("sightTime")) {
            this.field_sightTime = contentValues.getAsLong("sightTime").longValue();
            if (z) {
                this.f231276z = true;
            }
        }
        if (contentValues.containsKey("unReadMuteCount")) {
            this.field_unReadMuteCount = contentValues.getAsInteger("unReadMuteCount").intValue();
            if (z) {
                this.f231247A = true;
            }
        }
        if (contentValues.containsKey("lastSeq")) {
            this.field_lastSeq = contentValues.getAsLong("lastSeq").longValue();
            if (z) {
                this.f231248B = true;
            }
        }
        if (contentValues.containsKey("UnDeliverCount")) {
            this.field_UnDeliverCount = contentValues.getAsInteger("UnDeliverCount").intValue();
            if (z) {
                this.f231249C = true;
            }
        }
        if (contentValues.containsKey("UnReadInvite")) {
            this.field_UnReadInvite = contentValues.getAsInteger("UnReadInvite").intValue();
            if (z) {
                this.f231250D = true;
            }
        }
        if (contentValues.containsKey("firstUnDeliverSeq")) {
            this.field_firstUnDeliverSeq = contentValues.getAsLong("firstUnDeliverSeq").longValue();
            if (z) {
                this.f231251E = true;
            }
        }
        if (contentValues.containsKey("editingQuoteMsgId")) {
            this.field_editingQuoteMsgId = contentValues.getAsLong("editingQuoteMsgId").longValue();
            if (z) {
                this.f231252F = true;
            }
        }
        if (contentValues.containsKey("hasTodo")) {
            this.field_hasTodo = contentValues.getAsInteger("hasTodo").intValue();
            if (z) {
                this.f231253G = true;
            }
        }
        if (contentValues.containsKey("hbMarkRed")) {
            this.field_hbMarkRed = contentValues.getAsInteger("hbMarkRed").intValue();
            if (z) {
                this.f231254H = true;
            }
        }
        if (contentValues.containsKey("remitMarkRed")) {
            this.field_remitMarkRed = contentValues.getAsInteger("remitMarkRed").intValue();
            if (z) {
                this.f231255I = true;
            }
        }
        if (contentValues.containsKey("hasSpecialFollow")) {
            this.field_hasSpecialFollow = contentValues.getAsInteger("hasSpecialFollow").intValue();
            if (z) {
                this.f231256J = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
