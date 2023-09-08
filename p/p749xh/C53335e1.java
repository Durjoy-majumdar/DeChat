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
import i40.C46166d;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C50165kq2;

/* renamed from: xh.e1 */
public class C53335e1 extends IAutoDBItem {

    /* renamed from: M */
    public static final SingleTable f149283M;

    /* renamed from: N */
    public static final Column f149284N;

    /* renamed from: P */
    public static final Column f149285P;

    /* renamed from: Q */
    public static final Column f149286Q;

    /* renamed from: Q0 */
    public static final int f149287Q0 = -172848379;

    /* renamed from: R */
    public static final Column f149288R;

    /* renamed from: R0 */
    public static final int f149289R0 = -1131334062;

    /* renamed from: S */
    public static final Column f149290S;

    /* renamed from: S0 */
    public static final int f149291S0 = -206215295;

    /* renamed from: T */
    public static final Column f149292T;

    /* renamed from: T0 */
    public static final int f149293T0 = 109780401;

    /* renamed from: U */
    public static final Column f149294U;

    /* renamed from: U0 */
    public static final int f149295U0 = -656421047;

    /* renamed from: V */
    public static final String[] f149296V = new String[0];

    /* renamed from: V0 */
    public static final int f149297V0 = 1212341895;

    /* renamed from: W */
    public static final int f149298W = 724095294;

    /* renamed from: W0 */
    public static final int f149299W0 = 84020427;

    /* renamed from: X */
    public static final int f149300X = -1147628818;

    /* renamed from: X0 */
    public static final int f149301X0 = -1936378686;

    /* renamed from: Y */
    public static final int f149302Y = -1340449224;

    /* renamed from: Y0 */
    public static final int f149303Y0 = -1803420379;

    /* renamed from: Z */
    public static final int f149304Z = 1715102285;

    /* renamed from: Z0 */
    public static final int f149305Z0 = -196405736;

    /* renamed from: a1 */
    public static final int f149306a1 = -769424719;

    /* renamed from: b1 */
    public static final int f149307b1 = 1090653365;

    /* renamed from: c1 */
    public static final int f149308c1 = -662634816;

    /* renamed from: d1 */
    public static final int f149309d1 = -684903931;

    /* renamed from: e1 */
    public static final int f149310e1 = 1358063253;

    /* renamed from: f1 */
    public static final int f149311f1 = 236333904;

    /* renamed from: g1 */
    public static final int f149312g1 = 1353249746;

    /* renamed from: h1 */
    public static final int f149313h1 = 1519633684;

    /* renamed from: i1 */
    public static final int f149314i1 = 1757978867;

    /* renamed from: j1 */
    public static final int f149315j1 = 960621416;

    /* renamed from: k1 */
    public static final int f149316k1 = 1190229646;

    /* renamed from: l1 */
    public static final int f149317l1 = -1191570434;

    /* renamed from: m1 */
    public static final int f149318m1 = -887611064;

    /* renamed from: n1 */
    public static final int f149319n1 = 293230747;

    /* renamed from: o1 */
    public static final int f149320o1 = -828349137;

    /* renamed from: p0 */
    public static final int f149321p0 = 724102678;

    /* renamed from: p1 */
    public static final int f149322p1 = 108705909;

    /* renamed from: q1 */
    public static final IAutoDBItem.MAutoDBInfo f149323q1 = initAutoDBInfo(C53335e1.class);

    /* renamed from: r1 */
    public static final C46166d f149324r1 = new C46166d();

    /* renamed from: s1 */
    public static final StorageObserverOwner<C53335e1> f149325s1 = new StorageObserverOwner<>();

    /* renamed from: x0 */
    public static final int f149326x0 = -172778809;

    /* renamed from: y0 */
    public static final int f149327y0 = -1052523848;

    /* renamed from: A */
    public boolean f149328A = true;

    /* renamed from: B */
    public boolean f149329B = true;

    /* renamed from: C */
    public boolean f149330C = true;

    /* renamed from: D */
    public boolean f149331D = true;

    /* renamed from: E */
    public boolean f149332E = true;

    /* renamed from: F */
    public boolean f149333F = true;

    /* renamed from: G */
    public boolean f149334G = true;

    /* renamed from: H */
    public boolean f149335H = true;

