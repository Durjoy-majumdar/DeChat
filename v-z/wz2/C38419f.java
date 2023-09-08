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
import p749xh.C66261f3;

/* renamed from: wz2.f */
public class C38419f extends IAutoDBItem {

    /* renamed from: A */
    public static final int f101339A = 1667659339;

    /* renamed from: B */
    public static final int f101340B = 1667748389;

    /* renamed from: C */
    public static final int f101341C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f101342D = initAutoDBInfo(C38419f.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C38419f> f101343E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f101344q;

    /* renamed from: r */
    public static final String[] f101345r = {"CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_sessionId_index ON TextStatusSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_talker_index ON TextStatusSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_selfUsername_index ON TextStatusSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_type_index ON TextStatusSessionInfo(type)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_senderUserName_index ON TextStatusSessionInfo(senderUserName)"};

    /* renamed from: s */
    public static final int f101346s = 607796817;

    /* renamed from: t */
    public static final int f101347t = -881080743;

    /* renamed from: u */
    public static final int f101348u = -295931082;

    /* renamed from: v */
    public static final int f101349v = 1229697090;

    /* renamed from: w */
    public static final int f101350w = 3575610;

    /* renamed from: x */
    public static final int f101351x = 211768485;

    /* renamed from: y */
    public static final int f101352y = -1683545246;

    /* renamed from: z */
    public static final int f101353z = -740052271;

    /* renamed from: d */
    public boolean f101354d = true;

    /* renamed from: e */
    public boolean f101355e = true;

    /* renamed from: f */
    public boolean f101356f = true;
    public int field_actionPermission;
    public int field_disableSendMsg;
    public int field_rejectMsg;
    public String field_selfUsername;
    public int field_senderRoleType;
    public String field_senderUserName;
    public String field_sessionId;
    public String field_talker;
    public int field_type;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f101357g = true;

    /* renamed from: h */
    public boolean f101358h = true;

    /* renamed from: i */
    public boolean f101359i = true;

    /* renamed from: j */
    public boolean f101360j = true;

    /* renamed from: n */
    public boolean f101361n = true;

    /* renamed from: o */
    public boolean f101362o = true;

    /* renamed from: p */
    public boolean f101363p = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusSessionInfo");
        f101344q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("selfUsername", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("actionPermission", "int", singleTable.getName(), "");
        new Column("rejectMsg", "int", singleTable.getName(), "");
        new Column("disableSendMsg", "int", singleTable.getName(), "");
        new Column("senderUserName", "string", singleTable.getName(), "");
        new Column("senderRoleType", "int", singleTable.getName(), "");
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
        mAutoDBInfo.columns[2] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[3] = "selfUsername";
        mAutoDBInfo.colsMap.put("selfUsername", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[5] = "actionPermission";
        mAutoDBInfo.colsMap.put("actionPermission", "INTEGER");
        mAutoDBInfo.columns[6] = "rejectMsg";
        mAutoDBInfo.colsMap.put("rejectMsg", "INTEGER");
        mAutoDBInfo.columns[7] = "disableSendMsg";
        mAutoDBInfo.colsMap.put("disableSendMsg", "INTEGER");
        mAutoDBInfo.columns[8] = "senderUserName";
        mAutoDBInfo.colsMap.put("senderUserName", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "senderRoleType";
        mAutoDBInfo.colsMap.put("senderRoleType", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38419f)) {
            return false;
        }
        C38419f fVar = (C38419f) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, fVar.field_sessionId) && C46238a.m51546a(this.field_talker, fVar.field_talker) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(fVar.field_updateTime)) && C46238a.m51546a(this.field_selfUsername, fVar.field_selfUsername) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(fVar.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_actionPermission), Integer.valueOf(fVar.field_actionPermission)) && C46238a.m51546a(Integer.valueOf(this.field_rejectMsg), Integer.valueOf(fVar.field_rejectMsg)) && C46238a.m51546a(Integer.valueOf(this.field_disableSendMsg), Integer.valueOf(fVar.field_disableSendMsg)) && C46238a.m51546a(this.field_senderUserName, fVar.field_senderUserName) && C46238a.m51546a(Integer.valueOf(this.field_senderRoleType), Integer.valueOf(fVar.field_senderRoleType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101346s == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f101354d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101347t == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101348u == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101349v == hashCode) {
                    try {
                        this.field_selfUsername = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101350w == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101351x == hashCode) {
                    try {
                        this.field_actionPermission = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101352y == hashCode) {
                    try {
                        this.field_rejectMsg = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101353z == hashCode) {
                    try {
                        this.field_disableSendMsg = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101339A == hashCode) {
                    try {
                        this.field_senderUserName = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101340B == hashCode) {
                    try {
                        this.field_senderRoleType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusSessionInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101341C == hashCode) {
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
        if (this.f101354d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f101355e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f101356f) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.field_selfUsername == null) {
            this.field_selfUsername = "";
        }
        if (this.f101357g) {
            contentValues.put("selfUsername", this.field_selfUsername);
        }
        if (this.f101358h) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f101359i) {
            contentValues.put("actionPermission", Integer.valueOf(this.field_actionPermission));
        }
        if (this.f101360j) {
            contentValues.put("rejectMsg", Integer.valueOf(this.field_rejectMsg));
        }
        if (this.f101361n) {
            contentValues.put("disableSendMsg", Integer.valueOf(this.field_disableSendMsg));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f101362o) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f101363p) {
            contentValues.put("senderRoleType", Integer.valueOf(this.field_senderRoleType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusSessionInfo ( " + f101342D.sql + ");");
        for (String add : f101345r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusSessionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101342D, "TextStatusSessionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusSessionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusSessionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101342D;
    }

    public String[] getIndexCreateSQL() {
        return f101345r;
    }

    public StorageObserverOwner<C38419f> getObserverOwner() {
        return f101343E;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f101344q;
    }

    public String getTableName() {
        return f101344q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f101354d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f101355e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f101356f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.field_selfUsername = contentValues.getAsString("selfUsername");
            if (z) {
                this.f101357g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f101358h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z) {
                this.f101359i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.field_rejectMsg = contentValues.getAsInteger("rejectMsg").intValue();
            if (z) {
                this.f101360j = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.field_disableSendMsg = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z) {
                this.f101361n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z) {
                this.f101362o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z) {
                this.f101363p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
