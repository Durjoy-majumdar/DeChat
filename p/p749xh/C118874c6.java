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

/* renamed from: xh.c6 */
public class C118874c6 extends IAutoDBItem {

    /* renamed from: A */
    public static final String[] f355700A = {"CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_id ON MMPlayerMediaInfoDbCache(mediaId)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_state ON MMPlayerMediaInfoDbCache(state)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_origin_media_id ON MMPlayerMediaInfoDbCache(originMediaId)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_specFormat ON MMPlayerMediaInfoDbCache(specFormat)", "CREATE INDEX IF NOT EXISTS MMPlayer_MediaIndo_updateTime ON MMPlayerMediaInfoDbCache(updateTime)"};

    /* renamed from: B */
    public static final int f355701B = 940773407;

    /* renamed from: C */
    public static final int f355702C = 116079;

    /* renamed from: D */
    public static final int f355703D = -577311387;

    /* renamed from: E */
    public static final int f355704E = -553618781;

    /* renamed from: F */
    public static final int f355705F = 109757585;

    /* renamed from: G */
    public static final int f355706G = -366002675;

    /* renamed from: H */
    public static final int f355707H = 1504250797;

    /* renamed from: I */
    public static final int f355708I = 1097056793;

    /* renamed from: J */
    public static final int f355709J = -1986862190;

    /* renamed from: K */
    public static final int f355710K = -295931082;

    /* renamed from: L */
    public static final int f355711L = -374854630;

    /* renamed from: M */
    public static final int f355712M = -249426318;

    /* renamed from: N */
    public static final int f355713N = -1688626505;

    /* renamed from: P */
    public static final int f355714P = 545057773;

    /* renamed from: Q */
    public static final int f355715Q = -1992012396;

    /* renamed from: R */
    public static final int f355716R = -980479542;

    /* renamed from: S */
    public static final int f355717S = 515188113;

    /* renamed from: T */
    public static final int f355718T = -648159924;

    /* renamed from: U */
    public static final int f355719U = 505343128;

    /* renamed from: V */
    public static final int f355720V = 108705909;

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f355721W = initAutoDBInfo(C118874c6.class);

    /* renamed from: X */
    public static final StorageObserverOwner<C118874c6> f355722X = new StorageObserverOwner<>();

    /* renamed from: z */
    public static final SingleTable f355723z;

    /* renamed from: d */
    public boolean f355724d = true;

    /* renamed from: e */
    public boolean f355725e = true;

    /* renamed from: f */
    public boolean f355726f = true;
    public int field_audioBitrate;
    public long field_cacheSize;
    public int field_codecFormat;
    public String field_decodeKey;
    public int field_duration;
    public int field_dynamicRangeType;
    public int field_frameRate;
    public boolean field_hasPlayed;
    public String field_mediaId;
    public boolean field_moovReady;
    public String field_netProfile;
    public String field_originMediaId;
    public String field_specFormat;
    public int field_state;
    public long field_totalSize;
    public long field_updateTime;
    public String field_url;
    public String field_urlToken;
    public int field_videoBitrate;

    /* renamed from: g */
    public boolean f355727g = true;

    /* renamed from: h */
    public boolean f355728h = true;

    /* renamed from: i */
    public boolean f355729i = true;

    /* renamed from: j */
    public boolean f355730j = true;

    /* renamed from: n */
    public boolean f355731n = true;

    /* renamed from: o */
    public boolean f355732o = true;

    /* renamed from: p */
    public boolean f355733p = true;

    /* renamed from: q */
    public boolean f355734q = true;

    /* renamed from: r */
    public boolean f355735r = true;

    /* renamed from: s */
    public boolean f355736s = true;

    /* renamed from: t */
    public boolean f355737t = true;

    /* renamed from: u */
    public boolean f355738u = true;

    /* renamed from: v */
    public boolean f355739v = true;

    /* renamed from: w */
    public boolean f355740w = true;

    /* renamed from: x */
    public boolean f355741x = true;

    /* renamed from: y */
    public boolean f355742y = true;

