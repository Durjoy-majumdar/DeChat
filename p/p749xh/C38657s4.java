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

/* renamed from: xh.s4 */
public class C38657s4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103583A = 951530617;

    /* renamed from: B */
    public static final int f103584B = -1478387972;

    /* renamed from: C */
    public static final int f103585C = -1065033442;

    /* renamed from: D */
    public static final int f103586D = 3145580;

    /* renamed from: E */
    public static final int f103587E = 2022955529;

    /* renamed from: F */
    public static final int f103588F = 2022955530;

    /* renamed from: G */
    public static final int f103589G = 2022955531;

    /* renamed from: H */
    public static final int f103590H = 2022955532;

    /* renamed from: I */
    public static final int f103591I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f103592J = initAutoDBInfo(C38657s4.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C38657s4> f103593K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f103594t;

    /* renamed from: u */
    public static final String[] f103595u = new String[0];

    /* renamed from: v */
    public static final int f103596v = 1718931556;

    /* renamed from: w */
    public static final int f103597w = 1360674492;

    /* renamed from: x */
    public static final int f103598x = 1603284672;

    /* renamed from: y */
    public static final int f103599y = -286735215;

    /* renamed from: z */
    public static final int f103600z = 1369213417;

    /* renamed from: d */
    public boolean f103601d = true;

    /* renamed from: e */
    public boolean f103602e = true;

    /* renamed from: f */
    public boolean f103603f = true;
    public String field_content;
    public long field_createTime;
    public int field_flag;
    public String field_fromUserName;
    public int field_msgSeq;
    public String field_msgSource;
    public long field_newMsgId;
    public long field_originSvrId;
    public int field_reserved1;
    public long field_reserved2;
    public String field_reserved3;
    public String field_reserved4;
    public String field_toUserName;

    /* renamed from: g */
    public boolean f103604g = true;

    /* renamed from: h */
    public boolean f103605h = true;

    /* renamed from: i */
    public boolean f103606i = true;

    /* renamed from: j */
    public boolean f103607j = true;

    /* renamed from: n */
    public boolean f103608n = true;

    /* renamed from: o */
    public boolean f103609o = true;

    /* renamed from: p */
    public boolean f103610p = true;

    /* renamed from: q */
    public boolean f103611q = true;

    /* renamed from: r */
    public boolean f103612r = true;

    /* renamed from: s */
    public boolean f103613s = true;

    static {
        SingleTable singleTable = new SingleTable("GetSysCmdMsgInfo");
        f103594t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("originSvrId", "long", singleTable.getName(), "");
        new Column("newMsgId", "long", singleTable.getName(), "");
        new Column("fromUserName", "string", singleTable.getName(), "");
        new Column("toUserName", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("msgSource", "string", singleTable.getName(), "");
        new Column("msgSeq", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("reserved1", "int", singleTable.getName(), "");
        new Column("reserved2", "long", singleTable.getName(), "");
        new Column("reserved3", "string", singleTable.getName(), "");
        new Column("reserved4", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "originSvrId";
        mAutoDBInfo.colsMap.put("originSvrId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "originSvrId";
        mAutoDBInfo.columns[1] = "newMsgId";
        mAutoDBInfo.colsMap.put("newMsgId", "LONG");
        mAutoDBInfo.columns[2] = "fromUserName";
        mAutoDBInfo.colsMap.put("fromUserName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "toUserName";
        mAutoDBInfo.colsMap.put("toUserName", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "msgSource";
        mAutoDBInfo.colsMap.put("msgSource", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "msgSeq";
        mAutoDBInfo.colsMap.put("msgSeq", "INTEGER");
        mAutoDBInfo.columns[8] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[9] = "reserved1";
        mAutoDBInfo.colsMap.put("reserved1", "INTEGER");
        mAutoDBInfo.columns[10] = "reserved2";
        mAutoDBInfo.colsMap.put("reserved2", "LONG");
        mAutoDBInfo.columns[11] = "reserved3";
        mAutoDBInfo.colsMap.put("reserved3", "TEXT default '' ");
        mAutoDBInfo.columns[12] = "reserved4";
        mAutoDBInfo.colsMap.put("reserved4", "TEXT default '' ");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " originSvrId LONG PRIMARY KEY ,  newMsgId LONG,  fromUserName TEXT default '' ,  toUserName TEXT default '' ,  createTime LONG default '0' ,  content TEXT default '' ,  msgSource TEXT default '' ,  msgSeq INTEGER,  flag INTEGER,  reserved1 INTEGER,  reserved2 LONG,  reserved3 TEXT default '' ,  reserved4 TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38657s4)) {
            return false;
        }
        C38657s4 s4Var = (C38657s4) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_originSvrId), Long.valueOf(s4Var.field_originSvrId)) && C46238a.m51546a(Long.valueOf(this.field_newMsgId), Long.valueOf(s4Var.field_newMsgId)) && C46238a.m51546a(this.field_fromUserName, s4Var.field_fromUserName) && C46238a.m51546a(this.field_toUserName, s4Var.field_toUserName) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(s4Var.field_createTime)) && C46238a.m51546a(this.field_content, s4Var.field_content) && C46238a.m51546a(this.field_msgSource, s4Var.field_msgSource) && C46238a.m51546a(Integer.valueOf(this.field_msgSeq), Integer.valueOf(s4Var.field_msgSeq)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(s4Var.field_flag)) && C46238a.m51546a(Integer.valueOf(this.field_reserved1), Integer.valueOf(s4Var.field_reserved1)) && C46238a.m51546a(Long.valueOf(this.field_reserved2), Long.valueOf(s4Var.field_reserved2)) && C46238a.m51546a(this.field_reserved3, s4Var.field_reserved3) && C46238a.m51546a(this.field_reserved4, s4Var.field_reserved4);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103596v == hashCode) {
                    try {
                        this.field_originSvrId = cursor.getLong(i);
                        this.f103601d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103597w == hashCode) {
                    try {
                        this.field_newMsgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103598x == hashCode) {
                    try {
                        this.field_fromUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103599y == hashCode) {
                    try {
                        this.field_toUserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103600z == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103583A == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103584B == hashCode) {
                    try {
                        this.field_msgSource = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103585C == hashCode) {
                    try {
                        this.field_msgSeq = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103586D == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103587E == hashCode) {
                    try {
                        this.field_reserved1 = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103588F == hashCode) {
                    try {
                        this.field_reserved2 = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103589G == hashCode) {
                    try {
                        this.field_reserved3 = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103590H == hashCode) {
                    try {
                        this.field_reserved4 = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103591I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103601d) {
            contentValues.put("originSvrId", Long.valueOf(this.field_originSvrId));
        }
        if (this.f103602e) {
            contentValues.put("newMsgId", Long.valueOf(this.field_newMsgId));
        }
        if (this.field_fromUserName == null) {
            this.field_fromUserName = "";
        }
        if (this.f103603f) {
            contentValues.put("fromUserName", this.field_fromUserName);
        }
        if (this.field_toUserName == null) {
            this.field_toUserName = "";
        }
        if (this.f103604g) {
            contentValues.put("toUserName", this.field_toUserName);
        }
        if (this.f103605h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f103606i) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_msgSource == null) {
            this.field_msgSource = "";
        }
        if (this.f103607j) {
            contentValues.put("msgSource", this.field_msgSource);
        }
        if (this.f103608n) {
            contentValues.put("msgSeq", Integer.valueOf(this.field_msgSeq));
        }
        if (this.f103609o) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f103610p) {
            contentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
        }
        if (this.f103611q) {
            contentValues.put("reserved2", Long.valueOf(this.field_reserved2));
        }
        if (this.field_reserved3 == null) {
            this.field_reserved3 = "";
        }
        if (this.f103612r) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if (this.field_reserved4 == null) {
            this.field_reserved4 = "";
        }
        if (this.f103613s) {
            contentValues.put("reserved4", this.field_reserved4);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GetSysCmdMsgInfo ( " + f103592J.sql + ");");
        for (String add : f103595u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GetSysCmdMsgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103592J, "GetSysCmdMsgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GetSysCmdMsgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103592J;
    }

    public String[] getIndexCreateSQL() {
        return f103595u;
    }

    public StorageObserverOwner<C38657s4> getObserverOwner() {
        return f103593K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_originSvrId);
    }

    public SingleTable getTable() {
        return f103594t;
    }

    public String getTableName() {
        return f103594t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("originSvrId")) {
            this.field_originSvrId = contentValues.getAsLong("originSvrId").longValue();
            if (z) {
                this.f103601d = true;
            }
        }
        if (contentValues.containsKey("newMsgId")) {
            this.field_newMsgId = contentValues.getAsLong("newMsgId").longValue();
            if (z) {
                this.f103602e = true;
            }
        }
        if (contentValues.containsKey("fromUserName")) {
            this.field_fromUserName = contentValues.getAsString("fromUserName");
            if (z) {
                this.f103603f = true;
            }
        }
        if (contentValues.containsKey("toUserName")) {
            this.field_toUserName = contentValues.getAsString("toUserName");
            if (z) {
                this.f103604g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f103605h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f103606i = true;
            }
        }
        if (contentValues.containsKey("msgSource")) {
            this.field_msgSource = contentValues.getAsString("msgSource");
            if (z) {
                this.f103607j = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.field_msgSeq = contentValues.getAsInteger("msgSeq").intValue();
            if (z) {
                this.f103608n = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f103609o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsInteger("reserved1").intValue();
            if (z) {
                this.f103610p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsLong("reserved2").longValue();
            if (z) {
                this.f103611q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsString("reserved3");
            if (z) {
                this.f103612r = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.field_reserved4 = contentValues.getAsString("reserved4");
            if (z) {
                this.f103613s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
