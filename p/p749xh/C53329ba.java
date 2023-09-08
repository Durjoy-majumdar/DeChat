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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.ba */
public class C53329ba extends IAutoDBItem {

    /* renamed from: A */
    public static final int f148997A = 112909;

    /* renamed from: B */
    public static final int f148998B = -1392120434;

    /* renamed from: C */
    public static final int f148999C = 107902;

    /* renamed from: D */
    public static final int f149000D = -1211148345;

    /* renamed from: E */
    public static final int f149001E = 3530753;

    /* renamed from: F */
    public static final int f149002F = -2057421617;

    /* renamed from: G */
    public static final int f149003G = 1018565857;

    /* renamed from: H */
    public static final int f149004H = 1369213417;

    /* renamed from: I */
    public static final int f149005I = 2123822072;

    /* renamed from: J */
    public static final int f149006J = -577982133;

    /* renamed from: K */
    public static final int f149007K = 108705909;

    /* renamed from: L */
    public static final IAutoDBItem.MAutoDBInfo f149008L = initAutoDBInfo(C53329ba.class);

    /* renamed from: M */
    public static final StorageObserverOwner<C53329ba> f149009M = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f149010u;

    /* renamed from: v */
    public static final String[] f149011v = new String[0];

    /* renamed from: w */
    public static final int f149012w = 106079;

    /* renamed from: x */
    public static final int f149013x = 106723335;

    /* renamed from: y */
    public static final int f149014y = 351608024;

    /* renamed from: z */
    public static final int f149015z = -735662143;

    /* renamed from: d */
    public boolean f149016d = true;

    /* renamed from: e */
    public boolean f149017e = true;

    /* renamed from: f */
    public boolean f149018f = true;
    public int field_autoDownloadCount;
    public boolean field_completeDownload;
    public long field_createTime;
    public int field_downloadNetType;
    public String field_downloadUrl;
    public int field_fileDownloadCount;
    public String field_filePath;
    public String field_key;
    public String field_md5;
    public String field_mimeType;
    public String field_pkgId;
    public String field_rid;
    public int field_size;
    public String field_version;

    /* renamed from: g */
    public boolean f149019g = true;

    /* renamed from: h */
    public boolean f149020h = true;

    /* renamed from: i */
    public boolean f149021i = true;

    /* renamed from: j */
    public boolean f149022j = true;

    /* renamed from: n */
    public boolean f149023n = true;

    /* renamed from: o */
    public boolean f149024o = true;

    /* renamed from: p */
    public boolean f149025p = true;

    /* renamed from: q */
    public boolean f149026q = true;

    /* renamed from: r */
    public boolean f149027r = true;

    /* renamed from: s */
    public boolean f149028s = true;

    /* renamed from: t */
    public boolean f149029t = true;

