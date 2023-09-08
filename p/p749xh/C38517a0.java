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

/* renamed from: xh.a0 */
public class C38517a0 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f101568h;

    /* renamed from: i */
    public static final String[] f101569i = {"CREATE INDEX IF NOT EXISTS AppBrandStarAppUpdateTimeIndex ON AppBrandStarApp(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandStarAppOrderSequenceIndex ON AppBrandStarApp(orderSequence)"};

    /* renamed from: j */
    public static final int f101570j = -265713450;

    /* renamed from: n */
    public static final int f101571n = 689108018;

    /* renamed from: o */
    public static final int f101572o = -295931082;

    /* renamed from: p */
    public static final int f101573p = -1124125393;

    /* renamed from: q */
    public static final int f101574q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f101575r = initAutoDBInfo(C38517a0.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38517a0> f101576s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101577d = true;

    /* renamed from: e */
    public boolean f101578e = true;

    /* renamed from: f */
    public boolean f101579f = true;
    public long field_orderSequence;
    public long field_updateTime;
    public String field_username;
    public int field_versionType;

    /* renamed from: g */
    public boolean f101580g = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandStarApp");
        f101568h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("orderSequence", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[2] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[3] = "orderSequence";
        mAutoDBInfo.colsMap.put("orderSequence", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  versionType INTEGER,  updateTime LONG,  orderSequence LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38517a0)) {
            return false;
        }
        C38517a0 a0Var = (C38517a0) iAutoDBItem;
        return C46238a.m51546a(this.field_username, a0Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(a0Var.field_versionType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(a0Var.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_orderSequence), Long.valueOf(a0Var.field_orderSequence));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101570j == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandStarApp", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101571n == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandStarApp", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101572o == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandStarApp", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101573p == hashCode) {
                    try {
                        this.field_orderSequence = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandStarApp", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101574q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101577d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f101578e) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f101579f) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f101580g) {
            contentValues.put("orderSequence", Long.valueOf(this.field_orderSequence));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandStarApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandStarApp ( " + f101575r.sql + ");");
        for (String add : f101569i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandStarApp", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandStarApp", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101575r, "AppBrandStarApp", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandStarApp", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandStarApp", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandStarApp", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101575r;
    }

    public String[] getIndexCreateSQL() {
        return f101569i;
    }

    public StorageObserverOwner<C38517a0> getObserverOwner() {
        return f101576s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101568h;
    }

    public String getTableName() {
        return f101568h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f101577d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f101578e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f101579f = true;
            }
        }
        if (contentValues.containsKey("orderSequence")) {
            this.field_orderSequence = contentValues.getAsLong("orderSequence").longValue();
            if (z) {
                this.f101580g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
