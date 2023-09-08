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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.w0 */
public class C38689w0 extends IAutoDBItem {

    /* renamed from: D */
    public static final SingleTable f104052D;

    /* renamed from: E */
    public static final String[] f104053E = new String[0];

    /* renamed from: F */
    public static final int f104054F = 104191100;

    /* renamed from: G */
    public static final int f104055G = -1294411543;

    /* renamed from: H */
    public static final int f104056H = 3575610;

    /* renamed from: I */
    public static final int f104057I = -892481550;

    /* renamed from: J */
    public static final int f104058J = -1180128302;

    /* renamed from: K */
    public static final int f104059K = -735390658;

    /* renamed from: L */
    public static final int f104060L = 1369213417;

    /* renamed from: M */
    public static final int f104061M = -881080743;

    /* renamed from: N */
    public static final int f104062N = 951530617;

    /* renamed from: P */
    public static final int f104063P = 1916786312;

    /* renamed from: Q */
    public static final int f104064Q = -350385368;

    /* renamed from: Q0 */
    public static final int f104065Q0 = 108705909;

    /* renamed from: R */
    public static final int f104066R = -486944182;

    /* renamed from: R0 */
    public static final IAutoDBItem.MAutoDBInfo f104067R0 = initAutoDBInfo(C38689w0.class);

    /* renamed from: S */
    public static final int f104068S = -610034348;

    /* renamed from: S0 */
    public static final StorageObserverOwner<C38689w0> f104069S0 = new StorageObserverOwner<>();

    /* renamed from: T */
    public static final int f104070T = 1437142193;

    /* renamed from: U */
    public static final int f104071U = 522984921;

    /* renamed from: V */
    public static final int f104072V = 1298065502;

    /* renamed from: W */
    public static final int f104073W = 193082758;

    /* renamed from: X */
    public static final int f104074X = -2109920975;

    /* renamed from: Y */
    public static final int f104075Y = -1065033442;

    /* renamed from: Z */
    public static final int f104076Z = 3145580;

    /* renamed from: p0 */
    public static final int f104077p0 = 1604237984;

    /* renamed from: x0 */
    public static final int f104078x0 = -285781903;

    /* renamed from: y0 */
    public static final int f104079y0 = -1306498449;

    /* renamed from: A */
    public boolean f104080A = true;

    /* renamed from: B */
    public boolean f104081B = true;

    /* renamed from: C */
    public boolean f104082C = true;

    /* renamed from: d */
    public boolean f104083d = true;

    /* renamed from: e */
    public boolean f104084e = true;

    /* renamed from: f */
    public boolean f104085f = true;
    public long field_bizChatId;
    public String field_bizChatUserId;
    public String field_bizClientMsgId;
    public String field_content;
    public long field_createTime;
    public byte[] field_extInfo;
    public int field_flag;
    public String field_fromUsername;
    public String field_imgPath;
    public int field_isSend;
    public int field_isShowTimer;
    public byte[] field_lvbuffer;
    public long field_msgId;
    public long field_msgSeq;
    public long field_msgSvrId;
    public String field_reserved;
    public int field_status;
    public String field_talker;
    public int field_talkerId;
    public String field_toUsername;
    public String field_transBrandWording;
    public String field_transContent;
    public int field_type;

    /* renamed from: g */
    public boolean f104086g = true;

    /* renamed from: h */
    public boolean f104087h = true;

    /* renamed from: i */
    public boolean f104088i = true;

    /* renamed from: j */
    public boolean f104089j = true;

    /* renamed from: n */
    public boolean f104090n = true;

    /* renamed from: o */
    public boolean f104091o = true;

    /* renamed from: p */
    public boolean f104092p = true;

    /* renamed from: q */
    public boolean f104093q = true;

    /* renamed from: r */
    public boolean f104094r = true;

    /* renamed from: s */
    public boolean f104095s = true;

    /* renamed from: t */
    public boolean f104096t = true;

    /* renamed from: u */
    public boolean f104097u = true;

    /* renamed from: v */
    public boolean f104098v = true;

    /* renamed from: w */
    public boolean f104099w = true;

    /* renamed from: x */
    public boolean f104100x = true;

    /* renamed from: y */
    public boolean f104101y = true;

    /* renamed from: z */
    public boolean f104102z = true;

