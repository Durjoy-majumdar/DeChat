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

/* renamed from: xh.x */
public class C38694x extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f104173g;

    /* renamed from: h */
    public static final String[] f104174h = {"CREATE INDEX IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTableAppIdIndex ON AppBrandPrefetchWxaAttrsMarkTable(appId)"};

    /* renamed from: i */
    public static final int f104175i = -265713450;

    /* renamed from: j */
    public static final int f104176j = 93028124;

    /* renamed from: n */
    public static final int f104177n = -1021704051;

    /* renamed from: o */
    public static final int f104178o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f104179p = initAutoDBInfo(C38694x.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38694x> f104180q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104181d = true;

    /* renamed from: e */
    public boolean f104182e = true;

    /* renamed from: f */
    public boolean f104183f = true;
    public String field_appId;
    public long field_prefetchUpdateTime;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("AppBrandPrefetchWxaAttrsMarkTable");
        f104173g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("prefetchUpdateTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[2] = "prefetchUpdateTime";
        mAutoDBInfo.colsMap.put("prefetchUpdateTime", "LONG");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  appId TEXT,  prefetchUpdateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38694x)) {
            return false;
        }
        C38694x xVar = (C38694x) iAutoDBItem;
        return C46238a.m51546a(this.field_username, xVar.field_username) && C46238a.m51546a(this.field_appId, xVar.field_appId) && C46238a.m51546a(Long.valueOf(this.field_prefetchUpdateTime), Long.valueOf(xVar.field_prefetchUpdateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104175i == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f104181d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104176j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104177n == hashCode) {
                    try {
                        this.field_prefetchUpdateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104178o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104181d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f104182e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104183f) {
            contentValues.put("prefetchUpdateTime", Long.valueOf(this.field_prefetchUpdateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTable ( " + f104179p.sql + ");");
        for (String add : f104174h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandPrefetchWxaAttrsMarkTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104179p, "AppBrandPrefetchWxaAttrsMarkTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandPrefetchWxaAttrsMarkTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104179p;
    }

    public String[] getIndexCreateSQL() {
        return f104174h;
    }

    public StorageObserverOwner<C38694x> getObserverOwner() {
        return f104180q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f104173g;
    }

    public String getTableName() {
        return f104173g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f104181d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104182e = true;
            }
        }
        if (contentValues.containsKey("prefetchUpdateTime")) {
            this.field_prefetchUpdateTime = contentValues.getAsLong("prefetchUpdateTime").longValue();
            if (z) {
                this.f104183f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
