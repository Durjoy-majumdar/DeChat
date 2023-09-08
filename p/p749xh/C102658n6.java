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

/* renamed from: xh.n6 */
public class C102658n6 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final StorageObserverOwner<C102658n6> f302718A1 = new StorageObserverOwner<>();

    /* renamed from: Q0 */
    public static final int f302719Q0 = 443797010;

    /* renamed from: R0 */
    public static final int f302720R0 = -295931082;

    /* renamed from: S0 */
    public static final int f302721S0 = -896725744;

    /* renamed from: T0 */
    public static final int f302722T0 = 1535136064;

    /* renamed from: U0 */
    public static final int f302723U0 = -2052423439;

    /* renamed from: V */
    public static final SingleTable f302724V;

    /* renamed from: V0 */
    public static final int f302725V0 = 332889690;

    /* renamed from: W */
    public static final String[] f302726W = new String[0];

    /* renamed from: W0 */
    public static final int f302727W0 = 1157940404;

    /* renamed from: X */
    public static final int f302728X = 1412694560;

    /* renamed from: X0 */
    public static final int f302729X0 = 37353653;

    /* renamed from: Y */
    public static final int f302730Y = 1568977946;

    /* renamed from: Y0 */
    public static final int f302731Y0 = -786492557;

    /* renamed from: Z */
    public static final int f302732Z = 390158079;

    /* renamed from: Z0 */
    public static final int f302733Z0 = -2061356810;

    /* renamed from: a1 */
    public static final int f302734a1 = 47086405;

    /* renamed from: b1 */
    public static final int f302735b1 = 720895044;

    /* renamed from: c1 */
    public static final int f302736c1 = -1941975312;

    /* renamed from: d1 */
    public static final int f302737d1 = 93028124;

    /* renamed from: e1 */
    public static final int f302738e1 = -354369206;

    /* renamed from: f1 */
    public static final int f302739f1 = 182086135;

    /* renamed from: g1 */
    public static final int f302740g1 = -1649409177;

    /* renamed from: h1 */
    public static final int f302741h1 = 343450698;

    /* renamed from: i1 */
    public static final int f302742i1 = -1500002487;

    /* renamed from: j1 */
    public static final int f302743j1 = 1400420665;

    /* renamed from: k1 */
    public static final int f302744k1 = -315078025;

    /* renamed from: l1 */
    public static final int f302745l1 = -381338388;

    /* renamed from: m1 */
    public static final int f302746m1 = -153301234;

    /* renamed from: n1 */
    public static final int f302747n1 = -757004792;

    /* renamed from: o1 */
    public static final int f302748o1 = 2055238019;

    /* renamed from: p0 */
    public static final int f302749p0 = 57065709;

    /* renamed from: p1 */
    public static final int f302750p1 = -2129294769;

    /* renamed from: q1 */
    public static final int f302751q1 = -1391167122;

    /* renamed from: r1 */
    public static final int f302752r1 = -989163880;

    /* renamed from: s1 */
    public static final int f302753s1 = 1865736868;

    /* renamed from: t1 */
    public static final int f302754t1 = -127337090;

    /* renamed from: u1 */
    public static final int f302755u1 = -169113894;

    /* renamed from: v1 */
    public static final int f302756v1 = 1355420059;

    /* renamed from: w1 */
    public static final int f302757w1 = -2028691181;

    /* renamed from: x0 */
    public static final int f302758x0 = 1075046946;

    /* renamed from: x1 */
    public static final int f302759x1 = 108104;

    /* renamed from: y0 */
    public static final int f302760y0 = -1607657753;

    /* renamed from: y1 */
    public static final int f302761y1 = 108705909;

    /* renamed from: z1 */
    public static final IAutoDBItem.MAutoDBInfo f302762z1 = initAutoDBInfo(C102658n6.class);

    /* renamed from: A */
    public boolean f302763A = true;

    /* renamed from: B */
    public boolean f302764B = true;

    /* renamed from: C */
    public boolean f302765C = true;

    /* renamed from: D */
    public boolean f302766D = true;

    /* renamed from: E */
    public boolean f302767E = true;

    /* renamed from: F */
    public boolean f302768F = true;

    /* renamed from: G */
    public boolean f302769G = true;

    /* renamed from: H */
    public boolean f302770H = true;

    /* renamed from: I */
    public boolean f302771I = true;

    /* renamed from: J */
    public boolean f302772J = true;

    /* renamed from: K */
    public boolean f302773K = true;

    /* renamed from: L */
    public boolean f302774L = true;

    /* renamed from: M */
    public boolean f302775M = true;

    /* renamed from: N */
    public boolean f302776N = true;

    /* renamed from: P */
    public boolean f302777P = true;

    /* renamed from: Q */
    public boolean f302778Q = true;

    /* renamed from: R */
    public boolean f302779R = true;

    /* renamed from: S */
    public boolean f302780S = true;

    /* renamed from: T */
    public boolean f302781T = true;

    /* renamed from: U */
    public boolean f302782U = true;

    /* renamed from: d */
    public boolean f302783d = true;

    /* renamed from: e */
    public boolean f302784e = true;

    /* renamed from: f */
    public boolean f302785f = true;
    public String field_appId;
    public boolean field_barBackToWebView;
    public long field_downloadedLength;
    public int field_endFlag;
    public boolean field_hideBanner;
    public int field_isBlock;
    public String field_jsWebUrlDomain;
    public String field_mid;
    public String field_mimetype;
    public String field_musicId;
    public int field_musicType;
    public String field_musicbar_url;
    public String field_originMusicId;
    public double field_playbackRate;
    public String field_protocol;
    public String field_songAlbum;
    public String field_songAlbumLocalPath;
    public int field_songAlbumType;
    public String field_songAlbumUrl;
    public int field_songBgColor;
    public long field_songFileLength;
    public String field_songHAlbumUrl;
    public int field_songId;
    public String field_songLyric;
    public int field_songLyricColor;
    public String field_songMId;
    public String field_songMediaId;
    public String field_songName;
    public String field_songSinger;
    public String field_songSnsAlbumUser;
    public String field_songSnsShareUser;
    public String field_songWapLinkUrl;
    public String field_songWebUrl;
    public long field_songWifiFileLength;
    public String field_songWifiUrl;
    public String field_srcUsername;
    public int field_startTime;
    public long field_updateTime;
    public long field_wifiDownloadedLength;
    public int field_wifiEndFlag;

    /* renamed from: g */
    public boolean f302786g = true;

    /* renamed from: h */
    public boolean f302787h = true;

    /* renamed from: i */
    public boolean f302788i = true;

    /* renamed from: j */
    public boolean f302789j = true;

    /* renamed from: n */
    public boolean f302790n = true;

    /* renamed from: o */
    public boolean f302791o = true;

    /* renamed from: p */
    public boolean f302792p = true;

    /* renamed from: q */
    public boolean f302793q = true;

    /* renamed from: r */
    public boolean f302794r = true;

    /* renamed from: s */
    public boolean f302795s = true;

    /* renamed from: t */
    public boolean f302796t = true;

    /* renamed from: u */
    public boolean f302797u = true;

    /* renamed from: v */
    public boolean f302798v = true;

    /* renamed from: w */
    public boolean f302799w = true;

    /* renamed from: x */
    public boolean f302800x = true;

    /* renamed from: y */
    public boolean f302801y = true;

    /* renamed from: z */
    public boolean f302802z = true;

    static {
        SingleTable singleTable = new SingleTable("Music");
        f302724V = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("musicId", "string", singleTable.getName(), "");
        new Column("originMusicId", "string", singleTable.getName(), "");
        new Column("musicType", "int", singleTable.getName(), "");
        new Column("downloadedLength", "long", singleTable.getName(), "");
        new Column("wifiDownloadedLength", "long", singleTable.getName(), "");
        new Column("endFlag", "int", singleTable.getName(), "");
        new Column("wifiEndFlag", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("songId", "int", singleTable.getName(), "");
        new Column("songName", "string", singleTable.getName(), "");
        new Column("songSinger", "string", singleTable.getName(), "");
        new Column("songAlbum", "string", singleTable.getName(), "");
        new Column("songAlbumType", "int", singleTable.getName(), "");
        new Column("songAlbumUrl", "string", singleTable.getName(), "");
        new Column("songHAlbumUrl", "string", singleTable.getName(), "");
        new Column("songAlbumLocalPath", "string", singleTable.getName(), "");
        new Column("songWifiUrl", "string", singleTable.getName(), "");
        new Column("songWapLinkUrl", "string", singleTable.getName(), "");
        new Column("songWebUrl", "string", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("songMediaId", "string", singleTable.getName(), "");
        new Column("songSnsAlbumUser", "string", singleTable.getName(), "");
        new Column("songSnsShareUser", "string", singleTable.getName(), "");
        new Column("songLyric", "string", singleTable.getName(), "");
        new Column("songBgColor", "int", singleTable.getName(), "");
        new Column("songLyricColor", "int", singleTable.getName(), "");
        new Column("songFileLength", "long", singleTable.getName(), "");
        new Column("songWifiFileLength", "long", singleTable.getName(), "");
        new Column("hideBanner", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("jsWebUrlDomain", "string", singleTable.getName(), "");
        new Column("isBlock", "int", singleTable.getName(), "");
        new Column("startTime", "int", singleTable.getName(), "");
        new Column("mimetype", "string", singleTable.getName(), "");
        new Column("protocol", "string", singleTable.getName(), "");
        new Column("barBackToWebView", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("musicbar_url", "string", singleTable.getName(), "");
        new Column("srcUsername", "string", singleTable.getName(), "");
        new Column("playbackRate", "double", singleTable.getName(), "");
        new Column("songMId", "string", singleTable.getName(), "");
        new Column("mid", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[40];
        String[] strArr = new String[41];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "musicId";
        mAutoDBInfo.colsMap.put("musicId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "musicId";
        mAutoDBInfo.columns[1] = "originMusicId";
        mAutoDBInfo.colsMap.put("originMusicId", "TEXT");
        mAutoDBInfo.columns[2] = "musicType";
        mAutoDBInfo.colsMap.put("musicType", "INTEGER");
        mAutoDBInfo.columns[3] = "downloadedLength";
        mAutoDBInfo.colsMap.put("downloadedLength", "LONG");
        mAutoDBInfo.columns[4] = "wifiDownloadedLength";
        mAutoDBInfo.colsMap.put("wifiDownloadedLength", "LONG");
        mAutoDBInfo.columns[5] = "endFlag";
        mAutoDBInfo.colsMap.put("endFlag", "INTEGER");
        mAutoDBInfo.columns[6] = "wifiEndFlag";
        mAutoDBInfo.colsMap.put("wifiEndFlag", "INTEGER");
        mAutoDBInfo.columns[7] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[8] = "songId";
        mAutoDBInfo.colsMap.put("songId", "INTEGER");
        mAutoDBInfo.columns[9] = "songName";
        mAutoDBInfo.colsMap.put("songName", "TEXT");
        mAutoDBInfo.columns[10] = "songSinger";
        mAutoDBInfo.colsMap.put("songSinger", "TEXT");
        mAutoDBInfo.columns[11] = "songAlbum";
        mAutoDBInfo.colsMap.put("songAlbum", "TEXT");
        mAutoDBInfo.columns[12] = "songAlbumType";
        mAutoDBInfo.colsMap.put("songAlbumType", "INTEGER");
        mAutoDBInfo.columns[13] = "songAlbumUrl";
        mAutoDBInfo.colsMap.put("songAlbumUrl", "TEXT");
        mAutoDBInfo.columns[14] = "songHAlbumUrl";
        mAutoDBInfo.colsMap.put("songHAlbumUrl", "TEXT");
        mAutoDBInfo.columns[15] = "songAlbumLocalPath";
        mAutoDBInfo.colsMap.put("songAlbumLocalPath", "TEXT");
        mAutoDBInfo.columns[16] = "songWifiUrl";
        mAutoDBInfo.colsMap.put("songWifiUrl", "TEXT");
        mAutoDBInfo.columns[17] = "songWapLinkUrl";
        mAutoDBInfo.colsMap.put("songWapLinkUrl", "TEXT");
        mAutoDBInfo.columns[18] = "songWebUrl";
        mAutoDBInfo.colsMap.put("songWebUrl", "TEXT");
        mAutoDBInfo.columns[19] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[20] = "songMediaId";
        mAutoDBInfo.colsMap.put("songMediaId", "TEXT");
        mAutoDBInfo.columns[21] = "songSnsAlbumUser";
        mAutoDBInfo.colsMap.put("songSnsAlbumUser", "TEXT");
        mAutoDBInfo.columns[22] = "songSnsShareUser";
        mAutoDBInfo.colsMap.put("songSnsShareUser", "TEXT");
        mAutoDBInfo.columns[23] = "songLyric";
        mAutoDBInfo.colsMap.put("songLyric", "TEXT");
        mAutoDBInfo.columns[24] = "songBgColor";
        mAutoDBInfo.colsMap.put("songBgColor", "INTEGER");
        mAutoDBInfo.columns[25] = "songLyricColor";
        mAutoDBInfo.colsMap.put("songLyricColor", "INTEGER");
        mAutoDBInfo.columns[26] = "songFileLength";
        mAutoDBInfo.colsMap.put("songFileLength", "LONG");
        mAutoDBInfo.columns[27] = "songWifiFileLength";
        mAutoDBInfo.colsMap.put("songWifiFileLength", "LONG");
        mAutoDBInfo.columns[28] = "hideBanner";
        mAutoDBInfo.colsMap.put("hideBanner", "INTEGER");
        mAutoDBInfo.columns[29] = "jsWebUrlDomain";
        mAutoDBInfo.colsMap.put("jsWebUrlDomain", "TEXT");
        mAutoDBInfo.columns[30] = "isBlock";
        mAutoDBInfo.colsMap.put("isBlock", "INTEGER");
        mAutoDBInfo.columns[31] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "INTEGER");
        mAutoDBInfo.columns[32] = "mimetype";
        mAutoDBInfo.colsMap.put("mimetype", "TEXT");
        mAutoDBInfo.columns[33] = "protocol";
        mAutoDBInfo.colsMap.put("protocol", "TEXT");
        mAutoDBInfo.columns[34] = "barBackToWebView";
        mAutoDBInfo.colsMap.put("barBackToWebView", "INTEGER");
        mAutoDBInfo.columns[35] = "musicbar_url";
        mAutoDBInfo.colsMap.put("musicbar_url", "TEXT");
        mAutoDBInfo.columns[36] = "srcUsername";
        mAutoDBInfo.colsMap.put("srcUsername", "TEXT");
        mAutoDBInfo.columns[37] = "playbackRate";
        mAutoDBInfo.colsMap.put("playbackRate", "DOUBLE");
        mAutoDBInfo.columns[38] = "songMId";
        mAutoDBInfo.colsMap.put("songMId", "TEXT");
        mAutoDBInfo.columns[39] = "mid";
        mAutoDBInfo.colsMap.put("mid", "TEXT");
        mAutoDBInfo.columns[40] = "rowid";
        mAutoDBInfo.sql = " musicId TEXT PRIMARY KEY ,  originMusicId TEXT,  musicType INTEGER,  downloadedLength LONG,  wifiDownloadedLength LONG,  endFlag INTEGER,  wifiEndFlag INTEGER,  updateTime LONG,  songId INTEGER,  songName TEXT,  songSinger TEXT,  songAlbum TEXT,  songAlbumType INTEGER,  songAlbumUrl TEXT,  songHAlbumUrl TEXT,  songAlbumLocalPath TEXT,  songWifiUrl TEXT,  songWapLinkUrl TEXT,  songWebUrl TEXT,  appId TEXT,  songMediaId TEXT,  songSnsAlbumUser TEXT,  songSnsShareUser TEXT,  songLyric TEXT,  songBgColor INTEGER,  songLyricColor INTEGER,  songFileLength LONG,  songWifiFileLength LONG,  hideBanner INTEGER,  jsWebUrlDomain TEXT,  isBlock INTEGER,  startTime INTEGER,  mimetype TEXT,  protocol TEXT,  barBackToWebView INTEGER,  musicbar_url TEXT,  srcUsername TEXT,  playbackRate DOUBLE,  songMId TEXT,  mid TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102658n6)) {
            return false;
        }
        C102658n6 n6Var = (C102658n6) iAutoDBItem;
        return C46238a.m51546a(this.field_musicId, n6Var.field_musicId) && C46238a.m51546a(this.field_originMusicId, n6Var.field_originMusicId) && C46238a.m51546a(Integer.valueOf(this.field_musicType), Integer.valueOf(n6Var.field_musicType)) && C46238a.m51546a(Long.valueOf(this.field_downloadedLength), Long.valueOf(n6Var.field_downloadedLength)) && C46238a.m51546a(Long.valueOf(this.field_wifiDownloadedLength), Long.valueOf(n6Var.field_wifiDownloadedLength)) && C46238a.m51546a(Integer.valueOf(this.field_endFlag), Integer.valueOf(n6Var.field_endFlag)) && C46238a.m51546a(Integer.valueOf(this.field_wifiEndFlag), Integer.valueOf(n6Var.field_wifiEndFlag)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(n6Var.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_songId), Integer.valueOf(n6Var.field_songId)) && C46238a.m51546a(this.field_songName, n6Var.field_songName) && C46238a.m51546a(this.field_songSinger, n6Var.field_songSinger) && C46238a.m51546a(this.field_songAlbum, n6Var.field_songAlbum) && C46238a.m51546a(Integer.valueOf(this.field_songAlbumType), Integer.valueOf(n6Var.field_songAlbumType)) && C46238a.m51546a(this.field_songAlbumUrl, n6Var.field_songAlbumUrl) && C46238a.m51546a(this.field_songHAlbumUrl, n6Var.field_songHAlbumUrl) && C46238a.m51546a(this.field_songAlbumLocalPath, n6Var.field_songAlbumLocalPath) && C46238a.m51546a(this.field_songWifiUrl, n6Var.field_songWifiUrl) && C46238a.m51546a(this.field_songWapLinkUrl, n6Var.field_songWapLinkUrl) && C46238a.m51546a(this.field_songWebUrl, n6Var.field_songWebUrl) && C46238a.m51546a(this.field_appId, n6Var.field_appId) && C46238a.m51546a(this.field_songMediaId, n6Var.field_songMediaId) && C46238a.m51546a(this.field_songSnsAlbumUser, n6Var.field_songSnsAlbumUser) && C46238a.m51546a(this.field_songSnsShareUser, n6Var.field_songSnsShareUser) && C46238a.m51546a(this.field_songLyric, n6Var.field_songLyric) && C46238a.m51546a(Integer.valueOf(this.field_songBgColor), Integer.valueOf(n6Var.field_songBgColor)) && C46238a.m51546a(Integer.valueOf(this.field_songLyricColor), Integer.valueOf(n6Var.field_songLyricColor)) && C46238a.m51546a(Long.valueOf(this.field_songFileLength), Long.valueOf(n6Var.field_songFileLength)) && C46238a.m51546a(Long.valueOf(this.field_songWifiFileLength), Long.valueOf(n6Var.field_songWifiFileLength)) && C46238a.m51546a(Boolean.valueOf(this.field_hideBanner), Boolean.valueOf(n6Var.field_hideBanner)) && C46238a.m51546a(this.field_jsWebUrlDomain, n6Var.field_jsWebUrlDomain) && C46238a.m51546a(Integer.valueOf(this.field_isBlock), Integer.valueOf(n6Var.field_isBlock)) && C46238a.m51546a(Integer.valueOf(this.field_startTime), Integer.valueOf(n6Var.field_startTime)) && C46238a.m51546a(this.field_mimetype, n6Var.field_mimetype) && C46238a.m51546a(this.field_protocol, n6Var.field_protocol) && C46238a.m51546a(Boolean.valueOf(this.field_barBackToWebView), Boolean.valueOf(n6Var.field_barBackToWebView)) && C46238a.m51546a(this.field_musicbar_url, n6Var.field_musicbar_url) && C46238a.m51546a(this.field_srcUsername, n6Var.field_srcUsername) && C46238a.m51546a(Double.valueOf(this.field_playbackRate), Double.valueOf(n6Var.field_playbackRate)) && C46238a.m51546a(this.field_songMId, n6Var.field_songMId) && C46238a.m51546a(this.field_mid, n6Var.field_mid);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302728X == hashCode) {
                    try {
                        this.field_musicId = cursor.getString(i);
                        this.f302783d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302730Y == hashCode) {
                    try {
                        this.field_originMusicId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302732Z == hashCode) {
                    try {
                        this.field_musicType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302749p0 == hashCode) {
                    try {
                        this.field_downloadedLength = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302758x0 == hashCode) {
                    try {
                        this.field_wifiDownloadedLength = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302760y0 == hashCode) {
                    try {
                        this.field_endFlag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302719Q0 == hashCode) {
                    try {
                        this.field_wifiEndFlag = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302720R0 == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302721S0 == hashCode) {
                    try {
                        this.field_songId = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302722T0 == hashCode) {
                    try {
                        this.field_songName = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302723U0 == hashCode) {
                    try {
                        this.field_songSinger = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302725V0 == hashCode) {
                    try {
                        this.field_songAlbum = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302727W0 == hashCode) {
                    try {
                        this.field_songAlbumType = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302729X0 == hashCode) {
                    try {
                        this.field_songAlbumUrl = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302731Y0 == hashCode) {
                    try {
                        this.field_songHAlbumUrl = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302733Z0 == hashCode) {
                    try {
                        this.field_songAlbumLocalPath = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302734a1 == hashCode) {
                    try {
                        this.field_songWifiUrl = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302735b1 == hashCode) {
                    try {
                        this.field_songWapLinkUrl = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302736c1 == hashCode) {
                    try {
                        this.field_songWebUrl = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302737d1 == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302738e1 == hashCode) {
                    try {
                        this.field_songMediaId = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302739f1 == hashCode) {
                    try {
                        this.field_songSnsAlbumUser = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302740g1 == hashCode) {
                    try {
                        this.field_songSnsShareUser = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302741h1 == hashCode) {
                    try {
                        this.field_songLyric = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302742i1 == hashCode) {
                    try {
                        this.field_songBgColor = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302743j1 == hashCode) {
                    try {
                        this.field_songLyricColor = cursor.getInt(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302744k1 == hashCode) {
                    try {
                        this.field_songFileLength = cursor.getLong(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302745l1 == hashCode) {
                    try {
                        this.field_songWifiFileLength = cursor.getLong(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302746m1 == hashCode) {
                    try {
                        this.field_hideBanner = cursor.getInt(i) != 0;
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302747n1 == hashCode) {
                    try {
                        this.field_jsWebUrlDomain = cursor.getString(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302748o1 == hashCode) {
                    try {
                        this.field_isBlock = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302750p1 == hashCode) {
                    try {
                        this.field_startTime = cursor.getInt(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302751q1 == hashCode) {
                    try {
                        this.field_mimetype = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302752r1 == hashCode) {
                    try {
                        this.field_protocol = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302753s1 == hashCode) {
                    try {
                        this.field_barBackToWebView = cursor.getInt(i) != 0;
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302754t1 == hashCode) {
                    try {
                        this.field_musicbar_url = cursor.getString(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302755u1 == hashCode) {
                    try {
                        this.field_srcUsername = cursor.getString(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302756v1 == hashCode) {
                    try {
                        this.field_playbackRate = cursor.getDouble(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302757w1 == hashCode) {
                    try {
                        this.field_songMId = cursor.getString(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302759x1 == hashCode) {
                    try {
                        this.field_mid = cursor.getString(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMusic", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302761y1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302783d) {
            contentValues.put("musicId", this.field_musicId);
        }
        if (this.f302784e) {
            contentValues.put("originMusicId", this.field_originMusicId);
        }
        if (this.f302785f) {
            contentValues.put("musicType", Integer.valueOf(this.field_musicType));
        }
        if (this.f302786g) {
            contentValues.put("downloadedLength", Long.valueOf(this.field_downloadedLength));
        }
        if (this.f302787h) {
            contentValues.put("wifiDownloadedLength", Long.valueOf(this.field_wifiDownloadedLength));
        }
        if (this.f302788i) {
            contentValues.put("endFlag", Integer.valueOf(this.field_endFlag));
        }
        if (this.f302789j) {
            contentValues.put("wifiEndFlag", Integer.valueOf(this.field_wifiEndFlag));
        }
        if (this.f302790n) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f302791o) {
            contentValues.put("songId", Integer.valueOf(this.field_songId));
        }
        if (this.f302792p) {
            contentValues.put("songName", this.field_songName);
        }
        if (this.f302793q) {
            contentValues.put("songSinger", this.field_songSinger);
        }
        if (this.f302794r) {
            contentValues.put("songAlbum", this.field_songAlbum);
        }
        if (this.f302795s) {
            contentValues.put("songAlbumType", Integer.valueOf(this.field_songAlbumType));
        }
        if (this.f302796t) {
            contentValues.put("songAlbumUrl", this.field_songAlbumUrl);
        }
        if (this.f302797u) {
            contentValues.put("songHAlbumUrl", this.field_songHAlbumUrl);
        }
        if (this.f302798v) {
            contentValues.put("songAlbumLocalPath", this.field_songAlbumLocalPath);
        }
        if (this.f302799w) {
            contentValues.put("songWifiUrl", this.field_songWifiUrl);
        }
        if (this.f302800x) {
            contentValues.put("songWapLinkUrl", this.field_songWapLinkUrl);
        }
        if (this.f302801y) {
            contentValues.put("songWebUrl", this.field_songWebUrl);
        }
        if (this.f302802z) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f302763A) {
            contentValues.put("songMediaId", this.field_songMediaId);
        }
        if (this.f302764B) {
            contentValues.put("songSnsAlbumUser", this.field_songSnsAlbumUser);
        }
        if (this.f302765C) {
            contentValues.put("songSnsShareUser", this.field_songSnsShareUser);
        }
        if (this.f302766D) {
            contentValues.put("songLyric", this.field_songLyric);
        }
        if (this.f302767E) {
            contentValues.put("songBgColor", Integer.valueOf(this.field_songBgColor));
        }
        if (this.f302768F) {
            contentValues.put("songLyricColor", Integer.valueOf(this.field_songLyricColor));
        }
        if (this.f302769G) {
            contentValues.put("songFileLength", Long.valueOf(this.field_songFileLength));
        }
        if (this.f302770H) {
            contentValues.put("songWifiFileLength", Long.valueOf(this.field_songWifiFileLength));
        }
        if (this.f302771I) {
            if (this.field_hideBanner) {
                contentValues.put("hideBanner", 1);
            } else {
                contentValues.put("hideBanner", 0);
            }
        }
        if (this.f302772J) {
            contentValues.put("jsWebUrlDomain", this.field_jsWebUrlDomain);
        }
        if (this.f302773K) {
            contentValues.put("isBlock", Integer.valueOf(this.field_isBlock));
        }
        if (this.f302774L) {
            contentValues.put("startTime", Integer.valueOf(this.field_startTime));
        }
        if (this.f302775M) {
            contentValues.put("mimetype", this.field_mimetype);
        }
        if (this.f302776N) {
            contentValues.put("protocol", this.field_protocol);
        }
        if (this.f302777P) {
            if (this.field_barBackToWebView) {
                contentValues.put("barBackToWebView", 1);
            } else {
                contentValues.put("barBackToWebView", 0);
            }
        }
        if (this.f302778Q) {
            contentValues.put("musicbar_url", this.field_musicbar_url);
        }
        if (this.f302779R) {
            contentValues.put("srcUsername", this.field_srcUsername);
        }
        if (this.f302780S) {
            contentValues.put("playbackRate", Double.valueOf(this.field_playbackRate));
        }
        if (this.f302781T) {
            contentValues.put("songMId", this.field_songMId);
        }
        if (this.f302782U) {
            contentValues.put("mid", this.field_mid);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMusic", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS Music ( " + f302762z1.sql + ");");
        for (String add : f302726W) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMusic", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("Music", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302762z1, "Music", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMusic", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("Music", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMusic", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302762z1;
    }

    public String[] getIndexCreateSQL() {
        return f302726W;
    }

    public StorageObserverOwner<C102658n6> getObserverOwner() {
        return f302718A1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_musicId;
    }

    public SingleTable getTable() {
        return f302724V;
    }

    public String getTableName() {
        return f302724V.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("musicId")) {
            this.field_musicId = contentValues.getAsString("musicId");
            if (z) {
                this.f302783d = true;
            }
        }
        if (contentValues.containsKey("originMusicId")) {
            this.field_originMusicId = contentValues.getAsString("originMusicId");
            if (z) {
                this.f302784e = true;
            }
        }
        if (contentValues.containsKey("musicType")) {
            this.field_musicType = contentValues.getAsInteger("musicType").intValue();
            if (z) {
                this.f302785f = true;
            }
        }
        if (contentValues.containsKey("downloadedLength")) {
            this.field_downloadedLength = contentValues.getAsLong("downloadedLength").longValue();
            if (z) {
                this.f302786g = true;
            }
        }
        if (contentValues.containsKey("wifiDownloadedLength")) {
            this.field_wifiDownloadedLength = contentValues.getAsLong("wifiDownloadedLength").longValue();
            if (z) {
                this.f302787h = true;
            }
        }
        if (contentValues.containsKey("endFlag")) {
            this.field_endFlag = contentValues.getAsInteger("endFlag").intValue();
            if (z) {
                this.f302788i = true;
            }
        }
        if (contentValues.containsKey("wifiEndFlag")) {
            this.field_wifiEndFlag = contentValues.getAsInteger("wifiEndFlag").intValue();
            if (z) {
                this.f302789j = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f302790n = true;
            }
        }
        if (contentValues.containsKey("songId")) {
            this.field_songId = contentValues.getAsInteger("songId").intValue();
            if (z) {
                this.f302791o = true;
            }
        }
        if (contentValues.containsKey("songName")) {
            this.field_songName = contentValues.getAsString("songName");
            if (z) {
                this.f302792p = true;
            }
        }
        if (contentValues.containsKey("songSinger")) {
            this.field_songSinger = contentValues.getAsString("songSinger");
            if (z) {
                this.f302793q = true;
            }
        }
        if (contentValues.containsKey("songAlbum")) {
            this.field_songAlbum = contentValues.getAsString("songAlbum");
            if (z) {
                this.f302794r = true;
            }
        }
        if (contentValues.containsKey("songAlbumType")) {
            this.field_songAlbumType = contentValues.getAsInteger("songAlbumType").intValue();
            if (z) {
                this.f302795s = true;
            }
        }
        if (contentValues.containsKey("songAlbumUrl")) {
            this.field_songAlbumUrl = contentValues.getAsString("songAlbumUrl");
            if (z) {
                this.f302796t = true;
            }
        }
        if (contentValues.containsKey("songHAlbumUrl")) {
            this.field_songHAlbumUrl = contentValues.getAsString("songHAlbumUrl");
            if (z) {
                this.f302797u = true;
            }
        }
        if (contentValues.containsKey("songAlbumLocalPath")) {
            this.field_songAlbumLocalPath = contentValues.getAsString("songAlbumLocalPath");
            if (z) {
                this.f302798v = true;
            }
        }
        if (contentValues.containsKey("songWifiUrl")) {
            this.field_songWifiUrl = contentValues.getAsString("songWifiUrl");
            if (z) {
                this.f302799w = true;
            }
        }
        if (contentValues.containsKey("songWapLinkUrl")) {
            this.field_songWapLinkUrl = contentValues.getAsString("songWapLinkUrl");
            if (z) {
                this.f302800x = true;
            }
        }
        if (contentValues.containsKey("songWebUrl")) {
            this.field_songWebUrl = contentValues.getAsString("songWebUrl");
            if (z) {
                this.f302801y = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f302802z = true;
            }
        }
        if (contentValues.containsKey("songMediaId")) {
            this.field_songMediaId = contentValues.getAsString("songMediaId");
            if (z) {
                this.f302763A = true;
            }
        }
        if (contentValues.containsKey("songSnsAlbumUser")) {
            this.field_songSnsAlbumUser = contentValues.getAsString("songSnsAlbumUser");
            if (z) {
                this.f302764B = true;
            }
        }
        if (contentValues.containsKey("songSnsShareUser")) {
            this.field_songSnsShareUser = contentValues.getAsString("songSnsShareUser");
            if (z) {
                this.f302765C = true;
            }
        }
        if (contentValues.containsKey("songLyric")) {
            this.field_songLyric = contentValues.getAsString("songLyric");
            if (z) {
                this.f302766D = true;
            }
        }
        if (contentValues.containsKey("songBgColor")) {
            this.field_songBgColor = contentValues.getAsInteger("songBgColor").intValue();
            if (z) {
                this.f302767E = true;
            }
        }
        if (contentValues.containsKey("songLyricColor")) {
            this.field_songLyricColor = contentValues.getAsInteger("songLyricColor").intValue();
            if (z) {
                this.f302768F = true;
            }
        }
        if (contentValues.containsKey("songFileLength")) {
            this.field_songFileLength = contentValues.getAsLong("songFileLength").longValue();
            if (z) {
                this.f302769G = true;
            }
        }
        if (contentValues.containsKey("songWifiFileLength")) {
            this.field_songWifiFileLength = contentValues.getAsLong("songWifiFileLength").longValue();
            if (z) {
                this.f302770H = true;
            }
        }
        if (contentValues.containsKey("hideBanner")) {
            this.field_hideBanner = contentValues.getAsInteger("hideBanner").intValue() != 0;
            if (z) {
                this.f302771I = true;
            }
        }
        if (contentValues.containsKey("jsWebUrlDomain")) {
            this.field_jsWebUrlDomain = contentValues.getAsString("jsWebUrlDomain");
            if (z) {
                this.f302772J = true;
            }
        }
        if (contentValues.containsKey("isBlock")) {
            this.field_isBlock = contentValues.getAsInteger("isBlock").intValue();
            if (z) {
                this.f302773K = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsInteger("startTime").intValue();
            if (z) {
                this.f302774L = true;
            }
        }
        if (contentValues.containsKey("mimetype")) {
            this.field_mimetype = contentValues.getAsString("mimetype");
            if (z) {
                this.f302775M = true;
            }
        }
        if (contentValues.containsKey("protocol")) {
            this.field_protocol = contentValues.getAsString("protocol");
            if (z) {
                this.f302776N = true;
            }
        }
        if (contentValues.containsKey("barBackToWebView")) {
            this.field_barBackToWebView = contentValues.getAsInteger("barBackToWebView").intValue() != 0;
            if (z) {
                this.f302777P = true;
            }
        }
        if (contentValues.containsKey("musicbar_url")) {
            this.field_musicbar_url = contentValues.getAsString("musicbar_url");
            if (z) {
                this.f302778Q = true;
            }
        }
        if (contentValues.containsKey("srcUsername")) {
            this.field_srcUsername = contentValues.getAsString("srcUsername");
            if (z) {
                this.f302779R = true;
            }
        }
        if (contentValues.containsKey("playbackRate")) {
            this.field_playbackRate = contentValues.getAsDouble("playbackRate").doubleValue();
            if (z) {
                this.f302780S = true;
            }
        }
        if (contentValues.containsKey("songMId")) {
            this.field_songMId = contentValues.getAsString("songMId");
            if (z) {
                this.f302781T = true;
            }
        }
        if (contentValues.containsKey("mid")) {
            this.field_mid = contentValues.getAsString("mid");
            if (z) {
                this.f302782U = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
