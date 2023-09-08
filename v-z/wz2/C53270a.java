package wz2;

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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: wz2.a */
public class C53270a extends IAutoDBItem {

    /* renamed from: Q0 */
    public static final int f148610Q0 = -150535906;

    /* renamed from: R0 */
    public static final int f148611R0 = -836139253;

    /* renamed from: S0 */
    public static final int f148612S0 = 771019764;

    /* renamed from: T */
    public static final SingleTable f148613T;

    /* renamed from: T0 */
    public static final int f148614T0 = -1323162723;

    /* renamed from: U */
    public static final String[] f148615U = {"CREATE INDEX IF NOT EXISTS TextStatus_USERNAME_index ON TextStatus(UserName)", "CREATE INDEX IF NOT EXISTS TextStatus_ExpireTime_index ON TextStatus(ExpireTime)"};

    /* renamed from: U0 */
    public static final int f148616U0 = 254350882;

    /* renamed from: V */
    public static final int f148617V = -202022634;

    /* renamed from: V0 */
    public static final int f148618V0 = 77291717;

    /* renamed from: W */
    public static final int f148619W = 1383336109;

    /* renamed from: W0 */
    public static final int f148620W0 = 1263076309;

    /* renamed from: X */
    public static final int f148621X = 525393546;

    /* renamed from: X0 */
    public static final int f148622X0 = 2141333903;

    /* renamed from: Y */
    public static final int f148623Y = 1810971286;

    /* renamed from: Y0 */
    public static final int f148624Y0 = -1375334260;

    /* renamed from: Z */
    public static final int f148625Z = -1902930339;

    /* renamed from: Z0 */
    public static final int f148626Z0 = -360169678;

    /* renamed from: a1 */
    public static final int f148627a1 = -932289015;

    /* renamed from: b1 */
    public static final int f148628b1 = 1158740140;

    /* renamed from: c1 */
    public static final int f148629c1 = 1814362008;

    /* renamed from: d1 */
    public static final int f148630d1 = 109757585;

    /* renamed from: e1 */
    public static final int f148631e1 = -338179351;

    /* renamed from: f1 */
    public static final int f148632f1 = -1010136971;

    /* renamed from: g1 */
    public static final int f148633g1 = 1932139586;

    /* renamed from: h1 */
    public static final int f148634h1 = -666209749;

    /* renamed from: i1 */
    public static final int f148635i1 = 485319392;

    /* renamed from: j1 */
    public static final int f148636j1 = -114416287;

    /* renamed from: k1 */
    public static final int f148637k1 = -1077949467;

    /* renamed from: l1 */
    public static final int f148638l1 = -1925973884;

    /* renamed from: m1 */
    public static final int f148639m1 = 1729361382;

    /* renamed from: n1 */
    public static final int f148640n1 = -1880526047;

    /* renamed from: o1 */
    public static final int f148641o1 = -929154651;

    /* renamed from: p0 */
    public static final int f148642p0 = 325353797;

    /* renamed from: p1 */
    public static final int f148643p1 = -604903948;

    /* renamed from: q1 */
    public static final int f148644q1 = 440284770;

    /* renamed from: r1 */
    public static final int f148645r1 = -1729059691;

    /* renamed from: s1 */
    public static final int f148646s1 = -880311776;

    /* renamed from: t1 */
    public static final int f148647t1 = -1102647818;

    /* renamed from: u1 */
    public static final int f148648u1 = 108705909;

    /* renamed from: v1 */
    public static final IAutoDBItem.MAutoDBInfo f148649v1 = initAutoDBInfo(C53270a.class);

    /* renamed from: w1 */
    public static final StorageObserverOwner<C53270a> f148650w1 = new StorageObserverOwner<>();

    /* renamed from: x0 */
    public static final int f148651x0 = -2110195852;

    /* renamed from: y0 */
    public static final int f148652y0 = -56677412;

    /* renamed from: A */
    public boolean f148653A = true;

    /* renamed from: B */
    public boolean f148654B = true;

    /* renamed from: C */
    public boolean f148655C = true;

    /* renamed from: D */
    public boolean f148656D = true;

    /* renamed from: E */
    public boolean f148657E = true;

    /* renamed from: F */
    public boolean f148658F = true;

    /* renamed from: G */
    public boolean f148659G = true;

    /* renamed from: H */
    public boolean f148660H = true;