    /* renamed from: I */
    public boolean f149336I = true;

    /* renamed from: J */
    public boolean f149337J = true;

    /* renamed from: K */
    public boolean f149338K = true;

    /* renamed from: L */
    public boolean f149339L = true;

    /* renamed from: d */
    public boolean f149340d = true;

    /* renamed from: e */
    public boolean f149341e = true;

    /* renamed from: f */
    public boolean f149342f = true;
    public long field_addtime;
    public String field_associateOpenIMRoomName;
    public long field_chatroomLocalVersion;
    public int field_chatroomNoticeNew;
    public int field_chatroomStatus;
    public int field_chatroomVersion;
    public int field_chatroomdataflag;
    public long field_chatroomfamilystatusmodifytime;
    public String field_chatroomname;
    public String field_chatroomnick;
    public String field_chatroomnotice;
    public String field_chatroomnoticeEditor;
    public long field_chatroomnoticePublishTime;
    public long field_compactFlag;
    public String field_displayname;
    public String field_handleByteVersion;
    public int field_isShowname;
    public C50165kq2 field_localChatRoomWatchMembers;
    public int field_memberCount;
    public String field_memberlist;
    public long field_modifytime;
    public int field_oldChatroomVersion;
    public int field_openIMRoomMigrateStatus;
    public byte[] field_roomInfoDetailResByte;
    public byte[] field_roomdata;
    public int field_roomflag;
    public String field_roomowner;
    public String field_saveByteVersion;
    public String field_selfDisplayName;
    public int field_spamStatus;
    public int field_style;
    public String field_xmlChatroomnotice;

    /* renamed from: g */
    public boolean f149343g = true;

    /* renamed from: h */
    public boolean f149344h = true;

    /* renamed from: i */
    public boolean f149345i = true;

    /* renamed from: j */
    public boolean f149346j = true;

    /* renamed from: n */
    public boolean f149347n = true;

    /* renamed from: o */
    public boolean f149348o = true;

    /* renamed from: p */
    public boolean f149349p = true;

    /* renamed from: q */
    public boolean f149350q = true;

    /* renamed from: r */
    public boolean f149351r = true;

    /* renamed from: s */
    public boolean f149352s = true;

    /* renamed from: t */
    public boolean f149353t = true;

    /* renamed from: u */
    public boolean f149354u = true;

    /* renamed from: v */
    public boolean f149355v = true;

    /* renamed from: w */
    public boolean f149356w = true;

    /* renamed from: x */
    public boolean f149357x = true;

    /* renamed from: y */
    public boolean f149358y = true;

    /* renamed from: z */
    public boolean f149359z = true;

