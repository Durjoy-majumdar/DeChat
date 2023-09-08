package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
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
import te3.C64312dc1;
import te3.C64392gc1;
import te3.C64580ne1;
import te3.C64829xh0;

/* renamed from: xh.d3 */
public class C66258d3 extends IAutoDBItem {

    /* renamed from: Q0 */
    public static final int f190422Q0 = 90495162;

    /* renamed from: R0 */
    public static final int f190423R0 = -1495016486;

    /* renamed from: S0 */
    public static final int f190424S0 = 3145580;

    /* renamed from: T0 */
    public static final int f190425T0 = 1197201510;

    /* renamed from: U */
    public static final SingleTable f190426U;

    /* renamed from: U0 */
    public static final int f190427U0 = -1306589907;

    /* renamed from: V */
    public static final String[] f190428V = {"CREATE INDEX IF NOT EXISTS Finder_Mention_Type ON FinderDbMention(type)", "CREATE INDEX IF NOT EXISTS Finder_Object_Id ON FinderDbMention(objectId)", "CREATE INDEX IF NOT EXISTS Finder_Comment_Id ON FinderDbMention(commentId)", "CREATE INDEX IF NOT EXISTS FinderDbMention_Username ON FinderDbMention(finderUserName)"};

    /* renamed from: V0 */
    public static final int f190429V0 = 2140463422;

    /* renamed from: W */
    public static final int f190430W = 795292527;

    /* renamed from: W0 */
    public static final int f190431W0 = -1724546052;

    /* renamed from: X */
    public static final int f190432X = 70690926;

    /* renamed from: X0 */
    public static final int f190433X0 = -1039689911;

    /* renamed from: Y */
    public static final int f190434Y = 3575610;

    /* renamed from: Y0 */
    public static final int f190435Y0 = 1960402397;

    /* renamed from: Z */
    public static final int f190436Z = 951530617;

    /* renamed from: Z0 */
    public static final int f190437Z0 = -1998160523;

    /* renamed from: a1 */
    public static final int f190438a1 = -1362583253;

    /* renamed from: b1 */
    public static final int f190439b1 = 49741453;

    /* renamed from: c1 */
    public static final int f190440c1 = -265713450;

    /* renamed from: d1 */
    public static final int f190441d1 = 951526432;

    /* renamed from: e1 */
    public static final int f190442e1 = 1303670230;

    /* renamed from: f1 */
    public static final int f190443f1 = 1474963960;

    /* renamed from: g1 */
    public static final int f190444g1 = -1870656739;

    /* renamed from: h1 */
    public static final int f190445h1 = -190343311;

    /* renamed from: i1 */
    public static final int f190446i1 = 301800620;

    /* renamed from: j1 */
    public static final int f190447j1 = 1066856217;

    /* renamed from: k1 */
    public static final int f190448k1 = 167765122;

    /* renamed from: l1 */
    public static final int f190449l1 = 1839575651;

    /* renamed from: m1 */
    public static final int f190450m1 = -1102762222;

    /* renamed from: n1 */
    public static final int f190451n1 = -1281822469;

    /* renamed from: o1 */
    public static final int f190452o1 = -1053894635;

    /* renamed from: p0 */
    public static final int f190453p0 = 1369213417;

    /* renamed from: p1 */
    public static final int f190454p1 = 1102778225;

    /* renamed from: q1 */
    public static final int f190455q1 = 2011848533;

    /* renamed from: r1 */
    public static final int f190456r1 = -262758570;

    /* renamed from: s1 */
    public static final int f190457s1 = -1306498449;

    /* renamed from: t1 */
    public static final int f190458t1 = -97287434;

    /* renamed from: u1 */
    public static final int f190459u1 = -1523625156;

    /* renamed from: v1 */
    public static final int f190460v1 = -2027458883;

    /* renamed from: w1 */
    public static final int f190461w1 = 108705909;

    /* renamed from: x0 */
    public static final int f190462x0 = 1566917561;

    /* renamed from: x1 */
    public static final IAutoDBItem.MAutoDBInfo f190463x1 = initAutoDBInfo(C66258d3.class);

    /* renamed from: y0 */
    public static final int f190464y0 = 3355;

    /* renamed from: y1 */
    public static final StorageObserverOwner<C66258d3> f190465y1 = new StorageObserverOwner<>();