    static {
        SingleTable singleTable = new SingleTable("BypMsgInfo");
        f104052D = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        new Column("isShowTimer", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
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
        new Column("fromUsername", "string", singleTable.getName(), "");
        new Column("toUsername", "string", singleTable.getName(), "");
        new Column("extInfo", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[23];
        String[] strArr = new String[24];
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
        mAutoDBInfo.columns[20] = "fromUsername";
        mAutoDBInfo.colsMap.put("fromUsername", "TEXT");
        mAutoDBInfo.columns[21] = "toUsername";
        mAutoDBInfo.colsMap.put("toUsername", "TEXT");
        mAutoDBInfo.columns[22] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "BLOB");
        mAutoDBInfo.columns[23] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  msgSvrId LONG,  type INTEGER,  status INTEGER,  isSend INTEGER,  isShowTimer INTEGER,  createTime LONG,  talker TEXT,  content TEXT default '' ,  imgPath TEXT,  reserved TEXT,  lvbuffer BLOB,  talkerId INTEGER,  transContent TEXT default '' ,  transBrandWording TEXT default '' ,  bizClientMsgId TEXT default '' ,  bizChatId LONG default '-1' ,  bizChatUserId TEXT default '' ,  msgSeq LONG,  flag INTEGER default '0' ,  fromUsername TEXT,  toUsername TEXT,  extInfo BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38689w0)) {
            return false;
        }
        C38689w0 w0Var = (C38689w0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(w0Var.field_msgId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(w0Var.field_msgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(w0Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(w0Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(w0Var.field_isSend)) && C46238a.m51546a(Integer.valueOf(this.field_isShowTimer), Integer.valueOf(w0Var.field_isShowTimer)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(w0Var.field_createTime)) && C46238a.m51546a(this.field_talker, w0Var.field_talker) && C46238a.m51546a(this.field_content, w0Var.field_content) && C46238a.m51546a(this.field_imgPath, w0Var.field_imgPath) && C46238a.m51546a(this.field_reserved, w0Var.field_reserved) && C46238a.m51546a(this.field_lvbuffer, w0Var.field_lvbuffer) && C46238a.m51546a(Integer.valueOf(this.field_talkerId), Integer.valueOf(w0Var.field_talkerId)) && C46238a.m51546a(this.field_transContent, w0Var.field_transContent) && C46238a.m51546a(this.field_transBrandWording, w0Var.field_transBrandWording) && C46238a.m51546a(this.field_bizClientMsgId, w0Var.field_bizClientMsgId) && C46238a.m51546a(Long.valueOf(this.field_bizChatId), Long.valueOf(w0Var.field_bizChatId)) && C46238a.m51546a(this.field_bizChatUserId, w0Var.field_bizChatUserId) && C46238a.m51546a(Long.valueOf(this.field_msgSeq), Long.valueOf(w0Var.field_msgSeq)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(w0Var.field_flag)) && C46238a.m51546a(this.field_fromUsername, w0Var.field_fromUsername) && C46238a.m51546a(this.field_toUsername, w0Var.field_toUsername) && C46238a.m51546a(this.field_extInfo, w0Var.field_extInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104054F == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f104083d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104055G == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104056H == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104057I == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104058J == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104059K == hashCode) {
                    try {
                        this.field_isShowTimer = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104060L == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104061M == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104062N == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104063P == hashCode) {
                    try {
                        this.field_imgPath = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104064Q == hashCode) {
                    try {
                        this.field_reserved = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104066R == hashCode) {
                    try {
                        this.field_lvbuffer = cursor.getBlob(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104068S == hashCode) {
                    try {
                        this.field_talkerId = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104070T == hashCode) {
                    try {
                        this.field_transContent = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104071U == hashCode) {
                    try {
                        this.field_transBrandWording = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104072V == hashCode) {
                    try {
                        this.field_bizClientMsgId = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104073W == hashCode) {
                    try {
                        this.field_bizChatId = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104074X == hashCode) {
                    try {
                        this.field_bizChatUserId = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104075Y == hashCode) {
                    try {
                        this.field_msgSeq = cursor.getLong(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104076Z == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104077p0 == hashCode) {
                    try {
                        this.field_fromUsername = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104078x0 == hashCode) {
                    try {
                        this.field_toUsername = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104079y0 == hashCode) {
                    try {
                        this.field_extInfo = cursor.getBlob(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBypMsgInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104065Q0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104083d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f104084e) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f104085f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f104086g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f104087h) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f104088i) {
            contentValues.put("isShowTimer", Integer.valueOf(this.field_isShowTimer));
        }
        if (this.f104089j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f104090n) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f104091o) {
            contentValues.put("content", this.field_content);
        }
        if (this.f104092p) {
            contentValues.put("imgPath", this.field_imgPath);
        }
        if (this.f104093q) {
            contentValues.put("reserved", this.field_reserved);
        }
        if (this.f104094r) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if (this.f104095s) {
            contentValues.put("talkerId", Integer.valueOf(this.field_talkerId));
        }
        if (this.field_transContent == null) {
            this.field_transContent = "";
        }
        if (this.f104096t) {
            contentValues.put("transContent", this.field_transContent);
        }
        if (this.field_transBrandWording == null) {
            this.field_transBrandWording = "";
        }
        if (this.f104097u) {
            contentValues.put("transBrandWording", this.field_transBrandWording);
        }
        if (this.field_bizClientMsgId == null) {
            this.field_bizClientMsgId = "";
        }
        if (this.f104098v) {
            contentValues.put("bizClientMsgId", this.field_bizClientMsgId);
        }
        if (this.f104099w) {
            contentValues.put("bizChatId", Long.valueOf(this.field_bizChatId));
        }
        if (this.field_bizChatUserId == null) {
            this.field_bizChatUserId = "";
        }
        if (this.f104100x) {
            contentValues.put("bizChatUserId", this.field_bizChatUserId);
        }
        if (this.f104101y) {
            contentValues.put("msgSeq", Long.valueOf(this.field_msgSeq));
        }
        if (this.f104102z) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f104080A) {
            contentValues.put("fromUsername", this.field_fromUsername);
        }
        if (this.f104081B) {
            contentValues.put("toUsername", this.field_toUsername);
        }
        if (this.f104082C) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBypMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BypMsgInfo ( " + f104067R0.sql + ");");
        for (String add : f104053E) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBypMsgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BypMsgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104067R0, "BypMsgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBypMsgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BypMsgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBypMsgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104067R0;
    }

    public String[] getIndexCreateSQL() {
        return f104053E;
    }

    public StorageObserverOwner<C38689w0> getObserverOwner() {
        return f104069S0;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f104052D;
    }

    public String getTableName() {
        return f104052D.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f104083d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f104084e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f104085f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f104086g = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f104087h = true;
            }
        }
        if (contentValues.containsKey("isShowTimer")) {
            this.field_isShowTimer = contentValues.getAsInteger("isShowTimer").intValue();
            if (z) {
                this.f104088i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f104089j = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f104090n = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f104091o = true;
            }
        }
        if (contentValues.containsKey("imgPath")) {
            this.field_imgPath = contentValues.getAsString("imgPath");
            if (z) {
                this.f104092p = true;
            }
        }
        if (contentValues.containsKey("reserved")) {
            this.field_reserved = contentValues.getAsString("reserved");
            if (z) {
                this.f104093q = true;
            }
        }
        if (contentValues.containsKey("lvbuffer")) {
            this.field_lvbuffer = contentValues.getAsByteArray("lvbuffer");
            if (z) {
                this.f104094r = true;
            }
        }
        if (contentValues.containsKey("talkerId")) {
            this.field_talkerId = contentValues.getAsInteger("talkerId").intValue();
            if (z) {
                this.f104095s = true;
            }
        }
        if (contentValues.containsKey("transContent")) {
            this.field_transContent = contentValues.getAsString("transContent");
            if (z) {
                this.f104096t = true;
            }
        }
        if (contentValues.containsKey("transBrandWording")) {
            this.field_transBrandWording = contentValues.getAsString("transBrandWording");
            if (z) {
                this.f104097u = true;
            }
        }
        if (contentValues.containsKey("bizClientMsgId")) {
            this.field_bizClientMsgId = contentValues.getAsString("bizClientMsgId");
            if (z) {
                this.f104098v = true;
            }
        }
        if (contentValues.containsKey("bizChatId")) {
            this.field_bizChatId = contentValues.getAsLong("bizChatId").longValue();
            if (z) {
                this.f104099w = true;
            }
        }
        if (contentValues.containsKey("bizChatUserId")) {
            this.field_bizChatUserId = contentValues.getAsString("bizChatUserId");
            if (z) {
                this.f104100x = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.field_msgSeq = contentValues.getAsLong("msgSeq").longValue();
            if (z) {
                this.f104101y = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f104102z = true;
            }
        }
        if (contentValues.containsKey("fromUsername")) {
            this.field_fromUsername = contentValues.getAsString("fromUsername");
            if (z) {
                this.f104080A = true;
            }
        }
        if (contentValues.containsKey("toUsername")) {
            this.field_toUsername = contentValues.getAsString("toUsername");
            if (z) {
                this.f104081B = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsByteArray("extInfo");
            if (z) {
                this.f104082C = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
