package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
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

/* renamed from: xh.f */
public class C38556f extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102194n;

    /* renamed from: o */
    public static final String[] f102195o = new String[0];

    /* renamed from: p */
    public static final int f102196p = -433508483;

    /* renamed from: q */
    public static final int f102197q = -105740141;

    /* renamed from: r */
    public static final int f102198r = 1017037727;

    /* renamed from: s */
    public static final int f102199s = 1369213417;

    /* renamed from: t */
    public static final int f102200t = -896505829;

    /* renamed from: u */
    public static final int f102201u = -832250383;

    /* renamed from: v */
    public static final int f102202v = -258997875;

    /* renamed from: w */
    public static final int f102203w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102204x = initAutoDBInfo(C38556f.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38556f> f102205y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102206d = true;

    /* renamed from: e */
    public boolean f102207e = true;

    /* renamed from: f */
    public boolean f102208f = true;
    public String field_cacheKey;
    public long field_canvasId;
    public String field_canvasXml;
    public long field_createTime;
    public String field_dynamicInfo;
    public int field_source;
    public String field_uxInfo;

    /* renamed from: g */
    public boolean f102209g = true;

    /* renamed from: h */
    public boolean f102210h = true;

    /* renamed from: i */
    public boolean f102211i = true;

    /* renamed from: j */
    public boolean f102212j = true;

    static {
        SingleTable singleTable = new SingleTable("AdCanvasCacheInfo");
        f102194n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("cacheKey", "string", singleTable.getName(), "");
        new Column("canvasId", "long", singleTable.getName(), "");
        new Column("canvasXml", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
        new Column("uxInfo", "string", singleTable.getName(), "");
        new Column("dynamicInfo", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "cacheKey";
        mAutoDBInfo.colsMap.put("cacheKey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "cacheKey";
        mAutoDBInfo.columns[1] = "canvasId";
        mAutoDBInfo.colsMap.put("canvasId", "LONG");
        mAutoDBInfo.columns[2] = "canvasXml";
        mAutoDBInfo.colsMap.put("canvasXml", "TEXT");
        mAutoDBInfo.columns[3] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[4] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER");
        mAutoDBInfo.columns[5] = "uxInfo";
        mAutoDBInfo.colsMap.put("uxInfo", "TEXT");
        mAutoDBInfo.columns[6] = "dynamicInfo";
        mAutoDBInfo.colsMap.put("dynamicInfo", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " cacheKey TEXT PRIMARY KEY ,  canvasId LONG,  canvasXml TEXT,  createTime LONG,  source INTEGER,  uxInfo TEXT,  dynamicInfo TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38556f)) {
            return false;
        }
        C38556f fVar = (C38556f) iAutoDBItem;
        return C46238a.m51546a(this.field_cacheKey, fVar.field_cacheKey) && C46238a.m51546a(Long.valueOf(this.field_canvasId), Long.valueOf(fVar.field_canvasId)) && C46238a.m51546a(this.field_canvasXml, fVar.field_canvasXml) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(fVar.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(fVar.field_source)) && C46238a.m51546a(this.field_uxInfo, fVar.field_uxInfo) && C46238a.m51546a(this.field_dynamicInfo, fVar.field_dynamicInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102196p == hashCode) {
                    try {
                        this.field_cacheKey = cursor.getString(i);
                        this.f102206d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102197q == hashCode) {
                    try {
                        this.field_canvasId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102198r == hashCode) {
                    try {
                        this.field_canvasXml = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102199s == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102200t == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102201u == hashCode) {
                    try {
                        this.field_uxInfo = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102202v == hashCode) {
                    try {
                        this.field_dynamicInfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAdCanvasCacheInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102203w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102206d) {
            contentValues.put("cacheKey", this.field_cacheKey);
        }
        if (this.f102207e) {
            contentValues.put("canvasId", Long.valueOf(this.field_canvasId));
        }
        if (this.f102208f) {
            contentValues.put("canvasXml", this.field_canvasXml);
        }
        if (this.f102209g) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f102210h) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        if (this.f102211i) {
            contentValues.put("uxInfo", this.field_uxInfo);
        }
        if (this.f102212j) {
            contentValues.put("dynamicInfo", this.field_dynamicInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AdCanvasCacheInfo ( " + f102204x.sql + ");");
        for (String add : f102195o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AdCanvasCacheInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102204x, "AdCanvasCacheInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AdCanvasCacheInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102204x;
    }

    public String[] getIndexCreateSQL() {
        return f102195o;
    }

    public StorageObserverOwner<C38556f> getObserverOwner() {
        return f102205y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_cacheKey;
    }

    public SingleTable getTable() {
        return f102194n;
    }

    public String getTableName() {
        return f102194n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("cacheKey")) {
            this.field_cacheKey = contentValues.getAsString("cacheKey");
            if (z) {
                this.f102206d = true;
            }
        }
        if (contentValues.containsKey("canvasId")) {
            this.field_canvasId = contentValues.getAsLong("canvasId").longValue();
            if (z) {
                this.f102207e = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.field_canvasXml = contentValues.getAsString("canvasXml");
            if (z) {
                this.f102208f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f102209g = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f102210h = true;
            }
        }
        if (contentValues.containsKey("uxInfo")) {
            this.field_uxInfo = contentValues.getAsString("uxInfo");
            if (z) {
                this.f102211i = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.field_dynamicInfo = contentValues.getAsString("dynamicInfo");
            if (z) {
                this.f102212j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
