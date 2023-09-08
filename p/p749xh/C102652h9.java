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

/* renamed from: xh.h9 */
public class C102652h9 extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f302470B;

    /* renamed from: C */
    public static final String[] f302471C = new String[0];

    /* renamed from: D */
    public static final int f302472D = -880873088;

    /* renamed from: E */
    public static final int f302473E = -492230834;

    /* renamed from: F */
    public static final int f302474F = 25573622;

    /* renamed from: G */
    public static final int f302475G = 374093465;

    /* renamed from: H */
    public static final int f302476H = -92515438;

    /* renamed from: I */
    public static final int f302477I = -892481550;

    /* renamed from: J */
    public static final int f302478J = -2092294475;

    /* renamed from: K */
    public static final int f302479K = -869614056;

    /* renamed from: L */
    public static final int f302480L = -249426318;

    /* renamed from: M */
    public static final int f302481M = -1688626505;

    /* renamed from: N */
    public static final int f302482N = -1475447264;

    /* renamed from: P */
    public static final int f302483P = -739414846;

    /* renamed from: Q */
    public static final int f302484Q = 545057773;

    /* renamed from: R */
    public static final int f302485R = 1009735094;

    /* renamed from: S */
    public static final int f302486S = 902870898;

    /* renamed from: T */
    public static final int f302487T = 1931047938;

    /* renamed from: U */
    public static final int f302488U = -266964459;

    /* renamed from: V */
    public static final int f302489V = 1901043637;

    /* renamed from: W */
    public static final int f302490W = 1072729064;

    /* renamed from: X */
    public static final int f302491X = -1881330351;

    /* renamed from: Y */
    public static final int f302492Y = 69094146;

    /* renamed from: Z */
    public static final int f302493Z = 108705909;

    /* renamed from: p0 */
    public static final IAutoDBItem.MAutoDBInfo f302494p0 = initAutoDBInfo(C102652h9.class);

    /* renamed from: x0 */
    public static final StorageObserverOwner<C102652h9> f302495x0 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f302496A = true;

    /* renamed from: d */
    public boolean f302497d = true;

    /* renamed from: e */
    public boolean f302498e = true;

    /* renamed from: f */
    public boolean f302499f = true;
    public int field_audioBitrate;
    public int field_audioChannelCount;
    public int field_audioSampleRate;
    public byte[] field_baseItemData;
    public String field_blurBgPath;
    public long field_expiredTime;
    public byte[] field_extraConfig;
    public int field_frameRate;
    public int field_fromScene;
    public byte[] field_location;
    public int field_mixFlag;
    public int field_mixRetryTime;
    public String field_reportInfo;
    public int field_status;
    public int field_targetHeight;
    public int field_targetWidth;
    public String field_taskId;
    public long field_timeStamp;
    public String field_userData;
    public int field_videoBitrate;
    public int field_videoRotate;

    /* renamed from: g */
    public boolean f302500g = true;

    /* renamed from: h */
    public boolean f302501h = true;

    /* renamed from: i */
    public boolean f302502i = true;

    /* renamed from: j */
    public boolean f302503j = true;

    /* renamed from: n */
    public boolean f302504n = true;

    /* renamed from: o */
    public boolean f302505o = true;

    /* renamed from: p */
    public boolean f302506p = true;

    /* renamed from: q */
    public boolean f302507q = true;

    /* renamed from: r */
    public boolean f302508r = true;

    /* renamed from: s */
    public boolean f302509s = true;

    /* renamed from: t */
    public boolean f302510t = true;

    /* renamed from: u */
    public boolean f302511u = true;

    /* renamed from: v */
    public boolean f302512v = true;

    /* renamed from: w */
    public boolean f302513w = true;

    /* renamed from: x */
    public boolean f302514x = true;

    /* renamed from: y */
    public boolean f302515y = true;

    /* renamed from: z */
    public boolean f302516z = true;

    static {
        SingleTable singleTable = new SingleTable("VideoEditInfo");
        f302470B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("taskId", "string", singleTable.getName(), "");
        new Column("baseItemData", "byte[]", singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
        new Column("mixRetryTime", "int", singleTable.getName(), "");
        new Column("expiredTime", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("targetWidth", "int", singleTable.getName(), "");
        new Column("targetHeight", "int", singleTable.getName(), "");
        new Column("videoBitrate", "int", singleTable.getName(), "");
        new Column("audioBitrate", "int", singleTable.getName(), "");
        new Column("audioSampleRate", "int", singleTable.getName(), "");
        new Column("audioChannelCount", "int", singleTable.getName(), "");
        new Column("frameRate", "int", singleTable.getName(), "");
        new Column("videoRotate", "int", singleTable.getName(), "");
        new Column("extraConfig", "byte[]", singleTable.getName(), "");
        new Column("reportInfo", "string", singleTable.getName(), "");
        new Column("userData", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.LOCATION, "byte[]", singleTable.getName(), "");
        new Column("mixFlag", "int", singleTable.getName(), "");
        new Column("blurBgPath", "string", singleTable.getName(), "");
        new Column("fromScene", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[21];
        String[] strArr = new String[22];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "taskId";
        mAutoDBInfo.colsMap.put("taskId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "taskId";
        mAutoDBInfo.columns[1] = "baseItemData";
        mAutoDBInfo.colsMap.put("baseItemData", "BLOB");
        mAutoDBInfo.columns[2] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG");
        mAutoDBInfo.columns[3] = "mixRetryTime";
        mAutoDBInfo.colsMap.put("mixRetryTime", "INTEGER");
        mAutoDBInfo.columns[4] = "expiredTime";
        mAutoDBInfo.colsMap.put("expiredTime", "LONG");
        mAutoDBInfo.columns[5] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[6] = "targetWidth";
        mAutoDBInfo.colsMap.put("targetWidth", "INTEGER");
        mAutoDBInfo.columns[7] = "targetHeight";
        mAutoDBInfo.colsMap.put("targetHeight", "INTEGER");
        mAutoDBInfo.columns[8] = "videoBitrate";
        mAutoDBInfo.colsMap.put("videoBitrate", "INTEGER");
        mAutoDBInfo.columns[9] = "audioBitrate";
        mAutoDBInfo.colsMap.put("audioBitrate", "INTEGER");
        mAutoDBInfo.columns[10] = "audioSampleRate";
        mAutoDBInfo.colsMap.put("audioSampleRate", "INTEGER");
        mAutoDBInfo.columns[11] = "audioChannelCount";
        mAutoDBInfo.colsMap.put("audioChannelCount", "INTEGER");
        mAutoDBInfo.columns[12] = "frameRate";
        mAutoDBInfo.colsMap.put("frameRate", "INTEGER");
        mAutoDBInfo.columns[13] = "videoRotate";
        mAutoDBInfo.colsMap.put("videoRotate", "INTEGER");
        mAutoDBInfo.columns[14] = "extraConfig";
        mAutoDBInfo.colsMap.put("extraConfig", "BLOB");
        mAutoDBInfo.columns[15] = "reportInfo";
        mAutoDBInfo.colsMap.put("reportInfo", "TEXT");
        mAutoDBInfo.columns[16] = "userData";
        mAutoDBInfo.colsMap.put("userData", "TEXT");
        mAutoDBInfo.columns[17] = FirebaseAnalytics.C113379b.LOCATION;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.LOCATION, "BLOB");
        mAutoDBInfo.columns[18] = "mixFlag";
        mAutoDBInfo.colsMap.put("mixFlag", "INTEGER");
        mAutoDBInfo.columns[19] = "blurBgPath";
        mAutoDBInfo.colsMap.put("blurBgPath", "TEXT");
        mAutoDBInfo.columns[20] = "fromScene";
        mAutoDBInfo.colsMap.put("fromScene", "INTEGER");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " taskId TEXT PRIMARY KEY ,  baseItemData BLOB,  timeStamp LONG,  mixRetryTime INTEGER,  expiredTime LONG,  status INTEGER,  targetWidth INTEGER,  targetHeight INTEGER,  videoBitrate INTEGER,  audioBitrate INTEGER,  audioSampleRate INTEGER,  audioChannelCount INTEGER,  frameRate INTEGER,  videoRotate INTEGER,  extraConfig BLOB,  reportInfo TEXT,  userData TEXT,  location BLOB,  mixFlag INTEGER,  blurBgPath TEXT,  fromScene INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102652h9)) {
            return false;
        }
        C102652h9 h9Var = (C102652h9) iAutoDBItem;
        return C46238a.m51546a(this.field_taskId, h9Var.field_taskId) && C46238a.m51546a(this.field_baseItemData, h9Var.field_baseItemData) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(h9Var.field_timeStamp)) && C46238a.m51546a(Integer.valueOf(this.field_mixRetryTime), Integer.valueOf(h9Var.field_mixRetryTime)) && C46238a.m51546a(Long.valueOf(this.field_expiredTime), Long.valueOf(h9Var.field_expiredTime)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(h9Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_targetWidth), Integer.valueOf(h9Var.field_targetWidth)) && C46238a.m51546a(Integer.valueOf(this.field_targetHeight), Integer.valueOf(h9Var.field_targetHeight)) && C46238a.m51546a(Integer.valueOf(this.field_videoBitrate), Integer.valueOf(h9Var.field_videoBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_audioBitrate), Integer.valueOf(h9Var.field_audioBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_audioSampleRate), Integer.valueOf(h9Var.field_audioSampleRate)) && C46238a.m51546a(Integer.valueOf(this.field_audioChannelCount), Integer.valueOf(h9Var.field_audioChannelCount)) && C46238a.m51546a(Integer.valueOf(this.field_frameRate), Integer.valueOf(h9Var.field_frameRate)) && C46238a.m51546a(Integer.valueOf(this.field_videoRotate), Integer.valueOf(h9Var.field_videoRotate)) && C46238a.m51546a(this.field_extraConfig, h9Var.field_extraConfig) && C46238a.m51546a(this.field_reportInfo, h9Var.field_reportInfo) && C46238a.m51546a(this.field_userData, h9Var.field_userData) && C46238a.m51546a(this.field_location, h9Var.field_location) && C46238a.m51546a(Integer.valueOf(this.field_mixFlag), Integer.valueOf(h9Var.field_mixFlag)) && C46238a.m51546a(this.field_blurBgPath, h9Var.field_blurBgPath) && C46238a.m51546a(Integer.valueOf(this.field_fromScene), Integer.valueOf(h9Var.field_fromScene));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302472D == hashCode) {
                    try {
                        this.field_taskId = cursor.getString(i);
                        this.f302497d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302473E == hashCode) {
                    try {
                        this.field_baseItemData = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302474F == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302475G == hashCode) {
                    try {
                        this.field_mixRetryTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302476H == hashCode) {
                    try {
                        this.field_expiredTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302477I == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302478J == hashCode) {
                    try {
                        this.field_targetWidth = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302479K == hashCode) {
                    try {
                        this.field_targetHeight = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302480L == hashCode) {
                    try {
                        this.field_videoBitrate = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302481M == hashCode) {
                    try {
                        this.field_audioBitrate = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302482N == hashCode) {
                    try {
                        this.field_audioSampleRate = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302483P == hashCode) {
                    try {
                        this.field_audioChannelCount = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302484Q == hashCode) {
                    try {
                        this.field_frameRate = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302485R == hashCode) {
                    try {
                        this.field_videoRotate = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302486S == hashCode) {
                    try {
                        this.field_extraConfig = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302487T == hashCode) {
                    try {
                        this.field_reportInfo = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302488U == hashCode) {
                    try {
                        this.field_userData = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302489V == hashCode) {
                    try {
                        this.field_location = cursor.getBlob(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302490W == hashCode) {
                    try {
                        this.field_mixFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302491X == hashCode) {
                    try {
                        this.field_blurBgPath = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302492Y == hashCode) {
                    try {
                        this.field_fromScene = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVideoEditInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302493Z == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302497d) {
            contentValues.put("taskId", this.field_taskId);
        }
        if (this.f302498e) {
            contentValues.put("baseItemData", this.field_baseItemData);
        }
        if (this.f302499f) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        if (this.f302500g) {
            contentValues.put("mixRetryTime", Integer.valueOf(this.field_mixRetryTime));
        }
        if (this.f302501h) {
            contentValues.put("expiredTime", Long.valueOf(this.field_expiredTime));
        }
        if (this.f302502i) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f302503j) {
            contentValues.put("targetWidth", Integer.valueOf(this.field_targetWidth));
        }
        if (this.f302504n) {
            contentValues.put("targetHeight", Integer.valueOf(this.field_targetHeight));
        }
        if (this.f302505o) {
            contentValues.put("videoBitrate", Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f302506p) {
            contentValues.put("audioBitrate", Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f302507q) {
            contentValues.put("audioSampleRate", Integer.valueOf(this.field_audioSampleRate));
        }
        if (this.f302508r) {
            contentValues.put("audioChannelCount", Integer.valueOf(this.field_audioChannelCount));
        }
        if (this.f302509s) {
            contentValues.put("frameRate", Integer.valueOf(this.field_frameRate));
        }
        if (this.f302510t) {
            contentValues.put("videoRotate", Integer.valueOf(this.field_videoRotate));
        }
        if (this.f302511u) {
            contentValues.put("extraConfig", this.field_extraConfig);
        }
        if (this.f302512v) {
            contentValues.put("reportInfo", this.field_reportInfo);
        }
        if (this.f302513w) {
            contentValues.put("userData", this.field_userData);
        }
        if (this.f302514x) {
            contentValues.put(FirebaseAnalytics.C113379b.LOCATION, this.field_location);
        }
        if (this.f302515y) {
            contentValues.put("mixFlag", Integer.valueOf(this.field_mixFlag));
        }
        if (this.f302516z) {
            contentValues.put("blurBgPath", this.field_blurBgPath);
        }
        if (this.f302496A) {
            contentValues.put("fromScene", Integer.valueOf(this.field_fromScene));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseVideoEditInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS VideoEditInfo ( " + f302494p0.sql + ");");
        for (String add : f302471C) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseVideoEditInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("VideoEditInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302494p0, "VideoEditInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseVideoEditInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("VideoEditInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseVideoEditInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302494p0;
    }

    public String[] getIndexCreateSQL() {
        return f302471C;
    }

    public StorageObserverOwner<C102652h9> getObserverOwner() {
        return f302495x0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_taskId;
    }

    public SingleTable getTable() {
        return f302470B;
    }

    public String getTableName() {
        return f302470B.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsString("taskId");
            if (z) {
                this.f302497d = true;
            }
        }
        if (contentValues.containsKey("baseItemData")) {
            this.field_baseItemData = contentValues.getAsByteArray("baseItemData");
            if (z) {
                this.f302498e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f302499f = true;
            }
        }
        if (contentValues.containsKey("mixRetryTime")) {
            this.field_mixRetryTime = contentValues.getAsInteger("mixRetryTime").intValue();
            if (z) {
                this.f302500g = true;
            }
        }
        if (contentValues.containsKey("expiredTime")) {
            this.field_expiredTime = contentValues.getAsLong("expiredTime").longValue();
            if (z) {
                this.f302501h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f302502i = true;
            }
        }
        if (contentValues.containsKey("targetWidth")) {
            this.field_targetWidth = contentValues.getAsInteger("targetWidth").intValue();
            if (z) {
                this.f302503j = true;
            }
        }
        if (contentValues.containsKey("targetHeight")) {
            this.field_targetHeight = contentValues.getAsInteger("targetHeight").intValue();
            if (z) {
                this.f302504n = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z) {
                this.f302505o = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z) {
                this.f302506p = true;
            }
        }
        if (contentValues.containsKey("audioSampleRate")) {
            this.field_audioSampleRate = contentValues.getAsInteger("audioSampleRate").intValue();
            if (z) {
                this.f302507q = true;
            }
        }
        if (contentValues.containsKey("audioChannelCount")) {
            this.field_audioChannelCount = contentValues.getAsInteger("audioChannelCount").intValue();
            if (z) {
                this.f302508r = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z) {
                this.f302509s = true;
            }
        }
        if (contentValues.containsKey("videoRotate")) {
            this.field_videoRotate = contentValues.getAsInteger("videoRotate").intValue();
            if (z) {
                this.f302510t = true;
            }
        }
        if (contentValues.containsKey("extraConfig")) {
            this.field_extraConfig = contentValues.getAsByteArray("extraConfig");
            if (z) {
                this.f302511u = true;
            }
        }
        if (contentValues.containsKey("reportInfo")) {
            this.field_reportInfo = contentValues.getAsString("reportInfo");
            if (z) {
                this.f302512v = true;
            }
        }
        if (contentValues.containsKey("userData")) {
            this.field_userData = contentValues.getAsString("userData");
            if (z) {
                this.f302513w = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.LOCATION)) {
            this.field_location = contentValues.getAsByteArray(FirebaseAnalytics.C113379b.LOCATION);
            if (z) {
                this.f302514x = true;
            }
        }
        if (contentValues.containsKey("mixFlag")) {
            this.field_mixFlag = contentValues.getAsInteger("mixFlag").intValue();
            if (z) {
                this.f302515y = true;
            }
        }
        if (contentValues.containsKey("blurBgPath")) {
            this.field_blurBgPath = contentValues.getAsString("blurBgPath");
            if (z) {
                this.f302516z = true;
            }
        }
        if (contentValues.containsKey("fromScene")) {
            this.field_fromScene = contentValues.getAsInteger("fromScene").intValue();
            if (z) {
                this.f302496A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
