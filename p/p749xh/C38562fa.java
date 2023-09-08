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

/* renamed from: xh.fa */
public class C38562fa extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102287n;

    /* renamed from: o */
    public static final String[] f102288o = new String[0];

    /* renamed from: p */
    public static final int f102289p = 93028124;

    /* renamed from: q */
    public static final int f102290q = -318790598;

    /* renamed from: r */
    public static final int f102291r = 303221490;

    /* renamed from: s */
    public static final int f102292s = -803559328;

    /* renamed from: t */
    public static final int f102293t = -295931082;

    /* renamed from: u */
    public static final int f102294u = -1142019503;

    /* renamed from: v */
    public static final int f102295v = 1346576739;

    /* renamed from: w */
    public static final int f102296w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102297x = initAutoDBInfo(C38562fa.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38562fa> f102298y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102299d = true;

    /* renamed from: e */
    public boolean f102300e = true;

    /* renamed from: f */
    public boolean f102301f = true;
    public long field_accessTime;
    public String field_appId;
    public String field_appVersionId;
    public String field_cacheFilePath;
    public String field_commLibVersionId;
    public String field_pageURL;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f102302g = true;

    /* renamed from: h */
    public boolean f102303h = true;

    /* renamed from: i */
    public boolean f102304i = true;

    /* renamed from: j */
    public boolean f102305j = true;

    static {
        SingleTable singleTable = new SingleTable("WxaAppWebRenderingCacheAccessStatsTable");
        f102287n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("commLibVersionId", "string", singleTable.getName(), "");
        new Column("appVersionId", "string", singleTable.getName(), "");
        new Column("pageURL", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("accessTime", "long", singleTable.getName(), "");
        new Column("cacheFilePath", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "commLibVersionId";
        mAutoDBInfo.colsMap.put("commLibVersionId", "TEXT");
        mAutoDBInfo.columns[2] = "appVersionId";
        mAutoDBInfo.colsMap.put("appVersionId", "TEXT");
        mAutoDBInfo.columns[3] = "pageURL";
        mAutoDBInfo.colsMap.put("pageURL", "TEXT");
        mAutoDBInfo.columns[4] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[5] = "accessTime";
        mAutoDBInfo.colsMap.put("accessTime", "LONG");
        mAutoDBInfo.columns[6] = "cacheFilePath";
        mAutoDBInfo.colsMap.put("cacheFilePath", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  commLibVersionId TEXT,  appVersionId TEXT,  pageURL TEXT,  updateTime LONG,  accessTime LONG,  cacheFilePath TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38562fa)) {
            return false;
        }
        C38562fa faVar = (C38562fa) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, faVar.field_appId) && C46238a.m51546a(this.field_commLibVersionId, faVar.field_commLibVersionId) && C46238a.m51546a(this.field_appVersionId, faVar.field_appVersionId) && C46238a.m51546a(this.field_pageURL, faVar.field_pageURL) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(faVar.field_updateTime)) && C46238a.m51546a(Long.valueOf(this.field_accessTime), Long.valueOf(faVar.field_accessTime)) && C46238a.m51546a(this.field_cacheFilePath, faVar.field_cacheFilePath);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102289p == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102290q == hashCode) {
                    try {
                        this.field_commLibVersionId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102291r == hashCode) {
                    try {
                        this.field_appVersionId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102292s == hashCode) {
                    try {
                        this.field_pageURL = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102293t == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102294u == hashCode) {
                    try {
                        this.field_accessTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102295v == hashCode) {
                    try {
                        this.field_cacheFilePath = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102296w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102299d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f102300e) {
            contentValues.put("commLibVersionId", this.field_commLibVersionId);
        }
        if (this.f102301f) {
            contentValues.put("appVersionId", this.field_appVersionId);
        }
        if (this.f102302g) {
            contentValues.put("pageURL", this.field_pageURL);
        }
        if (this.f102303h) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f102304i) {
            contentValues.put("accessTime", Long.valueOf(this.field_accessTime));
        }
        if (this.f102305j) {
            contentValues.put("cacheFilePath", this.field_cacheFilePath);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaAppWebRenderingCacheAccessStatsTable ( " + f102297x.sql + ");");
        for (String add : f102288o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaAppWebRenderingCacheAccessStatsTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102297x, "WxaAppWebRenderingCacheAccessStatsTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaAppWebRenderingCacheAccessStatsTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102297x;
    }

    public String[] getIndexCreateSQL() {
        return f102288o;
    }

    public StorageObserverOwner<C38562fa> getObserverOwner() {
        return f102298y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102287n;
    }

    public String getTableName() {
        return f102287n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f102299d = true;
            }
        }
        if (contentValues.containsKey("commLibVersionId")) {
            this.field_commLibVersionId = contentValues.getAsString("commLibVersionId");
            if (z) {
                this.f102300e = true;
            }
        }
        if (contentValues.containsKey("appVersionId")) {
            this.field_appVersionId = contentValues.getAsString("appVersionId");
            if (z) {
                this.f102301f = true;
            }
        }
        if (contentValues.containsKey("pageURL")) {
            this.field_pageURL = contentValues.getAsString("pageURL");
            if (z) {
                this.f102302g = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f102303h = true;
            }
        }
        if (contentValues.containsKey("accessTime")) {
            this.field_accessTime = contentValues.getAsLong("accessTime").longValue();
            if (z) {
                this.f102304i = true;
            }
        }
        if (contentValues.containsKey("cacheFilePath")) {
            this.field_cacheFilePath = contentValues.getAsString("cacheFilePath");
            if (z) {
                this.f102305j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
