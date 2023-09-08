package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import te3.C48915bw0;
import te3.C49182dr0;
import te3.C49512g4;
import te3.C49595gq0;
import te3.C49849ii0;
import te3.C49988jg1;
import te3.C50075k34;
import te3.C51103rg0;
import te3.C64756up2;

/* renamed from: xh.b3 */
public class C66257b3 extends IAutoDBItem {

    /* renamed from: A1 */
    public static final int f190319A1 = 952905519;

    /* renamed from: B1 */
    public static final int f190320B1 = -295787145;

    /* renamed from: C1 */
    public static final int f190321C1 = 100947691;

    /* renamed from: D1 */
    public static final int f190322D1 = -192250423;

    /* renamed from: E1 */
    public static final int f190323E1 = -888513882;

    /* renamed from: F1 */
    public static final int f190324F1 = 339324311;

    /* renamed from: G1 */
    public static final int f190325G1 = -351778248;

    /* renamed from: H1 */
    public static final int f190326H1 = 1219723417;

    /* renamed from: I1 */
    public static final int f190327I1 = 339112800;

    /* renamed from: J1 */
    public static final int f190328J1 = -779346762;

    /* renamed from: K1 */
    public static final int f190329K1 = -1010010610;

    /* renamed from: L1 */
    public static final int f190330L1 = 733727930;

    /* renamed from: M1 */
    public static final int f190331M1 = 1564577309;

    /* renamed from: N1 */
    public static final int f190332N1 = -1557570855;

    /* renamed from: O1 */
    public static final int f190333O1 = -974389197;

    /* renamed from: P1 */
    public static final int f190334P1 = 192180828;

    /* renamed from: Q1 */
    public static final int f190335Q1 = 108705909;

    /* renamed from: R0 */
    public static final SingleTable f190336R0;

    /* renamed from: R1 */
    public static final IAutoDBItem.MAutoDBInfo f190337R1 = initAutoDBInfo(C66257b3.class);

    /* renamed from: S0 */
    public static final String[] f190338S0 = {"CREATE INDEX IF NOT EXISTS FinderContact_username_index ON FinderContact(username)", "CREATE INDEX IF NOT EXISTS FinderContact_follow_flag_index ON FinderContact(follow_Flag)", "CREATE INDEX IF NOT EXISTS FinderContact_user_flag_index ON FinderContact(user_flag)"};

    /* renamed from: S1 */
    public static final StorageObserverOwner<C66257b3> f190339S1 = new StorageObserverOwner<>();

    /* renamed from: T0 */
    public static final int f190340T0 = -265713450;

    /* renamed from: U0 */
    public static final int f190341U0 = 70690926;

    /* renamed from: V0 */
    public static final int f190342V0 = -428646058;

    /* renamed from: W0 */
    public static final int f190343W0 = 351608024;

    /* renamed from: X0 */
    public static final int f190344X0 = -882710593;

    /* renamed from: Y0 */
    public static final int f190345Y0 = 1073584312;

    /* renamed from: Z0 */
    public static final int f190346Z0 = 1595250522;

    /* renamed from: a1 */
    public static final int f190347a1 = -826755845;

    /* renamed from: b1 */
    public static final int f190348b1 = -2027044322;

    /* renamed from: c1 */
    public static final int f190349c1 = -351789940;

    /* renamed from: d1 */
    public static final int f190350d1 = 293230747;

    /* renamed from: e1 */
    public static final int f190351e1 = 1431937654;

    /* renamed from: f1 */
    public static final int f190352f1 = -1306498449;

    /* renamed from: g1 */
    public static final int f190353g1 = 2137566429;

    /* renamed from: h1 */
    public static final int f190354h1 = 2137657887;

    /* renamed from: i1 */
    public static final int f190355i1 = -1306589907;

    /* renamed from: j1 */
    public static final int f190356j1 = -295931082;

    /* renamed from: k1 */
    public static final int f190357k1 = -1163811001;

    /* renamed from: l1 */
    public static final int f190358l1 = -110338125;

    /* renamed from: m1 */
    public static final int f190359m1 = 1484490136;

    /* renamed from: n1 */
    public static final int f190360n1 = 870321150;

    /* renamed from: o1 */
    public static final int f190361o1 = -886171617;

    /* renamed from: p1 */
    public static final int f190362p1 = -858047904;

    /* renamed from: q1 */
    public static final int f190363q1 = -914110772;

    /* renamed from: r1 */
    public static final int f190364r1 = 981051588;

    /* renamed from: s1 */
    public static final int f190365s1 = -525049583;

    /* renamed from: t1 */
    public static final int f190366t1 = -2069988553;

    /* renamed from: u1 */
    public static final int f190367u1 = 1009690709;

    /* renamed from: v1 */
    public static final int f190368v1 = 1043196382;

    /* renamed from: w1 */
    public static final int f190369w1 = -1669771759;

    /* renamed from: x1 */
    public static final int f190370x1 = -896505829;

    /* renamed from: y1 */
    public static final int f190371y1 = -1220540395;

    /* renamed from: z1 */
    public static final int f190372z1 = 1683851177;

    /* renamed from: A */
    public boolean f190373A = true;

    /* renamed from: B */
    public boolean f190374B = true;

    /* renamed from: C */
    public boolean f190375C = true;

    /* renamed from: D */
    public boolean f190376D = true;

    /* renamed from: E */
    public boolean f190377E = true;

    /* renamed from: F */
    public boolean f190378F = true;

    /* renamed from: G */
    public boolean f190379G = true;

    /* renamed from: H */
    public boolean f190380H = true;

    /* renamed from: I */
    public boolean f190381I = true;

    /* renamed from: J */
    public boolean f190382J = true;

    /* renamed from: K */
    public boolean f190383K = true;

    /* renamed from: L */
    public boolean f190384L = true;

    /* renamed from: M */
    public boolean f190385M = true;

    /* renamed from: N */
    public boolean f190386N = true;

    /* renamed from: P */
    public boolean f190387P = true;

    /* renamed from: Q */
    public boolean f190388Q = true;

    /* renamed from: Q0 */
    public boolean f190389Q0 = true;

    /* renamed from: R */
    public boolean f190390R = true;

    /* renamed from: S */
    public boolean f190391S = true;

    /* renamed from: T */
    public boolean f190392T = true;

    /* renamed from: U */
    public boolean f190393U = true;

