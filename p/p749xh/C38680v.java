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

/* renamed from: xh.v */
public class C38680v extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103911g;

    /* renamed from: h */
    public static final String[] f103912h = {"CREATE INDEX IF NOT EXISTS AppBrandLocalUsageRecordUpdateTimeIndex ON AppBrandLocalUsageRecord(updateTime)"};

    /* renamed from: i */
    public static final int f103913i = -265713450;

    /* renamed from: j */
    public static final int f103914j = 689108018;

    /* renamed from: n */
    public static final int f103915n = -295931082;

    /* renamed from: o */
    public static final int f103916o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103917p = initAutoDBInfo(C38680v.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38680v> f103918q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103919d = true;

    /* renamed from: e */
    public boolean f103920e = true;

    /* renamed from: f */
    public boolean f103921f = true;
    public long field_updateTime;
    public String field_username;
    public int field_versionType;

    static {
        SingleTable singleTable = new SingleTable("AppBrandLocalUsageRecord");
        f103911g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[2] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  versionType INTEGER,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38680v)) {
            return false;
        }
        C38680v vVar = (C38680v) iAutoDBItem;
        return C46238a.m51546a(this.field_username, vVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(vVar.field_versionType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(vVar.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103913i == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103914j == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103915n == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103916o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103919d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103920e) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f103921f) {
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
            Log.m105920e("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandLocalUsageRecord ( " + f103917p.sql + ");");
        for (String add : f103912h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandLocalUsageRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103917p, "AppBrandLocalUsageRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandLocalUsageRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandLocalUsageRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103917p;
    }

    public String[] getIndexCreateSQL() {
        return f103912h;
    }

    public StorageObserverOwner<C38680v> getObserverOwner() {
        return f103918q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103911g;
    }

    public String getTableName() {
        return f103911g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103919d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f103920e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103921f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
