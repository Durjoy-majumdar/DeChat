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

/* renamed from: xh.v8 */
public class C38686v8 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103999j;

    /* renamed from: n */
    public static final String[] f104000n = new String[0];

    /* renamed from: o */
    public static final int f104001o = -1884251920;

    /* renamed from: p */
    public static final int f104002p = 891095780;

    /* renamed from: q */
    public static final int f104003q = 1490329471;

    /* renamed from: r */
    public static final int f104004r = 1644888662;

    /* renamed from: s */
    public static final int f104005s = 1982848049;

    /* renamed from: t */
    public static final int f104006t = 2103122539;

    /* renamed from: u */
    public static final int f104007u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f104008v = initAutoDBInfo(C38686v8.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38686v8> f104009w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104010d = true;

    /* renamed from: e */
    public boolean f104011e = true;

    /* renamed from: f */
    public boolean f104012f = true;
    public int field_commentFlag;
    public int field_readCommentId;
    public int field_readCommentTime;
    public long field_storyId;
    public int field_syncCommentId;
    public int field_syncCommentTime;

    /* renamed from: g */
    public boolean f104013g = true;

    /* renamed from: h */
    public boolean f104014h = true;

    /* renamed from: i */
    public boolean f104015i = true;

    static {
        SingleTable singleTable = new SingleTable("StoryCommentSync");
        f103999j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("storyId", "long", singleTable.getName(), "");
        new Column("readCommentId", "int", singleTable.getName(), "");
        new Column("syncCommentId", "int", singleTable.getName(), "");
        new Column("readCommentTime", "int", singleTable.getName(), "");
        new Column("syncCommentTime", "int", singleTable.getName(), "");
        new Column("commentFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "storyId";
        mAutoDBInfo.colsMap.put("storyId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "storyId";
        mAutoDBInfo.columns[1] = "readCommentId";
        mAutoDBInfo.colsMap.put("readCommentId", "INTEGER");
        mAutoDBInfo.columns[2] = "syncCommentId";
        mAutoDBInfo.colsMap.put("syncCommentId", "INTEGER");
        mAutoDBInfo.columns[3] = "readCommentTime";
        mAutoDBInfo.colsMap.put("readCommentTime", "INTEGER");
        mAutoDBInfo.columns[4] = "syncCommentTime";
        mAutoDBInfo.colsMap.put("syncCommentTime", "INTEGER");
        mAutoDBInfo.columns[5] = "commentFlag";
        mAutoDBInfo.colsMap.put("commentFlag", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " storyId LONG PRIMARY KEY ,  readCommentId INTEGER,  syncCommentId INTEGER,  readCommentTime INTEGER,  syncCommentTime INTEGER,  commentFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38686v8)) {
            return false;
        }
        C38686v8 v8Var = (C38686v8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_storyId), Long.valueOf(v8Var.field_storyId)) && C46238a.m51546a(Integer.valueOf(this.field_readCommentId), Integer.valueOf(v8Var.field_readCommentId)) && C46238a.m51546a(Integer.valueOf(this.field_syncCommentId), Integer.valueOf(v8Var.field_syncCommentId)) && C46238a.m51546a(Integer.valueOf(this.field_readCommentTime), Integer.valueOf(v8Var.field_readCommentTime)) && C46238a.m51546a(Integer.valueOf(this.field_syncCommentTime), Integer.valueOf(v8Var.field_syncCommentTime)) && C46238a.m51546a(Integer.valueOf(this.field_commentFlag), Integer.valueOf(v8Var.field_commentFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104001o == hashCode) {
                    try {
                        this.field_storyId = cursor.getLong(i);
                        this.f104010d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104002p == hashCode) {
                    try {
                        this.field_readCommentId = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104003q == hashCode) {
                    try {
                        this.field_syncCommentId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104004r == hashCode) {
                    try {
                        this.field_readCommentTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104005s == hashCode) {
                    try {
                        this.field_syncCommentTime = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104006t == hashCode) {
                    try {
                        this.field_commentFlag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104007u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104010d) {
            contentValues.put("storyId", Long.valueOf(this.field_storyId));
        }
        if (this.f104011e) {
            contentValues.put("readCommentId", Integer.valueOf(this.field_readCommentId));
        }
        if (this.f104012f) {
            contentValues.put("syncCommentId", Integer.valueOf(this.field_syncCommentId));
        }
        if (this.f104013g) {
            contentValues.put("readCommentTime", Integer.valueOf(this.field_readCommentTime));
        }
        if (this.f104014h) {
            contentValues.put("syncCommentTime", Integer.valueOf(this.field_syncCommentTime));
        }
        if (this.f104015i) {
            contentValues.put("commentFlag", Integer.valueOf(this.field_commentFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStoryCommentSync", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS StoryCommentSync ( " + f104008v.sql + ");");
        for (String add : f104000n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStoryCommentSync", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("StoryCommentSync", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104008v, "StoryCommentSync", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStoryCommentSync", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("StoryCommentSync", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStoryCommentSync", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104008v;
    }

    public String[] getIndexCreateSQL() {
        return f104000n;
    }

    public StorageObserverOwner<C38686v8> getObserverOwner() {
        return f104009w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_storyId);
    }

    public SingleTable getTable() {
        return f103999j;
    }

    public String getTableName() {
        return f103999j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("storyId")) {
            this.field_storyId = contentValues.getAsLong("storyId").longValue();
            if (z) {
                this.f104010d = true;
            }
        }
        if (contentValues.containsKey("readCommentId")) {
            this.field_readCommentId = contentValues.getAsInteger("readCommentId").intValue();
            if (z) {
                this.f104011e = true;
            }
        }
        if (contentValues.containsKey("syncCommentId")) {
            this.field_syncCommentId = contentValues.getAsInteger("syncCommentId").intValue();
            if (z) {
                this.f104012f = true;
            }
        }
        if (contentValues.containsKey("readCommentTime")) {
            this.field_readCommentTime = contentValues.getAsInteger("readCommentTime").intValue();
            if (z) {
                this.f104013g = true;
            }
        }
        if (contentValues.containsKey("syncCommentTime")) {
            this.field_syncCommentTime = contentValues.getAsInteger("syncCommentTime").intValue();
            if (z) {
                this.f104014h = true;
            }
        }
        if (contentValues.containsKey("commentFlag")) {
            this.field_commentFlag = contentValues.getAsInteger("commentFlag").intValue();
            if (z) {
                this.f104015i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
