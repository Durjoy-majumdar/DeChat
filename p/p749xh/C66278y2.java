package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C49183dr2;
import te3.C49988jg1;
import te3.C50266li0;

/* renamed from: xh.y2 */
public class C66278y2 extends IAutoDBItem {

    /* renamed from: I */
    public static final SingleTable f190724I;

    /* renamed from: J */
    public static final Column f190725J;

    /* renamed from: K */
    public static final String[] f190726K = {"CREATE INDEX IF NOT EXISTS FinderAccount_username_index ON FinderAccount(username)"};

    /* renamed from: L */
    public static final int f190727L = -265713450;

    /* renamed from: M */
    public static final int f190728M = 70690926;

    /* renamed from: N */
    public static final int f190729N = 1073584312;

    /* renamed from: P */
    public static final int f190730P = -428646058;

    /* renamed from: Q */
    public static final int f190731Q = -351778248;

    /* renamed from: Q0 */
    public static final int f190732Q0 = 1156112555;

    /* renamed from: R */
    public static final int f190733R = -832520009;

    /* renamed from: R0 */
    public static final int f190734R0 = -1284815164;

    /* renamed from: S */
    public static final int f190735S = 113766;

    /* renamed from: S0 */
    public static final int f190736S0 = 1031171413;

    /* renamed from: T */
    public static final int f190737T = 957831062;

    /* renamed from: T0 */
    public static final int f190738T0 = 232081147;

    /* renamed from: U */
    public static final int f190739U = -987485392;

    /* renamed from: U0 */
    public static final int f190740U0 = -225470277;

    /* renamed from: V */
    public static final int f190741V = 3053931;

    /* renamed from: V0 */
    public static final int f190742V0 = 1417360314;

    /* renamed from: W */
    public static final int f190743W = 49741453;

    /* renamed from: W0 */
    public static final int f190744W0 = 2137657887;

    /* renamed from: X */
    public static final int f190745X = 113759;

    /* renamed from: X0 */
    public static final int f190746X0 = 2137566429;

    /* renamed from: Y */
    public static final int f190747Y = -1306589907;

    /* renamed from: Y0 */
    public static final int f190748Y0 = -110338125;

    /* renamed from: Z */
    public static final int f190749Z = -966745906;

    /* renamed from: Z0 */
    public static final int f190750Z0 = 826429453;

    /* renamed from: a1 */
    public static final int f190751a1 = 1458141533;

    /* renamed from: b1 */
    public static final int f190752b1 = 108705909;

    /* renamed from: c1 */
    public static final IAutoDBItem.MAutoDBInfo f190753c1 = initAutoDBInfo(C66278y2.class);

    /* renamed from: d1 */
    public static final StorageObserverOwner<C66278y2> f190754d1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f190755p0 = -2128090623;

    /* renamed from: x0 */
    public static final int f190756x0 = 293230747;

    /* renamed from: y0 */
    public static final int f190757y0 = 1431937654;

    /* renamed from: A */
    public boolean f190758A = true;

    /* renamed from: B */
    public boolean f190759B = true;

    /* renamed from: C */
    public boolean f190760C = true;

    /* renamed from: D */
    public boolean f190761D = true;

    /* renamed from: E */
    public boolean f190762E = true;

    /* renamed from: F */
    public boolean f190763F = true;

    /* renamed from: G */
    public boolean f190764G = true;

    /* renamed from: H */
    public boolean f190765H = true;

    /* renamed from: d */
    public boolean f190766d = true;

    /* renamed from: e */
    public boolean f190767e = true;

    /* renamed from: f */
    public boolean f190768f = true;
    public FinderAuthInfo field_authInfo;
    public String field_avatarUrl;
    public String field_city;
    public int field_contact_user_flag;
    public String field_country;
    public String field_coverUrl;
    public int field_extFlag;
    public int field_fansAddCount;
    public String field_finder_version_username_history;
    public String field_liveCoverImgUrl;
    public C50266li0 field_liveInfo;
    public String field_messageCommentBuf;
    public String field_messageFollowBuf;
    public String field_messageLikeBuf;
    public String field_nickname;
    public int field_originalEntranceFlag;
    public int field_originalFlag;
    public C49988jg1 field_originalInfo;
    public C49183dr2 field_prepareFinder;
    public String field_province;
    public long field_seq;
    public int field_sex;
    public String field_signature;
    public int field_spamStatus;
    public int field_systemMsgCount;
    public long field_userVersion;
    public String field_username;
    public int field_username_history_version;