    /* renamed from: A */
    public boolean f190466A = true;

    /* renamed from: B */
    public boolean f190467B = true;

    /* renamed from: C */
    public boolean f190468C = true;

    /* renamed from: D */
    public boolean f190469D = true;

    /* renamed from: E */
    public boolean f190470E = true;

    /* renamed from: F */
    public boolean f190471F = true;

    /* renamed from: G */
    public boolean f190472G = true;

    /* renamed from: H */
    public boolean f190473H = true;

    /* renamed from: I */
    public boolean f190474I = true;

    /* renamed from: J */
    public boolean f190475J = true;

    /* renamed from: K */
    public boolean f190476K = true;

    /* renamed from: L */
    public boolean f190477L = true;

    /* renamed from: M */
    public boolean f190478M = true;

    /* renamed from: N */
    public boolean f190479N = true;

    /* renamed from: P */
    public boolean f190480P = true;

    /* renamed from: Q */
    public boolean f190481Q = true;

    /* renamed from: R */
    public boolean f190482R = true;

    /* renamed from: S */
    public boolean f190483S = true;

    /* renamed from: T */
    public boolean f190484T = true;

    /* renamed from: d */
    public boolean f190485d = true;

    /* renamed from: e */
    public boolean f190486e = true;

    /* renamed from: f */
    public boolean f190487f = true;
    public C64312dc1 field_aggregatedContacts;
    public FinderContact field_authorContact;
    public String field_clientMsgId;
    public long field_commentId;
    public C64829xh0 field_commentMentionedUser;
    public FinderContact field_contact;
    public String field_content;
    public int field_createTime;
    public String field_description;
    public int field_extFlag;
    public C64392gc1 field_extInfo;
    public long field_fansId;
    public String field_finderUserName;
    public int field_flag;
    public long field_followExpireTime;
    public int field_followFlag;
    public long field_followId;
    public String field_headUrl;
    public long field_id;
    public long field_likeId;
    public int field_likeType;
    public int field_mediaType;
    public String field_nickname;
    public C64580ne1 field_notify;
    public long field_objectId;
    public String field_objectNonceId;
    public long field_objectType;
    public String field_refContent;
    public long field_refVideoObjectId;
    public String field_refVideoObjectNonceId;
    public int field_relationType;
    public String field_replayNickname;
    public String field_replayUsername;
    public FinderContact field_replyContact;
    public long field_svrMentionId;
    public String field_thumbUrl;
    public int field_type;
    public int field_userVersion;
    public String field_username;

    /* renamed from: g */
    public boolean f190488g = true;

    /* renamed from: h */
    public boolean f190489h = true;

    /* renamed from: i */
    public boolean f190490i = true;

    /* renamed from: j */
    public boolean f190491j = true;

    /* renamed from: n */
    public boolean f190492n = true;

    /* renamed from: o */
    public boolean f190493o = true;

    /* renamed from: p */
    public boolean f190494p = true;

    /* renamed from: q */
    public boolean f190495q = true;

    /* renamed from: r */
    public boolean f190496r = true;

    /* renamed from: s */
    public boolean f190497s = true;

    /* renamed from: t */
    public boolean f190498t = true;

    /* renamed from: u */
    public boolean f190499u = true;

    /* renamed from: v */
    public boolean f190500v = true;

    /* renamed from: w */
    public boolean f190501w = true;

    /* renamed from: x */
    public boolean f190502x = true;

    /* renamed from: y */
    public boolean f190503y = true;

