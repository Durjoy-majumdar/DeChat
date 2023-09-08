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
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.i9 */
public class C112150i9 extends IAutoDBItem {

    /* renamed from: A */
    public static final Column f335777A;

    /* renamed from: B */
    public static final Column f335778B;

    /* renamed from: C */
    public static final Column f335779C;

    /* renamed from: D */
    public static final Column f335780D;

    /* renamed from: E */
    public static final String[] f335781E = {"CREATE INDEX IF NOT EXISTS roomid ON BubbleInfo(roomid)", "CREATE INDEX IF NOT EXISTS inviteid ON BubbleInfo(inviteid)", "CREATE INDEX IF NOT EXISTS msgIdIdx ON BubbleInfo(msgid)"};

    /* renamed from: F */
    public static final int f335782F = 3355;

    /* renamed from: G */
    public static final int f335783G = -925318346;

    /* renamed from: H */
    public static final int f335784H = 1379904420;

    /* renamed from: I */
    public static final int f335785I = 631414244;

    /* renamed from: J */
    public static final int f335786J = -1067378658;

    /* renamed from: K */
    public static final int f335787K = 53929135;

    /* renamed from: L */
    public static final int f335788L = -2127306620;

    /* renamed from: M */
    public static final int f335789M = -135761730;

    /* renamed from: N */
    public static final int f335790N = 104192092;

    /* renamed from: P */
    public static final int f335791P = 1269913645;

    /* renamed from: Q */
    public static final int f335792Q = -1056625598;

    /* renamed from: R */
    public static final int f335793R = 1407382541;

    /* renamed from: S */
    public static final int f335794S = 39301133;

    /* renamed from: T */
    public static final int f335795T = -970469075;

    /* renamed from: U */
    public static final int f335796U = 939923777;

    /* renamed from: V */
    public static final int f335797V = 1343750747;

    /* renamed from: W */
    public static final int f335798W = 422014826;

    /* renamed from: X */
    public static final int f335799X = -649312567;

    /* renamed from: Y */
    public static final int f335800Y = 108705909;

    /* renamed from: Z */
    public static final IAutoDBItem.MAutoDBInfo f335801Z = initAutoDBInfo(C112150i9.class);

    /* renamed from: p0 */
    public static final StorageObserverOwner<C112150i9> f335802p0 = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f335803y;

    /* renamed from: z */
    public static final Column f335804z;

    /* renamed from: d */
    public boolean f335805d = false;

    /* renamed from: e */
    public boolean f335806e = false;

    /* renamed from: f */
    public boolean f335807f = false;
    private int field_abort_backend_informed;
    private long field_aliveTimestamp;
    private long field_bubbleMsgTimestamp;
    private long field_connectedTimestamp;
    private long field_id;
    private String field_identity;
    private long field_inviteTimestamp;
    private long field_inviteid;
    private int field_mainRecord;
    private int field_msgType;
    private long field_msgid;
    private int field_outCall;
    private long field_recallTipsTimestamp;
    private int field_room_state;
    private int field_room_type;
    private long field_roomid;
    private long field_roomkey;
    private String field_talkerName;

    /* renamed from: g */
    public boolean f335808g = false;

    /* renamed from: h */
    public boolean f335809h = false;

    /* renamed from: i */
    public boolean f335810i = false;

    /* renamed from: j */
    public boolean f335811j = false;

    /* renamed from: n */
    public boolean f335812n = false;

    /* renamed from: o */
    public boolean f335813o = false;

    /* renamed from: p */
    public boolean f335814p = false;

    /* renamed from: q */
    public boolean f335815q = false;

    /* renamed from: r */
    public boolean f335816r = false;

    /* renamed from: s */
    public boolean f335817s = false;

    /* renamed from: t */
    public boolean f335818t = false;

    /* renamed from: u */
    public boolean f335819u = false;

    /* renamed from: v */
    public boolean f335820v = false;

    /* renamed from: w */
    public boolean f335821w = false;

    /* renamed from: x */
    public boolean f335822x = false;

