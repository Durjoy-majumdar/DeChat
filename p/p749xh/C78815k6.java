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

/* renamed from: xh.k6 */
public class C78815k6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f230872A = 109757585;

    /* renamed from: B */
    public static final int f230873B = 1108625689;

    /* renamed from: C */
    public static final int f230874C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f230875D = initAutoDBInfo(C78815k6.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C78815k6> f230876E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f230877q;

    /* renamed from: r */
    public static final String[] f230878r = new String[0];

    /* renamed from: s */
    public static final int f230879s = 303207897;

    /* renamed from: t */
    public static final int f230880t = 293428218;

    /* renamed from: u */
    public static final int f230881u = -925319338;

    /* renamed from: v */
    public static final int f230882v = 1379873668;

    /* renamed from: w */
    public static final int f230883w = 1385647428;

    /* renamed from: x */
    public static final int f230884x = -500140257;

    /* renamed from: y */
    public static final int f230885y = 1358063253;

    /* renamed from: z */
    public static final int f230886z = 1369213417;

    /* renamed from: d */
    public boolean f230887d = true;

    /* renamed from: e */
    public boolean f230888e = true;

    /* renamed from: f */
    public boolean f230889f = true;
    public long field_createTime;
    public String field_groupId;
    public long field_ilinkRoomId;
    public String field_inviteUserName;
    public int field_memberCount;
    public int field_roomId;
    public long field_roomKey;
    public int field_routeId;
    public int field_state;
    public String field_wxGroupId;

    /* renamed from: g */
    public boolean f230890g = true;

    /* renamed from: h */
    public boolean f230891h = true;

    /* renamed from: i */
    public boolean f230892i = true;

    /* renamed from: j */
    public boolean f230893j = true;

    /* renamed from: n */
    public boolean f230894n = true;

    /* renamed from: o */
    public boolean f230895o = true;

    /* renamed from: p */
    public boolean f230896p = true;

    static {
        SingleTable singleTable = new SingleTable("MultiTalkInfo");
        f230877q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("wxGroupId", "string", singleTable.getName(), "");
        new Column("groupId", "string", singleTable.getName(), "");
        new Column("roomId", "int", singleTable.getName(), "");
        new Column("roomKey", "long", singleTable.getName(), "");
        new Column("routeId", "int", singleTable.getName(), "");
        new Column("inviteUserName", "string", singleTable.getName(), "");
        new Column("memberCount", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("ilinkRoomId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "wxGroupId";
        mAutoDBInfo.colsMap.put("wxGroupId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "wxGroupId";
        mAutoDBInfo.columns[1] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "TEXT");
        mAutoDBInfo.columns[2] = "roomId";
        mAutoDBInfo.colsMap.put("roomId", "INTEGER");
        mAutoDBInfo.columns[3] = "roomKey";
        mAutoDBInfo.colsMap.put("roomKey", "LONG");
        mAutoDBInfo.columns[4] = "routeId";
        mAutoDBInfo.colsMap.put("routeId", "INTEGER");
        mAutoDBInfo.columns[5] = "inviteUserName";
        mAutoDBInfo.colsMap.put("inviteUserName", "TEXT");
        mAutoDBInfo.columns[6] = "memberCount";
        mAutoDBInfo.colsMap.put("memberCount", "INTEGER");
        mAutoDBInfo.columns[7] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[8] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "ilinkRoomId";
        mAutoDBInfo.colsMap.put("ilinkRoomId", "LONG");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " wxGroupId TEXT PRIMARY KEY ,  groupId TEXT,  roomId INTEGER,  roomKey LONG,  routeId INTEGER,  inviteUserName TEXT,  memberCount INTEGER,  createTime LONG,  state INTEGER default '0' ,  ilinkRoomId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78815k6)) {
            return false;
        }
        C78815k6 k6Var = (C78815k6) iAutoDBItem;
        return C46238a.m51546a(this.field_wxGroupId, k6Var.field_wxGroupId) && C46238a.m51546a(this.field_groupId, k6Var.field_groupId) && C46238a.m51546a(Integer.valueOf(this.field_roomId), Integer.valueOf(k6Var.field_roomId)) && C46238a.m51546a(Long.valueOf(this.field_roomKey), Long.valueOf(k6Var.field_roomKey)) && C46238a.m51546a(Integer.valueOf(this.field_routeId), Integer.valueOf(k6Var.field_routeId)) && C46238a.m51546a(this.field_inviteUserName, k6Var.field_inviteUserName) && C46238a.m51546a(Integer.valueOf(this.field_memberCount), Integer.valueOf(k6Var.field_memberCount)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(k6Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(k6Var.field_state)) && C46238a.m51546a(Long.valueOf(this.field_ilinkRoomId), Long.valueOf(k6Var.field_ilinkRoomId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f230879s == hashCode) {
                    try {
                        this.field_wxGroupId = cursor.getString(i);
                        this.f230887d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230880t == hashCode) {
                    try {
                        this.field_groupId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230881u == hashCode) {
                    try {
                        this.field_roomId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230882v == hashCode) {
                    try {
                        this.field_roomKey = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230883w == hashCode) {
                    try {
                        this.field_routeId = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230884x == hashCode) {
                    try {
                        this.field_inviteUserName = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230885y == hashCode) {
                    try {
                        this.field_memberCount = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230886z == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230872A == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230873B == hashCode) {
                    try {
                        this.field_ilinkRoomId = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f230874C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f230887d) {
            contentValues.put("wxGroupId", this.field_wxGroupId);
        }
        if (this.f230888e) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f230889f) {
            contentValues.put("roomId", Integer.valueOf(this.field_roomId));
        }
        if (this.f230890g) {
            contentValues.put("roomKey", Long.valueOf(this.field_roomKey));
        }
        if (this.f230891h) {
            contentValues.put("routeId", Integer.valueOf(this.field_routeId));
        }
        if (this.f230892i) {
            contentValues.put("inviteUserName", this.field_inviteUserName);
        }
        if (this.f230893j) {
            contentValues.put("memberCount", Integer.valueOf(this.field_memberCount));
        }
        if (this.f230894n) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f230895o) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f230896p) {
            contentValues.put("ilinkRoomId", Long.valueOf(this.field_ilinkRoomId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMultiTalkInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MultiTalkInfo ( " + f230875D.sql + ");");
        for (String add : f230878r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTalkInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MultiTalkInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f230875D, "MultiTalkInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTalkInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MultiTalkInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMultiTalkInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f230875D;
    }

    public String[] getIndexCreateSQL() {
        return f230878r;
    }

    public StorageObserverOwner<C78815k6> getObserverOwner() {
        return f230876E;
    }

    public Object getPrimaryKeyValue() {
        return this.field_wxGroupId;
    }

    public SingleTable getTable() {
        return f230877q;
    }

    public String getTableName() {
        return f230877q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("wxGroupId")) {
            this.field_wxGroupId = contentValues.getAsString("wxGroupId");
            if (z) {
                this.f230887d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z) {
                this.f230888e = true;
            }
        }
        if (contentValues.containsKey("roomId")) {
            this.field_roomId = contentValues.getAsInteger("roomId").intValue();
            if (z) {
                this.f230889f = true;
            }
        }
        if (contentValues.containsKey("roomKey")) {
            this.field_roomKey = contentValues.getAsLong("roomKey").longValue();
            if (z) {
                this.f230890g = true;
            }
        }
        if (contentValues.containsKey("routeId")) {
            this.field_routeId = contentValues.getAsInteger("routeId").intValue();
            if (z) {
                this.f230891h = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.field_inviteUserName = contentValues.getAsString("inviteUserName");
            if (z) {
                this.f230892i = true;
            }
        }
        if (contentValues.containsKey("memberCount")) {
            this.field_memberCount = contentValues.getAsInteger("memberCount").intValue();
            if (z) {
                this.f230893j = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f230894n = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f230895o = true;
            }
        }
        if (contentValues.containsKey("ilinkRoomId")) {
            this.field_ilinkRoomId = contentValues.getAsLong("ilinkRoomId").longValue();
            if (z) {
                this.f230896p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
