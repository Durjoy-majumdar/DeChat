package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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

/* renamed from: xh.k4 */
public class C53340k4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f149558A = 1979611260;

    /* renamed from: B */
    public static final int f149559B = -37365261;

    /* renamed from: C */
    public static final int f149560C = 1369213417;

    /* renamed from: D */
    public static final int f149561D = -478077411;

    /* renamed from: E */
    public static final int f149562E = 110371416;

    /* renamed from: F */
    public static final int f149563F = 3079825;

    /* renamed from: G */
    public static final int f149564G = 108705909;

    /* renamed from: H */
    public static final IAutoDBItem.MAutoDBInfo f149565H = initAutoDBInfo(C53340k4.class);

    /* renamed from: I */
    public static final StorageObserverOwner<C53340k4> f149566I = new StorageObserverOwner<>();

    /* renamed from: s */
    public static final SingleTable f149567s;

    /* renamed from: t */
    public static final String[] f149568t = {"CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_UserId ON GameLocalVideoInfo(userId)", "CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_AppId ON GameLocalVideoInfo(appId)"};

    /* renamed from: u */
    public static final int f149569u = -1274507337;

    /* renamed from: v */
    public static final int f149570v = -836030906;

    /* renamed from: w */
    public static final int f149571w = 93028124;

    /* renamed from: x */
    public static final int f149572x = -794136500;

    /* renamed from: y */
    public static final int f149573y = -735662143;

    /* renamed from: z */
    public static final int f149574z = -681075003;

    /* renamed from: d */
    public boolean f149575d = true;

    /* renamed from: e */
    public boolean f149576e = true;

    /* renamed from: f */
    public boolean f149577f = true;
    public String field_appId;
    public String field_appName;
    public String field_coverPath;
    public long field_createTime;
    public String field_desc;
    public long field_durationSec;
    public String field_extJsonData;
    public String field_fileId;
    public String field_filePath;
    public String field_orgFilePath;
    public String field_title;
    public String field_userId;

    /* renamed from: g */
    public boolean f149578g = true;

    /* renamed from: h */
    public boolean f149579h = true;

    /* renamed from: i */
    public boolean f149580i = true;

    /* renamed from: j */
    public boolean f149581j = true;

    /* renamed from: n */
    public boolean f149582n = true;

    /* renamed from: o */
    public boolean f149583o = true;

    /* renamed from: p */
    public boolean f149584p = true;

    /* renamed from: q */
    public boolean f149585q = true;

    /* renamed from: r */
    public boolean f149586r = true;

    static {
        SingleTable singleTable = new SingleTable("GameLocalVideoInfo");
        f149567s = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("fileId", "string", singleTable.getName(), "");
        new Column("userId", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("appName", "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("orgFilePath", "string", singleTable.getName(), "");
        new Column("coverPath", "string", singleTable.getName(), "");
        new Column("extJsonData", "string", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("durationSec", "long", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[12];
        String[] strArr = new String[13];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "fileId";
        mAutoDBInfo.colsMap.put("fileId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "fileId";
        mAutoDBInfo.columns[1] = "userId";
        mAutoDBInfo.colsMap.put("userId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "appName";
        mAutoDBInfo.colsMap.put("appName", "TEXT default '' ");
        mAutoDBInfo.columns[4] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT default '' ");
        mAutoDBInfo.columns[5] = "orgFilePath";
        mAutoDBInfo.colsMap.put("orgFilePath", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "coverPath";
        mAutoDBInfo.colsMap.put("coverPath", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "extJsonData";
        mAutoDBInfo.colsMap.put("extJsonData", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[9] = "durationSec";
        mAutoDBInfo.colsMap.put("durationSec", "LONG");
        mAutoDBInfo.columns[10] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        mAutoDBInfo.columns[11] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT default '' ");
        mAutoDBInfo.columns[12] = "rowid";
        mAutoDBInfo.sql = " fileId TEXT default ''  PRIMARY KEY ,  userId TEXT default '' ,  appId TEXT default '' ,  appName TEXT default '' ,  filePath TEXT default '' ,  orgFilePath TEXT default '' ,  coverPath TEXT default '' ,  extJsonData TEXT default '' ,  createTime LONG,  durationSec LONG,  title TEXT default '' ,  desc TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53340k4)) {
            return false;
        }
        C53340k4 k4Var = (C53340k4) iAutoDBItem;
        return C46238a.m51546a(this.field_fileId, k4Var.field_fileId) && C46238a.m51546a(this.field_userId, k4Var.field_userId) && C46238a.m51546a(this.field_appId, k4Var.field_appId) && C46238a.m51546a(this.field_appName, k4Var.field_appName) && C46238a.m51546a(this.field_filePath, k4Var.field_filePath) && C46238a.m51546a(this.field_orgFilePath, k4Var.field_orgFilePath) && C46238a.m51546a(this.field_coverPath, k4Var.field_coverPath) && C46238a.m51546a(this.field_extJsonData, k4Var.field_extJsonData) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(k4Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_durationSec), Long.valueOf(k4Var.field_durationSec)) && C46238a.m51546a(this.field_title, k4Var.field_title) && C46238a.m51546a(this.field_desc, k4Var.field_desc);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149569u == hashCode) {
                    try {
                        this.field_fileId = cursor.getString(i);
                        this.f149575d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149570v == hashCode) {
                    try {
                        this.field_userId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149571w == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149572x == hashCode) {
                    try {
                        this.field_appName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149573y == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149574z == hashCode) {
                    try {
                        this.field_orgFilePath = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149558A == hashCode) {
                    try {
                        this.field_coverPath = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149559B == hashCode) {
                    try {
                        this.field_extJsonData = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149560C == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149561D == hashCode) {
                    try {
                        this.field_durationSec = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149562E == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149563F == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLocalVideoInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149564G == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_fileId == null) {
            this.field_fileId = "";
        }
        if (this.f149575d) {
            contentValues.put("fileId", this.field_fileId);
        }
        if (this.field_userId == null) {
            this.field_userId = "";
        }
        if (this.f149576e) {
            contentValues.put("userId", this.field_userId);
        }
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f149577f) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.field_appName == null) {
            this.field_appName = "";
        }
        if (this.f149578g) {
            contentValues.put("appName", this.field_appName);
        }
        if (this.field_filePath == null) {
            this.field_filePath = "";
        }
        if (this.f149579h) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.field_orgFilePath == null) {
            this.field_orgFilePath = "";
        }
        if (this.f149580i) {
            contentValues.put("orgFilePath", this.field_orgFilePath);
        }
        if (this.field_coverPath == null) {
            this.field_coverPath = "";
        }
        if (this.f149581j) {
            contentValues.put("coverPath", this.field_coverPath);
        }
        if (this.field_extJsonData == null) {
            this.field_extJsonData = "";
        }
        if (this.f149582n) {
            contentValues.put("extJsonData", this.field_extJsonData);
        }
        if (this.f149583o) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f149584p) {
            contentValues.put("durationSec", Long.valueOf(this.field_durationSec));
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f149585q) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.field_desc == null) {
            this.field_desc = "";
        }
        if (this.f149586r) {
            contentValues.put("desc", this.field_desc);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameLocalVideoInfo ( " + f149565H.sql + ");");
        for (String add : f149568t) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameLocalVideoInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149565H, "GameLocalVideoInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameLocalVideoInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameLocalVideoInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149565H;
    }

    public String[] getIndexCreateSQL() {
        return f149568t;
    }

    public StorageObserverOwner<C53340k4> getObserverOwner() {
        return f149566I;
    }

    public Object getPrimaryKeyValue() {
        return this.field_fileId;
    }

    public SingleTable getTable() {
        return f149567s;
    }

    public String getTableName() {
        return f149567s.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("fileId")) {
            this.field_fileId = contentValues.getAsString("fileId");
            if (z) {
                this.f149575d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z) {
                this.f149576e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f149577f = true;
            }
        }
        if (contentValues.containsKey("appName")) {
            this.field_appName = contentValues.getAsString("appName");
            if (z) {
                this.f149578g = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f149579h = true;
            }
        }
        if (contentValues.containsKey("orgFilePath")) {
            this.field_orgFilePath = contentValues.getAsString("orgFilePath");
            if (z) {
                this.f149580i = true;
            }
        }
        if (contentValues.containsKey("coverPath")) {
            this.field_coverPath = contentValues.getAsString("coverPath");
            if (z) {
                this.f149581j = true;
            }
        }
        if (contentValues.containsKey("extJsonData")) {
            this.field_extJsonData = contentValues.getAsString("extJsonData");
            if (z) {
                this.f149582n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f149583o = true;
            }
        }
        if (contentValues.containsKey("durationSec")) {
            this.field_durationSec = contentValues.getAsLong("durationSec").longValue();
            if (z) {
                this.f149584p = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f149585q = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f149586r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
