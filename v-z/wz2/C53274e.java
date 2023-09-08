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

/* renamed from: wz2.e */
public class C53274e extends IAutoDBItem {

    /* renamed from: A */
    public static final int f148802A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f148803B = initAutoDBInfo(C53274e.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C53274e> f148804C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f148805p;

    /* renamed from: q */
    public static final String[] f148806q = {"CREATE INDEX IF NOT EXISTS TextStatusReference_TextStatusId_index ON TextStatusReference(TextStatusId)"};

    /* renamed from: r */
    public static final int f148807r = 1214784794;

    /* renamed from: s */
    public static final int f148808s = -202022634;

    /* renamed from: t */
    public static final int f148809t = -932289015;

    /* renamed from: u */
    public static final int f148810u = 1566917561;

    /* renamed from: v */
    public static final int f148811v = 2543030;

    /* renamed from: w */
    public static final int f148812w = -1902930339;

    /* renamed from: x */
    public static final int f148813x = 424807759;

    /* renamed from: y */
    public static final int f148814y = -274170889;

    /* renamed from: z */
    public static final int f148815z = -56677412;

    /* renamed from: d */
    public boolean f148816d = true;

    /* renamed from: e */
    public boolean f148817e = true;

    /* renamed from: f */
    public boolean f148818f = true;
    public int field_CreateTime;
    public int field_DeleteInMsgList;
    public String field_Description;
    public int field_Read;
    public int field_ShowType;
    public String field_TextStatusId;
    public byte[] field_TopicInfo;
    public String field_UserName;
    public String field_thumbUrl;

    /* renamed from: g */
    public boolean f148819g = true;

    /* renamed from: h */
    public boolean f148820h = true;

    /* renamed from: i */
    public boolean f148821i = true;

    /* renamed from: j */
    public boolean f148822j = true;

    /* renamed from: n */
    public boolean f148823n = true;

    /* renamed from: o */
    public boolean f148824o = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusReference");
        f148805p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("TextStatusId", "string", singleTable.getName(), "");
        new Column("UserName", "string", singleTable.getName(), "");
        new Column("CreateTime", "int", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("Read", "int", singleTable.getName(), "");
        new Column("TopicInfo", "byte[]", singleTable.getName(), "");
        new Column("DeleteInMsgList", "int", singleTable.getName(), "");
        new Column("ShowType", "int", singleTable.getName(), "");
        new Column("Description", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "TextStatusId";
        mAutoDBInfo.colsMap.put("TextStatusId", "TEXT");
        mAutoDBInfo.columns[1] = "UserName";
        mAutoDBInfo.colsMap.put("UserName", "TEXT");
        mAutoDBInfo.columns[2] = "CreateTime";
        mAutoDBInfo.colsMap.put("CreateTime", "INTEGER");
        mAutoDBInfo.columns[3] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT");
        mAutoDBInfo.columns[4] = "Read";
        mAutoDBInfo.colsMap.put("Read", "INTEGER");
        mAutoDBInfo.columns[5] = "TopicInfo";
        mAutoDBInfo.colsMap.put("TopicInfo", "BLOB");
        mAutoDBInfo.columns[6] = "DeleteInMsgList";
        mAutoDBInfo.colsMap.put("DeleteInMsgList", "INTEGER");
        mAutoDBInfo.columns[7] = "ShowType";
        mAutoDBInfo.colsMap.put("ShowType", "INTEGER");
        mAutoDBInfo.columns[8] = "Description";
        mAutoDBInfo.colsMap.put("Description", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " TextStatusId TEXT,  UserName TEXT,  CreateTime INTEGER,  thumbUrl TEXT,  Read INTEGER,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  ShowType INTEGER,  Description TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53274e)) {
            return false;
        }
        C53274e eVar = (C53274e) iAutoDBItem;
        return C46238a.m51546a(this.field_TextStatusId, eVar.field_TextStatusId) && C46238a.m51546a(this.field_UserName, eVar.field_UserName) && C46238a.m51546a(Integer.valueOf(this.field_CreateTime), Integer.valueOf(eVar.field_CreateTime)) && C46238a.m51546a(this.field_thumbUrl, eVar.field_thumbUrl) && C46238a.m51546a(Integer.valueOf(this.field_Read), Integer.valueOf(eVar.field_Read)) && C46238a.m51546a(this.field_TopicInfo, eVar.field_TopicInfo) && C46238a.m51546a(Integer.valueOf(this.field_DeleteInMsgList), Integer.valueOf(eVar.field_DeleteInMsgList)) && C46238a.m51546a(Integer.valueOf(this.field_ShowType), Integer.valueOf(eVar.field_ShowType)) && C46238a.m51546a(this.field_Description, eVar.field_Description);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148807r == hashCode) {
                    try {
                        this.field_TextStatusId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148808s == hashCode) {
                    try {
                        this.field_UserName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148809t == hashCode) {
                    try {
                        this.field_CreateTime = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148810u == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148811v == hashCode) {
                    try {
                        this.field_Read = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148812w == hashCode) {
                    try {
                        this.field_TopicInfo = cursor.getBlob(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148813x == hashCode) {
                    try {
                        this.field_DeleteInMsgList = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148814y == hashCode) {
                    try {
                        this.field_ShowType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148815z == hashCode) {
                    try {
                        this.field_Description = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148802A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f148816d) {
            contentValues.put("TextStatusId", this.field_TextStatusId);
        }
        if (this.f148817e) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f148818f) {
            contentValues.put("CreateTime", Integer.valueOf(this.field_CreateTime));
        }
        if (this.f148819g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f148820h) {
            contentValues.put("Read", Integer.valueOf(this.field_Read));
        }
        if (this.f148821i) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f148822j) {
            contentValues.put("DeleteInMsgList", Integer.valueOf(this.field_DeleteInMsgList));
        }
        if (this.f148823n) {
            contentValues.put("ShowType", Integer.valueOf(this.field_ShowType));
        }
        if (this.f148824o) {
            contentValues.put("Description", this.field_Description);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusReference", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusReference ( " + f148803B.sql + ");");
        for (String add : f148806q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusReference", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusReference", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148803B, "TextStatusReference", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusReference", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusReference", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusReference", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148803B;
    }

    public String[] getIndexCreateSQL() {
        return f148806q;
    }

    public StorageObserverOwner<C53274e> getObserverOwner() {
        return f148804C;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f148805p;
    }

    public String getTableName() {
        return f148805p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("TextStatusId")) {
            this.field_TextStatusId = contentValues.getAsString("TextStatusId");
            if (z) {
                this.f148816d = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z) {
                this.f148817e = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z) {
                this.f148818f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f148819g = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z) {
                this.f148820h = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z) {
                this.f148821i = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.field_DeleteInMsgList = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z) {
                this.f148822j = true;
            }
        }
        if (contentValues.containsKey("ShowType")) {
            this.field_ShowType = contentValues.getAsInteger("ShowType").intValue();
            if (z) {
                this.f148823n = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z) {
                this.f148824o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