    static {
        SingleTable singleTable = new SingleTable("chatroom");
        f149283M = singleTable;
        f149284N = new Column("rowid", "long", singleTable.getName(), "");
        f149285P = new Column("chatroomname", "string", singleTable.getName(), "");
        new Column("addtime", "long", singleTable.getName(), "");
        f149286Q = new Column("memberlist", "string", singleTable.getName(), "");
        new Column("displayname", "string", singleTable.getName(), "");
        new Column("chatroomnick", "string", singleTable.getName(), "");
        new Column("roomflag", "int", singleTable.getName(), "");
        f149288R = new Column("roomowner", "string", singleTable.getName(), "");
        new Column("roomdata", "byte[]", singleTable.getName(), "");
        new Column("isShowname", "int", singleTable.getName(), "");
        new Column("selfDisplayName", "string", singleTable.getName(), "");
        new Column("style", "int", singleTable.getName(), "");
        new Column("chatroomdataflag", "int", singleTable.getName(), "");
        new Column("modifytime", "long", singleTable.getName(), "");
        new Column("chatroomnotice", "string", singleTable.getName(), "");
        new Column("xmlChatroomnotice", "string", singleTable.getName(), "");
        new Column("chatroomVersion", "int", singleTable.getName(), "");
        new Column("chatroomnoticeEditor", "string", singleTable.getName(), "");
        new Column("chatroomnoticePublishTime", "long", singleTable.getName(), "");
        new Column("chatroomNoticeNew", "int", singleTable.getName(), "");
        new Column("chatroomLocalVersion", "long", singleTable.getName(), "");
        f149290S = new Column("chatroomStatus", "int", singleTable.getName(), "");
        f149292T = new Column("memberCount", "int", singleTable.getName(), "");
        new Column("chatroomfamilystatusmodifytime", "long", singleTable.getName(), "");
        new Column("associateOpenIMRoomName", "string", singleTable.getName(), "");
        new Column("openIMRoomMigrateStatus", "int", singleTable.getName(), "");
        new Column("saveByteVersion", "string", singleTable.getName(), "");
        new Column("handleByteVersion", "string", singleTable.getName(), "");
        new Column("roomInfoDetailResByte", "byte[]", singleTable.getName(), "");
        new Column("oldChatroomVersion", "int", singleTable.getName(), "");
        new Column("localChatRoomWatchMembers", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LocalChatRoomWatchMembers");
        f149294U = new Column("spamStatus", "int", singleTable.getName(), "");
        new Column("compactFlag", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[32];
        String[] strArr = new String[33];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chatroomname";
        mAutoDBInfo.colsMap.put("chatroomname", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "chatroomname";
        mAutoDBInfo.columns[1] = "addtime";
        mAutoDBInfo.colsMap.put("addtime", "LONG");
        mAutoDBInfo.columns[2] = "memberlist";
        mAutoDBInfo.colsMap.put("memberlist", "TEXT");
        mAutoDBInfo.columns[3] = "displayname";
        mAutoDBInfo.colsMap.put("displayname", "TEXT");
        mAutoDBInfo.columns[4] = "chatroomnick";
        mAutoDBInfo.colsMap.put("chatroomnick", "TEXT");
        mAutoDBInfo.columns[5] = "roomflag";
        mAutoDBInfo.colsMap.put("roomflag", "INTEGER");
        mAutoDBInfo.columns[6] = "roomowner";
        mAutoDBInfo.colsMap.put("roomowner", "TEXT");
        mAutoDBInfo.columns[7] = "roomdata";
        mAutoDBInfo.colsMap.put("roomdata", "BLOB");
        mAutoDBInfo.columns[8] = "isShowname";
        mAutoDBInfo.colsMap.put("isShowname", "INTEGER");
        mAutoDBInfo.columns[9] = "selfDisplayName";
        mAutoDBInfo.colsMap.put("selfDisplayName", "TEXT");
        mAutoDBInfo.columns[10] = "style";
        mAutoDBInfo.colsMap.put("style", "INTEGER");
        mAutoDBInfo.columns[11] = "chatroomdataflag";
        mAutoDBInfo.colsMap.put("chatroomdataflag", "INTEGER");
        mAutoDBInfo.columns[12] = "modifytime";
        mAutoDBInfo.colsMap.put("modifytime", "LONG");
        mAutoDBInfo.columns[13] = "chatroomnotice";
        mAutoDBInfo.colsMap.put("chatroomnotice", "TEXT");
        mAutoDBInfo.columns[14] = "xmlChatroomnotice";
        mAutoDBInfo.colsMap.put("xmlChatroomnotice", "TEXT");
        mAutoDBInfo.columns[15] = "chatroomVersion";
        mAutoDBInfo.colsMap.put("chatroomVersion", "INTEGER");
        mAutoDBInfo.columns[16] = "chatroomnoticeEditor";
        mAutoDBInfo.colsMap.put("chatroomnoticeEditor", "TEXT");
        mAutoDBInfo.columns[17] = "chatroomnoticePublishTime";
        mAutoDBInfo.colsMap.put("chatroomnoticePublishTime", "LONG");
        mAutoDBInfo.columns[18] = "chatroomNoticeNew";
        mAutoDBInfo.colsMap.put("chatroomNoticeNew", "INTEGER");
        mAutoDBInfo.columns[19] = "chatroomLocalVersion";
        mAutoDBInfo.colsMap.put("chatroomLocalVersion", "LONG");
        mAutoDBInfo.columns[20] = "chatroomStatus";
        mAutoDBInfo.colsMap.put("chatroomStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[21] = "memberCount";
        mAutoDBInfo.colsMap.put("memberCount", "INTEGER default '-1' ");
        mAutoDBInfo.columns[22] = "chatroomfamilystatusmodifytime";
        mAutoDBInfo.colsMap.put("chatroomfamilystatusmodifytime", "LONG default '0' ");
        mAutoDBInfo.columns[23] = "associateOpenIMRoomName";
        mAutoDBInfo.colsMap.put("associateOpenIMRoomName", "TEXT");
        mAutoDBInfo.columns[24] = "openIMRoomMigrateStatus";
        mAutoDBInfo.colsMap.put("openIMRoomMigrateStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[25] = "saveByteVersion";
        mAutoDBInfo.colsMap.put("saveByteVersion", "TEXT");
        mAutoDBInfo.columns[26] = "handleByteVersion";
        mAutoDBInfo.colsMap.put("handleByteVersion", "TEXT");
        mAutoDBInfo.columns[27] = "roomInfoDetailResByte";
        mAutoDBInfo.colsMap.put("roomInfoDetailResByte", "BLOB");
        mAutoDBInfo.columns[28] = "oldChatroomVersion";
        mAutoDBInfo.colsMap.put("oldChatroomVersion", "INTEGER");
        mAutoDBInfo.columns[29] = "localChatRoomWatchMembers";
        mAutoDBInfo.colsMap.put("localChatRoomWatchMembers", "BLOB");
        mAutoDBInfo.columns[30] = "spamStatus";
        mAutoDBInfo.colsMap.put("spamStatus", "INTEGER default '0' ");
        mAutoDBInfo.columns[31] = "compactFlag";
        mAutoDBInfo.colsMap.put("compactFlag", "LONG default '0' ");
        mAutoDBInfo.columns[32] = "rowid";
        mAutoDBInfo.sql = " chatroomname TEXT default ''  PRIMARY KEY ,  addtime LONG,  memberlist TEXT,  displayname TEXT,  chatroomnick TEXT,  roomflag INTEGER,  roomowner TEXT,  roomdata BLOB,  isShowname INTEGER,  selfDisplayName TEXT,  style INTEGER,  chatroomdataflag INTEGER,  modifytime LONG,  chatroomnotice TEXT,  xmlChatroomnotice TEXT,  chatroomVersion INTEGER,  chatroomnoticeEditor TEXT,  chatroomnoticePublishTime LONG,  chatroomNoticeNew INTEGER,  chatroomLocalVersion LONG,  chatroomStatus INTEGER default '0' ,  memberCount INTEGER default '-1' ,  chatroomfamilystatusmodifytime LONG default '0' ,  associateOpenIMRoomName TEXT,  openIMRoomMigrateStatus INTEGER default '0' ,  saveByteVersion TEXT,  handleByteVersion TEXT,  roomInfoDetailResByte BLOB,  oldChatroomVersion INTEGER,  localChatRoomWatchMembers BLOB,  spamStatus INTEGER default '0' ,  compactFlag LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53335e1)) {
            return false;
        }
        C53335e1 e1Var = (C53335e1) iAutoDBItem;
        return C46238a.m51546a(this.field_chatroomname, e1Var.field_chatroomname) && C46238a.m51546a(Long.valueOf(this.field_addtime), Long.valueOf(e1Var.field_addtime)) && C46238a.m51546a(this.field_memberlist, e1Var.field_memberlist) && C46238a.m51546a(this.field_displayname, e1Var.field_displayname) && C46238a.m51546a(this.field_chatroomnick, e1Var.field_chatroomnick) && C46238a.m51546a(Integer.valueOf(this.field_roomflag), Integer.valueOf(e1Var.field_roomflag)) && C46238a.m51546a(this.field_roomowner, e1Var.field_roomowner) && C46238a.m51546a(this.field_roomdata, e1Var.field_roomdata) && C46238a.m51546a(Integer.valueOf(this.field_isShowname), Integer.valueOf(e1Var.field_isShowname)) && C46238a.m51546a(this.field_selfDisplayName, e1Var.field_selfDisplayName) && C46238a.m51546a(Integer.valueOf(this.field_style), Integer.valueOf(e1Var.field_style)) && C46238a.m51546a(Integer.valueOf(this.field_chatroomdataflag), Integer.valueOf(e1Var.field_chatroomdataflag)) && C46238a.m51546a(Long.valueOf(this.field_modifytime), Long.valueOf(e1Var.field_modifytime)) && C46238a.m51546a(this.field_chatroomnotice, e1Var.field_chatroomnotice) && C46238a.m51546a(this.field_xmlChatroomnotice, e1Var.field_xmlChatroomnotice) && C46238a.m51546a(Integer.valueOf(this.field_chatroomVersion), Integer.valueOf(e1Var.field_chatroomVersion)) && C46238a.m51546a(this.field_chatroomnoticeEditor, e1Var.field_chatroomnoticeEditor) && C46238a.m51546a(Long.valueOf(this.field_chatroomnoticePublishTime), Long.valueOf(e1Var.field_chatroomnoticePublishTime)) && C46238a.m51546a(Integer.valueOf(this.field_chatroomNoticeNew), Integer.valueOf(e1Var.field_chatroomNoticeNew)) && C46238a.m51546a(Long.valueOf(this.field_chatroomLocalVersion), Long.valueOf(e1Var.field_chatroomLocalVersion)) && C46238a.m51546a(Integer.valueOf(this.field_chatroomStatus), Integer.valueOf(e1Var.field_chatroomStatus)) && C46238a.m51546a(Integer.valueOf(this.field_memberCount), Integer.valueOf(e1Var.field_memberCount)) && C46238a.m51546a(Long.valueOf(this.field_chatroomfamilystatusmodifytime), Long.valueOf(e1Var.field_chatroomfamilystatusmodifytime)) && C46238a.m51546a(this.field_associateOpenIMRoomName, e1Var.field_associateOpenIMRoomName) && C46238a.m51546a(Integer.valueOf(this.field_openIMRoomMigrateStatus), Integer.valueOf(e1Var.field_openIMRoomMigrateStatus)) && C46238a.m51546a(this.field_saveByteVersion, e1Var.field_saveByteVersion) && C46238a.m51546a(this.field_handleByteVersion, e1Var.field_handleByteVersion) && C46238a.m51546a(this.field_roomInfoDetailResByte, e1Var.field_roomInfoDetailResByte) && C46238a.m51546a(Integer.valueOf(this.field_oldChatroomVersion), Integer.valueOf(e1Var.field_oldChatroomVersion)) && C46238a.m51546a(this.field_localChatRoomWatchMembers, e1Var.field_localChatRoomWatchMembers) && C46238a.m51546a(Integer.valueOf(this.field_spamStatus), Integer.valueOf(e1Var.field_spamStatus)) && C46238a.m51546a(Long.valueOf(this.field_compactFlag), Long.valueOf(e1Var.field_compactFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f149298W == hashCode) {
                    try {
                        this.field_chatroomname = cursor.getString(i);
                        this.f149340d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149300X == hashCode) {
                    try {
                        this.field_addtime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149302Y == hashCode) {
                    try {
                        this.field_memberlist = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149304Z == hashCode) {
                    try {
                        this.field_displayname = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149321p0 == hashCode) {
                    try {
                        this.field_chatroomnick = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149326x0 == hashCode) {
                    try {
                        this.field_roomflag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149327y0 == hashCode) {
                    try {
                        this.field_roomowner = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149287Q0 == hashCode) {
                    try {
                        this.field_roomdata = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149289R0 == hashCode) {
                    try {
                        this.field_isShowname = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149291S0 == hashCode) {
                    try {
                        this.field_selfDisplayName = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149293T0 == hashCode) {
                    try {
                        this.field_style = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149295U0 == hashCode) {
                    try {
                        this.field_chatroomdataflag = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149297V0 == hashCode) {
                    try {
                        this.field_modifytime = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149299W0 == hashCode) {
                    try {
                        this.field_chatroomnotice = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149301X0 == hashCode) {
                    try {
                        this.field_xmlChatroomnotice = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149303Y0 == hashCode) {
                    try {
                        this.field_chatroomVersion = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149305Z0 == hashCode) {
                    try {
                        this.field_chatroomnoticeEditor = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149306a1 == hashCode) {
                    try {
                        this.field_chatroomnoticePublishTime = cursor.getLong(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149307b1 == hashCode) {
                    try {
                        this.field_chatroomNoticeNew = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149308c1 == hashCode) {
                    try {
                        this.field_chatroomLocalVersion = cursor.getLong(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149309d1 == hashCode) {
                    try {
                        this.field_chatroomStatus = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149310e1 == hashCode) {
                    try {
                        this.field_memberCount = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149311f1 == hashCode) {
                    try {
                        this.field_chatroomfamilystatusmodifytime = cursor.getLong(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149312g1 == hashCode) {
                    try {
                        this.field_associateOpenIMRoomName = cursor.getString(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149313h1 == hashCode) {
                    try {
                        this.field_openIMRoomMigrateStatus = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149314i1 == hashCode) {
                    try {
                        this.field_saveByteVersion = cursor.getString(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149315j1 == hashCode) {
                    try {
                        this.field_handleByteVersion = cursor.getString(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149316k1 == hashCode) {
                    try {
                        this.field_roomInfoDetailResByte = cursor.getBlob(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149317l1 == hashCode) {
                    try {
                        this.field_oldChatroomVersion = cursor.getInt(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149318m1 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_localChatRoomWatchMembers = (C50165kq2) new C50165kq2().parseFrom(blob);
                        }
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149319n1 == hashCode) {
                    try {
                        this.field_spamStatus = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149320o1 == hashCode) {
                    try {
                        this.field_compactFlag = cursor.getLong(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatRoomMember", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f149322p1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C50165kq2 kq22;
        ContentValues contentValues = new ContentValues();
        if (this.field_chatroomname == null) {
            this.field_chatroomname = "";
        }
        if (this.f149340d) {
            contentValues.put("chatroomname", this.field_chatroomname);
        }
        if (this.f149341e) {
            contentValues.put("addtime", Long.valueOf(this.field_addtime));
        }
        if (this.f149342f) {
            contentValues.put("memberlist", this.field_memberlist);
        }
        if (this.f149343g) {
            contentValues.put("displayname", this.field_displayname);
        }
        if (this.f149344h) {
            contentValues.put("chatroomnick", this.field_chatroomnick);
        }
        if (this.f149345i) {
            contentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
        }
        if (this.f149346j) {
            contentValues.put("roomowner", this.field_roomowner);
        }
        if (this.f149347n) {
            contentValues.put("roomdata", this.field_roomdata);
        }
        if (this.f149348o) {
            contentValues.put("isShowname", Integer.valueOf(this.field_isShowname));
        }
        if (this.f149349p) {
            contentValues.put("selfDisplayName", this.field_selfDisplayName);
        }
        if (this.f149350q) {
            contentValues.put("style", Integer.valueOf(this.field_style));
        }
        if (this.f149351r) {
            contentValues.put("chatroomdataflag", Integer.valueOf(this.field_chatroomdataflag));
        }
        if (this.f149352s) {
            contentValues.put("modifytime", Long.valueOf(this.field_modifytime));
        }
        if (this.f149353t) {
            contentValues.put("chatroomnotice", this.field_chatroomnotice);
        }
        if (this.f149354u) {
            contentValues.put("xmlChatroomnotice", this.field_xmlChatroomnotice);
        }
        if (this.f149355v) {
            contentValues.put("chatroomVersion", Integer.valueOf(this.field_chatroomVersion));
        }
        if (this.f149356w) {
            contentValues.put("chatroomnoticeEditor", this.field_chatroomnoticeEditor);
        }
        if (this.f149357x) {
            contentValues.put("chatroomnoticePublishTime", Long.valueOf(this.field_chatroomnoticePublishTime));
        }
        if (this.f149358y) {
            contentValues.put("chatroomNoticeNew", Integer.valueOf(this.field_chatroomNoticeNew));
        }
        if (this.f149359z) {
            contentValues.put("chatroomLocalVersion", Long.valueOf(this.field_chatroomLocalVersion));
        }
        if (this.f149328A) {
            contentValues.put("chatroomStatus", Integer.valueOf(this.field_chatroomStatus));
        }
        if (this.f149329B) {
            contentValues.put("memberCount", Integer.valueOf(this.field_memberCount));
        }
        if (this.f149330C) {
            contentValues.put("chatroomfamilystatusmodifytime", Long.valueOf(this.field_chatroomfamilystatusmodifytime));
        }
        if (this.f149331D) {
            contentValues.put("associateOpenIMRoomName", this.field_associateOpenIMRoomName);
        }
        if (this.f149332E) {
            contentValues.put("openIMRoomMigrateStatus", Integer.valueOf(this.field_openIMRoomMigrateStatus));
        }
        if (this.f149333F) {
            contentValues.put("saveByteVersion", this.field_saveByteVersion);
        }
        if (this.f149334G) {
            contentValues.put("handleByteVersion", this.field_handleByteVersion);
        }
        if (this.f149335H) {
            contentValues.put("roomInfoDetailResByte", this.field_roomInfoDetailResByte);
        }
        if (this.f149336I) {
            contentValues.put("oldChatroomVersion", Integer.valueOf(this.field_oldChatroomVersion));
        }
        if (this.f149337J && (kq22 = this.field_localChatRoomWatchMembers) != null) {
            try {
                contentValues.put("localChatRoomWatchMembers", kq22.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseChatRoomMember", e.getMessage());
            }
        }
        if (this.f149338K) {
            contentValues.put("spamStatus", Integer.valueOf(this.field_spamStatus));
        }
        if (this.f149339L) {
            contentValues.put("compactFlag", Long.valueOf(this.field_compactFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseChatRoomMember", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS chatroom ( " + f149323q1.sql + ");");
        for (String add : f149296V) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseChatRoomMember", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("chatroom", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f149323q1, "chatroom", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseChatRoomMember", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("chatroom", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseChatRoomMember", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f149323q1;
    }

    public String[] getIndexCreateSQL() {
        return f149296V;
    }

    public StorageObserverOwner<C53335e1> getObserverOwner() {
        return f149325s1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_chatroomname;
    }

    public SingleTable getTable() {
        return f149283M;
    }

    public String getTableName() {
        return f149283M.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chatroomname")) {
            this.field_chatroomname = contentValues.getAsString("chatroomname");
            if (z) {
                this.f149340d = true;
            }
        }
        if (contentValues.containsKey("addtime")) {
            this.field_addtime = contentValues.getAsLong("addtime").longValue();
            if (z) {
                this.f149341e = true;
            }
        }
        if (contentValues.containsKey("memberlist")) {
            this.field_memberlist = contentValues.getAsString("memberlist");
            if (z) {
                this.f149342f = true;
            }
        }
        if (contentValues.containsKey("displayname")) {
            this.field_displayname = contentValues.getAsString("displayname");
            if (z) {
                this.f149343g = true;
            }
        }
        if (contentValues.containsKey("chatroomnick")) {
            this.field_chatroomnick = contentValues.getAsString("chatroomnick");
            if (z) {
                this.f149344h = true;
            }
        }
        if (contentValues.containsKey("roomflag")) {
            this.field_roomflag = contentValues.getAsInteger("roomflag").intValue();
            if (z) {
                this.f149345i = true;
            }
        }
        if (contentValues.containsKey("roomowner")) {
            this.field_roomowner = contentValues.getAsString("roomowner");
            if (z) {
                this.f149346j = true;
            }
        }
        if (contentValues.containsKey("roomdata")) {
            this.field_roomdata = contentValues.getAsByteArray("roomdata");
            if (z) {
                this.f149347n = true;
            }
        }
        if (contentValues.containsKey("isShowname")) {
            this.field_isShowname = contentValues.getAsInteger("isShowname").intValue();
            if (z) {
                this.f149348o = true;
            }
        }
        if (contentValues.containsKey("selfDisplayName")) {
            this.field_selfDisplayName = contentValues.getAsString("selfDisplayName");
            if (z) {
                this.f149349p = true;
            }
        }
        if (contentValues.containsKey("style")) {
            this.field_style = contentValues.getAsInteger("style").intValue();
            if (z) {
                this.f149350q = true;
            }
        }
        if (contentValues.containsKey("chatroomdataflag")) {
            this.field_chatroomdataflag = contentValues.getAsInteger("chatroomdataflag").intValue();
            if (z) {
                this.f149351r = true;
            }
        }
        if (contentValues.containsKey("modifytime")) {
            this.field_modifytime = contentValues.getAsLong("modifytime").longValue();
            if (z) {
                this.f149352s = true;
            }
        }
        if (contentValues.containsKey("chatroomnotice")) {
            this.field_chatroomnotice = contentValues.getAsString("chatroomnotice");
            if (z) {
                this.f149353t = true;
            }
        }
        if (contentValues.containsKey("xmlChatroomnotice")) {
            this.field_xmlChatroomnotice = contentValues.getAsString("xmlChatroomnotice");
            if (z) {
                this.f149354u = true;
            }
        }
        if (contentValues.containsKey("chatroomVersion")) {
            this.field_chatroomVersion = contentValues.getAsInteger("chatroomVersion").intValue();
            if (z) {
                this.f149355v = true;
            }
        }
        if (contentValues.containsKey("chatroomnoticeEditor")) {
            this.field_chatroomnoticeEditor = contentValues.getAsString("chatroomnoticeEditor");
            if (z) {
                this.f149356w = true;
            }
        }
        if (contentValues.containsKey("chatroomnoticePublishTime")) {
            this.field_chatroomnoticePublishTime = contentValues.getAsLong("chatroomnoticePublishTime").longValue();
            if (z) {
                this.f149357x = true;
            }
        }
        if (contentValues.containsKey("chatroomNoticeNew")) {
            this.field_chatroomNoticeNew = contentValues.getAsInteger("chatroomNoticeNew").intValue();
            if (z) {
                this.f149358y = true;
            }
        }
        if (contentValues.containsKey("chatroomLocalVersion")) {
            this.field_chatroomLocalVersion = contentValues.getAsLong("chatroomLocalVersion").longValue();
            if (z) {
                this.f149359z = true;
            }
        }
        if (contentValues.containsKey("chatroomStatus")) {
            this.field_chatroomStatus = contentValues.getAsInteger("chatroomStatus").intValue();
            if (z) {
                this.f149328A = true;
            }
        }
        if (contentValues.containsKey("memberCount")) {
            this.field_memberCount = contentValues.getAsInteger("memberCount").intValue();
            if (z) {
                this.f149329B = true;
            }
        }
        if (contentValues.containsKey("chatroomfamilystatusmodifytime")) {
            this.field_chatroomfamilystatusmodifytime = contentValues.getAsLong("chatroomfamilystatusmodifytime").longValue();
            if (z) {
                this.f149330C = true;
            }
        }
        if (contentValues.containsKey("associateOpenIMRoomName")) {
            this.field_associateOpenIMRoomName = contentValues.getAsString("associateOpenIMRoomName");
            if (z) {
                this.f149331D = true;
            }
        }
        if (contentValues.containsKey("openIMRoomMigrateStatus")) {
            this.field_openIMRoomMigrateStatus = contentValues.getAsInteger("openIMRoomMigrateStatus").intValue();
            if (z) {
                this.f149332E = true;
            }
        }
        if (contentValues.containsKey("saveByteVersion")) {
            this.field_saveByteVersion = contentValues.getAsString("saveByteVersion");
            if (z) {
                this.f149333F = true;
            }
        }
        if (contentValues.containsKey("handleByteVersion")) {
            this.field_handleByteVersion = contentValues.getAsString("handleByteVersion");
            if (z) {
                this.f149334G = true;
            }
        }
        if (contentValues.containsKey("roomInfoDetailResByte")) {
            this.field_roomInfoDetailResByte = contentValues.getAsByteArray("roomInfoDetailResByte");
            if (z) {
                this.f149335H = true;
            }
        }
        if (contentValues.containsKey("oldChatroomVersion")) {
            this.field_oldChatroomVersion = contentValues.getAsInteger("oldChatroomVersion").intValue();
            if (z) {
                this.f149336I = true;
            }
        }
        if (contentValues.containsKey("localChatRoomWatchMembers")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("localChatRoomWatchMembers");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_localChatRoomWatchMembers = (C50165kq2) new C50165kq2().parseFrom(asByteArray);
                    if (z) {
                        this.f149337J = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseChatRoomMember", e.getMessage());
            }
        }
        if (contentValues.containsKey("spamStatus")) {
            this.field_spamStatus = contentValues.getAsInteger("spamStatus").intValue();
            if (z) {
                this.f149338K = true;
            }
        }
        if (contentValues.containsKey("compactFlag")) {
            this.field_compactFlag = contentValues.getAsLong("compactFlag").longValue();
            if (z) {
                this.f149339L = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
