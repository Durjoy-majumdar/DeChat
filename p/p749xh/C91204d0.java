package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* renamed from: xh.d0 */
public class C91204d0 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f261481n;

    /* renamed from: o */
    public static final String[] f261482o = new String[0];

    /* renamed from: p */
    public static final int f261483p = 93028124;

    /* renamed from: q */
    public static final int f261484q = 351608024;

    /* renamed from: r */
    public static final int f261485r = 908960928;

    /* renamed from: s */
    public static final int f261486s = 29312057;

    /* renamed from: t */
    public static final int f261487t = -896505829;

    /* renamed from: u */
    public static final int f261488u = -1346432708;

    /* renamed from: v */
    public static final int f261489v = -427040401;

    /* renamed from: w */
    public static final int f261490w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f261491x = initAutoDBInfo(C91204d0.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C91204d0> f261492y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f261493d = true;

    /* renamed from: e */
    public boolean f261494e = true;

    /* renamed from: f */
    public boolean f261495f = true;
    public String field_appId;
    public int field_hitCount;
    public String field_packageKey;
    public int field_packageType;
    public int field_reportId;
    public int field_source;
    public int field_version;

    /* renamed from: g */
    public boolean f261496g = true;

    /* renamed from: h */
    public boolean f261497h = true;

    /* renamed from: i */
    public boolean f261498i = true;

    /* renamed from: j */
    public boolean f261499j = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandWxaPkgPreDownloadStatistics2");
        f261481n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("packageType", "int", singleTable.getName(), "");
        new Column("packageKey", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
        new Column("hitCount", "int", singleTable.getName(), "");
        new Column("reportId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[2] = "packageType";
        mAutoDBInfo.colsMap.put("packageType", "INTEGER");
        mAutoDBInfo.columns[3] = "packageKey";
        mAutoDBInfo.colsMap.put("packageKey", "TEXT");
        mAutoDBInfo.columns[4] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "hitCount";
        mAutoDBInfo.colsMap.put("hitCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "reportId";
        mAutoDBInfo.colsMap.put("reportId", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  version INTEGER,  packageType INTEGER,  packageKey TEXT,  source INTEGER default '0' ,  hitCount INTEGER default '0' ,  reportId INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91204d0)) {
            return false;
        }
        C91204d0 d0Var = (C91204d0) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, d0Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(d0Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_packageType), Integer.valueOf(d0Var.field_packageType)) && C46238a.m51546a(this.field_packageKey, d0Var.field_packageKey) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(d0Var.field_source)) && C46238a.m51546a(Integer.valueOf(this.field_hitCount), Integer.valueOf(d0Var.field_hitCount)) && C46238a.m51546a(Integer.valueOf(this.field_reportId), Integer.valueOf(d0Var.field_reportId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261483p == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261484q == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261485r == hashCode) {
                    try {
                        this.field_packageType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261486s == hashCode) {
                    try {
                        this.field_packageKey = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261487t == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261488u == hashCode) {
                    try {
                        this.field_hitCount = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261489v == hashCode) {
                    try {
                        this.field_reportId = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261490w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261493d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f261494e) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f261495f) {
            contentValues.put("packageType", Integer.valueOf(this.field_packageType));
        }
        if (this.f261496g) {
            contentValues.put("packageKey", this.field_packageKey);
        }
        if (this.f261497h) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        if (this.f261498i) {
            contentValues.put("hitCount", Integer.valueOf(this.field_hitCount));
        }
        if (this.f261499j) {
            contentValues.put("reportId", Integer.valueOf(this.field_reportId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgPreDownloadStatistics2 ( " + f261491x.sql + ");");
        for (String add : f261482o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandWxaPkgPreDownloadStatistics2", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261491x, "AppBrandWxaPkgPreDownloadStatistics2", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandWxaPkgPreDownloadStatistics2", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261491x;
    }

    public String[] getIndexCreateSQL() {
        return f261482o;
    }

    public StorageObserverOwner<C91204d0> getObserverOwner() {
        return f261492y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261481n;
    }

    public String getTableName() {
        return f261481n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f261493d = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f261494e = true;
            }
        }
        if (contentValues.containsKey("packageType")) {
            this.field_packageType = contentValues.getAsInteger("packageType").intValue();
            if (z) {
                this.f261495f = true;
            }
        }
        if (contentValues.containsKey("packageKey")) {
            this.field_packageKey = contentValues.getAsString("packageKey");
            if (z) {
                this.f261496g = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f261497h = true;
            }
        }
        if (contentValues.containsKey("hitCount")) {
            this.field_hitCount = contentValues.getAsInteger("hitCount").intValue();
            if (z) {
                this.f261498i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.field_reportId = contentValues.getAsInteger("reportId").intValue();
            if (z) {
                this.f261499j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
