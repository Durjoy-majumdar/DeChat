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
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.w2 */
public class C53352w2 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f149978A1 = 108705909;

    /* renamed from: B1 */
    public static final IAutoDBItem.MAutoDBInfo f149979B1 = initAutoDBInfo(C53352w2.class);

    /* renamed from: C1 */
    public static final StorageObserverOwner<C53352w2> f149980C1 = new StorageObserverOwner<>();

    /* renamed from: Q0 */
    public static final int f149981Q0 = -735662143;

    /* renamed from: R0 */
    public static final int f149982R0 = -735520042;

    /* renamed from: S0 */
    public static final int f149983S0 = -892481550;

    /* renamed from: T0 */
    public static final int f149984T0 = 107902;

    /* renamed from: U0 */
    public static final int f149985U0 = 566488300;

    /* renamed from: V0 */
    public static final int f149986V0 = -788388728;

    /* renamed from: W */
    public static final SingleTable f149987W;

    /* renamed from: W0 */
    public static final int f149988W0 = -1695805840;

    /* renamed from: X */
    public static final String[] f149989X = new String[0];

    /* renamed from: X0 */
    public static final int f149990X0 = 1157379087;

    /* renamed from: Y */
    public static final int f149991Y = 2039140291;

    /* renamed from: Y0 */
    public static final int f149992Y0 = 93028124;

    /* renamed from: Z */
    public static final int f149993Z = -1211148345;

    /* renamed from: Z0 */
    public static final int f149994Z0 = 140685570;

    /* renamed from: a1 */
    public static final int f149995a1 = 908759025;

    /* renamed from: b1 */
    public static final int f149996b1 = 1144404936;

    /* renamed from: c1 */
    public static final int f149997c1 = -577311387;

    /* renamed from: d1 */
    public static final int f149998d1 = 1253960535;

    /* renamed from: e1 */
    public static final int f149999e1 = 1461735806;

    /* renamed from: f1 */
    public static final int f150000f1 = 109254796;

    /* renamed from: g1 */
    public static final int f150001g1 = -1480298254;

    /* renamed from: h1 */
    public static final int f150002h1 = -2129294769;

    /* renamed from: i1 */
    public static final int f150003i1 = -2129324157;

    /* renamed from: j1 */
    public static final int f150004j1 = -1584235185;

    /* renamed from: k1 */
    public static final int f150005k1 = 72813289;

    /* renamed from: l1 */
    public static final int f150006l1 = 352142466;

    /* renamed from: m1 */
    public static final int f150007m1 = -1306498449;

    /* renamed from: n1 */
    public static final int f150008n1 = 1151521280;

    /* renamed from: o1 */
    public static final int f150009o1 = -82164506;

    /* renamed from: p0 */
    public static final int f150010p0 = -305137829;

    /* renamed from: p1 */
    public static final int f150011p1 = 786173551;

    /* renamed from: q1 */
    public static final int f150012q1 = -295931082;

    /* renamed from: r1 */
    public static final int f150013r1 = -855141962;

    /* renamed from: s1 */
    public static final int f150014s1 = 3539835;

    /* renamed from: t1 */
    public static final int f150015t1 = -845384415;

    /* renamed from: u1 */
    public static final int f150016u1 = 1585269267;

    /* renamed from: v1 */
    public static final int f150017v1 = 1109084130;

    /* renamed from: w1 */
    public static final int f150018w1 = -1584737974;

    /* renamed from: x0 */
    public static final int f150019x0 = -735564899;

    /* renamed from: x1 */
    public static final int f150020x1 = -1222440703;

    /* renamed from: y0 */
    public static final int f150021y0 = -735721945;

    /* renamed from: y1 */
    public static final int f150022y1 = 475770836;

    /* renamed from: z1 */
    public static final int f150023z1 = -1582398419;

    /* renamed from: A */
    public boolean f150024A = true;

    /* renamed from: B */
    public boolean f150025B = true;

    /* renamed from: C */
    public boolean f150026C = true;

    /* renamed from: D */
    public boolean f150027D = true;

    /* renamed from: E */
    public boolean f150028E = true;

    /* renamed from: F */
    public boolean f150029F = true;

    /* renamed from: G */
    public boolean f150030G = true;

    /* renamed from: H */
    public boolean f150031H = true;

    /* renamed from: I */
    public boolean f150032I = true;

    /* renamed from: J */
    public boolean f150033J = true;

    /* renamed from: K */
    public boolean f150034K = true;

    /* renamed from: L */
    public boolean f150035L = true;

    /* renamed from: M */
    public boolean f150036M = true;

    /* renamed from: N */
    public boolean f150037N = true;

    /* renamed from: P */
    public boolean f150038P = true;

    /* renamed from: Q */
    public boolean f150039Q = true;

    /* renamed from: R */
    public boolean f150040R = true;

    /* renamed from: S */
    public boolean f150041S = true;

    /* renamed from: T */
    public boolean f150042T = true;

    /* renamed from: U */
    public boolean f150043U = true;

    /* renamed from: V */
    public boolean f150044V = true;

    /* renamed from: d */
    public boolean f150045d = true;

    /* renamed from: e */
    public boolean f150046e = true;

    /* renamed from: f */
    public boolean f150047f = true;
    public String field_appId;
    public boolean field_autoDownload;
    public boolean field_autoInstall;
    public String field_channelId;
    public long field_downloadId;
    public boolean field_downloadInWifi;
    public int field_downloadType;
    public String field_downloadUrl;
    public int field_downloadUrlHashCode;
    public long field_downloadedSize;
    public int field_downloaderType;
    public int field_errCode;
    public String field_extInfo;
    public String field_fileName;
    public String field_filePath;
    public long field_fileSize;
    public int field_fileType;
    public long field_finishTime;
    public boolean field_fromDownloadApp;
    public boolean field_fromWeApp;
    public boolean field_isSecondDownload;
    public String field_md5;
    public int field_noticeId;
    public String field_notificationTitle;
    public String field_packageName;
    public String field_rawAppId;
    public boolean field_reserveInWifi;
    public int field_scene;
    public String field_secondaryUrl;
    public byte[] field_sectionMd5Byte;
    public boolean field_showNotification;
    public int field_ssid;
    public int field_startScene;
    public long field_startSize;
    public int field_startState;
    public long field_startTime;
    public int field_status;
    public long field_sysDownloadId;
    public long field_totalSize;
    public int field_uiarea;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f150048g = true;

    /* renamed from: h */
    public boolean f150049h = true;

    /* renamed from: i */
    public boolean f150050i = true;

    /* renamed from: j */
    public boolean f150051j = true;

    /* renamed from: n */
    public boolean f150052n = true;

    /* renamed from: o */
    public boolean f150053o = true;

    /* renamed from: p */
    public boolean f150054p = true;

    /* renamed from: q */
    public boolean f150055q = true;

    /* renamed from: r */
    public boolean f150056r = true;

    /* renamed from: s */
    public boolean f150057s = true;

    /* renamed from: t */
    public boolean f150058t = true;

    /* renamed from: u */
    public boolean f150059u = true;

    /* renamed from: v */
    public boolean f150060v = true;

    /* renamed from: w */
    public boolean f150061w = true;

    /* renamed from: x */
    public boolean f150062x = true;

    /* renamed from: y */
    public boolean f150063y = true;

    /* renamed from: z */
    public boolean f150064z = true;

    static {
        SingleTable singleTable = new SingleTable("FileDownloadInfo");
        f149987W = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("downloadId", "long", singleTable.getName(), "");
        new Column("downloadUrl", "string", singleTable.getName(), "");
        new Column(DownloadInfo.SECONDARYURL, "string", singleTable.getName(), "");
        new Column("fileSize", "long", singleTable.getName(), "");
        new Column(DownloadInfo.FILENAME, "string", singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "string", singleTable.getName(), "");
        new Column("fileType", "int", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column("autoInstall", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("showNotification", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("sysDownloadId", "long", singleTable.getName(), "");
        new Column("downloaderType", "int", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("downloadUrlHashCode", "int", singleTable.getName(), "");
        new Column("packageName", "string", singleTable.getName(), "");
        new Column("downloadedSize", "long", singleTable.getName(), "");
        new Column("totalSize", "long", singleTable.getName(), "");
        new Column("autoDownload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("errCode", "int", singleTable.getName(), "");
        new Column("startTime", "long", singleTable.getName(), "");
        new Column("startSize", "long", singleTable.getName(), "");
        new Column("startState", "int", singleTable.getName(), "");
        new Column("fromWeApp", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("downloadInWifi", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("extInfo", "string", singleTable.getName(), "");
        new Column("finishTime", "long", singleTable.getName(), "");
        new Column("isSecondDownload", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("fromDownloadApp", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("reserveInWifi", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column(TPDownloadProxyEnum.USER_SSID, "int", singleTable.getName(), "");
        new Column("uiarea", "int", singleTable.getName(), "");
        new Column("noticeId", "int", singleTable.getName(), "");
        new Column("downloadType", "int", singleTable.getName(), "");
        new Column("startScene", "int", singleTable.getName(), "");
        new Column("sectionMd5Byte", "byte[]", singleTable.getName(), "");
        new Column("rawAppId", "string", singleTable.getName(), "");
        new Column("notificationTitle", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[41];
        String[] strArr = new String[42];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "downloadId";
        mAutoDBInfo.colsMap.put("downloadId", "LONG default '-1'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "downloadId";
        mAutoDBInfo.columns[1] = "downloadUrl";
        mAutoDBInfo.colsMap.put("downloadUrl", "TEXT default '' ");
        mAutoDBInfo.columns[2] = DownloadInfo.SECONDARYURL;
        mAutoDBInfo.colsMap.put(DownloadInfo.SECONDARYURL, "TEXT default '' ");
        mAutoDBInfo.columns[3] = "fileSize";
        mAutoDBInfo.colsMap.put("fileSize", "LONG default '0' ");
        mAutoDBInfo.columns[4] = DownloadInfo.FILENAME;
        mAutoDBInfo.colsMap.put(DownloadInfo.FILENAME, "TEXT default '' ");
        mAutoDBInfo.columns[5] = AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT default '' ");
        mAutoDBInfo.columns[6] = "fileType";
        mAutoDBInfo.colsMap.put("fileType", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "autoInstall";
        mAutoDBInfo.colsMap.put("autoInstall", "INTEGER default 'false' ");
        mAutoDBInfo.columns[10] = "showNotification";
        mAutoDBInfo.colsMap.put("showNotification", "INTEGER default 'false' ");
        mAutoDBInfo.columns[11] = "sysDownloadId";
        mAutoDBInfo.colsMap.put("sysDownloadId", "LONG default '-1' ");
        mAutoDBInfo.columns[12] = "downloaderType";
        mAutoDBInfo.colsMap.put("downloaderType", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "downloadUrlHashCode";
        mAutoDBInfo.colsMap.put("downloadUrlHashCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "packageName";
        mAutoDBInfo.colsMap.put("packageName", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "downloadedSize";
        mAutoDBInfo.colsMap.put("downloadedSize", "LONG default '0' ");
        mAutoDBInfo.columns[17] = "totalSize";
        mAutoDBInfo.colsMap.put("totalSize", "LONG default '0' ");
        mAutoDBInfo.columns[18] = "autoDownload";
        mAutoDBInfo.colsMap.put("autoDownload", "INTEGER default 'false' ");
        mAutoDBInfo.columns[19] = AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID;
        mAutoDBInfo.colsMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "TEXT default '' ");
        mAutoDBInfo.columns[20] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "errCode";
        mAutoDBInfo.colsMap.put("errCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[22] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "LONG default '0' ");
        mAutoDBInfo.columns[23] = "startSize";
        mAutoDBInfo.colsMap.put("startSize", "LONG default '0' ");
        mAutoDBInfo.columns[24] = "startState";
        mAutoDBInfo.colsMap.put("startState", "INTEGER default '0' ");
        mAutoDBInfo.columns[25] = "fromWeApp";
        mAutoDBInfo.colsMap.put("fromWeApp", "INTEGER default 'false' ");
        mAutoDBInfo.columns[26] = "downloadInWifi";
        mAutoDBInfo.colsMap.put("downloadInWifi", "INTEGER default 'false' ");
        mAutoDBInfo.columns[27] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "TEXT default '' ");
        mAutoDBInfo.columns[28] = "finishTime";
        mAutoDBInfo.colsMap.put("finishTime", "LONG default '0' ");
        mAutoDBInfo.columns[29] = "isSecondDownload";
        mAutoDBInfo.colsMap.put("isSecondDownload", "INTEGER default 'false' ");
        mAutoDBInfo.columns[30] = "fromDownloadApp";
        mAutoDBInfo.colsMap.put("fromDownloadApp", "INTEGER default 'false' ");
        mAutoDBInfo.columns[31] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[32] = "reserveInWifi";
        mAutoDBInfo.colsMap.put("reserveInWifi", "INTEGER default 'false' ");
        mAutoDBInfo.columns[33] = TPDownloadProxyEnum.USER_SSID;
        mAutoDBInfo.colsMap.put(TPDownloadProxyEnum.USER_SSID, "INTEGER default '0' ");
        mAutoDBInfo.columns[34] = "uiarea";
        mAutoDBInfo.colsMap.put("uiarea", "INTEGER default '0' ");
        mAutoDBInfo.columns[35] = "noticeId";
        mAutoDBInfo.colsMap.put("noticeId", "INTEGER default '0' ");
        mAutoDBInfo.columns[36] = "downloadType";
        mAutoDBInfo.colsMap.put("downloadType", "INTEGER default '0' ");
        mAutoDBInfo.columns[37] = "startScene";
        mAutoDBInfo.colsMap.put("startScene", "INTEGER default '0' ");
        mAutoDBInfo.columns[38] = "sectionMd5Byte";
        mAutoDBInfo.colsMap.put("sectionMd5Byte", "BLOB");
        mAutoDBInfo.columns[39] = "rawAppId";
        mAutoDBInfo.colsMap.put("rawAppId", "TEXT default '' ");
        mAutoDBInfo.columns[40] = "notificationTitle";
        mAutoDBInfo.colsMap.put("notificationTitle", "TEXT default '' ");
        mAutoDBInfo.columns[41] = "rowid";
        mAutoDBInfo.sql = " downloadId LONG default '-1'  PRIMARY KEY ,  downloadUrl TEXT default '' ,  secondaryUrl TEXT default '' ,  fileSize LONG default '0' ,  fileName TEXT default '' ,  filePath TEXT default '' ,  fileType INTEGER default '0' ,  status INTEGER default '0' ,  md5 TEXT default '' ,  autoInstall INTEGER default 'false' ,  showNotification INTEGER default 'false' ,  sysDownloadId LONG default '-1' ,  downloaderType INTEGER default '0' ,  appId TEXT default '' ,  downloadUrlHashCode INTEGER default '0' ,  packageName TEXT default '' ,  downloadedSize LONG default '0' ,  totalSize LONG default '0' ,  autoDownload INTEGER default 'false' ,  channelId TEXT default '' ,  scene INTEGER default '0' ,  errCode INTEGER default '0' ,  startTime LONG default '0' ,  startSize LONG default '0' ,  startState INTEGER default '0' ,  fromWeApp INTEGER default 'false' ,  downloadInWifi INTEGER default 'false' ,  extInfo TEXT default '' ,  finishTime LONG default '0' ,  isSecondDownload INTEGER default 'false' ,  fromDownloadApp INTEGER default 'false' ,  updateTime LONG default '0' ,  reserveInWifi INTEGER default 'false' ,  ssid INTEGER default '0' ,  uiarea INTEGER default '0' ,  noticeId INTEGER default '0' ,  downloadType INTEGER default '0' ,  startScene INTEGER default '0' ,  sectionMd5Byte BLOB,  rawAppId TEXT default '' ,  notificationTitle TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53352w2)) {
            return false;
        }
        C53352w2 w2Var = (C53352w2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_downloadId), Long.valueOf(w2Var.field_downloadId)) && C46238a.m51546a(this.field_downloadUrl, w2Var.field_downloadUrl) && C46238a.m51546a(this.field_secondaryUrl, w2Var.field_secondaryUrl) && C46238a.m51546a(Long.valueOf(this.field_fileSize), Long.valueOf(w2Var.field_fileSize)) && C46238a.m51546a(this.field_fileName, w2Var.field_fileName) && C46238a.m51546a(this.field_filePath, w2Var.field_filePath) && C46238a.m51546a(Integer.valueOf(this.field_fileType), Integer.valueOf(w2Var.field_fileType)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(w2Var.field_status)) && C46238a.m51546a(this.field_md5, w2Var.field_md5) && C46238a.m51546a(Boolean.valueOf(this.field_autoInstall), Boolean.valueOf(w2Var.field_autoInstall)) && C46238a.m51546a(Boolean.valueOf(this.field_showNotification), Boolean.valueOf(w2Var.field_showNotification)) && C46238a.m51546a(Long.valueOf(this.field_sysDownloadId), Long.valueOf(w2Var.field_sysDownloadId)) && C46238a.m51546a(Integer.valueOf(this.field_downloaderType), Integer.valueOf(w2Var.field_downloaderType)) && C46238a.m51546a(this.field_appId, w2Var.field_appId) && C46238a.m51546a(Integer.valueOf(this.field_downloadUrlHashCode), Integer.valueOf(w2Var.field_downloadUrlHashCode)) && C46238a.m51546a(this.field_packageName, w2Var.field_packageName) && C46238a.m51546a(Long.valueOf(this.field_downloadedSize), Long.valueOf(w2Var.field_downloadedSize)) && C46238a.m51546a(Long.valueOf(this.field_totalSize), Long.valueOf(w2Var.field_totalSize)) && C46238a.m51546a(Boolean.valueOf(this.field_autoDownload), Boolean.valueOf(w2Var.field_autoDownload)) && C46238a.m51546a(this.field_channelId, w2Var.field_channelId) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(w2Var.field_scene)) && C46238a.m51546a(Integer.valueOf(this.field_errCode), Integer.valueOf(w2Var.field_errCode)) && C46238a.m51546a(Long.valueOf(this.field_startTime), Long.valueOf(w2Var.field_startTime)) && C46238a.m51546a(Long.valueOf(this.field_startSize), Long.valueOf(w2Var.field_startSize)) && C46238a.m51546a(Integer.valueOf(this.field_startState), Integer.valueOf(w2Var.field_startState)) && C46238a.m51546a(Boolean.valueOf(this.field_fromWeApp), Boolean.valueOf(w2Var.field_fromWeApp)) && C46238a.m51546a(Boolean.valueOf(this.field_downloadInWifi), Boolean.valueOf(w2Var.field_downloadInWifi)) && C46238a.m51546a(this.field_extInfo, w2Var.field_extInfo) && C46238a.m51546a(Long.valueOf(this.field_finishTime), Long.valueOf(w2Var.field_finishTime)) && C46238a.m51546a(Boolean.valueOf(this.field_isSecondDownload), Boolean.valueOf(w2Var.field_isSecondDownload)) && C46238a.m51546a(Boolean.valueOf(this.field_fromDownloadApp), Boolean.valueOf(w2Var.field_fromDownloadApp)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(w2Var.field_updateTime)) && C46238a.m51546a(Boolean.valueOf(this.field_reserveInWifi), Boolean.valueOf(w2Var.field_reserveInWifi)) && C46238a.m51546a(Integer.valueOf(this.field_ssid), Integer.valueOf(w2Var.field_ssid)) && C46238a.m51546a(Integer.valueOf(this.field_uiarea), Integer.valueOf(w2Var.field_uiarea)) && C46238a.m51546a(Integer.valueOf(this.field_noticeId), Integer.valueOf(w2Var.field_noticeId)) && C46238a.m51546a(Integer.valueOf(this.field_downloadType), Integer.valueOf(w2Var.field_downloadType)) && C46238a.m51546a(Integer.valueOf(this.field_startScene), Integer.valueOf(w2Var.field_startScene)) && C46238a.m51546a(this.field_sectionMd5Byte, w2Var.field_sectionMd5Byte) && C46238a.m51546a(this.field_rawAppId, w2Var.field_rawAppId) && C46238a.m51546a(this.field_notificationTitle, w2Var.field_notificationTitle);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149991Y == hashCode) {
                    try {
                        this.field_downloadId = cursor.getLong(i);
                        this.f150045d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149993Z == hashCode) {
                    try {
                        this.field_downloadUrl = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150010p0 == hashCode) {
                    try {
                        this.field_secondaryUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150019x0 == hashCode) {
                    try {
                        this.field_fileSize = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150021y0 == hashCode) {
                    try {
                        this.field_fileName = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149981Q0 == hashCode) {
                    try {
                        this.field_filePath = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149982R0 == hashCode) {
                    try {
                        this.field_fileType = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149983S0 == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149984T0 == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149985U0 == hashCode) {
                    try {
                        this.field_autoInstall = cursor.getInt(i) != 0;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149986V0 == hashCode) {
                    try {
                        this.field_showNotification = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149988W0 == hashCode) {
                    try {
                        this.field_sysDownloadId = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149990X0 == hashCode) {
                    try {
                        this.field_downloaderType = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149992Y0 == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149994Z0 == hashCode) {
                    try {
                        this.field_downloadUrlHashCode = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149995a1 == hashCode) {
                    try {
                        this.field_packageName = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149996b1 == hashCode) {
                    try {
                        this.field_downloadedSize = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149997c1 == hashCode) {
                    try {
                        this.field_totalSize = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149998d1 == hashCode) {
                    try {
                        this.field_autoDownload = cursor.getInt(i) != 0;
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149999e1 == hashCode) {
                    try {
                        this.field_channelId = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150000f1 == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150001g1 == hashCode) {
                    try {
                        this.field_errCode = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150002h1 == hashCode) {
                    try {
                        this.field_startTime = cursor.getLong(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150003i1 == hashCode) {
                    try {
                        this.field_startSize = cursor.getLong(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150004j1 == hashCode) {
                    try {
                        this.field_startState = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150005k1 == hashCode) {
                    try {
                        this.field_fromWeApp = cursor.getInt(i) != 0;
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150006l1 == hashCode) {
                    try {
                        this.field_downloadInWifi = cursor.getInt(i) != 0;
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150007m1 == hashCode) {
                    try {
                        this.field_extInfo = cursor.getString(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150008n1 == hashCode) {
                    try {
                        this.field_finishTime = cursor.getLong(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150009o1 == hashCode) {
                    try {
                        this.field_isSecondDownload = cursor.getInt(i) != 0;
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150011p1 == hashCode) {
                    try {
                        this.field_fromDownloadApp = cursor.getInt(i) != 0;
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150012q1 == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150013r1 == hashCode) {
                    try {
                        this.field_reserveInWifi = cursor.getInt(i) != 0;
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150014s1 == hashCode) {
                    try {
                        this.field_ssid = cursor.getInt(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150015t1 == hashCode) {
                    try {
                        this.field_uiarea = cursor.getInt(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150016u1 == hashCode) {
                    try {
                        this.field_noticeId = cursor.getInt(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150017v1 == hashCode) {
                    try {
                        this.field_downloadType = cursor.getInt(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150018w1 == hashCode) {
                    try {
                        this.field_startScene = cursor.getInt(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150020x1 == hashCode) {
                    try {
                        this.field_sectionMd5Byte = cursor.getBlob(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150022y1 == hashCode) {
                    try {
                        this.field_rawAppId = cursor.getString(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f150023z1 == hashCode) {
                    try {
                        this.field_notificationTitle = cursor.getString(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFileDownloadInfo", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149978A1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f150045d) {
            contentValues.put("downloadId", Long.valueOf(this.field_downloadId));
        }
        if (this.field_downloadUrl == null) {
            this.field_downloadUrl = "";
        }
        if (this.f150046e) {
            contentValues.put("downloadUrl", this.field_downloadUrl);
        }
        if (this.field_secondaryUrl == null) {
            this.field_secondaryUrl = "";
        }
        if (this.f150047f) {
            contentValues.put(DownloadInfo.SECONDARYURL, this.field_secondaryUrl);
        }
        if (this.f150048g) {
            contentValues.put("fileSize", Long.valueOf(this.field_fileSize));
        }
        if (this.field_fileName == null) {
            this.field_fileName = "";
        }
        if (this.f150049h) {
            contentValues.put(DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.field_filePath == null) {
            this.field_filePath = "";
        }
        if (this.f150050i) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        }
        if (this.f150051j) {
            contentValues.put("fileType", Integer.valueOf(this.field_fileType));
        }
        if (this.f150052n) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.field_md5 == null) {
            this.field_md5 = "";
        }
        if (this.f150053o) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f150054p) {
            if (this.field_autoInstall) {
                contentValues.put("autoInstall", 1);
            } else {
                contentValues.put("autoInstall", 0);
            }
        }
        if (this.f150055q) {
            if (this.field_showNotification) {
                contentValues.put("showNotification", 1);
            } else {
                contentValues.put("showNotification", 0);
            }
        }
        if (this.f150056r) {
            contentValues.put("sysDownloadId", Long.valueOf(this.field_sysDownloadId));
        }
        if (this.f150057s) {
            contentValues.put("downloaderType", Integer.valueOf(this.field_downloaderType));
        }
        if (this.field_appId == null) {
            this.field_appId = "";
        }
        if (this.f150058t) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f150059u) {
            contentValues.put("downloadUrlHashCode", Integer.valueOf(this.field_downloadUrlHashCode));
        }
        if (this.field_packageName == null) {
            this.field_packageName = "";
        }
        if (this.f150060v) {
            contentValues.put("packageName", this.field_packageName);
        }
        if (this.f150061w) {
            contentValues.put("downloadedSize", Long.valueOf(this.field_downloadedSize));
        }
        if (this.f150062x) {
            contentValues.put("totalSize", Long.valueOf(this.field_totalSize));
        }
        if (this.f150063y) {
            if (this.field_autoDownload) {
                contentValues.put("autoDownload", 1);
            } else {
                contentValues.put("autoDownload", 0);
            }
        }
        if (this.field_channelId == null) {
            this.field_channelId = "";
        }
        if (this.f150064z) {
            contentValues.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, this.field_channelId);
        }
        if (this.f150024A) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f150025B) {
            contentValues.put("errCode", Integer.valueOf(this.field_errCode));
        }
        if (this.f150026C) {
            contentValues.put("startTime", Long.valueOf(this.field_startTime));
        }
        if (this.f150027D) {
            contentValues.put("startSize", Long.valueOf(this.field_startSize));
        }
        if (this.f150028E) {
            contentValues.put("startState", Integer.valueOf(this.field_startState));
        }
        if (this.f150029F) {
            if (this.field_fromWeApp) {
                contentValues.put("fromWeApp", 1);
            } else {
                contentValues.put("fromWeApp", 0);
            }
        }
        if (this.f150030G) {
            if (this.field_downloadInWifi) {
                contentValues.put("downloadInWifi", 1);
            } else {
                contentValues.put("downloadInWifi", 0);
            }
        }
        if (this.field_extInfo == null) {
            this.field_extInfo = "";
        }
        if (this.f150031H) {
            contentValues.put("extInfo", this.field_extInfo);
        }
        if (this.f150032I) {
            contentValues.put("finishTime", Long.valueOf(this.field_finishTime));
        }
        if (this.f150033J) {
            if (this.field_isSecondDownload) {
                contentValues.put("isSecondDownload", 1);
            } else {
                contentValues.put("isSecondDownload", 0);
            }
        }
        if (this.f150034K) {
            if (this.field_fromDownloadApp) {
                contentValues.put("fromDownloadApp", 1);
            } else {
                contentValues.put("fromDownloadApp", 0);
            }
        }
        if (this.f150035L) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f150036M) {
            if (this.field_reserveInWifi) {
                contentValues.put("reserveInWifi", 1);
            } else {
                contentValues.put("reserveInWifi", 0);
            }
        }
        if (this.f150037N) {
            contentValues.put(TPDownloadProxyEnum.USER_SSID, Integer.valueOf(this.field_ssid));
        }
        if (this.f150038P) {
            contentValues.put("uiarea", Integer.valueOf(this.field_uiarea));
        }
        if (this.f150039Q) {
            contentValues.put("noticeId", Integer.valueOf(this.field_noticeId));
        }
        if (this.f150040R) {
            contentValues.put("downloadType", Integer.valueOf(this.field_downloadType));
        }
        if (this.f150041S) {
            contentValues.put("startScene", Integer.valueOf(this.field_startScene));
        }
        if (this.f150042T) {
            contentValues.put("sectionMd5Byte", this.field_sectionMd5Byte);
        }
        if (this.field_rawAppId == null) {
            this.field_rawAppId = "";
        }
        if (this.f150043U) {
            contentValues.put("rawAppId", this.field_rawAppId);
        }
        if (this.field_notificationTitle == null) {
            this.field_notificationTitle = "";
        }
        if (this.f150044V) {
            contentValues.put("notificationTitle", this.field_notificationTitle);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFileDownloadInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FileDownloadInfo ( " + f149979B1.sql + ");");
        for (String add : f149989X) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFileDownloadInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FileDownloadInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149979B1, "FileDownloadInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFileDownloadInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FileDownloadInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFileDownloadInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149979B1;
    }

    public String[] getIndexCreateSQL() {
        return f149989X;
    }

    public StorageObserverOwner<C53352w2> getObserverOwner() {
        return f149980C1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_downloadId);
    }

    public SingleTable getTable() {
        return f149987W;
    }

    public String getTableName() {
        return f149987W.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("downloadId")) {
            this.field_downloadId = contentValues.getAsLong("downloadId").longValue();
            if (z) {
                this.f150045d = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.field_downloadUrl = contentValues.getAsString("downloadUrl");
            if (z) {
                this.f150046e = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.SECONDARYURL)) {
            this.field_secondaryUrl = contentValues.getAsString(DownloadInfo.SECONDARYURL);
            if (z) {
                this.f150047f = true;
            }
        }
        if (contentValues.containsKey("fileSize")) {
            this.field_fileSize = contentValues.getAsLong("fileSize").longValue();
            if (z) {
                this.f150048g = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(DownloadInfo.FILENAME);
            if (z) {
                this.f150049h = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z) {
                this.f150050i = true;
            }
        }
        if (contentValues.containsKey("fileType")) {
            this.field_fileType = contentValues.getAsInteger("fileType").intValue();
            if (z) {
                this.f150051j = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f150052n = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f150053o = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("autoInstall")) {
            this.field_autoInstall = contentValues.getAsInteger("autoInstall").intValue() != 0;
            if (z) {
                this.f150054p = true;
            }
        }
        if (contentValues.containsKey("showNotification")) {
            this.field_showNotification = contentValues.getAsInteger("showNotification").intValue() != 0;
            if (z) {
                this.f150055q = true;
            }
        }
        if (contentValues.containsKey("sysDownloadId")) {
            this.field_sysDownloadId = contentValues.getAsLong("sysDownloadId").longValue();
            if (z) {
                this.f150056r = true;
            }
        }
        if (contentValues.containsKey("downloaderType")) {
            this.field_downloaderType = contentValues.getAsInteger("downloaderType").intValue();
            if (z) {
                this.f150057s = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f150058t = true;
            }
        }
        if (contentValues.containsKey("downloadUrlHashCode")) {
            this.field_downloadUrlHashCode = contentValues.getAsInteger("downloadUrlHashCode").intValue();
            if (z) {
                this.f150059u = true;
            }
        }
        if (contentValues.containsKey("packageName")) {
            this.field_packageName = contentValues.getAsString("packageName");
            if (z) {
                this.f150060v = true;
            }
        }
        if (contentValues.containsKey("downloadedSize")) {
            this.field_downloadedSize = contentValues.getAsLong("downloadedSize").longValue();
            if (z) {
                this.f150061w = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.field_totalSize = contentValues.getAsLong("totalSize").longValue();
            if (z) {
                this.f150062x = true;
            }
        }
        if (contentValues.containsKey("autoDownload")) {
            this.field_autoDownload = contentValues.getAsInteger("autoDownload").intValue() != 0;
            if (z) {
                this.f150063y = true;
            }
        }
        if (contentValues.containsKey(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID)) {
            this.field_channelId = contentValues.getAsString(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
            if (z) {
                this.f150064z = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f150024A = true;
            }
        }
        if (contentValues.containsKey("errCode")) {
            this.field_errCode = contentValues.getAsInteger("errCode").intValue();
            if (z) {
                this.f150025B = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsLong("startTime").longValue();
            if (z) {
                this.f150026C = true;
            }
        }
        if (contentValues.containsKey("startSize")) {
            this.field_startSize = contentValues.getAsLong("startSize").longValue();
            if (z) {
                this.f150027D = true;
            }
        }
        if (contentValues.containsKey("startState")) {
            this.field_startState = contentValues.getAsInteger("startState").intValue();
            if (z) {
                this.f150028E = true;
            }
        }
        if (contentValues.containsKey("fromWeApp")) {
            this.field_fromWeApp = contentValues.getAsInteger("fromWeApp").intValue() != 0;
            if (z) {
                this.f150029F = true;
            }
        }
        if (contentValues.containsKey("downloadInWifi")) {
            this.field_downloadInWifi = contentValues.getAsInteger("downloadInWifi").intValue() != 0;
            if (z) {
                this.f150030G = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z) {
                this.f150031H = true;
            }
        }
        if (contentValues.containsKey("finishTime")) {
            this.field_finishTime = contentValues.getAsLong("finishTime").longValue();
            if (z) {
                this.f150032I = true;
            }
        }
        if (contentValues.containsKey("isSecondDownload")) {
            this.field_isSecondDownload = contentValues.getAsInteger("isSecondDownload").intValue() != 0;
            if (z) {
                this.f150033J = true;
            }
        }
        if (contentValues.containsKey("fromDownloadApp")) {
            this.field_fromDownloadApp = contentValues.getAsInteger("fromDownloadApp").intValue() != 0;
            if (z) {
                this.f150034K = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f150035L = true;
            }
        }
        if (contentValues.containsKey("reserveInWifi")) {
            if (contentValues.getAsInteger("reserveInWifi").intValue() != 0) {
                z2 = true;
            }
            this.field_reserveInWifi = z2;
            if (z) {
                this.f150036M = true;
            }
        }
        if (contentValues.containsKey(TPDownloadProxyEnum.USER_SSID)) {
            this.field_ssid = contentValues.getAsInteger(TPDownloadProxyEnum.USER_SSID).intValue();
            if (z) {
                this.f150037N = true;
            }
        }
        if (contentValues.containsKey("uiarea")) {
            this.field_uiarea = contentValues.getAsInteger("uiarea").intValue();
            if (z) {
                this.f150038P = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.field_noticeId = contentValues.getAsInteger("noticeId").intValue();
            if (z) {
                this.f150039Q = true;
            }
        }
        if (contentValues.containsKey("downloadType")) {
            this.field_downloadType = contentValues.getAsInteger("downloadType").intValue();
            if (z) {
                this.f150040R = true;
            }
        }
        if (contentValues.containsKey("startScene")) {
            this.field_startScene = contentValues.getAsInteger("startScene").intValue();
            if (z) {
                this.f150041S = true;
            }
        }
        if (contentValues.containsKey("sectionMd5Byte")) {
            this.field_sectionMd5Byte = contentValues.getAsByteArray("sectionMd5Byte");
            if (z) {
                this.f150042T = true;
            }
        }
        if (contentValues.containsKey("rawAppId")) {
            this.field_rawAppId = contentValues.getAsString("rawAppId");
            if (z) {
                this.f150043U = true;
            }
        }
        if (contentValues.containsKey("notificationTitle")) {
            this.field_notificationTitle = contentValues.getAsString("notificationTitle");
            if (z) {
                this.f150044V = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
