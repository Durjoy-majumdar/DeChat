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

/* renamed from: xh.m8 */
public class C102656m8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302646A = -1469962673;

    /* renamed from: B */
    public static final int f302647B = -1645039825;

    /* renamed from: C */
    public static final int f302648C = 1293208875;

    /* renamed from: D */
    public static final int f302649D = 1283179696;

    /* renamed from: E */
    public static final int f302650E = 1295069136;

    /* renamed from: F */
    public static final int f302651F = 20436505;

    /* renamed from: G */
    public static final int f302652G = 463590149;

    /* renamed from: H */
    public static final int f302653H = 87579247;

    /* renamed from: I */
    public static final int f302654I = -1867169789;

    /* renamed from: J */
    public static final int f302655J = -1180333087;

    /* renamed from: K */
    public static final int f302656K = 108705909;

    /* renamed from: L */
    public static final IAutoDBItem.MAutoDBInfo f302657L = initAutoDBInfo(C102656m8.class);

    /* renamed from: M */
    public static final StorageObserverOwner<C102656m8> f302658M = new StorageObserverOwner<>();

    /* renamed from: u */
    public static final SingleTable f302659u;

    /* renamed from: v */
    public static final String[] f302660v = new String[0];

    /* renamed from: w */
    public static final int f302661w = -266666762;

    /* renamed from: x */
    public static final int f302662x = 3575610;

    /* renamed from: y */
    public static final int f302663y = -2053780008;

    /* renamed from: z */
    public static final int f302664z = 1566917561;

    /* renamed from: d */
    public boolean f302665d = true;

    /* renamed from: e */
    public boolean f302666e = true;

    /* renamed from: f */
    public boolean f302667f = true;
    public String field_cacheVideo;
    public long field_finderCheckTime;
    public byte[] field_finderObject;
    public String field_imageBgUrl;
    public boolean field_isLike;
    public String field_localImage;
    public String field_localThumb;
    public String field_localVideo;
    public long field_snsBgId;
    public boolean field_success;
    public String field_thumbUrl;
    public int field_type;
    public String field_userName;
    public String field_videoBgUrl;

    /* renamed from: g */
    public boolean f302668g = true;

    /* renamed from: h */
    public boolean f302669h = true;

    /* renamed from: i */
    public boolean f302670i = true;

    /* renamed from: j */
    public boolean f302671j = true;

    /* renamed from: n */
    public boolean f302672n = true;

    /* renamed from: o */
    public boolean f302673o = true;

    /* renamed from: p */
    public boolean f302674p = true;

    /* renamed from: q */
    public boolean f302675q = true;

    /* renamed from: r */
    public boolean f302676r = true;

    /* renamed from: s */
    public boolean f302677s = true;

    /* renamed from: t */
    public boolean f302678t = true;

    static {
        SingleTable singleTable = new SingleTable("SnsCover");
        f302659u = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("snsBgId", "long", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("imageBgUrl", "string", singleTable.getName(), "");
        new Column("videoBgUrl", "string", singleTable.getName(), "");
        new Column("localThumb", "string", singleTable.getName(), "");
        new Column("localImage", "string", singleTable.getName(), "");
        new Column("localVideo", "string", singleTable.getName(), "");
        new Column("cacheVideo", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_FINDEROBJECT, "byte[]", singleTable.getName(), "");
        new Column("finderCheckTime", "long", singleTable.getName(), "");
        new Column("success", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isLike", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[14];
        String[] strArr = new String[15];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "userName";
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[2] = "snsBgId";
        mAutoDBInfo.colsMap.put("snsBgId", "LONG");
        mAutoDBInfo.columns[3] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT");
        mAutoDBInfo.columns[4] = "imageBgUrl";
        mAutoDBInfo.colsMap.put("imageBgUrl", "TEXT");
        mAutoDBInfo.columns[5] = "videoBgUrl";
        mAutoDBInfo.colsMap.put("videoBgUrl", "TEXT");
        mAutoDBInfo.columns[6] = "localThumb";
        mAutoDBInfo.colsMap.put("localThumb", "TEXT");
        mAutoDBInfo.columns[7] = "localImage";
        mAutoDBInfo.colsMap.put("localImage", "TEXT");
        mAutoDBInfo.columns[8] = "localVideo";
        mAutoDBInfo.colsMap.put("localVideo", "TEXT");
        mAutoDBInfo.columns[9] = "cacheVideo";
        mAutoDBInfo.colsMap.put("cacheVideo", "TEXT");
        mAutoDBInfo.columns[10] = C66261f3.COL_FINDEROBJECT;
        mAutoDBInfo.colsMap.put(C66261f3.COL_FINDEROBJECT, "BLOB");
        mAutoDBInfo.columns[11] = "finderCheckTime";
        mAutoDBInfo.colsMap.put("finderCheckTime", "LONG");
        mAutoDBInfo.columns[12] = "success";
        mAutoDBInfo.colsMap.put("success", "INTEGER default 'false' ");
        mAutoDBInfo.columns[13] = "isLike";
        mAutoDBInfo.colsMap.put("isLike", "INTEGER default 'false' ");
        mAutoDBInfo.columns[14] = "rowid";
        mAutoDBInfo.sql = " userName TEXT default ''  PRIMARY KEY ,  type INTEGER,  snsBgId LONG,  thumbUrl TEXT,  imageBgUrl TEXT,  videoBgUrl TEXT,  localThumb TEXT,  localImage TEXT,  localVideo TEXT,  cacheVideo TEXT,  finderObject BLOB,  finderCheckTime LONG,  success INTEGER default 'false' ,  isLike INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102656m8)) {
            return false;
        }
        C102656m8 m8Var = (C102656m8) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, m8Var.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(m8Var.field_type)) && C46238a.m51546a(Long.valueOf(this.field_snsBgId), Long.valueOf(m8Var.field_snsBgId)) && C46238a.m51546a(this.field_thumbUrl, m8Var.field_thumbUrl) && C46238a.m51546a(this.field_imageBgUrl, m8Var.field_imageBgUrl) && C46238a.m51546a(this.field_videoBgUrl, m8Var.field_videoBgUrl) && C46238a.m51546a(this.field_localThumb, m8Var.field_localThumb) && C46238a.m51546a(this.field_localImage, m8Var.field_localImage) && C46238a.m51546a(this.field_localVideo, m8Var.field_localVideo) && C46238a.m51546a(this.field_cacheVideo, m8Var.field_cacheVideo) && C46238a.m51546a(this.field_finderObject, m8Var.field_finderObject) && C46238a.m51546a(Long.valueOf(this.field_finderCheckTime), Long.valueOf(m8Var.field_finderCheckTime)) && C46238a.m51546a(Boolean.valueOf(this.field_success), Boolean.valueOf(m8Var.field_success)) && C46238a.m51546a(Boolean.valueOf(this.field_isLike), Boolean.valueOf(m8Var.field_isLike));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302661w == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                        this.f302665d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302662x == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302663y == hashCode) {
                    try {
                        this.field_snsBgId = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302664z == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302646A == hashCode) {
                    try {
                        this.field_imageBgUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302647B == hashCode) {
                    try {
                        this.field_videoBgUrl = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302648C == hashCode) {
                    try {
                        this.field_localThumb = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302649D == hashCode) {
                    try {
                        this.field_localImage = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302650E == hashCode) {
                    try {
                        this.field_localVideo = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302651F == hashCode) {
                    try {
                        this.field_cacheVideo = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302652G == hashCode) {
                    try {
                        this.field_finderObject = cursor.getBlob(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302653H == hashCode) {
                    try {
                        this.field_finderCheckTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302654I == hashCode) {
                    try {
                        this.field_success = cursor.getInt(i) != 0;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302655J == hashCode) {
                    try {
                        this.field_isLike = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsCover", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302656K == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f302665d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f302666e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302667f) {
            contentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
        }
        if (this.f302668g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f302669h) {
            contentValues.put("imageBgUrl", this.field_imageBgUrl);
        }
        if (this.f302670i) {
            contentValues.put("videoBgUrl", this.field_videoBgUrl);
        }
        if (this.f302671j) {
            contentValues.put("localThumb", this.field_localThumb);
        }
        if (this.f302672n) {
            contentValues.put("localImage", this.field_localImage);
        }
        if (this.f302673o) {
            contentValues.put("localVideo", this.field_localVideo);
        }
        if (this.f302674p) {
            contentValues.put("cacheVideo", this.field_cacheVideo);
        }
        if (this.f302675q) {
            contentValues.put(C66261f3.COL_FINDEROBJECT, this.field_finderObject);
        }
        if (this.f302676r) {
            contentValues.put("finderCheckTime", Long.valueOf(this.field_finderCheckTime));
        }
        if (this.f302677s) {
            if (this.field_success) {
                contentValues.put("success", 1);
            } else {
                contentValues.put("success", 0);
            }
        }
        if (this.f302678t) {
            if (this.field_isLike) {
                contentValues.put("isLike", 1);
            } else {
                contentValues.put("isLike", 0);
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
            Log.m105920e("MicroMsg.SDK.BaseSnsCover", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsCover ( " + f302657L.sql + ");");
        for (String add : f302660v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsCover", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsCover", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302657L, "SnsCover", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsCover", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsCover", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsCover", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302657L;
    }

    public String[] getIndexCreateSQL() {
        return f302660v;
    }

    public StorageObserverOwner<C102656m8> getObserverOwner() {
        return f302658M;
    }

    public Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    public SingleTable getTable() {
        return f302659u;
    }

    public String getTableName() {
        return f302659u.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f302665d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302666e = true;
            }
        }
        if (contentValues.containsKey("snsBgId")) {
            this.field_snsBgId = contentValues.getAsLong("snsBgId").longValue();
            if (z) {
                this.f302667f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f302668g = true;
            }
        }
        if (contentValues.containsKey("imageBgUrl")) {
            this.field_imageBgUrl = contentValues.getAsString("imageBgUrl");
            if (z) {
                this.f302669h = true;
            }
        }
        if (contentValues.containsKey("videoBgUrl")) {
            this.field_videoBgUrl = contentValues.getAsString("videoBgUrl");
            if (z) {
                this.f302670i = true;
            }
        }
        if (contentValues.containsKey("localThumb")) {
            this.field_localThumb = contentValues.getAsString("localThumb");
            if (z) {
                this.f302671j = true;
            }
        }
        if (contentValues.containsKey("localImage")) {
            this.field_localImage = contentValues.getAsString("localImage");
            if (z) {
                this.f302672n = true;
            }
        }
        if (contentValues.containsKey("localVideo")) {
            this.field_localVideo = contentValues.getAsString("localVideo");
            if (z) {
                this.f302673o = true;
            }
        }
        if (contentValues.containsKey("cacheVideo")) {
            this.field_cacheVideo = contentValues.getAsString("cacheVideo");
            if (z) {
                this.f302674p = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_FINDEROBJECT)) {
            this.field_finderObject = contentValues.getAsByteArray(C66261f3.COL_FINDEROBJECT);
            if (z) {
                this.f302675q = true;
            }
        }
        if (contentValues.containsKey("finderCheckTime")) {
            this.field_finderCheckTime = contentValues.getAsLong("finderCheckTime").longValue();
            if (z) {
                this.f302676r = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("success")) {
            this.field_success = contentValues.getAsInteger("success").intValue() != 0;
            if (z) {
                this.f302677s = true;
            }
        }
        if (contentValues.containsKey("isLike")) {
            if (contentValues.getAsInteger("isLike").intValue() != 0) {
                z2 = true;
            }
            this.field_isLike = z2;
            if (z) {
                this.f302678t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
