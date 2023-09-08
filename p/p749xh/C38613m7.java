package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
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

/* renamed from: xh.m7 */
public class C38613m7 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103031h;

    /* renamed from: i */
    public static final String[] f103032i = new String[0];

    /* renamed from: j */
    public static final int f103033j = 93028124;

    /* renamed from: n */
    public static final int f103034n = 351608024;

    /* renamed from: o */
    public static final int f103035o = 103315;

    /* renamed from: p */
    public static final int f103036p = 1691165350;

    /* renamed from: q */
    public static final int f103037q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103038r = initAutoDBInfo(C38613m7.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38613m7> f103039s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103040d = true;

    /* renamed from: e */
    public boolean f103041e = true;

    /* renamed from: f */
    public boolean f103042f = true;
    public String field_appId;
    public int field_hit;
    public long field_hitTimeMS;
    public int field_version;

    /* renamed from: g */
    public boolean f103043g = true;

    static {
        SingleTable singleTable = new SingleTable("PluginCodeUsageLRURecord");
        f103031h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("hit", "int", singleTable.getName(), "");
        new Column("hitTimeMS", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[2] = "hit";
        mAutoDBInfo.colsMap.put("hit", "INTEGER");
        mAutoDBInfo.columns[3] = "hitTimeMS";
        mAutoDBInfo.colsMap.put("hitTimeMS", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  version INTEGER,  hit INTEGER,  hitTimeMS LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38613m7)) {
            return false;
        }
        C38613m7 m7Var = (C38613m7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, m7Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(m7Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_hit), Integer.valueOf(m7Var.field_hit)) && C46238a.m51546a(Long.valueOf(this.field_hitTimeMS), Long.valueOf(m7Var.field_hitTimeMS));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103033j == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103034n == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103035o == hashCode) {
                    try {
                        this.field_hit = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103036p == hashCode) {
                    try {
                        this.field_hitTimeMS = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePluginCodeUsageLRURecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103037q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103040d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103041e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f103042f) {
            contentValues.put("hit", Integer.valueOf(this.field_hit));
        }
        if (this.f103043g) {
            contentValues.put("hitTimeMS", Long.valueOf(this.field_hitTimeMS));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PluginCodeUsageLRURecord ( " + f103038r.sql + ");");
        for (String add : f103032i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PluginCodeUsageLRURecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103038r, "PluginCodeUsageLRURecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PluginCodeUsageLRURecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePluginCodeUsageLRURecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103038r;
    }

    public String[] getIndexCreateSQL() {
        return f103032i;
    }

    public StorageObserverOwner<C38613m7> getObserverOwner() {
        return f103039s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103031h;
    }

    public String getTableName() {
        return f103031h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103040d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f103041e = true;
            }
        }
        if (contentValues.containsKey("hit")) {
            this.field_hit = contentValues.getAsInteger("hit").intValue();
            if (z) {
                this.f103042f = true;
            }
        }
        if (contentValues.containsKey("hitTimeMS")) {
            this.field_hitTimeMS = contentValues.getAsLong("hitTimeMS").longValue();
            if (z) {
                this.f103043g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
