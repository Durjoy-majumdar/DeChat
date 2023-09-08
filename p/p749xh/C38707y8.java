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

/* renamed from: xh.y8 */
public class C38707y8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104341i;

    /* renamed from: j */
    public static final String[] f104342j = new String[0];

    /* renamed from: n */
    public static final int f104343n = -172550682;

    /* renamed from: o */
    public static final int f104344o = -620940682;

    /* renamed from: p */
    public static final int f104345p = 2014635379;

    /* renamed from: q */
    public static final int f104346q = -1289046862;

    /* renamed from: r */
    public static final int f104347r = 774006811;

    /* renamed from: s */
    public static final int f104348s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104349t = initAutoDBInfo(C38707y8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38707y8> f104350u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104351d = true;

    /* renamed from: e */
    public boolean f104352e = true;

    /* renamed from: f */
    public boolean f104353f = true;
    public byte[] field_extbuf;
    public String field_newStoryList;
    public long field_nextSyncTime;
    public String field_roomname;
    public int field_userStoryFlag;

    /* renamed from: g */
    public boolean f104354g = true;

    /* renamed from: h */
    public boolean f104355h = true;

    static {
        SingleTable singleTable = new SingleTable("StoryRoomInfo");
        f104341i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("roomname", "string", singleTable.getName(), "");
        new Column("userStoryFlag", "int", singleTable.getName(), "");
        new Column("newStoryList", "string", singleTable.getName(), "");
        new Column("extbuf", "byte[]", singleTable.getName(), "");
        new Column("nextSyncTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "roomname";
        mAutoDBInfo.colsMap.put("roomname", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "roomname";
        mAutoDBInfo.columns[1] = "userStoryFlag";
        mAutoDBInfo.colsMap.put("userStoryFlag", "INTEGER");
        mAutoDBInfo.columns[2] = "newStoryList";
        mAutoDBInfo.colsMap.put("newStoryList", "TEXT");
        mAutoDBInfo.columns[3] = "extbuf";
        mAutoDBInfo.colsMap.put("extbuf", "BLOB");
        mAutoDBInfo.columns[4] = "nextSyncTime";
        mAutoDBInfo.colsMap.put("nextSyncTime", "LONG");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " roomname TEXT default ''  PRIMARY KEY ,  userStoryFlag INTEGER,  newStoryList TEXT,  extbuf BLOB,  nextSyncTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38707y8)) {
            return false;
        }
        C38707y8 y8Var = (C38707y8) iAutoDBItem;
        return C46238a.m51546a(this.field_roomname, y8Var.field_roomname) && C46238a.m51546a(Integer.valueOf(this.field_userStoryFlag), Integer.valueOf(y8Var.field_userStoryFlag)) && C46238a.m51546a(this.field_newStoryList, y8Var.field_newStoryList) && C46238a.m51546a(this.field_extbuf, y8Var.field_extbuf) && C46238a.m51546a(Long.valueOf(this.field_nextSyncTime), Long.valueOf(y8Var.field_nextSyncTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104343n == hashCode) {
                    try {
                        this.field_roomname = cursor.getString(i);
                        this.f104351d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104344o == hashCode) {
                    try {
                        this.field_userStoryFlag = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104345p == hashCode) {
                    try {
                        this.field_newStoryList = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104346q == hashCode) {
                    try {
                        this.field_extbuf = cursor.getBlob(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104347r == hashCode) {
                    try {
                        this.field_nextSyncTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryRoomInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104348s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_roomname == null) {
            this.field_roomname = "";
        }
        if (this.f104351d) {
            contentValues.put("roomname", this.field_roomname);
        }
        if (this.f104352e) {
            contentValues.put("userStoryFlag", Integer.valueOf(this.field_userStoryFlag));
        }
        if (this.f104353f) {
            contentValues.put("newStoryList", this.field_newStoryList);
        }
        if (this.f104354g) {
            contentValues.put("extbuf", this.field_extbuf);
        }
        if (this.f104355h) {
            contentValues.put("nextSyncTime", Long.valueOf(this.field_nextSyncTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStoryRoomInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS StoryRoomInfo ( " + f104349t.sql + ");");
        for (String add : f104342j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStoryRoomInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("StoryRoomInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104349t, "StoryRoomInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStoryRoomInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("StoryRoomInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStoryRoomInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104349t;
    }

    public String[] getIndexCreateSQL() {
        return f104342j;
    }

    public StorageObserverOwner<C38707y8> getObserverOwner() {
        return f104350u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_roomname;
    }

    public SingleTable getTable() {
        return f104341i;
    }

    public String getTableName() {
        return f104341i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("roomname")) {
            this.field_roomname = contentValues.getAsString("roomname");
            if (z) {
                this.f104351d = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.field_userStoryFlag = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z) {
                this.f104352e = true;
            }
        }
        if (contentValues.containsKey("newStoryList")) {
            this.field_newStoryList = contentValues.getAsString("newStoryList");
            if (z) {
                this.f104353f = true;
            }
        }
        if (contentValues.containsKey("extbuf")) {
            this.field_extbuf = contentValues.getAsByteArray("extbuf");
            if (z) {
                this.f104354g = true;
            }
        }
        if (contentValues.containsKey("nextSyncTime")) {
            this.field_nextSyncTime = contentValues.getAsLong("nextSyncTime").longValue();
            if (z) {
                this.f104355h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
