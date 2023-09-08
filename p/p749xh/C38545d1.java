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
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.d1 */
public class C38545d1 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102032A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f102033B = initAutoDBInfo(C38545d1.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38545d1> f102034C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f102035p;

    /* renamed from: q */
    public static final String[] f102036q = new String[0];

    /* renamed from: r */
    public static final int f102037r = 940773407;

    /* renamed from: s */
    public static final int f102038s = 140685570;

    /* renamed from: t */
    public static final int f102039t = -1211148345;

    /* renamed from: u */
    public static final int f102040u = -132179836;

    /* renamed from: v */
    public static final int f102041v = -735662143;

    /* renamed from: w */
    public static final int f102042w = 952415437;

    /* renamed from: x */
    public static final int f102043x = 927624462;

    /* renamed from: y */
    public static final int f102044y = -1737220358;

    /* renamed from: z */
    public static final int f102045z = -596510964;

    /* renamed from: d */
    public boolean f102046d = true;

    /* renamed from: e */
    public boolean f102047e = true;

    /* renamed from: f */
    public boolean f102048f = true;
    public Boolean field_allowMobileNetDownload;
    public String field_downloadUrl;
    public int field_downloadUrlHashCode;
    public String field_filePath;
    public Boolean field_game_package_download;
    public String field_httpsUrl;
    public String field_mediaId;
    public String field_verifyHeaders;
    public Boolean field_wifiAutoDownload;

    /* renamed from: g */
    public boolean f102049g = true;

    /* renamed from: h */
    public boolean f102050h = true;

    /* renamed from: i */
    public boolean f102051i = true;

    /* renamed from: j */
    public boolean f102052j = true;

    /* renamed from: n */
    public boolean f102053n = true;

    /* renamed from: o */
    public boolean f102054o = true;

    static {
        SingleTable singleTable = new SingleTable("CdnDownloadInfo");
        f102035p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("downloadUrlHashCode", "int", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column("httpsUrl", "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("verifyHeaders", "string", singleTable.getName(), "");
        new Column("game_package_download", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("allowMobileNetDownload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("wifiAutoDownload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT");
        mAutoDBInfo.columns[1] = "downloadUrlHashCode";
        mAutoDBInfo.colsMap.put("downloadUrlHashCode", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "downloadUrlHashCode";
        mAutoDBInfo.columns[2] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT");
        mAutoDBInfo.columns[3] = "httpsUrl";
        mAutoDBInfo.colsMap.put("httpsUrl", "TEXT");
        mAutoDBInfo.columns[4] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        mAutoDBInfo.columns[5] = "verifyHeaders";
        mAutoDBInfo.colsMap.put("verifyHeaders", "TEXT");
        mAutoDBInfo.columns[6] = "game_package_download";
        mAutoDBInfo.colsMap.put("game_package_download", "INTEGER");
        mAutoDBInfo.columns[7] = "allowMobileNetDownload";
        mAutoDBInfo.colsMap.put("allowMobileNetDownload", "INTEGER");
        mAutoDBInfo.columns[8] = "wifiAutoDownload";
        mAutoDBInfo.colsMap.put("wifiAutoDownload", "INTEGER");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " mediaId TEXT,  downloadUrlHashCode INTEGER PRIMARY KEY ,  downloadUrl TEXT,  httpsUrl TEXT,  filePath TEXT,  verifyHeaders TEXT,  game_package_download INTEGER,  allowMobileNetDownload INTEGER,  wifiAutoDownload INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38545d1)) {
            return false;
        }
        C38545d1 d1Var = (C38545d1) iAutoDBItem;
        return C46238a.m51546a(this.field_mediaId, d1Var.field_mediaId) && C46238a.m51546a(Integer.valueOf(this.field_downloadUrlHashCode), Integer.valueOf(d1Var.field_downloadUrlHashCode)) && C46238a.m51546a(this.field_downloadUrl, d1Var.field_downloadUrl) && C46238a.m51546a(this.field_httpsUrl, d1Var.field_httpsUrl) && C46238a.m51546a(this.field_filePath, d1Var.field_filePath) && C46238a.m51546a(this.field_verifyHeaders, d1Var.field_verifyHeaders) && C46238a.m51546a(this.field_game_package_download, d1Var.field_game_package_download) && C46238a.m51546a(this.field_allowMobileNetDownload, d1Var.field_allowMobileNetDownload) && C46238a.m51546a(this.field_wifiAutoDownload, d1Var.field_wifiAutoDownload);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102037r == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102038s == hashCode) {
                    try {
                        this.field_downloadUrlHashCode = cursor.getInt(i);
                        this.f102047e = true;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102039t == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102040u == hashCode) {
                    try {
                        this.field_httpsUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102041v == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102042w == hashCode) {
                    try {
                        this.field_verifyHeaders = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102043x == hashCode) {
                    try {
                        this.field_game_package_download = Boolean.valueOf(cursor.getInt(i) != 0);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102044y == hashCode) {
                    try {
                        this.field_allowMobileNetDownload = Boolean.valueOf(cursor.getInt(i) != 0);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102045z == hashCode) {
                    try {
                        this.field_wifiAutoDownload = Boolean.valueOf(cursor.getInt(i) != 0);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCdnDownloadInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102032A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102046d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f102047e) {
            contentValues.put("downloadUrlHashCode", Integer.valueOf(this.field_downloadUrlHashCode));
        }
        if (this.f102048f) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.f102049g) {
            contentValues.put("httpsUrl", this.field_httpsUrl);
        }
        if (this.f102050h) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f102051i) {
            contentValues.put("verifyHeaders", this.field_verifyHeaders);
        }
        if (this.f102052j) {
            if (this.field_game_package_download.booleanValue()) {
                contentValues.put("game_package_download", 1);
            } else {
                contentValues.put("game_package_download", 0);
            }
        }
        if (this.f102053n) {
            if (this.field_allowMobileNetDownload.booleanValue()) {
                contentValues.put("allowMobileNetDownload", 1);
            } else {
                contentValues.put("allowMobileNetDownload", 0);
            }
        }
        if (this.f102054o) {
            if (this.field_wifiAutoDownload.booleanValue()) {
                contentValues.put("wifiAutoDownload", 1);
            } else {
                contentValues.put("wifiAutoDownload", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CdnDownloadInfo ( " + f102033B.sql + ");");
        for (String add : f102036q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CdnDownloadInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102033B, "CdnDownloadInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCdnDownloadInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CdnDownloadInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102033B;
    }

    public String[] getIndexCreateSQL() {
        return f102036q;
    }

    public StorageObserverOwner<C38545d1> getObserverOwner() {
        return f102034C;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_downloadUrlHashCode);
    }

    public SingleTable getTable() {
        return f102035p;
    }

    public String getTableName() {
        return f102035p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f102046d = true;
            }
        }
        if (contentValues.containsKey("downloadUrlHashCode")) {
            this.field_downloadUrlHashCode = contentValues.getAsInteger("downloadUrlHashCode").intValue();
            if (z) {
                this.f102047e = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f102048f = true;
            }
        }
        if (contentValues.containsKey("httpsUrl")) {
            this.field_httpsUrl = contentValues.getAsString("httpsUrl");
            if (z) {
                this.f102049g = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f102050h = true;
            }
        }
        if (contentValues.containsKey("verifyHeaders")) {
            this.field_verifyHeaders = contentValues.getAsString("verifyHeaders");
            if (z) {
                this.f102051i = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("game_package_download")) {
            this.field_game_package_download = Boolean.valueOf(contentValues.getAsInteger("game_package_download").intValue() != 0);
            if (z) {
                this.f102052j = true;
            }
        }
        if (contentValues.containsKey("allowMobileNetDownload")) {
            this.field_allowMobileNetDownload = Boolean.valueOf(contentValues.getAsInteger("allowMobileNetDownload").intValue() != 0);
            if (z) {
                this.f102053n = true;
            }
        }
        if (contentValues.containsKey("wifiAutoDownload")) {
            if (contentValues.getAsInteger("wifiAutoDownload").intValue() != 0) {
                z2 = true;
            }
            this.field_wifiAutoDownload = Boolean.valueOf(z2);
            if (z) {
                this.f102054o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