    /* renamed from: g */
    public boolean f190769g = true;

    /* renamed from: h */
    public boolean f190770h = true;

    /* renamed from: i */
    public boolean f190771i = true;

    /* renamed from: j */
    public boolean f190772j = true;

    /* renamed from: n */
    public boolean f190773n = true;

    /* renamed from: o */
    public boolean f190774o = true;

    /* renamed from: p */
    public boolean f190775p = true;

    /* renamed from: q */
    public boolean f190776q = true;

    /* renamed from: r */
    public boolean f190777r = true;

    /* renamed from: s */
    public boolean f190778s = true;

    /* renamed from: t */
    public boolean f190779t = true;

    /* renamed from: u */
    public boolean f190780u = true;

    /* renamed from: v */
    public boolean f190781v = true;

    /* renamed from: w */
    public boolean f190782w = true;

    /* renamed from: x */
    public boolean f190783x = true;

    /* renamed from: y */
    public boolean f190784y = true;

    /* renamed from: z */
    public boolean f190785z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderAccount");
        f190724I = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f190725J = new Column("username", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("avatarUrl", "string", singleTable.getName(), "");
        new Column("coverUrl", "string", singleTable.getName(), "");
        new Column("liveCoverImgUrl", "string", singleTable.getName(), "");
        new Column("sex", "int", singleTable.getName(), "");
        new Column("country", "string", singleTable.getName(), "");
        new Column("province", "string", singleTable.getName(), "");
        new Column("city", "string", singleTable.getName(), "");
        new Column("userVersion", "long", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_SEQ, "long", singleTable.getName(), "");
        new Column("extFlag", "int", singleTable.getName(), "");
        new Column("fansAddCount", "int", singleTable.getName(), "");
        new Column("contact_user_flag", "int", singleTable.getName(), "");
        new Column("spamStatus", "int", singleTable.getName(), "");
        new Column("authInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderAuthInfo");
        new Column("finder_version_username_history", "string", singleTable.getName(), "");
        new Column("username_history_version", "int", singleTable.getName(), "");
        new Column("messageLikeBuf", "string", singleTable.getName(), "");
        new Column("messageCommentBuf", "string", singleTable.getName(), "");
        new Column("messageFollowBuf", "string", singleTable.getName(), "");
        new Column("liveInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderContactLiveInfo");
        new Column("originalInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderOriginalInfo");
        new Column("originalFlag", "int", singleTable.getName(), "");
        new Column("originalEntranceFlag", "int", singleTable.getName(), "");
        new Column("prepareFinder", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalPrepareFinder");
        new Column("systemMsgCount", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[28];
        String[] strArr = new String[29];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "avatarUrl";
        mAutoDBInfo.colsMap.put("avatarUrl", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "coverUrl";
        mAutoDBInfo.colsMap.put("coverUrl", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "liveCoverImgUrl";
        mAutoDBInfo.colsMap.put("liveCoverImgUrl", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "sex";
        mAutoDBInfo.colsMap.put("sex", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "country";
        mAutoDBInfo.colsMap.put("country", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "province";
        mAutoDBInfo.colsMap.put("province", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "city";
        mAutoDBInfo.colsMap.put("city", "TEXT default '' ");
        mAutoDBInfo.columns[10] = "userVersion";
        mAutoDBInfo.colsMap.put("userVersion", "LONG");
        mAutoDBInfo.columns[11] = TPReportKeys.Common.COMMON_SEQ;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_SEQ, "LONG");
        mAutoDBInfo.columns[12] = "extFlag";
        mAutoDBInfo.colsMap.put("extFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[13] = "fansAddCount";
        mAutoDBInfo.colsMap.put("fansAddCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "contact_user_flag";
        mAutoDBInfo.colsMap.put("contact_user_flag", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "spamStatus";
        mAutoDBInfo.colsMap.put("spamStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "authInfo";
        mAutoDBInfo.colsMap.put("authInfo", "BLOB");
        mAutoDBInfo.columns[17] = "finder_version_username_history";
        mAutoDBInfo.colsMap.put("finder_version_username_history", "TEXT default '' ");
        mAutoDBInfo.columns[18] = "username_history_version";
        mAutoDBInfo.colsMap.put("username_history_version", "INTEGER");
        mAutoDBInfo.columns[19] = "messageLikeBuf";
        mAutoDBInfo.colsMap.put("messageLikeBuf", "TEXT default '' ");
        mAutoDBInfo.columns[20] = "messageCommentBuf";
        mAutoDBInfo.colsMap.put("messageCommentBuf", "TEXT default '' ");
        mAutoDBInfo.columns[21] = "messageFollowBuf";
        mAutoDBInfo.colsMap.put("messageFollowBuf", "TEXT default '' ");
        mAutoDBInfo.columns[22] = "liveInfo";
        mAutoDBInfo.colsMap.put("liveInfo", "BLOB");
        mAutoDBInfo.columns[23] = "originalInfo";
        mAutoDBInfo.colsMap.put("originalInfo", "BLOB");
        mAutoDBInfo.columns[24] = "originalFlag";
        mAutoDBInfo.colsMap.put("originalFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[25] = "originalEntranceFlag";
        mAutoDBInfo.colsMap.put("originalEntranceFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[26] = "prepareFinder";
        mAutoDBInfo.colsMap.put("prepareFinder", "BLOB");
        mAutoDBInfo.columns[27] = "systemMsgCount";
        mAutoDBInfo.colsMap.put("systemMsgCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[28] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  nickname TEXT default '' ,  signature TEXT default '' ,  avatarUrl TEXT default '' ,  coverUrl TEXT default '' ,  liveCoverImgUrl TEXT default '' ,  sex INTEGER default '0' ,  country TEXT default '' ,  province TEXT default '' ,  city TEXT default '' ,  userVersion LONG,  seq LONG,  extFlag INTEGER default '0' ,  fansAddCount INTEGER default '0' ,  contact_user_flag INTEGER default '0' ,  spamStatus INTEGER default '0' ,  authInfo BLOB,  finder_version_username_history TEXT default '' ,  username_history_version INTEGER,  messageLikeBuf TEXT default '' ,  messageCommentBuf TEXT default '' ,  messageFollowBuf TEXT default '' ,  liveInfo BLOB,  originalInfo BLOB,  originalFlag INTEGER default '0' ,  originalEntranceFlag INTEGER default '0' ,  prepareFinder BLOB,  systemMsgCount INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66278y2)) {
            return false;
        }
        C66278y2 y2Var = (C66278y2) iAutoDBItem;
        return C46238a.m51546a(this.field_username, y2Var.field_username) && C46238a.m51546a(this.field_nickname, y2Var.field_nickname) && C46238a.m51546a(this.field_signature, y2Var.field_signature) && C46238a.m51546a(this.field_avatarUrl, y2Var.field_avatarUrl) && C46238a.m51546a(this.field_coverUrl, y2Var.field_coverUrl) && C46238a.m51546a(this.field_liveCoverImgUrl, y2Var.field_liveCoverImgUrl) && C46238a.m51546a(Integer.valueOf(this.field_sex), Integer.valueOf(y2Var.field_sex)) && C46238a.m51546a(this.field_country, y2Var.field_country) && C46238a.m51546a(this.field_province, y2Var.field_province) && C46238a.m51546a(this.field_city, y2Var.field_city) && C46238a.m51546a(Long.valueOf(this.field_userVersion), Long.valueOf(y2Var.field_userVersion)) && C46238a.m51546a(Long.valueOf(this.field_seq), Long.valueOf(y2Var.field_seq)) && C46238a.m51546a(Integer.valueOf(this.field_extFlag), Integer.valueOf(y2Var.field_extFlag)) && C46238a.m51546a(Integer.valueOf(this.field_fansAddCount), Integer.valueOf(y2Var.field_fansAddCount)) && C46238a.m51546a(Integer.valueOf(this.field_contact_user_flag), Integer.valueOf(y2Var.field_contact_user_flag)) && C46238a.m51546a(Integer.valueOf(this.field_spamStatus), Integer.valueOf(y2Var.field_spamStatus)) && C46238a.m51546a(this.field_authInfo, y2Var.field_authInfo) && C46238a.m51546a(this.field_finder_version_username_history, y2Var.field_finder_version_username_history) && C46238a.m51546a(Integer.valueOf(this.field_username_history_version), Integer.valueOf(y2Var.field_username_history_version)) && C46238a.m51546a(this.field_messageLikeBuf, y2Var.field_messageLikeBuf) && C46238a.m51546a(this.field_messageCommentBuf, y2Var.field_messageCommentBuf) && C46238a.m51546a(this.field_messageFollowBuf, y2Var.field_messageFollowBuf) && C46238a.m51546a(this.field_liveInfo, y2Var.field_liveInfo) && C46238a.m51546a(this.field_originalInfo, y2Var.field_originalInfo) && C46238a.m51546a(Integer.valueOf(this.field_originalFlag), Integer.valueOf(y2Var.field_originalFlag)) && C46238a.m51546a(Integer.valueOf(this.field_originalEntranceFlag), Integer.valueOf(y2Var.field_originalEntranceFlag)) && C46238a.m51546a(this.field_prepareFinder, y2Var.field_prepareFinder) && C46238a.m51546a(Integer.valueOf(this.field_systemMsgCount), Integer.valueOf(y2Var.field_systemMsgCount));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190727L == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f190766d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190728M == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190729N == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190730P == hashCode) {
                    try {
                        this.field_avatarUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190731Q == hashCode) {
                    try {
                        this.field_coverUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190733R == hashCode) {
                    try {
                        this.field_liveCoverImgUrl = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190735S == hashCode) {
                    try {
                        this.field_sex = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190737T == hashCode) {
                    try {
                        this.field_country = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190739U == hashCode) {
                    try {
                        this.field_province = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190741V == hashCode) {
                    try {
                        this.field_city = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190743W == hashCode) {
                    try {
                        this.field_userVersion = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190745X == hashCode) {
                    try {
                        this.field_seq = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190747Y == hashCode) {
                    try {
                        this.field_extFlag = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190749Z == hashCode) {
                    try {
                        this.field_fansAddCount = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190755p0 == hashCode) {
                    try {
                        this.field_contact_user_flag = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190756x0 == hashCode) {
                    try {
                        this.field_spamStatus = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190757y0 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_authInfo = (FinderAuthInfo) new FinderAuthInfo().parseFrom(blob);
                        }
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190732Q0 == hashCode) {
                    try {
                        this.field_finder_version_username_history = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190734R0 == hashCode) {
                    try {
                        this.field_username_history_version = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190736S0 == hashCode) {
                    try {
                        this.field_messageLikeBuf = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190738T0 == hashCode) {
                    try {
                        this.field_messageCommentBuf = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190740U0 == hashCode) {
                    try {
                        this.field_messageFollowBuf = cursor.getString(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190742V0 == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_liveInfo = (C50266li0) new C50266li0().parseFrom(blob2);
                        }
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190744W0 == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_originalInfo = (C49988jg1) new C49988jg1().parseFrom(blob3);
                        }
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190746X0 == hashCode) {
                    try {
                        this.field_originalFlag = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190748Y0 == hashCode) {
                    try {
                        this.field_originalEntranceFlag = cursor.getInt(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190750Z0 == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_prepareFinder = (C49183dr2) new C49183dr2().parseFrom(blob4);
                        }
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190751a1 == hashCode) {
                    try {
                        this.field_systemMsgCount = cursor.getInt(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderAccount", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190752b1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C49183dr2 dr22;
        C49988jg1 jg12;
        C50266li0 li02;
        FinderAuthInfo finderAuthInfo;
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f190766d) {
            contentValues.put("username", this.field_username);
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f190767e) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_signature == null) {
            this.field_signature = "";
        }
        if (this.f190768f) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.field_avatarUrl == null) {
            this.field_avatarUrl = "";
        }
        if (this.f190769g) {
            contentValues.put("avatarUrl", this.field_avatarUrl);
        }
        if (this.field_coverUrl == null) {
            this.field_coverUrl = "";
        }
        if (this.f190770h) {
            contentValues.put("coverUrl", this.field_coverUrl);
        }
        if (this.field_liveCoverImgUrl == null) {
            this.field_liveCoverImgUrl = "";
        }
        if (this.f190771i) {
            contentValues.put("liveCoverImgUrl", this.field_liveCoverImgUrl);
        }
        if (this.f190772j) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if (this.field_country == null) {
            this.field_country = "";
        }
        if (this.f190773n) {
            contentValues.put("country", this.field_country);
        }
        if (this.field_province == null) {
            this.field_province = "";
        }
        if (this.f190774o) {
            contentValues.put("province", this.field_province);
        }
        if (this.field_city == null) {
            this.field_city = "";
        }
        if (this.f190775p) {
            contentValues.put("city", this.field_city);
        }
        if (this.f190776q) {
            contentValues.put("userVersion", Long.valueOf(this.field_userVersion));
        }
        if (this.f190777r) {
            contentValues.put(TPReportKeys.Common.COMMON_SEQ, Long.valueOf(this.field_seq));
        }
        if (this.f190778s) {
            contentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
        }
        if (this.f190779t) {
            contentValues.put("fansAddCount", Integer.valueOf(this.field_fansAddCount));
        }
        if (this.f190780u) {
            contentValues.put("contact_user_flag", Integer.valueOf(this.field_contact_user_flag));
        }
        if (this.f190781v) {
            contentValues.put("spamStatus", Integer.valueOf(this.field_spamStatus));
        }
        if (this.f190782w && (finderAuthInfo = this.field_authInfo) != null) {
            try {
                contentValues.put("authInfo", finderAuthInfo.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e.getMessage());
            }
        }
        if (this.field_finder_version_username_history == null) {
            this.field_finder_version_username_history = "";
        }
        if (this.f190783x) {
            contentValues.put("finder_version_username_history", this.field_finder_version_username_history);
        }
        if (this.f190784y) {
            contentValues.put("username_history_version", Integer.valueOf(this.field_username_history_version));
        }
        if (this.field_messageLikeBuf == null) {
            this.field_messageLikeBuf = "";
        }
        if (this.f190785z) {
            contentValues.put("messageLikeBuf", this.field_messageLikeBuf);
        }
        if (this.field_messageCommentBuf == null) {
            this.field_messageCommentBuf = "";
        }
        if (this.f190758A) {
            contentValues.put("messageCommentBuf", this.field_messageCommentBuf);
        }
        if (this.field_messageFollowBuf == null) {
            this.field_messageFollowBuf = "";
        }
        if (this.f190759B) {
            contentValues.put("messageFollowBuf", this.field_messageFollowBuf);
        }
        if (this.f190760C && (li02 = this.field_liveInfo) != null) {
            try {
                contentValues.put("liveInfo", li02.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e2.getMessage());
            }
        }
        if (this.f190761D && (jg12 = this.field_originalInfo) != null) {
            try {
                contentValues.put("originalInfo", jg12.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e3.getMessage());
            }
        }
        if (this.f190762E) {
            contentValues.put("originalFlag", Integer.valueOf(this.field_originalFlag));
        }
        if (this.f190763F) {
            contentValues.put("originalEntranceFlag", Integer.valueOf(this.field_originalEntranceFlag));
        }
        if (this.f190764G && (dr22 = this.field_prepareFinder) != null) {
            try {
                contentValues.put("prepareFinder", dr22.toByteArray());
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e4.getMessage());
            }
        }
        if (this.f190765H) {
            contentValues.put("systemMsgCount", Integer.valueOf(this.field_systemMsgCount));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderAccount", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderAccount ( " + f190753c1.sql + ");");
        for (String add : f190726K) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderAccount", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderAccount", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190753c1, "FinderAccount", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderAccount", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderAccount", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderAccount", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190753c1;
    }

    public String[] getIndexCreateSQL() {
        return f190726K;
    }

    public StorageObserverOwner<C66278y2> getObserverOwner() {
        return f190754d1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f190724I;
    }

    public String getTableName() {
        return f190724I.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f190766d = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f190767e = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f190768f = true;
            }
        }
        if (contentValues.containsKey("avatarUrl")) {
            this.field_avatarUrl = contentValues.getAsString("avatarUrl");
            if (z) {
                this.f190769g = true;
            }
        }
        if (contentValues.containsKey("coverUrl")) {
            this.field_coverUrl = contentValues.getAsString("coverUrl");
            if (z) {
                this.f190770h = true;
            }
        }
        if (contentValues.containsKey("liveCoverImgUrl")) {
            this.field_liveCoverImgUrl = contentValues.getAsString("liveCoverImgUrl");
            if (z) {
                this.f190771i = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z) {
                this.f190772j = true;
            }
        }
        if (contentValues.containsKey("country")) {
            this.field_country = contentValues.getAsString("country");
            if (z) {
                this.f190773n = true;
            }
        }
        if (contentValues.containsKey("province")) {
            this.field_province = contentValues.getAsString("province");
            if (z) {
                this.f190774o = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.field_city = contentValues.getAsString("city");
            if (z) {
                this.f190775p = true;
            }
        }
        if (contentValues.containsKey("userVersion")) {
            this.field_userVersion = contentValues.getAsLong("userVersion").longValue();
            if (z) {
                this.f190776q = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_SEQ)) {
            this.field_seq = contentValues.getAsLong(TPReportKeys.Common.COMMON_SEQ).longValue();
            if (z) {
                this.f190777r = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z) {
                this.f190778s = true;
            }
        }
        if (contentValues.containsKey("fansAddCount")) {
            this.field_fansAddCount = contentValues.getAsInteger("fansAddCount").intValue();
            if (z) {
                this.f190779t = true;
            }
        }
        if (contentValues.containsKey("contact_user_flag")) {
            this.field_contact_user_flag = contentValues.getAsInteger("contact_user_flag").intValue();
            if (z) {
                this.f190780u = true;
            }
        }
        if (contentValues.containsKey("spamStatus")) {
            this.field_spamStatus = contentValues.getAsInteger("spamStatus").intValue();
            if (z) {
                this.f190781v = true;
            }
        }
        if (contentValues.containsKey("authInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("authInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_authInfo = (FinderAuthInfo) new FinderAuthInfo().parseFrom(asByteArray);
                    if (z) {
                        this.f190782w = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e.getMessage());
            }
        }
        if (contentValues.containsKey("finder_version_username_history")) {
            this.field_finder_version_username_history = contentValues.getAsString("finder_version_username_history");
            if (z) {
                this.f190783x = true;
            }
        }
        if (contentValues.containsKey("username_history_version")) {
            this.field_username_history_version = contentValues.getAsInteger("username_history_version").intValue();
            if (z) {
                this.f190784y = true;
            }
        }
        if (contentValues.containsKey("messageLikeBuf")) {
            this.field_messageLikeBuf = contentValues.getAsString("messageLikeBuf");
            if (z) {
                this.f190785z = true;
            }
        }
        if (contentValues.containsKey("messageCommentBuf")) {
            this.field_messageCommentBuf = contentValues.getAsString("messageCommentBuf");
            if (z) {
                this.f190758A = true;
            }
        }
        if (contentValues.containsKey("messageFollowBuf")) {
            this.field_messageFollowBuf = contentValues.getAsString("messageFollowBuf");
            if (z) {
                this.f190759B = true;
            }
        }
        if (contentValues.containsKey("liveInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("liveInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_liveInfo = (C50266li0) new C50266li0().parseFrom(asByteArray2);
                    if (z) {
                        this.f190760C = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e2.getMessage());
            }
        }
        if (contentValues.containsKey("originalInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("originalInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_originalInfo = (C49988jg1) new C49988jg1().parseFrom(asByteArray3);
                    if (z) {
                        this.f190761D = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e3.getMessage());
            }
        }
        if (contentValues.containsKey("originalFlag")) {
            this.field_originalFlag = contentValues.getAsInteger("originalFlag").intValue();
            if (z) {
                this.f190762E = true;
            }
        }
        if (contentValues.containsKey("originalEntranceFlag")) {
            this.field_originalEntranceFlag = contentValues.getAsInteger("originalEntranceFlag").intValue();
            if (z) {
                this.f190763F = true;
            }
        }
        if (contentValues.containsKey("prepareFinder")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("prepareFinder");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_prepareFinder = (C49183dr2) new C49183dr2().parseFrom(asByteArray4);
                    if (z) {
                        this.f190764G = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderAccount", e4.getMessage());
            }
        }
        if (contentValues.containsKey("systemMsgCount")) {
            this.field_systemMsgCount = contentValues.getAsInteger("systemMsgCount").intValue();
            if (z) {
                this.f190765H = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
