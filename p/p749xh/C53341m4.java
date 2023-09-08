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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.m4 */
public class C53341m4 extends IAutoDBItem {

    /* renamed from: J */
    public static final SingleTable f149587J;

    /* renamed from: K */
    public static final String[] f149588K = new String[0];

    /* renamed from: L */
    public static final int f149589L = 104191100;

    /* renamed from: M */
    public static final int f149590M = -501676555;

    /* renamed from: N */
    public static final int f149591N = 984498090;

    /* renamed from: P */
    public static final int f149592P = 1343750747;

    /* renamed from: Q */
    public static final int f149593Q = 1369213417;

    /* renamed from: Q0 */
    public static final int f149594Q0 = -1901141596;

    /* renamed from: R */
    public static final int f149595R = -834724724;

    /* renamed from: R0 */
    public static final int f149596R0 = -1375370902;

    /* renamed from: S */
    public static final int f149597S = 93028124;

    /* renamed from: S0 */
    public static final int f149598S0 = -1771193630;

    /* renamed from: T */
    public static final int f149599T = -1713059;

    /* renamed from: T0 */
    public static final int f149600T0 = -1766500899;

    /* renamed from: U */
    public static final int f149601U = -1180158496;

    /* renamed from: U0 */
    public static final int f149602U0 = 649485010;

    /* renamed from: V */
    public static final int f149603V = 102727412;

    /* renamed from: V0 */
    public static final int f149604V0 = -976922155;

    /* renamed from: W */
    public static final int f149605W = -543453324;

    /* renamed from: W0 */
    public static final int f149606W0 = -788480534;

    /* renamed from: X */
    public static final int f149607X = -791592328;

    /* renamed from: X0 */
    public static final int f149608X0 = 738950403;

    /* renamed from: Y */
    public static final int f149609Y = -938030385;

    /* renamed from: Y0 */
    public static final int f149610Y0 = 902126022;

    /* renamed from: Z */
    public static final int f149611Z = -2103439280;

    /* renamed from: Z0 */
    public static final int f149612Z0 = 2060024831;

    /* renamed from: a1 */
    public static final int f149613a1 = -262758570;

    /* renamed from: b1 */
    public static final int f149614b1 = 507265702;

    /* renamed from: c1 */
    public static final int f149615c1 = 108705909;

    /* renamed from: d1 */
    public static final IAutoDBItem.MAutoDBInfo f149616d1 = initAutoDBInfo(C53341m4.class);

    /* renamed from: e1 */
    public static final StorageObserverOwner<C53341m4> f149617e1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f149618p0 = -338815017;

    /* renamed from: x0 */
    public static final int f149619x0 = 2043356721;

    /* renamed from: y0 */
    public static final int f149620y0 = 532736585;

    /* renamed from: A */
    public boolean f149621A = true;

    /* renamed from: B */
    public boolean f149622B = true;

    /* renamed from: C */
    public boolean f149623C = true;

    /* renamed from: D */
    public boolean f149624D = true;

    /* renamed from: E */
    public boolean f149625E = true;

    /* renamed from: F */
    public boolean f149626F = true;

    /* renamed from: G */
    public boolean f149627G = true;

    /* renamed from: H */
    public boolean f149628H = true;

    /* renamed from: I */
    public boolean f149629I = true;

    /* renamed from: d */
    public boolean f149630d = true;

    /* renamed from: e */
    public boolean f149631e = true;

    /* renamed from: f */
    public boolean f149632f = true;
    public String field_appId;
    public int field_channel;
    public float field_clickScore;
    public long field_createTime;
    public boolean field_entranceExposure;
    public long field_expireTime;
    public int field_exposuredCount;
    public String field_gameMsgId;
    public int field_hasMergedCount;
    public String field_interactiveMergeId;
    public boolean field_isGreet;
    public int field_isHidden;
    public boolean field_isRead;
    public String field_label;
    public String field_mergeSenderIcon;
    public String field_mergerId;
    public long field_msgId;
    public int field_msgType;
    public boolean field_needReport;
    public String field_pushId;
    public String field_quickResponseContentId;
    public String field_rawXML;
    public boolean field_reappearable;
    public long field_receiveTime;
    public long field_redDotExpireTime;
    public int field_relationType;
    public boolean field_showInMsgList;
    public int field_showType;
    public String field_weight;

