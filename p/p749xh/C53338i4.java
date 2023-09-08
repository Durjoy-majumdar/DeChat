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

/* renamed from: xh.i4 */
public class C53338i4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149432A = 221370742;

    /* renamed from: B */
    public static final int f149433B = -1731317047;

    /* renamed from: C */
    public static final int f149434C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f149435D = initAutoDBInfo(C53338i4.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C53338i4> f149436E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f149437q;

    /* renamed from: r */
    public static final String[] f149438r = {"CREATE INDEX IF NOT EXISTS GameLifeConversation_sessionId_index ON GameLifeConversation(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_talker_index ON GameLifeConversation(talker)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_selfUserName_index ON GameLifeConversation(selfUserName)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_updateTime_index ON GameLifeConversation(updateTime)"};

    /* renamed from: s */
    public static final int f149439s = 607796817;

    /* renamed from: t */
    public static final int f149440t = -881080743;

    /* renamed from: u */
    public static final int f149441u = 1228743778;

    /* renamed from: v */
    public static final int f149442v = 932971136;

    /* renamed from: w */
    public static final int f149443w = -295931082;

    /* renamed from: x */
    public static final int f149444x = -1331913276;

    /* renamed from: y */
    public static final int f149445y = 1996652390;

    /* renamed from: z */
    public static final int f149446z = -1309569200;

    /* renamed from: d */
    public boolean f149447d = true;

    /* renamed from: e */
    public boolean f149448e = true;

    /* renamed from: f */
    public boolean f149449f = true;
    public String field_digest;
    public long field_digestFlag;
    public String field_digestPrefix;
    public String field_editingMsg;
    public long field_lastMsgID;
    public String field_selfUserName;
    public String field_sessionId;
    public String field_talker;
    public int field_unReadCount;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f149450g = true;

    /* renamed from: h */
    public boolean f149451h = true;

    /* renamed from: i */
    public boolean f149452i = true;

    /* renamed from: j */
    public boolean f149453j = true;

    /* renamed from: n */
    public boolean f149454n = true;

    /* renamed from: o */
    public boolean f149455o = true;

    /* renamed from: p */
    public boolean f149456p = true;

    static {
        SingleTable singleTable = new SingleTable("GameLifeConversation");
        f149437q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("selfUserName", "string", singleTable.getName(), "");
        new Column("unReadCount", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("digest", "string", singleTable.getName(), "");
        new Column("lastMsgID", "long", singleTable.getName(), "");
        new Column("digestFlag", "long", singleTable.getName(), "");
        new Column("digestPrefix", "string", singleTable.getName(), "");
        new Column("editingMsg", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "sessionId";
        mAutoDBInfo.colsMap.put("sessionId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "sessionId";
        mAutoDBInfo.columns[1] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "selfUserName";
        mAutoDBInfo.colsMap.put("selfUserName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "unReadCount";
        mAutoDBInfo.colsMap.put("unReadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[5] = "digest";
        mAutoDBInfo.colsMap.put("digest", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "lastMsgID";
        mAutoDBInfo.colsMap.put("lastMsgID", "LONG");
        mAutoDBInfo.columns[7] = "digestFlag";
        mAutoDBInfo.colsMap.put("digestFlag", "LONG default '0' ");
        mAutoDBInfo.columns[8] = "digestPrefix";
        mAutoDBInfo.colsMap.put("digestPrefix", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "editingMsg";
        mAutoDBInfo.colsMap.put("editingMsg", "TEXT default '' ");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  unReadCount INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  lastMsgID LONG,  digestFlag LONG default '0' ,  digestPrefix TEXT default '' ,  editingMsg TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53338i4)) {
            return false;
        }
        C53338i4 i4Var = (C53338i4) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, i4Var.field_sessionId) && C46238a.m51546a(this.field_talker, i4Var.field_talker) && C46238a.m51546a(this.field_selfUserName, i4Var.field_selfUserName) && C46238a.m51546a(Integer.valueOf(this.field_unReadCount), Integer.valueOf(i4Var.field_unReadCount)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(i4Var.field_updateTime)) && C46238a.m51546a(this.field_digest, i4Var.field_digest) && C46238a.m51546a(Long.valueOf(this.field_lastMsgID), Long.valueOf(i4Var.field_lastMsgID)) && C46238a.m51546a(Long.valueOf(this.field_digestFlag), Long.valueOf(i4Var.field_digestFlag)) && C46238a.m51546a(this.field_digestPrefix, i4Var.field_digestPrefix) && C46238a.m51546a(this.field_editingMsg, i4Var.field_editingMsg);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149439s == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f149447d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149440t == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149441u == hashCode) {
                    try {
                        this.field_selfUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149442v == hashCode) {
                    try {
                        this.field_unReadCount = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149443w == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149444x == hashCode) {
                    try {
                        this.field_digest = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149445y == hashCode) {
                    try {
                        this.field_lastMsgID = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149446z == hashCode) {
                    try {
                        this.field_digestFlag = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149432A == hashCode) {
                    try {
                        this.field_digestPrefix = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149433B == hashCode) {
                    try {
                        this.field_editingMsg = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeConversation", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149434C == hashCode) {
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
        if (this.f149447d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f149448e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f149449f) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f149450g) {
            contentValues.put("unReadCount", Integer.valueOf(this.field_unReadCount));
        }
        if (this.f149451h) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.field_digest == null) {
            this.field_digest = "";
        }
        if (this.f149452i) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.f149453j) {
            contentValues.put("lastMsgID", Long.valueOf(this.field_lastMsgID));
        }
        if (this.f149454n) {
            contentValues.put("digestFlag", Long.valueOf(this.field_digestFlag));
        }
        if (this.field_digestPrefix == null) {
            this.field_digestPrefix = "";
        }
        if (this.f149455o) {
            contentValues.put("digestPrefix", this.field_digestPrefix);
        }
        if (this.field_editingMsg == null) {
            this.field_editingMsg = "";
        }
        if (this.f149456p) {
            contentValues.put("editingMsg", this.field_editingMsg);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameLifeConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameLifeConversation ( " + f149435D.sql + ");");
        for (String add : f149438r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeConversation", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameLifeConversation", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149435D, "GameLifeConversation", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeConversation", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameLifeConversation", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameLifeConversation", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149435D;
    }

    public String[] getIndexCreateSQL() {
        return f149438r;
    }

    public StorageObserverOwner<C53338i4> getObserverOwner() {
        return f149436E;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f149437q;
    }

    public String getTableName() {
        return f149437q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f149447d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f149448e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z) {
                this.f149449f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.field_unReadCount = contentValues.getAsInteger("unReadCount").intValue();
            if (z) {
                this.f149450g = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f149451h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z) {
                this.f149452i = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.field_lastMsgID = contentValues.getAsLong("lastMsgID").longValue();
            if (z) {
                this.f149453j = true;
            }
        }
        if (contentValues.containsKey("digestFlag")) {
            this.field_digestFlag = contentValues.getAsLong("digestFlag").longValue();
            if (z) {
                this.f149454n = true;
            }
        }
        if (contentValues.containsKey("digestPrefix")) {
            this.field_digestPrefix = contentValues.getAsString("digestPrefix");
            if (z) {
                this.f149455o = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.field_editingMsg = contentValues.getAsString("editingMsg");
            if (z) {
                this.f149456p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
