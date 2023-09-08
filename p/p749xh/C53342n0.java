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

/* renamed from: xh.n0 */
public class C53342n0 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149650A = 193082758;

    /* renamed from: B */
    public static final int f149651B = -64277091;

    /* renamed from: C */
    public static final int f149652C = 932971136;

    /* renamed from: D */
    public static final int f149653D = 1436007616;

    /* renamed from: E */
    public static final int f149654E = 1996652390;

    /* renamed from: F */
    public static final int f149655F = -1067067784;

    /* renamed from: G */
    public static final int f149656G = 951530617;

    /* renamed from: H */
    public static final int f149657H = -1331913276;

    /* renamed from: I */
    public static final int f149658I = -1309115473;

    /* renamed from: J */
    public static final int f149659J = -720175972;

    /* renamed from: K */
    public static final int f149660K = -1731317047;

    /* renamed from: L */
    public static final int f149661L = 1437412018;

    /* renamed from: M */
    public static final int f149662M = -892481550;

    /* renamed from: N */
    public static final int f149663N = -1180128302;

    /* renamed from: P */
    public static final int f149664P = 1343750747;

    /* renamed from: Q */
    public static final int f149665Q = -1309392370;

    /* renamed from: R */
    public static final int f149666R = 3145580;

    /* renamed from: S */
    public static final int f149667S = 93103214;

    /* renamed from: T */
    public static final int f149668T = 108705909;

    /* renamed from: U */
    public static final IAutoDBItem.MAutoDBInfo f149669U = initAutoDBInfo(C53342n0.class);

    /* renamed from: V */
    public static final StorageObserverOwner<C53342n0> f149670V = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f149671y;

    /* renamed from: z */
    public static final String[] f149672z = new String[0];

    /* renamed from: d */
    public boolean f149673d = true;

    /* renamed from: e */
    public boolean f149674e = true;

    /* renamed from: f */
    public boolean f149675f = true;
    public int field_atAll;
    public int field_atCount;
    public long field_bizChatId;
    public String field_brandUserName;
    public int field_chatType;
    public String field_content;
    public String field_digest;
    public String field_digestUser;
    public String field_editingMsg;
    public long field_flag;
    public int field_isSend;
    public long field_lastMsgID;
    public long field_lastMsgTime;
    public int field_msgCount;
    public String field_msgType;
    public int field_newUnReadCount;
    public int field_status;
    public int field_unReadCount;

    /* renamed from: g */
    public boolean f149676g = true;

    /* renamed from: h */
    public boolean f149677h = true;

    /* renamed from: i */
    public boolean f149678i = true;

    /* renamed from: j */
    public boolean f149679j = true;

    /* renamed from: n */
    public boolean f149680n = true;

    /* renamed from: o */
    public boolean f149681o = true;

    /* renamed from: p */
    public boolean f149682p = true;

    /* renamed from: q */
    public boolean f149683q = true;

    /* renamed from: r */
    public boolean f149684r = true;

    /* renamed from: s */
    public boolean f149685s = true;

    /* renamed from: t */
    public boolean f149686t = true;

    /* renamed from: u */
    public boolean f149687u = true;

    /* renamed from: v */
    public boolean f149688v = true;

    /* renamed from: w */
    public boolean f149689w = true;

    /* renamed from: x */
    public boolean f149690x = true;

    static {
        SingleTable singleTable = new SingleTable("BizChatConversation");
        f149671y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("bizChatId", "long", singleTable.getName(), "");
        new Column("brandUserName", "string", singleTable.getName(), "");
        new Column("unReadCount", "int", singleTable.getName(), "");
        new Column("newUnReadCount", "int", singleTable.getName(), "");
        new Column("lastMsgID", "long", singleTable.getName(), "");
        new Column("lastMsgTime", "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
        new Column("digestUser", "string", singleTable.getName(), "");
        new Column("atCount", "int", singleTable.getName(), "");
        new Column("editingMsg", "string", singleTable.getName(), "");
        new Column("chatType", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        new Column("msgType", "string", singleTable.getName(), "");
        new Column("msgCount", "int", singleTable.getName(), "");
        new Column("flag", "long", singleTable.getName(), "");
        new Column("atAll", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "bizChatId";
        mAutoDBInfo.colsMap.put("bizChatId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "bizChatId";
        mAutoDBInfo.columns[1] = "brandUserName";
        mAutoDBInfo.colsMap.put("brandUserName", "TEXT");
        mAutoDBInfo.columns[2] = "unReadCount";
        mAutoDBInfo.colsMap.put("unReadCount", "INTEGER");
        mAutoDBInfo.columns[3] = "newUnReadCount";
        mAutoDBInfo.colsMap.put("newUnReadCount", "INTEGER");
        mAutoDBInfo.columns[4] = "lastMsgID";
        mAutoDBInfo.colsMap.put("lastMsgID", "LONG");
        mAutoDBInfo.columns[5] = "lastMsgTime";
        mAutoDBInfo.colsMap.put("lastMsgTime", "LONG");
        mAutoDBInfo.columns[6] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[7] = "digest";
        mAutoDBInfo.colsMap.put("digest", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "digestUser";
        mAutoDBInfo.colsMap.put("digestUser", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "atCount";
        mAutoDBInfo.colsMap.put("atCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "editingMsg";
        mAutoDBInfo.colsMap.put("editingMsg", "TEXT");
        mAutoDBInfo.columns[11] = "chatType";
        mAutoDBInfo.colsMap.put("chatType", "INTEGER");
        mAutoDBInfo.columns[12] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "TEXT default '' ");
        mAutoDBInfo.columns[15] = "msgCount";
        mAutoDBInfo.colsMap.put("msgCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "flag";
        mAutoDBInfo.colsMap.put("flag", "LONG default '0' ");
        mAutoDBInfo.columns[17] = "atAll";
        mAutoDBInfo.colsMap.put("atAll", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " bizChatId LONG PRIMARY KEY ,  brandUserName TEXT,  unReadCount INTEGER,  newUnReadCount INTEGER,  lastMsgID LONG,  lastMsgTime LONG,  content TEXT,  digest TEXT default '' ,  digestUser TEXT default '' ,  atCount INTEGER default '0' ,  editingMsg TEXT,  chatType INTEGER,  status INTEGER default '0' ,  isSend INTEGER default '0' ,  msgType TEXT default '' ,  msgCount INTEGER default '0' ,  flag LONG default '0' ,  atAll INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53342n0)) {
            return false;
        }
        C53342n0 n0Var = (C53342n0) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_bizChatId), Long.valueOf(n0Var.field_bizChatId)) && C46238a.m51546a(this.field_brandUserName, n0Var.field_brandUserName) && C46238a.m51546a(Integer.valueOf(this.field_unReadCount), Integer.valueOf(n0Var.field_unReadCount)) && C46238a.m51546a(Integer.valueOf(this.field_newUnReadCount), Integer.valueOf(n0Var.field_newUnReadCount)) && C46238a.m51546a(Long.valueOf(this.field_lastMsgID), Long.valueOf(n0Var.field_lastMsgID)) && C46238a.m51546a(Long.valueOf(this.field_lastMsgTime), Long.valueOf(n0Var.field_lastMsgTime)) && C46238a.m51546a(this.field_content, n0Var.field_content) && C46238a.m51546a(this.field_digest, n0Var.field_digest) && C46238a.m51546a(this.field_digestUser, n0Var.field_digestUser) && C46238a.m51546a(Integer.valueOf(this.field_atCount), Integer.valueOf(n0Var.field_atCount)) && C46238a.m51546a(this.field_editingMsg, n0Var.field_editingMsg) && C46238a.m51546a(Integer.valueOf(this.field_chatType), Integer.valueOf(n0Var.field_chatType)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(n0Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(n0Var.field_isSend)) && C46238a.m51546a(this.field_msgType, n0Var.field_msgType) && C46238a.m51546a(Integer.valueOf(this.field_msgCount), Integer.valueOf(n0Var.field_msgCount)) && C46238a.m51546a(Long.valueOf(this.field_flag), Long.valueOf(n0Var.field_flag)) && C46238a.m51546a(Integer.valueOf(this.field_atAll), Integer.valueOf(n0Var.field_atAll));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149650A == hashCode) {
                    try {
                        this.field_bizChatId = cursor.getLong(i);
                        this.f149673d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149651B == hashCode) {
                    try {
                        this.field_brandUserName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149652C == hashCode) {
                    try {
                        this.field_unReadCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149653D == hashCode) {
                    try {
                        this.field_newUnReadCount = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149654E == hashCode) {
                    try {
                        this.field_lastMsgID = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149655F == hashCode) {
                    try {
                        this.field_lastMsgTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149656G == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149657H == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149658I == hashCode) {
                    try {
                        this.field_digestUser = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149659J == hashCode) {
                    try {
                        this.field_atCount = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149660K == hashCode) {
                    try {
                        this.field_editingMsg = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149661L == hashCode) {
                    try {
                        this.field_chatType = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149662M == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149663N == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149664P == hashCode) {
                    try {
                        this.field_msgType = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149665Q == hashCode) {
                    try {
                        this.field_msgCount = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149666R == hashCode) {
                    try {
                        this.field_flag = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149667S == hashCode) {
                    try {
                        this.field_atAll = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatConversation", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149668T == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149673d) {
            contentValues.put("bizChatId", Long.valueOf(this.field_bizChatId));
        }
        if (this.f149674e) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f149675f) {
            contentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
        }
        if (this.f149676g) {
            contentValues.put("newUnReadCount", Integer.valueOf(this.field_newUnReadCount));
        }
        if (this.f149677h) {
            contentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
        }
        if (this.f149678i) {
            contentValues.put("lastMsgTime", Long.valueOf(this.field_lastMsgTime));
        }
        if (this.f149679j) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f149680n) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.field_digestUser == null) {
            this.field_digestUser = "";
        }
        if (this.f149681o) {
            contentValues.put("digestUser", this.field_digestUser);
        }
        if (this.f149682p) {
            contentValues.put("atCount", Integer.valueOf(this.field_atCount));
        }
        if (this.f149683q) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        if (this.f149684r) {
            contentValues.put("chatType", Integer.valueOf(this.field_chatType));
        }
        if (this.f149685s) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f149686t) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.field_msgType == null) {
            this.field_msgType = "";
        }
        if (this.f149687u) {
            contentValues.put("msgType", this.field_msgType);
        }
        if (this.f149688v) {
            contentValues.put("msgCount", Integer.valueOf(this.field_msgCount));
        }
        if (this.f149689w) {
            contentValues.put("flag", Long.valueOf(this.field_flag));
        }
        if (this.f149690x) {
            contentValues.put("atAll", Integer.valueOf(this.field_atAll));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizChatConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizChatConversation ( " + f149669U.sql + ");");
        for (String add : f149672z) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatConversation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizChatConversation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149669U, "BizChatConversation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatConversation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizChatConversation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizChatConversation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149669U;
    }

    public String[] getIndexCreateSQL() {
        return f149672z;
    }

    public StorageObserverOwner<C53342n0> getObserverOwner() {
        return f149670V;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_bizChatId);
    }

    public SingleTable getTable() {
        return f149671y;
    }

    public String getTableName() {
        return f149671y.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("bizChatId")) {
            this.field_bizChatId = contentValues.getAsLong("bizChatId").longValue();
            if (z) {
                this.f149673d = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z) {
                this.f149674e = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z) {
                this.f149675f = true;
            }
        }
        if (contentValues.containsKey("newUnReadCount")) {
            this.field_newUnReadCount = contentValues.getAsInteger("newUnReadCount").intValue();
            if (z) {
                this.f149676g = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z) {
                this.f149677h = true;
            }
        }
        if (contentValues.containsKey("lastMsgTime")) {
            this.field_lastMsgTime = contentValues.getAsLong("lastMsgTime").longValue();
            if (z) {
                this.f149678i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f149679j = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f149680n = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.field_digestUser = contentValues.getAsString("digestUser");
            if (z) {
                this.f149681o = true;
            }
        }
        if (contentValues.containsKey("atCount")) {
            this.field_atCount = contentValues.getAsInteger("atCount").intValue();
            if (z) {
                this.f149682p = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z) {
                this.f149683q = true;
            }
        }
        if (contentValues.containsKey("chatType")) {
            this.field_chatType = contentValues.getAsInteger("chatType").intValue();
            if (z) {
                this.f149684r = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f149685s = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f149686t = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsString("msgType");
            if (z) {
                this.f149687u = true;
            }
        }
        if (contentValues.containsKey("msgCount")) {
            this.field_msgCount = contentValues.getAsInteger("msgCount").intValue();
            if (z) {
                this.f149688v = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsLong("flag").longValue();
            if (z) {
                this.f149689w = true;
            }
        }
        if (contentValues.containsKey("atAll")) {
            this.field_atAll = contentValues.getAsInteger("atAll").intValue();
            if (z) {
                this.f149690x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