    /* renamed from: z */
    public boolean f190504z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderDbMention");
        f190426U = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("headUrl", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("createTime", "int", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("id", "long", singleTable.getName(), "");
        new Column("objectId", "long", singleTable.getName(), "");
        new Column("commentId", "long", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("refContent", "string", singleTable.getName(), "");
        new Column("extFlag", "int", singleTable.getName(), "");
        new Column("mediaType", "int", singleTable.getName(), "");
        new Column("description", "string", singleTable.getName(), "");
        new Column("notify", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderNotification");
        new Column("replayUsername", "string", singleTable.getName(), "");
        new Column("replayNickname", "string", singleTable.getName(), "");
        new Column("objectNonceId", "string", singleTable.getName(), "");
        new Column("userVersion", "int", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("contact", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderContact");
        new Column("replyContact", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderContact");
        new Column("aggregatedContacts", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderMentionAggregatedContacts");
        new Column("followExpireTime", "long", singleTable.getName(), "");
        new Column("clientMsgId", "string", singleTable.getName(), "");
        new Column("followId", "long", singleTable.getName(), "");
        new Column("objectType", "long", singleTable.getName(), "");
        new Column("refVideoObjectId", "long", singleTable.getName(), "");
        new Column("refVideoObjectNonceId", "string", singleTable.getName(), "");
        new Column("likeId", "long", singleTable.getName(), "");
        new Column("fansId", "long", singleTable.getName(), "");
        new Column("authorContact", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderContact");
        new Column("likeType", "int", singleTable.getName(), "");
        new Column("commentMentionedUser", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderCommentMentionedUser");
        new Column("relationType", "int", singleTable.getName(), "");
        new Column("extInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderMentionExtInfo");
        new Column("svrMentionId", "long", singleTable.getName(), "");
        new Column("finderUserName", "string", singleTable.getName(), "");
        new Column("followFlag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[39];
        String[] strArr = new String[40];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "headUrl";
        mAutoDBInfo.colsMap.put("headUrl", "TEXT");
        mAutoDBInfo.columns[1] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[2] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[3] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[5] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT");
        mAutoDBInfo.columns[6] = "id";
        mAutoDBInfo.colsMap.put("id", "LONG");
        mAutoDBInfo.columns[7] = "objectId";
        mAutoDBInfo.colsMap.put("objectId", "LONG");
        mAutoDBInfo.columns[8] = "commentId";
        mAutoDBInfo.colsMap.put("commentId", "LONG");
        mAutoDBInfo.columns[9] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[10] = "refContent";
        mAutoDBInfo.colsMap.put("refContent", "TEXT");
        mAutoDBInfo.columns[11] = "extFlag";
        mAutoDBInfo.colsMap.put("extFlag", "INTEGER");
        mAutoDBInfo.columns[12] = "mediaType";
        mAutoDBInfo.colsMap.put("mediaType", "INTEGER");
        mAutoDBInfo.columns[13] = "description";
        mAutoDBInfo.colsMap.put("description", "TEXT");
        mAutoDBInfo.columns[14] = "notify";
        mAutoDBInfo.colsMap.put("notify", "BLOB");
        mAutoDBInfo.columns[15] = "replayUsername";
        mAutoDBInfo.colsMap.put("replayUsername", "TEXT");
        mAutoDBInfo.columns[16] = "replayNickname";
        mAutoDBInfo.colsMap.put("replayNickname", "TEXT");
        mAutoDBInfo.columns[17] = "objectNonceId";
        mAutoDBInfo.colsMap.put("objectNonceId", "TEXT");
        mAutoDBInfo.columns[18] = "userVersion";
        mAutoDBInfo.colsMap.put("userVersion", "INTEGER");
        mAutoDBInfo.columns[19] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[20] = "contact";
        mAutoDBInfo.colsMap.put("contact", "BLOB");
        mAutoDBInfo.columns[21] = "replyContact";
        mAutoDBInfo.colsMap.put("replyContact", "BLOB");
        mAutoDBInfo.columns[22] = "aggregatedContacts";
        mAutoDBInfo.colsMap.put("aggregatedContacts", "BLOB");
        mAutoDBInfo.columns[23] = "followExpireTime";
        mAutoDBInfo.colsMap.put("followExpireTime", "LONG");
        mAutoDBInfo.columns[24] = "clientMsgId";
        mAutoDBInfo.colsMap.put("clientMsgId", "TEXT");
        mAutoDBInfo.columns[25] = "followId";
        mAutoDBInfo.colsMap.put("followId", "LONG");
        mAutoDBInfo.columns[26] = "objectType";
        mAutoDBInfo.colsMap.put("objectType", "LONG");
        mAutoDBInfo.columns[27] = "refVideoObjectId";
        mAutoDBInfo.colsMap.put("refVideoObjectId", "LONG");
        mAutoDBInfo.columns[28] = "refVideoObjectNonceId";
        mAutoDBInfo.colsMap.put("refVideoObjectNonceId", "TEXT");
        mAutoDBInfo.columns[29] = "likeId";
        mAutoDBInfo.colsMap.put("likeId", "LONG");
        mAutoDBInfo.columns[30] = "fansId";
        mAutoDBInfo.colsMap.put("fansId", "LONG");
        mAutoDBInfo.columns[31] = "authorContact";
        mAutoDBInfo.colsMap.put("authorContact", "BLOB");
        mAutoDBInfo.columns[32] = "likeType";
        mAutoDBInfo.colsMap.put("likeType", "INTEGER");
        mAutoDBInfo.columns[33] = "commentMentionedUser";
        mAutoDBInfo.colsMap.put("commentMentionedUser", "BLOB");
        mAutoDBInfo.columns[34] = "relationType";
        mAutoDBInfo.colsMap.put("relationType", "INTEGER");
        mAutoDBInfo.columns[35] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "BLOB");
        mAutoDBInfo.columns[36] = "svrMentionId";
        mAutoDBInfo.colsMap.put("svrMentionId", "LONG");
        mAutoDBInfo.columns[37] = "finderUserName";
        mAutoDBInfo.colsMap.put("finderUserName", "TEXT default '' ");
        mAutoDBInfo.columns[38] = "followFlag";
        mAutoDBInfo.colsMap.put("followFlag", "INTEGER");
        mAutoDBInfo.columns[39] = "rowid";
        mAutoDBInfo.sql = " headUrl TEXT,  nickname TEXT,  type INTEGER,  content TEXT,  createTime INTEGER,  thumbUrl TEXT,  id LONG,  objectId LONG,  commentId LONG,  flag INTEGER,  refContent TEXT,  extFlag INTEGER,  mediaType INTEGER,  description TEXT,  notify BLOB,  replayUsername TEXT,  replayNickname TEXT,  objectNonceId TEXT,  userVersion INTEGER,  username TEXT,  contact BLOB,  replyContact BLOB,  aggregatedContacts BLOB,  followExpireTime LONG,  clientMsgId TEXT,  followId LONG,  objectType LONG,  refVideoObjectId LONG,  refVideoObjectNonceId TEXT,  likeId LONG,  fansId LONG,  authorContact BLOB,  likeType INTEGER,  commentMentionedUser BLOB,  relationType INTEGER,  extInfo BLOB,  svrMentionId LONG,  finderUserName TEXT default '' ,  followFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66258d3)) {
            return false;
        }
        C66258d3 d3Var = (C66258d3) iAutoDBItem;
        return C46238a.m51546a(this.field_headUrl, d3Var.field_headUrl) && C46238a.m51546a(this.field_nickname, d3Var.field_nickname) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(d3Var.field_type)) && C46238a.m51546a(this.field_content, d3Var.field_content) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(d3Var.field_createTime)) && C46238a.m51546a(this.field_thumbUrl, d3Var.field_thumbUrl) && C46238a.m51546a(Long.valueOf(this.field_id), Long.valueOf(d3Var.field_id)) && C46238a.m51546a(Long.valueOf(this.field_objectId), Long.valueOf(d3Var.field_objectId)) && C46238a.m51546a(Long.valueOf(this.field_commentId), Long.valueOf(d3Var.field_commentId)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(d3Var.field_flag)) && C46238a.m51546a(this.field_refContent, d3Var.field_refContent) && C46238a.m51546a(Integer.valueOf(this.field_extFlag), Integer.valueOf(d3Var.field_extFlag)) && C46238a.m51546a(Integer.valueOf(this.field_mediaType), Integer.valueOf(d3Var.field_mediaType)) && C46238a.m51546a(this.field_description, d3Var.field_description) && C46238a.m51546a(this.field_notify, d3Var.field_notify) && C46238a.m51546a(this.field_replayUsername, d3Var.field_replayUsername) && C46238a.m51546a(this.field_replayNickname, d3Var.field_replayNickname) && C46238a.m51546a(this.field_objectNonceId, d3Var.field_objectNonceId) && C46238a.m51546a(Integer.valueOf(this.field_userVersion), Integer.valueOf(d3Var.field_userVersion)) && C46238a.m51546a(this.field_username, d3Var.field_username) && C46238a.m51546a(this.field_contact, d3Var.field_contact) && C46238a.m51546a(this.field_replyContact, d3Var.field_replyContact) && C46238a.m51546a(this.field_aggregatedContacts, d3Var.field_aggregatedContacts) && C46238a.m51546a(Long.valueOf(this.field_followExpireTime), Long.valueOf(d3Var.field_followExpireTime)) && C46238a.m51546a(this.field_clientMsgId, d3Var.field_clientMsgId) && C46238a.m51546a(Long.valueOf(this.field_followId), Long.valueOf(d3Var.field_followId)) && C46238a.m51546a(Long.valueOf(this.field_objectType), Long.valueOf(d3Var.field_objectType)) && C46238a.m51546a(Long.valueOf(this.field_refVideoObjectId), Long.valueOf(d3Var.field_refVideoObjectId)) && C46238a.m51546a(this.field_refVideoObjectNonceId, d3Var.field_refVideoObjectNonceId) && C46238a.m51546a(Long.valueOf(this.field_likeId), Long.valueOf(d3Var.field_likeId)) && C46238a.m51546a(Long.valueOf(this.field_fansId), Long.valueOf(d3Var.field_fansId)) && C46238a.m51546a(this.field_authorContact, d3Var.field_authorContact) && C46238a.m51546a(Integer.valueOf(this.field_likeType), Integer.valueOf(d3Var.field_likeType)) && C46238a.m51546a(this.field_commentMentionedUser, d3Var.field_commentMentionedUser) && C46238a.m51546a(Integer.valueOf(this.field_relationType), Integer.valueOf(d3Var.field_relationType)) && C46238a.m51546a(this.field_extInfo, d3Var.field_extInfo) && C46238a.m51546a(Long.valueOf(this.field_svrMentionId), Long.valueOf(d3Var.field_svrMentionId)) && C46238a.m51546a(this.field_finderUserName, d3Var.field_finderUserName) && C46238a.m51546a(Integer.valueOf(this.field_followFlag), Integer.valueOf(d3Var.field_followFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190430W == hashCode) {
                    try {
                        this.field_headUrl = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190432X == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190434Y == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190436Z == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190453p0 == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190462x0 == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190464y0 == hashCode) {
                    try {
                        this.field_id = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190422Q0 == hashCode) {
                    try {
                        this.field_objectId = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190423R0 == hashCode) {
                    try {
                        this.field_commentId = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190424S0 == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190425T0 == hashCode) {
                    try {
                        this.field_refContent = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190427U0 == hashCode) {
                    try {
                        this.field_extFlag = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190429V0 == hashCode) {
                    try {
                        this.field_mediaType = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190431W0 == hashCode) {
                    try {
                        this.field_description = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190433X0 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_notify = (C64580ne1) new C64580ne1().parseFrom(blob);
                        }
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190435Y0 == hashCode) {
                    try {
                        this.field_replayUsername = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190437Z0 == hashCode) {
                    try {
                        this.field_replayNickname = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190438a1 == hashCode) {
                    try {
                        this.field_objectNonceId = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190439b1 == hashCode) {
                    try {
                        this.field_userVersion = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190440c1 == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190441d1 == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_contact = (FinderContact) new FinderContact().parseFrom(blob2);
                        }
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190442e1 == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_replyContact = (FinderContact) new FinderContact().parseFrom(blob3);
                        }
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190443f1 == hashCode) {
                    try {
                        byte[] blob4 = cursor.getBlob(i);
                        if (blob4 != null && blob4.length > 0) {
                            this.field_aggregatedContacts = (C64312dc1) new C64312dc1().parseFrom(blob4);
                        }
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190444g1 == hashCode) {
                    try {
                        this.field_followExpireTime = cursor.getLong(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190445h1 == hashCode) {
                    try {
                        this.field_clientMsgId = cursor.getString(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190446i1 == hashCode) {
                    try {
                        this.field_followId = cursor.getLong(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190447j1 == hashCode) {
                    try {
                        this.field_objectType = cursor.getLong(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190448k1 == hashCode) {
                    try {
                        this.field_refVideoObjectId = cursor.getLong(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190449l1 == hashCode) {
                    try {
                        this.field_refVideoObjectNonceId = cursor.getString(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190450m1 == hashCode) {
                    try {
                        this.field_likeId = cursor.getLong(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190451n1 == hashCode) {
                    try {
                        this.field_fansId = cursor.getLong(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190452o1 == hashCode) {
                    try {
                        byte[] blob5 = cursor.getBlob(i);
                        if (blob5 != null && blob5.length > 0) {
                            this.field_authorContact = (FinderContact) new FinderContact().parseFrom(blob5);
                        }
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190454p1 == hashCode) {
                    try {
                        this.field_likeType = cursor.getInt(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190455q1 == hashCode) {
                    try {
                        byte[] blob6 = cursor.getBlob(i);
                        if (blob6 != null && blob6.length > 0) {
                            this.field_commentMentionedUser = (C64829xh0) new C64829xh0().parseFrom(blob6);
                        }
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190456r1 == hashCode) {
                    try {
                        this.field_relationType = cursor.getInt(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190457s1 == hashCode) {
                    try {
                        byte[] blob7 = cursor.getBlob(i);
                        if (blob7 != null && blob7.length > 0) {
                            this.field_extInfo = (C64392gc1) new C64392gc1().parseFrom(blob7);
                        }
                    } catch (Throwable th38) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th38, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190458t1 == hashCode) {
                    try {
                        this.field_svrMentionId = cursor.getLong(i);
                    } catch (Throwable th39) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th39, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190459u1 == hashCode) {
                    try {
                        this.field_finderUserName = cursor.getString(i);
                    } catch (Throwable th40) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th40, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190460v1 == hashCode) {
                    try {
                        this.field_followFlag = cursor.getInt(i);
                    } catch (Throwable th41) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDbMention", th41, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190461w1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64392gc1 gc12;
        C64829xh0 xh02;
        FinderContact finderContact;
        C64312dc1 dc12;
        FinderContact finderContact2;
        FinderContact finderContact3;
        C64580ne1 ne12;
        ContentValues contentValues = new ContentValues();
        if (this.f190485d) {
            contentValues.put("headUrl", this.field_headUrl);
        }
        if (this.f190486e) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f190487f) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f190488g) {
            contentValues.put("content", this.field_content);
        }
        if (this.f190489h) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.f190490i) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f190491j) {
            contentValues.put("id", Long.valueOf(this.field_id));
        }
        if (this.f190492n) {
            contentValues.put("objectId", Long.valueOf(this.field_objectId));
        }
        if (this.f190493o) {
            contentValues.put("commentId", Long.valueOf(this.field_commentId));
        }
        if (this.f190494p) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f190495q) {
            contentValues.put("refContent", this.field_refContent);
        }
        if (this.f190496r) {
            contentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
        }
        if (this.f190497s) {
            contentValues.put("mediaType", Integer.valueOf(this.field_mediaType));
        }
        if (this.f190498t) {
            contentValues.put("description", this.field_description);
        }
        if (this.f190499u && (ne12 = this.field_notify) != null) {
            try {
                contentValues.put("notify", ne12.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e.getMessage());
            }
        }
        if (this.f190500v) {
            contentValues.put("replayUsername", this.field_replayUsername);
        }
        if (this.f190501w) {
            contentValues.put("replayNickname", this.field_replayNickname);
        }
        if (this.f190502x) {
            contentValues.put("objectNonceId", this.field_objectNonceId);
        }
        if (this.f190503y) {
            contentValues.put("userVersion", Integer.valueOf(this.field_userVersion));
        }
        if (this.f190504z) {
            contentValues.put("username", this.field_username);
        }
        if (this.f190466A && (finderContact3 = this.field_contact) != null) {
            try {
                contentValues.put("contact", finderContact3.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e2.getMessage());
            }
        }
        if (this.f190467B && (finderContact2 = this.field_replyContact) != null) {
            try {
                contentValues.put("replyContact", finderContact2.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e3.getMessage());
            }
        }
        if (this.f190468C && (dc12 = this.field_aggregatedContacts) != null) {
            try {
                contentValues.put("aggregatedContacts", dc12.toByteArray());
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e4.getMessage());
            }
        }
        if (this.f190469D) {
            contentValues.put("followExpireTime", Long.valueOf(this.field_followExpireTime));
        }
        if (this.f190470E) {
            contentValues.put("clientMsgId", this.field_clientMsgId);
        }
        if (this.f190471F) {
            contentValues.put("followId", Long.valueOf(this.field_followId));
        }
        if (this.f190472G) {
            contentValues.put("objectType", Long.valueOf(this.field_objectType));
        }
        if (this.f190473H) {
            contentValues.put("refVideoObjectId", Long.valueOf(this.field_refVideoObjectId));
        }
        if (this.f190474I) {
            contentValues.put("refVideoObjectNonceId", this.field_refVideoObjectNonceId);
        }
        if (this.f190475J) {
            contentValues.put("likeId", Long.valueOf(this.field_likeId));
        }
        if (this.f190476K) {
            contentValues.put("fansId", Long.valueOf(this.field_fansId));
        }
        if (this.f190477L && (finderContact = this.field_authorContact) != null) {
            try {
                contentValues.put("authorContact", finderContact.toByteArray());
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e5.getMessage());
            }
        }
        if (this.f190478M) {
            contentValues.put("likeType", Integer.valueOf(this.field_likeType));
        }
        if (this.f190479N && (xh02 = this.field_commentMentionedUser) != null) {
            try {
                contentValues.put("commentMentionedUser", xh02.toByteArray());
            } catch (IOException e6) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e6.getMessage());
            }
        }
        if (this.f190480P) {
            contentValues.put("relationType", Integer.valueOf(this.field_relationType));
        }
        if (this.f190481Q && (gc12 = this.field_extInfo) != null) {
            try {
                contentValues.put("extInfo", gc12.toByteArray());
            } catch (IOException e7) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e7.getMessage());
            }
        }
        if (this.f190482R) {
            contentValues.put("svrMentionId", Long.valueOf(this.field_svrMentionId));
        }
        if (this.field_finderUserName == null) {
            this.field_finderUserName = "";
        }
        if (this.f190483S) {
            contentValues.put("finderUserName", this.field_finderUserName);
        }
        if (this.f190484T) {
            contentValues.put("followFlag", Integer.valueOf(this.field_followFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderDbMention ( " + f190463x1.sql + ");");
        for (String add : f190428V) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderDbMention", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderDbMention", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190463x1, "FinderDbMention", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderDbMention", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderDbMention", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderDbMention", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190463x1;
    }

    public String[] getIndexCreateSQL() {
        return f190428V;
    }

    public StorageObserverOwner<C66258d3> getObserverOwner() {
        return f190465y1;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f190426U;
    }

    public String getTableName() {
        return f190426U.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("headUrl")) {
            this.field_headUrl = contentValues.getAsString("headUrl");
            if (z) {
                this.f190485d = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f190486e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f190487f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f190488g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.f190489h = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f190490i = true;
            }
        }
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsLong("id").longValue();
            if (z) {
                this.f190491j = true;
            }
        }
        if (contentValues.containsKey("objectId")) {
            this.field_objectId = contentValues.getAsLong("objectId").longValue();
            if (z) {
                this.f190492n = true;
            }
        }
        if (contentValues.containsKey("commentId")) {
            this.field_commentId = contentValues.getAsLong("commentId").longValue();
            if (z) {
                this.f190493o = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f190494p = true;
            }
        }
        if (contentValues.containsKey("refContent")) {
            this.field_refContent = contentValues.getAsString("refContent");
            if (z) {
                this.f190495q = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z) {
                this.f190496r = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.field_mediaType = contentValues.getAsInteger("mediaType").intValue();
            if (z) {
                this.f190497s = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z) {
                this.f190498t = true;
            }
        }
        if (contentValues.containsKey("notify")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("notify");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_notify = (C64580ne1) new C64580ne1().parseFrom(asByteArray);
                    if (z) {
                        this.f190499u = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e.getMessage());
            }
        }
        if (contentValues.containsKey("replayUsername")) {
            this.field_replayUsername = contentValues.getAsString("replayUsername");
            if (z) {
                this.f190500v = true;
            }
        }
        if (contentValues.containsKey("replayNickname")) {
            this.field_replayNickname = contentValues.getAsString("replayNickname");
            if (z) {
                this.f190501w = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.field_objectNonceId = contentValues.getAsString("objectNonceId");
            if (z) {
                this.f190502x = true;
            }
        }
        if (contentValues.containsKey("userVersion")) {
            this.field_userVersion = contentValues.getAsInteger("userVersion").intValue();
            if (z) {
                this.f190503y = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f190504z = true;
            }
        }
        if (contentValues.containsKey("contact")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("contact");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_contact = (FinderContact) new FinderContact().parseFrom(asByteArray2);
                    if (z) {
                        this.f190466A = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e2.getMessage());
            }
        }
        if (contentValues.containsKey("replyContact")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("replyContact");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_replyContact = (FinderContact) new FinderContact().parseFrom(asByteArray3);
                    if (z) {
                        this.f190467B = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e3.getMessage());
            }
        }
        if (contentValues.containsKey("aggregatedContacts")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("aggregatedContacts");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_aggregatedContacts = (C64312dc1) new C64312dc1().parseFrom(asByteArray4);
                    if (z) {
                        this.f190468C = true;
                    }
                }
            } catch (IOException e4) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e4.getMessage());
            }
        }
        if (contentValues.containsKey("followExpireTime")) {
            this.field_followExpireTime = contentValues.getAsLong("followExpireTime").longValue();
            if (z) {
                this.f190469D = true;
            }
        }
        if (contentValues.containsKey("clientMsgId")) {
            this.field_clientMsgId = contentValues.getAsString("clientMsgId");
            if (z) {
                this.f190470E = true;
            }
        }
        if (contentValues.containsKey("followId")) {
            this.field_followId = contentValues.getAsLong("followId").longValue();
            if (z) {
                this.f190471F = true;
            }
        }
        if (contentValues.containsKey("objectType")) {
            this.field_objectType = contentValues.getAsLong("objectType").longValue();
            if (z) {
                this.f190472G = true;
            }
        }
        if (contentValues.containsKey("refVideoObjectId")) {
            this.field_refVideoObjectId = contentValues.getAsLong("refVideoObjectId").longValue();
            if (z) {
                this.f190473H = true;
            }
        }
        if (contentValues.containsKey("refVideoObjectNonceId")) {
            this.field_refVideoObjectNonceId = contentValues.getAsString("refVideoObjectNonceId");
            if (z) {
                this.f190474I = true;
            }
        }
        if (contentValues.containsKey("likeId")) {
            this.field_likeId = contentValues.getAsLong("likeId").longValue();
            if (z) {
                this.f190475J = true;
            }
        }
        if (contentValues.containsKey("fansId")) {
            this.field_fansId = contentValues.getAsLong("fansId").longValue();
            if (z) {
                this.f190476K = true;
            }
        }
        if (contentValues.containsKey("authorContact")) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray("authorContact");
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.field_authorContact = (FinderContact) new FinderContact().parseFrom(asByteArray5);
                    if (z) {
                        this.f190477L = true;
                    }
                }
            } catch (IOException e5) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e5.getMessage());
            }
        }
        if (contentValues.containsKey("likeType")) {
            this.field_likeType = contentValues.getAsInteger("likeType").intValue();
            if (z) {
                this.f190478M = true;
            }
        }
        if (contentValues.containsKey("commentMentionedUser")) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray("commentMentionedUser");
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.field_commentMentionedUser = (C64829xh0) new C64829xh0().parseFrom(asByteArray6);
                    if (z) {
                        this.f190479N = true;
                    }
                }
            } catch (IOException e6) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e6.getMessage());
            }
        }
        if (contentValues.containsKey("relationType")) {
            this.field_relationType = contentValues.getAsInteger("relationType").intValue();
            if (z) {
                this.f190480P = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            try {
                byte[] asByteArray7 = contentValues.getAsByteArray("extInfo");
                if (asByteArray7 != null && asByteArray7.length > 0) {
                    this.field_extInfo = (C64392gc1) new C64392gc1().parseFrom(asByteArray7);
                    if (z) {
                        this.f190481Q = true;
                    }
                }
            } catch (IOException e7) {
                Log.m105920e("MicroMsg.SDK.BaseFinderDbMention", e7.getMessage());
            }
        }
        if (contentValues.containsKey("svrMentionId")) {
            this.field_svrMentionId = contentValues.getAsLong("svrMentionId").longValue();
            if (z) {
                this.f190482R = true;
            }
        }
        if (contentValues.containsKey("finderUserName")) {
            this.field_finderUserName = contentValues.getAsString("finderUserName");
            if (z) {
                this.f190483S = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.field_followFlag = contentValues.getAsInteger("followFlag").intValue();
            if (z) {
                this.f190484T = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
