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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import p788aj.C67054d;

/* renamed from: xh.f1 */
public class C78807f1 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f230598j;

    /* renamed from: n */
    public static final String[] f230599n = new String[0];

    /* renamed from: o */
    public static final int f230600o = -265713450;

    /* renamed from: p */
    public static final int f230601p = 1664358255;

    /* renamed from: q */
    public static final int f230602q = 180332970;

    /* renamed from: r */
    public static final int f230603r = -617571111;

    /* renamed from: s */
    public static final int f230604s = 230826558;

    /* renamed from: t */
    public static final int f230605t = -1293914820;

    /* renamed from: u */
    public static final int f230606u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f230607v = initAutoDBInfo(C78807f1.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C78807f1> f230608w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f230609d = true;

    /* renamed from: e */
    public boolean f230610e = true;

    /* renamed from: f */
    public boolean f230611f = true;
    public long field_lastLocalCreateTime;
    public long field_lastLocalSeq;
    public long field_lastPushCreateTime;
    public long field_lastPushSeq;
    public C67054d field_seqBlockInfo;
    public String field_username;

    /* renamed from: g */
    public boolean f230612g = true;

    /* renamed from: h */
    public boolean f230613h = true;

    /* renamed from: i */
    public boolean f230614i = true;

    static {
        SingleTable singleTable = new SingleTable("ChatroomMsgSeq");
        f230598j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("lastPushSeq", "long", singleTable.getName(), "");
        new Column("lastLocalSeq", "long", singleTable.getName(), "");
        new Column("lastPushCreateTime", "long", singleTable.getName(), "");
        new Column("lastLocalCreateTime", "long", singleTable.getName(), "");
        new Column("seqBlockInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.clientproto.chatroom.protobuf.SeqBlockInfo");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "lastPushSeq";
        mAutoDBInfo.colsMap.put("lastPushSeq", "LONG");
        mAutoDBInfo.columns[2] = "lastLocalSeq";
        mAutoDBInfo.colsMap.put("lastLocalSeq", "LONG");
        mAutoDBInfo.columns[3] = "lastPushCreateTime";
        mAutoDBInfo.colsMap.put("lastPushCreateTime", "LONG");
        mAutoDBInfo.columns[4] = "lastLocalCreateTime";
        mAutoDBInfo.colsMap.put("lastLocalCreateTime", "LONG");
        mAutoDBInfo.columns[5] = "seqBlockInfo";
        mAutoDBInfo.colsMap.put("seqBlockInfo", "BLOB");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  lastPushSeq LONG,  lastLocalSeq LONG,  lastPushCreateTime LONG,  lastLocalCreateTime LONG,  seqBlockInfo BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78807f1)) {
            return false;
        }
        C78807f1 f1Var = (C78807f1) iAutoDBItem;
        return C46238a.m51546a(this.field_username, f1Var.field_username) && C46238a.m51546a(Long.valueOf(this.field_lastPushSeq), Long.valueOf(f1Var.field_lastPushSeq)) && C46238a.m51546a(Long.valueOf(this.field_lastLocalSeq), Long.valueOf(f1Var.field_lastLocalSeq)) && C46238a.m51546a(Long.valueOf(this.field_lastPushCreateTime), Long.valueOf(f1Var.field_lastPushCreateTime)) && C46238a.m51546a(Long.valueOf(this.field_lastLocalCreateTime), Long.valueOf(f1Var.field_lastLocalCreateTime)) && C46238a.m51546a(this.field_seqBlockInfo, f1Var.field_seqBlockInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230600o == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f230609d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230601p == hashCode) {
                    try {
                        this.field_lastPushSeq = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230602q == hashCode) {
                    try {
                        this.field_lastLocalSeq = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230603r == hashCode) {
                    try {
                        this.field_lastPushCreateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230604s == hashCode) {
                    try {
                        this.field_lastLocalCreateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230605t == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_seqBlockInfo = (C67054d) new C67054d().parseFrom(blob);
                        }
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230606u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C67054d dVar;
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f230609d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f230610e) {
            contentValues.put("lastPushSeq", Long.valueOf(this.field_lastPushSeq));
        }
        if (this.f230611f) {
            contentValues.put("lastLocalSeq", Long.valueOf(this.field_lastLocalSeq));
        }
        if (this.f230612g) {
            contentValues.put("lastPushCreateTime", Long.valueOf(this.field_lastPushCreateTime));
        }
        if (this.f230613h) {
            contentValues.put("lastLocalCreateTime", Long.valueOf(this.field_lastLocalCreateTime));
        }
        if (this.f230614i && (dVar = this.field_seqBlockInfo) != null) {
            try {
                contentValues.put("seqBlockInfo", dVar.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseChatroomMsgSeq", e.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ChatroomMsgSeq ( " + f230607v.sql + ");");
        for (String add : f230599n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ChatroomMsgSeq", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230607v, "ChatroomMsgSeq", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseChatroomMsgSeq", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ChatroomMsgSeq", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230607v;
    }

    public String[] getIndexCreateSQL() {
        return f230599n;
    }

    public StorageObserverOwner<C78807f1> getObserverOwner() {
        return f230608w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f230598j;
    }

    public String getTableName() {
        return f230598j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f230609d = true;
            }
        }
        if (contentValues.containsKey("lastPushSeq")) {
            this.field_lastPushSeq = contentValues.getAsLong("lastPushSeq").longValue();
            if (z) {
                this.f230610e = true;
            }
        }
        if (contentValues.containsKey("lastLocalSeq")) {
            this.field_lastLocalSeq = contentValues.getAsLong("lastLocalSeq").longValue();
            if (z) {
                this.f230611f = true;
            }
        }
        if (contentValues.containsKey("lastPushCreateTime")) {
            this.field_lastPushCreateTime = contentValues.getAsLong("lastPushCreateTime").longValue();
            if (z) {
                this.f230612g = true;
            }
        }
        if (contentValues.containsKey("lastLocalCreateTime")) {
            this.field_lastLocalCreateTime = contentValues.getAsLong("lastLocalCreateTime").longValue();
            if (z) {
                this.f230613h = true;
            }
        }
        if (contentValues.containsKey("seqBlockInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("seqBlockInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_seqBlockInfo = (C67054d) new C67054d().parseFrom(asByteArray);
                    if (z) {
                        this.f230614i = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseChatroomMsgSeq", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
