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

/* renamed from: xh.s3 */
public class C66273s3 extends IAutoDBItem {

    /* renamed from: B */
    public static final SingleTable f190623B;

    /* renamed from: C */
    public static final Column f190624C;

    /* renamed from: D */
    public static final String[] f190625D = {"CREATE INDEX IF NOT EXISTS Finder_MediaCache_media_id ON FinderMediaCacheInfoV3(mediaId)", "CREATE INDEX IF NOT EXISTS Finder_MediaCache_state ON FinderMediaCacheInfoV3(state)", "CREATE INDEX IF NOT EXISTS Finder_MediaCache_origin_media_id ON FinderMediaCacheInfoV3(originMediaId)", "CREATE INDEX IF NOT EXISTS Finder_MediaCache_fileFormat ON FinderMediaCacheInfoV3(fileFormat)", "CREATE INDEX IF NOT EXISTS Finder_MediaCache_updateTime ON FinderMediaCacheInfoV3(updateTime)"};

    /* renamed from: E */
    public static final int f190626E = 940773407;

    /* renamed from: F */
    public static final int f190627F = 116079;

    /* renamed from: G */
    public static final int f190628G = -577311387;

    /* renamed from: H */
    public static final int f190629H = -553618781;

    /* renamed from: I */
    public static final int f190630I = 109757585;

    /* renamed from: J */
    public static final int f190631J = -366002675;

    /* renamed from: K */
    public static final int f190632K = -642437579;

    /* renamed from: L */
    public static final int f190633L = 1097056793;

    /* renamed from: M */
    public static final int f190634M = 1424870547;

    /* renamed from: N */
    public static final int f190635N = -295931082;

    /* renamed from: P */
    public static final int f190636P = -374854630;

    /* renamed from: Q */
    public static final int f190637Q = -249426318;

    /* renamed from: R */
    public static final int f190638R = -1688626505;

    /* renamed from: S */
    public static final int f190639S = 545057773;

    /* renamed from: T */
    public static final int f190640T = -1992012396;

    /* renamed from: U */
    public static final int f190641U = -980479542;

    /* renamed from: V */
    public static final int f190642V = 515188113;

    /* renamed from: W */
    public static final int f190643W = -1903512005;

    /* renamed from: X */
    public static final int f190644X = -648159924;

    /* renamed from: Y */
    public static final int f190645Y = 505343128;

    /* renamed from: Z */
    public static final int f190646Z = 794689238;

    /* renamed from: p0 */
    public static final int f190647p0 = 108705909;

    /* renamed from: x0 */
    public static final IAutoDBItem.MAutoDBInfo f190648x0 = initAutoDBInfo(C66273s3.class);

    /* renamed from: y0 */
    public static final StorageObserverOwner<C66273s3> f190649y0 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f190650A = true;

    /* renamed from: d */
    public boolean f190651d = true;

    /* renamed from: e */
    public boolean f190652e = true;

    /* renamed from: f */
    public boolean f190653f = true;
    public int field_audioBitrate;
    public long field_cacheSize;
    public String field_decodeKey;
    public int field_duration;
    public int field_dynamicRangeType;
    public String field_fileFormat;
    public int field_frameRate;
    public boolean field_hasPlayed;
    public String field_mediaId;
    public boolean field_moovReady;
    public String field_netProfile;
    public String field_originMediaId;
    public int field_playCount;
    public int field_reqFormat;
    public int field_state;
    public long field_totalSize;
    public long field_updateTime;
    public String field_url;
    public String field_urlToken;
    public int field_videoBitrate;
    public int field_videoCodecId;

    /* renamed from: g */
    public boolean f190654g = true;

    /* renamed from: h */
    public boolean f190655h = true;

    /* renamed from: i */
    public boolean f190656i = true;

    /* renamed from: j */
    public boolean f190657j = true;

    /* renamed from: n */
    public boolean f190658n = true;

    /* renamed from: o */
    public boolean f190659o = true;

    /* renamed from: p */
    public boolean f190660p = true;

    /* renamed from: q */
    public boolean f190661q = true;

    /* renamed from: r */
    public boolean f190662r = true;

    /* renamed from: s */
    public boolean f190663s = true;

    /* renamed from: t */
    public boolean f190664t = true;

