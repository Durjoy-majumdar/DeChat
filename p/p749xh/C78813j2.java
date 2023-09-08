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

/* renamed from: xh.j2 */
public class C78813j2 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C78813j2> f230812A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f230813o;

    /* renamed from: p */
    public static final String[] f230814p = new String[0];

    /* renamed from: q */
    public static final int f230815q = 93053368;

    /* renamed from: r */
    public static final int f230816r = -1180128302;

    /* renamed from: s */
    public static final int f230817s = -881080743;

    /* renamed from: t */
    public static final int f230818t = -650394338;

    /* renamed from: u */
    public static final int f230819u = 109832170;

    /* renamed from: v */
    public static final int f230820v = 3575610;

    /* renamed from: w */
    public static final int f230821w = 1369213417;

    /* renamed from: x */
    public static final int f230822x = 723141982;

    /* renamed from: y */
    public static final int f230823y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f230824z = initAutoDBInfo(C78813j2.class);

    /* renamed from: d */
    public boolean f230825d = true;

    /* renamed from: e */
    public boolean f230826e = true;

    /* renamed from: f */
    public boolean f230827f = true;
    public String field_chatroomName;
    public long field_createTime;
    public String field_encryptTalker;
    public int field_isSend;
    public String field_msgContent;
    public long field_svrId;
    public String field_talker;
    public int field_type;

    /* renamed from: g */
    public boolean f230828g = true;

    /* renamed from: h */
    public boolean f230829h = true;

    /* renamed from: i */
    public boolean f230830i = true;

    /* renamed from: j */
    public boolean f230831j = true;

    /* renamed from: n */
    public boolean f230832n = true;

    static {
        SingleTable singleTable = new SingleTable("fmessage_msginfo");
        f230813o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgContent", "string", singleTable.getName(), "");
        new Column("isSend", "int", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("encryptTalker", "string", singleTable.getName(), "");
        new Column("svrId", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("chatroomName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgContent";
        mAutoDBInfo.colsMap.put("msgContent", "TEXT default '' ");
        mAutoDBInfo.columns[1] = "isSend";
        mAutoDBInfo.colsMap.put("isSend", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "encryptTalker";
        mAutoDBInfo.colsMap.put("encryptTalker", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "svrId";
        mAutoDBInfo.colsMap.put("svrId", "LONG default '0' ");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "chatroomName";
        mAutoDBInfo.colsMap.put("chatroomName", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " msgContent TEXT default '' ,  isSend INTEGER default '0' ,  talker TEXT default '' ,  encryptTalker TEXT default '' ,  svrId LONG default '0' ,  type INTEGER default '0' ,  createTime LONG default '0' ,  chatroomName TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78813j2)) {
            return false;
        }
        C78813j2 j2Var = (C78813j2) iAutoDBItem;
        return C46238a.m51546a(this.field_msgContent, j2Var.field_msgContent) && C46238a.m51546a(Integer.valueOf(this.field_isSend), Integer.valueOf(j2Var.field_isSend)) && C46238a.m51546a(this.field_talker, j2Var.field_talker) && C46238a.m51546a(this.field_encryptTalker, j2Var.field_encryptTalker) && C46238a.m51546a(Long.valueOf(this.field_svrId), Long.valueOf(j2Var.field_svrId)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(j2Var.field_type)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(j2Var.field_createTime)) && C46238a.m51546a(this.field_chatroomName, j2Var.field_chatroomName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230815q == hashCode) {
                    try {
                        this.field_msgContent = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230816r == hashCode) {
                    try {
                        this.field_isSend = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230817s == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230818t == hashCode) {
                    try {
                        this.field_encryptTalker = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230819u == hashCode) {
                    try {
                        this.field_svrId = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230820v == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230821w == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230822x == hashCode) {
                    try {
                        this.field_chatroomName = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFMessageMsgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230823y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_msgContent == null) {
            this.field_msgContent = "";
        }
        if (this.f230825d) {
            contentValues.put("msgContent", this.field_msgContent);
        }
        if (this.f230826e) {
            contentValues.put("isSend", Integer.valueOf(this.field_isSend));
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f230827f) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_encryptTalker == null) {
            this.field_encryptTalker = "";
        }
        if (this.f230828g) {
            contentValues.put("encryptTalker", this.field_encryptTalker);
        }
        if (this.f230829h) {
            contentValues.put("svrId", Long.valueOf(this.field_svrId));
        }
        if (this.f230830i) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f230831j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.field_chatroomName == null) {
            this.field_chatroomName = "";
        }
        if (this.f230832n) {
            contentValues.put("chatroomName", this.field_chatroomName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS fmessage_msginfo ( " + f230824z.sql + ");");
        for (String add : f230814p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("fmessage_msginfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230824z, "fmessage_msginfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFMessageMsgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("fmessage_msginfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230824z;
    }

    public String[] getIndexCreateSQL() {
        return f230814p;
    }

    public StorageObserverOwner<C78813j2> getObserverOwner() {
        return f230812A;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f230813o;
    }

    public String getTableName() {
        return f230813o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgContent")) {
            this.field_msgContent = contentValues.getAsString("msgContent");
            if (z) {
                this.f230825d = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z) {
                this.f230826e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f230827f = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.field_encryptTalker = contentValues.getAsString("encryptTalker");
            if (z) {
                this.f230828g = true;
            }
        }
        if (contentValues.containsKey("svrId")) {
            this.field_svrId = contentValues.getAsLong("svrId").longValue();
            if (z) {
                this.f230829h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f230830i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f230831j = true;
            }
        }
        if (contentValues.containsKey("chatroomName")) {
            this.field_chatroomName = contentValues.getAsString("chatroomName");
            if (z) {
                this.f230832n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