    /* renamed from: I */
    public boolean f148661I = true;

    /* renamed from: J */
    public boolean f148662J = true;

    /* renamed from: K */
    public boolean f148663K = true;

    /* renamed from: L */
    public boolean f148664L = true;

    /* renamed from: M */
    public boolean f148665M = true;

    /* renamed from: N */
    public boolean f148666N = true;

    /* renamed from: P */
    public boolean f148667P = true;

    /* renamed from: Q */
    public boolean f148668Q = true;

    /* renamed from: R */
    public boolean f148669R = true;

    /* renamed from: S */
    public boolean f148670S = true;

    /* renamed from: d */
    public boolean f148671d = true;

    /* renamed from: e */
    public boolean f148672e = true;

    /* renamed from: f */
    public boolean f148673f = true;
    public String field_ClusterId;
    public byte[] field_ClusterShowInfo;
    public int field_CreateTime;
    public String field_Description;
    public byte[] field_EmojiInfo;
    public int field_ExpireTime;
    public String field_IconID;
    public double field_Latitude;
    public int field_LikeCount;
    public int field_LikeCountVersion;
    public double field_Longitude;
    public String field_MediaAESKey;
    public String field_MediaThumbAESKey;
    public String field_MediaThumbUrl;
    public int field_MediaType;
    public String field_MediaUrl;
    public String field_PoiID;
    public String field_PoiName;
    public String field_SourceID;
    public String field_StatusID;
    public String field_TopicId;
    public byte[] field_TopicInfo;
    public String field_UserName;
    public int field_Visibility;
    public String field_backgroundId;
    public String field_duplicateTextStatusId;
    public String field_duplicateUserName;
    public int field_mediaHeight;
    public int field_mediaWidth;
    public Long field_option;
    public long field_profileSeq;
    public int field_referenceCount;
    public String field_referenceTextStatusId;
    public String field_referenceUserName;
    public int field_sceneType;
    public int field_state;
    public byte[] field_statusExtInfoOriBytes;
    public String field_visibilityInfo;

    /* renamed from: g */
    public boolean f148674g = true;

    /* renamed from: h */
    public boolean f148675h = true;

    /* renamed from: i */
    public boolean f148676i = true;

    /* renamed from: j */
    public boolean f148677j = true;

    /* renamed from: n */
    public boolean f148678n = true;

    /* renamed from: o */
    public boolean f148679o = true;

    /* renamed from: p */
    public boolean f148680p = true;

    /* renamed from: q */
    public boolean f148681q = true;

    /* renamed from: r */
    public boolean f148682r = true;

    /* renamed from: s */
    public boolean f148683s = true;

    /* renamed from: t */
    public boolean f148684t = true;

    /* renamed from: u */
    public boolean f148685u = true;

    /* renamed from: v */
    public boolean f148686v = true;

    /* renamed from: w */
    public boolean f148687w = true;

    /* renamed from: x */
    public boolean f148688x = true;

    /* renamed from: y */
    public boolean f148689y = true;

    /* renamed from: z */
    public boolean f148690z = true;

