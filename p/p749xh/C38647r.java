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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.r */
public class C38647r extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f103448i;

    /* renamed from: j */
    public static final String[] f103449j = {"CREATE INDEX IF NOT EXISTS AppBrandFakeNativeSplashScreenshotAPPIDINDEX ON AppBrandFakeNativeSplashScreenshot(appId)"};

    /* renamed from: n */
    public static final int f103450n = 93028124;

    /* renamed from: o */
    public static final int f103451o = 689108018;

    /* renamed from: p */
    public static final int f103452p = 1484112759;

    /* renamed from: q */
    public static final int f103453q = 947558787;

    /* renamed from: r */
    public static final int f103454r = -484584633;

    /* renamed from: s */
    public static final int f103455s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f103456t = initAutoDBInfo(C38647r.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38647r> f103457u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103458d = true;

    /* renamed from: e */
    public boolean f103459e = true;

    /* renamed from: f */
    public boolean f103460f = true;
    public String field_appId;
    public int field_appVersion;
    public boolean field_isDarkMode;
    public String field_screenshotFilePath;
    public int field_versionType;

    /* renamed from: g */
    public boolean f103461g = true;

    /* renamed from: h */
    public boolean f103462h = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandFakeNativeSplashScreenshot");
        f103448i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column("appVersion", "int", singleTable.getName(), "");
        new Column("isDarkMode", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("screenshotFilePath", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "appVersion";
        mAutoDBInfo.colsMap.put("appVersion", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "isDarkMode";
        mAutoDBInfo.colsMap.put("isDarkMode", "INTEGER default 'false' ");
        mAutoDBInfo.columns[4] = "screenshotFilePath";
        mAutoDBInfo.colsMap.put("screenshotFilePath", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  versionType INTEGER default '0' ,  appVersion INTEGER default '0' ,  isDarkMode INTEGER default 'false' ,  screenshotFilePath TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38647r)) {
            return false;
        }
        C38647r rVar = (C38647r) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, rVar.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(rVar.field_versionType)) && C46238a.m51546a(Integer.valueOf(this.field_appVersion), Integer.valueOf(rVar.field_appVersion)) && C46238a.m51546a(Boolean.valueOf(this.field_isDarkMode), Boolean.valueOf(rVar.field_isDarkMode)) && C46238a.m51546a(this.field_screenshotFilePath, rVar.field_screenshotFilePath);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103450n == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103451o == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103452p == hashCode) {
                    try {
                        this.field_appVersion = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103453q == hashCode) {
                    try {
                        this.field_isDarkMode = cursor.getInt(i) != 0;
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103454r == hashCode) {
                    try {
                        this.field_screenshotFilePath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103455s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103458d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103459e) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f103460f) {
            contentValues.put("appVersion", Integer.valueOf(this.field_appVersion));
        }
        if (this.f103461g) {
            if (this.field_isDarkMode) {
                contentValues.put("isDarkMode", 1);
            } else {
                contentValues.put("isDarkMode", 0);
            }
        }
        if (this.f103462h) {
            contentValues.put("screenshotFilePath", this.field_screenshotFilePath);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandFakeNativeSplashScreenshot ( " + f103456t.sql + ");");
        for (String add : f103449j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandFakeNativeSplashScreenshot", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103456t, "AppBrandFakeNativeSplashScreenshot", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandFakeNativeSplashScreenshot", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103456t;
    }

    public String[] getIndexCreateSQL() {
        return f103449j;
    }

    public StorageObserverOwner<C38647r> getObserverOwner() {
        return f103457u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103448i;
    }

    public String getTableName() {
        return f103448i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103458d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f103459e = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z) {
                this.f103460f = true;
            }
        }
        if (contentValues.containsKey("isDarkMode")) {
            this.field_isDarkMode = contentValues.getAsInteger("isDarkMode").intValue() != 0;
            if (z) {
                this.f103461g = true;
            }
        }
        if (contentValues.containsKey("screenshotFilePath")) {
            this.field_screenshotFilePath = contentValues.getAsString("screenshotFilePath");
            if (z) {
                this.f103462h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
