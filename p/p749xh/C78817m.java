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

/* renamed from: xh.m */
public class C78817m extends IAutoDBItem {

    /* renamed from: A */
    public static final SingleTable f231010A;

    /* renamed from: B */
    public static final String[] f231011B = new String[0];

    /* renamed from: C */
    public static final int f231012C = 93028124;

    /* renamed from: D */
    public static final int f231013D = -906989303;

    /* renamed from: E */
    public static final int f231014E = 1928844902;

    /* renamed from: F */
    public static final int f231015F = 940773407;

    /* renamed from: G */
    public static final int f231016G = 1207926875;

    /* renamed from: H */
    public static final int f231017H = 3575610;

    /* renamed from: I */
    public static final int f231018I = -849913807;

    /* renamed from: J */
    public static final int f231019J = -1019779949;

    /* renamed from: K */
    public static final int f231020K = -892481550;

    /* renamed from: L */
    public static final int f231021L = -164560949;

    /* renamed from: M */
    public static final int f231022M = 1369213417;

    /* renamed from: N */
    public static final int f231023N = 1420492253;

    /* renamed from: P */
    public static final int f231024P = 62863600;

    /* renamed from: Q */
    public static final int f231025Q = -511248632;

    /* renamed from: R */
    public static final int f231026R = -1766053558;

    /* renamed from: S */
    public static final int f231027S = 1280960425;

    /* renamed from: T */
    public static final int f231028T = -162041104;

    /* renamed from: U */
    public static final int f231029U = 1073584312;

    /* renamed from: V */
    public static final int f231030V = 1104441061;

    /* renamed from: W */
    public static final int f231031W = 1183076579;

    /* renamed from: X */
    public static final int f231032X = 108705909;

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f231033Y = initAutoDBInfo(C78817m.class);

    /* renamed from: Z */
    public static final StorageObserverOwner<C78817m> f231034Z = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f231035d = true;

    /* renamed from: e */
    public boolean f231036e = true;

    /* renamed from: f */
    public boolean f231037f = true;
    public String field_appId;
    public String field_clientAppDataId;
    public long field_createTime;
    public String field_fakeAeskey;
    public String field_fakeSignature;
    public String field_fileFullPath;
    public String field_fullXml;
    public boolean field_isUpload;
    public int field_isUseCdn;
    public long field_lastModifyTime;
    public String field_mediaId;
    public String field_mediaSvrId;
    public long field_msgInfoId;
    public long field_netTimes;
    public long field_offset;
    public long field_sdkVer;
    public String field_signature;
    public long field_status;
    public long field_totalLen;
    public long field_type;

    /* renamed from: g */
    public boolean f231038g = true;

    /* renamed from: h */
    public boolean f231039h = true;

    /* renamed from: i */
    public boolean f231040i = true;

    /* renamed from: j */
    public boolean f231041j = true;

    /* renamed from: n */
    public boolean f231042n = true;

    /* renamed from: o */
    public boolean f231043o = true;

    /* renamed from: p */
    public boolean f231044p = true;

    /* renamed from: q */
    public boolean f231045q = true;

    /* renamed from: r */
    public boolean f231046r = true;

    /* renamed from: s */
    public boolean f231047s = true;

    /* renamed from: t */
    public boolean f231048t = true;

    /* renamed from: u */
    public boolean f231049u = true;

    /* renamed from: v */
    public boolean f231050v = true;

    /* renamed from: w */
    public boolean f231051w = true;

    /* renamed from: x */
    public boolean f231052x = true;

    /* renamed from: y */
    public boolean f231053y = true;

    /* renamed from: z */
    public boolean f231054z = true;

