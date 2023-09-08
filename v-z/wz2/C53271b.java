package wz2;

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
import p749xh.C66261f3;

/* renamed from: wz2.b */
public class C53271b extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f148691B;

    /* renamed from: C */
    public static final Column f148692C;

    /* renamed from: D */
    public static final String[] f148693D = {"CREATE INDEX IF NOT EXISTS TextStatus_sessionId_index ON TextStatusConversation(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_talker_index ON TextStatusConversation(talker)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_username_status ON TextStatusConversation(status)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_updateTime_index ON TextStatusConversation(updateTime)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_type_index ON TextStatusConversation(type)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_scene_index ON TextStatusConversation(scene)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_readStatus_index ON TextStatusConversation(readStatus)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_senderUserName_index ON TextStatusConversation(senderUserName)", "CREATE INDEX IF NOT EXISTS TextStatusConversation_senderUserNameVersion_index ON TextStatusConversation(senderUserNameVersion)"};

    /* renamed from: E */
    public static final int f148694E = 607796817;

    /* renamed from: F */
    public static final int f148695F = -881080743;

    /* renamed from: G */
    public static final int f148696G = 932971136;

    /* renamed from: H */
    public static final int f148697H = -892481550;

    /* renamed from: I */
    public static final int f148698I = -295931082;

    /* renamed from: J */
    public static final int f148699J = -1331913276;

    /* renamed from: K */
    public static final int f148700K = -1309115473;

    /* renamed from: L */
    public static final int f148701L = -1309139170;

    /* renamed from: M */
    public static final int f148702M = 1996652390;

    /* renamed from: N */
    public static final int f148703N = 951530617;

    /* renamed from: P */
    public static final int f148704P = -1180128302;

    /* renamed from: Q */
    public static final int f148705Q = -262711991;

    /* renamed from: R */
    public static final int f148706R = -1731317047;

    /* renamed from: S */
    public static final int f148707S = 3575610;

    /* renamed from: T */
    public static final int f148708T = 211768485;

    /* renamed from: U */
    public static final int f148709U = 109254796;

    /* renamed from: V */
    public static final int f148710V = -500691672;

    /* renamed from: W */
    public static final int f148711W = 1667659339;

    /* renamed from: X */
    public static final int f148712X = 1667748389;

    /* renamed from: Y */
    public static final int f148713Y = -810638323;

    /* renamed from: Z */
    public static final int f148714Z = -260886334;

    /* renamed from: p0 */
    public static final int f148715p0 = 108705909;

    /* renamed from: x0 */
    public static final IAutoDBItem.MAutoDBInfo f148716x0 = initAutoDBInfo(C53271b.class);

    /* renamed from: y0 */
    public static final StorageObserverOwner<C53271b> f148717y0 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f148718A = true;

    /* renamed from: d */
    public boolean f148719d = true;

    /* renamed from: e */
    public boolean f148720e = true;

    /* renamed from: f */
    public boolean f148721f = true;
    public int field_actionPermission;
    public String field_content;
    public String field_digest;
    public String field_digestType;
    public String field_digestUser;
    public String field_editingMsg;
    public int field_isRedDot;
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
    public boolean f148722g = true;

    /* renamed from: h */
    public boolean f148723h = true;

    /* renamed from: i */
    public boolean f148724i = true;

    /* renamed from: j */
    public boolean f148725j = true;

    /* renamed from: n */
    public boolean f148726n = true;

    /* renamed from: o */
    public boolean f148727o = true;

    /* renamed from: p */
    public boolean f148728p = true;

    /* renamed from: q */
    public boolean f148729q = true;

    /* renamed from: r */
    public boolean f148730r = true;

    /* renamed from: s */
    public boolean f148731s = true;

    /* renamed from: t */
    public boolean f148732t = true;

    /* renamed from: u */
    public boolean f148733u = true;

    /* renamed from: v */
    public boolean f148734v = true;

    /* renamed from: w */
    public boolean f148735w = true;

    /* renamed from: x */
    public boolean f148736x = true;

    /* renamed from: y */
    public boolean f148737y = true;

    /* renamed from: z */
    public boolean f148738z = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusConversation");
        f148691B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("unReadCount", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        f148692C = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
        new Column("digestUser", "string", singleTable.getName(), "");
        new Column("digestType", "string", singleTable.getName(), "");
        new Column("lastMsgID", "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        new Column("placedFlag", "long", singleTable.getName(), "");
        new Column("editingMsg", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("actionPermission", "int", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("readStatus", "int", singleTable.getName(), "");
        new Column("senderUserName", "string", singleTable.getName(), "");
        new Column("senderRoleType", "int", singleTable.getName(), "");
        new Column("senderUserNameVersion", "int", singleTable.getName(), "");
        new Column("isRedDot", "int", singleTable.getName(), "");
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
        mAutoDBInfo.columns[20] = "isRedDot";
        mAutoDBInfo.colsMap.put("isRedDot", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  content TEXT,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  actionPermission INTEGER,  scene INTEGER,  readStatus INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  senderUserNameVersion INTEGER default '0' ,  isRedDot INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53271b)) {
            return false;
        }
        C53271b bVar = (C53271b) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, bVar.field_sessionId) && C46238a.m51546a(this.field_talker, bVar.field_talker) && C46238a.m51546a(Integer.valueOf(this.field_unReadCount), Integer.valueOf(bVar.field_unReadCount)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(bVar.field_status)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(bVar.field_updateTime)) && C46238a.m51546a(this.field_digest, bVar.field_digest) && C46238a.m51546a(this.field_digestUser, bVar.field_digestUser) && C46238a.m51546a(this.field_digestType, bVar.field_digestType) && C46238a.m51546a(Long.valueOf(this.field_lastMsgID), Long.valueOf(bVar.field_lastMsgID)) && C46238a.m51546a(this.field_content, bVar.field_content) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(bVar.field_isSend)) && C46238a.m51546a(Long.valueOf(this.field_placedFlag), Long.valueOf(bVar.field_placedFlag)) && C46238a.m51546a(this.field_editingMsg, bVar.field_editingMsg) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(bVar.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_actionPermission), Integer.valueOf(bVar.field_actionPermission)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(bVar.field_scene)) && C46238a.m51546a(Integer.valueOf(this.field_readStatus), Integer.valueOf(bVar.field_readStatus)) && C46238a.m51546a(this.field_senderUserName, bVar.field_senderUserName) && C46238a.m51546a(Integer.valueOf(this.field_senderRoleType), Integer.valueOf(bVar.field_senderRoleType)) && C46238a.m51546a(Integer.valueOf(this.field_senderUserNameVersion), Integer.valueOf(bVar.field_senderUserNameVersion)) && C46238a.m51546a(Integer.valueOf(this.field_isRedDot), Integer.valueOf(bVar.field_isRedDot));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148694E == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f148719d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148695F == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148696G == hashCode) {
                    try {
                        this.field_unReadCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148697H == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148698I == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148699J == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148700K == hashCode) {
                    try {
                        this.field_digestUser = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148701L == hashCode) {
                    try {
                        this.field_digestType = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148702M == hashCode) {
                    try {
                        this.field_lastMsgID = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148703N == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148704P == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148705Q == hashCode) {
                    try {
                        this.field_placedFlag = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148706R == hashCode) {
                    try {
                        this.field_editingMsg = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148707S == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148708T == hashCode) {
                    try {
                        this.field_actionPermission = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148709U == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148710V == hashCode) {
                    try {
                        this.field_readStatus = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148711W == hashCode) {
                    try {
                        this.field_senderUserName = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148712X == hashCode) {
                    try {
                        this.field_senderRoleType = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148713Y == hashCode) {
                    try {
                        this.field_senderUserNameVersion = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148714Z == hashCode) {
                    try {
                        this.field_isRedDot = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusConversation", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148715p0 == hashCode) {
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
        if (this.f148719d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f148720e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f148721f) {
            contentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
        }
        if (this.f148722g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f148723h) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f148724i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f148725j) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.field_digestType == null) {
            this.field_digestType = "";
        }
        if (this.f148726n) {
            contentValues.put("digestType", this.field_digestType);
        }
        if (this.f148727o) {
            contentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
        }
        if (this.f148728p) {
            contentValues.put("content", this.field_content);
        }
        if (this.f148729q) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.f148730r) {
            contentValues.put("placedFlag", Long.valueOf(this.field_placedFlag));
        }
        if (this.f148731s) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f148732t) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f148733u) {
            contentValues.put("actionPermission", Integer.valueOf(this.field_actionPermission));
        }
        if (this.f148734v) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f148735w) {
            contentValues.put("readStatus", Integer.valueOf(this.field_readStatus));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f148736x) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f148737y) {
            contentValues.put("senderRoleType", Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f148738z) {
            contentValues.put("senderUserNameVersion", Integer.valueOf(this.field_senderUserNameVersion));
        }
        if (this.f148718A) {
            contentValues.put("isRedDot", Integer.valueOf(this.field_isRedDot));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusConversation ( " + f148716x0.sql + ");");
        for (String add : f148693D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusConversation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusConversation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148716x0, "TextStatusConversation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusConversation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusConversation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusConversation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148716x0;
    }

    public String[] getIndexCreateSQL() {
        return f148693D;
    }

    public StorageObserverOwner<C53271b> getObserverOwner() {
        return f148717y0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f148691B;
    }

    public String getTableName() {
        return f148691B.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f148719d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f148720e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z) {
                this.f148721f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f148722g = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f148723h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f148724i = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z) {
                this.f148725j = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.field_digestType = contentValues.getAsString("digestType");
            if (z) {
                this.f148726n = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z) {
                this.f148727o = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f148728p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f148729q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.field_placedFlag = contentValues.getAsLong("placedFlag").longValue();
            if (z) {
                this.f148730r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z) {
                this.f148731s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f148732t = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z) {
                this.f148733u = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f148734v = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.field_readStatus = contentValues.getAsInteger("readStatus").intValue();
            if (z) {
                this.f148735w = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z) {
                this.f148736x = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z) {
                this.f148737y = true;
            }
        }
        if (contentValues.containsKey("senderUserNameVersion")) {
            this.field_senderUserNameVersion = contentValues.getAsInteger("senderUserNameVersion").intValue();
            if (z) {
                this.f148738z = true;
            }
        }
        if (contentValues.containsKey("isRedDot")) {
            this.field_isRedDot = contentValues.getAsInteger("isRedDot").intValue();
            if (z) {
                this.f148718A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
