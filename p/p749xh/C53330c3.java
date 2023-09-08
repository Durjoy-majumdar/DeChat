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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.c3 */
public class C53330c3 extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f149030B;

    /* renamed from: C */
    public static final Column f149031C;

    /* renamed from: D */
    public static final Column f149032D;

    /* renamed from: E */
    public static final Column f149033E;

    /* renamed from: F */
    public static final Column f149034F;

    /* renamed from: G */
    public static final Column f149035G;

    /* renamed from: H */
    public static final Column f149036H;

    /* renamed from: I */
    public static final Column f149037I;

    /* renamed from: J */
    public static final Column f149038J;

    /* renamed from: K */
    public static final String[] f149039K = {"CREATE INDEX IF NOT EXISTS FinderConversation_sessionId_index ON FinderConversation(sessionId)", "CREATE INDEX IF NOT EXISTS FinderConversation_talker_index ON FinderConversation(talker)", "CREATE INDEX IF NOT EXISTS FinderConversation_username_status ON FinderConversation(status)", "CREATE INDEX IF NOT EXISTS FinderConversation_updateTime_index ON FinderConversation(updateTime)", "CREATE INDEX IF NOT EXISTS FinderConversation_type_index ON FinderConversation(type)", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_index ON FinderConversation(scene)", "CREATE INDEX IF NOT EXISTS FinderConversation_readStatus_index ON FinderConversation(readStatus)", "CREATE INDEX IF NOT EXISTS FinderConversation_senderUserName_index ON FinderConversation(senderUserName)", "CREATE INDEX IF NOT EXISTS FinderConversation_senderUserNameVersion_index ON FinderConversation(senderUserNameVersion)"};

    /* renamed from: L */
    public static final int f149040L = 607796817;

    /* renamed from: M */
    public static final int f149041M = -881080743;

    /* renamed from: N */
    public static final int f149042N = 932971136;

    /* renamed from: P */
    public static final int f149043P = -892481550;

    /* renamed from: Q */
    public static final int f149044Q = -295931082;

    /* renamed from: Q0 */
    public static final int f149045Q0 = 1667659339;

    /* renamed from: R */
    public static final int f149046R = -1331913276;

    /* renamed from: R0 */
    public static final int f149047R0 = 1667748389;

    /* renamed from: S */
    public static final int f149048S = -1309115473;

    /* renamed from: S0 */
    public static final int f149049S0 = -810638323;

    /* renamed from: T */
    public static final int f149050T = -1309139170;

    /* renamed from: T0 */
    public static final int f149051T0 = -2027458883;

    /* renamed from: U */
    public static final int f149052U = 1996652390;

    /* renamed from: U0 */
    public static final int f149053U0 = 108705909;

    /* renamed from: V */
    public static final int f149054V = 951530617;

    /* renamed from: V0 */
    public static final IAutoDBItem.MAutoDBInfo f149055V0 = initAutoDBInfo(C53330c3.class);

    /* renamed from: W */
    public static final int f149056W = -1180128302;

    /* renamed from: W0 */
    public static final StorageObserverOwner<C53330c3> f149057W0 = new StorageObserverOwner<>();

    /* renamed from: X */
    public static final int f149058X = -262711991;

    /* renamed from: Y */
    public static final int f149059Y = -1731317047;

    /* renamed from: Z */
    public static final int f149060Z = 3575610;

    /* renamed from: p0 */
    public static final int f149061p0 = 211768485;

    /* renamed from: x0 */
    public static final int f149062x0 = 109254796;

    /* renamed from: y0 */
    public static final int f149063y0 = -500691672;

    /* renamed from: A */
    public boolean f149064A = true;

    /* renamed from: d */
    public boolean f149065d = true;

    /* renamed from: e */
    public boolean f149066e = true;

    /* renamed from: f */
    public boolean f149067f = true;
    public int field_actionPermission;
    public String field_content;
    public String field_digest;
    public String field_digestType;
    public String field_digestUser;
    public String field_editingMsg;
    public int field_followFlag;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_placedFlag;
    public int field_readStatus;
    public int field_scene;
    public int field_senderRoleType;
    public String field_senderUserName;
    public int field_senderUserNameVersion;
    public String field_sessionId;
    public int field_status;
    public String field_talker;
    public int field_type;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f149068g = true;

    /* renamed from: h */
    public boolean f149069h = true;

    /* renamed from: i */
    public boolean f149070i = true;

    /* renamed from: j */
    public boolean f149071j = true;

    /* renamed from: n */
    public boolean f149072n = true;

    /* renamed from: o */
    public boolean f149073o = true;

    /* renamed from: p */
    public boolean f149074p = true;

    /* renamed from: q */
    public boolean f149075q = true;

    /* renamed from: r */
    public boolean f149076r = true;

    /* renamed from: s */
    public boolean f149077s = true;

    /* renamed from: t */
    public boolean f149078t = true;

    /* renamed from: u */
    public boolean f149079u = true;

    /* renamed from: v */
    public boolean f149080v = true;

    /* renamed from: w */
    public boolean f149081w = true;

    /* renamed from: x */
    public boolean f149082x = true;

    /* renamed from: y */
    public boolean f149083y = true;

    /* renamed from: z */
    public boolean f149084z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderConversation");
        f149030B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f149031C = new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        f149032D = new Column("unReadCount", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        f149033E = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
        new Column("digestUser", "string", singleTable.getName(), "");
        new Column("digestType", "string", singleTable.getName(), "");
        new Column("lastMsgID", "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        f149034F = new Column("placedFlag", "long", singleTable.getName(), "");
        new Column("editingMsg", "string", singleTable.getName(), "");
        f149035G = new Column("type", "int", singleTable.getName(), "");
        new Column("actionPermission", "int", singleTable.getName(), "");
        f149036H = new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("readStatus", "int", singleTable.getName(), "");
        f149037I = new Column("senderUserName", "string", singleTable.getName(), "");
        new Column("senderRoleType", "int", singleTable.getName(), "");
        f149038J = new Column("senderUserNameVersion", "int", singleTable.getName(), "");
        new Column("followFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[21];
        String[] strArr = new String[22];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "sessionId";
        mAutoDBInfo.colsMap.put("sessionId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "sessionId";
        mAutoDBInfo.columns[1] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "unReadCount";
        mAutoDBInfo.colsMap.put("unReadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[5] = "digest";
        mAutoDBInfo.colsMap.put("digest", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "digestUser";
        mAutoDBInfo.colsMap.put("digestUser", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "digestType";
        mAutoDBInfo.colsMap.put("digestType", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "lastMsgID";
        mAutoDBInfo.colsMap.put("lastMsgID", "LONG");
        mAutoDBInfo.columns[9] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[10] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER");
        mAutoDBInfo.columns[11] = "placedFlag";
        mAutoDBInfo.colsMap.put("placedFlag", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "editingMsg";
        mAutoDBInfo.colsMap.put("editingMsg", "TEXT");
        mAutoDBInfo.columns[13] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[14] = "actionPermission";
        mAutoDBInfo.colsMap.put("actionPermission", "INTEGER");
        mAutoDBInfo.columns[15] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[16] = "readStatus";
        mAutoDBInfo.colsMap.put("readStatus", "INTEGER");
        mAutoDBInfo.columns[17] = "senderUserName";
        mAutoDBInfo.colsMap.put("senderUserName", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "senderRoleType";
        mAutoDBInfo.colsMap.put("senderRoleType", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "senderUserNameVersion";
        mAutoDBInfo.colsMap.put("senderUserNameVersion", "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "followFlag";
        mAutoDBInfo.colsMap.put("followFlag", "INTEGER");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  content TEXT,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  actionPermission INTEGER,  scene INTEGER,  readStatus INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  senderUserNameVersion INTEGER default '0' ,  followFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53330c3)) {
            return false;
        }
        C53330c3 c3Var = (C53330c3) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, c3Var.field_sessionId) && C46238a.m51546a(this.field_talker, c3Var.field_talker) && C46238a.m51546a(Integer.valueOf(this.field_unReadCount), Integer.valueOf(c3Var.field_unReadCount)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(c3Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(c3Var.field_updateTime)) && C46238a.m51546a(this.field_digest, c3Var.field_digest) && C46238a.m51546a(this.field_digestUser, c3Var.field_digestUser) && C46238a.m51546a(this.field_digestType, c3Var.field_digestType) && C46238a.m51546a(Long.valueOf(this.field_lastMsgID), Long.valueOf(c3Var.field_lastMsgID)) && C46238a.m51546a(this.field_content, c3Var.field_content) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(c3Var.field_isSend)) && C46238a.m51546a(Long.valueOf(this.field_placedFlag), Long.valueOf(c3Var.field_placedFlag)) && C46238a.m51546a(this.field_editingMsg, c3Var.field_editingMsg) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(c3Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_actionPermission), Integer.valueOf(c3Var.field_actionPermission)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(c3Var.field_scene)) && C46238a.m51546a(Integer.valueOf(this.field_readStatus), Integer.valueOf(c3Var.field_readStatus)) && C46238a.m51546a(this.field_senderUserName, c3Var.field_senderUserName) && C46238a.m51546a(Integer.valueOf(this.field_senderRoleType), Integer.valueOf(c3Var.field_senderRoleType)) && C46238a.m51546a(Integer.valueOf(this.field_senderUserNameVersion), Integer.valueOf(c3Var.field_senderUserNameVersion)) && C46238a.m51546a(Integer.valueOf(this.field_followFlag), Integer.valueOf(c3Var.field_followFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149040L == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f149065d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149041M == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149042N == hashCode) {
                    try {
                        this.field_unReadCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149043P == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149044Q == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149046R == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149048S == hashCode) {
                    try {
                        this.field_digestUser = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149050T == hashCode) {
                    try {
                        this.field_digestType = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149052U == hashCode) {
                    try {
                        this.field_lastMsgID = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149054V == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149056W == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149058X == hashCode) {
                    try {
                        this.field_placedFlag = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149059Y == hashCode) {
                    try {
                        this.field_editingMsg = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149060Z == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149061p0 == hashCode) {
                    try {
                        this.field_actionPermission = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149062x0 == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149063y0 == hashCode) {
                    try {
                        this.field_readStatus = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149045Q0 == hashCode) {
                    try {
                        this.field_senderUserName = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149047R0 == hashCode) {
                    try {
                        this.field_senderRoleType = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149049S0 == hashCode) {
                    try {
                        this.field_senderUserNameVersion = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149051T0 == hashCode) {
                    try {
                        this.field_followFlag = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConversation", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149053U0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f149065d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f149066e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f149067f) {
            contentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
        }
        if (this.f149068g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f149069h) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f149070i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f149071j) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f149072n) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f149073o) {
            contentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
        }
        if (this.f149074p) {
            contentValues.put("content", this.field_content);
        }
        if (this.f149075q) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f149076r) {
            contentValues.put("placedFlag", Long.valueOf(this.field_placedFlag));
        }
        if (this.f149077s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f149078t) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f149079u) {
            contentValues.put("actionPermission", Integer.valueOf(this.field_actionPermission));
        }
        if (this.f149080v) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f149081w) {
            contentValues.put("readStatus", Integer.valueOf(this.field_readStatus));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f149082x) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f149083y) {
            contentValues.put("senderRoleType", Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f149084z) {
            contentValues.put("senderUserNameVersion", Integer.valueOf(this.field_senderUserNameVersion));
        }
        if (this.f149064A) {
            contentValues.put("followFlag", Integer.valueOf(this.field_followFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderConversation ( " + f149055V0.sql + ");");
        for (String add : f149039K) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderConversation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderConversation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149055V0, "FinderConversation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderConversation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderConversation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderConversation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149055V0;
    }

    public String[] getIndexCreateSQL() {
        return f149039K;
    }

    public StorageObserverOwner<C53330c3> getObserverOwner() {
        return f149057W0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f149030B;
    }

    public String getTableName() {
        return f149030B.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f149065d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f149066e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z) {
                this.f149067f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f149068g = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f149069h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f149070i = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z) {
                this.f149071j = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z) {
                this.f149072n = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z) {
                this.f149073o = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f149074p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f149075q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z) {
                this.f149076r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z) {
                this.f149077s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f149078t = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z) {
                this.f149079u = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f149080v = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z) {
                this.f149081w = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z) {
                this.f149082x = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z) {
                this.f149083y = true;
            }
        }
        if (contentValues.containsKey("senderUserNameVersion")) {
            this.field_senderUserNameVersion = contentValues.getAsInteger("senderUserNameVersion").intValue();
            if (z) {
                this.f149084z = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.field_followFlag = contentValues.getAsInteger("followFlag").intValue();
            if (z) {
                this.f149064A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