    static {
        SingleTable singleTable = new SingleTable("BubbleInfo");
        f335803y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("id", "long", singleTable.getName(), "");
        f335804z = new Column("roomid", "long", singleTable.getName(), "");
        new Column("roomkey", "long", singleTable.getName(), "");
        f335777A = new Column("inviteid", "long", singleTable.getName(), "");
        new Column("room_type", "int", singleTable.getName(), "");
        new Column("out_call", "int", singleTable.getName(), "");
        new Column("talkerName", "string", singleTable.getName(), "");
        new Column("identity", "string", singleTable.getName(), "");
        new Column("msgid", "long", singleTable.getName(), "");
        f335778B = new Column("room_state", "int", singleTable.getName(), "");
        f335779C = new Column("abort_backend_informed", "int", singleTable.getName(), "");
        f335780D = new Column("inviteTimestamp", "long", singleTable.getName(), "");
        new Column("connectedTimestamp", "long", singleTable.getName(), "");
        new Column("recallTipsTimestamp", "long", singleTable.getName(), "");
        new Column("bubbleMsgTimestamp", "long", singleTable.getName(), "");
        new Column("msgType", "int", singleTable.getName(), "");
        new Column("mainRecord", "int", singleTable.getName(), "");
        new Column("aliveTimestamp", "long", singleTable.getName(), "");
    }

