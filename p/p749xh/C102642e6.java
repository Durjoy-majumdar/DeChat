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

/* renamed from: xh.e6 */
public class C102642e6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302282A = 951530617;

    /* renamed from: B */
    public static final int f302283B = -674882878;

    /* renamed from: C */
    public static final int f302284C = -391239245;

    /* renamed from: D */
    public static final int f302285D = -1111431691;

    /* renamed from: E */
    public static final int f302286E = 3575610;

    /* renamed from: F */
    public static final int f302287F = -283421650;

    /* renamed from: G */
    public static final int f302288G = -1139436263;

    /* renamed from: H */
    public static final int f302289H = 525558409;

    /* renamed from: I */
    public static final int f302290I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f302291J = initAutoDBInfo(C102642e6.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C102642e6> f302292K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f302293t;

    /* renamed from: u */
    public static final String[] f302294u = {"CREATE INDEX IF NOT EXISTS MMStoryInfo_id_Index ON MMStoryInfo(storyID)"};

    /* renamed from: v */
    public static final int f302295v = -1884251952;

    /* renamed from: w */
    public static final int f302296w = -266666762;

    /* renamed from: x */
    public static final int f302297x = -1205623433;

    /* renamed from: y */
    public static final int f302298y = 1369213417;

    /* renamed from: z */
    public static final int f302299z = -866758798;

    /* renamed from: d */
    public boolean f302300d = true;

    /* renamed from: e */
    public boolean f302301e = true;

    /* renamed from: f */
    public boolean f302302f = true;
    public byte[] field_attrBuf;
    public int field_commentListCount;
    public byte[] field_content;
    public int field_createTime;
    public int field_favoriteTime;
    public int field_itemStoryFlag;
    public int field_localFlag;
    public byte[] field_postBuf;
    public int field_readCount;
    public int field_sourceType;
    public long field_storyID;
    public int field_type;
    public String field_userName;

    /* renamed from: g */
    public boolean f302303g = true;

    /* renamed from: h */
    public boolean f302304h = true;

    /* renamed from: i */
    public boolean f302305i = true;

    /* renamed from: j */
    public boolean f302306j = true;

    /* renamed from: n */
    public boolean f302307n = true;

    /* renamed from: o */
    public boolean f302308o = true;

    /* renamed from: p */
    public boolean f302309p = true;

    /* renamed from: q */
    public boolean f302310q = true;

    /* renamed from: r */
    public boolean f302311r = true;

    /* renamed from: s */
    public boolean f302312s = true;

    static {
        SingleTable singleTable = new SingleTable("MMStoryInfo");
        f302293t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("storyID", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("localFlag", "int", singleTable.getName(), "");
        new Column("createTime", "int", singleTable.getName(), "");
        new Column("commentListCount", "int", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
        new Column("attrBuf", "byte[]", singleTable.getName(), "");
        new Column("postBuf", "byte[]", singleTable.getName(), "");
        new Column("sourceType", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("itemStoryFlag", "int", singleTable.getName(), "");
        new Column("readCount", "int", singleTable.getName(), "");
        new Column("favoriteTime", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "storyID";
        mAutoDBInfo.colsMap.put("storyID", "LONG");
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT");
        mAutoDBInfo.columns[2] = "localFlag";
        mAutoDBInfo.colsMap.put("localFlag", "INTEGER");
        mAutoDBInfo.columns[3] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[4] = "commentListCount";
        mAutoDBInfo.colsMap.put("commentListCount", "INTEGER");
        mAutoDBInfo.columns[5] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB");
        mAutoDBInfo.columns[6] = "attrBuf";
        mAutoDBInfo.colsMap.put("attrBuf", "BLOB");
        mAutoDBInfo.columns[7] = "postBuf";
        mAutoDBInfo.colsMap.put("postBuf", "BLOB");
        mAutoDBInfo.columns[8] = "sourceType";
        mAutoDBInfo.colsMap.put("sourceType", "INTEGER");
        mAutoDBInfo.columns[9] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[10] = "itemStoryFlag";
        mAutoDBInfo.colsMap.put("itemStoryFlag", "INTEGER");
        mAutoDBInfo.columns[11] = "readCount";
        mAutoDBInfo.colsMap.put("readCount", "INTEGER");
        mAutoDBInfo.columns[12] = "favoriteTime";
        mAutoDBInfo.colsMap.put("favoriteTime", "INTEGER");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " storyID LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  commentListCount INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  sourceType INTEGER,  type INTEGER,  itemStoryFlag INTEGER,  readCount INTEGER,  favoriteTime INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102642e6)) {
            return false;
        }
        C102642e6 e6Var = (C102642e6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_storyID), Long.valueOf(e6Var.field_storyID)) && C46238a.m51546a(this.field_userName, e6Var.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(e6Var.field_localFlag)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(e6Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_commentListCount), Integer.valueOf(e6Var.field_commentListCount)) && C46238a.m51546a(this.field_content, e6Var.field_content) && C46238a.m51546a(this.field_attrBuf, e6Var.field_attrBuf) && C46238a.m51546a(this.field_postBuf, e6Var.field_postBuf) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(e6Var.field_sourceType)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(e6Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_itemStoryFlag), Integer.valueOf(e6Var.field_itemStoryFlag)) && C46238a.m51546a(Integer.valueOf(this.field_readCount), Integer.valueOf(e6Var.field_readCount)) && C46238a.m51546a(Integer.valueOf(this.field_favoriteTime), Integer.valueOf(e6Var.field_favoriteTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302295v == hashCode) {
                    try {
                        this.field_storyID = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302296w == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302297x == hashCode) {
                    try {
                        this.field_localFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302298y == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302299z == hashCode) {
                    try {
                        this.field_commentListCount = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302282A == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302283B == hashCode) {
                    try {
                        this.field_attrBuf = cursor.getBlob(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302284C == hashCode) {
                    try {
                        this.field_postBuf = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302285D == hashCode) {
                    try {
                        this.field_sourceType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302286E == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302287F == hashCode) {
                    try {
                        this.field_itemStoryFlag = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302288G == hashCode) {
                    try {
                        this.field_readCount = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302289H == hashCode) {
                    try {
                        this.field_favoriteTime = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302290I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302300d) {
            contentValues.put("storyID", Long.valueOf(this.field_storyID));
        }
        if (this.f302301e) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f302302f) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.f302303g) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f302304h) {
            contentValues.put("commentListCount", Integer.valueOf(this.field_commentListCount));
        }
        if (this.f302305i) {
            contentValues.put("content", this.field_content);
        }
        if (this.f302306j) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.f302307n) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.f302308o) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        if (this.f302309p) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302310q) {
            contentValues.put("itemStoryFlag", Integer.valueOf(this.field_itemStoryFlag));
        }
        if (this.f302311r) {
            contentValues.put("readCount", Integer.valueOf(this.field_readCount));
        }
        if (this.f302312s) {
            contentValues.put("favoriteTime", Integer.valueOf(this.field_favoriteTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMMStoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MMStoryInfo ( " + f302291J.sql + ");");
        for (String add : f302294u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMMStoryInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MMStoryInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302291J, "MMStoryInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMMStoryInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MMStoryInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMMStoryInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302291J;
    }

    public String[] getIndexCreateSQL() {
        return f302294u;
    }

    public StorageObserverOwner<C102642e6> getObserverOwner() {
        return f302292K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f302293t;
    }

    public String getTableName() {
        return f302293t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("storyID")) {
            this.field_storyID = contentValues.getAsLong("storyID").longValue();
            if (z) {
                this.f302300d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f302301e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z) {
                this.f302302f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f302303g = true;
            }
        }
        if (contentValues.containsKey("commentListCount")) {
            this.field_commentListCount = contentValues.getAsInteger("commentListCount").intValue();
            if (z) {
                this.f302304h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f302305i = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z) {
                this.f302306j = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z) {
                this.f302307n = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z) {
                this.f302308o = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302309p = true;
            }
        }
        if (contentValues.containsKey("itemStoryFlag")) {
            this.field_itemStoryFlag = contentValues.getAsInteger("itemStoryFlag").intValue();
            if (z) {
                this.f302310q = true;
            }
        }
        if (contentValues.containsKey("readCount")) {
            this.field_readCount = contentValues.getAsInteger("readCount").intValue();
            if (z) {
                this.f302311r = true;
            }
        }
        if (contentValues.containsKey("favoriteTime")) {
            this.field_favoriteTime = contentValues.getAsInteger("favoriteTime").intValue();
            if (z) {
                this.f302312s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
