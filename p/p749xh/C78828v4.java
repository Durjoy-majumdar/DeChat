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

/* renamed from: xh.v4 */
public class C78828v4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231483A = -177455188;

    /* renamed from: B */
    public static final int f231484B = -1294411543;

    /* renamed from: C */
    public static final int f231485C = -1422950650;

    /* renamed from: D */
    public static final int f231486D = -2041905623;

    /* renamed from: E */
    public static final int f231487E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f231488F = initAutoDBInfo(C78828v4.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C78828v4> f231489G = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f231490p;

    /* renamed from: q */
    public static final Column f231491q;

    /* renamed from: r */
    public static final Column f231492r;

    /* renamed from: s */
    public static final Column f231493s;

    /* renamed from: t */
    public static final Column f231494t;

    /* renamed from: u */
    public static final String[] f231495u = new String[0];

    /* renamed from: v */
    public static final int f231496v = -265713450;

    /* renamed from: w */
    public static final int f231497w = 106079;

    /* renamed from: x */
    public static final int f231498x = 951530617;

    /* renamed from: y */
    public static final int f231499y = 1028554796;

    /* renamed from: z */
    public static final int f231500z = 109446;

    /* renamed from: d */
    public boolean f231501d = true;

    /* renamed from: e */
    public boolean f231502e = true;

    /* renamed from: f */
    public boolean f231503f = true;
    public int field_active;
    public String field_content;
    public String field_creator;
    public long field_firstMsgId;
    public String field_key;
    public long field_lastActiveTime;
    public long field_msgSvrId;
    public int field_num;
    public String field_username;

    /* renamed from: g */
    public boolean f231504g = true;

    /* renamed from: h */
    public boolean f231505h = true;

    /* renamed from: i */
    public boolean f231506i = true;

    /* renamed from: j */
    public boolean f231507j = true;

    /* renamed from: n */
    public boolean f231508n = true;

    /* renamed from: o */
    public boolean f231509o = true;

    static {
        SingleTable singleTable = new SingleTable("GroupSolitatire");
        f231490p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f231491q = new Column("username", "string", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        f231492r = new Column("creator", "string", singleTable.getName(), "");
        new Column("num", "int", singleTable.getName(), "");
        new Column("firstMsgId", "long", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        f231493s = new Column("active", "int", singleTable.getName(), "");
        f231494t = new Column("lastActiveTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT");
        mAutoDBInfo.columns[2] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[3] = "creator";
        mAutoDBInfo.colsMap.put("creator", "TEXT");
        mAutoDBInfo.columns[4] = "num";
        mAutoDBInfo.colsMap.put("num", "INTEGER");
        mAutoDBInfo.columns[5] = "firstMsgId";
        mAutoDBInfo.colsMap.put("firstMsgId", "LONG");
        mAutoDBInfo.columns[6] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[7] = "active";
        mAutoDBInfo.colsMap.put("active", "INTEGER default '-1' ");
        mAutoDBInfo.columns[8] = "lastActiveTime";
        mAutoDBInfo.colsMap.put("lastActiveTime", "LONG");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  key TEXT,  content TEXT,  creator TEXT,  num INTEGER,  firstMsgId LONG,  msgSvrId LONG,  active INTEGER default '-1' ,  lastActiveTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78828v4)) {
            return false;
        }
        C78828v4 v4Var = (C78828v4) iAutoDBItem;
        return C46238a.m51546a(this.field_username, v4Var.field_username) && C46238a.m51546a(this.field_key, v4Var.field_key) && C46238a.m51546a(this.field_content, v4Var.field_content) && C46238a.m51546a(this.field_creator, v4Var.field_creator) && C46238a.m51546a(Integer.valueOf(this.field_num), Integer.valueOf(v4Var.field_num)) && C46238a.m51546a(Long.valueOf(this.field_firstMsgId), Long.valueOf(v4Var.field_firstMsgId)) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(v4Var.field_msgSvrId)) && C46238a.m51546a(Integer.valueOf(this.field_active), Integer.valueOf(v4Var.field_active)) && C46238a.m51546a(Long.valueOf(this.field_lastActiveTime), Long.valueOf(v4Var.field_lastActiveTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231496v == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231497w == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231498x == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231499y == hashCode) {
                    try {
                        this.field_creator = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231500z == hashCode) {
                    try {
                        this.field_num = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231483A == hashCode) {
                    try {
                        this.field_firstMsgId = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231484B == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231485C == hashCode) {
                    try {
                        this.field_active = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231486D == hashCode) {
                    try {
                        this.field_lastActiveTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231487E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231501d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f231502e) {
            contentValues.put("key", this.field_key);
        }
        if (this.f231503f) {
            contentValues.put("content", this.field_content);
        }
        if (this.f231504g) {
            contentValues.put("creator", this.field_creator);
        }
        if (this.f231505h) {
            contentValues.put("num", Integer.valueOf(this.field_num));
        }
        if (this.f231506i) {
            contentValues.put("firstMsgId", Long.valueOf(this.field_firstMsgId));
        }
        if (this.f231507j) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f231508n) {
            contentValues.put("active", Integer.valueOf(this.field_active));
        }
        if (this.f231509o) {
            contentValues.put("lastActiveTime", Long.valueOf(this.field_lastActiveTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGroupSolitatire", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GroupSolitatire ( " + f231488F.sql + ");");
        for (String add : f231495u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGroupSolitatire", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GroupSolitatire", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231488F, "GroupSolitatire", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGroupSolitatire", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GroupSolitatire", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGroupSolitatire", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231488F;
    }

    public String[] getIndexCreateSQL() {
        return f231495u;
    }

    public StorageObserverOwner<C78828v4> getObserverOwner() {
        return f231489G;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231490p;
    }

    public String getTableName() {
        return f231490p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f231501d = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f231502e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f231503f = true;
            }
        }
        if (contentValues.containsKey("creator")) {
            this.field_creator = contentValues.getAsString("creator");
            if (z) {
                this.f231504g = true;
            }
        }
        if (contentValues.containsKey("num")) {
            this.field_num = contentValues.getAsInteger("num").intValue();
            if (z) {
                this.f231505h = true;
            }
        }
        if (contentValues.containsKey("firstMsgId")) {
            this.field_firstMsgId = contentValues.getAsLong("firstMsgId").longValue();
            if (z) {
                this.f231506i = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f231507j = true;
            }
        }
        if (contentValues.containsKey("active")) {
            this.field_active = contentValues.getAsInteger("active").intValue();
            if (z) {
                this.f231508n = true;
            }
        }
        if (contentValues.containsKey("lastActiveTime")) {
            this.field_lastActiveTime = contentValues.getAsLong("lastActiveTime").longValue();
            if (z) {
                this.f231509o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
