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

/* renamed from: xh.x0 */
public class C102676x0 extends IAutoDBItem {

    /* renamed from: A */
    public static final Column f303108A;

    /* renamed from: B */
    public static final Column f303109B;

    /* renamed from: C */
    public static final Column f303110C;

    /* renamed from: D */
    public static final String[] f303111D = {"CREATE INDEX IF NOT EXISTS CreateTimeIndex ON C2CPreDownloadDBInfo(CreateTime)", "CREATE INDEX IF NOT EXISTS ClickTimeIndex ON C2CPreDownloadDBInfo(ClickTime)"};

    /* renamed from: E */
    public static final int f303112E = 243423823;

    /* renamed from: F */
    public static final int f303113F = 74638428;

    /* renamed from: G */
    public static final int f303114G = -1179978059;

    /* renamed from: H */
    public static final int f303115H = -1286563269;

    /* renamed from: I */
    public static final int f303116I = -1808614382;

    /* renamed from: J */
    public static final int f303117J = -785269679;

    /* renamed from: K */
    public static final int f303118K = 1617567615;

    /* renamed from: L */
    public static final int f303119L = -1997150681;

    /* renamed from: M */
    public static final int f303120M = -2023906641;

    /* renamed from: N */
    public static final int f303121N = -1100816956;

    /* renamed from: P */
    public static final int f303122P = 456713486;

    /* renamed from: Q */
    public static final int f303123Q = -932289015;

    /* renamed from: R */
    public static final int f303124R = 38905941;

    /* renamed from: S */
    public static final int f303125S = 1706538988;

    /* renamed from: T */
    public static final int f303126T = 108705909;

    /* renamed from: U */
    public static final IAutoDBItem.MAutoDBInfo f303127U = initAutoDBInfo(C102676x0.class);

    /* renamed from: V */
    public static final StorageObserverOwner<C102676x0> f303128V = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f303129u;

    /* renamed from: v */
    public static final Column f303130v;

    /* renamed from: w */
    public static final Column f303131w;

    /* renamed from: x */
    public static final Column f303132x;

    /* renamed from: y */
    public static final Column f303133y;

    /* renamed from: z */
    public static final Column f303134z;

    /* renamed from: d */
    public boolean f303135d = false;

    /* renamed from: e */
    public boolean f303136e = false;

    /* renamed from: f */
    public boolean f303137f = false;
    private long field_ClickTime = 0;
    private int field_ClientPriority = 0;
    private long field_CreateTime = 0;
    private int field_DownloadNow = 0;
    private String field_FromUser = "";
    private int field_IsGroupMsg = 0;
    private long field_LastLen = 0;
    private long field_MsgId = 0;
    private String field_MsgItemId = "";
    private int field_MsgType = 0;
    private int field_Priority = 0;
    private int field_ServerPriority = 0;
    private int field_Status = 0;
    private long field_TotalLen = 0;

    /* renamed from: g */
    public boolean f303138g = false;

    /* renamed from: h */
    public boolean f303139h = false;

    /* renamed from: i */
    public boolean f303140i = false;

    /* renamed from: j */
    public boolean f303141j = false;

    /* renamed from: n */
    public boolean f303142n = false;

    /* renamed from: o */
    public boolean f303143o = false;

    /* renamed from: p */
    public boolean f303144p = false;

    /* renamed from: q */
    public boolean f303145q = false;

    /* renamed from: r */
    public boolean f303146r = false;

    /* renamed from: s */
    public boolean f303147s = false;

    /* renamed from: t */
    public boolean f303148t = false;

