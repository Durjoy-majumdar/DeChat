package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.l */
public class C102653l extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f302517C;

    /* renamed from: D */
    public static final Column f302518D;

    /* renamed from: E */
    public static final Column f302519E;

    /* renamed from: F */
    public static final Column f302520F;

    /* renamed from: G */
    public static final Column f302521G;

    /* renamed from: H */
    public static final String[] f302522H = {"CREATE INDEX IF NOT EXISTS record_localid_index ON AlbumCDNInfo(msgLocalId)"};

    /* renamed from: I */
    public static final int f302523I = 338409958;

    /* renamed from: J */
    public static final int f302524J = -520067291;

    /* renamed from: K */
    public static final int f302525K = -868828954;

    /* renamed from: L */
    public static final int f302526L = -1338919323;

    /* renamed from: M */
    public static final int f302527M = 940773407;

    /* renamed from: N */
    public static final int f302528N = 3433509;

    /* renamed from: P */
    public static final int f302529P = -855017886;

    /* renamed from: Q */
    public static final int f302530Q = -1364966910;

    /* renamed from: Q0 */
    public static final int f302531Q0 = -735721945;

    /* renamed from: R */
    public static final int f302532R = -1364976910;

    /* renamed from: R0 */
    public static final int f302533R0 = 1903414347;

    /* renamed from: S */
    public static final int f302534S = -849913807;

    /* renamed from: S0 */
    public static final int f302535S0 = 108705909;

    /* renamed from: T */
    public static final int f302536T = 2071748300;

    /* renamed from: T0 */
    public static final IAutoDBItem.MAutoDBInfo f302537T0 = initAutoDBInfo(C102653l.class);

    /* renamed from: U */
    public static final int f302538U = 100473022;

    /* renamed from: U0 */
    public static final StorageObserverOwner<C102653l> f302539U0 = new StorageObserverOwner<>();

    /* renamed from: V */
    public static final int f302540V = 100475228;

    /* renamed from: W */
    public static final int f302541W = -1019779949;

    /* renamed from: X */
    public static final int f302542X = 3575610;

    /* renamed from: Y */
    public static final int f302543Y = -735520042;

    /* renamed from: Z */
    public static final int f302544Z = -892481550;

    /* renamed from: p0 */
    public static final int f302545p0 = -1480298254;

    /* renamed from: x0 */
    public static final int f302546x0 = 824536230;

    /* renamed from: y0 */
    public static final int f302547y0 = -1992012396;

    /* renamed from: A */
    public boolean f302548A = false;

    /* renamed from: B */
    public boolean f302549B = false;

    /* renamed from: d */
    public boolean f302550d = false;

    /* renamed from: e */
    public boolean f302551e = false;

    /* renamed from: f */
    public boolean f302552f = false;
    private String field_cdnKey;
    private String field_cdnUrl;
    private boolean field_checkUseCgi;
    private String field_dataId;
    private long field_duration;
    private int field_errCode;
    private String field_extraCdnInfo;
    private String field_fileMd5;
    private String field_fileName;
    private int field_fileType;
    private boolean field_isMid;
    private boolean field_isOri;
    private boolean field_isThumb;
    private int field_localId;
    private String field_mediaId;
    private long field_msgLocalId;
    private int field_offset;
    private String field_path;
    private int field_status;
    private String field_toUser;
    private int field_totalLen;
    private int field_type;

    /* renamed from: g */
    public boolean f302553g = false;

    /* renamed from: h */
    public boolean f302554h = false;

    /* renamed from: i */
    public boolean f302555i = false;

    /* renamed from: j */
    public boolean f302556j = false;

    /* renamed from: n */
    public boolean f302557n = false;

    /* renamed from: o */
    public boolean f302558o = false;

    /* renamed from: p */
    public boolean f302559p = false;

    /* renamed from: q */
    public boolean f302560q = false;

    /* renamed from: r */
    public boolean f302561r = false;

    /* renamed from: s */
    public boolean f302562s = false;

    /* renamed from: t */
    public boolean f302563t = false;

    /* renamed from: u */
    public boolean f302564u = false;

    /* renamed from: v */
    public boolean f302565v = false;

    /* renamed from: w */
    public boolean f302566w = false;

    /* renamed from: x */
    public boolean f302567x = false;

    /* renamed from: y */
    public boolean f302568y = false;

    /* renamed from: z */
    public boolean f302569z = false;

    static {
        SingleTable singleTable = new SingleTable("AlbumCDNInfo");
        f302517C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "int", singleTable.getName(), "");
        f302518D = new Column("msgLocalId", "long", singleTable.getName(), "");
        new Column("toUser", "string", singleTable.getName(), "");
        new Column("dataId", "string", singleTable.getName(), "");
        f302519E = new Column("mediaId", "string", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("fileMd5", "string", singleTable.getName(), "");
        new Column("cdnUrl", "string", singleTable.getName(), "");
        new Column("cdnKey", "string", singleTable.getName(), "");
        new Column("totalLen", "int", singleTable.getName(), "");
        new Column("isThumb", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isMid", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("isOri", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("offset", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("fileType", "int", singleTable.getName(), "");
        f302520F = new Column("status", "int", singleTable.getName(), "");
        new Column("errCode", "int", singleTable.getName(), "");
        new Column("checkUseCgi", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("duration", "long", singleTable.getName(), "");
        f302521G = new Column(DownloadInfo.FILENAME, "string", singleTable.getName(), "");
        new Column("extraCdnInfo", "string", singleTable.getName(), "");
    }

    /* renamed from: D2 */
    public static final InsertExecutor m135582D2(C102653l lVar, boolean z) {
        if (!z) {
            return new InsertExecutor(lVar, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseAlbumCDNInfo");
        }
        lVar.getClass();
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getINSERT(), String.valueOf(lVar.getPrimaryKeyValue()), "MicroMsg.SDK.BaseAlbumCDNInfo");
        storageObserverEvent.setObj(lVar);
        return new InsertExecutor(lVar, true, storageObserverEvent, f302539U0, "MicroMsg.SDK.BaseAlbumCDNInfo");
    }

    /* renamed from: E2 */
    public static final SelectSql m135583E2(String str) {
        return f302517C.selectAll().where(f302521G.equal(str)).log("MicroMsg.SDK.BaseAlbumCDNInfo").build();
    }

    /* renamed from: F2 */
    public static final SelectSql m135584F2(String str) {
        return f302517C.selectAll().where(f302519E.equal(str)).log("MicroMsg.SDK.BaseAlbumCDNInfo").build();
    }

    /* renamed from: G2 */
    public static final SelectSql m135585G2(long j) {
        return f302517C.selectAll().where(f302518D.equal((Number) Long.valueOf(j))).log("MicroMsg.SDK.BaseAlbumCDNInfo").build();
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "msgLocalId";
        mAutoDBInfo.colsMap.put("msgLocalId", "LONG");
        mAutoDBInfo.columns[2] = "toUser";
        mAutoDBInfo.colsMap.put("toUser", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "dataId";
        mAutoDBInfo.colsMap.put("dataId", "TEXT");
        mAutoDBInfo.columns[4] = "mediaId";
        mAutoDBInfo.colsMap.put("mediaId", "TEXT");
        mAutoDBInfo.columns[5] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[6] = "fileMd5";
        mAutoDBInfo.colsMap.put("fileMd5", "TEXT");
        mAutoDBInfo.columns[7] = "cdnUrl";
        mAutoDBInfo.colsMap.put("cdnUrl", "TEXT");
        mAutoDBInfo.columns[8] = "cdnKey";
        mAutoDBInfo.colsMap.put("cdnKey", "TEXT");
        mAutoDBInfo.columns[9] = "totalLen";
        mAutoDBInfo.colsMap.put("totalLen", "INTEGER default '0' ");
        mAutoDBInfo.columns[10] = "isThumb";
        mAutoDBInfo.colsMap.put("isThumb", "INTEGER default 'false' ");
        mAutoDBInfo.columns[11] = "isMid";
        mAutoDBInfo.colsMap.put("isMid", "INTEGER default 'false' ");
        mAutoDBInfo.columns[12] = "isOri";
        mAutoDBInfo.colsMap.put("isOri", "INTEGER default 'false' ");
        mAutoDBInfo.columns[13] = "offset";
        mAutoDBInfo.colsMap.put("offset", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "fileType";
        mAutoDBInfo.colsMap.put("fileType", "INTEGER default '5' ");
        mAutoDBInfo.columns[16] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[17] = "errCode";
        mAutoDBInfo.colsMap.put("errCode", "INTEGER default '0' ");
        mAutoDBInfo.columns[18] = "checkUseCgi";
        mAutoDBInfo.colsMap.put("checkUseCgi", "INTEGER default 'false' ");
        mAutoDBInfo.columns[19] = "duration";
        mAutoDBInfo.colsMap.put("duration", "LONG");
        mAutoDBInfo.columns[20] = DownloadInfo.FILENAME;
        mAutoDBInfo.colsMap.put(DownloadInfo.FILENAME, "TEXT default '' ");
        mAutoDBInfo.columns[21] = "extraCdnInfo";
        mAutoDBInfo.colsMap.put("extraCdnInfo", "TEXT");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " localId INTEGER PRIMARY KEY ,  msgLocalId LONG,  toUser TEXT default '' ,  dataId TEXT,  mediaId TEXT,  path TEXT,  fileMd5 TEXT,  cdnUrl TEXT,  cdnKey TEXT,  totalLen INTEGER default '0' ,  isThumb INTEGER default 'false' ,  isMid INTEGER default 'false' ,  isOri INTEGER default 'false' ,  offset INTEGER default '0' ,  type INTEGER default '0' ,  fileType INTEGER default '5' ,  status INTEGER default '0' ,  errCode INTEGER default '0' ,  checkUseCgi INTEGER default 'false' ,  duration LONG,  fileName TEXT default '' ,  extraCdnInfo TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public static final DeleteExecutor m135586l2(C102653l lVar, boolean z) {
        if (!z) {
            return new DeleteExecutor(lVar, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseAlbumCDNInfo");
        }
        lVar.getClass();
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getDELETE(), String.valueOf(lVar.getPrimaryKeyValue()), "MicroMsg.SDK.BaseAlbumCDNInfo");
        storageObserverEvent.setObj(lVar);
        return new DeleteExecutor(lVar, storageObserverEvent, f302539U0, "MicroMsg.SDK.BaseAlbumCDNInfo");
    }

    /* renamed from: A2 */
    public int mo142343A2() {
        return this.field_offset;
    }

    /* renamed from: B2 */
    public String mo142344B2() {
        return this.field_toUser;
    }

    /* renamed from: C2 */
    public int mo142345C2() {
        return this.field_totalLen;
    }

    /* renamed from: H2 */
    public void mo142346H2(String str) {
        this.field_cdnKey = str;
        this.f302558o = true;
    }

    /* renamed from: I2 */
    public void mo142347I2(boolean z) {
        this.field_checkUseCgi = z;
        this.f302568y = true;
    }

    /* renamed from: J2 */
    public void mo142348J2(String str) {
        this.field_dataId = str;
        this.f302553g = true;
    }

    /* renamed from: K2 */
    public void mo142349K2(long j) {
        this.field_duration = j;
        this.f302569z = true;
    }

    /* renamed from: L2 */
    public void mo142350L2(int i) {
        this.field_errCode = i;
        this.f302567x = true;
    }

    /* renamed from: M2 */
    public void mo142351M2(String str) {
        this.field_extraCdnInfo = str;
        this.f302549B = true;
    }

    /* renamed from: N2 */
    public void mo142352N2(String str) {
        this.field_fileName = str;
        this.f302548A = true;
    }

    /* renamed from: O2 */
    public void mo142353O2(int i) {
        this.field_fileType = i;
        this.f302565v = true;
    }

    /* renamed from: P2 */
    public void mo142354P2(boolean z) {
        this.field_isMid = z;
        this.f302561r = true;
    }

    /* renamed from: Q2 */
    public void mo142355Q2(boolean z) {
        this.field_isOri = z;
        this.f302562s = true;
    }

    /* renamed from: R2 */
    public void mo142356R2(boolean z) {
        this.field_isThumb = z;
        this.f302560q = true;
    }

    /* renamed from: S2 */
    public void mo142357S2(int i) {
        this.field_localId = i;
        this.f302550d = true;
    }

    /* renamed from: T2 */
    public void mo142358T2(String str) {
        this.field_mediaId = str;
        this.f302554h = true;
    }

    /* renamed from: U2 */
    public void mo142359U2(long j) {
        this.field_msgLocalId = j;
        this.f302551e = true;
    }

    /* renamed from: V2 */
    public void mo142360V2(int i) {
        this.field_offset = i;
        this.f302563t = true;
    }

    /* renamed from: W2 */
    public void mo142361W2(String str) {
        this.field_path = str;
        this.f302555i = true;
    }

    /* renamed from: X2 */
    public void mo142362X2(String str) {
        this.field_toUser = str;
        this.f302552f = true;
    }

    /* renamed from: Y2 */
    public void mo142363Y2(int i) {
        this.field_totalLen = i;
        this.f302559p = true;
    }

    /* renamed from: a1 */
    public void mo142364a1(String str) {
        this.field_cdnUrl = str;
        this.f302557n = true;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102653l)) {
            return false;
        }
        C102653l lVar = (C102653l) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_localId), Integer.valueOf(lVar.field_localId)) && C46238a.m51546a(Long.valueOf(this.field_msgLocalId), Long.valueOf(lVar.field_msgLocalId)) && C46238a.m51546a(this.field_toUser, lVar.field_toUser) && C46238a.m51546a(this.field_dataId, lVar.field_dataId) && C46238a.m51546a(this.field_mediaId, lVar.field_mediaId) && C46238a.m51546a(this.field_path, lVar.field_path) && C46238a.m51546a(this.field_fileMd5, lVar.field_fileMd5) && C46238a.m51546a(this.field_cdnUrl, lVar.field_cdnUrl) && C46238a.m51546a(this.field_cdnKey, lVar.field_cdnKey) && C46238a.m51546a(Integer.valueOf(this.field_totalLen), Integer.valueOf(lVar.field_totalLen)) && C46238a.m51546a(Boolean.valueOf(this.field_isThumb), Boolean.valueOf(lVar.field_isThumb)) && C46238a.m51546a(Boolean.valueOf(this.field_isMid), Boolean.valueOf(lVar.field_isMid)) && C46238a.m51546a(Boolean.valueOf(this.field_isOri), Boolean.valueOf(lVar.field_isOri)) && C46238a.m51546a(Integer.valueOf(this.field_offset), Integer.valueOf(lVar.field_offset)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(lVar.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_fileType), Integer.valueOf(lVar.field_fileType)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(lVar.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_errCode), Integer.valueOf(lVar.field_errCode)) && C46238a.m51546a(Boolean.valueOf(this.field_checkUseCgi), Boolean.valueOf(lVar.field_checkUseCgi)) && C46238a.m51546a(Long.valueOf(this.field_duration), Long.valueOf(lVar.field_duration)) && C46238a.m51546a(this.field_fileName, lVar.field_fileName) && C46238a.m51546a(this.field_extraCdnInfo, lVar.field_extraCdnInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302523I == hashCode) {
                    try {
                        this.field_localId = cursor.getInt(i);
                        this.f302550d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302524J == hashCode) {
                    try {
                        this.field_msgLocalId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302525K == hashCode) {
                    try {
                        this.field_toUser = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302526L == hashCode) {
                    try {
                        this.field_dataId = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302527M == hashCode) {
                    try {
                        this.field_mediaId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302528N == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302529P == hashCode) {
                    try {
                        this.field_fileMd5 = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302530Q == hashCode) {
                    try {
                        this.field_cdnUrl = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302532R == hashCode) {
                    try {
                        this.field_cdnKey = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302534S == hashCode) {
                    try {
                        this.field_totalLen = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302536T == hashCode) {
                    try {
                        this.field_isThumb = cursor.getInt(i) != 0;
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302538U == hashCode) {
                    try {
                        this.field_isMid = cursor.getInt(i) != 0;
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302540V == hashCode) {
                    try {
                        this.field_isOri = cursor.getInt(i) != 0;
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302541W == hashCode) {
                    try {
                        this.field_offset = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302542X == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302543Y == hashCode) {
                    try {
                        this.field_fileType = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302544Z == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302545p0 == hashCode) {
                    try {
                        this.field_errCode = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302546x0 == hashCode) {
                    try {
                        this.field_checkUseCgi = cursor.getInt(i) != 0;
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302547y0 == hashCode) {
                    try {
                        this.field_duration = cursor.getLong(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302531Q0 == hashCode) {
                    try {
                        this.field_fileName = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302533R0 == hashCode) {
                    try {
                        this.field_extraCdnInfo = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAlbumCDNInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302535S0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302550d) {
            contentValues.put(C66261f3.COL_LOCALID, Integer.valueOf(this.field_localId));
        }
        if (this.f302551e) {
            contentValues.put("msgLocalId", Long.valueOf(this.field_msgLocalId));
        }
        if (this.field_toUser == null) {
            this.field_toUser = "";
        }
        if (this.f302552f) {
            contentValues.put("toUser", this.field_toUser);
        }
        if (this.f302553g) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f302554h) {
            contentValues.put("mediaId", this.field_mediaId);
        }
        if (this.f302555i) {
            contentValues.put("path", this.field_path);
        }
        if (this.f302556j) {
            contentValues.put("fileMd5", this.field_fileMd5);
        }
        if (this.f302557n) {
            contentValues.put("cdnUrl", this.field_cdnUrl);
        }
        if (this.f302558o) {
            contentValues.put("cdnKey", this.field_cdnKey);
        }
        if (this.f302559p) {
            contentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
        }
        if (this.f302560q) {
            if (this.field_isThumb) {
                contentValues.put("isThumb", 1);
            } else {
                contentValues.put("isThumb", 0);
            }
        }
        if (this.f302561r) {
            if (this.field_isMid) {
                contentValues.put("isMid", 1);
            } else {
                contentValues.put("isMid", 0);
            }
        }
        if (this.f302562s) {
            if (this.field_isOri) {
                contentValues.put("isOri", 1);
            } else {
                contentValues.put("isOri", 0);
            }
        }
        if (this.f302563t) {
            contentValues.put("offset", Integer.valueOf(this.field_offset));
        }
        if (this.f302564u) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f302565v) {
            contentValues.put("fileType", Integer.valueOf(this.field_fileType));
        }
        if (this.f302566w) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f302567x) {
            contentValues.put("errCode", Integer.valueOf(this.field_errCode));
        }
        if (this.f302568y) {
            if (this.field_checkUseCgi) {
                contentValues.put("checkUseCgi", 1);
            } else {
                contentValues.put("checkUseCgi", 0);
            }
        }
        if (this.f302569z) {
            contentValues.put("duration", Long.valueOf(this.field_duration));
        }
        if (this.field_fileName == null) {
            this.field_fileName = "";
        }
        if (this.f302548A) {
            contentValues.put(DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.f302549B) {
            contentValues.put("extraCdnInfo", this.field_extraCdnInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAlbumCDNInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AlbumCDNInfo ( " + f302537T0.sql + ");");
        for (String add : f302522H) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAlbumCDNInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AlbumCDNInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302537T0, "AlbumCDNInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAlbumCDNInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AlbumCDNInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAlbumCDNInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: d */
    public void mo142365d(int i) {
        this.field_status = i;
        this.f302566w = true;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302537T0;
    }

    public String[] getIndexCreateSQL() {
        return f302522H;
    }

    public StorageObserverOwner<C102653l> getObserverOwner() {
        return f302539U0;
    }

    public String getPath() {
        return this.field_path;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_localId);
    }

    public int getStatus() {
        return this.field_status;
    }

    public SingleTable getTable() {
        return f302517C;
    }

    public String getTableName() {
        return f302517C.getName();
    }

    public int getType() {
        return this.field_type;
    }

    /* renamed from: m2 */
    public String mo142369m2() {
        return this.field_cdnKey;
    }

    /* renamed from: n2 */
    public boolean mo142370n2() {
        return this.field_checkUseCgi;
    }

    /* renamed from: o1 */
    public String mo142371o1() {
        return this.field_cdnUrl;
    }

    /* renamed from: o2 */
    public String mo142372o2() {
        return this.field_dataId;
    }

    /* renamed from: p2 */
    public long mo142373p2() {
        return this.field_duration;
    }

    /* renamed from: q2 */
    public String mo142374q2() {
        return this.field_extraCdnInfo;
    }

    /* renamed from: r2 */
    public String mo142375r2() {
        return this.field_fileMd5;
    }

    /* renamed from: s2 */
    public String mo142376s2() {
        return this.field_fileName;
    }

    public void setType(int i) {
        this.field_type = i;
        this.f302564u = true;
    }

    /* renamed from: t2 */
    public int mo142378t2() {
        return this.field_fileType;
    }

    /* renamed from: u2 */
    public boolean mo142379u2() {
        return this.field_isMid;
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        UpdateExecutor updateExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), "MicroMsg.SDK.BaseAlbumCDNInfo");
            storageObserverEvent.setObj(this);
            updateExecutor = new UpdateExecutor(this, storageObserverEvent, f302539U0, "MicroMsg.SDK.BaseAlbumCDNInfo");
        } else {
            updateExecutor = new UpdateExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseAlbumCDNInfo");
        }
        return updateExecutor.execute(iSQLiteDatabase);
    }

    /* renamed from: v2 */
    public boolean mo142381v2() {
        return this.field_isOri;
    }

    /* renamed from: w2 */
    public boolean mo142382w2() {
        return this.field_isThumb;
    }

    /* renamed from: x2 */
    public int mo142383x2() {
        return this.field_localId;
    }

    /* renamed from: y2 */
    public String mo142384y2() {
        return this.field_mediaId;
    }

    /* renamed from: z2 */
    public long mo142385z2() {
        return this.field_msgLocalId;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsInteger(C66261f3.COL_LOCALID).intValue();
            if (z) {
                this.f302550d = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.field_msgLocalId = contentValues.getAsLong("msgLocalId").longValue();
            if (z) {
                this.f302551e = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.field_toUser = contentValues.getAsString("toUser");
            if (z) {
                this.f302552f = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z) {
                this.f302553g = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.field_mediaId = contentValues.getAsString("mediaId");
            if (z) {
                this.f302554h = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f302555i = true;
            }
        }
        if (contentValues.containsKey("fileMd5")) {
            this.field_fileMd5 = contentValues.getAsString("fileMd5");
            if (z) {
                this.f302556j = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.field_cdnUrl = contentValues.getAsString("cdnUrl");
            if (z) {
                this.f302557n = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.field_cdnKey = contentValues.getAsString("cdnKey");
            if (z) {
                this.f302558o = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.field_totalLen = contentValues.getAsInteger("totalLen").intValue();
            if (z) {
                this.f302559p = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("isThumb")) {
            this.field_isThumb = contentValues.getAsInteger("isThumb").intValue() != 0;
            if (z) {
                this.f302560q = true;
            }
        }
        if (contentValues.containsKey("isMid")) {
            this.field_isMid = contentValues.getAsInteger("isMid").intValue() != 0;
            if (z) {
                this.f302561r = true;
            }
        }
        if (contentValues.containsKey("isOri")) {
            this.field_isOri = contentValues.getAsInteger("isOri").intValue() != 0;
            if (z) {
                this.f302562s = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.field_offset = contentValues.getAsInteger("offset").intValue();
            if (z) {
                this.f302563t = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f302564u = true;
            }
        }
        if (contentValues.containsKey("fileType")) {
            this.field_fileType = contentValues.getAsInteger("fileType").intValue();
            if (z) {
                this.f302565v = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f302566w = true;
            }
        }
        if (contentValues.containsKey("errCode")) {
            this.field_errCode = contentValues.getAsInteger("errCode").intValue();
            if (z) {
                this.f302567x = true;
            }
        }
        if (contentValues.containsKey("checkUseCgi")) {
            if (contentValues.getAsInteger("checkUseCgi").intValue() != 0) {
                z2 = true;
            }
            this.field_checkUseCgi = z2;
            if (z) {
                this.f302568y = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.field_duration = contentValues.getAsLong("duration").longValue();
            if (z) {
                this.f302569z = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(DownloadInfo.FILENAME);
            if (z) {
                this.f302548A = true;
            }
        }
        if (contentValues.containsKey("extraCdnInfo")) {
            this.field_extraCdnInfo = contentValues.getAsString("extraCdnInfo");
            if (z) {
                this.f302549B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