    /* renamed from: C2 */
    public static final SelectSql m152896C2(long j) {
        return f335803y.selectAll().where(f335777A.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseVoIPBubbleInfo").build();
    }

    /* renamed from: D2 */
    public static final SelectSql m152897D2(int i) {
        return f335803y.selectAll().where(f335778B.equal((Number) Integer.valueOf(i))).log("MicroMsg.SDK.BaseVoIPBubbleInfo").build();
    }

    /* renamed from: E2 */
    public static final SelectSql m152898E2(long j) {
        return f335803y.selectAll().where(f335804z.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseVoIPBubbleInfo").build();
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = "roomid";
        mAutoDBInfo.colsMap.put("roomid", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "roomkey";
        mAutoDBInfo.colsMap.put("roomkey", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "inviteid";
        mAutoDBInfo.colsMap.put("inviteid", "LONG default '0' ");
        mAutoDBInfo.columns[4] = "room_type";
        mAutoDBInfo.colsMap.put("room_type", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "out_call";
        mAutoDBInfo.colsMap.put("out_call", "INTEGER default 'false' ");
        mAutoDBInfo.columns[6] = "talkerName";
        mAutoDBInfo.colsMap.put("talkerName", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "identity";
        mAutoDBInfo.colsMap.put("identity", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "msgid";
        mAutoDBInfo.colsMap.put("msgid", "LONG default '0' ");
        mAutoDBInfo.columns[9] = "room_state";
        mAutoDBInfo.colsMap.put("room_state", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "abort_backend_informed";
        mAutoDBInfo.colsMap.put("abort_backend_informed", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "inviteTimestamp";
        mAutoDBInfo.colsMap.put("inviteTimestamp", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "connectedTimestamp";
        mAutoDBInfo.colsMap.put("connectedTimestamp", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "recallTipsTimestamp";
        mAutoDBInfo.colsMap.put("recallTipsTimestamp", "LONG default '0' ");
        mAutoDBInfo.columns[14] = "bubbleMsgTimestamp";
        mAutoDBInfo.colsMap.put("bubbleMsgTimestamp", "LONG default '0' ");
        mAutoDBInfo.columns[15] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "mainRecord";
        mAutoDBInfo.colsMap.put("mainRecord", "INTEGER default '0' ");
        mAutoDBInfo.columns[17] = "aliveTimestamp";
        mAutoDBInfo.colsMap.put("aliveTimestamp", "LONG default '0' ");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " id LONG PRIMARY KEY ,  roomid LONG default '0' ,  roomkey LONG default '0' ,  inviteid LONG default '0' ,  room_type INTEGER default '0' ,  out_call INTEGER default 'false' ,  talkerName TEXT default '' ,  identity TEXT default '' ,  msgid LONG default '0' ,  room_state INTEGER default '0' ,  abort_backend_informed INTEGER default '0' ,  inviteTimestamp LONG default '0' ,  connectedTimestamp LONG default '0' ,  recallTipsTimestamp LONG default '0' ,  bubbleMsgTimestamp LONG default '0' ,  msgType INTEGER default '0' ,  mainRecord INTEGER default '0' ,  aliveTimestamp LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: A2 */
    public long mo163927A2() {
        return this.field_roomkey;
    }

    /* renamed from: B2 */
    public String mo163928B2() {
        return this.field_talkerName;
    }

    /* renamed from: F2 */
    public void mo163929F2(int i) {
        this.field_abort_backend_informed = i;
        this.f335815q = true;
    }

    /* renamed from: G2 */
    public void mo163930G2(long j) {
        this.field_aliveTimestamp = j;
        this.f335822x = true;
    }

    /* renamed from: H2 */
    public void mo163931H2(long j) {
        this.field_bubbleMsgTimestamp = j;
        this.f335819u = true;
    }

    /* renamed from: I2 */
    public void mo163932I2(long j) {
        this.field_connectedTimestamp = j;
        this.f335817s = true;
    }

    /* renamed from: J2 */
    public void mo163933J2(long j) {
        this.field_id = j;
        this.f335805d = true;
    }

    /* renamed from: K2 */
    public void mo163934K2(String str) {
        this.field_identity = str;
        this.f335812n = true;
    }

    /* renamed from: L2 */
    public void mo163935L2(long j) {
        this.field_inviteTimestamp = j;
        this.f335816r = true;
    }

    /* renamed from: M2 */
    public void mo163936M2(long j) {
        this.field_inviteid = j;
        this.f335808g = true;
    }

    /* renamed from: N2 */
    public void mo163937N2(int i) {
        this.field_mainRecord = i;
        this.f335821w = true;
    }

    /* renamed from: O2 */
    public void mo163938O2(int i) {
        this.field_msgType = i;
        this.f335820v = true;
    }

    /* renamed from: P2 */
    public void mo163939P2(long j) {
        this.field_msgid = j;
        this.f335813o = true;
    }

    /* renamed from: Q2 */
    public void mo163940Q2(int i) {
        this.field_outCall = i;
        this.f335810i = true;
    }

    /* renamed from: R2 */
    public void mo163941R2(long j) {
        this.field_recallTipsTimestamp = j;
        this.f335818t = true;
    }

    /* renamed from: S2 */
    public void mo163942S2(int i) {
        this.field_room_state = i;
        this.f335814p = true;
    }

    /* renamed from: T2 */
    public void mo163943T2(int i) {
        this.field_room_type = i;
        this.f335809h = true;
    }

    /* renamed from: U2 */
    public void mo163944U2(long j) {
        this.field_roomid = j;
        this.f335806e = true;
    }

    /* renamed from: V2 */
    public void mo163945V2(long j) {
        this.field_roomkey = j;
        this.f335807f = true;
    }

    /* renamed from: W2 */
    public void mo163946W2(String str) {
        this.field_talkerName = str;
        this.f335811j = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C112150i9)) {
            return false;
        }
        C112150i9 i9Var = (C112150i9) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_id), Long.valueOf(i9Var.field_id)) && C46238a.m51546a(Long.valueOf(this.field_roomid), Long.valueOf(i9Var.field_roomid)) && C46238a.m51546a(Long.valueOf(this.field_roomkey), Long.valueOf(i9Var.field_roomkey)) && C46238a.m51546a(Long.valueOf(this.field_inviteid), Long.valueOf(i9Var.field_inviteid)) && C46238a.m51546a(Integer.valueOf(this.field_room_type), Integer.valueOf(i9Var.field_room_type)) && C46238a.m51546a(Integer.valueOf(this.field_outCall), Integer.valueOf(i9Var.field_outCall)) && C46238a.m51546a(this.field_talkerName, i9Var.field_talkerName) && C46238a.m51546a(this.field_identity, i9Var.field_identity) && C46238a.m51546a(Long.valueOf(this.field_msgid), Long.valueOf(i9Var.field_msgid)) && C46238a.m51546a(Integer.valueOf(this.field_room_state), Integer.valueOf(i9Var.field_room_state)) && C46238a.m51546a(Integer.valueOf(this.field_abort_backend_informed), Integer.valueOf(i9Var.field_abort_backend_informed)) && C46238a.m51546a(Long.valueOf(this.field_inviteTimestamp), Long.valueOf(i9Var.field_inviteTimestamp)) && C46238a.m51546a(Long.valueOf(this.field_connectedTimestamp), Long.valueOf(i9Var.field_connectedTimestamp)) && C46238a.m51546a(Long.valueOf(this.field_recallTipsTimestamp), Long.valueOf(i9Var.field_recallTipsTimestamp)) && C46238a.m51546a(Long.valueOf(this.field_bubbleMsgTimestamp), Long.valueOf(i9Var.field_bubbleMsgTimestamp)) && C46238a.m51546a(Integer.valueOf(this.field_msgType), Integer.valueOf(i9Var.field_msgType)) && C46238a.m51546a(Integer.valueOf(this.field_mainRecord), Integer.valueOf(i9Var.field_mainRecord)) && C46238a.m51546a(Long.valueOf(this.field_aliveTimestamp), Long.valueOf(i9Var.field_aliveTimestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f335782F == hashCode) {
                    try {
                        this.field_id = cursor.getLong(i);
                        this.f335805d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335783G == hashCode) {
                    try {
                        this.field_roomid = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335784H == hashCode) {
                    try {
                        this.field_roomkey = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335785I == hashCode) {
                    try {
                        this.field_inviteid = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335786J == hashCode) {
                    try {
                        this.field_room_type = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335787K == hashCode) {
                    try {
                        this.field_outCall = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335788L == hashCode) {
                    try {
                        this.field_talkerName = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335789M == hashCode) {
                    try {
                        this.field_identity = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335790N == hashCode) {
                    try {
                        this.field_msgid = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335791P == hashCode) {
                    try {
                        this.field_room_state = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335792Q == hashCode) {
                    try {
                        this.field_abort_backend_informed = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335793R == hashCode) {
                    try {
                        this.field_inviteTimestamp = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335794S == hashCode) {
                    try {
                        this.field_connectedTimestamp = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335795T == hashCode) {
                    try {
                        this.field_recallTipsTimestamp = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335796U == hashCode) {
                    try {
                        this.field_bubbleMsgTimestamp = cursor.getLong(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335797V == hashCode) {
                    try {
                        this.field_msgType = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335798W == hashCode) {
                    try {
                        this.field_mainRecord = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335799X == hashCode) {
                    try {
                        this.field_aliveTimestamp = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoIPBubbleInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f335800Y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f335805d) {
            contentValues.put("id", Long.valueOf(this.field_id));
        }
        if (this.f335806e) {
            contentValues.put("roomid", Long.valueOf(this.field_roomid));
        }
        if (this.f335807f) {
            contentValues.put("roomkey", Long.valueOf(this.field_roomkey));
        }
        if (this.f335808g) {
            contentValues.put("inviteid", Long.valueOf(this.field_inviteid));
        }
        if (this.f335809h) {
            contentValues.put("room_type", Integer.valueOf(this.field_room_type));
        }
        if (this.f335810i) {
            contentValues.put("out_call", Integer.valueOf(this.field_outCall));
        }
        if (this.field_talkerName == null) {
            this.field_talkerName = "";
        }
        if (this.f335811j) {
            contentValues.put("talkerName", this.field_talkerName);
        }
        if (this.field_identity == null) {
            this.field_identity = "";
        }
        if (this.f335812n) {
            contentValues.put("identity", this.field_identity);
        }
        if (this.f335813o) {
            contentValues.put("msgid", Long.valueOf(this.field_msgid));
        }
        if (this.f335814p) {
            contentValues.put("room_state", Integer.valueOf(this.field_room_state));
        }
        if (this.f335815q) {
            contentValues.put("abort_backend_informed", Integer.valueOf(this.field_abort_backend_informed));
        }
        if (this.f335816r) {
            contentValues.put("inviteTimestamp", Long.valueOf(this.field_inviteTimestamp));
        }
        if (this.f335817s) {
            contentValues.put("connectedTimestamp", Long.valueOf(this.field_connectedTimestamp));
        }
        if (this.f335818t) {
            contentValues.put("recallTipsTimestamp", Long.valueOf(this.field_recallTipsTimestamp));
        }
        if (this.f335819u) {
            contentValues.put("bubbleMsgTimestamp", Long.valueOf(this.field_bubbleMsgTimestamp));
        }
        if (this.f335820v) {
            contentValues.put("msgType", Integer.valueOf(this.field_msgType));
        }
        if (this.f335821w) {
            contentValues.put("mainRecord", Integer.valueOf(this.field_mainRecord));
        }
        if (this.f335822x) {
            contentValues.put("aliveTimestamp", Long.valueOf(this.field_aliveTimestamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BubbleInfo ( " + f335801Z.sql + ");");
        for (String add : f335781E) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BubbleInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f335801Z, "BubbleInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseVoIPBubbleInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BubbleInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f335801Z;
    }

    public String[] getIndexCreateSQL() {
        return f335781E;
    }

    public StorageObserverOwner<C112150i9> getObserverOwner() {
        return f335802p0;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_id);
    }

    public SingleTable getTable() {
        return f335803y;
    }

    public String getTableName() {
        return f335803y.getName();
    }

    /* renamed from: l2 */
    public int mo163947l2() {
        return this.field_abort_backend_informed;
    }

    /* renamed from: m2 */
    public long mo163948m2() {
        return this.field_aliveTimestamp;
    }

    /* renamed from: n2 */
    public long mo163949n2() {
        return this.field_bubbleMsgTimestamp;
    }

    /* renamed from: o2 */
    public long mo163950o2() {
        return this.field_connectedTimestamp;
    }

    /* renamed from: p2 */
    public String mo163951p2() {
        return this.field_identity;
    }

    /* renamed from: q2 */
    public long mo163952q2() {
        return this.field_inviteTimestamp;
    }

    /* renamed from: r2 */
    public long mo163953r2() {
        return this.field_inviteid;
    }

    /* renamed from: s2 */
    public int mo163954s2() {
        return this.field_mainRecord;
    }

    /* renamed from: t2 */
    public int mo163955t2() {
        return this.field_msgType;
    }

    /* renamed from: u2 */
    public long mo163956u2() {
        return this.field_msgid;
    }

    /* renamed from: v2 */
    public int mo163957v2() {
        return this.field_outCall;
    }

    /* renamed from: w2 */
    public long mo163958w2() {
        return this.field_recallTipsTimestamp;
    }

    /* renamed from: x2 */
    public int mo163959x2() {
        return this.field_room_state;
    }

    /* renamed from: y2 */
    public int mo163960y2() {
        return this.field_room_type;
    }

    /* renamed from: z2 */
    public long mo163961z2() {
        return this.field_roomid;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsLong("id").longValue();
            if (z) {
                this.f335805d = true;
            }
        }
        if (contentValues.containsKey("roomid")) {
            this.field_roomid = contentValues.getAsLong("roomid").longValue();
            if (z) {
                this.f335806e = true;
            }
        }
        if (contentValues.containsKey("roomkey")) {
            this.field_roomkey = contentValues.getAsLong("roomkey").longValue();
            if (z) {
                this.f335807f = true;
            }
        }
        if (contentValues.containsKey("inviteid")) {
            this.field_inviteid = contentValues.getAsLong("inviteid").longValue();
            if (z) {
                this.f335808g = true;
            }
        }
        if (contentValues.containsKey("room_type")) {
            this.field_room_type = contentValues.getAsInteger("room_type").intValue();
            if (z) {
                this.f335809h = true;
            }
        }
        if (contentValues.containsKey("out_call")) {
            this.field_outCall = contentValues.getAsInteger("out_call").intValue();
            if (z) {
                this.f335810i = true;
            }
        }
        if (contentValues.containsKey("talkerName")) {
            this.field_talkerName = contentValues.getAsString("talkerName");
            if (z) {
                this.f335811j = true;
            }
        }
        if (contentValues.containsKey("identity")) {
            this.field_identity = contentValues.getAsString("identity");
            if (z) {
                this.f335812n = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.field_msgid = contentValues.getAsLong("msgid").longValue();
            if (z) {
                this.f335813o = true;
            }
        }
        if (contentValues.containsKey("room_state")) {
            this.field_room_state = contentValues.getAsInteger("room_state").intValue();
            if (z) {
                this.f335814p = true;
            }
        }
        if (contentValues.containsKey("abort_backend_informed")) {
            this.field_abort_backend_informed = contentValues.getAsInteger("abort_backend_informed").intValue();
            if (z) {
                this.f335815q = true;
            }
        }
        if (contentValues.containsKey("inviteTimestamp")) {
            this.field_inviteTimestamp = contentValues.getAsLong("inviteTimestamp").longValue();
            if (z) {
                this.f335816r = true;
            }
        }
        if (contentValues.containsKey("connectedTimestamp")) {
            this.field_connectedTimestamp = contentValues.getAsLong("connectedTimestamp").longValue();
            if (z) {
                this.f335817s = true;
            }
        }
        if (contentValues.containsKey("recallTipsTimestamp")) {
            this.field_recallTipsTimestamp = contentValues.getAsLong("recallTipsTimestamp").longValue();
            if (z) {
                this.f335818t = true;
            }
        }
        if (contentValues.containsKey("bubbleMsgTimestamp")) {
            this.field_bubbleMsgTimestamp = contentValues.getAsLong("bubbleMsgTimestamp").longValue();
            if (z) {
                this.f335819u = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z) {
                this.f335820v = true;
            }
        }
        if (contentValues.containsKey("mainRecord")) {
            this.field_mainRecord = contentValues.getAsInteger("mainRecord").intValue();
            if (z) {
                this.f335821w = true;
            }
        }
        if (contentValues.containsKey("aliveTimestamp")) {
            this.field_aliveTimestamp = contentValues.getAsLong("aliveTimestamp").longValue();
            if (z) {
                this.f335822x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
