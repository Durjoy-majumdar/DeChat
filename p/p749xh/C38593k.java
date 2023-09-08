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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.k */
public class C38593k extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102708A = 109254796;

    /* renamed from: B */
    public static final int f102709B = -170546403;

    /* renamed from: C */
    public static final int f102710C = -403722360;

    /* renamed from: D */
    public static final int f102711D = -1662711893;

    /* renamed from: E */
    public static final int f102712E = -1612070536;

    /* renamed from: F */
    public static final int f102713F = -1945145326;

    /* renamed from: G */
    public static final int f102714G = 240217024;

    /* renamed from: H */
    public static final int f102715H = -948957570;

    /* renamed from: I */
    public static final int f102716I = 108705909;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f102717J = initAutoDBInfo(C38593k.class);

    /* renamed from: K */
    public static final StorageObserverOwner<C38593k> f102718K = new StorageObserverOwner<>();

    /* renamed from: t */
    public static final SingleTable f102719t;

    /* renamed from: u */
    public static final String[] f102720u = new String[0];

    /* renamed from: v */
    public static final int f102721v = -873566605;

    /* renamed from: w */
    public static final int f102722w = 3215;

    /* renamed from: x */
    public static final int f102723x = -318138299;

    /* renamed from: y */
    public static final int f102724y = -338815017;

    /* renamed from: z */
    public static final int f102725z = 3433509;

    /* renamed from: d */
    public boolean f102726d = true;

    /* renamed from: e */
    public boolean f102727e = true;

    /* renamed from: f */
    public boolean f102728f = true;
    public int field_ctrlType;
    public int field_ds;
    public long field_enterBusinessMs;
    public int field_exposeCount;
    public long field_exposeDuration;
    public long field_exposeFirstMs;
    public long field_exposeLastMs;
    public String field_path;
    public long field_receTimeMs;
    public int field_scene;
    public int field_showType;
    public String field_tipsId;
    public long field_urlHash;

    /* renamed from: g */
    public boolean f102729g = true;

    /* renamed from: h */
    public boolean f102730h = true;

    /* renamed from: i */
    public boolean f102731i = true;

    /* renamed from: j */
    public boolean f102732j = true;

    /* renamed from: n */
    public boolean f102733n = true;

    /* renamed from: o */
    public boolean f102734o = true;

    /* renamed from: p */
    public boolean f102735p = true;

    /* renamed from: q */
    public boolean f102736q = true;

    /* renamed from: r */
    public boolean f102737r = true;

    /* renamed from: s */
    public boolean f102738s = true;

    static {
        SingleTable singleTable = new SingleTable("AiFinderRedDotInfo");
        f102719t = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("tipsId", "string", singleTable.getName(), "");
        new Column("ds", "int", singleTable.getName(), "");
        new Column("ctrlType", "int", singleTable.getName(), "");
        new Column("showType", "int", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("urlHash", "long", singleTable.getName(), "");
        new Column("receTimeMs", "long", singleTable.getName(), "");
        new Column("exposeCount", "int", singleTable.getName(), "");
        new Column("exposeDuration", "long", singleTable.getName(), "");
        new Column("exposeFirstMs", "long", singleTable.getName(), "");
        new Column("exposeLastMs", "long", singleTable.getName(), "");
        new Column("enterBusinessMs", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[13];
        String[] strArr = new String[14];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "tipsId";
        mAutoDBInfo.colsMap.put("tipsId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "tipsId";
        mAutoDBInfo.columns[1] = "ds";
        mAutoDBInfo.colsMap.put("ds", "INTEGER");
        mAutoDBInfo.columns[2] = "ctrlType";
        mAutoDBInfo.colsMap.put("ctrlType", "INTEGER");
        mAutoDBInfo.columns[3] = "showType";
        mAutoDBInfo.colsMap.put("showType", "INTEGER");
        mAutoDBInfo.columns[4] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[5] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[6] = "urlHash";
        mAutoDBInfo.colsMap.put("urlHash", "LONG");
        mAutoDBInfo.columns[7] = "receTimeMs";
        mAutoDBInfo.colsMap.put("receTimeMs", "LONG");
        mAutoDBInfo.columns[8] = "exposeCount";
        mAutoDBInfo.colsMap.put("exposeCount", "INTEGER");
        mAutoDBInfo.columns[9] = "exposeDuration";
        mAutoDBInfo.colsMap.put("exposeDuration", "LONG");
        mAutoDBInfo.columns[10] = "exposeFirstMs";
        mAutoDBInfo.colsMap.put("exposeFirstMs", "LONG");
        mAutoDBInfo.columns[11] = "exposeLastMs";
        mAutoDBInfo.colsMap.put("exposeLastMs", "LONG");
        mAutoDBInfo.columns[12] = "enterBusinessMs";
        mAutoDBInfo.colsMap.put("enterBusinessMs", "LONG");
        mAutoDBInfo.columns[13] = "rowid";
        mAutoDBInfo.sql = " tipsId TEXT PRIMARY KEY ,  ds INTEGER,  ctrlType INTEGER,  showType INTEGER,  path TEXT,  scene INTEGER,  urlHash LONG,  receTimeMs LONG,  exposeCount INTEGER,  exposeDuration LONG,  exposeFirstMs LONG,  exposeLastMs LONG,  enterBusinessMs LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38593k)) {
            return false;
        }
        C38593k kVar = (C38593k) iAutoDBItem;
        return C46238a.m51546a(this.field_tipsId, kVar.field_tipsId) && C46238a.m51546a(Integer.valueOf(this.field_ds), Integer.valueOf(kVar.field_ds)) && C46238a.m51546a(Integer.valueOf(this.field_ctrlType), Integer.valueOf(kVar.field_ctrlType)) && C46238a.m51546a(Integer.valueOf(this.field_showType), Integer.valueOf(kVar.field_showType)) && C46238a.m51546a(this.field_path, kVar.field_path) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(kVar.field_scene)) && C46238a.m51546a(Long.valueOf(this.field_urlHash), Long.valueOf(kVar.field_urlHash)) && C46238a.m51546a(Long.valueOf(this.field_receTimeMs), Long.valueOf(kVar.field_receTimeMs)) && C46238a.m51546a(Integer.valueOf(this.field_exposeCount), Integer.valueOf(kVar.field_exposeCount)) && C46238a.m51546a(Long.valueOf(this.field_exposeDuration), Long.valueOf(kVar.field_exposeDuration)) && C46238a.m51546a(Long.valueOf(this.field_exposeFirstMs), Long.valueOf(kVar.field_exposeFirstMs)) && C46238a.m51546a(Long.valueOf(this.field_exposeLastMs), Long.valueOf(kVar.field_exposeLastMs)) && C46238a.m51546a(Long.valueOf(this.field_enterBusinessMs), Long.valueOf(kVar.field_enterBusinessMs));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102721v == hashCode) {
                    try {
                        this.field_tipsId = cursor.getString(i);
                        this.f102726d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102722w == hashCode) {
                    try {
                        this.field_ds = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102723x == hashCode) {
                    try {
                        this.field_ctrlType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102724y == hashCode) {
                    try {
                        this.field_showType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102725z == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102708A == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102709B == hashCode) {
                    try {
                        this.field_urlHash = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102710C == hashCode) {
                    try {
                        this.field_receTimeMs = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102711D == hashCode) {
                    try {
                        this.field_exposeCount = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102712E == hashCode) {
                    try {
                        this.field_exposeDuration = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102713F == hashCode) {
                    try {
                        this.field_exposeFirstMs = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102714G == hashCode) {
                    try {
                        this.field_exposeLastMs = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102715H == hashCode) {
                    try {
                        this.field_enterBusinessMs = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAiFinderRedDotInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102716I == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102726d) {
            contentValues.put("tipsId", this.field_tipsId);
        }
        if (this.f102727e) {
            contentValues.put("ds", Integer.valueOf(this.field_ds));
        }
        if (this.f102728f) {
            contentValues.put("ctrlType", Integer.valueOf(this.field_ctrlType));
        }
        if (this.f102729g) {
            contentValues.put("showType", Integer.valueOf(this.field_showType));
        }
        if (this.f102730h) {
            contentValues.put("path", this.field_path);
        }
        if (this.f102731i) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f102732j) {
            contentValues.put("urlHash", Long.valueOf(this.field_urlHash));
        }
        if (this.f102733n) {
            contentValues.put("receTimeMs", Long.valueOf(this.field_receTimeMs));
        }
        if (this.f102734o) {
            contentValues.put("exposeCount", Integer.valueOf(this.field_exposeCount));
        }
        if (this.f102735p) {
            contentValues.put("exposeDuration", Long.valueOf(this.field_exposeDuration));
        }
        if (this.f102736q) {
            contentValues.put("exposeFirstMs", Long.valueOf(this.field_exposeFirstMs));
        }
        if (this.f102737r) {
            contentValues.put("exposeLastMs", Long.valueOf(this.field_exposeLastMs));
        }
        if (this.f102738s) {
            contentValues.put("enterBusinessMs", Long.valueOf(this.field_enterBusinessMs));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAiFinderRedDotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AiFinderRedDotInfo ( " + f102717J.sql + ");");
        for (String add : f102720u) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAiFinderRedDotInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AiFinderRedDotInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102717J, "AiFinderRedDotInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAiFinderRedDotInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AiFinderRedDotInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAiFinderRedDotInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102717J;
    }

    public String[] getIndexCreateSQL() {
        return f102720u;
    }

    public StorageObserverOwner<C38593k> getObserverOwner() {
        return f102718K;
    }

    public Object getPrimaryKeyValue() {
        return this.field_tipsId;
    }

    public SingleTable getTable() {
        return f102719t;
    }

    public String getTableName() {
        return f102719t.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("tipsId")) {
            this.field_tipsId = contentValues.getAsString("tipsId");
            if (z) {
                this.f102726d = true;
            }
        }
        if (contentValues.containsKey("ds")) {
            this.field_ds = contentValues.getAsInteger("ds").intValue();
            if (z) {
                this.f102727e = true;
            }
        }
        if (contentValues.containsKey("ctrlType")) {
            this.field_ctrlType = contentValues.getAsInteger("ctrlType").intValue();
            if (z) {
                this.f102728f = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.field_showType = contentValues.getAsInteger("showType").intValue();
            if (z) {
                this.f102729g = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f102730h = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f102731i = true;
            }
        }
        if (contentValues.containsKey("urlHash")) {
            this.field_urlHash = contentValues.getAsLong("urlHash").longValue();
            if (z) {
                this.f102732j = true;
            }
        }
        if (contentValues.containsKey("receTimeMs")) {
            this.field_receTimeMs = contentValues.getAsLong("receTimeMs").longValue();
            if (z) {
                this.f102733n = true;
            }
        }
        if (contentValues.containsKey("exposeCount")) {
            this.field_exposeCount = contentValues.getAsInteger("exposeCount").intValue();
            if (z) {
                this.f102734o = true;
            }
        }
        if (contentValues.containsKey("exposeDuration")) {
            this.field_exposeDuration = contentValues.getAsLong("exposeDuration").longValue();
            if (z) {
                this.f102735p = true;
            }
        }
        if (contentValues.containsKey("exposeFirstMs")) {
            this.field_exposeFirstMs = contentValues.getAsLong("exposeFirstMs").longValue();
            if (z) {
                this.f102736q = true;
            }
        }
        if (contentValues.containsKey("exposeLastMs")) {
            this.field_exposeLastMs = contentValues.getAsLong("exposeLastMs").longValue();
            if (z) {
                this.f102737r = true;
            }
        }
        if (contentValues.containsKey("enterBusinessMs")) {
            this.field_enterBusinessMs = contentValues.getAsLong("enterBusinessMs").longValue();
            if (z) {
                this.f102738s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