    /* renamed from: V */
    public boolean f190394V = true;

    /* renamed from: W */
    public boolean f190395W = true;

    /* renamed from: X */
    public boolean f190396X = true;

    /* renamed from: Y */
    public boolean f190397Y = true;

    /* renamed from: Z */
    public boolean f190398Z = true;

    /* renamed from: d */
    public boolean f190399d = true;

    /* renamed from: e */
    public boolean f190400e = true;

    /* renamed from: f */
    public boolean f190401f = true;
    public long field_additionalFlag;
    public C49512g4 field_agencyCollaborateInfo;
    public FinderAuthInfo field_authInfo;
    public String field_avatarUrl;
    public C48915bw0 field_badgeInfoList;
    public C51103rg0 field_bindInfoList;
    public int field_coverEntranceFlag;
    public String field_coverImg;
    public String field_coverUrl;
    public int field_extFlag;
    public C49849ii0 field_extInfo;
    public int field_feedCount;
    public String field_firstPageMD5;
    public int field_followTime;
    public int field_follow_Flag;
    public int field_friendFollowCount;
    public C49595gq0 field_guestInfo;
    public long field_interactionCount;
    public C49182dr0 field_jumpInfoList;
    public String field_liveAlias;
    public long field_liveAnchorStatusFlag;
    public String field_liveCoverImg;
    public long field_liveMicSetting;
    public long field_liveMicSettingSwitch;
    public C64756up2 field_liveRoomImg;
    public int field_liveStatus;
    public long field_liveSwitchFlag;
    public long field_messageStatus;
    public String field_nickname;
    public int field_originalEntranceFlag;
    public int field_originalFlag;
    public C49988jg1 field_originalInfo;
    public long field_personalMsgUpdateTime;
    public String field_pyInitial;
    public String field_rawAvatarUrl;
    public String field_rawNickname;
    public int field_retryCount;
    public long field_rewardTotalAmountInWecoin;
    public C50075k34 field_settlementInfo;
    public String field_signature;
    public int field_source;
    public int field_spamStatus;
    public long field_updateTime;
    public int field_user_flag;
    public int field_user_mode;
    public String field_username;
    public String field_v5username;
    public long field_version;
    public String field_vestNickname;

    /* renamed from: g */
    public boolean f190402g = true;

    /* renamed from: h */
    public boolean f190403h = true;

    /* renamed from: i */
    public boolean f190404i = true;

    /* renamed from: j */
    public boolean f190405j = true;

    /* renamed from: n */
    public boolean f190406n = true;

    /* renamed from: o */
    public boolean f190407o = true;

    /* renamed from: p */
    public boolean f190408p = true;

    /* renamed from: p0 */
    public boolean f190409p0 = true;

    /* renamed from: q */
    public boolean f190410q = true;

    /* renamed from: r */
    public boolean f190411r = true;

    /* renamed from: s */
    public boolean f190412s = true;

    /* renamed from: t */
    public boolean f190413t = true;

    /* renamed from: u */
    public boolean f190414u = true;

    /* renamed from: v */
    public boolean f190415v = true;

    /* renamed from: w */
    public boolean f190416w = true;

    /* renamed from: x */
    public boolean f190417x = true;

    /* renamed from: x0 */
    public boolean f190418x0 = true;

    /* renamed from: y */
    public boolean f190419y = true;

    /* renamed from: y0 */
    public boolean f190420y0 = true;

