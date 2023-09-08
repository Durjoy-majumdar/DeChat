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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.q0 */
public class C53346q0 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149788A = -103570919;

    /* renamed from: B */
    public static final int f149789B = 1204310228;

    /* renamed from: C */
    public static final int f149790C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f149791D = initAutoDBInfo(C53346q0.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C53346q0> f149792E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f149793q;

    /* renamed from: r */
    public static final String[] f149794r = new String[0];

    /* renamed from: s */
    public static final int f149795s = -836030906;

    /* renamed from: t */
    public static final int f149796t = -266666762;

    /* renamed from: u */
    public static final int f149797u = 1431282047;

    /* renamed from: v */
    public static final int f149798v = -64277091;

    /* renamed from: w */
    public static final int f149799w = 1717610093;

    /* renamed from: x */
    public static final int f149800x = -178249254;

    /* renamed from: y */
    public static final int f149801y = 697480212;

    /* renamed from: z */
    public static final int f149802z = -1102645498;

    /* renamed from: d */
    public boolean f149803d = true;

    /* renamed from: e */
    public boolean f149804e = true;

    /* renamed from: f */
    public boolean f149805f = true;
    public int field_UserVersion;
    public String field_addMemberUrl;
    public int field_bitFlag;
    public String field_brandUserName;
    public String field_headImageUrl;
    public boolean field_needToUpdate;
    public String field_profileUrl;
    public String field_userId;
    public String field_userName;
    public String field_userNamePY;

    /* renamed from: g */
    public boolean f149806g = true;

    /* renamed from: h */
    public boolean f149807h = true;

    /* renamed from: i */
    public boolean f149808i = true;

    /* renamed from: j */
    public boolean f149809j = true;

    /* renamed from: n */
    public boolean f149810n = true;

    /* renamed from: o */
    public boolean f149811o = true;

    /* renamed from: p */
    public boolean f149812p = true;

    static {
        SingleTable singleTable = new SingleTable("BizChatUserInfo");
        f149793q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userId", "string", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("userNamePY", "string", singleTable.getName(), "");
        new Column("brandUserName", "string", singleTable.getName(), "");
        new Column("UserVersion", "int", singleTable.getName(), "");
        new Column("needToUpdate", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("headImageUrl", "string", singleTable.getName(), "");
        new Column("profileUrl", "string", singleTable.getName(), "");
        new Column("bitFlag", "int", singleTable.getName(), "");
        new Column("addMemberUrl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userId";
        mAutoDBInfo.colsMap.put("userId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userId";
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "userNamePY";
        mAutoDBInfo.colsMap.put("userNamePY", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "brandUserName";
        mAutoDBInfo.colsMap.put("brandUserName", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "UserVersion";
        mAutoDBInfo.colsMap.put("UserVersion", "INTEGER default '-1' ");
        mAutoDBInfo.columns[5] = "needToUpdate";
        mAutoDBInfo.colsMap.put("needToUpdate", "INTEGER default 'true' ");
        mAutoDBInfo.columns[6] = "headImageUrl";
        mAutoDBInfo.colsMap.put("headImageUrl", "TEXT");
        mAutoDBInfo.columns[7] = "profileUrl";
        mAutoDBInfo.colsMap.put("profileUrl", "TEXT");
        mAutoDBInfo.columns[8] = "bitFlag";
        mAutoDBInfo.colsMap.put("bitFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "addMemberUrl";
        mAutoDBInfo.colsMap.put("addMemberUrl", "TEXT");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " userId TEXT PRIMARY KEY ,  userName TEXT default '' ,  userNamePY TEXT default '' ,  brandUserName TEXT default '' ,  UserVersion INTEGER default '-1' ,  needToUpdate INTEGER default 'true' ,  headImageUrl TEXT,  profileUrl TEXT,  bitFlag INTEGER default '0' ,  addMemberUrl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53346q0)) {
            return false;
        }
        C53346q0 q0Var = (C53346q0) iAutoDBItem;
        return C46238a.m51546a(this.field_userId, q0Var.field_userId) && C46238a.m51546a(this.field_userName, q0Var.field_userName) && C46238a.m51546a(this.field_userNamePY, q0Var.field_userNamePY) && C46238a.m51546a(this.field_brandUserName, q0Var.field_brandUserName) && C46238a.m51546a(Integer.valueOf(this.field_UserVersion), Integer.valueOf(q0Var.field_UserVersion)) && C46238a.m51546a(Boolean.valueOf(this.field_needToUpdate), Boolean.valueOf(q0Var.field_needToUpdate)) && C46238a.m51546a(this.field_headImageUrl, q0Var.field_headImageUrl) && C46238a.m51546a(this.field_profileUrl, q0Var.field_profileUrl) && C46238a.m51546a(Integer.valueOf(this.field_bitFlag), Integer.valueOf(q0Var.field_bitFlag)) && C46238a.m51546a(this.field_addMemberUrl, q0Var.field_addMemberUrl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149795s == hashCode) {
                    try {
                        this.field_userId = cursor.getString(i);
                        this.f149803d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149796t == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149797u == hashCode) {
                    try {
                        this.field_userNamePY = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149798v == hashCode) {
                    try {
                        this.field_brandUserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149799w == hashCode) {
                    try {
                        this.field_UserVersion = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149800x == hashCode) {
                    try {
                        this.field_needToUpdate = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149801y == hashCode) {
                    try {
                        this.field_headImageUrl = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149802z == hashCode) {
                    try {
                        this.field_profileUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149788A == hashCode) {
                    try {
                        this.field_bitFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149789B == hashCode) {
                    try {
                        this.field_addMemberUrl = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatUserInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149790C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149803d) {
            contentValues.put("userId", this.field_userId);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f149804e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_userNamePY == null) {
            this.field_userNamePY = "";
        }
        if (this.f149805f) {
            contentValues.put("userNamePY", this.field_userNamePY);
        }
        if (this.field_brandUserName == null) {
            this.field_brandUserName = "";
        }
        if (this.f149806g) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f149807h) {
            contentValues.put("UserVersion", Integer.valueOf(this.field_UserVersion));
        }
        if (this.f149808i) {
            if (this.field_needToUpdate) {
                contentValues.put("needToUpdate", 1);
            } else {
                contentValues.put("needToUpdate", 0);
            }
        }
        if (this.f149809j) {
            contentValues.put("headImageUrl", this.field_headImageUrl);
        }
        if (this.f149810n) {
            contentValues.put("profileUrl", this.field_profileUrl);
        }
        if (this.f149811o) {
            contentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
        }
        if (this.f149812p) {
            contentValues.put("addMemberUrl", this.field_addMemberUrl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizChatUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizChatUserInfo ( " + f149791D.sql + ");");
        for (String add : f149794r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatUserInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizChatUserInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149791D, "BizChatUserInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatUserInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizChatUserInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizChatUserInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149791D;
    }

    public String[] getIndexCreateSQL() {
        return f149794r;
    }

    public StorageObserverOwner<C53346q0> getObserverOwner() {
        return f149792E;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userId;
    }

    public SingleTable getTable() {
        return f149793q;
    }

    public String getTableName() {
        return f149793q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z) {
                this.f149803d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f149804e = true;
            }
        }
        if (contentValues.containsKey("userNamePY")) {
            this.field_userNamePY = contentValues.getAsString("userNamePY");
            if (z) {
                this.f149805f = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z) {
                this.f149806g = true;
            }
        }
        if (contentValues.containsKey("UserVersion")) {
            this.field_UserVersion = contentValues.getAsInteger("UserVersion").intValue();
            if (z) {
                this.f149807h = true;
            }
        }
        if (contentValues.containsKey("needToUpdate")) {
            this.field_needToUpdate = contentValues.getAsInteger("needToUpdate").intValue() != 0;
            if (z) {
                this.f149808i = true;
            }
        }
        if (contentValues.containsKey("headImageUrl")) {
            this.field_headImageUrl = contentValues.getAsString("headImageUrl");
            if (z) {
                this.f149809j = true;
            }
        }
        if (contentValues.containsKey("profileUrl")) {
            this.field_profileUrl = contentValues.getAsString("profileUrl");
            if (z) {
                this.f149810n = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.field_bitFlag = contentValues.getAsInteger("bitFlag").intValue();
            if (z) {
                this.f149811o = true;
            }
        }
        if (contentValues.containsKey("addMemberUrl")) {
            this.field_addMemberUrl = contentValues.getAsString("addMemberUrl");
            if (z) {
                this.f149812p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
