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

/* renamed from: xh.e4 */
public class C102641e4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302245A = 2140463422;

    /* renamed from: B */
    public static final int f302246B = -735662143;

    /* renamed from: C */
    public static final int f302247C = 1441088167;

    /* renamed from: D */
    public static final int f302248D = 1329639195;

    /* renamed from: E */
    public static final int f302249E = 113126854;

    /* renamed from: F */
    public static final int f302250F = -1221029593;

    /* renamed from: G */
    public static final int f302251G = -1992012396;

    /* renamed from: H */
    public static final int f302252H = 3530753;

    /* renamed from: I */
    public static final int f302253I = 100467258;

    /* renamed from: J */
    public static final int f302254J = -900783381;

    /* renamed from: K */
    public static final int f302255K = -2110120709;

    /* renamed from: L */
    public static final int f302256L = 1053908752;

    /* renamed from: M */
    public static final int f302257M = -1092618936;

    /* renamed from: N */
    public static final int f302258N = 1601621142;

    /* renamed from: P */
    public static final int f302259P = 108705909;

    /* renamed from: Q */
    public static final IAutoDBItem.MAutoDBInfo f302260Q = initAutoDBInfo(C102641e4.class);

    /* renamed from: R */
    public static final StorageObserverOwner<C102641e4> f302261R = new StorageObserverOwner<>();

    /* renamed from: w */
    public static final SingleTable f302262w;

    /* renamed from: x */
    public static final String[] f302263x = new String[0];

    /* renamed from: y */
    public static final int f302264y = 338409958;

    /* renamed from: z */
    public static final int f302265z = 940773407;

    /* renamed from: d */
    public boolean f302266d = true;

    /* renamed from: e */
    public boolean f302267e = true;

    /* renamed from: f */
    public boolean f302268f = true;
    public String field_compressPath;
    public int field_duration;
    public int field_editFlag;
    public String field_filePath;
    public int field_height;
    public String field_hostTaskId;
    public boolean field_isGif;
    public String field_localId;
    public String field_mediaId;
    public int field_mediaType;
    public String field_mediaUrl;
    public long field_size;
    public String field_thumbPath;
    public String field_thumbPicUrl;
    public int field_uploadState;
    public int field_width;

    /* renamed from: g */
    public boolean f302269g = true;

    /* renamed from: h */
    public boolean f302270h = true;

    /* renamed from: i */
    public boolean f302271i = true;

    /* renamed from: j */
    public boolean f302272j = true;

    /* renamed from: n */
    public boolean f302273n = true;

    /* renamed from: o */
    public boolean f302274o = true;

    /* renamed from: p */
    public boolean f302275p = true;

    /* renamed from: q */
    public boolean f302276q = true;

    /* renamed from: r */
    public boolean f302277r = true;

    /* renamed from: s */
    public boolean f302278s = true;

    /* renamed from: t */
    public boolean f302279t = true;

    /* renamed from: u */
    public boolean f302280u = true;

    /* renamed from: v */
    public boolean f302281v = true;

    static {
        SingleTable singleTable = new SingleTable("GameHaowanMedia");
        f302262w = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "string", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("mediaType", "int", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("compressPath", "string", singleTable.getName(), "");
        new Column("thumbPath", "string", singleTable.getName(), "");
        new Column("width", "int", singleTable.getName(), "");
        new Column("height", "int", singleTable.getName(), "");
        new Column("duration", "int", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("isGif", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("mediaUrl", "string", singleTable.getName(), "");
        new Column("thumbPicUrl", "string", singleTable.getName(), "");
        new Column("uploadState", "int", singleTable.getName(), "");
        new Column("hostTaskId", "string", singleTable.getName(), "");
        new Column("editFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[16];
        String[] strArr = new String[17];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT");
        mAutoDBInfo.columns[2] = "mediaType";
        mAutoDBInfo.colsMap.put("mediaType", "INTEGER");
        mAutoDBInfo.columns[3] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT");
        mAutoDBInfo.columns[4] = "compressPath";
        mAutoDBInfo.colsMap.put("compressPath", "TEXT");
        mAutoDBInfo.columns[5] = "thumbPath";
        mAutoDBInfo.colsMap.put("thumbPath", "TEXT");
        mAutoDBInfo.columns[6] = "width";
        mAutoDBInfo.colsMap.put("width", "INTEGER");
        mAutoDBInfo.columns[7] = "height";
        mAutoDBInfo.colsMap.put("height", "INTEGER");
        mAutoDBInfo.columns[8] = "duration";
        mAutoDBInfo.colsMap.put("duration", "INTEGER");
        mAutoDBInfo.columns[9] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG");
        mAutoDBInfo.columns[10] = "isGif";
        mAutoDBInfo.colsMap.put("isGif", "INTEGER");
        mAutoDBInfo.columns[11] = "mediaUrl";
        mAutoDBInfo.colsMap.put("mediaUrl", "TEXT");
        mAutoDBInfo.columns[12] = "thumbPicUrl";
        mAutoDBInfo.colsMap.put("thumbPicUrl", "TEXT");
        mAutoDBInfo.columns[13] = "uploadState";
        mAutoDBInfo.colsMap.put("uploadState", "INTEGER default 'false' ");
        mAutoDBInfo.columns[14] = "hostTaskId";
        mAutoDBInfo.colsMap.put("hostTaskId", "TEXT");
        mAutoDBInfo.columns[15] = "editFlag";
        mAutoDBInfo.colsMap.put("editFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "rowid";
        mAutoDBInfo.sql = " localId TEXT PRIMARY KEY ,  mediaId TEXT,  mediaType INTEGER,  filePath TEXT,  compressPath TEXT,  thumbPath TEXT,  width INTEGER,  height INTEGER,  duration INTEGER,  size LONG,  isGif INTEGER,  mediaUrl TEXT,  thumbPicUrl TEXT,  uploadState INTEGER default 'false' ,  hostTaskId TEXT,  editFlag INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102641e4)) {
            return false;
        }
        C102641e4 e4Var = (C102641e4) iAutoDBItem;
        return C46238a.m51546a(this.field_localId, e4Var.field_localId) && C46238a.m51546a(this.field_mediaId, e4Var.field_mediaId) && C46238a.m51546a(Integer.valueOf(this.field_mediaType), Integer.valueOf(e4Var.field_mediaType)) && C46238a.m51546a(this.field_filePath, e4Var.field_filePath) && C46238a.m51546a(this.field_compressPath, e4Var.field_compressPath) && C46238a.m51546a(this.field_thumbPath, e4Var.field_thumbPath) && C46238a.m51546a(Integer.valueOf(this.field_width), Integer.valueOf(e4Var.field_width)) && C46238a.m51546a(Integer.valueOf(this.field_height), Integer.valueOf(e4Var.field_height)) && C46238a.m51546a(Integer.valueOf(this.field_duration), Integer.valueOf(e4Var.field_duration)) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(e4Var.field_size)) && C46238a.m51546a(Boolean.valueOf(this.field_isGif), Boolean.valueOf(e4Var.field_isGif)) && C46238a.m51546a(this.field_mediaUrl, e4Var.field_mediaUrl) && C46238a.m51546a(this.field_thumbPicUrl, e4Var.field_thumbPicUrl) && C46238a.m51546a(Integer.valueOf(this.field_uploadState), Integer.valueOf(e4Var.field_uploadState)) && C46238a.m51546a(this.field_hostTaskId, e4Var.field_hostTaskId) && C46238a.m51546a(Integer.valueOf(this.field_editFlag), Integer.valueOf(e4Var.field_editFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302264y == hashCode) {
                    try {
                        this.field_localId = cursor.getString(i);
                        this.f302266d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302265z == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302245A == hashCode) {
                    try {
                        this.field_mediaType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302246B == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302247C == hashCode) {
                    try {
                        this.field_compressPath = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302248D == hashCode) {
                    try {
                        this.field_thumbPath = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302249E == hashCode) {
                    try {
                        this.field_width = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302250F == hashCode) {
                    try {
                        this.field_height = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302251G == hashCode) {
                    try {
                        this.field_duration = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302252H == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302253I == hashCode) {
                    try {
                        this.field_isGif = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302254J == hashCode) {
                    try {
                        this.field_mediaUrl = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302255K == hashCode) {
                    try {
                        this.field_thumbPicUrl = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302256L == hashCode) {
                    try {
                        this.field_uploadState = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302257M == hashCode) {
                    try {
                        this.field_hostTaskId = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302258N == hashCode) {
                    try {
                        this.field_editFlag = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanMedia", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302259P == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302266d) {
            contentValues.put(C66261f3.COL_LOCALID, this.field_localId);
        }
        if (this.f302267e) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f302268f) {
            contentValues.put("mediaType", Integer.valueOf(this.field_mediaType));
        }
        if (this.f302269g) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f302270h) {
            contentValues.put("compressPath", this.field_compressPath);
        }
        if (this.f302271i) {
            contentValues.put("thumbPath", this.field_thumbPath);
        }
        if (this.f302272j) {
            contentValues.put("width", Integer.valueOf(this.field_width));
        }
        if (this.f302273n) {
            contentValues.put("height", Integer.valueOf(this.field_height));
        }
        if (this.f302274o) {
            contentValues.put("duration", Integer.valueOf(this.field_duration));
        }
        if (this.f302275p) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f302276q) {
            if (this.field_isGif) {
                contentValues.put("isGif", 1);
            } else {
                contentValues.put("isGif", 0);
            }
        }
        if (this.f302277r) {
            contentValues.put("mediaUrl", this.field_mediaUrl);
        }
        if (this.f302278s) {
            contentValues.put("thumbPicUrl", this.field_thumbPicUrl);
        }
        if (this.f302279t) {
            contentValues.put("uploadState", Integer.valueOf(this.field_uploadState));
        }
        if (this.f302280u) {
            contentValues.put("hostTaskId", this.field_hostTaskId);
        }
        if (this.f302281v) {
            contentValues.put("editFlag", Integer.valueOf(this.field_editFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameHaowanMedia", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameHaowanMedia ( " + f302260Q.sql + ");");
        for (String add : f302263x) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameHaowanMedia", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameHaowanMedia", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302260Q, "GameHaowanMedia", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameHaowanMedia", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameHaowanMedia", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameHaowanMedia", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302260Q;
    }

    public String[] getIndexCreateSQL() {
        return f302263x;
    }

    public StorageObserverOwner<C102641e4> getObserverOwner() {
        return f302261R;
    }

    public Object getPrimaryKeyValue() {
        return this.field_localId;
    }

    public SingleTable getTable() {
        return f302262w;
    }

    public String getTableName() {
        return f302262w.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsString(C66261f3.COL_LOCALID);
            if (z) {
                this.f302266d = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f302267e = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.field_mediaType = contentValues.getAsInteger("mediaType").intValue();
            if (z) {
                this.f302268f = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f302269g = true;
            }
        }
        if (contentValues.containsKey("compressPath")) {
            this.field_compressPath = contentValues.getAsString("compressPath");
            if (z) {
                this.f302270h = true;
            }
        }
        if (contentValues.containsKey("thumbPath")) {
            this.field_thumbPath = contentValues.getAsString("thumbPath");
            if (z) {
                this.f302271i = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.field_width = contentValues.getAsInteger("width").intValue();
            if (z) {
                this.f302272j = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.field_height = contentValues.getAsInteger("height").intValue();
            if (z) {
                this.f302273n = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z) {
                this.f302274o = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f302275p = true;
            }
        }
        if (contentValues.containsKey("isGif")) {
            this.field_isGif = contentValues.getAsInteger("isGif").intValue() != 0;
            if (z) {
                this.f302276q = true;
            }
        }
        if (contentValues.containsKey("mediaUrl")) {
            this.field_mediaUrl = contentValues.getAsString("mediaUrl");
            if (z) {
                this.f302277r = true;
            }
        }
        if (contentValues.containsKey("thumbPicUrl")) {
            this.field_thumbPicUrl = contentValues.getAsString("thumbPicUrl");
            if (z) {
                this.f302278s = true;
            }
        }
        if (contentValues.containsKey("uploadState")) {
            this.field_uploadState = contentValues.getAsInteger("uploadState").intValue();
            if (z) {
                this.f302279t = true;
            }
        }
        if (contentValues.containsKey("hostTaskId")) {
            this.field_hostTaskId = contentValues.getAsString("hostTaskId");
            if (z) {
                this.f302280u = true;
            }
        }
        if (contentValues.containsKey("editFlag")) {
            this.field_editFlag = contentValues.getAsInteger("editFlag").intValue();
            if (z) {
                this.f302281v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