    /* renamed from: g */
    public boolean f149633g = true;

    /* renamed from: h */
    public boolean f149634h = true;

    /* renamed from: i */
    public boolean f149635i = true;

    /* renamed from: j */
    public boolean f149636j = true;

    /* renamed from: n */
    public boolean f149637n = true;

    /* renamed from: o */
    public boolean f149638o = true;

    /* renamed from: p */
    public boolean f149639p = true;

    /* renamed from: q */
    public boolean f149640q = true;

    /* renamed from: r */
    public boolean f149641r = true;

    /* renamed from: s */
    public boolean f149642s = true;

    /* renamed from: t */
    public boolean f149643t = true;

    /* renamed from: u */
    public boolean f149644u = true;

    /* renamed from: v */
    public boolean f149645v = true;

    /* renamed from: w */
    public boolean f149646w = true;

    /* renamed from: x */
    public boolean f149647x = true;

    /* renamed from: y */
    public boolean f149648y = true;

    /* renamed from: z */
    public boolean f149649z = true;

    static {
        SingleTable singleTable = new SingleTable("GameRawMessage");
        f149587J = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("mergerId", "string", singleTable.getName(), "");
        new Column("gameMsgId", "string", singleTable.getName(), "");
        new Column("msgType", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("showInMsgList", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isRead", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("label", "string", singleTable.getName(), "");
        new Column("isHidden", "int", singleTable.getName(), "");
        new Column("weight", "string", singleTable.getName(), "");
        new Column("rawXML", "string", singleTable.getName(), "");
        new Column("receiveTime", "long", singleTable.getName(), "");
        new Column("showType", "int", singleTable.getName(), "");
        new Column("interactiveMergeId", "string", singleTable.getName(), "");
        new Column("hasMergedCount", "int", singleTable.getName(), "");
        new Column("redDotExpireTime", "long", singleTable.getName(), "");
        new Column("needReport", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("reappearable", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("entranceExposure", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("exposuredCount", "int", singleTable.getName(), "");
        new Column("pushId", "string", singleTable.getName(), "");
        new Column("clickScore", "float", singleTable.getName(), "");
        new Column("channel", "int", singleTable.getName(), "");
        new Column("quickResponseContentId", "string", singleTable.getName(), "");
        new Column("isGreet", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("relationType", "int", singleTable.getName(), "");
        new Column("mergeSenderIcon", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[29];
        String[] strArr = new String[30];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "mergerId";
        mAutoDBInfo.colsMap.put("mergerId", "TEXT");
        mAutoDBInfo.columns[2] = "gameMsgId";
        mAutoDBInfo.colsMap.put("gameMsgId", "TEXT");
        mAutoDBInfo.columns[3] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "INTEGER");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG default '0' ");
        mAutoDBInfo.columns[6] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[7] = "showInMsgList";
        mAutoDBInfo.colsMap.put("showInMsgList", "INTEGER default 'true' ");
        mAutoDBInfo.columns[8] = "isRead";
        mAutoDBInfo.colsMap.put("isRead", "INTEGER default 'false' ");
        mAutoDBInfo.columns[9] = "label";
        mAutoDBInfo.colsMap.put("label", "TEXT default '' ");
        mAutoDBInfo.columns[10] = "isHidden";
        mAutoDBInfo.colsMap.put("isHidden", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "weight";
        mAutoDBInfo.colsMap.put("weight", "TEXT default '' ");
        mAutoDBInfo.columns[12] = "rawXML";
        mAutoDBInfo.colsMap.put("rawXML", "TEXT default '' ");
        mAutoDBInfo.columns[13] = "receiveTime";
        mAutoDBInfo.colsMap.put("receiveTime", "LONG default '0' ");
        mAutoDBInfo.columns[14] = "showType";
        mAutoDBInfo.colsMap.put("showType", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "interactiveMergeId";
        mAutoDBInfo.colsMap.put("interactiveMergeId", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "hasMergedCount";
        mAutoDBInfo.colsMap.put("hasMergedCount", "INTEGER default '1' ");
        mAutoDBInfo.columns[17] = "redDotExpireTime";
        mAutoDBInfo.colsMap.put("redDotExpireTime", "LONG default '0' ");
        mAutoDBInfo.columns[18] = "needReport";
        mAutoDBInfo.colsMap.put("needReport", "INTEGER default 'false' ");
        mAutoDBInfo.columns[19] = "reappearable";
        mAutoDBInfo.colsMap.put("reappearable", "INTEGER default 'false' ");
        mAutoDBInfo.columns[20] = "entranceExposure";
        mAutoDBInfo.colsMap.put("entranceExposure", "INTEGER default 'false' ");
        mAutoDBInfo.columns[21] = "exposuredCount";
        mAutoDBInfo.colsMap.put("exposuredCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[22] = "pushId";
        mAutoDBInfo.colsMap.put("pushId", "TEXT default '-1' ");
        mAutoDBInfo.columns[23] = "clickScore";
        mAutoDBInfo.colsMap.put("clickScore", "FLOAT default '0.5' ");
        mAutoDBInfo.columns[24] = "channel";
        mAutoDBInfo.colsMap.put("channel", "INTEGER default '0' ");
        mAutoDBInfo.columns[25] = "quickResponseContentId";
        mAutoDBInfo.colsMap.put("quickResponseContentId", "TEXT default '' ");
        mAutoDBInfo.columns[26] = "isGreet";
        mAutoDBInfo.colsMap.put("isGreet", "INTEGER default 'false' ");
        mAutoDBInfo.columns[27] = "relationType";
        mAutoDBInfo.colsMap.put("relationType", "INTEGER default '0' ");
        mAutoDBInfo.columns[28] = "mergeSenderIcon";
        mAutoDBInfo.colsMap.put("mergeSenderIcon", "TEXT default '' ");
        mAutoDBInfo.columns[29] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  mergerId TEXT,  gameMsgId TEXT,  msgType INTEGER,  createTime LONG default '0' ,  expireTime LONG default '0' ,  appId TEXT,  showInMsgList INTEGER default 'true' ,  isRead INTEGER default 'false' ,  label TEXT default '' ,  isHidden INTEGER default '0' ,  weight TEXT default '' ,  rawXML TEXT default '' ,  receiveTime LONG default '0' ,  showType INTEGER default '0' ,  interactiveMergeId TEXT default '' ,  hasMergedCount INTEGER default '1' ,  redDotExpireTime LONG default '0' ,  needReport INTEGER default 'false' ,  reappearable INTEGER default 'false' ,  entranceExposure INTEGER default 'false' ,  exposuredCount INTEGER default '0' ,  pushId TEXT default '-1' ,  clickScore FLOAT default '0.5' ,  channel INTEGER default '0' ,  quickResponseContentId TEXT default '' ,  isGreet INTEGER default 'false' ,  relationType INTEGER default '0' ,  mergeSenderIcon TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53341m4)) {
            return false;
        }
        C53341m4 m4Var = (C53341m4) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(m4Var.field_msgId)) && C46238a.m51546a(this.field_mergerId, m4Var.field_mergerId) && C46238a.m51546a(this.field_gameMsgId, m4Var.field_gameMsgId) && C46238a.m51546a(Integer.valueOf(this.field_msgType), Integer.valueOf(m4Var.field_msgType)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(m4Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(m4Var.field_expireTime)) && C46238a.m51546a(this.field_appId, m4Var.field_appId) && C46238a.m51546a(Boolean.valueOf(this.field_showInMsgList), Boolean.valueOf(m4Var.field_showInMsgList)) && C46238a.m51546a(Boolean.valueOf(this.field_isRead), Boolean.valueOf(m4Var.field_isRead)) && C46238a.m51546a(this.field_label, m4Var.field_label) && C46238a.m51546a(Integer.valueOf(this.field_isHidden), Integer.valueOf(m4Var.field_isHidden)) && C46238a.m51546a(this.field_weight, m4Var.field_weight) && C46238a.m51546a(this.field_rawXML, m4Var.field_rawXML) && C46238a.m51546a(Long.valueOf(this.field_receiveTime), Long.valueOf(m4Var.field_receiveTime)) && C46238a.m51546a(Integer.valueOf(this.field_showType), Integer.valueOf(m4Var.field_showType)) && C46238a.m51546a(this.field_interactiveMergeId, m4Var.field_interactiveMergeId) && C46238a.m51546a(Integer.valueOf(this.field_hasMergedCount), Integer.valueOf(m4Var.field_hasMergedCount)) && C46238a.m51546a(Long.valueOf(this.field_redDotExpireTime), Long.valueOf(m4Var.field_redDotExpireTime)) && C46238a.m51546a(Boolean.valueOf(this.field_needReport), Boolean.valueOf(m4Var.field_needReport)) && C46238a.m51546a(Boolean.valueOf(this.field_reappearable), Boolean.valueOf(m4Var.field_reappearable)) && C46238a.m51546a(Boolean.valueOf(this.field_entranceExposure), Boolean.valueOf(m4Var.field_entranceExposure)) && C46238a.m51546a(Integer.valueOf(this.field_exposuredCount), Integer.valueOf(m4Var.field_exposuredCount)) && C46238a.m51546a(this.field_pushId, m4Var.field_pushId) && C46238a.m51546a(Float.valueOf(this.field_clickScore), Float.valueOf(m4Var.field_clickScore)) && C46238a.m51546a(Integer.valueOf(this.field_channel), Integer.valueOf(m4Var.field_channel)) && C46238a.m51546a(this.field_quickResponseContentId, m4Var.field_quickResponseContentId) && C46238a.m51546a(Boolean.valueOf(this.field_isGreet), Boolean.valueOf(m4Var.field_isGreet)) && C46238a.m51546a(Integer.valueOf(this.field_relationType), Integer.valueOf(m4Var.field_relationType)) && C46238a.m51546a(this.field_mergeSenderIcon, m4Var.field_mergeSenderIcon);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149589L == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f149630d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149590M == hashCode) {
                    try {
                        this.field_mergerId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149591N == hashCode) {
                    try {
                        this.field_gameMsgId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149592P == hashCode) {
                    try {
                        this.field_msgType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149593Q == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149595R == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149597S == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149599T == hashCode) {
                    try {
                        this.field_showInMsgList = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149601U == hashCode) {
                    try {
                        this.field_isRead = cursor.getInt(i) != 0;
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149603V == hashCode) {
                    try {
                        this.field_label = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149605W == hashCode) {
                    try {
                        this.field_isHidden = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149607X == hashCode) {
                    try {
                        this.field_weight = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149609Y == hashCode) {
                    try {
                        this.field_rawXML = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149611Z == hashCode) {
                    try {
                        this.field_receiveTime = cursor.getLong(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149618p0 == hashCode) {
                    try {
                        this.field_showType = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149619x0 == hashCode) {
                    try {
                        this.field_interactiveMergeId = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149620y0 == hashCode) {
                    try {
                        this.field_hasMergedCount = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149594Q0 == hashCode) {
                    try {
                        this.field_redDotExpireTime = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149596R0 == hashCode) {
                    try {
                        this.field_needReport = cursor.getInt(i) != 0;
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149598S0 == hashCode) {
                    try {
                        this.field_reappearable = cursor.getInt(i) != 0;
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149600T0 == hashCode) {
                    try {
                        this.field_entranceExposure = cursor.getInt(i) != 0;
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149602U0 == hashCode) {
                    try {
                        this.field_exposuredCount = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149604V0 == hashCode) {
                    try {
                        this.field_pushId = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149606W0 == hashCode) {
                    try {
                        this.field_clickScore = cursor.getFloat(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149608X0 == hashCode) {
                    try {
                        this.field_channel = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149610Y0 == hashCode) {
                    try {
                        this.field_quickResponseContentId = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149612Z0 == hashCode) {
                    try {
                        this.field_isGreet = cursor.getInt(i) != 0;
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149613a1 == hashCode) {
                    try {
                        this.field_relationType = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149614b1 == hashCode) {
                    try {
                        this.field_mergeSenderIcon = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameRawMessage", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149615c1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149630d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f149631e) {
            contentValues.put("mergerId", this.field_mergerId);
        }
        if (this.f149632f) {
            contentValues.put("gameMsgId", this.field_gameMsgId);
        }
        if (this.f149633g) {
            contentValues.put("msgType", Integer.valueOf(this.field_msgType));
        }
        if (this.f149634h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f149635i) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f149636j) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f149637n) {
            if (this.field_showInMsgList) {
                contentValues.put("showInMsgList", 1);
            } else {
                contentValues.put("showInMsgList", 0);
            }
        }
        if (this.f149638o) {
            if (this.field_isRead) {
                contentValues.put("isRead", 1);
            } else {
                contentValues.put("isRead", 0);
            }
        }
        if (this.field_label == null) {
            this.field_label = "";
        }
        if (this.f149639p) {
            contentValues.put("label", this.field_label);
        }
        if (this.f149640q) {
            contentValues.put("isHidden", Integer.valueOf(this.field_isHidden));
        }
        if (this.field_weight == null) {
            this.field_weight = "";
        }
        if (this.f149641r) {
            contentValues.put("weight", this.field_weight);
        }
        if (this.field_rawXML == null) {
            this.field_rawXML = "";
        }
        if (this.f149642s) {
            contentValues.put("rawXML", this.field_rawXML);
        }
        if (this.f149643t) {
            contentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
        }
        if (this.f149644u) {
            contentValues.put("showType", Integer.valueOf(this.field_showType));
        }
        if (this.field_interactiveMergeId == null) {
            this.field_interactiveMergeId = "";
        }
        if (this.f149645v) {
            contentValues.put("interactiveMergeId", this.field_interactiveMergeId);
        }
        if (this.f149646w) {
            contentValues.put("hasMergedCount", Integer.valueOf(this.field_hasMergedCount));
        }
        if (this.f149647x) {
            contentValues.put("redDotExpireTime", Long.valueOf(this.field_redDotExpireTime));
        }
        if (this.f149648y) {
            if (this.field_needReport) {
                contentValues.put("needReport", 1);
            } else {
                contentValues.put("needReport", 0);
            }
        }
        if (this.f149649z) {
            if (this.field_reappearable) {
                contentValues.put("reappearable", 1);
            } else {
                contentValues.put("reappearable", 0);
            }
        }
        if (this.f149621A) {
            if (this.field_entranceExposure) {
                contentValues.put("entranceExposure", 1);
            } else {
                contentValues.put("entranceExposure", 0);
            }
        }
        if (this.f149622B) {
            contentValues.put("exposuredCount", Integer.valueOf(this.field_exposuredCount));
        }
        if (this.field_pushId == null) {
            this.field_pushId = "-1";
        }
        if (this.f149623C) {
            contentValues.put("pushId", this.field_pushId);
        }
        if (this.f149624D) {
            contentValues.put("clickScore", Float.valueOf(this.field_clickScore));
        }
        if (this.f149625E) {
            contentValues.put("channel", Integer.valueOf(this.field_channel));
        }
        if (this.field_quickResponseContentId == null) {
            this.field_quickResponseContentId = "";
        }
        if (this.f149626F) {
            contentValues.put("quickResponseContentId", this.field_quickResponseContentId);
        }
        if (this.f149627G) {
            if (this.field_isGreet) {
                contentValues.put("isGreet", 1);
            } else {
                contentValues.put("isGreet", 0);
            }
        }
        if (this.f149628H) {
            contentValues.put("relationType", Integer.valueOf(this.field_relationType));
        }
        if (this.field_mergeSenderIcon == null) {
            this.field_mergeSenderIcon = "";
        }
        if (this.f149629I) {
            contentValues.put("mergeSenderIcon", this.field_mergeSenderIcon);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameRawMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameRawMessage ( " + f149616d1.sql + ");");
        for (String add : f149588K) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameRawMessage", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameRawMessage", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149616d1, "GameRawMessage", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameRawMessage", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameRawMessage", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameRawMessage", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149616d1;
    }

    public String[] getIndexCreateSQL() {
        return f149588K;
    }

    public StorageObserverOwner<C53341m4> getObserverOwner() {
        return f149617e1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f149587J;
    }

    public String getTableName() {
        return f149587J.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f149630d = true;
            }
        }
        if (contentValues.containsKey("mergerId")) {
            this.field_mergerId = contentValues.getAsString("mergerId");
            if (z) {
                this.f149631e = true;
            }
        }
        if (contentValues.containsKey("gameMsgId")) {
            this.field_gameMsgId = contentValues.getAsString("gameMsgId");
            if (z) {
                this.f149632f = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z) {
                this.f149633g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f149634h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f149635i = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149636j = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("showInMsgList")) {
            this.field_showInMsgList = contentValues.getAsInteger("showInMsgList").intValue() != 0;
            if (z) {
                this.f149637n = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsInteger("isRead").intValue() != 0;
            if (z) {
                this.f149638o = true;
            }
        }
        if (contentValues.containsKey("label")) {
            this.field_label = contentValues.getAsString("label");
            if (z) {
                this.f149639p = true;
            }
        }
        if (contentValues.containsKey("isHidden")) {
            this.field_isHidden = contentValues.getAsInteger("isHidden").intValue();
            if (z) {
                this.f149640q = true;
            }
        }
        if (contentValues.containsKey("weight")) {
            this.field_weight = contentValues.getAsString("weight");
            if (z) {
                this.f149641r = true;
            }
        }
        if (contentValues.containsKey("rawXML")) {
            this.field_rawXML = contentValues.getAsString("rawXML");
            if (z) {
                this.f149642s = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.field_receiveTime = contentValues.getAsLong("receiveTime").longValue();
            if (z) {
                this.f149643t = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.field_showType = contentValues.getAsInteger("showType").intValue();
            if (z) {
                this.f149644u = true;
            }
        }
        if (contentValues.containsKey("interactiveMergeId")) {
            this.field_interactiveMergeId = contentValues.getAsString("interactiveMergeId");
            if (z) {
                this.f149645v = true;
            }
        }
        if (contentValues.containsKey("hasMergedCount")) {
            this.field_hasMergedCount = contentValues.getAsInteger("hasMergedCount").intValue();
            if (z) {
                this.f149646w = true;
            }
        }
        if (contentValues.containsKey("redDotExpireTime")) {
            this.field_redDotExpireTime = contentValues.getAsLong("redDotExpireTime").longValue();
            if (z) {
                this.f149647x = true;
            }
        }
        if (contentValues.containsKey("needReport")) {
            this.field_needReport = contentValues.getAsInteger("needReport").intValue() != 0;
            if (z) {
                this.f149648y = true;
            }
        }
        if (contentValues.containsKey("reappearable")) {
            this.field_reappearable = contentValues.getAsInteger("reappearable").intValue() != 0;
            if (z) {
                this.f149649z = true;
            }
        }
        if (contentValues.containsKey("entranceExposure")) {
            this.field_entranceExposure = contentValues.getAsInteger("entranceExposure").intValue() != 0;
            if (z) {
                this.f149621A = true;
            }
        }
        if (contentValues.containsKey("exposuredCount")) {
            this.field_exposuredCount = contentValues.getAsInteger("exposuredCount").intValue();
            if (z) {
                this.f149622B = true;
            }
        }
        if (contentValues.containsKey("pushId")) {
            this.field_pushId = contentValues.getAsString("pushId");
            if (z) {
                this.f149623C = true;
            }
        }
        if (contentValues.containsKey("clickScore")) {
            this.field_clickScore = contentValues.getAsFloat("clickScore").floatValue();
            if (z) {
                this.f149624D = true;
            }
        }
        if (contentValues.containsKey("channel")) {
            this.field_channel = contentValues.getAsInteger("channel").intValue();
            if (z) {
                this.f149625E = true;
            }
        }
        if (contentValues.containsKey("quickResponseContentId")) {
            this.field_quickResponseContentId = contentValues.getAsString("quickResponseContentId");
            if (z) {
                this.f149626F = true;
            }
        }
        if (contentValues.containsKey("isGreet")) {
            if (contentValues.getAsInteger("isGreet").intValue() != 0) {
                z2 = true;
            }
            this.field_isGreet = z2;
            if (z) {
                this.f149627G = true;
            }
        }
        if (contentValues.containsKey("relationType")) {
            this.field_relationType = contentValues.getAsInteger("relationType").intValue();
            if (z) {
                this.f149628H = true;
            }
        }
        if (contentValues.containsKey("mergeSenderIcon")) {
            this.field_mergeSenderIcon = contentValues.getAsString("mergeSenderIcon");
            if (z) {
                this.f149629I = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
