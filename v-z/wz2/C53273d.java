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

/* renamed from: wz2.d */
public class C53273d extends IAutoDBItem {

    /* renamed from: A */
    public static final int f148771A = 2622298;

    /* renamed from: B */
    public static final int f148772B = -932289015;

    /* renamed from: C */
    public static final int f148773C = -1955822743;

    /* renamed from: D */
    public static final int f148774D = 2543030;

    /* renamed from: E */
    public static final int f148775E = 1566917561;

    /* renamed from: F */
    public static final int f148776F = -1902930339;

    /* renamed from: G */
    public static final int f148777G = 424807759;

    /* renamed from: H */
    public static final int f148778H = 2016261304;

    /* renamed from: I */
    public static final int f148779I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f148780J = initAutoDBInfo(C53273d.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C53273d> f148781K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f148782t;

    /* renamed from: u */
    public static final String[] f148783u = {"CREATE INDEX IF NOT EXISTS TextStatusLike_TextStatusId_index ON TextStatusLike(TextStatusId)"};

    /* renamed from: v */
    public static final int f148784v = 1214784794;

    /* renamed from: w */
    public static final int f148785w = -2124511164;

    /* renamed from: x */
    public static final int f148786x = -912949683;

    /* renamed from: y */
    public static final int f148787y = -1129666356;

    /* renamed from: z */
    public static final int f148788z = -56677412;

    /* renamed from: d */
    public boolean f148789d = true;

    /* renamed from: e */
    public boolean f148790e = true;

    /* renamed from: f */
    public boolean f148791f = true;
    public int field_CreateTime;
    public int field_DeleteInMsgList;
    public String field_Description;
    public String field_DisplayName;
    public String field_HashUserName;
    public String field_HeadImgUrl;
    public int field_Notify;
    public int field_Read;
    public String field_TextStatusId;
    public byte[] field_TopicInfo;
    public int field_Type;
    public int field_Version;
    public String field_thumbUrl;

    /* renamed from: g */
    public boolean f148792g = true;

    /* renamed from: h */
    public boolean f148793h = true;

    /* renamed from: i */
    public boolean f148794i = true;

    /* renamed from: j */
    public boolean f148795j = true;

    /* renamed from: n */
    public boolean f148796n = true;

    /* renamed from: o */
    public boolean f148797o = true;

    /* renamed from: p */
    public boolean f148798p = true;

    /* renamed from: q */
    public boolean f148799q = true;

    /* renamed from: r */
    public boolean f148800r = true;

    /* renamed from: s */
    public boolean f148801s = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatusLike");
        f148782t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("TextStatusId", "string", singleTable.getName(), "");
        new Column("HashUserName", "string", singleTable.getName(), "");
        new Column("DisplayName", "string", singleTable.getName(), "");
        new Column("HeadImgUrl", "string", singleTable.getName(), "");
        new Column("Description", "string", singleTable.getName(), "");
        new Column("Type", "int", singleTable.getName(), "");
        new Column("CreateTime", "int", singleTable.getName(), "");
        new Column("Notify", "int", singleTable.getName(), "");
        new Column("Read", "int", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("TopicInfo", "byte[]", singleTable.getName(), "");
        new Column("DeleteInMsgList", "int", singleTable.getName(), "");
        new Column("Version", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "TextStatusId";
        mAutoDBInfo.colsMap.put("TextStatusId", "TEXT");
        mAutoDBInfo.columns[1] = "HashUserName";
        mAutoDBInfo.colsMap.put("HashUserName", "TEXT");
        mAutoDBInfo.columns[2] = "DisplayName";
        mAutoDBInfo.colsMap.put("DisplayName", "TEXT");
        mAutoDBInfo.columns[3] = "HeadImgUrl";
        mAutoDBInfo.colsMap.put("HeadImgUrl", "TEXT");
        mAutoDBInfo.columns[4] = "Description";
        mAutoDBInfo.colsMap.put("Description", "TEXT");
        mAutoDBInfo.columns[5] = "Type";
        mAutoDBInfo.colsMap.put("Type", "INTEGER");
        mAutoDBInfo.columns[6] = "CreateTime";
        mAutoDBInfo.colsMap.put("CreateTime", "INTEGER");
        mAutoDBInfo.columns[7] = "Notify";
        mAutoDBInfo.colsMap.put("Notify", "INTEGER");
        mAutoDBInfo.columns[8] = "Read";
        mAutoDBInfo.colsMap.put("Read", "INTEGER");
        mAutoDBInfo.columns[9] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT");
        mAutoDBInfo.columns[10] = "TopicInfo";
        mAutoDBInfo.colsMap.put("TopicInfo", "BLOB");
        mAutoDBInfo.columns[11] = "DeleteInMsgList";
        mAutoDBInfo.colsMap.put("DeleteInMsgList", "INTEGER");
        mAutoDBInfo.columns[12] = "Version";
        mAutoDBInfo.colsMap.put("Version", "INTEGER");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " TextStatusId TEXT,  HashUserName TEXT,  DisplayName TEXT,  HeadImgUrl TEXT,  Description TEXT,  Type INTEGER,  CreateTime INTEGER,  Notify INTEGER,  Read INTEGER,  thumbUrl TEXT,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  Version INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53273d)) {
            return false;
        }
        C53273d dVar = (C53273d) iAutoDBItem;
        return C46238a.m51546a(this.field_TextStatusId, dVar.field_TextStatusId) && C46238a.m51546a(this.field_HashUserName, dVar.field_HashUserName) && C46238a.m51546a(this.field_DisplayName, dVar.field_DisplayName) && C46238a.m51546a(this.field_HeadImgUrl, dVar.field_HeadImgUrl) && C46238a.m51546a(this.field_Description, dVar.field_Description) && C46238a.m51546a(Integer.valueOf(this.field_Type), Integer.valueOf(dVar.field_Type)) && C46238a.m51546a(Integer.valueOf(this.field_CreateTime), Integer.valueOf(dVar.field_CreateTime)) && C46238a.m51546a(Integer.valueOf(this.field_Notify), Integer.valueOf(dVar.field_Notify)) && C46238a.m51546a(Integer.valueOf(this.field_Read), Integer.valueOf(dVar.field_Read)) && C46238a.m51546a(this.field_thumbUrl, dVar.field_thumbUrl) && C46238a.m51546a(this.field_TopicInfo, dVar.field_TopicInfo) && C46238a.m51546a(Integer.valueOf(this.field_DeleteInMsgList), Integer.valueOf(dVar.field_DeleteInMsgList)) && C46238a.m51546a(Integer.valueOf(this.field_Version), Integer.valueOf(dVar.field_Version));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148784v == hashCode) {
                    try {
                        this.field_TextStatusId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148785w == hashCode) {
                    try {
                        this.field_HashUserName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148786x == hashCode) {
                    try {
                        this.field_DisplayName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148787y == hashCode) {
                    try {
                        this.field_HeadImgUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148788z == hashCode) {
                    try {
                        this.field_Description = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148771A == hashCode) {
                    try {
                        this.field_Type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148772B == hashCode) {
                    try {
                        this.field_CreateTime = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148773C == hashCode) {
                    try {
                        this.field_Notify = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148774D == hashCode) {
                    try {
                        this.field_Read = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148775E == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148776F == hashCode) {
                    try {
                        this.field_TopicInfo = cursor.getBlob(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148777G == hashCode) {
                    try {
                        this.field_DeleteInMsgList = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148778H == hashCode) {
                    try {
                        this.field_Version = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148779I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f148789d) {
            contentValues.put("TextStatusId", this.field_TextStatusId);
        }
        if (this.f148790e) {
            contentValues.put("HashUserName", this.field_HashUserName);
        }
        if (this.f148791f) {
            contentValues.put("DisplayName", this.field_DisplayName);
        }
        if (this.f148792g) {
            contentValues.put("HeadImgUrl", this.field_HeadImgUrl);
        }
        if (this.f148793h) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f148794i) {
            contentValues.put("Type", Integer.valueOf(this.field_Type));
        }
        if (this.f148795j) {
            contentValues.put("CreateTime", Integer.valueOf(this.field_CreateTime));
        }
        if (this.f148796n) {
            contentValues.put("Notify", Integer.valueOf(this.field_Notify));
        }
        if (this.f148797o) {
            contentValues.put("Read", Integer.valueOf(this.field_Read));
        }
        if (this.f148798p) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f148799q) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f148800r) {
            contentValues.put("DeleteInMsgList", Integer.valueOf(this.field_DeleteInMsgList));
        }
        if (this.f148801s) {
            contentValues.put("Version", Integer.valueOf(this.field_Version));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatusLike", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatusLike ( " + f148780J.sql + ");");
        for (String add : f148783u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusLike", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatusLike", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148780J, "TextStatusLike", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatusLike", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatusLike", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatusLike", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148780J;
    }

    public String[] getIndexCreateSQL() {
        return f148783u;
    }

    public StorageObserverOwner<C53273d> getObserverOwner() {
        return f148781K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f148782t;
    }

    public String getTableName() {
        return f148782t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("TextStatusId")) {
            this.field_TextStatusId = contentValues.getAsString("TextStatusId");
            if (z) {
                this.f148789d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.field_HashUserName = contentValues.getAsString("HashUserName");
            if (z) {
                this.f148790e = true;
            }
        }
        if (contentValues.containsKey("DisplayName")) {
            this.field_DisplayName = contentValues.getAsString("DisplayName");
            if (z) {
                this.f148791f = true;
            }
        }
        if (contentValues.containsKey("HeadImgUrl")) {
            this.field_HeadImgUrl = contentValues.getAsString("HeadImgUrl");
            if (z) {
                this.f148792g = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z) {
                this.f148793h = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.field_Type = contentValues.getAsInteger("Type").intValue();
            if (z) {
                this.f148794i = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z) {
                this.f148795j = true;
            }
        }
        if (contentValues.containsKey("Notify")) {
            this.field_Notify = contentValues.getAsInteger("Notify").intValue();
            if (z) {
                this.f148796n = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z) {
                this.f148797o = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f148798p = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z) {
                this.f148799q = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.field_DeleteInMsgList = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z) {
                this.f148800r = true;
            }
        }
        if (contentValues.containsKey("Version")) {
            this.field_Version = contentValues.getAsInteger("Version").intValue();
            if (z) {
                this.f148801s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
