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

/* renamed from: xh.s6 */
public class C38659s6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103623A = -834724724;

    /* renamed from: B */
    public static final int f103624B = 1202373969;

    /* renamed from: C */
    public static final int f103625C = -897963202;

    /* renamed from: D */
    public static final int f103626D = 29921253;

    /* renamed from: E */
    public static final int f103627E = 521581473;

    /* renamed from: F */
    public static final int f103628F = 877992755;

    /* renamed from: G */
    public static final int f103629G = -222574993;

    /* renamed from: H */
    public static final int f103630H = 504442358;

    /* renamed from: I */
    public static final int f103631I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f103632J = initAutoDBInfo(C38659s6.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C38659s6> f103633K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f103634t;

    /* renamed from: u */
    public static final String[] f103635u = new String[0];

    /* renamed from: v */
    public static final int f103636v = -880873088;

    /* renamed from: w */
    public static final int f103637w = -930859336;

    /* renamed from: x */
    public static final int f103638x = -976025642;

    /* renamed from: y */
    public static final int f103639y = -1408450836;

    /* renamed from: z */
    public static final int f103640z = -2129294769;

    /* renamed from: d */
    public boolean f103641d = true;

    /* renamed from: e */
    public boolean f103642e = true;

    /* renamed from: f */
    public boolean f103643f = true;
    public float field_autoDisappearTime;
    public long field_bindFeedId;
    public int field_conditions;
    public float field_delayAppearTime;
    public int field_deliverScenes;
    public int field_excludeDays;
    public long field_expireTime;
    public long field_feedMediaTypes;
    public String field_feedPos;
    public boolean field_isFromJumper;
    public boolean field_isPreview;
    public long field_startTime;
    public long field_taskId;

    /* renamed from: g */
    public boolean f103644g = true;

    /* renamed from: h */
    public boolean f103645h = true;

    /* renamed from: i */
    public boolean f103646i = true;

    /* renamed from: j */
    public boolean f103647j = true;

    /* renamed from: n */
    public boolean f103648n = true;

    /* renamed from: o */
    public boolean f103649o = true;

    /* renamed from: p */
    public boolean f103650p = true;

    /* renamed from: q */
    public boolean f103651q = true;

    /* renamed from: r */
    public boolean f103652r = true;

    /* renamed from: s */
    public boolean f103653s = true;

    static {
        SingleTable singleTable = new SingleTable("NpsSurveyTaskConfig");
        f103634t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("taskId", "long", singleTable.getName(), "");
        new Column("conditions", "int", singleTable.getName(), "");
        new Column("feedPos", "string", singleTable.getName(), "");
        new Column("deliverScenes", "int", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("expireTime", "long", singleTable.getName(), "");
        new Column("excludeDays", "int", singleTable.getName(), "");
        new Column("isPreview", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("delayAppearTime", "float", singleTable.getName(), "");
        new Column("autoDisappearTime", "float", singleTable.getName(), "");
        new Column("feedMediaTypes", "long", singleTable.getName(), "");
        new Column("isFromJumper", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("bindFeedId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "taskId";
        mAutoDBInfo.colsMap.put("taskId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "taskId";
        mAutoDBInfo.columns[1] = "conditions";
        mAutoDBInfo.colsMap.put("conditions", "INTEGER");
        mAutoDBInfo.columns[2] = "feedPos";
        mAutoDBInfo.colsMap.put("feedPos", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "deliverScenes";
        mAutoDBInfo.colsMap.put("deliverScenes", "INTEGER");
        mAutoDBInfo.columns[4] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG");
        mAutoDBInfo.columns[5] = "expireTime";
        mAutoDBInfo.colsMap.put("expireTime", "LONG");
        mAutoDBInfo.columns[6] = "excludeDays";
        mAutoDBInfo.colsMap.put("excludeDays", "INTEGER");
        mAutoDBInfo.columns[7] = "isPreview";
        mAutoDBInfo.colsMap.put("isPreview", "INTEGER default 'false' ");
        mAutoDBInfo.columns[8] = "delayAppearTime";
        mAutoDBInfo.colsMap.put("delayAppearTime", "FLOAT");
        mAutoDBInfo.columns[9] = "autoDisappearTime";
        mAutoDBInfo.colsMap.put("autoDisappearTime", "FLOAT");
        mAutoDBInfo.columns[10] = "feedMediaTypes";
        mAutoDBInfo.colsMap.put("feedMediaTypes", "LONG");
        mAutoDBInfo.columns[11] = "isFromJumper";
        mAutoDBInfo.colsMap.put("isFromJumper", "INTEGER default 'false' ");
        mAutoDBInfo.columns[12] = "bindFeedId";
        mAutoDBInfo.colsMap.put("bindFeedId", "LONG");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " taskId LONG PRIMARY KEY ,  conditions INTEGER,  feedPos TEXT default '' ,  deliverScenes INTEGER,  startTime LONG,  expireTime LONG,  excludeDays INTEGER,  isPreview INTEGER default 'false' ,  delayAppearTime FLOAT,  autoDisappearTime FLOAT,  feedMediaTypes LONG,  isFromJumper INTEGER default 'false' ,  bindFeedId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38659s6)) {
            return false;
        }
        C38659s6 s6Var = (C38659s6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_taskId), Long.valueOf(s6Var.field_taskId)) && C46238a.m51546a(Integer.valueOf(this.field_conditions), Integer.valueOf(s6Var.field_conditions)) && C46238a.m51546a(this.field_feedPos, s6Var.field_feedPos) && C46238a.m51546a(Integer.valueOf(this.field_deliverScenes), Integer.valueOf(s6Var.field_deliverScenes)) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(s6Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_expireTime), Long.valueOf(s6Var.field_expireTime)) && C46238a.m51546a(Integer.valueOf(this.field_excludeDays), Integer.valueOf(s6Var.field_excludeDays)) && C46238a.m51546a(Boolean.valueOf(this.field_isPreview), Boolean.valueOf(s6Var.field_isPreview)) && C46238a.m51546a(Float.valueOf(this.field_delayAppearTime), Float.valueOf(s6Var.field_delayAppearTime)) && C46238a.m51546a(Float.valueOf(this.field_autoDisappearTime), Float.valueOf(s6Var.field_autoDisappearTime)) && C46238a.m51546a(Long.valueOf(this.field_feedMediaTypes), Long.valueOf(s6Var.field_feedMediaTypes)) && C46238a.m51546a(Boolean.valueOf(this.field_isFromJumper), Boolean.valueOf(s6Var.field_isFromJumper)) && C46238a.m51546a(Long.valueOf(this.field_bindFeedId), Long.valueOf(s6Var.field_bindFeedId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103636v == hashCode) {
                    try {
                        this.field_taskId = cursor.getLong(i);
                        this.f103641d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103637w == hashCode) {
                    try {
                        this.field_conditions = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103638x == hashCode) {
                    try {
                        this.field_feedPos = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103639y == hashCode) {
                    try {
                        this.field_deliverScenes = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103640z == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103623A == hashCode) {
                    try {
                        this.field_expireTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103624B == hashCode) {
                    try {
                        this.field_excludeDays = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103625C == hashCode) {
                    try {
                        this.field_isPreview = cursor.getInt(i) != 0;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103626D == hashCode) {
                    try {
                        this.field_delayAppearTime = cursor.getFloat(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103627E == hashCode) {
                    try {
                        this.field_autoDisappearTime = cursor.getFloat(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103628F == hashCode) {
                    try {
                        this.field_feedMediaTypes = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103629G == hashCode) {
                    try {
                        this.field_isFromJumper = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103630H == hashCode) {
                    try {
                        this.field_bindFeedId = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103631I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103641d) {
            contentValues.put("taskId", Long.valueOf(this.field_taskId));
        }
        if (this.f103642e) {
            contentValues.put("conditions", Integer.valueOf(this.field_conditions));
        }
        if (this.field_feedPos == null) {
            this.field_feedPos = "";
        }
        if (this.f103643f) {
            contentValues.put("feedPos", this.field_feedPos);
        }
        if (this.f103644g) {
            contentValues.put("deliverScenes", Integer.valueOf(this.field_deliverScenes));
        }
        if (this.f103645h) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f103646i) {
            contentValues.put("expireTime", Long.valueOf(this.field_expireTime));
        }
        if (this.f103647j) {
            contentValues.put("excludeDays", Integer.valueOf(this.field_excludeDays));
        }
        if (this.f103648n) {
            if (this.field_isPreview) {
                contentValues.put("isPreview", 1);
            } else {
                contentValues.put("isPreview", 0);
            }
        }
        if (this.f103649o) {
            contentValues.put("delayAppearTime", Float.valueOf(this.field_delayAppearTime));
        }
        if (this.f103650p) {
            contentValues.put("autoDisappearTime", Float.valueOf(this.field_autoDisappearTime));
        }
        if (this.f103651q) {
            contentValues.put("feedMediaTypes", Long.valueOf(this.field_feedMediaTypes));
        }
        if (this.f103652r) {
            if (this.field_isFromJumper) {
                contentValues.put("isFromJumper", 1);
            } else {
                contentValues.put("isFromJumper", 0);
            }
        }
        if (this.f103653s) {
            contentValues.put("bindFeedId", Long.valueOf(this.field_bindFeedId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS NpsSurveyTaskConfig ( " + f103632J.sql + ");");
        for (String add : f103635u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("NpsSurveyTaskConfig", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103632J, "NpsSurveyTaskConfig", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("NpsSurveyTaskConfig", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103632J;
    }

    public String[] getIndexCreateSQL() {
        return f103635u;
    }

    public StorageObserverOwner<C38659s6> getObserverOwner() {
        return f103633K;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_taskId);
    }

    public SingleTable getTable() {
        return f103634t;
    }

    public String getTableName() {
        return f103634t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsLong("taskId").longValue();
            if (z) {
                this.f103641d = true;
            }
        }
        if (contentValues.containsKey("conditions")) {
            this.field_conditions = contentValues.getAsInteger("conditions").intValue();
            if (z) {
                this.f103642e = true;
            }
        }
        if (contentValues.containsKey("feedPos")) {
            this.field_feedPos = contentValues.getAsString("feedPos");
            if (z) {
                this.f103643f = true;
            }
        }
        if (contentValues.containsKey("deliverScenes")) {
            this.field_deliverScenes = contentValues.getAsInteger("deliverScenes").intValue();
            if (z) {
                this.f103644g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f103645h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.field_expireTime = contentValues.getAsLong("expireTime").longValue();
            if (z) {
                this.f103646i = true;
            }
        }
        if (contentValues.containsKey("excludeDays")) {
            this.field_excludeDays = contentValues.getAsInteger("excludeDays").intValue();
            if (z) {
                this.f103647j = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isPreview")) {
            this.field_isPreview = contentValues.getAsInteger("isPreview").intValue() != 0;
            if (z) {
                this.f103648n = true;
            }
        }
        if (contentValues.containsKey("delayAppearTime")) {
            this.field_delayAppearTime = contentValues.getAsFloat("delayAppearTime").floatValue();
            if (z) {
                this.f103649o = true;
            }
        }
        if (contentValues.containsKey("autoDisappearTime")) {
            this.field_autoDisappearTime = contentValues.getAsFloat("autoDisappearTime").floatValue();
            if (z) {
                this.f103650p = true;
            }
        }
        if (contentValues.containsKey("feedMediaTypes")) {
            this.field_feedMediaTypes = contentValues.getAsLong("feedMediaTypes").longValue();
            if (z) {
                this.f103651q = true;
            }
        }
        if (contentValues.containsKey("isFromJumper")) {
            if (contentValues.getAsInteger("isFromJumper").intValue() != 0) {
                z2 = true;
            }
            this.field_isFromJumper = z2;
            if (z) {
                this.f103652r = true;
            }
        }
        if (contentValues.containsKey("bindFeedId")) {
            this.field_bindFeedId = contentValues.getAsLong("bindFeedId").longValue();
            if (z) {
                this.f103653s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
