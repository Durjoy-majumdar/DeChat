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
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.z8 */
public class C38714z8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104440i;

    /* renamed from: j */
    public static final String[] f104441j = new String[0];

    /* renamed from: n */
    public static final int f104442n = -1884251920;

    /* renamed from: o */
    public static final int f104443o = 116079;

    /* renamed from: p */
    public static final int f104444p = -735662143;

    /* renamed from: q */
    public static final int f104445q = -577311387;

    /* renamed from: r */
    public static final int f104446r = -553618781;

    /* renamed from: s */
    public static final int f104447s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104448t = initAutoDBInfo(C38714z8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38714z8> f104449u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104450d = true;

    /* renamed from: e */
    public boolean f104451e = true;

    /* renamed from: f */
    public boolean f104452f = true;
    public int field_cacheSize;
    public String field_filePath;
    public long field_storyId;
    public int field_totalSize;
    public String field_url;

    /* renamed from: g */
    public boolean f104453g = true;

    /* renamed from: h */
    public boolean f104454h = true;

    static {
        SingleTable singleTable = new SingleTable("StoryVideoCacheInfo");
        f104440i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("storyId", "long", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("totalSize", "int", singleTable.getName(), "");
        new Column("cacheSize", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "storyId";
        mAutoDBInfo.colsMap.put("storyId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "storyId";
        mAutoDBInfo.columns[1] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[2] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        mAutoDBInfo.columns[3] = "totalSize";
        mAutoDBInfo.colsMap.put("totalSize", "INTEGER");
        mAutoDBInfo.columns[4] = "cacheSize";
        mAutoDBInfo.colsMap.put("cacheSize", "INTEGER");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " storyId LONG PRIMARY KEY ,  url TEXT,  filePath TEXT,  totalSize INTEGER,  cacheSize INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38714z8)) {
            return false;
        }
        C38714z8 z8Var = (C38714z8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_storyId), Long.valueOf(z8Var.field_storyId)) && C46238a.m51546a(this.field_url, z8Var.field_url) && C46238a.m51546a(this.field_filePath, z8Var.field_filePath) && C46238a.m51546a(Integer.valueOf(this.field_totalSize), Integer.valueOf(z8Var.field_totalSize)) && C46238a.m51546a(Integer.valueOf(this.field_cacheSize), Integer.valueOf(z8Var.field_cacheSize));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104442n == hashCode) {
                    try {
                        this.field_storyId = cursor.getLong(i);
                        this.f104450d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104443o == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104444p == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104445q == hashCode) {
                    try {
                        this.field_totalSize = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104446r == hashCode) {
                    try {
                        this.field_cacheSize = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStoryVideoCacheInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104447s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104450d) {
            contentValues.put("storyId", Long.valueOf(this.field_storyId));
        }
        if (this.f104451e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f104452f) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f104453g) {
            contentValues.put("totalSize", Integer.valueOf(this.field_totalSize));
        }
        if (this.f104454h) {
            contentValues.put("cacheSize", Integer.valueOf(this.field_cacheSize));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS StoryVideoCacheInfo ( " + f104448t.sql + ");");
        for (String add : f104441j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("StoryVideoCacheInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104448t, "StoryVideoCacheInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("StoryVideoCacheInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104448t;
    }

    public String[] getIndexCreateSQL() {
        return f104441j;
    }

    public StorageObserverOwner<C38714z8> getObserverOwner() {
        return f104449u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_storyId);
    }

    public SingleTable getTable() {
        return f104440i;
    }

    public String getTableName() {
        return f104440i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("storyId")) {
            this.field_storyId = contentValues.getAsLong("storyId").longValue();
            if (z) {
                this.f104450d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f104451e = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f104452f = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsInteger("totalSize").intValue();
            if (z) {
                this.f104453g = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsInteger("cacheSize").intValue();
            if (z) {
                this.f104454h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
