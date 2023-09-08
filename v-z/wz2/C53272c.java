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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: wz2.c */
public class C53272c extends IAutoDBItem {

    /* renamed from: A */
    public static final int f148739A = 114586;

    /* renamed from: B */
    public static final int f148740B = -1698410561;

    /* renamed from: C */
    public static final int f148741C = 859999798;

    /* renamed from: D */
    public static final int f148742D = 106748362;

    /* renamed from: E */
    public static final int f148743E = 1369213417;

    /* renamed from: F */
    public static final int f148744F = 2543030;

    /* renamed from: G */
    public static final int f148745G = -2070199160;

    /* renamed from: H */
    public static final int f148746H = 517749066;

    /* renamed from: I */
    public static final int f148747I = -7913296;

    /* renamed from: J */
    public static final int f148748J = 108705909;

    /* renamed from: K */
    public static final IAutoDBItem.MAutoDBInfo f148749K = initAutoDBInfo(C53272c.class);

    /* renamed from: L */
    public static final StorageObserverOwner<C53272c> f148750L = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f148751t;

    /* renamed from: u */
    public static final Column f148752u;

    /* renamed from: v */
    public static final String[] f148753v = {"CREATE INDEX IF NOT EXISTS TextStatusGreetingItem_sessionId_index ON TextStatusGreetingItem(session_id)"};

    /* renamed from: w */
    public static final int f148754w = 1360674492;

    /* renamed from: x */
    public static final int f148755x = 1661853540;

    /* renamed from: y */
    public static final int f148756y = -441759513;

    /* renamed from: z */
    public static final int f148757z = 4455376;

    /* renamed from: d */
    public boolean f148758d = true;

    /* renamed from: e */
    public boolean f148759e = true;

    /* renamed from: f */
    public boolean f148760f = true;
    public int field_Read;
    public int field_canChatting;
    public long field_card_key;
    public int field_createTime;
    public String field_encUsername;
    public String field_hash_username;
    public int field_modify_count;
    public long field_newMsgId;
    public String field_plain;
    public String field_session_id;
    public String field_source_id;
    public String field_status_id;
    public String field_tag;

    /* renamed from: g */
    public boolean f148761g = true;

    /* renamed from: h */
    public boolean f148762h = true;

    /* renamed from: i */
    public boolean f148763i = true;

    /* renamed from: j */
    public boolean f148764j = true;

    /* renamed from: n */
    public boolean f148765n = true;

    /* renamed from: o */
    public boolean f148766o = true;

    /* renamed from: p */
    public boolean f148767p = true;

    /* renamed from: q */
    public boolean f148768q = true;

    /* renamed from: r */
    public boolean f148769r = true;