    static {
        SingleTable singleTable = new SingleTable("appattach");
        f231010A = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("sdkVer", "long", singleTable.getName(), "");
        new Column("mediaSvrId", "string", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("clientAppDataId", "string", singleTable.getName(), "");
        new Column("type", "long", singleTable.getName(), "");
        new Column("totalLen", "long", singleTable.getName(), "");
        new Column("offset", "long", singleTable.getName(), "");
        new Column("status", "long", singleTable.getName(), "");
        new Column("isUpload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("lastModifyTime", "long", singleTable.getName(), "");
        new Column("fileFullPath", "string", singleTable.getName(), "");
        new Column("fullXml", "string", singleTable.getName(), "");
        new Column("msgInfoId", "long", singleTable.getName(), "");
        new Column("netTimes", "long", singleTable.getName(), "");
        new Column("isUseCdn", "int", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("fakeAeskey", "string", singleTable.getName(), "");
        new Column("fakeSignature", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[20];
        String[] strArr = new String[21];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "sdkVer";
        mAutoDBInfo.colsMap.put("sdkVer", "LONG");
        mAutoDBInfo.columns[2] = "mediaSvrId";
        mAutoDBInfo.colsMap.put("mediaSvrId", "TEXT");
        mAutoDBInfo.columns[3] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT");
        mAutoDBInfo.columns[4] = "clientAppDataId";
        mAutoDBInfo.colsMap.put("clientAppDataId", "TEXT");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "LONG");
        mAutoDBInfo.columns[6] = "totalLen";
        mAutoDBInfo.colsMap.put("totalLen", "LONG");
        mAutoDBInfo.columns[7] = "offset";
        mAutoDBInfo.colsMap.put("offset", "LONG");
        mAutoDBInfo.columns[8] = "status";
        mAutoDBInfo.colsMap.put("status", "LONG");
        mAutoDBInfo.columns[9] = "isUpload";
        mAutoDBInfo.colsMap.put("isUpload", "INTEGER");
        mAutoDBInfo.columns[10] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[11] = "lastModifyTime";
        mAutoDBInfo.colsMap.put("lastModifyTime", "LONG");
        mAutoDBInfo.columns[12] = "fileFullPath";
        mAutoDBInfo.colsMap.put("fileFullPath", "TEXT");
        mAutoDBInfo.columns[13] = "fullXml";
        mAutoDBInfo.colsMap.put("fullXml", "TEXT");
        mAutoDBInfo.columns[14] = "msgInfoId";
        mAutoDBInfo.colsMap.put("msgInfoId", "LONG");
        mAutoDBInfo.columns[15] = "netTimes";
        mAutoDBInfo.colsMap.put("netTimes", "LONG");
        mAutoDBInfo.columns[16] = "isUseCdn";
        mAutoDBInfo.colsMap.put("isUseCdn", "INTEGER");
        mAutoDBInfo.columns[17] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT");
        mAutoDBInfo.columns[18] = "fakeAeskey";
        mAutoDBInfo.colsMap.put("fakeAeskey", "TEXT");
        mAutoDBInfo.columns[19] = "fakeSignature";
        mAutoDBInfo.colsMap.put("fakeSignature", "TEXT");
        mAutoDBInfo.columns[20] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  sdkVer LONG,  mediaSvrId TEXT,  mediaId TEXT,  clientAppDataId TEXT,  type LONG,  totalLen LONG,  offset LONG,  status LONG,  isUpload INTEGER,  createTime LONG,  lastModifyTime LONG,  fileFullPath TEXT,  fullXml TEXT,  msgInfoId LONG,  netTimes LONG,  isUseCdn INTEGER,  signature TEXT,  fakeAeskey TEXT,  fakeSignature TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78817m)) {
            return false;
        }
        C78817m mVar = (C78817m) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, mVar.field_appId) && C46238a.m51546a(Long.valueOf(this.field_sdkVer), Long.valueOf(mVar.field_sdkVer)) && C46238a.m51546a(this.field_mediaSvrId, mVar.field_mediaSvrId) && C46238a.m51546a(this.field_mediaId, mVar.field_mediaId) && C46238a.m51546a(this.field_clientAppDataId, mVar.field_clientAppDataId) && C46238a.m51546a(Long.valueOf(this.field_type), Long.valueOf(mVar.field_type)) && C46238a.m51546a(Long.valueOf(this.field_totalLen), Long.valueOf(mVar.field_totalLen)) && C46238a.m51546a(Long.valueOf(this.field_offset), Long.valueOf(mVar.field_offset)) && C46238a.m51546a(Long.valueOf(this.field_status), Long.valueOf(mVar.field_status)) && C46238a.m51546a(Boolean.valueOf(this.field_isUpload), Boolean.valueOf(mVar.field_isUpload)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(mVar.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_lastModifyTime), Long.valueOf(mVar.field_lastModifyTime)) && C46238a.m51546a(this.field_fileFullPath, mVar.field_fileFullPath) && C46238a.m51546a(this.field_fullXml, mVar.field_fullXml) && C46238a.m51546a(Long.valueOf(this.field_msgInfoId), Long.valueOf(mVar.field_msgInfoId)) && C46238a.m51546a(Long.valueOf(this.field_netTimes), Long.valueOf(mVar.field_netTimes)) && C46238a.m51546a(Integer.valueOf(this.field_isUseCdn), Integer.valueOf(mVar.field_isUseCdn)) && C46238a.m51546a(this.field_signature, mVar.field_signature) && C46238a.m51546a(this.field_fakeAeskey, mVar.field_fakeAeskey) && C46238a.m51546a(this.field_fakeSignature, mVar.field_fakeSignature);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231012C == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231013D == hashCode) {
                    try {
                        this.field_sdkVer = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231014E == hashCode) {
                    try {
                        this.field_mediaSvrId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231015F == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231016G == hashCode) {
                    try {
                        this.field_clientAppDataId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231017H == hashCode) {
                    try {
                        this.field_type = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231018I == hashCode) {
                    try {
                        this.field_totalLen = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231019J == hashCode) {
                    try {
                        this.field_offset = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231020K == hashCode) {
                    try {
                        this.field_status = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231021L == hashCode) {
                    try {
                        this.field_isUpload = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231022M == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231023N == hashCode) {
                    try {
                        this.field_lastModifyTime = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231024P == hashCode) {
                    try {
                        this.field_fileFullPath = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231025Q == hashCode) {
                    try {
                        this.field_fullXml = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231026R == hashCode) {
                    try {
                        this.field_msgInfoId = cursor.getLong(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231027S == hashCode) {
                    try {
                        this.field_netTimes = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231028T == hashCode) {
                    try {
                        this.field_isUseCdn = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231029U == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231030V == hashCode) {
                    try {
                        this.field_fakeAeskey = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231031W == hashCode) {
                    try {
                        this.field_fakeSignature = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppAttachInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231032X == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231035d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f231036e) {
            contentValues.put("sdkVer", Long.valueOf(this.field_sdkVer));
        }
        if (this.f231037f) {
            contentValues.put("mediaSvrId", this.field_mediaSvrId);
        }
        if (this.f231038g) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f231039h) {
            contentValues.put("clientAppDataId", this.field_clientAppDataId);
        }
        if (this.f231040i) {
            contentValues.put("type", Long.valueOf(this.field_type));
        }
        if (this.f231041j) {
            contentValues.put("totalLen", Long.valueOf(this.field_totalLen));
        }
        if (this.f231042n) {
            contentValues.put("offset", Long.valueOf(this.field_offset));
        }
        if (this.f231043o) {
            contentValues.put("status", Long.valueOf(this.field_status));
        }
        if (this.f231044p) {
            if (this.field_isUpload) {
                contentValues.put("isUpload", 1);
            } else {
                contentValues.put("isUpload", 0);
            }
        }
        if (this.f231045q) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f231046r) {
            contentValues.put("lastModifyTime", Long.valueOf(this.field_lastModifyTime));
        }
        if (this.f231047s) {
            contentValues.put("fileFullPath", this.field_fileFullPath);
        }
        if (this.f231048t) {
            contentValues.put("fullXml", this.field_fullXml);
        }
        if (this.f231049u) {
            contentValues.put("msgInfoId", Long.valueOf(this.field_msgInfoId));
        }
        if (this.f231050v) {
            contentValues.put("netTimes", Long.valueOf(this.field_netTimes));
        }
        if (this.f231051w) {
            contentValues.put("isUseCdn", Integer.valueOf(this.field_isUseCdn));
        }
        if (this.f231052x) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f231053y) {
            contentValues.put("fakeAeskey", this.field_fakeAeskey);
        }
        if (this.f231054z) {
            contentValues.put("fakeSignature", this.field_fakeSignature);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppAttachInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS appattach ( " + f231033Y.sql + ");");
        for (String add : f231011B) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppAttachInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("appattach", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231033Y, "appattach", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppAttachInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("appattach", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppAttachInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231033Y;
    }

    public String[] getIndexCreateSQL() {
        return f231011B;
    }

    public StorageObserverOwner<C78817m> getObserverOwner() {
        return f231034Z;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231010A;
    }

    public String getTableName() {
        return f231010A.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f231035d = true;
            }
        }
        if (contentValues.containsKey("sdkVer")) {
            this.field_sdkVer = contentValues.getAsLong("sdkVer").longValue();
            if (z) {
                this.f231036e = true;
            }
        }
        if (contentValues.containsKey("mediaSvrId")) {
            this.field_mediaSvrId = contentValues.getAsString("mediaSvrId");
            if (z) {
                this.f231037f = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f231038g = true;
            }
        }
        if (contentValues.containsKey("clientAppDataId")) {
            this.field_clientAppDataId = contentValues.getAsString("clientAppDataId");
            if (z) {
                this.f231039h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsLong("type").longValue();
            if (z) {
                this.f231040i = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsLong("totalLen").longValue();
            if (z) {
                this.f231041j = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsLong("offset").longValue();
            if (z) {
                this.f231042n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsLong("status").longValue();
            if (z) {
                this.f231043o = true;
            }
        }
        if (contentValues.containsKey("isUpload")) {
            this.field_isUpload = contentValues.getAsInteger("isUpload").intValue() != 0;
            if (z) {
                this.f231044p = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f231045q = true;
            }
        }
        if (contentValues.containsKey("lastModifyTime")) {
            this.field_lastModifyTime = contentValues.getAsLong("lastModifyTime").longValue();
            if (z) {
                this.f231046r = true;
            }
        }
        if (contentValues.containsKey("fileFullPath")) {
            this.field_fileFullPath = contentValues.getAsString("fileFullPath");
            if (z) {
                this.f231047s = true;
            }
        }
        if (contentValues.containsKey("fullXml")) {
            this.field_fullXml = contentValues.getAsString("fullXml");
            if (z) {
                this.f231048t = true;
            }
        }
        if (contentValues.containsKey("msgInfoId")) {
            this.field_msgInfoId = contentValues.getAsLong("msgInfoId").longValue();
            if (z) {
                this.f231049u = true;
            }
        }
        if (contentValues.containsKey("netTimes")) {
            this.field_netTimes = contentValues.getAsLong("netTimes").longValue();
            if (z) {
                this.f231050v = true;
            }
        }
        if (contentValues.containsKey("isUseCdn")) {
            this.field_isUseCdn = contentValues.getAsInteger("isUseCdn").intValue();
            if (z) {
                this.f231051w = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f231052x = true;
            }
        }
        if (contentValues.containsKey("fakeAeskey")) {
            this.field_fakeAeskey = contentValues.getAsString("fakeAeskey");
            if (z) {
                this.f231053y = true;
            }
        }
        if (contentValues.containsKey("fakeSignature")) {
            this.field_fakeSignature = contentValues.getAsString("fakeSignature");
            if (z) {
                this.f231054z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