    static {
        SingleTable singleTable = new SingleTable("WepkgPreloadFiles");
        f149010u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("pkgId", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("rid", "string", singleTable.getName(), "");
        new Column("mimeType", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column("size", "int", singleTable.getName(), "");
        new Column("downloadNetType", "int", singleTable.getName(), "");
        new Column("completeDownload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("autoDownloadCount", "int", singleTable.getName(), "");
        new Column("fileDownloadCount", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "pkgId";
        mAutoDBInfo.colsMap.put("pkgId", "TEXT");
        mAutoDBInfo.columns[2] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "TEXT");
        mAutoDBInfo.columns[3] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        mAutoDBInfo.columns[4] = "rid";
        mAutoDBInfo.colsMap.put("rid", "TEXT");
        mAutoDBInfo.columns[5] = "mimeType";
        mAutoDBInfo.colsMap.put("mimeType", "TEXT");
        mAutoDBInfo.columns[6] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT");
        mAutoDBInfo.columns[7] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT");
        mAutoDBInfo.columns[8] = "size";
        mAutoDBInfo.colsMap.put("size", "INTEGER");
        mAutoDBInfo.columns[9] = "downloadNetType";
        mAutoDBInfo.colsMap.put("downloadNetType", "INTEGER");
        mAutoDBInfo.columns[10] = "completeDownload";
        mAutoDBInfo.colsMap.put("completeDownload", "INTEGER default 'false' ");
        mAutoDBInfo.columns[11] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[12] = "autoDownloadCount";
        mAutoDBInfo.colsMap.put("autoDownloadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "fileDownloadCount";
        mAutoDBInfo.colsMap.put("fileDownloadCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  pkgId TEXT,  version TEXT,  filePath TEXT,  rid TEXT,  mimeType TEXT,  md5 TEXT,  downloadUrl TEXT,  size INTEGER,  downloadNetType INTEGER,  completeDownload INTEGER default 'false' ,  createTime LONG,  autoDownloadCount INTEGER default '0' ,  fileDownloadCount INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53329ba)) {
            return false;
        }
        C53329ba baVar = (C53329ba) iAutoDBItem;
        return C46238a.m51546a(this.field_key, baVar.field_key) && C46238a.m51546a(this.field_pkgId, baVar.field_pkgId) && C46238a.m51546a(this.field_version, baVar.field_version) && C46238a.m51546a(this.field_filePath, baVar.field_filePath) && C46238a.m51546a(this.field_rid, baVar.field_rid) && C46238a.m51546a(this.field_mimeType, baVar.field_mimeType) && C46238a.m51546a(this.field_md5, baVar.field_md5) && C46238a.m51546a(this.field_downloadUrl, baVar.field_downloadUrl) && C46238a.m51546a(Integer.valueOf(this.field_size), Integer.valueOf(baVar.field_size)) && C46238a.m51546a(Integer.valueOf(this.field_downloadNetType), Integer.valueOf(baVar.field_downloadNetType)) && C46238a.m51546a(Boolean.valueOf(this.field_completeDownload), Boolean.valueOf(baVar.field_completeDownload)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(baVar.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_autoDownloadCount), Integer.valueOf(baVar.field_autoDownloadCount)) && C46238a.m51546a(Integer.valueOf(this.field_fileDownloadCount), Integer.valueOf(baVar.field_fileDownloadCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149012w == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f149016d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149013x == hashCode) {
                    try {
                        this.field_pkgId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149014y == hashCode) {
                    try {
                        this.field_version = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149015z == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148997A == hashCode) {
                    try {
                        this.field_rid = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148998B == hashCode) {
                    try {
                        this.field_mimeType = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148999C == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149000D == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149001E == hashCode) {
                    try {
                        this.field_size = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149002F == hashCode) {
                    try {
                        this.field_downloadNetType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149003G == hashCode) {
                    try {
                        this.field_completeDownload = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149004H == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149005I == hashCode) {
                    try {
                        this.field_autoDownloadCount = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149006J == hashCode) {
                    try {
                        this.field_fileDownloadCount = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWepkgPreloadFiles", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149007K == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f149016d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f149017e) {
            contentValues.put("pkgId", this.field_pkgId);
        }
        if (this.f149018f) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.field_version);
        }
        if (this.f149019g) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f149020h) {
            contentValues.put("rid", this.field_rid);
        }
        if (this.f149021i) {
            contentValues.put("mimeType", this.field_mimeType);
        }
        if (this.f149022j) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f149023n) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f149024o) {
            contentValues.put("size", Integer.valueOf(this.field_size));
        }
        if (this.f149025p) {
            contentValues.put("downloadNetType", Integer.valueOf(this.field_downloadNetType));
        }
        if (this.f149026q) {
            if (this.field_completeDownload) {
                contentValues.put("completeDownload", 1);
            } else {
                contentValues.put("completeDownload", 0);
            }
        }
        if (this.f149027r) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f149028s) {
            contentValues.put("autoDownloadCount", Integer.valueOf(this.field_autoDownloadCount));
        }
        if (this.f149029t) {
            contentValues.put("fileDownloadCount", Integer.valueOf(this.field_fileDownloadCount));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WepkgPreloadFiles ( " + f149008L.sql + ");");
        for (String add : f149011v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WepkgPreloadFiles", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149008L, "WepkgPreloadFiles", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWepkgPreloadFiles", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WepkgPreloadFiles", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149008L;
    }

    public String[] getIndexCreateSQL() {
        return f149011v;
    }

    public StorageObserverOwner<C53329ba> getObserverOwner() {
        return f149009M;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f149010u;
    }

    public String getTableName() {
        return f149010u.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f149016d = true;
            }
        }
        if (contentValues.containsKey("pkgId")) {
            this.field_pkgId = contentValues.getAsString("pkgId");
            if (z) {
                this.f149017e = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            if (z) {
                this.f149018f = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f149019g = true;
            }
        }
        if (contentValues.containsKey("rid")) {
            this.field_rid = contentValues.getAsString("rid");
            if (z) {
                this.f149020h = true;
            }
        }
        if (contentValues.containsKey("mimeType")) {
            this.field_mimeType = contentValues.getAsString("mimeType");
            if (z) {
                this.f149021i = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f149022j = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f149023n = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsInteger("size").intValue();
            if (z) {
                this.f149024o = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.field_downloadNetType = contentValues.getAsInteger("downloadNetType").intValue();
            if (z) {
                this.f149025p = true;
            }
        }
        if (contentValues.containsKey("completeDownload")) {
            this.field_completeDownload = contentValues.getAsInteger("completeDownload").intValue() != 0;
            if (z) {
                this.f149026q = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f149027r = true;
            }
        }
        if (contentValues.containsKey("autoDownloadCount")) {
            this.field_autoDownloadCount = contentValues.getAsInteger("autoDownloadCount").intValue();
            if (z) {
                this.f149028s = true;
            }
        }
        if (contentValues.containsKey("fileDownloadCount")) {
            this.field_fileDownloadCount = contentValues.getAsInteger("fileDownloadCount").intValue();
            if (z) {
                this.f149029t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
