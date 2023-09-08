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

/* renamed from: xh.z */
public class C38709z extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f104371g;

    /* renamed from: h */
    public static final String[] f104372h = new String[0];

    /* renamed from: i */
    public static final int f104373i = 93028124;

    /* renamed from: j */
    public static final int f104374j = 1484112759;

    /* renamed from: n */
    public static final int f104375n = 806500198;

    /* renamed from: o */
    public static final int f104376o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f104377p = initAutoDBInfo(C38709z.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38709z> f104378q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104379d = true;

    /* renamed from: e */
    public boolean f104380e = true;

    /* renamed from: f */
    public boolean f104381f = true;
    public String field_appId;
    public int field_appVersion;
    public int field_isSeparatedPluginsUsed;

    static {
        SingleTable singleTable = new SingleTable("AppBrandSeparatedPluginsCompatMarkTable");
        f104371g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("isSeparatedPluginsUsed", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER");
        mAutoDBInfo.columns[2] = "isSeparatedPluginsUsed";
        mAutoDBInfo.colsMap.put("isSeparatedPluginsUsed", "INTEGER");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  appVersion INTEGER,  isSeparatedPluginsUsed INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38709z)) {
            return false;
        }
        C38709z zVar = (C38709z) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, zVar.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(zVar.field_appVersion)) && C46238a.m51546a(Integer.valueOf(this.field_isSeparatedPluginsUsed), Integer.valueOf(zVar.field_isSeparatedPluginsUsed));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104373i == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104374j == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104375n == hashCode) {
                    try {
                        this.field_isSeparatedPluginsUsed = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104376o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104379d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104380e) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f104381f) {
            contentValues.put("isSeparatedPluginsUsed", Integer.valueOf(this.field_isSeparatedPluginsUsed));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandSeparatedPluginsCompatMarkTable ( " + f104377p.sql + ");");
        for (String add : f104372h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandSeparatedPluginsCompatMarkTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104377p, "AppBrandSeparatedPluginsCompatMarkTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandSeparatedPluginsCompatMarkTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104377p;
    }

    public String[] getIndexCreateSQL() {
        return f104372h;
    }

    public StorageObserverOwner<C38709z> getObserverOwner() {
        return f104378q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104371g;
    }

    public String getTableName() {
        return f104371g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104379d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f104380e = true;
            }
        }
        if (contentValues.containsKey("isSeparatedPluginsUsed")) {
            this.field_isSeparatedPluginsUsed = contentValues.getAsInteger("isSeparatedPluginsUsed").intValue();
            if (z) {
                this.f104381f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