    /* renamed from: s */
    public boolean f148770s = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusGreetingItem");
        f148751t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("newMsgId", "long", singleTable.getName(), "");
        new Column("session_id", "string", singleTable.getName(), "");
        new Column("hash_username", "string", singleTable.getName(), "");
        new Column("encUsername", "string", singleTable.getName(), "");
        new Column("tag", "string", singleTable.getName(), "");
        new Column("source_id", "string", singleTable.getName(), "");
        new Column("canChatting", "int", singleTable.getName(), "");
        new Column("plain", "string", singleTable.getName(), "");
        f148752u = new Column("createTime", "int", singleTable.getName(), "");
        new Column("Read", "int", singleTable.getName(), "");
        new Column("status_id", "string", singleTable.getName(), "");
        new Column("modify_count", "int", singleTable.getName(), "");
        new Column("card_key", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "newMsgId";
        mAutoDBInfo.colsMap.put("newMsgId", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "newMsgId";
        mAutoDBInfo.columns[1] = "session_id";
        mAutoDBInfo.colsMap.put("session_id", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "hash_username";
        mAutoDBInfo.colsMap.put("hash_username", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "encUsername";
        mAutoDBInfo.colsMap.put("encUsername", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "tag";
        mAutoDBInfo.colsMap.put("tag", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "source_id";
        mAutoDBInfo.colsMap.put("source_id", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "canChatting";
        mAutoDBInfo.colsMap.put("canChatting", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "plain";
        mAutoDBInfo.colsMap.put("plain", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[9] = "Read";
        mAutoDBInfo.colsMap.put("Read", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "status_id";
        mAutoDBInfo.colsMap.put("status_id", "TEXT default '' ");
        mAutoDBInfo.columns[11] = "modify_count";
        mAutoDBInfo.colsMap.put("modify_count", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "card_key";
        mAutoDBInfo.colsMap.put("card_key", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " newMsgId LONG default '0'  PRIMARY KEY ,  session_id TEXT default '' ,  hash_username TEXT default '' ,  encUsername TEXT default '' ,  tag TEXT default '' ,  source_id TEXT default '' ,  canChatting INTEGER default '0' ,  plain TEXT default '' ,  createTime INTEGER,  Read INTEGER default '0' ,  status_id TEXT default '' ,  modify_count INTEGER default '0' ,  card_key LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53272c)) {
            return false;
        }
        C53272c cVar = (C53272c) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_newMsgId), Long.valueOf(cVar.field_newMsgId)) && C46238a.m51546a(this.field_session_id, cVar.field_session_id) && C46238a.m51546a(this.field_hash_username, cVar.field_hash_username) && C46238a.m51546a(this.field_encUsername, cVar.field_encUsername) && C46238a.m51546a(this.field_tag, cVar.field_tag) && C46238a.m51546a(this.field_source_id, cVar.field_source_id) && C46238a.m51546a(Integer.valueOf(this.field_canChatting), Integer.valueOf(cVar.field_canChatting)) && C46238a.m51546a(this.field_plain, cVar.field_plain) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(cVar.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_Read), Integer.valueOf(cVar.field_Read)) && C46238a.m51546a(this.field_status_id, cVar.field_status_id) && C46238a.m51546a(Integer.valueOf(this.field_modify_count), Integer.valueOf(cVar.field_modify_count)) && C46238a.m51546a(Long.valueOf(this.field_card_key), Long.valueOf(cVar.field_card_key));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148754w == hashCode) {
                    try {
                        this.field_newMsgId = cursor.getLong(i);
                        this.f148758d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148755x == hashCode) {
                    try {
                        this.field_session_id = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148756y == hashCode) {
                    try {
                        this.field_hash_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148757z == hashCode) {
                    try {
                        this.field_encUsername = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148739A == hashCode) {
                    try {
                        this.field_tag = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148740B == hashCode) {
                    try {
                        this.field_source_id = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148741C == hashCode) {
                    try {
                        this.field_canChatting = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148742D == hashCode) {
                    try {
                        this.field_plain = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148743E == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148744F == hashCode) {
                    try {
                        this.field_Read = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148745G == hashCode) {
                    try {
                        this.field_status_id = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148746H == hashCode) {
                    try {
                        this.field_modify_count = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148747I == hashCode) {
                    try {
                        this.field_card_key = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusGreetingItem", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148748J == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f148758d) {
            contentValues.put("newMsgId", Long.valueOf(this.field_newMsgId));
        }
        if (this.field_session_id == null) {
            this.field_session_id = "";
        }
        if (this.f148759e) {
            contentValues.put("session_id", this.field_session_id);
        }
        if (this.field_hash_username == null) {
            this.field_hash_username = "";
        }
        if (this.f148760f) {
            contentValues.put("hash_username", this.field_hash_username);
        }
        if (this.field_encUsername == null) {
            this.field_encUsername = "";
        }
        if (this.f148761g) {
            contentValues.put("encUsername", this.field_encUsername);
        }
        if (this.field_tag == null) {
            this.field_tag = "";
        }
        if (this.f148762h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.field_source_id == null) {
            this.field_source_id = "";
        }
        if (this.f148763i) {
            contentValues.put("source_id", this.field_source_id);
        }
        if (this.f148764j) {
            contentValues.put("canChatting", Integer.valueOf(this.field_canChatting));
        }
        if (this.field_plain == null) {
            this.field_plain = "";
        }
        if (this.f148765n) {
            contentValues.put("plain", this.field_plain);
        }
        if (this.f148766o) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f148767p) {
            contentValues.put("Read", Integer.valueOf(this.field_Read));
        }
        if (this.field_status_id == null) {
            this.field_status_id = "";
        }
        if (this.f148768q) {
            contentValues.put("status_id", this.field_status_id);
        }
        if (this.f148769r) {
            contentValues.put("modify_count", Integer.valueOf(this.field_modify_count));
        }
        if (this.f148770s) {
            contentValues.put("card_key", Long.valueOf(this.field_card_key));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusGreetingItem ( " + f148749K.sql + ");");
        for (String add : f148753v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusGreetingItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148749K, "TextStatusGreetingItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusGreetingItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusGreetingItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148749K;
    }

    public String[] getIndexCreateSQL() {
        return f148753v;
    }

    public StorageObserverOwner<C53272c> getObserverOwner() {
        return f148750L;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_newMsgId);
    }

    public SingleTable getTable() {
        return f148751t;
    }

    public String getTableName() {
        return f148751t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("newMsgId")) {
            this.field_newMsgId = contentValues.getAsLong("newMsgId").longValue();
            if (z) {
                this.f148758d = true;
            }
        }
        if (contentValues.containsKey("session_id")) {
            this.field_session_id = contentValues.getAsString("session_id");
            if (z) {
                this.f148759e = true;
            }
        }
        if (contentValues.containsKey("hash_username")) {
            this.field_hash_username = contentValues.getAsString("hash_username");
            if (z) {
                this.f148760f = true;
            }
        }
        if (contentValues.containsKey("encUsername")) {
            this.field_encUsername = contentValues.getAsString("encUsername");
            if (z) {
                this.f148761g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z) {
                this.f148762h = true;
            }
        }
        if (contentValues.containsKey("source_id")) {
            this.field_source_id = contentValues.getAsString("source_id");
            if (z) {
                this.f148763i = true;
            }
        }
        if (contentValues.containsKey("canChatting")) {
            this.field_canChatting = contentValues.getAsInteger("canChatting").intValue();
            if (z) {
                this.f148764j = true;
            }
        }
        if (contentValues.containsKey("plain")) {
            this.field_plain = contentValues.getAsString("plain");
            if (z) {
                this.f148765n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f148766o = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z) {
                this.f148767p = true;
            }
        }
        if (contentValues.containsKey("status_id")) {
            this.field_status_id = contentValues.getAsString("status_id");
            if (z) {
                this.f148768q = true;
            }
        }
        if (contentValues.containsKey("modify_count")) {
            this.field_modify_count = contentValues.getAsInteger("modify_count").intValue();
            if (z) {
                this.f148769r = true;
            }
        }
        if (contentValues.containsKey("card_key")) {
            this.field_card_key = contentValues.getAsLong("card_key").longValue();
            if (z) {
                this.f148770s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
