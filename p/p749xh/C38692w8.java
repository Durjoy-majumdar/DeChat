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

/* renamed from: xh.w8 */
public class C38692w8 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f104139j;

    /* renamed from: n */
    public static final String[] f104140n = new String[0];

    /* renamed from: o */
    public static final int f104141o = -492230834;

    /* renamed from: p */
    public static final int f104142p = 25573622;

    /* renamed from: q */
    public static final int f104143q = 1871858481;

    /* renamed from: r */
    public static final int f104144r = 1072729064;

    /* renamed from: s */
    public static final int f104145s = 374093465;

    /* renamed from: t */
    public static final int f104146t = -733902135;

    /* renamed from: u */
    public static final int f104147u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f104148v = initAutoDBInfo(C38692w8.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38692w8> f104149w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104150d = true;

    /* renamed from: e */
    public boolean f104151e = true;

    /* renamed from: f */
    public boolean f104152f = true;
    public int field_available;
    public byte[] field_baseItemData;
    public int field_mixFlag;
    public int field_mixRetryTime;
    public int field_storyLocalId;
    public long field_timeStamp;

    /* renamed from: g */
    public boolean f104153g = true;

    /* renamed from: h */
    public boolean f104154h = true;

    /* renamed from: i */
    public boolean f104155i = true;

    static {
        SingleTable singleTable = new SingleTable("StoryEditorInfo");
        f104139j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("baseItemData", "byte[]", singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
        new Column("storyLocalId", "int", singleTable.getName(), "");
        new Column("mixFlag", "int", singleTable.getName(), "");
        new Column("mixRetryTime", "int", singleTable.getName(), "");
        new Column("available", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "baseItemData";
        mAutoDBInfo.colsMap.put("baseItemData", "BLOB");
        mAutoDBInfo.columns[1] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG");
        mAutoDBInfo.columns[2] = "storyLocalId";
        mAutoDBInfo.colsMap.put("storyLocalId", "INTEGER");
        mAutoDBInfo.columns[3] = "mixFlag";
        mAutoDBInfo.colsMap.put("mixFlag", "INTEGER");
        mAutoDBInfo.columns[4] = "mixRetryTime";
        mAutoDBInfo.colsMap.put("mixRetryTime", "INTEGER");
        mAutoDBInfo.columns[5] = "available";
        mAutoDBInfo.colsMap.put("available", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " baseItemData BLOB,  timeStamp LONG,  storyLocalId INTEGER,  mixFlag INTEGER,  mixRetryTime INTEGER,  available INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38692w8)) {
            return false;
        }
        C38692w8 w8Var = (C38692w8) iAutoDBItem;
        return C46238a.m51546a(this.field_baseItemData, w8Var.field_baseItemData) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(w8Var.field_timeStamp)) && C46238a.m51546a(Integer.valueOf(this.field_storyLocalId), Integer.valueOf(w8Var.field_storyLocalId)) && C46238a.m51546a(Integer.valueOf(this.field_mixFlag), Integer.valueOf(w8Var.field_mixFlag)) && C46238a.m51546a(Integer.valueOf(this.field_mixRetryTime), Integer.valueOf(w8Var.field_mixRetryTime)) && C46238a.m51546a(Integer.valueOf(this.field_available), Integer.valueOf(w8Var.field_available));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104141o == hashCode) {
                    try {
                        this.field_baseItemData = cursor.getBlob(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104142p == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104143q == hashCode) {
                    try {
                        this.field_storyLocalId = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104144r == hashCode) {
                    try {
                        this.field_mixFlag = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104145s == hashCode) {
                    try {
                        this.field_mixRetryTime = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104146t == hashCode) {
                    try {
                        this.field_available = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104147u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104150d) {
            contentValues.put("baseItemData", this.field_baseItemData);
        }
        if (this.f104151e) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        if (this.f104152f) {
            contentValues.put("storyLocalId", Integer.valueOf(this.field_storyLocalId));
        }
        if (this.f104153g) {
            contentValues.put("mixFlag", Integer.valueOf(this.field_mixFlag));
        }
        if (this.f104154h) {
            contentValues.put("mixRetryTime", Integer.valueOf(this.field_mixRetryTime));
        }
        if (this.f104155i) {
            contentValues.put("available", Integer.valueOf(this.field_available));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStoryEditorInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS StoryEditorInfo ( " + f104148v.sql + ");");
        for (String add : f104140n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStoryEditorInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("StoryEditorInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104148v, "StoryEditorInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStoryEditorInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("StoryEditorInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStoryEditorInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104148v;
    }

    public String[] getIndexCreateSQL() {
        return f104140n;
    }

    public StorageObserverOwner<C38692w8> getObserverOwner() {
        return f104149w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104139j;
    }

    public String getTableName() {
        return f104139j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("baseItemData")) {
            this.field_baseItemData = contentValues.getAsByteArray("baseItemData");
            if (z) {
                this.f104150d = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f104151e = true;
            }
        }
        if (contentValues.containsKey("storyLocalId")) {
            this.field_storyLocalId = contentValues.getAsInteger("storyLocalId").intValue();
            if (z) {
                this.f104152f = true;
            }
        }
        if (contentValues.containsKey("mixFlag")) {
            this.field_mixFlag = contentValues.getAsInteger("mixFlag").intValue();
            if (z) {
                this.f104153g = true;
            }
        }
        if (contentValues.containsKey("mixRetryTime")) {
            this.field_mixRetryTime = contentValues.getAsInteger("mixRetryTime").intValue();
            if (z) {
                this.f104154h = true;
            }
        }
        if (contentValues.containsKey("available")) {
            this.field_available = contentValues.getAsInteger("available").intValue();
            if (z) {
                this.f104155i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
