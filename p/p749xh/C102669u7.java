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

/* renamed from: xh.u7 */
public class C102669u7 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302973A = 338409958;

    /* renamed from: B */
    public static final int f302974B = -779380651;

    /* renamed from: C */
    public static final int f302975C = -868828954;

    /* renamed from: D */
    public static final int f302976D = -1338919323;

    /* renamed from: E */
    public static final int f302977E = 940773407;

    /* renamed from: F */
    public static final int f302978F = 3433509;

    /* renamed from: G */
    public static final int f302979G = -1364966910;

    /* renamed from: H */
    public static final int f302980H = -1364976910;

    /* renamed from: I */
    public static final int f302981I = -849913807;

    /* renamed from: J */
    public static final int f302982J = 2071748300;

    /* renamed from: K */
    public static final int f302983K = -1019779949;

    /* renamed from: L */
    public static final int f302984L = 3575610;

    /* renamed from: M */
    public static final int f302985M = -735520042;

    /* renamed from: N */
    public static final int f302986N = -892481550;

    /* renamed from: P */
    public static final int f302987P = -1480298254;

    /* renamed from: Q */
    public static final int f302988Q = -502431572;

    /* renamed from: R */
    public static final int f302989R = 2063396283;

    /* renamed from: S */
    public static final int f302990S = -141841527;

    /* renamed from: T */
    public static final int f302991T = 108705909;

    /* renamed from: U */
    public static final IAutoDBItem.MAutoDBInfo f302992U = initAutoDBInfo(C102669u7.class);

    /* renamed from: V */
    public static final StorageObserverOwner<C102669u7> f302993V = new StorageObserverOwner<>();

    /* renamed from: y */
    public static final SingleTable f302994y;

    /* renamed from: z */
    public static final String[] f302995z = {"CREATE INDEX IF NOT EXISTS record_localid_index ON RecordCDNInfo(recordLocalId)"};

    /* renamed from: d */
    public boolean f302996d = true;

    /* renamed from: e */
    public boolean f302997e = true;

    /* renamed from: f */
    public boolean f302998f = true;
    public String field_cdnKey;
    public String field_cdnUrl;
    public String field_dataId;
    public int field_errCode;
    public int field_fileType;
    public boolean field_isThumb;
    public int field_localId;
    public String field_mediaId;
    public int field_offset;
    public String field_path;
    public int field_recordLocalId;
    public int field_status;
    public String field_toUser;
    public int field_totalLen;
    public String field_tpaeskey;
    public String field_tpauthkey;
    public String field_tpdataurl;
    public int field_type;

    /* renamed from: g */
    public boolean f302999g = true;

    /* renamed from: h */
    public boolean f303000h = true;

    /* renamed from: i */
    public boolean f303001i = true;

    /* renamed from: j */
    public boolean f303002j = true;

    /* renamed from: n */
    public boolean f303003n = true;

    /* renamed from: o */
    public boolean f303004o = true;

    /* renamed from: p */
    public boolean f303005p = true;

    /* renamed from: q */
    public boolean f303006q = true;

    /* renamed from: r */
    public boolean f303007r = true;

    /* renamed from: s */
    public boolean f303008s = true;

    /* renamed from: t */
    public boolean f303009t = true;

    /* renamed from: u */
    public boolean f303010u = true;

    /* renamed from: v */
    public boolean f303011v = true;

    /* renamed from: w */
    public boolean f303012w = true;

    /* renamed from: x */
    public boolean f303013x = true;

    static {
        SingleTable singleTable = new SingleTable("RecordCDNInfo");
        f302994y = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "int", singleTable.getName(), "");
        new Column("recordLocalId", "int", singleTable.getName(), "");
        new Column("toUser", "string", singleTable.getName(), "");
        new Column("dataId", "string", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("cdnUrl", "string", singleTable.getName(), "");
        new Column("cdnKey", "string", singleTable.getName(), "");
        new Column("totalLen", "int", singleTable.getName(), "");
        new Column("isThumb", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("offset", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("fileType", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("errCode", "int", singleTable.getName(), "");
        new Column("tpaeskey", "string", singleTable.getName(), "");
        new Column("tpauthkey", "string", singleTable.getName(), "");
        new Column("tpdataurl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "recordLocalId";
        mAutoDBInfo.colsMap.put("recordLocalId", "INTEGER");
        mAutoDBInfo.columns[2] = "toUser";
        mAutoDBInfo.colsMap.put("toUser", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "dataId";
        mAutoDBInfo.colsMap.put("dataId", "TEXT");
        mAutoDBInfo.columns[4] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT");
        mAutoDBInfo.columns[5] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[6] = "cdnUrl";
        mAutoDBInfo.colsMap.put("cdnUrl", "TEXT");
        mAutoDBInfo.columns[7] = "cdnKey";
        mAutoDBInfo.colsMap.put("cdnKey", "TEXT");
        mAutoDBInfo.columns[8] = "totalLen";
        mAutoDBInfo.colsMap.put("totalLen", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "isThumb";
        mAutoDBInfo.colsMap.put("isThumb", "INTEGER default 'false' ");
        mAutoDBInfo.columns[10] = "offset";
        mAutoDBInfo.colsMap.put("offset", "INTEGER default '0' ");
        mAutoDBInfo.columns[11] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "fileType";
        mAutoDBInfo.colsMap.put("fileType", "INTEGER default '5' ");
        mAutoDBInfo.columns[13] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "errCode";
        mAutoDBInfo.colsMap.put("errCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "tpaeskey";
        mAutoDBInfo.colsMap.put("tpaeskey", "TEXT");
        mAutoDBInfo.columns[16] = "tpauthkey";
        mAutoDBInfo.colsMap.put("tpauthkey", "TEXT");
        mAutoDBInfo.columns[17] = "tpdataurl";
        mAutoDBInfo.colsMap.put("tpdataurl", "TEXT");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " localId INTEGER PRIMARY KEY ,  recordLocalId INTEGER,  toUser TEXT default '' ,  dataId TEXT,  mediaId TEXT,  path TEXT,  cdnUrl TEXT,  cdnKey TEXT,  totalLen INTEGER default '0' ,  isThumb INTEGER default 'false' ,  offset INTEGER default '0' ,  type INTEGER default '0' ,  fileType INTEGER default '5' ,  status INTEGER default '0' ,  errCode INTEGER default '0' ,  tpaeskey TEXT,  tpauthkey TEXT,  tpdataurl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102669u7)) {
            return false;
        }
        C102669u7 u7Var = (C102669u7) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_localId), Integer.valueOf(u7Var.field_localId)) && C46238a.m51546a(Integer.valueOf(this.field_recordLocalId), Integer.valueOf(u7Var.field_recordLocalId)) && C46238a.m51546a(this.field_toUser, u7Var.field_toUser) && C46238a.m51546a(this.field_dataId, u7Var.field_dataId) && C46238a.m51546a(this.field_mediaId, u7Var.field_mediaId) && C46238a.m51546a(this.field_path, u7Var.field_path) && C46238a.m51546a(this.field_cdnUrl, u7Var.field_cdnUrl) && C46238a.m51546a(this.field_cdnKey, u7Var.field_cdnKey) && C46238a.m51546a(Integer.valueOf(this.field_totalLen), Integer.valueOf(u7Var.field_totalLen)) && C46238a.m51546a(Boolean.valueOf(this.field_isThumb), Boolean.valueOf(u7Var.field_isThumb)) && C46238a.m51546a(Integer.valueOf(this.field_offset), Integer.valueOf(u7Var.field_offset)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(u7Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_fileType), Integer.valueOf(u7Var.field_fileType)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(u7Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_errCode), Integer.valueOf(u7Var.field_errCode)) && C46238a.m51546a(this.field_tpaeskey, u7Var.field_tpaeskey) && C46238a.m51546a(this.field_tpauthkey, u7Var.field_tpauthkey) && C46238a.m51546a(this.field_tpdataurl, u7Var.field_tpdataurl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302973A == hashCode) {
                    try {
                        this.field_localId = cursor.getInt(i);
                        this.f302996d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302974B == hashCode) {
                    try {
                        this.field_recordLocalId = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302975C == hashCode) {
                    try {
                        this.field_toUser = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302976D == hashCode) {
                    try {
                        this.field_dataId = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302977E == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302978F == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302979G == hashCode) {
                    try {
                        this.field_cdnUrl = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302980H == hashCode) {
                    try {
                        this.field_cdnKey = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302981I == hashCode) {
                    try {
                        this.field_totalLen = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302982J == hashCode) {
                    try {
                        this.field_isThumb = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302983K == hashCode) {
                    try {
                        this.field_offset = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302984L == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302985M == hashCode) {
                    try {
                        this.field_fileType = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302986N == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302987P == hashCode) {
                    try {
                        this.field_errCode = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302988Q == hashCode) {
                    try {
                        this.field_tpaeskey = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302989R == hashCode) {
                    try {
                        this.field_tpauthkey = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302990S == hashCode) {
                    try {
                        this.field_tpdataurl = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRecordCDNInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302991T == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302996d) {
            contentValues.put(C66261f3.COL_LOCALID, Integer.valueOf(this.field_localId));
        }
        if (this.f302997e) {
            contentValues.put("recordLocalId", Integer.valueOf(this.field_recordLocalId));
        }
        if (this.field_toUser == null) {
            this.field_toUser = "";
        }
        if (this.f302998f) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f302999g) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f303000h) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f303001i) {
            contentValues.put("path", this.field_path);
        }
        if (this.f303002j) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f303003n) {
            contentValues.put("cdnKey", this.field_cdnKey);
        }
        if (this.f303004o) {
            contentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
        }
        if (this.f303005p) {
            if (this.field_isThumb) {
                contentValues.put("isThumb", 1);
            } else {
                contentValues.put("isThumb", 0);
            }
        }
        if (this.f303006q) {
            contentValues.put("offset", Integer.valueOf(this.field_offset));
        }
        if (this.f303007r) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f303008s) {
            contentValues.put("fileType", Integer.valueOf(this.field_fileType));
        }
        if (this.f303009t) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f303010u) {
            contentValues.put("errCode", Integer.valueOf(this.field_errCode));
        }
        if (this.f303011v) {
            contentValues.put("tpaeskey", this.field_tpaeskey);
        }
        if (this.f303012w) {
            contentValues.put("tpauthkey", this.field_tpauthkey);
        }
        if (this.f303013x) {
            contentValues.put("tpdataurl", this.field_tpdataurl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseRecordCDNInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS RecordCDNInfo ( " + f302992U.sql + ");");
        for (String add : f302995z) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseRecordCDNInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("RecordCDNInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302992U, "RecordCDNInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseRecordCDNInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("RecordCDNInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseRecordCDNInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302992U;
    }

    public String[] getIndexCreateSQL() {
        return f302995z;
    }

    public StorageObserverOwner<C102669u7> getObserverOwner() {
        return f302993V;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f302994y;
    }

    public String getTableName() {
        return f302994y.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsInteger(C66261f3.COL_LOCALID).intValue();
            if (z) {
                this.f302996d = true;
            }
        }
        if (contentValues.containsKey("recordLocalId")) {
            this.field_recordLocalId = contentValues.getAsInteger("recordLocalId").intValue();
            if (z) {
                this.f302997e = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z) {
                this.f302998f = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z) {
                this.f302999g = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f303000h = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f303001i = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z) {
                this.f303002j = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.field_cdnKey = contentValues.getAsString("cdnKey");
            if (z) {
                this.f303003n = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsInteger("totalLen").intValue();
            if (z) {
                this.f303004o = true;
            }
        }
        if (contentValues.containsKey("isThumb")) {
            this.field_isThumb = contentValues.getAsInteger("isThumb").intValue() != 0;
            if (z) {
                this.f303005p = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z) {
                this.f303006q = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f303007r = true;
            }
        }
        if (contentValues.containsKey("fileType")) {
            this.field_fileType = contentValues.getAsInteger("fileType").intValue();
            if (z) {
                this.f303008s = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f303009t = true;
            }
        }
        if (contentValues.containsKey("errCode")) {
            this.field_errCode = contentValues.getAsInteger("errCode").intValue();
            if (z) {
                this.f303010u = true;
            }
        }
        if (contentValues.containsKey("tpaeskey")) {
            this.field_tpaeskey = contentValues.getAsString("tpaeskey");
            if (z) {
                this.f303011v = true;
            }
        }
        if (contentValues.containsKey("tpauthkey")) {
            this.field_tpauthkey = contentValues.getAsString("tpauthkey");
            if (z) {
                this.f303012w = true;
            }
        }
        if (contentValues.containsKey("tpdataurl")) {
            this.field_tpdataurl = contentValues.getAsString("tpdataurl");
            if (z) {
                this.f303013x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