    static {
        SingleTable singleTable = new SingleTable("MMPlayerMediaInfoDbCache");
        f355723z = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("totalSize", "long", singleTable.getName(), "");
        new Column("cacheSize", "long", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("hasPlayed", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("codecFormat", "int", singleTable.getName(), "");
        new Column("originMediaId", "string", singleTable.getName(), "");
        new Column("specFormat", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("moovReady", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("videoBitrate", "int", singleTable.getName(), "");
        new Column("audioBitrate", "int", singleTable.getName(), "");
        new Column("frameRate", "int", singleTable.getName(), "");
        new Column("duration", "int", singleTable.getName(), "");
        new Column("urlToken", "string", singleTable.getName(), "");
        new Column("decodeKey", "string", singleTable.getName(), "");
        new Column("netProfile", "string", singleTable.getName(), "");
        new Column("dynamicRangeType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[19];
        String[] strArr = new String[20];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "mediaId";
        mAutoDBInfo.columns[1] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[2] = "totalSize";
        mAutoDBInfo.colsMap.put("totalSize", "LONG");
        mAutoDBInfo.columns[3] = "cacheSize";
        mAutoDBInfo.colsMap.put("cacheSize", "LONG");
        mAutoDBInfo.columns[4] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[5] = "hasPlayed";
        mAutoDBInfo.colsMap.put("hasPlayed", "INTEGER");
        mAutoDBInfo.columns[6] = "codecFormat";
        mAutoDBInfo.colsMap.put("codecFormat", "INTEGER default '-1' ");
        mAutoDBInfo.columns[7] = "originMediaId";
        mAutoDBInfo.colsMap.put("originMediaId", "TEXT");
        mAutoDBInfo.columns[8] = "specFormat";
        mAutoDBInfo.colsMap.put("specFormat", "TEXT");
        mAutoDBInfo.columns[9] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[10] = "moovReady";
        mAutoDBInfo.colsMap.put("moovReady", "INTEGER default 'false' ");
        mAutoDBInfo.columns[11] = "videoBitrate";
        mAutoDBInfo.colsMap.put("videoBitrate", "INTEGER default '0' ");
        mAutoDBInfo.columns[12] = "audioBitrate";
        mAutoDBInfo.colsMap.put("audioBitrate", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "frameRate";
        mAutoDBInfo.colsMap.put("frameRate", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "duration";
        mAutoDBInfo.colsMap.put("duration", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "urlToken";
        mAutoDBInfo.colsMap.put("urlToken", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "decodeKey";
        mAutoDBInfo.colsMap.put("decodeKey", "TEXT default '' ");
        mAutoDBInfo.columns[17] = "netProfile";
        mAutoDBInfo.colsMap.put("netProfile", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "dynamicRangeType";
        mAutoDBInfo.colsMap.put("dynamicRangeType", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "rowid";
        mAutoDBInfo.sql = " mediaId TEXT PRIMARY KEY ,  url TEXT,  totalSize LONG,  cacheSize LONG,  state INTEGER,  hasPlayed INTEGER,  codecFormat INTEGER default '-1' ,  originMediaId TEXT,  specFormat TEXT,  updateTime LONG,  moovReady INTEGER default 'false' ,  videoBitrate INTEGER default '0' ,  audioBitrate INTEGER default '0' ,  frameRate INTEGER default '0' ,  duration INTEGER default '0' ,  urlToken TEXT default '' ,  decodeKey TEXT default '' ,  netProfile TEXT default '' ,  dynamicRangeType INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C118874c6)) {
            return false;
        }
        C118874c6 c6Var = (C118874c6) iAutoDBItem;
        return C46238a.m51546a(this.field_mediaId, c6Var.field_mediaId) && C46238a.m51546a(this.field_url, c6Var.field_url) && C46238a.m51546a(Long.valueOf(this.field_totalSize), Long.valueOf(c6Var.field_totalSize)) && C46238a.m51546a(Long.valueOf(this.field_cacheSize), Long.valueOf(c6Var.field_cacheSize)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(c6Var.field_state)) && C46238a.m51546a(Boolean.valueOf(this.field_hasPlayed), Boolean.valueOf(c6Var.field_hasPlayed)) && C46238a.m51546a(Integer.valueOf(this.field_codecFormat), Integer.valueOf(c6Var.field_codecFormat)) && C46238a.m51546a(this.field_originMediaId, c6Var.field_originMediaId) && C46238a.m51546a(this.field_specFormat, c6Var.field_specFormat) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(c6Var.field_updateTime)) && C46238a.m51546a(Boolean.valueOf(this.field_moovReady), Boolean.valueOf(c6Var.field_moovReady)) && C46238a.m51546a(Integer.valueOf(this.field_videoBitrate), Integer.valueOf(c6Var.field_videoBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_audioBitrate), Integer.valueOf(c6Var.field_audioBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_frameRate), Integer.valueOf(c6Var.field_frameRate)) && C46238a.m51546a(Integer.valueOf(this.field_duration), Integer.valueOf(c6Var.field_duration)) && C46238a.m51546a(this.field_urlToken, c6Var.field_urlToken) && C46238a.m51546a(this.field_decodeKey, c6Var.field_decodeKey) && C46238a.m51546a(this.field_netProfile, c6Var.field_netProfile) && C46238a.m51546a(Integer.valueOf(this.field_dynamicRangeType), Integer.valueOf(c6Var.field_dynamicRangeType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f355701B == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                        this.f355724d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355702C == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355703D == hashCode) {
                    try {
                        this.field_totalSize = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355704E == hashCode) {
                    try {
                        this.field_cacheSize = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355705F == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355706G == hashCode) {
                    try {
                        this.field_hasPlayed = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355707H == hashCode) {
                    try {
                        this.field_codecFormat = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355708I == hashCode) {
                    try {
                        this.field_originMediaId = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355709J == hashCode) {
                    try {
                        this.field_specFormat = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355710K == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355711L == hashCode) {
                    try {
                        this.field_moovReady = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355712M == hashCode) {
                    try {
                        this.field_videoBitrate = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355713N == hashCode) {
                    try {
                        this.field_audioBitrate = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355714P == hashCode) {
                    try {
                        this.field_frameRate = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355715Q == hashCode) {
                    try {
                        this.field_duration = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355716R == hashCode) {
                    try {
                        this.field_urlToken = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355717S == hashCode) {
                    try {
                        this.field_decodeKey = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355718T == hashCode) {
                    try {
                        this.field_netProfile = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355719U == hashCode) {
                    try {
                        this.field_dynamicRangeType = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f355720V == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f355724d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f355725e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f355726f) {
            contentValues.put("totalSize", Long.valueOf(this.field_totalSize));
        }
        if (this.f355727g) {
            contentValues.put("cacheSize", Long.valueOf(this.field_cacheSize));
        }
        if (this.f355728h) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f355729i) {
            if (this.field_hasPlayed) {
                contentValues.put("hasPlayed", 1);
            } else {
                contentValues.put("hasPlayed", 0);
            }
        }
        if (this.f355730j) {
            contentValues.put("codecFormat", Integer.valueOf(this.field_codecFormat));
        }
        if (this.f355731n) {
            contentValues.put("originMediaId", this.field_originMediaId);
        }
        if (this.f355732o) {
            contentValues.put("specFormat", this.field_specFormat);
        }
        if (this.f355733p) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f355734q) {
            if (this.field_moovReady) {
                contentValues.put("moovReady", 1);
            } else {
                contentValues.put("moovReady", 0);
            }
        }
        if (this.f355735r) {
            contentValues.put("videoBitrate", Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f355736s) {
            contentValues.put("audioBitrate", Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f355737t) {
            contentValues.put("frameRate", Integer.valueOf(this.field_frameRate));
        }
        if (this.f355738u) {
            contentValues.put("duration", Integer.valueOf(this.field_duration));
        }
        if (this.field_urlToken == null) {
            this.field_urlToken = "";
        }
        if (this.f355739v) {
            contentValues.put("urlToken", this.field_urlToken);
        }
        if (this.field_decodeKey == null) {
            this.field_decodeKey = "";
        }
        if (this.f355740w) {
            contentValues.put("decodeKey", this.field_decodeKey);
        }
        if (this.field_netProfile == null) {
            this.field_netProfile = "";
        }
        if (this.f355741x) {
            contentValues.put("netProfile", this.field_netProfile);
        }
        if (this.f355742y) {
            contentValues.put("dynamicRangeType", Integer.valueOf(this.field_dynamicRangeType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MMPlayerMediaInfoDbCache ( " + f355721W.sql + ");");
        for (String add : f355700A) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MMPlayerMediaInfoDbCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f355721W, "MMPlayerMediaInfoDbCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MMPlayerMediaInfoDbCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMMPlayerMediaInfoDbCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f355721W;
    }

    public String[] getIndexCreateSQL() {
        return f355700A;
    }

    public StorageObserverOwner<C118874c6> getObserverOwner() {
        return f355722X;
    }

    public Object getPrimaryKeyValue() {
        return this.field_mediaId;
    }

    public SingleTable getTable() {
        return f355723z;
    }

    public String getTableName() {
        return f355723z.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f355724d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f355725e = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsLong("totalSize").longValue();
            if (z) {
                this.f355726f = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsLong("cacheSize").longValue();
            if (z) {
                this.f355727g = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f355728h = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("hasPlayed")) {
            this.field_hasPlayed = contentValues.getAsInteger("hasPlayed").intValue() != 0;
            if (z) {
                this.f355729i = true;
            }
        }
        if (contentValues.containsKey("codecFormat")) {
            this.field_codecFormat = contentValues.getAsInteger("codecFormat").intValue();
            if (z) {
                this.f355730j = true;
            }
        }
        if (contentValues.containsKey("originMediaId")) {
            this.field_originMediaId = contentValues.getAsString("originMediaId");
            if (z) {
                this.f355731n = true;
            }
        }
        if (contentValues.containsKey("specFormat")) {
            this.field_specFormat = contentValues.getAsString("specFormat");
            if (z) {
                this.f355732o = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f355733p = true;
            }
        }
        if (contentValues.containsKey("moovReady")) {
            if (contentValues.getAsInteger("moovReady").intValue() != 0) {
                z2 = true;
            }
            this.field_moovReady = z2;
            if (z) {
                this.f355734q = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z) {
                this.f355735r = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z) {
                this.f355736s = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z) {
                this.f355737t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z) {
                this.f355738u = true;
            }
        }
        if (contentValues.containsKey("urlToken")) {
            this.field_urlToken = contentValues.getAsString("urlToken");
            if (z) {
                this.f355739v = true;
            }
        }
        if (contentValues.containsKey("decodeKey")) {
            this.field_decodeKey = contentValues.getAsString("decodeKey");
            if (z) {
                this.f355740w = true;
            }
        }
        if (contentValues.containsKey("netProfile")) {
            this.field_netProfile = contentValues.getAsString("netProfile");
            if (z) {
                this.f355741x = true;
            }
        }
        if (contentValues.containsKey("dynamicRangeType")) {
            this.field_dynamicRangeType = contentValues.getAsInteger("dynamicRangeType").intValue();
            if (z) {
                this.f355742y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
