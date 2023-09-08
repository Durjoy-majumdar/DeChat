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

/* renamed from: xh.x3 */
public class C38697x3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f104214A = -1683545246;

    /* renamed from: B */
    public static final int f104215B = -740052271;

    /* renamed from: C */
    public static final int f104216C = 1667659339;

    /* renamed from: D */
    public static final int f104217D = 1667748389;

    /* renamed from: E */
    public static final int f104218E = -2027458883;

    /* renamed from: F */
    public static final int f104219F = 108705909;

    /* renamed from: G */
    public static final IAutoDBItem.MAutoDBInfo f104220G = initAutoDBInfo(C38697x3.class);

    /* renamed from: H */
    public static final StorageObserverOwner<C38697x3> f104221H = new StorageObserverOwner<>();

    /* renamed from: r */
    public static final SingleTable f104222r;

    /* renamed from: s */
    public static final Column f104223s;

    /* renamed from: t */
    public static final String[] f104224t = {"CREATE INDEX IF NOT EXISTS FinderSessionInfo_sessionId_index ON FinderSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_talker_index ON FinderSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_selfUsername_index ON FinderSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_type_index ON FinderSessionInfo(type)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_senderUserName_index ON FinderSessionInfo(senderUserName)"};

    /* renamed from: u */
    public static final int f104225u = 607796817;

    /* renamed from: v */
    public static final int f104226v = -881080743;

    /* renamed from: w */
    public static final int f104227w = -295931082;

    /* renamed from: x */
    public static final int f104228x = 1229697090;

    /* renamed from: y */
    public static final int f104229y = 3575610;

    /* renamed from: z */
    public static final int f104230z = 211768485;

    /* renamed from: d */
    public boolean f104231d = true;

    /* renamed from: e */
    public boolean f104232e = true;

    /* renamed from: f */
    public boolean f104233f = true;
    public int field_actionPermission;
    public int field_disableSendMsg;
    public int field_followFlag;
    public int field_rejectMsg;
    public String field_selfUsername;
    public int field_senderRoleType;
    public String field_senderUserName;
    public String field_sessionId;
    public String field_talker;
    public int field_type;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f104234g = true;

    /* renamed from: h */
    public boolean f104235h = true;

    /* renamed from: i */
    public boolean f104236i = true;

    /* renamed from: j */
    public boolean f104237j = true;

    /* renamed from: n */
    public boolean f104238n = true;

    /* renamed from: o */
    public boolean f104239o = true;

    /* renamed from: p */
    public boolean f104240p = true;

    /* renamed from: q */
    public boolean f104241q = true;

    static {
        SingleTable singleTable = new SingleTable("FinderSessionInfo");
        f104222r = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        f104223s = new Column("selfUsername", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("actionPermission", "int", singleTable.getName(), "");
        new Column("rejectMsg", "int", singleTable.getName(), "");
        new Column("disableSendMsg", "int", singleTable.getName(), "");
        new Column("senderUserName", "string", singleTable.getName(), "");
        new Column("senderRoleType", "int", singleTable.getName(), "");
        new Column("followFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[11];
        String[] strArr = new String[12];
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
        mAutoDBInfo.columns[10] = "followFlag";
        mAutoDBInfo.colsMap.put("followFlag", "INTEGER");
        mAutoDBInfo.columns[11] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  followFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38697x3)) {
            return false;
        }
        C38697x3 x3Var = (C38697x3) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, x3Var.field_sessionId) && C46238a.m51546a(this.field_talker, x3Var.field_talker) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(x3Var.field_updateTime)) && C46238a.m51546a(this.field_selfUsername, x3Var.field_selfUsername) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(x3Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_actionPermission), Integer.valueOf(x3Var.field_actionPermission)) && C46238a.m51546a(Integer.valueOf(this.field_rejectMsg), Integer.valueOf(x3Var.field_rejectMsg)) && C46238a.m51546a(Integer.valueOf(this.field_disableSendMsg), Integer.valueOf(x3Var.field_disableSendMsg)) && C46238a.m51546a(this.field_senderUserName, x3Var.field_senderUserName) && C46238a.m51546a(Integer.valueOf(this.field_senderRoleType), Integer.valueOf(x3Var.field_senderRoleType)) && C46238a.m51546a(Integer.valueOf(this.field_followFlag), Integer.valueOf(x3Var.field_followFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104225u == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f104231d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104226v == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104227w == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104228x == hashCode) {
                    try {
                        this.field_selfUsername = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104229y == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104230z == hashCode) {
                    try {
                        this.field_actionPermission = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104214A == hashCode) {
                    try {
                        this.field_rejectMsg = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104215B == hashCode) {
                    try {
                        this.field_disableSendMsg = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104216C == hashCode) {
                    try {
                        this.field_senderUserName = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104217D == hashCode) {
                    try {
                        this.field_senderRoleType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104218E == hashCode) {
                    try {
                        this.field_followFlag = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSessionInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104219F == hashCode) {
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
        if (this.f104231d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f104232e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f104233f) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.field_selfUsername == null) {
            this.field_selfUsername = "";
        }
        if (this.f104234g) {
            contentValues.put("selfUsername", this.field_selfUsername);
        }
        if (this.f104235h) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f104236i) {
            contentValues.put("actionPermission", Integer.valueOf(this.field_actionPermission));
        }
        if (this.f104237j) {
            contentValues.put("rejectMsg", Integer.valueOf(this.field_rejectMsg));
        }
        if (this.f104238n) {
            contentValues.put("disableSendMsg", Integer.valueOf(this.field_disableSendMsg));
        }
        if (this.field_senderUserName == null) {
            this.field_senderUserName = "";
        }
        if (this.f104239o) {
            contentValues.put("senderUserName", this.field_senderUserName);
        }
        if (this.f104240p) {
            contentValues.put("senderRoleType", Integer.valueOf(this.field_senderRoleType));
        }
        if (this.f104241q) {
            contentValues.put("followFlag", Integer.valueOf(this.field_followFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderSessionInfo ( " + f104220G.sql + ");");
        for (String add : f104224t) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderSessionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderSessionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104220G, "FinderSessionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderSessionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderSessionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderSessionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104220G;
    }

    public String[] getIndexCreateSQL() {
        return f104224t;
    }

    public StorageObserverOwner<C38697x3> getObserverOwner() {
        return f104221H;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f104222r;
    }

    public String getTableName() {
        return f104222r.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f104231d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f104232e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f104233f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.field_selfUsername = contentValues.getAsString("selfUsername");
            if (z) {
                this.f104234g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f104235h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.field_actionPermission = contentValues.getAsInteger("actionPermission").intValue();
            if (z) {
                this.f104236i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.field_rejectMsg = contentValues.getAsInteger("rejectMsg").intValue();
            if (z) {
                this.f104237j = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.field_disableSendMsg = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z) {
                this.f104238n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.field_senderUserName = contentValues.getAsString("senderUserName");
            if (z) {
                this.f104239o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.field_senderRoleType = contentValues.getAsInteger("senderRoleType").intValue();
            if (z) {
                this.f104240p = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.field_followFlag = contentValues.getAsInteger("followFlag").intValue();
            if (z) {
                this.f104241q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
