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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.u */
public class C38671u extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f103839n;

    /* renamed from: o */
    public static final String[] f103840o = {"CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)"};

    /* renamed from: p */
    public static final int f103841p = -799234740;

    /* renamed from: q */
    public static final int f103842q = 137727746;

    /* renamed from: r */
    public static final int f103843r = 689108018;

    /* renamed from: s */
    public static final int f103844s = -295931082;

    /* renamed from: t */
    public static final int f103845t = 109254796;

    /* renamed from: u */
    public static final int f103846u = 1790162568;

    /* renamed from: v */
    public static final int f103847v = -1987034253;

    /* renamed from: w */
    public static final int f103848w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f103849x = initAutoDBInfo(C38671u.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38671u> f103850y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103851d = true;

    /* renamed from: e */
    public boolean f103852e = true;

    /* renamed from: f */
    public boolean f103853f = true;
    public String field_brandId;
    public int field_recordId;
    public int field_scene;
    public String field_thirdPartyAppUsingDesc;
    public long field_updateTime;
    public boolean field_usedInThirdPartyAppRecently;
    public int field_versionType;

    /* renamed from: g */
    public boolean f103854g = true;

    /* renamed from: h */
    public boolean f103855h = true;

    /* renamed from: i */
    public boolean f103856i = true;

    /* renamed from: j */
    public boolean f103857j = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandLauncherLayoutItem");
        f103839n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("recordId", "int", singleTable.getName(), "");
        new Column("brandId", "string", singleTable.getName(), "");
        new Column("versionType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("usedInThirdPartyAppRecently", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("thirdPartyAppUsingDesc", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "recordId";
        mAutoDBInfo.colsMap.put("recordId", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "recordId";
        mAutoDBInfo.columns[1] = "brandId";
        mAutoDBInfo.colsMap.put("brandId", "TEXT");
        mAutoDBInfo.columns[2] = "versionType";
        mAutoDBInfo.colsMap.put("versionType", "INTEGER");
        mAutoDBInfo.columns[3] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[4] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[5] = "usedInThirdPartyAppRecently";
        mAutoDBInfo.colsMap.put("usedInThirdPartyAppRecently", "INTEGER default 'false' ");
        mAutoDBInfo.columns[6] = "thirdPartyAppUsingDesc";
        mAutoDBInfo.colsMap.put("thirdPartyAppUsingDesc", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " recordId INTEGER PRIMARY KEY ,  brandId TEXT,  versionType INTEGER,  updateTime LONG,  scene INTEGER,  usedInThirdPartyAppRecently INTEGER default 'false' ,  thirdPartyAppUsingDesc TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38671u)) {
            return false;
        }
        C38671u uVar = (C38671u) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_recordId), Integer.valueOf(uVar.field_recordId)) && C46238a.m51546a(this.field_brandId, uVar.field_brandId) && C46238a.m51546a(Integer.valueOf(this.field_versionType), Integer.valueOf(uVar.field_versionType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(uVar.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(uVar.field_scene)) && C46238a.m51546a(Boolean.valueOf(this.field_usedInThirdPartyAppRecently), Boolean.valueOf(uVar.field_usedInThirdPartyAppRecently)) && C46238a.m51546a(this.field_thirdPartyAppUsingDesc, uVar.field_thirdPartyAppUsingDesc);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103841p == hashCode) {
                    try {
                        this.field_recordId = cursor.getInt(i);
                        this.f103851d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103842q == hashCode) {
                    try {
                        this.field_brandId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103843r == hashCode) {
                    try {
                        this.field_versionType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103844s == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103845t == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103846u == hashCode) {
                    try {
                        this.field_usedInThirdPartyAppRecently = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103847v == hashCode) {
                    try {
                        this.field_thirdPartyAppUsingDesc = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103848w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103851d) {
            contentValues.put("recordId", Integer.valueOf(this.field_recordId));
        }
        if (this.f103852e) {
            contentValues.put("brandId", this.field_brandId);
        }
        if (this.f103853f) {
            contentValues.put("versionType", Integer.valueOf(this.field_versionType));
        }
        if (this.f103854g) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f103855h) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f103856i) {
            if (this.field_usedInThirdPartyAppRecently) {
                contentValues.put("usedInThirdPartyAppRecently", 1);
            } else {
                contentValues.put("usedInThirdPartyAppRecently", 0);
            }
        }
        if (this.f103857j) {
            contentValues.put("thirdPartyAppUsingDesc", this.field_thirdPartyAppUsingDesc);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandLauncherLayoutItem ( " + f103849x.sql + ");");
        for (String add : f103840o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandLauncherLayoutItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103849x, "AppBrandLauncherLayoutItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandLauncherLayoutItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103849x;
    }

    public String[] getIndexCreateSQL() {
        return f103840o;
    }

    public StorageObserverOwner<C38671u> getObserverOwner() {
        return f103850y;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_recordId);
    }

    public SingleTable getTable() {
        return f103839n;
    }

    public String getTableName() {
        return f103839n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("recordId")) {
            this.field_recordId = contentValues.getAsInteger("recordId").intValue();
            if (z) {
                this.f103851d = true;
            }
        }
        if (contentValues.containsKey("brandId")) {
            this.field_brandId = contentValues.getAsString("brandId");
            if (z) {
                this.f103852e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.field_versionType = contentValues.getAsInteger("versionType").intValue();
            if (z) {
                this.f103853f = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103854g = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103855h = true;
            }
        }
        if (contentValues.containsKey("usedInThirdPartyAppRecently")) {
            this.field_usedInThirdPartyAppRecently = contentValues.getAsInteger("usedInThirdPartyAppRecently").intValue() != 0;
            if (z) {
                this.f103856i = true;
            }
        }
        if (contentValues.containsKey("thirdPartyAppUsingDesc")) {
            this.field_thirdPartyAppUsingDesc = contentValues.getAsString("thirdPartyAppUsingDesc");
            if (z) {
                this.f103857j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