    static {
        SingleTable singleTable = new SingleTable("TextStatus");
        f148613T = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("UserName", "string", singleTable.getName(), "");
        new Column("StatusID", "string", singleTable.getName(), "");
        new Column("TopicId", "string", singleTable.getName(), "");
        new Column("SourceID", "string", singleTable.getName(), "");
        new Column("TopicInfo", "byte[]", singleTable.getName(), "");
        new Column("ClusterShowInfo", "byte[]", singleTable.getName(), "");
        new Column("IconID", "string", singleTable.getName(), "");
        new Column("Description", "string", singleTable.getName(), "");
        new Column("MediaType", "int", singleTable.getName(), "");
        new Column("MediaUrl", "string", singleTable.getName(), "");
        new Column("MediaAESKey", "string", singleTable.getName(), "");
        new Column("MediaThumbUrl", "string", singleTable.getName(), "");
        new Column("MediaThumbAESKey", "string", singleTable.getName(), "");
        new Column("PoiID", "string", singleTable.getName(), "");
        new Column("PoiName", "string", singleTable.getName(), "");
        new Column("Longitude", "double", singleTable.getName(), "");
        new Column("Latitude", "double", singleTable.getName(), "");
        new Column("Visibility", "int", singleTable.getName(), "");
        new Column("CreateTime", "int", singleTable.getName(), "");
        new Column("ExpireTime", "int", singleTable.getName(), "");
        new Column("LikeCount", "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("backgroundId", "string", singleTable.getName(), "");
        new Column("option", "long", singleTable.getName(), "");
        new Column("mediaWidth", "int", singleTable.getName(), "");
        new Column("mediaHeight", "int", singleTable.getName(), "");
        new Column("visibilityInfo", "string", singleTable.getName(), "");
        new Column("referenceUserName", "string", singleTable.getName(), "");
        new Column("referenceTextStatusId", "string", singleTable.getName(), "");
        new Column("referenceCount", "int", singleTable.getName(), "");
        new Column("sceneType", "int", singleTable.getName(), "");
        new Column("duplicateUserName", "string", singleTable.getName(), "");
        new Column("duplicateTextStatusId", "string", singleTable.getName(), "");
        new Column("EmojiInfo", "byte[]", singleTable.getName(), "");
        new Column("statusExtInfoOriBytes", "byte[]", singleTable.getName(), "");
        new Column("ClusterId", "string", singleTable.getName(), "");
        new Column("LikeCountVersion", "int", singleTable.getName(), "");
        new Column("profileSeq", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[38];
        String[] strArr = new String[39];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "UserName";
        mAutoDBInfo.colsMap.put("UserName", "TEXT");
        mAutoDBInfo.columns[1] = "StatusID";
        mAutoDBInfo.colsMap.put("StatusID", "TEXT");
        mAutoDBInfo.columns[2] = "TopicId";
        mAutoDBInfo.colsMap.put("TopicId", "TEXT");
        mAutoDBInfo.columns[3] = "SourceID";
        mAutoDBInfo.colsMap.put("SourceID", "TEXT");
        mAutoDBInfo.columns[4] = "TopicInfo";
        mAutoDBInfo.colsMap.put("TopicInfo", "BLOB");
        mAutoDBInfo.columns[5] = "ClusterShowInfo";
        mAutoDBInfo.colsMap.put("ClusterShowInfo", "BLOB");
        mAutoDBInfo.columns[6] = "IconID";
        mAutoDBInfo.colsMap.put("IconID", "TEXT");
        mAutoDBInfo.columns[7] = "Description";
        mAutoDBInfo.colsMap.put("Description", "TEXT");
        mAutoDBInfo.columns[8] = "MediaType";
        mAutoDBInfo.colsMap.put("MediaType", "INTEGER");
        mAutoDBInfo.columns[9] = "MediaUrl";
        mAutoDBInfo.colsMap.put("MediaUrl", "TEXT");
        mAutoDBInfo.columns[10] = "MediaAESKey";
        mAutoDBInfo.colsMap.put("MediaAESKey", "TEXT");
        mAutoDBInfo.columns[11] = "MediaThumbUrl";
        mAutoDBInfo.colsMap.put("MediaThumbUrl", "TEXT");
        mAutoDBInfo.columns[12] = "MediaThumbAESKey";
        mAutoDBInfo.colsMap.put("MediaThumbAESKey", "TEXT");
        mAutoDBInfo.columns[13] = "PoiID";
        mAutoDBInfo.colsMap.put("PoiID", "TEXT");
        mAutoDBInfo.columns[14] = "PoiName";
        mAutoDBInfo.colsMap.put("PoiName", "TEXT");
        mAutoDBInfo.columns[15] = "Longitude";
        mAutoDBInfo.colsMap.put("Longitude", "DOUBLE");
        mAutoDBInfo.columns[16] = "Latitude";
        mAutoDBInfo.colsMap.put("Latitude", "DOUBLE");
        mAutoDBInfo.columns[17] = "Visibility";
        mAutoDBInfo.colsMap.put("Visibility", "INTEGER");
        mAutoDBInfo.columns[18] = "CreateTime";
        mAutoDBInfo.colsMap.put("CreateTime", "INTEGER");
        mAutoDBInfo.columns[19] = "ExpireTime";
        mAutoDBInfo.colsMap.put("ExpireTime", "INTEGER");
        mAutoDBInfo.columns[20] = "LikeCount";
        mAutoDBInfo.colsMap.put("LikeCount", "INTEGER");
        mAutoDBInfo.columns[21] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[22] = "backgroundId";
        mAutoDBInfo.colsMap.put("backgroundId", "TEXT");
        mAutoDBInfo.columns[23] = "option";
        mAutoDBInfo.colsMap.put("option", "LONG");
        mAutoDBInfo.columns[24] = "mediaWidth";
        mAutoDBInfo.colsMap.put("mediaWidth", "INTEGER");
        mAutoDBInfo.columns[25] = "mediaHeight";
        mAutoDBInfo.colsMap.put("mediaHeight", "INTEGER");
        mAutoDBInfo.columns[26] = "visibilityInfo";
        mAutoDBInfo.colsMap.put("visibilityInfo", "TEXT");
        mAutoDBInfo.columns[27] = "referenceUserName";
        mAutoDBInfo.colsMap.put("referenceUserName", "TEXT");
        mAutoDBInfo.columns[28] = "referenceTextStatusId";
        mAutoDBInfo.colsMap.put("referenceTextStatusId", "TEXT");
        mAutoDBInfo.columns[29] = "referenceCount";
        mAutoDBInfo.colsMap.put("referenceCount", "INTEGER");
        mAutoDBInfo.columns[30] = "sceneType";
        mAutoDBInfo.colsMap.put("sceneType", "INTEGER");
        mAutoDBInfo.columns[31] = "duplicateUserName";
        mAutoDBInfo.colsMap.put("duplicateUserName", "TEXT");
        mAutoDBInfo.columns[32] = "duplicateTextStatusId";
        mAutoDBInfo.colsMap.put("duplicateTextStatusId", "TEXT");
        mAutoDBInfo.columns[33] = "EmojiInfo";
        mAutoDBInfo.colsMap.put("EmojiInfo", "BLOB");
        mAutoDBInfo.columns[34] = "statusExtInfoOriBytes";
        mAutoDBInfo.colsMap.put("statusExtInfoOriBytes", "BLOB");
        mAutoDBInfo.columns[35] = "ClusterId";
        mAutoDBInfo.colsMap.put("ClusterId", "TEXT");
        mAutoDBInfo.columns[36] = "LikeCountVersion";
        mAutoDBInfo.colsMap.put("LikeCountVersion", "INTEGER");
        mAutoDBInfo.columns[37] = "profileSeq";
        mAutoDBInfo.colsMap.put("profileSeq", "LONG");
        mAutoDBInfo.columns[38] = "rowid";
        mAutoDBInfo.sql = " UserName TEXT,  StatusID TEXT,  TopicId TEXT,  SourceID TEXT,  TopicInfo BLOB,  ClusterShowInfo BLOB,  IconID TEXT,  Description TEXT,  MediaType INTEGER,  MediaUrl TEXT,  MediaAESKey TEXT,  MediaThumbUrl TEXT,  MediaThumbAESKey TEXT,  PoiID TEXT,  PoiName TEXT,  Longitude DOUBLE,  Latitude DOUBLE,  Visibility INTEGER,  CreateTime INTEGER,  ExpireTime INTEGER,  LikeCount INTEGER,  state INTEGER,  backgroundId TEXT,  option LONG,  mediaWidth INTEGER,  mediaHeight INTEGER,  visibilityInfo TEXT,  referenceUserName TEXT,  referenceTextStatusId TEXT,  referenceCount INTEGER,  sceneType INTEGER,  duplicateUserName TEXT,  duplicateTextStatusId TEXT,  EmojiInfo BLOB,  statusExtInfoOriBytes BLOB,  ClusterId TEXT,  LikeCountVersion INTEGER,  profileSeq LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53270a)) {
            return false;
        }
        C53270a aVar = (C53270a) iAutoDBItem;
        return C46238a.m51546a(this.field_UserName, aVar.field_UserName) && C46238a.m51546a(this.field_StatusID, aVar.field_StatusID) && C46238a.m51546a(this.field_TopicId, aVar.field_TopicId) && C46238a.m51546a(this.field_SourceID, aVar.field_SourceID) && C46238a.m51546a(this.field_TopicInfo, aVar.field_TopicInfo) && C46238a.m51546a(this.field_ClusterShowInfo, aVar.field_ClusterShowInfo) && C46238a.m51546a(this.field_IconID, aVar.field_IconID) && C46238a.m51546a(this.field_Description, aVar.field_Description) && C46238a.m51546a(Integer.valueOf(this.field_MediaType), Integer.valueOf(aVar.field_MediaType)) && C46238a.m51546a(this.field_MediaUrl, aVar.field_MediaUrl) && C46238a.m51546a(this.field_MediaAESKey, aVar.field_MediaAESKey) && C46238a.m51546a(this.field_MediaThumbUrl, aVar.field_MediaThumbUrl) && C46238a.m51546a(this.field_MediaThumbAESKey, aVar.field_MediaThumbAESKey) && C46238a.m51546a(this.field_PoiID, aVar.field_PoiID) && C46238a.m51546a(this.field_PoiName, aVar.field_PoiName) && C46238a.m51546a(Double.valueOf(this.field_Longitude), Double.valueOf(aVar.field_Longitude)) && C46238a.m51546a(Double.valueOf(this.field_Latitude), Double.valueOf(aVar.field_Latitude)) && C46238a.m51546a(Integer.valueOf(this.field_Visibility), Integer.valueOf(aVar.field_Visibility)) && C46238a.m51546a(Integer.valueOf(this.field_CreateTime), Integer.valueOf(aVar.field_CreateTime)) && C46238a.m51546a(Integer.valueOf(this.field_ExpireTime), Integer.valueOf(aVar.field_ExpireTime)) && C46238a.m51546a(Integer.valueOf(this.field_LikeCount), Integer.valueOf(aVar.field_LikeCount)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(aVar.field_state)) && C46238a.m51546a(this.field_backgroundId, aVar.field_backgroundId) && C46238a.m51546a(this.field_option, aVar.field_option) && C46238a.m51546a(Integer.valueOf(this.field_mediaWidth), Integer.valueOf(aVar.field_mediaWidth)) && C46238a.m51546a(Integer.valueOf(this.field_mediaHeight), Integer.valueOf(aVar.field_mediaHeight)) && C46238a.m51546a(this.field_visibilityInfo, aVar.field_visibilityInfo) && C46238a.m51546a(this.field_referenceUserName, aVar.field_referenceUserName) && C46238a.m51546a(this.field_referenceTextStatusId, aVar.field_referenceTextStatusId) && C46238a.m51546a(Integer.valueOf(this.field_referenceCount), Integer.valueOf(aVar.field_referenceCount)) && C46238a.m51546a(Integer.valueOf(this.field_sceneType), Integer.valueOf(aVar.field_sceneType)) && C46238a.m51546a(this.field_duplicateUserName, aVar.field_duplicateUserName) && C46238a.m51546a(this.field_duplicateTextStatusId, aVar.field_duplicateTextStatusId) && C46238a.m51546a(this.field_EmojiInfo, aVar.field_EmojiInfo) && C46238a.m51546a(this.field_statusExtInfoOriBytes, aVar.field_statusExtInfoOriBytes) && C46238a.m51546a(this.field_ClusterId, aVar.field_ClusterId) && C46238a.m51546a(Integer.valueOf(this.field_LikeCountVersion), Integer.valueOf(aVar.field_LikeCountVersion)) && C46238a.m51546a(Long.valueOf(this.field_profileSeq), Long.valueOf(aVar.field_profileSeq));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148617V == hashCode) {
                    try {
                        this.field_UserName = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148619W == hashCode) {
                    try {
                        this.field_StatusID = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148621X == hashCode) {
                    try {
                        this.field_TopicId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148623Y == hashCode) {
                    try {
                        this.field_SourceID = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148625Z == hashCode) {
                    try {
                        this.field_TopicInfo = cursor.getBlob(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148642p0 == hashCode) {
                    try {
                        this.field_ClusterShowInfo = cursor.getBlob(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148651x0 == hashCode) {
                    try {
                        this.field_IconID = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148652y0 == hashCode) {
                    try {
                        this.field_Description = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148610Q0 == hashCode) {
                    try {
                        this.field_MediaType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148611R0 == hashCode) {
                    try {
                        this.field_MediaUrl = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148612S0 == hashCode) {
                    try {
                        this.field_MediaAESKey = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148614T0 == hashCode) {
                    try {
                        this.field_MediaThumbUrl = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148616U0 == hashCode) {
                    try {
                        this.field_MediaThumbAESKey = cursor.getString(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148618V0 == hashCode) {
                    try {
                        this.field_PoiID = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148620W0 == hashCode) {
                    try {
                        this.field_PoiName = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148622X0 == hashCode) {
                    try {
                        this.field_Longitude = cursor.getDouble(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148624Y0 == hashCode) {
                    try {
                        this.field_Latitude = cursor.getDouble(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148626Z0 == hashCode) {
                    try {
                        this.field_Visibility = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148627a1 == hashCode) {
                    try {
                        this.field_CreateTime = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148628b1 == hashCode) {
                    try {
                        this.field_ExpireTime = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148629c1 == hashCode) {
                    try {
                        this.field_LikeCount = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148630d1 == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148631e1 == hashCode) {
                    try {
                        this.field_backgroundId = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148632f1 == hashCode) {
                    try {
                        this.field_option = Long.valueOf(cursor.getLong(i));
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148633g1 == hashCode) {
                    try {
                        this.field_mediaWidth = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148634h1 == hashCode) {
                    try {
                        this.field_mediaHeight = cursor.getInt(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148635i1 == hashCode) {
                    try {
                        this.field_visibilityInfo = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148636j1 == hashCode) {
                    try {
                        this.field_referenceUserName = cursor.getString(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148637k1 == hashCode) {
                    try {
                        this.field_referenceTextStatusId = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148638l1 == hashCode) {
                    try {
                        this.field_referenceCount = cursor.getInt(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148639m1 == hashCode) {
                    try {
                        this.field_sceneType = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148640n1 == hashCode) {
                    try {
                        this.field_duplicateUserName = cursor.getString(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148641o1 == hashCode) {
                    try {
                        this.field_duplicateTextStatusId = cursor.getString(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148643p1 == hashCode) {
                    try {
                        this.field_EmojiInfo = cursor.getBlob(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148644q1 == hashCode) {
                    try {
                        this.field_statusExtInfoOriBytes = cursor.getBlob(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148645r1 == hashCode) {
                    try {
                        this.field_ClusterId = cursor.getString(i);
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148646s1 == hashCode) {
                    try {
                        this.field_LikeCountVersion = cursor.getInt(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148647t1 == hashCode) {
                    try {
                        this.field_profileSeq = cursor.getLong(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatus", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148648u1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f148671d) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f148672e) {
            contentValues.put("StatusID", this.field_StatusID);
        }
        if (this.f148673f) {
            contentValues.put("TopicId", this.field_TopicId);
        }
        if (this.f148674g) {
            contentValues.put("SourceID", this.field_SourceID);
        }
        if (this.f148675h) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f148676i) {
            contentValues.put("ClusterShowInfo", this.field_ClusterShowInfo);
        }
        if (this.f148677j) {
            contentValues.put("IconID", this.field_IconID);
        }
        if (this.f148678n) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f148679o) {
            contentValues.put("MediaType", Integer.valueOf(this.field_MediaType));
        }
        if (this.f148680p) {
            contentValues.put("MediaUrl", this.field_MediaUrl);
        }
        if (this.f148681q) {
            contentValues.put("MediaAESKey", this.field_MediaAESKey);
        }
        if (this.f148682r) {
            contentValues.put("MediaThumbUrl", this.field_MediaThumbUrl);
        }
        if (this.f148683s) {
            contentValues.put("MediaThumbAESKey", this.field_MediaThumbAESKey);
        }
        if (this.f148684t) {
            contentValues.put("PoiID", this.field_PoiID);
        }
        if (this.f148685u) {
            contentValues.put("PoiName", this.field_PoiName);
        }
        if (this.f148686v) {
            contentValues.put("Longitude", Double.valueOf(this.field_Longitude));
        }
        if (this.f148687w) {
            contentValues.put("Latitude", Double.valueOf(this.field_Latitude));
        }
        if (this.f148688x) {
            contentValues.put("Visibility", Integer.valueOf(this.field_Visibility));
        }
        if (this.f148689y) {
            contentValues.put("CreateTime", Integer.valueOf(this.field_CreateTime));
        }
        if (this.f148690z) {
            contentValues.put("ExpireTime", Integer.valueOf(this.field_ExpireTime));
        }
        if (this.f148653A) {
            contentValues.put("LikeCount", Integer.valueOf(this.field_LikeCount));
        }
        if (this.f148654B) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f148655C) {
            contentValues.put("backgroundId", this.field_backgroundId);
        }
        if (this.f148656D) {
            contentValues.put("option", this.field_option);
        }
        if (this.f148657E) {
            contentValues.put("mediaWidth", Integer.valueOf(this.field_mediaWidth));
        }
        if (this.f148658F) {
            contentValues.put("mediaHeight", Integer.valueOf(this.field_mediaHeight));
        }
        if (this.f148659G) {
            contentValues.put("visibilityInfo", this.field_visibilityInfo);
        }
        if (this.f148660H) {
            contentValues.put("referenceUserName", this.field_referenceUserName);
        }
        if (this.f148661I) {
            contentValues.put("referenceTextStatusId", this.field_referenceTextStatusId);
        }
        if (this.f148662J) {
            contentValues.put("referenceCount", Integer.valueOf(this.field_referenceCount));
        }
        if (this.f148663K) {
            contentValues.put("sceneType", Integer.valueOf(this.field_sceneType));
        }
        if (this.f148664L) {
            contentValues.put("duplicateUserName", this.field_duplicateUserName);
        }
        if (this.f148665M) {
            contentValues.put("duplicateTextStatusId", this.field_duplicateTextStatusId);
        }
        if (this.f148666N) {
            contentValues.put("EmojiInfo", this.field_EmojiInfo);
        }
        if (this.f148667P) {
            contentValues.put("statusExtInfoOriBytes", this.field_statusExtInfoOriBytes);
        }
        if (this.f148668Q) {
            contentValues.put("ClusterId", this.field_ClusterId);
        }
        if (this.f148669R) {
            contentValues.put("LikeCountVersion", Integer.valueOf(this.field_LikeCountVersion));
        }
        if (this.f148670S) {
            contentValues.put("profileSeq", Long.valueOf(this.field_profileSeq));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTextStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TextStatus ( " + f148649v1.sql + ");");
        for (String add : f148615U) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatus", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TextStatus", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148649v1, "TextStatus", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTextStatus", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TextStatus", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTextStatus", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148649v1;
    }

    public String[] getIndexCreateSQL() {
        return f148615U;
    }

    public StorageObserverOwner<C53270a> getObserverOwner() {
        return f148650w1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f148613T;
    }

    public String getTableName() {
        return f148613T.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z) {
                this.f148671d = true;
            }
        }
        if (contentValues.containsKey("StatusID")) {
            this.field_StatusID = contentValues.getAsString("StatusID");
            if (z) {
                this.f148672e = true;
            }
        }
        if (contentValues.containsKey("TopicId")) {
            this.field_TopicId = contentValues.getAsString("TopicId");
            if (z) {
                this.f148673f = true;
            }
        }
        if (contentValues.containsKey("SourceID")) {
            this.field_SourceID = contentValues.getAsString("SourceID");
            if (z) {
                this.f148674g = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z) {
                this.f148675h = true;
            }
        }
        if (contentValues.containsKey("ClusterShowInfo")) {
            this.field_ClusterShowInfo = contentValues.getAsByteArray("ClusterShowInfo");
            if (z) {
                this.f148676i = true;
            }
        }
        if (contentValues.containsKey("IconID")) {
            this.field_IconID = contentValues.getAsString("IconID");
            if (z) {
                this.f148677j = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z) {
                this.f148678n = true;
            }
        }
        if (contentValues.containsKey("MediaType")) {
            this.field_MediaType = contentValues.getAsInteger("MediaType").intValue();
            if (z) {
                this.f148679o = true;
            }
        }
        if (contentValues.containsKey("MediaUrl")) {
            this.field_MediaUrl = contentValues.getAsString("MediaUrl");
            if (z) {
                this.f148680p = true;
            }
        }
        if (contentValues.containsKey("MediaAESKey")) {
            this.field_MediaAESKey = contentValues.getAsString("MediaAESKey");
            if (z) {
                this.f148681q = true;
            }
        }
        if (contentValues.containsKey("MediaThumbUrl")) {
            this.field_MediaThumbUrl = contentValues.getAsString("MediaThumbUrl");
            if (z) {
                this.f148682r = true;
            }
        }
        if (contentValues.containsKey("MediaThumbAESKey")) {
            this.field_MediaThumbAESKey = contentValues.getAsString("MediaThumbAESKey");
            if (z) {
                this.f148683s = true;
            }
        }
        if (contentValues.containsKey("PoiID")) {
            this.field_PoiID = contentValues.getAsString("PoiID");
            if (z) {
                this.f148684t = true;
            }
        }
        if (contentValues.containsKey("PoiName")) {
            this.field_PoiName = contentValues.getAsString("PoiName");
            if (z) {
                this.f148685u = true;
            }
        }
        if (contentValues.containsKey("Longitude")) {
            this.field_Longitude = contentValues.getAsDouble("Longitude").doubleValue();
            if (z) {
                this.f148686v = true;
            }
        }
        if (contentValues.containsKey("Latitude")) {
            this.field_Latitude = contentValues.getAsDouble("Latitude").doubleValue();
            if (z) {
                this.f148687w = true;
            }
        }
        if (contentValues.containsKey("Visibility")) {
            this.field_Visibility = contentValues.getAsInteger("Visibility").intValue();
            if (z) {
                this.f148688x = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z) {
                this.f148689y = true;
            }
        }
        if (contentValues.containsKey("ExpireTime")) {
            this.field_ExpireTime = contentValues.getAsInteger("ExpireTime").intValue();
            if (z) {
                this.f148690z = true;
            }
        }
        if (contentValues.containsKey("LikeCount")) {
            this.field_LikeCount = contentValues.getAsInteger("LikeCount").intValue();
            if (z) {
                this.f148653A = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f148654B = true;
            }
        }
        if (contentValues.containsKey("backgroundId")) {
            this.field_backgroundId = contentValues.getAsString("backgroundId");
            if (z) {
                this.f148655C = true;
            }
        }
        if (contentValues.containsKey("option")) {
            this.field_option = contentValues.getAsLong("option");
            if (z) {
                this.f148656D = true;
            }
        }
        if (contentValues.containsKey("mediaWidth")) {
            this.field_mediaWidth = contentValues.getAsInteger("mediaWidth").intValue();
            if (z) {
                this.f148657E = true;
            }
        }
        if (contentValues.containsKey("mediaHeight")) {
            this.field_mediaHeight = contentValues.getAsInteger("mediaHeight").intValue();
            if (z) {
                this.f148658F = true;
            }
        }
        if (contentValues.containsKey("visibilityInfo")) {
            this.field_visibilityInfo = contentValues.getAsString("visibilityInfo");
            if (z) {
                this.f148659G = true;
            }
        }
        if (contentValues.containsKey("referenceUserName")) {
            this.field_referenceUserName = contentValues.getAsString("referenceUserName");
            if (z) {
                this.f148660H = true;
            }
        }
        if (contentValues.containsKey("referenceTextStatusId")) {
            this.field_referenceTextStatusId = contentValues.getAsString("referenceTextStatusId");
            if (z) {
                this.f148661I = true;
            }
        }
        if (contentValues.containsKey("referenceCount")) {
            this.field_referenceCount = contentValues.getAsInteger("referenceCount").intValue();
            if (z) {
                this.f148662J = true;
            }
        }
        if (contentValues.containsKey("sceneType")) {
            this.field_sceneType = contentValues.getAsInteger("sceneType").intValue();
            if (z) {
                this.f148663K = true;
            }
        }
        if (contentValues.containsKey("duplicateUserName")) {
            this.field_duplicateUserName = contentValues.getAsString("duplicateUserName");
            if (z) {
                this.f148664L = true;
            }
        }
        if (contentValues.containsKey("duplicateTextStatusId")) {
            this.field_duplicateTextStatusId = contentValues.getAsString("duplicateTextStatusId");
            if (z) {
                this.f148665M = true;
            }
        }
        if (contentValues.containsKey("EmojiInfo")) {
            this.field_EmojiInfo = contentValues.getAsByteArray("EmojiInfo");
            if (z) {
                this.f148666N = true;
            }
        }
        if (contentValues.containsKey("statusExtInfoOriBytes")) {
            this.field_statusExtInfoOriBytes = contentValues.getAsByteArray("statusExtInfoOriBytes");
            if (z) {
                this.f148667P = true;
            }
        }
        if (contentValues.containsKey("ClusterId")) {
            this.field_ClusterId = contentValues.getAsString("ClusterId");
            if (z) {
                this.f148668Q = true;
            }
        }
        if (contentValues.containsKey("LikeCountVersion")) {
            this.field_LikeCountVersion = contentValues.getAsInteger("LikeCountVersion").intValue();
            if (z) {
                this.f148669R = true;
            }
        }
        if (contentValues.containsKey("profileSeq")) {
            this.field_profileSeq = contentValues.getAsLong("profileSeq").longValue();
            if (z) {
                this.f148670S = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
