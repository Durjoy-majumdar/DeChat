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

/* renamed from: xh.w */
public class C38688w extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104037i;

    /* renamed from: j */
    public static final String[] f104038j = new String[0];

    /* renamed from: n */
    public static final int f104039n = 93028124;

    /* renamed from: o */
    public static final int f104040o = 1704796520;

    /* renamed from: p */
    public static final int f104041p = 1015916206;

    /* renamed from: q */
    public static final int f104042q = 558083068;

    /* renamed from: r */
    public static final int f104043r = 755532886;

    /* renamed from: s */
    public static final int f104044s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104045t = initAutoDBInfo(C38688w.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38688w> f104046u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104047d = true;

    /* renamed from: e */
    public boolean f104048e = true;

    /* renamed from: f */
    public boolean f104049f = true;
    public String field_appId;
    public int field_appServiceType;
    public long field_lastLaunchTime;
    public int field_maxFileStorageSize;
    public int field_wechatPluginApp;

    /* renamed from: g */
    public boolean f104050g = true;

    /* renamed from: h */
    public boolean f104051h = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandMessInfoRecord");
        f104037i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("wechatPluginApp", "int", singleTable.getName(), "");
        new Column("appServiceType", "int", singleTable.getName(), "");
        new Column("maxFileStorageSize", "int", singleTable.getName(), "");
        new Column("lastLaunchTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "wechatPluginApp";
        mAutoDBInfo.colsMap.put("wechatPluginApp", "INTEGER default '-1' ");
        mAutoDBInfo.columns[2] = "appServiceType";
        mAutoDBInfo.colsMap.put("appServiceType", "INTEGER default '-1' ");
        mAutoDBInfo.columns[3] = "maxFileStorageSize";
        mAutoDBInfo.colsMap.put("maxFileStorageSize", "INTEGER default '-1' ");
        mAutoDBInfo.columns[4] = "lastLaunchTime";
        mAutoDBInfo.colsMap.put("lastLaunchTime", "LONG");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  wechatPluginApp INTEGER default '-1' ,  appServiceType INTEGER default '-1' ,  maxFileStorageSize INTEGER default '-1' ,  lastLaunchTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38688w)) {
            return false;
        }
        C38688w wVar = (C38688w) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, wVar.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_wechatPluginApp), Integer.valueOf(wVar.field_wechatPluginApp)) && C46238a.m51546a(Integer.valueOf(this.field_appServiceType), Integer.valueOf(wVar.field_appServiceType)) && C46238a.m51546a(Integer.valueOf(this.field_maxFileStorageSize), Integer.valueOf(wVar.field_maxFileStorageSize)) && C46238a.m51546a(Long.valueOf(this.field_lastLaunchTime), Long.valueOf(wVar.field_lastLaunchTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104039n == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f104047d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104040o == hashCode) {
                    try {
                        this.field_wechatPluginApp = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104041p == hashCode) {
                    try {
                        this.field_appServiceType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104042q == hashCode) {
                    try {
                        this.field_maxFileStorageSize = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104043r == hashCode) {
                    try {
                        this.field_lastLaunchTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104044s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104047d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f104048e) {
            contentValues.put("wechatPluginApp", Integer.valueOf(this.field_wechatPluginApp));
        }
        if (this.f104049f) {
            contentValues.put("appServiceType", Integer.valueOf(this.field_appServiceType));
        }
        if (this.f104050g) {
            contentValues.put("maxFileStorageSize", Integer.valueOf(this.field_maxFileStorageSize));
        }
        if (this.f104051h) {
            contentValues.put("lastLaunchTime", Long.valueOf(this.field_lastLaunchTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandMessInfoRecord ( " + f104045t.sql + ");");
        for (String add : f104038j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandMessInfoRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104045t, "AppBrandMessInfoRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandMessInfoRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104045t;
    }

    public String[] getIndexCreateSQL() {
        return f104038j;
    }

    public StorageObserverOwner<C38688w> getObserverOwner() {
        return f104046u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f104037i;
    }

    public String getTableName() {
        return f104037i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f104047d = true;
            }
        }
        if (contentValues.containsKey("wechatPluginApp")) {
            this.field_wechatPluginApp = contentValues.getAsInteger("wechatPluginApp").intValue();
            if (z) {
                this.f104048e = true;
            }
        }
        if (contentValues.containsKey("appServiceType")) {
            this.field_appServiceType = contentValues.getAsInteger("appServiceType").intValue();
            if (z) {
                this.f104049f = true;
            }
        }
        if (contentValues.containsKey("maxFileStorageSize")) {
            this.field_maxFileStorageSize = contentValues.getAsInteger("maxFileStorageSize").intValue();
            if (z) {
                this.f104050g = true;
            }
        }
        if (contentValues.containsKey("lastLaunchTime")) {
            this.field_lastLaunchTime = contentValues.getAsLong("lastLaunchTime").longValue();
            if (z) {
                this.f104051h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
