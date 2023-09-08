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

/* renamed from: xh.p4 */
public class C53345p4 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f149769n;

    /* renamed from: o */
    public static final String[] f149770o = {"CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_UserName ON GameSimpleUserInfo(userName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_RoomName ON GameSimpleUserInfo(roomName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_NickName ON GameSimpleUserInfo(nickName)"};

    /* renamed from: p */
    public static final int f149771p = 33997909;

    /* renamed from: q */
    public static final int f149772q = -266666762;

    /* renamed from: r */
    public static final int f149773r = -173503994;

    /* renamed from: s */
    public static final int f149774s = 69737614;

    /* renamed from: t */
    public static final int f149775t = -428647082;

    /* renamed from: u */
    public static final int f149776u = 3506294;

    /* renamed from: v */
    public static final int f149777v = -295931082;

    /* renamed from: w */
    public static final int f149778w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f149779x = initAutoDBInfo(C53345p4.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C53345p4> f149780y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f149781d = true;

    /* renamed from: e */
    public boolean f149782e = true;

    /* renamed from: f */
    public boolean f149783f = true;
    public String field_avatarURL;
    public String field_compositionKey;
    public String field_nickName;
    public int field_role;
    public String field_roomName;
    public long field_updateTime;
    public String field_userName;

    /* renamed from: g */
    public boolean f149784g = true;

    /* renamed from: h */
    public boolean f149785h = true;

    /* renamed from: i */
    public boolean f149786i = true;

    /* renamed from: j */
    public boolean f149787j = true;

    static {
        SingleTable singleTable = new SingleTable("GameSimpleUserInfo");
        f149769n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("compositionKey", "string", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("roomName", "string", singleTable.getName(), "");
        new Column("nickName", "string", singleTable.getName(), "");
        new Column("avatarURL", "string", singleTable.getName(), "");
        new Column("role", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "compositionKey";
        mAutoDBInfo.colsMap.put("compositionKey", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "compositionKey";
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "roomName";
        mAutoDBInfo.colsMap.put("roomName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "nickName";
        mAutoDBInfo.colsMap.put("nickName", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "avatarURL";
        mAutoDBInfo.colsMap.put("avatarURL", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "role";
        mAutoDBInfo.colsMap.put("role", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " compositionKey TEXT default ''  PRIMARY KEY ,  userName TEXT default '' ,  roomName TEXT default '' ,  nickName TEXT default '' ,  avatarURL TEXT default '' ,  role INTEGER default '0' ,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53345p4)) {
            return false;
        }
        C53345p4 p4Var = (C53345p4) iAutoDBItem;
        return C46238a.m51546a(this.field_compositionKey, p4Var.field_compositionKey) && C46238a.m51546a(this.field_userName, p4Var.field_userName) && C46238a.m51546a(this.field_roomName, p4Var.field_roomName) && C46238a.m51546a(this.field_nickName, p4Var.field_nickName) && C46238a.m51546a(this.field_avatarURL, p4Var.field_avatarURL) && C46238a.m51546a(Integer.valueOf(this.field_role), Integer.valueOf(p4Var.field_role)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(p4Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149771p == hashCode) {
                    try {
                        this.field_compositionKey = cursor.getString(i);
                        this.f149781d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149772q == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149773r == hashCode) {
                    try {
                        this.field_roomName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149774s == hashCode) {
                    try {
                        this.field_nickName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149775t == hashCode) {
                    try {
                        this.field_avatarURL = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149776u == hashCode) {
                    try {
                        this.field_role = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149777v == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameSimpleUserInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149778w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_compositionKey == null) {
            this.field_compositionKey = "";
        }
        if (this.f149781d) {
            contentValues.put("compositionKey", this.field_compositionKey);
        }
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f149782e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_roomName == null) {
            this.field_roomName = "";
        }
        if (this.f149783f) {
            contentValues.put("roomName", this.field_roomName);
        }
        if (this.field_nickName == null) {
            this.field_nickName = "";
        }
        if (this.f149784g) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f149785h) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f149786i) {
            contentValues.put("role", Integer.valueOf(this.field_role));
        }
        if (this.f149787j) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameSimpleUserInfo ( " + f149779x.sql + ");");
        for (String add : f149770o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameSimpleUserInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149779x, "GameSimpleUserInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameSimpleUserInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameSimpleUserInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149779x;
    }

    public String[] getIndexCreateSQL() {
        return f149770o;
    }

    public StorageObserverOwner<C53345p4> getObserverOwner() {
        return f149780y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_compositionKey;
    }

    public SingleTable getTable() {
        return f149769n;
    }

    public String getTableName() {
        return f149769n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("compositionKey")) {
            this.field_compositionKey = contentValues.getAsString("compositionKey");
            if (z) {
                this.f149781d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f149782e = true;
            }
        }
        if (contentValues.containsKey("roomName")) {
            this.field_roomName = contentValues.getAsString("roomName");
            if (z) {
                this.f149783f = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z) {
                this.f149784g = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z) {
                this.f149785h = true;
            }
        }
        if (contentValues.containsKey("role")) {
            this.field_role = contentValues.getAsInteger("role").intValue();
            if (z) {
                this.f149786i = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f149787j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