    static {
        SingleTable singleTable = new SingleTable("C2CPreDownloadDBInfo");
        f303129u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f303130v = new Column("MsgItemId", "string", singleTable.getName(), "");
        f303131w = new Column("MsgId", "long", singleTable.getName(), "");
        f303132x = new Column("FromUser", "string", singleTable.getName(), "");
        new Column("MsgType", "int", singleTable.getName(), "");
        f303133y = new Column("Status", "int", singleTable.getName(), "");
        new Column("TotalLen", "long", singleTable.getName(), "");
        f303134z = new Column("LastLen", "long", singleTable.getName(), "");
        new Column("ServerPriority", "int", singleTable.getName(), "");
        new Column("ClientPriority", "int", singleTable.getName(), "");
        f303108A = new Column("Priority", "int", singleTable.getName(), "");
        f303109B = new Column("DownloadNow", "int", singleTable.getName(), "");
        f303110C = new Column("CreateTime", "long", singleTable.getName(), "");
        new Column("ClickTime", "long", singleTable.getName(), "");
        new Column("IsGroupMsg", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "MsgItemId";
        mAutoDBInfo.colsMap.put("MsgItemId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "MsgItemId";
        mAutoDBInfo.columns[1] = "MsgId";
        mAutoDBInfo.colsMap.put("MsgId", "LONG default '0' ");
        mAutoDBInfo.columns[2] = "FromUser";
        mAutoDBInfo.colsMap.put("FromUser", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "MsgType";
        mAutoDBInfo.colsMap.put("MsgType", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "Status";
        mAutoDBInfo.colsMap.put("Status", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "TotalLen";
        mAutoDBInfo.colsMap.put("TotalLen", "LONG default '0' ");
        mAutoDBInfo.columns[6] = "LastLen";
        mAutoDBInfo.colsMap.put("LastLen", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "ServerPriority";
        mAutoDBInfo.colsMap.put("ServerPriority", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "ClientPriority";
        mAutoDBInfo.colsMap.put("ClientPriority", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "Priority";
        mAutoDBInfo.colsMap.put("Priority", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "DownloadNow";
        mAutoDBInfo.colsMap.put("DownloadNow", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "CreateTime";
        mAutoDBInfo.colsMap.put("CreateTime", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "ClickTime";
        mAutoDBInfo.colsMap.put("ClickTime", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "IsGroupMsg";
        mAutoDBInfo.colsMap.put("IsGroupMsg", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " MsgItemId TEXT PRIMARY KEY ,  MsgId LONG default '0' ,  FromUser TEXT default '' ,  MsgType INTEGER default '0' ,  Status INTEGER default '0' ,  TotalLen LONG default '0' ,  LastLen LONG default '0' ,  ServerPriority INTEGER default '0' ,  ClientPriority INTEGER default '0' ,  Priority INTEGER default '0' ,  DownloadNow INTEGER default '0' ,  CreateTime LONG default '0' ,  ClickTime LONG default '0' ,  IsGroupMsg INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: A2 */
    public void mo142458A2(String str) {
        this.field_FromUser = str;
        this.f303137f = true;
    }

    /* renamed from: B2 */
    public void mo142459B2(int i) {
        this.field_IsGroupMsg = i;
        this.f303148t = true;
    }

    /* renamed from: C2 */
    public void mo142460C2(long j) {
        this.field_LastLen = j;
        this.f303141j = true;
    }

    /* renamed from: D2 */
    public void mo142461D2(String str) {
        this.field_MsgItemId = str;
        this.f303135d = true;
    }

    /* renamed from: E2 */
    public void mo142462E2(int i) {
        this.field_MsgType = i;
        this.f303138g = true;
    }

    /* renamed from: F2 */
    public void mo142463F2(int i) {
        this.field_Priority = i;
        this.f303144p = true;
    }

    /* renamed from: G2 */
    public void mo142464G2(int i) {
        this.field_ServerPriority = i;
        this.f303142n = true;
    }

    /* renamed from: H2 */
    public void mo142465H2(long j) {
        this.field_TotalLen = j;
        this.f303140i = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102676x0)) {
            return false;
        }
        C102676x0 x0Var = (C102676x0) iAutoDBItem;
        return C46238a.m51546a(this.field_MsgItemId, x0Var.field_MsgItemId) && C46238a.m51546a(Long.valueOf(this.field_MsgId), Long.valueOf(x0Var.field_MsgId)) && C46238a.m51546a(this.field_FromUser, x0Var.field_FromUser) && C46238a.m51546a(Integer.valueOf(this.field_MsgType), Integer.valueOf(x0Var.field_MsgType)) && C46238a.m51546a(Integer.valueOf(this.field_Status), Integer.valueOf(x0Var.field_Status)) && C46238a.m51546a(Long.valueOf(this.field_TotalLen), Long.valueOf(x0Var.field_TotalLen)) && C46238a.m51546a(Long.valueOf(this.field_LastLen), Long.valueOf(x0Var.field_LastLen)) && C46238a.m51546a(Integer.valueOf(this.field_ServerPriority), Integer.valueOf(x0Var.field_ServerPriority)) && C46238a.m51546a(Integer.valueOf(this.field_ClientPriority), Integer.valueOf(x0Var.field_ClientPriority)) && C46238a.m51546a(Integer.valueOf(this.field_Priority), Integer.valueOf(x0Var.field_Priority)) && C46238a.m51546a(Integer.valueOf(this.field_DownloadNow), Integer.valueOf(x0Var.field_DownloadNow)) && C46238a.m51546a(Long.valueOf(this.field_CreateTime), Long.valueOf(x0Var.field_CreateTime)) && C46238a.m51546a(Long.valueOf(this.field_ClickTime), Long.valueOf(x0Var.field_ClickTime)) && C46238a.m51546a(Integer.valueOf(this.field_IsGroupMsg), Integer.valueOf(x0Var.field_IsGroupMsg));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f303112E == hashCode) {
                    try {
                        this.field_MsgItemId = cursor.getString(i);
                        this.f303135d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303113F == hashCode) {
                    try {
                        this.field_MsgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303114G == hashCode) {
                    try {
                        this.field_FromUser = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303115H == hashCode) {
                    try {
                        this.field_MsgType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303116I == hashCode) {
                    try {
                        this.field_Status = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303117J == hashCode) {
                    try {
                        this.field_TotalLen = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303118K == hashCode) {
                    try {
                        this.field_LastLen = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303119L == hashCode) {
                    try {
                        this.field_ServerPriority = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303120M == hashCode) {
                    try {
                        this.field_ClientPriority = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303121N == hashCode) {
                    try {
                        this.field_Priority = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303122P == hashCode) {
                    try {
                        this.field_DownloadNow = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303123Q == hashCode) {
                    try {
                        this.field_CreateTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303124R == hashCode) {
                    try {
                        this.field_ClickTime = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303125S == hashCode) {
                    try {
                        this.field_IsGroupMsg = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f303126T == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f303135d) {
            contentValues.put("MsgItemId", this.field_MsgItemId);
        }
        if (this.f303136e) {
            contentValues.put("MsgId", Long.valueOf(this.field_MsgId));
        }
        if (this.field_FromUser == null) {
            this.field_FromUser = "";
        }
        if (this.f303137f) {
            contentValues.put("FromUser", this.field_FromUser);
        }
        if (this.f303138g) {
            contentValues.put("MsgType", Integer.valueOf(this.field_MsgType));
        }
        if (this.f303139h) {
            contentValues.put("Status", Integer.valueOf(this.field_Status));
        }
        if (this.f303140i) {
            contentValues.put("TotalLen", Long.valueOf(this.field_TotalLen));
        }
        if (this.f303141j) {
            contentValues.put("LastLen", Long.valueOf(this.field_LastLen));
        }
        if (this.f303142n) {
            contentValues.put("ServerPriority", Integer.valueOf(this.field_ServerPriority));
        }
        if (this.f303143o) {
            contentValues.put("ClientPriority", Integer.valueOf(this.field_ClientPriority));
        }
        if (this.f303144p) {
            contentValues.put("Priority", Integer.valueOf(this.field_Priority));
        }
        if (this.f303145q) {
            contentValues.put("DownloadNow", Integer.valueOf(this.field_DownloadNow));
        }
        if (this.f303146r) {
            contentValues.put("CreateTime", Long.valueOf(this.field_CreateTime));
        }
        if (this.f303147s) {
            contentValues.put("ClickTime", Long.valueOf(this.field_ClickTime));
        }
        if (this.f303148t) {
            contentValues.put("IsGroupMsg", Integer.valueOf(this.field_IsGroupMsg));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS C2CPreDownloadDBInfo ( " + f303127U.sql + ");");
        for (String add : f303111D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("C2CPreDownloadDBInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f303127U, "C2CPreDownloadDBInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("C2CPreDownloadDBInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: d */
    public void mo142466d(int i) {
        this.field_Status = i;
        this.f303139h = true;
    }

    public long getCreateTime() {
        return this.field_CreateTime;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f303127U;
    }

    public String[] getIndexCreateSQL() {
        return f303111D;
    }

    public long getMsgId() {
        return this.field_MsgId;
    }

    public StorageObserverOwner<C102676x0> getObserverOwner() {
        return f303128V;
    }

    public Object getPrimaryKeyValue() {
        return this.field_MsgItemId;
    }

    public int getStatus() {
        return this.field_Status;
    }

    public SingleTable getTable() {
        return f303129u;
    }

    public String getTableName() {
        return f303129u.getName();
    }

    /* renamed from: l2 */
    public long mo142470l2() {
        return this.field_ClickTime;
    }

    /* renamed from: m2 */
    public int mo142471m2() {
        return this.field_ClientPriority;
    }

    /* renamed from: n2 */
    public int mo142472n2() {
        return this.field_DownloadNow;
    }

    /* renamed from: o2 */
    public String mo142473o2() {
        return this.field_FromUser;
    }

    /* renamed from: p2 */
    public int mo142474p2() {
        return this.field_IsGroupMsg;
    }

    /* renamed from: q2 */
    public long mo142475q2() {
        return this.field_LastLen;
    }

    /* renamed from: r2 */
    public String mo142476r2() {
        return this.field_MsgItemId;
    }

    /* renamed from: s2 */
    public int mo142477s2() {
        return this.field_MsgType;
    }

    public void setMsgId(long j) {
        this.field_MsgId = j;
        this.f303136e = true;
    }

    /* renamed from: t2 */
    public int mo142479t2() {
        return this.field_Priority;
    }

    /* renamed from: u2 */
    public int mo142480u2() {
        return this.field_ServerPriority;
    }

    /* renamed from: v2 */
    public long mo142481v2() {
        return this.field_TotalLen;
    }

    /* renamed from: w2 */
    public void mo142482w2(long j) {
        this.field_ClickTime = j;
        this.f303147s = true;
    }

    /* renamed from: x2 */
    public void mo142483x2(int i) {
        this.field_ClientPriority = i;
        this.f303143o = true;
    }

    /* renamed from: y2 */
    public void mo142484y2(long j) {
        this.field_CreateTime = j;
        this.f303146r = true;
    }

    /* renamed from: z2 */
    public void mo142485z2(int i) {
        this.field_DownloadNow = i;
        this.f303145q = true;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("MsgItemId")) {
            this.field_MsgItemId = contentValues.getAsString("MsgItemId");
            if (z) {
                this.f303135d = true;
            }
        }
        if (contentValues.containsKey("MsgId")) {
            this.field_MsgId = contentValues.getAsLong("MsgId").longValue();
            if (z) {
                this.f303136e = true;
            }
        }
        if (contentValues.containsKey("FromUser")) {
            this.field_FromUser = contentValues.getAsString("FromUser");
            if (z) {
                this.f303137f = true;
            }
        }
        if (contentValues.containsKey("MsgType")) {
            this.field_MsgType = contentValues.getAsInteger("MsgType").intValue();
            if (z) {
                this.f303138g = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.field_Status = contentValues.getAsInteger("Status").intValue();
            if (z) {
                this.f303139h = true;
            }
        }
        if (contentValues.containsKey("TotalLen")) {
            this.field_TotalLen = contentValues.getAsLong("TotalLen").longValue();
            if (z) {
                this.f303140i = true;
            }
        }
        if (contentValues.containsKey("LastLen")) {
            this.field_LastLen = contentValues.getAsLong("LastLen").longValue();
            if (z) {
                this.f303141j = true;
            }
        }
        if (contentValues.containsKey("ServerPriority")) {
            this.field_ServerPriority = contentValues.getAsInteger("ServerPriority").intValue();
            if (z) {
                this.f303142n = true;
            }
        }
        if (contentValues.containsKey("ClientPriority")) {
            this.field_ClientPriority = contentValues.getAsInteger("ClientPriority").intValue();
            if (z) {
                this.f303143o = true;
            }
        }
        if (contentValues.containsKey("Priority")) {
            this.field_Priority = contentValues.getAsInteger("Priority").intValue();
            if (z) {
                this.f303144p = true;
            }
        }
        if (contentValues.containsKey("DownloadNow")) {
            this.field_DownloadNow = contentValues.getAsInteger("DownloadNow").intValue();
            if (z) {
                this.f303145q = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsLong("CreateTime").longValue();
            if (z) {
                this.f303146r = true;
            }
        }
        if (contentValues.containsKey("ClickTime")) {
            this.field_ClickTime = contentValues.getAsLong("ClickTime").longValue();
            if (z) {
                this.f303147s = true;
            }
        }
        if (contentValues.containsKey("IsGroupMsg")) {
            this.field_IsGroupMsg = contentValues.getAsInteger("IsGroupMsg").intValue();
            if (z) {
                this.f303148t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