    /* renamed from: u */
    public boolean f190665u = true;

    /* renamed from: v */
    public boolean f190666v = true;

    /* renamed from: w */
    public boolean f190667w = true;

    /* renamed from: x */
    public boolean f190668x = true;

    /* renamed from: y */
    public boolean f190669y = true;

    /* renamed from: z */
    public boolean f190670z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderMediaCacheInfoV3");
        f190623B = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("mediaId", "string", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("totalSize", "long", singleTable.getName(), "");
        new Column("cacheSize", "long", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("hasPlayed", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("reqFormat", "int", singleTable.getName(), "");
        new Column("originMediaId", "string", singleTable.getName(), "");
        new Column("fileFormat", "string", singleTable.getName(), "");
        f190624C = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("moovReady", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("videoBitrate", "int", singleTable.getName(), "");
        new Column("audioBitrate", "int", singleTable.getName(), "");
        new Column("frameRate", "int", singleTable.getName(), "");
        new Column("duration", "int", singleTable.getName(), "");
        new Column("urlToken", "string", singleTable.getName(), "");
        new Column("decodeKey", "string", singleTable.getName(), "");
        new Column("playCount", "int", singleTable.getName(), "");
        new Column("netProfile", "string", singleTable.getName(), "");
        new Column("dynamicRangeType", "int", singleTable.getName(), "");
        new Column("videoCodecId", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[21];
        String[] strArr = new String[22];
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
        mAutoDBInfo.columns[6] = "reqFormat";
        mAutoDBInfo.colsMap.put("reqFormat", "INTEGER default '-1' ");
        mAutoDBInfo.columns[7] = "originMediaId";
        mAutoDBInfo.colsMap.put("originMediaId", "TEXT");
        mAutoDBInfo.columns[8] = "fileFormat";
        mAutoDBInfo.colsMap.put("fileFormat", "TEXT");
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
        mAutoDBInfo.columns[17] = "playCount";
        mAutoDBInfo.colsMap.put("playCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "netProfile";
        mAutoDBInfo.colsMap.put("netProfile", "TEXT default '' ");
        mAutoDBInfo.columns[19] = "dynamicRangeType";
        mAutoDBInfo.colsMap.put("dynamicRangeType", "INTEGER default '0' ");
        mAutoDBInfo.columns[20] = "videoCodecId";
        mAutoDBInfo.colsMap.put("videoCodecId", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "rowid";
        mAutoDBInfo.sql = " mediaId TEXT PRIMARY KEY ,  url TEXT,  totalSize LONG,  cacheSize LONG,  state INTEGER,  hasPlayed INTEGER,  reqFormat INTEGER default '-1' ,  originMediaId TEXT,  fileFormat TEXT,  updateTime LONG,  moovReady INTEGER default 'false' ,  videoBitrate INTEGER default '0' ,  audioBitrate INTEGER default '0' ,  frameRate INTEGER default '0' ,  duration INTEGER default '0' ,  urlToken TEXT default '' ,  decodeKey TEXT default '' ,  playCount INTEGER default '0' ,  netProfile TEXT default '' ,  dynamicRangeType INTEGER default '0' ,  videoCodecId INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66273s3)) {
            return false;
        }
        C66273s3 s3Var = (C66273s3) iAutoDBItem;
        return C46238a.m51546a(this.field_mediaId, s3Var.field_mediaId) && C46238a.m51546a(this.field_url, s3Var.field_url) && C46238a.m51546a(Long.valueOf(this.field_totalSize), Long.valueOf(s3Var.field_totalSize)) && C46238a.m51546a(Long.valueOf(this.field_cacheSize), Long.valueOf(s3Var.field_cacheSize)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(s3Var.field_state)) && C46238a.m51546a(Boolean.valueOf(this.field_hasPlayed), Boolean.valueOf(s3Var.field_hasPlayed)) && C46238a.m51546a(Integer.valueOf(this.field_reqFormat), Integer.valueOf(s3Var.field_reqFormat)) && C46238a.m51546a(this.field_originMediaId, s3Var.field_originMediaId) && C46238a.m51546a(this.field_fileFormat, s3Var.field_fileFormat) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(s3Var.field_updateTime)) && C46238a.m51546a(Boolean.valueOf(this.field_moovReady), Boolean.valueOf(s3Var.field_moovReady)) && C46238a.m51546a(Integer.valueOf(this.field_videoBitrate), Integer.valueOf(s3Var.field_videoBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_audioBitrate), Integer.valueOf(s3Var.field_audioBitrate)) && C46238a.m51546a(Integer.valueOf(this.field_frameRate), Integer.valueOf(s3Var.field_frameRate)) && C46238a.m51546a(Integer.valueOf(this.field_duration), Integer.valueOf(s3Var.field_duration)) && C46238a.m51546a(this.field_urlToken, s3Var.field_urlToken) && C46238a.m51546a(this.field_decodeKey, s3Var.field_decodeKey) && C46238a.m51546a(Integer.valueOf(this.field_playCount), Integer.valueOf(s3Var.field_playCount)) && C46238a.m51546a(this.field_netProfile, s3Var.field_netProfile) && C46238a.m51546a(Integer.valueOf(this.field_dynamicRangeType), Integer.valueOf(s3Var.field_dynamicRangeType)) && C46238a.m51546a(Integer.valueOf(this.field_videoCodecId), Integer.valueOf(s3Var.field_videoCodecId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190626E == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                        this.f190651d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190627F == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190628G == hashCode) {
                    try {
                        this.field_totalSize = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190629H == hashCode) {
                    try {
                        this.field_cacheSize = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190630I == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190631J == hashCode) {
                    try {
                        this.field_hasPlayed = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190632K == hashCode) {
                    try {
                        this.field_reqFormat = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190633L == hashCode) {
                    try {
                        this.field_originMediaId = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190634M == hashCode) {
                    try {
                        this.field_fileFormat = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190635N == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190636P == hashCode) {
                    try {
                        this.field_moovReady = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190637Q == hashCode) {
                    try {
                        this.field_videoBitrate = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190638R == hashCode) {
                    try {
                        this.field_audioBitrate = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190639S == hashCode) {
                    try {
                        this.field_frameRate = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190640T == hashCode) {
                    try {
                        this.field_duration = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190641U == hashCode) {
                    try {
                        this.field_urlToken = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190642V == hashCode) {
                    try {
                        this.field_decodeKey = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190643W == hashCode) {
                    try {
                        this.field_playCount = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190644X == hashCode) {
                    try {
                        this.field_netProfile = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190645Y == hashCode) {
                    try {
                        this.field_dynamicRangeType = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190646Z == hashCode) {
                    try {
                        this.field_videoCodecId = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190647p0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f190651d) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f190652e) {
            contentValues.put("url", this.field_url);
        }
        if (this.f190653f) {
            contentValues.put("totalSize", Long.valueOf(this.field_totalSize));
        }
        if (this.f190654g) {
            contentValues.put("cacheSize", Long.valueOf(this.field_cacheSize));
        }
        if (this.f190655h) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f190656i) {
            if (this.field_hasPlayed) {
                contentValues.put("hasPlayed", 1);
            } else {
                contentValues.put("hasPlayed", 0);
            }
        }
        if (this.f190657j) {
            contentValues.put("reqFormat", Integer.valueOf(this.field_reqFormat));
        }
        if (this.f190658n) {
            contentValues.put("originMediaId", this.field_originMediaId);
        }
        if (this.f190659o) {
            contentValues.put("fileFormat", this.field_fileFormat);
        }
        if (this.f190660p) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f190661q) {
            if (this.field_moovReady) {
                contentValues.put("moovReady", 1);
            } else {
                contentValues.put("moovReady", 0);
            }
        }
        if (this.f190662r) {
            contentValues.put("videoBitrate", Integer.valueOf(this.field_videoBitrate));
        }
        if (this.f190663s) {
            contentValues.put("audioBitrate", Integer.valueOf(this.field_audioBitrate));
        }
        if (this.f190664t) {
            contentValues.put("frameRate", Integer.valueOf(this.field_frameRate));
        }
        if (this.f190665u) {
            contentValues.put("duration", Integer.valueOf(this.field_duration));
        }
        if (this.field_urlToken == null) {
            this.field_urlToken = "";
        }
        if (this.f190666v) {
            contentValues.put("urlToken", this.field_urlToken);
        }
        if (this.field_decodeKey == null) {
            this.field_decodeKey = "";
        }
        if (this.f190667w) {
            contentValues.put("decodeKey", this.field_decodeKey);
        }
        if (this.f190668x) {
            contentValues.put("playCount", Integer.valueOf(this.field_playCount));
        }
        if (this.field_netProfile == null) {
            this.field_netProfile = "";
        }
        if (this.f190669y) {
            contentValues.put("netProfile", this.field_netProfile);
        }
        if (this.f190670z) {
            contentValues.put("dynamicRangeType", Integer.valueOf(this.field_dynamicRangeType));
        }
        if (this.f190650A) {
            contentValues.put("videoCodecId", Integer.valueOf(this.field_videoCodecId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderMediaCacheInfoV3 ( " + f190648x0.sql + ");");
        for (String add : f190625D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderMediaCacheInfoV3", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190648x0, "FinderMediaCacheInfoV3", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderMediaCacheInfoV3", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderMediaCacheInfoV3", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190648x0;
    }

    public String[] getIndexCreateSQL() {
        return f190625D;
    }

    public StorageObserverOwner<C66273s3> getObserverOwner() {
        return f190649y0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_mediaId;
    }

    public SingleTable getTable() {
        return f190623B;
    }

    public String getTableName() {
        return f190623B.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f190651d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f190652e = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsLong("totalSize").longValue();
            if (z) {
                this.f190653f = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.field_cacheSize = contentValues.getAsLong("cacheSize").longValue();
            if (z) {
                this.f190654g = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f190655h = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("hasPlayed")) {
            this.field_hasPlayed = contentValues.getAsInteger("hasPlayed").intValue() != 0;
            if (z) {
                this.f190656i = true;
            }
        }
        if (contentValues.containsKey("reqFormat")) {
            this.field_reqFormat = contentValues.getAsInteger("reqFormat").intValue();
            if (z) {
                this.f190657j = true;
            }
        }
        if (contentValues.containsKey("originMediaId")) {
            this.field_originMediaId = contentValues.getAsString("originMediaId");
            if (z) {
                this.f190658n = true;
            }
        }
        if (contentValues.containsKey("fileFormat")) {
            this.field_fileFormat = contentValues.getAsString("fileFormat");
            if (z) {
                this.f190659o = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f190660p = true;
            }
        }
        if (contentValues.containsKey("moovReady")) {
            if (contentValues.getAsInteger("moovReady").intValue() != 0) {
                z2 = true;
            }
            this.field_moovReady = z2;
            if (z) {
                this.f190661q = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.field_videoBitrate = contentValues.getAsInteger("videoBitrate").intValue();
            if (z) {
                this.f190662r = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.field_audioBitrate = contentValues.getAsInteger("audioBitrate").intValue();
            if (z) {
                this.f190663s = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.field_frameRate = contentValues.getAsInteger("frameRate").intValue();
            if (z) {
                this.f190664t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsInteger("duration").intValue();
            if (z) {
                this.f190665u = true;
            }
        }
        if (contentValues.containsKey("urlToken")) {
            this.field_urlToken = contentValues.getAsString("urlToken");
            if (z) {
                this.f190666v = true;
            }
        }
        if (contentValues.containsKey("decodeKey")) {
            this.field_decodeKey = contentValues.getAsString("decodeKey");
            if (z) {
                this.f190667w = true;
            }
        }
        if (contentValues.containsKey("playCount")) {
            this.field_playCount = contentValues.getAsInteger("playCount").intValue();
            if (z) {
                this.f190668x = true;
            }
        }
        if (contentValues.containsKey("netProfile")) {
            this.field_netProfile = contentValues.getAsString("netProfile");
            if (z) {
                this.f190669y = true;
            }
        }
        if (contentValues.containsKey("dynamicRangeType")) {
            this.field_dynamicRangeType = contentValues.getAsInteger("dynamicRangeType").intValue();
            if (z) {
                this.f190670z = true;
            }
        }
        if (contentValues.containsKey("videoCodecId")) {
            this.field_videoCodecId = contentValues.getAsInteger("videoCodecId").intValue();
            if (z) {
                this.f190650A = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