    /* renamed from: z */
    public boolean f190421z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderContact");
        f190336R0 = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("avatarUrl", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "long", singleTable.getName(), "");
        new Column("firstPageMD5", "string", singleTable.getName(), "");
        new Column("signature", "string", singleTable.getName(), "");
        new Column("follow_Flag", "int", singleTable.getName(), "");
        new Column("pyInitial", "string", singleTable.getName(), "");
        new Column("followTime", "int", singleTable.getName(), "");
        new Column("coverImg", "string", singleTable.getName(), "");
        new Column("spamStatus", "int", singleTable.getName(), "");
        new Column("authInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderAuthInfo");
        new Column("extInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderContactExtraInfo");
        new Column("originalFlag", "int", singleTable.getName(), "");
        new Column("originalInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderOriginalInfo");
        new Column("extFlag", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("retryCount", "int", singleTable.getName(), "");
        new Column("originalEntranceFlag", "int", singleTable.getName(), "");
        new Column("liveCoverImg", "string", singleTable.getName(), "");
        new Column("liveStatus", "int", singleTable.getName(), "");
        new Column("liveAnchorStatusFlag", "long", singleTable.getName(), "");
        new Column("friendFollowCount", "int", singleTable.getName(), "");
        new Column("liveSwitchFlag", "long", singleTable.getName(), "");
        new Column("liveAlias", "string", singleTable.getName(), "");
        new Column("rewardTotalAmountInWecoin", "long", singleTable.getName(), "");
        new Column("personalMsgUpdateTime", "long", singleTable.getName(), "");
        new Column("v5username", "string", singleTable.getName(), "");
        new Column("vestNickname", "string", singleTable.getName(), "");
        new Column("feedCount", "int", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SOURCE, "int", singleTable.getName(), "");
        new Column("liveMicSetting", "long", singleTable.getName(), "");
        new Column("liveMicSettingSwitch", "long", singleTable.getName(), "");
        new Column("badgeInfoList", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderLiveBadgeInfoList");
        new Column("settlementInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.SettleToAgencyRelateInfo");
        new Column("agencyCollaborateInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.AgencyCollaborateInfo");
        new Column("bindInfoList", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderBindInfoList");
        new Column("guestInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderGuestInfo");
        new Column("user_mode", "int", singleTable.getName(), "");
        new Column("coverUrl", "string", singleTable.getName(), "");
        new Column("coverEntranceFlag", "int", singleTable.getName(), "");
        new Column("user_flag", "int", singleTable.getName(), "");
        new Column("rawNickname", "string", singleTable.getName(), "");
        new Column("rawAvatarUrl", "string", singleTable.getName(), "");
        new Column("jumpInfoList", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderJumpInfoList");
        new Column("interactionCount", "long", singleTable.getName(), "");
        new Column("messageStatus", "long", singleTable.getName(), "");
        new Column("additionalFlag", "long", singleTable.getName(), "");
        new Column("liveRoomImg", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LiveRoomImg");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[49];
        String[] strArr = new String[50];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "avatarUrl";
        mAutoDBInfo.colsMap.put("avatarUrl", "TEXT default '' ");
        mAutoDBInfo.columns[3] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "LONG");
        mAutoDBInfo.columns[4] = "firstPageMD5";
        mAutoDBInfo.colsMap.put("firstPageMD5", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "signature";
        mAutoDBInfo.colsMap.put("signature", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "follow_Flag";
        mAutoDBInfo.colsMap.put("follow_Flag", "INTEGER default '0' ");
        mAutoDBInfo.columns[7] = "pyInitial";
        mAutoDBInfo.colsMap.put("pyInitial", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "followTime";
        mAutoDBInfo.colsMap.put("followTime", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "coverImg";
        mAutoDBInfo.colsMap.put("coverImg", "TEXT default '' ");
        mAutoDBInfo.columns[10] = "spamStatus";
        mAutoDBInfo.colsMap.put("spamStatus", "INTEGER");
        mAutoDBInfo.columns[11] = "authInfo";
        mAutoDBInfo.colsMap.put("authInfo", "BLOB");
        mAutoDBInfo.columns[12] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "BLOB");
        mAutoDBInfo.columns[13] = "originalFlag";
        mAutoDBInfo.colsMap.put("originalFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[14] = "originalInfo";
        mAutoDBInfo.colsMap.put("originalInfo", "BLOB");
        mAutoDBInfo.columns[15] = "extFlag";
        mAutoDBInfo.colsMap.put("extFlag", "INTEGER");
        mAutoDBInfo.columns[16] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[17] = "retryCount";
        mAutoDBInfo.colsMap.put("retryCount", "INTEGER");
        mAutoDBInfo.columns[18] = "originalEntranceFlag";
        mAutoDBInfo.colsMap.put("originalEntranceFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[19] = "liveCoverImg";
        mAutoDBInfo.colsMap.put("liveCoverImg", "TEXT default '' ");
        mAutoDBInfo.columns[20] = "liveStatus";
        mAutoDBInfo.colsMap.put("liveStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "liveAnchorStatusFlag";
        mAutoDBInfo.colsMap.put("liveAnchorStatusFlag", "LONG default '0' ");
        mAutoDBInfo.columns[22] = "friendFollowCount";
        mAutoDBInfo.colsMap.put("friendFollowCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[23] = "liveSwitchFlag";
        mAutoDBInfo.colsMap.put("liveSwitchFlag", "LONG default '0' ");
        mAutoDBInfo.columns[24] = "liveAlias";
        mAutoDBInfo.colsMap.put("liveAlias", "TEXT default '' ");
        mAutoDBInfo.columns[25] = "rewardTotalAmountInWecoin";
        mAutoDBInfo.colsMap.put("rewardTotalAmountInWecoin", "LONG default '0' ");
        mAutoDBInfo.columns[26] = "personalMsgUpdateTime";
        mAutoDBInfo.colsMap.put("personalMsgUpdateTime", "LONG");
        mAutoDBInfo.columns[27] = "v5username";
        mAutoDBInfo.colsMap.put("v5username", "TEXT default '' ");
        mAutoDBInfo.columns[28] = "vestNickname";
        mAutoDBInfo.colsMap.put("vestNickname", "TEXT default '' ");
        mAutoDBInfo.columns[29] = "feedCount";
        mAutoDBInfo.colsMap.put("feedCount", "INTEGER default '0' ");
        mAutoDBInfo.columns[30] = FirebaseAnalytics.C113379b.SOURCE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SOURCE, "INTEGER default '0' ");
        mAutoDBInfo.columns[31] = "liveMicSetting";
        mAutoDBInfo.colsMap.put("liveMicSetting", "LONG default '0' ");
        mAutoDBInfo.columns[32] = "liveMicSettingSwitch";
        mAutoDBInfo.colsMap.put("liveMicSettingSwitch", "LONG default '0' ");
        mAutoDBInfo.columns[33] = "badgeInfoList";
        mAutoDBInfo.colsMap.put("badgeInfoList", "BLOB");
        mAutoDBInfo.columns[34] = "settlementInfo";
        mAutoDBInfo.colsMap.put("settlementInfo", "BLOB");
        mAutoDBInfo.columns[35] = "agencyCollaborateInfo";
        mAutoDBInfo.colsMap.put("agencyCollaborateInfo", "BLOB");
        mAutoDBInfo.columns[36] = "bindInfoList";
        mAutoDBInfo.colsMap.put("bindInfoList", "BLOB");
        mAutoDBInfo.columns[37] = "guestInfo";
        mAutoDBInfo.colsMap.put("guestInfo", "BLOB");
        mAutoDBInfo.columns[38] = "user_mode";
        mAutoDBInfo.colsMap.put("user_mode", "INTEGER default '0' ");
        mAutoDBInfo.columns[39] = "coverUrl";
        mAutoDBInfo.colsMap.put("coverUrl", "TEXT default '' ");
        mAutoDBInfo.columns[40] = "coverEntranceFlag";
        mAutoDBInfo.colsMap.put("coverEntranceFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[41] = "user_flag";
        mAutoDBInfo.colsMap.put("user_flag", "INTEGER default '0' ");
        mAutoDBInfo.columns[42] = "rawNickname";
        mAutoDBInfo.colsMap.put("rawNickname", "TEXT default '' ");
        mAutoDBInfo.columns[43] = "rawAvatarUrl";
        mAutoDBInfo.colsMap.put("rawAvatarUrl", "TEXT default '' ");
        mAutoDBInfo.columns[44] = "jumpInfoList";
        mAutoDBInfo.colsMap.put("jumpInfoList", "BLOB");
        mAutoDBInfo.columns[45] = "interactionCount";
        mAutoDBInfo.colsMap.put("interactionCount", "LONG default '0' ");
        mAutoDBInfo.columns[46] = "messageStatus";
        mAutoDBInfo.colsMap.put("messageStatus", "LONG default '0' ");
        mAutoDBInfo.columns[47] = "additionalFlag";
        mAutoDBInfo.colsMap.put("additionalFlag", "LONG default '0' ");
        mAutoDBInfo.columns[48] = "liveRoomImg";
        mAutoDBInfo.colsMap.put("liveRoomImg", "BLOB");
        mAutoDBInfo.columns[49] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  nickname TEXT default '' ,  avatarUrl TEXT default '' ,  version LONG,  firstPageMD5 TEXT default '' ,  signature TEXT default '' ,  follow_Flag INTEGER default '0' ,  pyInitial TEXT default '' ,  followTime INTEGER default '0' ,  coverImg TEXT default '' ,  spamStatus INTEGER,  authInfo BLOB,  extInfo BLOB,  originalFlag INTEGER default '0' ,  originalInfo BLOB,  extFlag INTEGER,  updateTime LONG,  retryCount INTEGER,  originalEntranceFlag INTEGER default '0' ,  liveCoverImg TEXT default '' ,  liveStatus INTEGER default '0' ,  liveAnchorStatusFlag LONG default '0' ,  friendFollowCount INTEGER default '0' ,  liveSwitchFlag LONG default '0' ,  liveAlias TEXT default '' ,  rewardTotalAmountInWecoin LONG default '0' ,  personalMsgUpdateTime LONG,  v5username TEXT default '' ,  vestNickname TEXT default '' ,  feedCount INTEGER default '0' ,  source INTEGER default '0' ,  liveMicSetting LONG default '0' ,  liveMicSettingSwitch LONG default '0' ,  badgeInfoList BLOB,  settlementInfo BLOB,  agencyCollaborateInfo BLOB,  bindInfoList BLOB,  guestInfo BLOB,  user_mode INTEGER default '0' ,  coverUrl TEXT default '' ,  coverEntranceFlag INTEGER default '0' ,  user_flag INTEGER default '0' ,  rawNickname TEXT default '' ,  rawAvatarUrl TEXT default '' ,  jumpInfoList BLOB,  interactionCount LONG default '0' ,  messageStatus LONG default '0' ,  additionalFlag LONG default '0' ,  liveRoomImg BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66257b3)) {
            return false;
        }
        C66257b3 b3Var = (C66257b3) iAutoDBItem;
        return C46238a.m51546a(this.field_username, b3Var.field_username) && C46238a.m51546a(this.field_nickname, b3Var.field_nickname) && C46238a.m51546a(this.field_avatarUrl, b3Var.field_avatarUrl) && C46238a.m51546a(Long.valueOf(this.field_version), Long.valueOf(b3Var.field_version)) && C46238a.m51546a(this.field_firstPageMD5, b3Var.field_firstPageMD5) && C46238a.m51546a(this.field_signature, b3Var.field_signature) && C46238a.m51546a(Integer.valueOf(this.field_follow_Flag), Integer.valueOf(b3Var.field_follow_Flag)) && C46238a.m51546a(this.field_pyInitial, b3Var.field_pyInitial) && C46238a.m51546a(Integer.valueOf(this.field_followTime), Integer.valueOf(b3Var.field_followTime)) && C46238a.m51546a(this.field_coverImg, b3Var.field_coverImg) && C46238a.m51546a(Integer.valueOf(this.field_spamStatus), Integer.valueOf(b3Var.field_spamStatus)) && C46238a.m51546a(this.field_authInfo, b3Var.field_authInfo) && C46238a.m51546a(this.field_extInfo, b3Var.field_extInfo) && C46238a.m51546a(Integer.valueOf(this.field_originalFlag), Integer.valueOf(b3Var.field_originalFlag)) && C46238a.m51546a(this.field_originalInfo, b3Var.field_originalInfo) && C46238a.m51546a(Integer.valueOf(this.field_extFlag), Integer.valueOf(b3Var.field_extFlag)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(b3Var.field_updateTime)) && C46238a.m51546a(Integer.valueOf(this.field_retryCount), Integer.valueOf(b3Var.field_retryCount)) && C46238a.m51546a(Integer.valueOf(this.field_originalEntranceFlag), Integer.valueOf(b3Var.field_originalEntranceFlag)) && C46238a.m51546a(this.field_liveCoverImg, b3Var.field_liveCoverImg) && C46238a.m51546a(Integer.valueOf(this.field_liveStatus), Integer.valueOf(b3Var.field_liveStatus)) && C46238a.m51546a(Long.valueOf(this.field_liveAnchorStatusFlag), Long.valueOf(b3Var.field_liveAnchorStatusFlag)) && C46238a.m51546a(Integer.valueOf(this.field_friendFollowCount), Integer.valueOf(b3Var.field_friendFollowCount)) && C46238a.m51546a(Long.valueOf(this.field_liveSwitchFlag), Long.valueOf(b3Var.field_liveSwitchFlag)) && C46238a.m51546a(this.field_liveAlias, b3Var.field_liveAlias) && C46238a.m51546a(Long.valueOf(this.field_rewardTotalAmountInWecoin), Long.valueOf(b3Var.field_rewardTotalAmountInWecoin)) && C46238a.m51546a(Long.valueOf(this.field_personalMsgUpdateTime), Long.valueOf(b3Var.field_personalMsgUpdateTime)) && C46238a.m51546a(this.field_v5username, b3Var.field_v5username) && C46238a.m51546a(this.field_vestNickname, b3Var.field_vestNickname) && C46238a.m51546a(Integer.valueOf(this.field_feedCount), Integer.valueOf(b3Var.field_feedCount)) && C46238a.m51546a(Integer.valueOf(this.field_source), Integer.valueOf(b3Var.field_source)) && C46238a.m51546a(Long.valueOf(this.field_liveMicSetting), Long.valueOf(b3Var.field_liveMicSetting)) && C46238a.m51546a(Long.valueOf(this.field_liveMicSettingSwitch), Long.valueOf(b3Var.field_liveMicSettingSwitch)) && C46238a.m51546a(this.field_badgeInfoList, b3Var.field_badgeInfoList) && C46238a.m51546a(this.field_settlementInfo, b3Var.field_settlementInfo) && C46238a.m51546a(this.field_agencyCollaborateInfo, b3Var.field_agencyCollaborateInfo) && C46238a.m51546a(this.field_bindInfoList, b3Var.field_bindInfoList) && C46238a.m51546a(this.field_guestInfo, b3Var.field_guestInfo) && C46238a.m51546a(Integer.valueOf(this.field_user_mode), Integer.valueOf(b3Var.field_user_mode)) && C46238a.m51546a(this.field_coverUrl, b3Var.field_coverUrl) && C46238a.m51546a(Integer.valueOf(this.field_coverEntranceFlag), Integer.valueOf(b3Var.field_coverEntranceFlag)) && C46238a.m51546a(Integer.valueOf(this.field_user_flag), Integer.valueOf(b3Var.field_user_flag)) && C46238a.m51546a(this.field_rawNickname, b3Var.field_rawNickname) && C46238a.m51546a(this.field_rawAvatarUrl, b3Var.field_rawAvatarUrl) && C46238a.m51546a(this.field_jumpInfoList, b3Var.field_jumpInfoList) && C46238a.m51546a(Long.valueOf(this.field_interactionCount), Long.valueOf(b3Var.field_interactionCount)) && C46238a.m51546a(Long.valueOf(this.field_messageStatus), Long.valueOf(b3Var.field_messageStatus)) && C46238a.m51546a(Long.valueOf(this.field_additionalFlag), Long.valueOf(b3Var.field_additionalFlag)) && C46238a.m51546a(this.field_liveRoomImg, b3Var.field_liveRoomImg);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190340T0 == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f190399d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190341U0 == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190342V0 == hashCode) {
                    try {
                        this.field_avatarUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190343W0 == hashCode) {
                    try {
                        this.field_version = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190344X0 == hashCode) {
                    try {
                        this.field_firstPageMD5 = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190345Y0 == hashCode) {
                    try {
                        this.field_signature = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190346Z0 == hashCode) {
                    try {
                        this.field_follow_Flag = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190347a1 == hashCode) {
                    try {
                        this.field_pyInitial = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190348b1 == hashCode) {
                    try {
                        this.field_followTime = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190349c1 == hashCode) {
                    try {
                        this.field_coverImg = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190350d1 == hashCode) {
                    try {
                        this.field_spamStatus = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190351e1 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_authInfo = (FinderAuthInfo) new FinderAuthInfo().parseFrom(blob);
                        }
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190352f1 == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_extInfo = (C49849ii0) new C49849ii0().parseFrom(blob2);
                        }
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190353g1 == hashCode) {
                    try {
                        this.field_originalFlag = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190354h1 == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_originalInfo = (C49988jg1) new C49988jg1().parseFrom(blob3);
                        }
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190355i1 == hashCode) {
                    try {
                        this.field_extFlag = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190356j1 == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190357k1 == hashCode) {
                    try {
                        this.field_retryCount = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190358l1 == hashCode) {
                    try {
                        this.field_originalEntranceFlag = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190359m1 == hashCode) {
                    try {
                        this.field_liveCoverImg = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190360n1 == hashCode) {
                    try {
                        this.field_liveStatus = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190361o1 == hashCode) {
                    try {
                        this.field_liveAnchorStatusFlag = cursor.getLong(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190362p1 == hashCode) {
                    try {
                        this.field_friendFollowCount = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190363q1 == hashCode) {
                    try {
                        this.field_liveSwitchFlag = cursor.getLong(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190364r1 == hashCode) {
                    try {
                        this.field_liveAlias = cursor.getString(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190365s1 == hashCode) {
                    try {
                        this.field_rewardTotalAmountInWecoin = cursor.getLong(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190366t1 == hashCode) {
                    try {
                        this.field_personalMsgUpdateTime = cursor.getLong(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190367u1 == hashCode) {
                    try {
                        this.field_v5username = cursor.getString(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190368v1 == hashCode) {
                    try {
                        this.field_vestNickname = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190369w1 == hashCode) {
                    try {
                        this.field_feedCount = cursor.getInt(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190370x1 == hashCode) {
                    try {
                        this.field_source = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190371y1 == hashCode) {
                    try {
                        this.field_liveMicSetting = cursor.getLong(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190372z1 == hashCode) {
                    try {
                        this.field_liveMicSettingSwitch = cursor.getLong(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190319A1 == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_badgeInfoList = (C48915bw0) new C48915bw0().parseFrom(blob4);
                        }
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190320B1 == hashCode) {
                    try {
                        byte[] blob5 = cursor.getBlob(i);
                        if (blob5 != null && blob5.length > 0) {
                            this.field_settlementInfo = (C50075k34) new C50075k34().parseFrom(blob5);
                        }
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190321C1 == hashCode) {
                    try {
                        byte[] blob6 = cursor.getBlob(i);
                        if (blob6 != null && blob6.length > 0) {
                            this.field_agencyCollaborateInfo = (C49512g4) new C49512g4().parseFrom(blob6);
                        }
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190322D1 == hashCode) {
                    try {
                        byte[] blob7 = cursor.getBlob(i);
                        if (blob7 != null && blob7.length > 0) {
                            this.field_bindInfoList = (C51103rg0) new C51103rg0().parseFrom(blob7);
                        }
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190323E1 == hashCode) {
                    try {
                        byte[] blob8 = cursor.getBlob(i);
                        if (blob8 != null && blob8.length > 0) {
                            this.field_guestInfo = (C49595gq0) new C49595gq0().parseFrom(blob8);
                        }
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190324F1 == hashCode) {
                    try {
                        this.field_user_mode = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190325G1 == hashCode) {
                    try {
                        this.field_coverUrl = cursor.getString(i);
                    } catch (Throwable th42) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th42, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190326H1 == hashCode) {
                    try {
                        this.field_coverEntranceFlag = cursor.getInt(i);
                    } catch (Throwable th43) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th43, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190327I1 == hashCode) {
                    try {
                        this.field_user_flag = cursor.getInt(i);
                    } catch (Throwable th44) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th44, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190328J1 == hashCode) {
                    try {
                        this.field_rawNickname = cursor.getString(i);
                    } catch (Throwable th45) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th45, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190329K1 == hashCode) {
                    try {
                        this.field_rawAvatarUrl = cursor.getString(i);
                    } catch (Throwable th46) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th46, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190330L1 == hashCode) {
                    try {
                        byte[] blob9 = cursor.getBlob(i);
                        if (blob9 != null && blob9.length > 0) {
                            this.field_jumpInfoList = (C49182dr0) new C49182dr0().parseFrom(blob9);
                        }
                    } catch (Throwable th47) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th47, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190331M1 == hashCode) {
                    try {
                        this.field_interactionCount = cursor.getLong(i);
                    } catch (Throwable th48) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th48, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190332N1 == hashCode) {
                    try {
                        this.field_messageStatus = cursor.getLong(i);
                    } catch (Throwable th49) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th49, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190333O1 == hashCode) {
                    try {
                        this.field_additionalFlag = cursor.getLong(i);
                    } catch (Throwable th50) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th50, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190334P1 == hashCode) {
                    try {
                        byte[] blob10 = cursor.getBlob(i);
                        if (blob10 != null && blob10.length > 0) {
                            this.field_liveRoomImg = (C64756up2) new C64756up2().parseFrom(blob10);
                        }
                    } catch (Throwable th51) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderContact", th51, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190335Q1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64756up2 up22;
        C49182dr0 dr02;
        C49595gq0 gq02;
        C51103rg0 rg02;
        C49512g4 g4Var;
        C50075k34 k342;
        C48915bw0 bw02;
        C49988jg1 jg12;
        C49849ii0 ii02;
        FinderAuthInfo finderAuthInfo;
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f190399d) {
            contentValues.put("username", this.field_username);
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f190400e) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_avatarUrl == null) {
            this.field_avatarUrl = "";
        }
        if (this.f190401f) {
            contentValues.put("avatarUrl", this.field_avatarUrl);
        }
        if (this.f190402g) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Long.valueOf(this.field_version));
        }
        if (this.field_firstPageMD5 == null) {
            this.field_firstPageMD5 = "";
        }
        if (this.f190403h) {
            contentValues.put("firstPageMD5", this.field_firstPageMD5);
        }
        if (this.field_signature == null) {
            this.field_signature = "";
        }
        if (this.f190404i) {
            contentValues.put("signature", this.field_signature);
        }
        if (this.f190405j) {
            contentValues.put("follow_Flag", Integer.valueOf(this.field_follow_Flag));
        }
        if (this.field_pyInitial == null) {
            this.field_pyInitial = "";
        }
        if (this.f190406n) {
            contentValues.put("pyInitial", this.field_pyInitial);
        }
        if (this.f190407o) {
            contentValues.put("followTime", Integer.valueOf(this.field_followTime));
        }
        if (this.field_coverImg == null) {
            this.field_coverImg = "";
        }
        if (this.f190408p) {
            contentValues.put("coverImg", this.field_coverImg);
        }
        if (this.f190410q) {
            contentValues.put("spamStatus", Integer.valueOf(this.field_spamStatus));
        }
        if (this.f190411r && (finderAuthInfo = this.field_authInfo) != null) {
            try {
                contentValues.put("authInfo", finderAuthInfo.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e.getMessage());
            }
        }
        if (this.f190412s && (ii02 = this.field_extInfo) != null) {
            try {
                contentValues.put("extInfo", ii02.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e2.getMessage());
            }
        }
        if (this.f190413t) {
            contentValues.put("originalFlag", Integer.valueOf(this.field_originalFlag));
        }
        if (this.f190414u && (jg12 = this.field_originalInfo) != null) {
            try {
                contentValues.put("originalInfo", jg12.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e3.getMessage());
            }
        }
        if (this.f190415v) {
            contentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
        }
        if (this.f190416w) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f190417x) {
            contentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
        }
        if (this.f190419y) {
            contentValues.put("originalEntranceFlag", Integer.valueOf(this.field_originalEntranceFlag));
        }
        if (this.field_liveCoverImg == null) {
            this.field_liveCoverImg = "";
        }
        if (this.f190421z) {
            contentValues.put("liveCoverImg", this.field_liveCoverImg);
        }
        if (this.f190373A) {
            contentValues.put("liveStatus", Integer.valueOf(this.field_liveStatus));
        }
        if (this.f190374B) {
            contentValues.put("liveAnchorStatusFlag", Long.valueOf(this.field_liveAnchorStatusFlag));
        }
        if (this.f190375C) {
            contentValues.put("friendFollowCount", Integer.valueOf(this.field_friendFollowCount));
        }
        if (this.f190376D) {
            contentValues.put("liveSwitchFlag", Long.valueOf(this.field_liveSwitchFlag));
        }
        if (this.field_liveAlias == null) {
            this.field_liveAlias = "";
        }
        if (this.f190377E) {
            contentValues.put("liveAlias", this.field_liveAlias);
        }
        if (this.f190378F) {
            contentValues.put("rewardTotalAmountInWecoin", Long.valueOf(this.field_rewardTotalAmountInWecoin));
        }
        if (this.f190379G) {
            contentValues.put("personalMsgUpdateTime", Long.valueOf(this.field_personalMsgUpdateTime));
        }
        if (this.field_v5username == null) {
            this.field_v5username = "";
        }
        if (this.f190380H) {
            contentValues.put("v5username", this.field_v5username);
        }
        if (this.field_vestNickname == null) {
            this.field_vestNickname = "";
        }
        if (this.f190381I) {
            contentValues.put("vestNickname", this.field_vestNickname);
        }
        if (this.f190382J) {
            contentValues.put("feedCount", Integer.valueOf(this.field_feedCount));
        }
        if (this.f190383K) {
            contentValues.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.field_source));
        }
        if (this.f190384L) {
            contentValues.put("liveMicSetting", Long.valueOf(this.field_liveMicSetting));
        }
        if (this.f190385M) {
            contentValues.put("liveMicSettingSwitch", Long.valueOf(this.field_liveMicSettingSwitch));
        }
        if (this.f190386N && (bw02 = this.field_badgeInfoList) != null) {
            try {
                contentValues.put("badgeInfoList", bw02.toByteArray());
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e4.getMessage());
            }
        }
        if (this.f190387P && (k342 = this.field_settlementInfo) != null) {
            try {
                contentValues.put("settlementInfo", k342.toByteArray());
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e5.getMessage());
            }
        }
        if (this.f190388Q && (g4Var = this.field_agencyCollaborateInfo) != null) {
            try {
                contentValues.put("agencyCollaborateInfo", g4Var.toByteArray());
            } catch (IOException e6) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e6.getMessage());
            }
        }
        if (this.f190390R && (rg02 = this.field_bindInfoList) != null) {
            try {
                contentValues.put("bindInfoList", rg02.toByteArray());
            } catch (IOException e7) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e7.getMessage());
            }
        }
        if (this.f190391S && (gq02 = this.field_guestInfo) != null) {
            try {
                contentValues.put("guestInfo", gq02.toByteArray());
            } catch (IOException e8) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e8.getMessage());
            }
        }
        if (this.f190392T) {
            contentValues.put("user_mode", Integer.valueOf(this.field_user_mode));
        }
        if (this.field_coverUrl == null) {
            this.field_coverUrl = "";
        }
        if (this.f190393U) {
            contentValues.put("coverUrl", this.field_coverUrl);
        }
        if (this.f190394V) {
            contentValues.put("coverEntranceFlag", Integer.valueOf(this.field_coverEntranceFlag));
        }
        if (this.f190395W) {
            contentValues.put("user_flag", Integer.valueOf(this.field_user_flag));
        }
        if (this.field_rawNickname == null) {
            this.field_rawNickname = "";
        }
        if (this.f190396X) {
            contentValues.put("rawNickname", this.field_rawNickname);
        }
        if (this.field_rawAvatarUrl == null) {
            this.field_rawAvatarUrl = "";
        }
        if (this.f190397Y) {
            contentValues.put("rawAvatarUrl", this.field_rawAvatarUrl);
        }
        if (this.f190398Z && (dr02 = this.field_jumpInfoList) != null) {
            try {
                contentValues.put("jumpInfoList", dr02.toByteArray());
            } catch (IOException e9) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e9.getMessage());
            }
        }
        if (this.f190409p0) {
            contentValues.put("interactionCount", Long.valueOf(this.field_interactionCount));
        }
        if (this.f190418x0) {
            contentValues.put("messageStatus", Long.valueOf(this.field_messageStatus));
        }
        if (this.f190420y0) {
            contentValues.put("additionalFlag", Long.valueOf(this.field_additionalFlag));
        }
        if (this.f190389Q0 && (up22 = this.field_liveRoomImg) != null) {
            try {
                contentValues.put("liveRoomImg", up22.toByteArray());
            } catch (IOException e15) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e15.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderContact ( " + f190337R1.sql + ");");
        for (String add : f190338S0) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190337R1, "FinderContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190337R1;
    }

    public String[] getIndexCreateSQL() {
        return f190338S0;
    }

    public StorageObserverOwner<C66257b3> getObserverOwner() {
        return f190339S1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f190336R0;
    }

    public String getTableName() {
        return f190336R0.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f190399d = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f190400e = true;
            }
        }
        if (contentValues.containsKey("avatarUrl")) {
            this.field_avatarUrl = contentValues.getAsString("avatarUrl");
            if (z) {
                this.f190401f = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsLong(ProviderConstants.API_COLNAME_FEATURE_VERSION).longValue();
            if (z) {
                this.f190402g = true;
            }
        }
        if (contentValues.containsKey("firstPageMD5")) {
            this.field_firstPageMD5 = contentValues.getAsString("firstPageMD5");
            if (z) {
                this.f190403h = true;
            }
        }
        if (contentValues.containsKey("signature")) {
            this.field_signature = contentValues.getAsString("signature");
            if (z) {
                this.f190404i = true;
            }
        }
        if (contentValues.containsKey("follow_Flag")) {
            this.field_follow_Flag = contentValues.getAsInteger("follow_Flag").intValue();
            if (z) {
                this.f190405j = true;
            }
        }
        if (contentValues.containsKey("pyInitial")) {
            this.field_pyInitial = contentValues.getAsString("pyInitial");
            if (z) {
                this.f190406n = true;
            }
        }
        if (contentValues.containsKey("followTime")) {
            this.field_followTime = contentValues.getAsInteger("followTime").intValue();
            if (z) {
                this.f190407o = true;
            }
        }
        if (contentValues.containsKey("coverImg")) {
            this.field_coverImg = contentValues.getAsString("coverImg");
            if (z) {
                this.f190408p = true;
            }
        }
        if (contentValues.containsKey("spamStatus")) {
            this.field_spamStatus = contentValues.getAsInteger("spamStatus").intValue();
            if (z) {
                this.f190410q = true;
            }
        }
        if (contentValues.containsKey("authInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("authInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_authInfo = (FinderAuthInfo) new FinderAuthInfo().parseFrom(asByteArray);
                    if (z) {
                        this.f190411r = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e.getMessage());
            }
        }
        if (contentValues.containsKey("extInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("extInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_extInfo = (C49849ii0) new C49849ii0().parseFrom(asByteArray2);
                    if (z) {
                        this.f190412s = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e2.getMessage());
            }
        }
        if (contentValues.containsKey("originalFlag")) {
            this.field_originalFlag = contentValues.getAsInteger("originalFlag").intValue();
            if (z) {
                this.f190413t = true;
            }
        }
        if (contentValues.containsKey("originalInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("originalInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_originalInfo = (C49988jg1) new C49988jg1().parseFrom(asByteArray3);
                    if (z) {
                        this.f190414u = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e3.getMessage());
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z) {
                this.f190415v = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f190416w = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.field_retryCount = contentValues.getAsInteger("retryCount").intValue();
            if (z) {
                this.f190417x = true;
            }
        }
        if (contentValues.containsKey("originalEntranceFlag")) {
            this.field_originalEntranceFlag = contentValues.getAsInteger("originalEntranceFlag").intValue();
            if (z) {
                this.f190419y = true;
            }
        }
        if (contentValues.containsKey("liveCoverImg")) {
            this.field_liveCoverImg = contentValues.getAsString("liveCoverImg");
            if (z) {
                this.f190421z = true;
            }
        }
        if (contentValues.containsKey("liveStatus")) {
            this.field_liveStatus = contentValues.getAsInteger("liveStatus").intValue();
            if (z) {
                this.f190373A = true;
            }
        }
        if (contentValues.containsKey("liveAnchorStatusFlag")) {
            this.field_liveAnchorStatusFlag = contentValues.getAsLong("liveAnchorStatusFlag").longValue();
            if (z) {
                this.f190374B = true;
            }
        }
        if (contentValues.containsKey("friendFollowCount")) {
            this.field_friendFollowCount = contentValues.getAsInteger("friendFollowCount").intValue();
            if (z) {
                this.f190375C = true;
            }
        }
        if (contentValues.containsKey("liveSwitchFlag")) {
            this.field_liveSwitchFlag = contentValues.getAsLong("liveSwitchFlag").longValue();
            if (z) {
                this.f190376D = true;
            }
        }
        if (contentValues.containsKey("liveAlias")) {
            this.field_liveAlias = contentValues.getAsString("liveAlias");
            if (z) {
                this.f190377E = true;
            }
        }
        if (contentValues.containsKey("rewardTotalAmountInWecoin")) {
            this.field_rewardTotalAmountInWecoin = contentValues.getAsLong("rewardTotalAmountInWecoin").longValue();
            if (z) {
                this.f190378F = true;
            }
        }
        if (contentValues.containsKey("personalMsgUpdateTime")) {
            this.field_personalMsgUpdateTime = contentValues.getAsLong("personalMsgUpdateTime").longValue();
            if (z) {
                this.f190379G = true;
            }
        }
        if (contentValues.containsKey("v5username")) {
            this.field_v5username = contentValues.getAsString("v5username");
            if (z) {
                this.f190380H = true;
            }
        }
        if (contentValues.containsKey("vestNickname")) {
            this.field_vestNickname = contentValues.getAsString("vestNickname");
            if (z) {
                this.f190381I = true;
            }
        }
        if (contentValues.containsKey("feedCount")) {
            this.field_feedCount = contentValues.getAsInteger("feedCount").intValue();
            if (z) {
                this.f190382J = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SOURCE)) {
            this.field_source = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SOURCE).intValue();
            if (z) {
                this.f190383K = true;
            }
        }
        if (contentValues.containsKey("liveMicSetting")) {
            this.field_liveMicSetting = contentValues.getAsLong("liveMicSetting").longValue();
            if (z) {
                this.f190384L = true;
            }
        }
        if (contentValues.containsKey("liveMicSettingSwitch")) {
            this.field_liveMicSettingSwitch = contentValues.getAsLong("liveMicSettingSwitch").longValue();
            if (z) {
                this.f190385M = true;
            }
        }
        if (contentValues.containsKey("badgeInfoList")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("badgeInfoList");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_badgeInfoList = (C48915bw0) new C48915bw0().parseFrom(asByteArray4);
                    if (z) {
                        this.f190386N = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e4.getMessage());
            }
        }
        if (contentValues.containsKey("settlementInfo")) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray("settlementInfo");
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_settlementInfo = (C50075k34) new C50075k34().parseFrom(asByteArray5);
                    if (z) {
                        this.f190387P = true;
                    }
                }
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e5.getMessage());
            }
        }
        if (contentValues.containsKey("agencyCollaborateInfo")) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray("agencyCollaborateInfo");
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.field_agencyCollaborateInfo = (C49512g4) new C49512g4().parseFrom(asByteArray6);
                    if (z) {
                        this.f190388Q = true;
                    }
                }
            } catch (IOException e6) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e6.getMessage());
            }
        }
        if (contentValues.containsKey("bindInfoList")) {
            try {
                byte[] asByteArray7 = contentValues.getAsByteArray("bindInfoList");
                if (asByteArray7 != null && asByteArray7.length > 0) {
                    this.field_bindInfoList = (C51103rg0) new C51103rg0().parseFrom(asByteArray7);
                    if (z) {
                        this.f190390R = true;
                    }
                }
            } catch (IOException e7) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e7.getMessage());
            }
        }
        if (contentValues.containsKey("guestInfo")) {
            try {
                byte[] asByteArray8 = contentValues.getAsByteArray("guestInfo");
                if (asByteArray8 != null && asByteArray8.length > 0) {
                    this.field_guestInfo = (C49595gq0) new C49595gq0().parseFrom(asByteArray8);
                    if (z) {
                        this.f190391S = true;
                    }
                }
            } catch (IOException e8) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e8.getMessage());
            }
        }
        if (contentValues.containsKey("user_mode")) {
            this.field_user_mode = contentValues.getAsInteger("user_mode").intValue();
            if (z) {
                this.f190392T = true;
            }
        }
        if (contentValues.containsKey("coverUrl")) {
            this.field_coverUrl = contentValues.getAsString("coverUrl");
            if (z) {
                this.f190393U = true;
            }
        }
        if (contentValues.containsKey("coverEntranceFlag")) {
            this.field_coverEntranceFlag = contentValues.getAsInteger("coverEntranceFlag").intValue();
            if (z) {
                this.f190394V = true;
            }
        }
        if (contentValues.containsKey("user_flag")) {
            this.field_user_flag = contentValues.getAsInteger("user_flag").intValue();
            if (z) {
                this.f190395W = true;
            }
        }
        if (contentValues.containsKey("rawNickname")) {
            this.field_rawNickname = contentValues.getAsString("rawNickname");
            if (z) {
                this.f190396X = true;
            }
        }
        if (contentValues.containsKey("rawAvatarUrl")) {
            this.field_rawAvatarUrl = contentValues.getAsString("rawAvatarUrl");
            if (z) {
                this.f190397Y = true;
            }
        }
        if (contentValues.containsKey("jumpInfoList")) {
            try {
                byte[] asByteArray9 = contentValues.getAsByteArray("jumpInfoList");
                if (asByteArray9 != null && asByteArray9.length > 0) {
                    this.field_jumpInfoList = (C49182dr0) new C49182dr0().parseFrom(asByteArray9);
                    if (z) {
                        this.f190398Z = true;
                    }
                }
            } catch (IOException e9) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e9.getMessage());
            }
        }
        if (contentValues.containsKey("interactionCount")) {
            this.field_interactionCount = contentValues.getAsLong("interactionCount").longValue();
            if (z) {
                this.f190409p0 = true;
            }
        }
        if (contentValues.containsKey("messageStatus")) {
            this.field_messageStatus = contentValues.getAsLong("messageStatus").longValue();
            if (z) {
                this.f190418x0 = true;
            }
        }
        if (contentValues.containsKey("additionalFlag")) {
            this.field_additionalFlag = contentValues.getAsLong("additionalFlag").longValue();
            if (z) {
                this.f190420y0 = true;
            }
        }
        if (contentValues.containsKey("liveRoomImg")) {
            try {
                byte[] asByteArray10 = contentValues.getAsByteArray("liveRoomImg");
                if (asByteArray10 != null && asByteArray10.length > 0) {
                    this.field_liveRoomImg = (C64756up2) new C64756up2().parseFrom(asByteArray10);
                    if (z) {
                        this.f190389Q0 = true;
                    }
                }
            } catch (IOException e15) {
                Log.m105920e("MicroMsg.SDK.BaseFinderContact", e15.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
